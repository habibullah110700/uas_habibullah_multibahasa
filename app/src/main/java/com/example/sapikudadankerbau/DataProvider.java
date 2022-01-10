package com.example.sapikudadankerbau;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import com.example.sapikudadankerbau.model.Sapi;
import com.example.sapikudadankerbau.model.Hewan;
import com.example.sapikudadankerbau.model.Kuda;
import com.example.sapikudadankerbau.model.Kerbau;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Sapi> initDataSapi(Context ctx) {
        List<Sapi> sapis = new ArrayList<>();
        sapis.add(new Sapi(ctx.getString(R.string.holstein_nama),ctx.getString(R.string.holstein_asal),
                ctx.getString(R.string.holstein_deskripsi),R.drawable.sapi1));
        sapis.add(new Sapi(ctx.getString(R.string.galloway_nama),ctx.getString(R.string.galloway_asal),
                ctx.getString(R.string.galloway_deskripsi), R.drawable.sapi_galloway));
        sapis.add(new Sapi(ctx.getString(R.string.hereford_nama),ctx.getString(R.string.hereford_asal),
                ctx.getString(R.string.hereford_deskripsi), R.drawable.sapi_hereford));
        sapis.add(new Sapi(ctx.getString(R.string.cachena_nama),ctx.getString(R.string.cachena_asal),
                ctx.getString(R.string.cachena_deskripsi), R.drawable.sapi_cachena));
        sapis.add(new Sapi(ctx.getString(R.string.anggus_nama),ctx.getString(R.string.anggus_asal),
                ctx.getString(R.string.anggus_deskripsi), R.drawable.sapi_angus));

        return sapis;
    }


    private static List<Kuda> initDataKuda(Context ctx) {
        List<Kuda> kudas = new ArrayList<>();
        kudas.add(new Kuda(ctx.getString(R.string.arab_nama), ctx.getString(R.string.arab_asal),
                ctx.getString(R.string.arab_deskripsi),R.drawable.kuda_arab));
        kudas.add(new Kuda(ctx.getString(R.string.appoloosa_nama), ctx.getString(R.string.appoloosa_asal),
                ctx.getString(R.string.appoloosa_deskripsi),R.drawable.kuda_appoloos));
        kudas.add(new Kuda(ctx.getString(R.string.dutch_nama), ctx.getString(R.string.dutch_asal),
                ctx.getString(R.string.dutch_deskripsi), R.drawable.kuda_dutch));
        kudas.add(new Kuda(ctx.getString(R.string.mustang_nama), ctx.getString(R.string.mustang_asal),
                ctx.getString(R.string.mustang_deskripsi), R.drawable.kuda_mustang2));
        return kudas;
    }
    private static List<Kerbau> initDataKerbau(Context ctx) {
        List<Kerbau> kerbaus = new ArrayList<>();
        kerbaus.add(new Kerbau(ctx.getString(R.string.murrah_nama),ctx.getString(R.string.murrah_asal),
                ctx.getString(R.string.murrah_deskripsi), R.drawable.kerbau_murrah));
        kerbaus.add(new Kerbau(ctx.getString(R.string.rawa_nama),ctx.getString(R.string.rawa_asal),
                ctx.getString(R.string.rawa_deskripsi), R.drawable.kerbau_rawa));
        kerbaus.add(new Kerbau(ctx.getString(R.string.mediterania_nama),ctx.getString(R.string.mediterania_asal),
                ctx.getString(R.string.mediterania_deskripsi), R.drawable.kerbau_mediterina));
        kerbaus.add(new Kerbau(ctx.getString(R.string.nagfuri_nama),ctx.getString(R.string.nagfuri_asal),
                ctx.getString(R.string.nagfuri_deskripsi), R.drawable.kerbau_nagfuri));
        kerbaus.add(new Kerbau(ctx.getString(R.string.surti_nama),ctx.getString(R.string.surti_asal),
                ctx.getString(R.string.surti_deskripsi), R.drawable.kerbau_surti));
        return kerbaus;
    }


    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataSapi(ctx));
        hewans.addAll(initDataKuda(ctx));
        hewans.addAll(initDataKerbau(ctx));
    }
    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}