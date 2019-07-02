package com.porducer.recycle_view_test_project;

//This classwill be called to make data_set for reycler view ready to be shown

import android.content.Context;
public class cn_adapter_connector {
    static String[] data_set;
    static int[] logo_set;
    static int data_number=25;
    public static void create_dataset(Context context){
        data_set = new String[data_number];
        logo_set = new int[data_number];
        for(int i=0 ; i<data_number ; i=i+1) {
            data_set[i] = "Example Row =" + i;
            if (i<=2){logo_set[i] = context.getResources().getIdentifier("logo"+(i+1), "drawable", "com.porducer.recycle_view_test_project");}
            else {logo_set[i] = context.getResources().getIdentifier("logo1", "drawable", "com.porducer.recycle_view_test_project");}
        }
    }

    public static String[] getData_set() {
        return data_set;
    }

    public static int[] getLogo_set() {
        return logo_set;
    }
}
