package com.porfolio.MarcosArguello.Dto;

import javax.validation.constraints.NotBlank;

public class dtoPersona {

    @NotBlank
    private String nombre;
    @NotBlank
    private String apellido;
    @NotBlank
    private String nacionalidad;
    @NotBlank
    private String fecha_nacimiento;
    @NotBlank
    private String dni;
    @NotBlank
    private String telefono;
    @NotBlank
    private String mail;
    @NotBlank
    private String imgPerfil;
    @NotBlank
    private String descripcion;
    @NotBlank
    private String imgBanner;
    @NotBlank
    private String github;
    @NotBlank
    private String instagram;
    @NotBlank
    private String facebook;
    @NotBlank
    private String whatsapp;

    public dtoPersona() {
    }

    public dtoPersona(String nombre, String apellido, String nacionalidad, String fecha_nacimiento, String dni, String telefono, String mail, String imgPerfil, String descripcion, String imgBanner, String github, String instagram, String facebook, String whatsapp) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.fecha_nacimiento = fecha_nacimiento;
        this.dni = dni;
        this.telefono = telefono;
        this.mail = mail;
        this.imgPerfil = imgPerfil;
        this.descripcion = descripcion;
        this.imgBanner = imgBanner;
        this.github = github;
        this.instagram = instagram;
        this.facebook = facebook;
        this.whatsapp = whatsapp;
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

    public String getImgPerfil() {
        return imgPerfil;
    }

    public void setImgPerfil(String imgPerfil) {
        this.imgPerfil = imgPerfil;
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

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

}
