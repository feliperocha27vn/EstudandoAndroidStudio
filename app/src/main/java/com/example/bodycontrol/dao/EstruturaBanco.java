package com.example.bodycontrol.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class EstruturaBanco extends SQLiteOpenHelper {

    private static final String NOME_BANCO = "bodyControl.db";
    private static final String TABELA = "pessoa";
    private static final String ID_PESSOA = "idPessoa";
    private static final String NOME = "nomePessoa";
    private static final String PESO = "pesoEmKg";
    private static final String ALTURA = "alturaEmCm";
    private static final int VERSAO = 1;

    public EstruturaBanco (Context context){
        super(context, NOME_BANCO, null, VERSAO);
    }

    public static String getNomeBanco(){
        return NOME_BANCO;
    }

    public static String getTabela(){
        return TABELA;
    }

    public static String getIdPessoa(){
        return ID_PESSOA;
    }

    public static String getNome(){
        return NOME;
    }

    public static String getPeso(){
        return PESO;
    }

    public static String getAltura(){
        return ALTURA;
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        String sql = "CREATE TABLE " + TABELA + "("
                + ID_PESSOA + "integer PRIMARY KEY AUTOINCREMENT"
                + NOME + "text,"
                + PESO + "text,"
                + ALTURA + "text"
                + ")";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade (SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS" + TABELA);
        onCreate(db);
    }

}
