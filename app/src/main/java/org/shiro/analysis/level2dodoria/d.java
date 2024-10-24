package org.shiro.analysis.level2dodoria;

import android.os.Build;

import java.io.File;

public class d {

    static int v9_1;
    static int v8;
    static String[] v2;

    public static String d() {
        v8 = 0;
        String v4 = "n";
        String v6 = "n";
        String v5 = "n";
        String v3 = "n";
        String v0 = Build.TAGS;

        if(v0 != null && (v0.contains("test-keys"))) {
            v4 = "y";
        }

        if(!new File("/system/app/Superuser.apk").exists()) {
            v6 = "y";
        }

        v9_1 = 8;

        String[] v2 = System.getenv("PATH").split(":");
        int v10 = v2.length;
        int v11;
        for(v11 = 0; v11 < v10; ++v11) {
            if(new File(v2[v11], "su").exists()) {
                v5 = "y";
            }
        else return v5;
        }




        if((v4.equals("y")) || (v6.equals("y")) || (v5.equals("y"))) {
            v3 = "y";
        }

        return v3;
    }

}
