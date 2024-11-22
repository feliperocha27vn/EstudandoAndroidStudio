package com.example.bodycontrol.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class BancoDAO {
    private SQLiteDatabase db;
    private EstruturaBanco banco;

    public BancoDAO (Context context){
        banco = new EstruturaBanco(context);
    }

    public String inserirNovaPessoa
}
