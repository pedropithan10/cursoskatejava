package com.br.controller;

public class Editperfil {
    private String nomeperfil;
    private String bio;
    private String base;

    public Editperfil(String nomeperfil, String bio, String base) {
        this.nomeperfil = nomeperfil;
        this.bio = bio;
        this.base = base;
    }

    public String getNomeperfil() {
        return nomeperfil;}

    public void setNomeperfil(String nomeperfil) {
        this.nomeperfil = nomeperfil;}

    public String getBio() {
        return bio;}

    public void setBio(String bio) {
        this.bio = bio;}

    public String getBase() {
        return base;}

    public void setBase(String base) {
        this.base = base;}
}
