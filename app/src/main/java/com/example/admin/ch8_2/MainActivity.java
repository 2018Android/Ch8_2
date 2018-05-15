package com.example.admin.ch8_2;

import android.content.DialogInterface;
import android.preference.DialogPreference;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_message = (Button)findViewById(R.id.btn_message);
        btn_message.setOnClickListener(btn_message_listener);
    }

    DialogInterface.OnClickListener dialog_listener = new DialogInterface.OnClickListener(){
        public void onClick(DialogInterface dialogInterface, int i){

        }
    };

    View.OnClickListener btn_message_listener = new View.OnClickListener(){
        public void onClick(View v){
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setTitle("關於")
                    .setMessage("版本:7.0版 \n 作者:陳會安")
                    .setPositiveButton("確定", dialog_listener)
                    .show();
        }
    };
    /*public void button_Click(View v){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("關於")
                .setMessage("版本:7.0版 \n 作者:陳會安")
                .setPositiveButton(
                        "確定"
                        , new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialogInterface, int i){

                            }
                        })
                .show();
    }*/

}
