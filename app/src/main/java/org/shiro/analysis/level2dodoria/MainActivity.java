package org.shiro.analysis.level2dodoria;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    private void a(String arg4) {
        AlertDialog v0 = new AlertDialog.Builder(((Context)this)).create();
        v0.setTitle(((CharSequence)arg4));
        v0.setMessage("bypass and then kill a dodoria");
        v0.setButton(-3, "OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface arg1, int arg2) {
                System.exit(0);
            }
        });
        v0.setCancelable(false);
        v0.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        if((d.d().equals("y"))) {
            this.a("Root detected!");
        }


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
