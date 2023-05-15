package com.porfolio.MarcosArguello.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @Size(min = 1, max = 50, message = "por favor introduzca su nombre")
    private String nombre;

    @NotNull
    @Size(min = 1, max = 50, message = "por favor introduzca su apellido")
    private String apellido;

    @NotNull
    @Size(min = 1, max = 50, message = "por favor introduzca su nacionalidad")
    private String nacionalidad;

    @NotNull
    @Size(min = 1, max = 50, message = "por favor introduzca su fecha de nacimiento")
    private String fecha_nacimiento;

    @Size(min = 1, max = 50, message = "por favor introduzca su dni")
    private String dni;

    @Size(min = 1, max = 50, message = "por favor introduzca su telefono")
    private String telefono;

    @NotNull
    @Size(min = 1, max = 50, message = "por favor introduzca su correo electrónico")
    private String mail;

    @Size(min = 1, max = 300, message = "por favor introduzca una breve descripción no mas de 300 palabras")
    private String descripcion;

    private String imgBanner;

    private String imgPerfil;

    private String github;
    private String facebook;
    private String instagram;
    private String whatsapp;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String nacionalidad, String fecha_nacimiento, String dni, String telefono, String mail, String descripcion, String imgBanner, String imgPerfil, String github, String facebook, String instagram, String whatsapp) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.fecha_nacimiento = fecha_nacimiento;
        this.dni = dni;
        this.telefono = telefono;
        this.mail = mail;
        this.descripcion = descripcion;
        this.imgBanner = imgBanner;
        this.imgPerfil = imgPerfil;
        this.github = github;
        this.facebook = facebook;
        this.instagram = instagram;
        this.whatsapp = whatsapp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImgBanner() {
        return imgBanner;
    }

    public void setImgBanner(String imgBanner) {
        this.imgBanner = imgBanner;
    }

    public String getImgPerfil() {
        return imgPerfil;
    }

    public void setImgPerfil(String imgPerfil) {
        this.imgPerfil = imgPerfil;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

}
