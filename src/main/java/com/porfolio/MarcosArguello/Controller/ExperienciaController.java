package com.porfolio.MarcosArguello.Controller;

import com.porfolio.MarcosArguello.Dto.dtoExperiencia;
import com.porfolio.MarcosArguello.Entity.Experiencia;
import com.porfolio.MarcosArguello.Security.Controller.Mensaje;
import com.porfolio.MarcosArguello.Service.ExperienciaService;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("explab")
@CrossOrigin(origins = {"https://localhost:4200"})
public class ExperienciaController {

    @Autowired
    ExperienciaService experienciaService;

    @GetMapping("/lista")
    public ResponseEntity<List<Experiencia>> list() {
        List<Experiencia> list = experienciaService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Experiencia> getById(@PathVariable("id") int id) {
        if (!experienciaService.existByid(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        Experiencia experiencia = experienciaService.getOne(id).get();
        return new ResponseEntity(experiencia, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoExperiencia dtoexp) {
        if (StringUtils.isBlank(dtoexp.getNombreExperiencia())) {
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if (experienciaService.existsByNombreExperiencia(dtoexp.getNombreExperiencia())) {
            return new ResponseEntity(new Mensaje("esa experiencia ya existe"), HttpStatus.BAD_REQUEST);
        }

        Experiencia experiencia = new Experiencia(dtoexp.getNombreExperiencia(), dtoexp.getDescripcionExperiencia());
        experienciaService.save(experiencia);
        return new ResponseEntity(new Mensaje("experiencia agregada"), HttpStatus.OK);

    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!experienciaService.existByid(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        experienciaService.delete(id);
        return new ResponseEntity(new Mensaje("producto eliminado"), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoExperiencia dtoexp) {
        //validacion si existe  ese id
        if (!experienciaService.existByid(id)) {
            return new ResponseEntity(new Mensaje("este id no existe"), HttpStatus.BAD_REQUEST);
        }

        if (experienciaService.existsByNombreExperiencia(dtoexp.getNombreExperiencia()) && experienciaService
                .getByNombreExperiencia(dtoexp.getNombreExperiencia()).get().getId() != id) {
            return new ResponseEntity(new Mensaje("esa experiencia ya existe"), HttpStatus.BAD_REQUEST);
        }

        if (StringUtils.isAllBlank(dtoexp.getNombreExperiencia())) {
            return new ResponseEntity(new Mensaje("nombre obligatorio"), HttpStatus.BAD_REQUEST);
        }

        Experiencia experiencia = experienciaService.getOne(id).get();
        experiencia.setNombreExperiencia(dtoexp.getNombreExperiencia());
        experiencia.setDescripcionExperiencia(dtoexp.getDescripcionExperiencia());

        experienciaService.save(experiencia);
        return new ResponseEntity(new Mensaje("experiencia actualizada"), HttpStatus.OK);
    }

}
