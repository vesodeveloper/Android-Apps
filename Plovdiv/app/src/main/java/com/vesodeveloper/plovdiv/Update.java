package com.vesodeveloper.plovdiv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Update extends AppCompatActivity {
protected String ID;
protected EditText euTitle,euInfo;
protected Button DelBtn,UpdBtn;
protected  void CloseThisActivity(){
    finishActivity(200);
    Intent i=new Intent(Update.this,DBActivity.class);
    startActivity(i);
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);
        euTitle = findViewById(R.id.euTitle);
        euInfo=findViewById(R.id.euInfo);
        DelBtn=findViewById(R.id.delBtn);
        UpdBtn=findViewById(R.id.updBtn);
        Bundle b=getIntent().getExtras();
        if (b!=null){
            ID=b.getString("ID");
            euTitle.setText(b.getString("placetitle"));
euInfo.setText(b.getString("placeinfo"));

        }
        UpdBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase db=null;
                try{
                    db=SQLiteDatabase.openOrCreateDatabase(
                            getFilesDir().getPath() + "/" + "placedb.db",
                            null

                    );
                    String placet=euTitle.getText().toString();
                    String placei=euInfo.getText().toString();
                    String ins=" UPDATE PLACEDB SET placetitle=?,placeinfo=?";
                    ins+="WHERE ID=?; ";
                    db.execSQL(ins,new  Object[]{placet,placei,ID});
                    Toast.makeText(getApplicationContext(),"Update is successful",Toast.LENGTH_LONG).show();
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(),"ERROR!!!",Toast.LENGTH_LONG).show();

                }finally {
                    if(db!=null){
                        db.close();
                        db=null;
                    }
                }

          CloseThisActivity();  }
        });
        DelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase db=null;
                try{
                    db=SQLiteDatabase.openOrCreateDatabase(
                            getFilesDir().getPath() + "/" + "placedb.db",
                            null

                    );
                    String placet=euTitle.getText().toString();
                    String placei=euInfo.getText().toString();
                    String ins=" DELETE FROM PLACEDB WHERE ";
                    ins+="  ID=?; ";
                    db.execSQL(ins,new  Object[]{ID});
                    Toast.makeText(getApplicationContext(),"Delete is successful",Toast.LENGTH_LONG).show();
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(),"ERROR!!!",Toast.LENGTH_LONG).show();

                }finally {
                    if(db!=null){
                        db.close();
                        db=null;
                    }
                }
                CloseThisActivity();
            }
        });
    }
}