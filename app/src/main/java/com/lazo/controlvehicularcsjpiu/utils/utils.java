package com.lazo.controlvehicularcsjpiu.utils;

public class utils {
    //CONSTANTES CAMPOS TABLA_USUARIO
    public static final String TABLA_USUARIO="usuario";
    public static final String CAMPO_ID="id";
    public static final String CAMPO_DNI="dni";
    public static final String CAMPO_AP_PATERNO="ap_paterno";
    public static final String CAMPO_AP_MATERNO="ap_materno";
    public static final String CREAR_TABLA_USUARIO="CREATE TABLE " +
            ""+TABLA_USUARIO+" ("+CAMPO_ID+" " +
            "INTEGER, "+CAMPO_DNI+" TEXT, "+CAMPO_AP_PATERNO+" TEXT, "+CAMPO_AP_MATERNO+" TEXT)";
    }
