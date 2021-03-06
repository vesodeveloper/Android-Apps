package com.vesodeveloper.plovdiv;

import androidx.annotation.CallSuper;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class DBActivity extends AppCompatActivity {
    protected EditText placetitle,placeinfo;
    protected Button addplacebtn;
    protected ListView viewall;

    protected void initDB() throws SQLiteException{
        SQLiteDatabase placedb=null;
        placedb=SQLiteDatabase.openOrCreateDatabase(
                getFilesDir().getPath() + "/" + "placedb.db",
                null

        );
        String insertinto="CREATE TABLE if not exists PLACEDB(";
        insertinto+=" ID integer primary key AUTOINCREMENT, ";
        insertinto+=" placetitle text not null, ";
        insertinto+=" placeinfo text not null, ";
        insertinto+=" unique(placetitle,placeinfo) );";

        placedb.execSQL(insertinto);
        placedb.close();
    }
    protected void selectDB() throws SQLiteException{
        SQLiteDatabase placedb=null;
        placedb=SQLiteDatabase.openOrCreateDatabase(
                getFilesDir().getPath() + "/" + "placedb.db",
                null
        );
viewall.clearChoices();
        final ArrayList<String> selRes=new ArrayList<String>();
        String sel=" SELECT * FROM PLACEDB ORDER BY placetitle;";
        Cursor cursor=placedb.rawQuery(sel,null);
        while (cursor.moveToNext()) {
            String ID = cursor.getString(cursor.getColumnIndex("ID"));
            String placetitle = cursor.getString(cursor.getColumnIndex("placetitle"));
            String placeinfo = cursor.getString(cursor.getColumnIndex("placeinfo"));
            selRes.add(ID+"\t"+placetitle+"\t"+placeinfo);
        }

        final ArrayAdapter<String> arrayAdapter=
                new ArrayAdapter<String>(
                        getApplicationContext(),
                        R.layout.activity_listview,
                        R.id.tview,
                        selRes

                );
        viewall.setAdapter(arrayAdapter);
        placedb.execSQL(sel);
        placedb.close();



    }
    //Step 2
@Override
@CallSuper
protected void onActivityResult(int reqcode,int rescode,Intent data){
        super.onActivityResult(reqcode,rescode,data);
try {
    selectDB();
}catch (Exception e){

}}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d_b);
        placetitle=findViewById(R.id.ptitleEditText);
        placeinfo=findViewById(R.id.pinfoEditText);
        addplacebtn=findViewById(R.id.addplaceBtn);
        viewall=findViewById(R.id.viewallEl);

        // UPDATE
        viewall.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                String selectedrow="";
                TextView clickedtext=view.findViewById(R.id.tview);
                selectedrow=clickedtext.getText().toString();
                String[] elements=selectedrow.split("\t");
                String ID=elements[0];
               String placetitle1=elements[1];
               String placeinfo1=elements[2];
                Intent updintent=new Intent(DBActivity.this,Update.class);
                Bundle bun=new Bundle();
                bun.putString("ID",ID);
                bun.putString("placetitle",placetitle1);
                bun.putString("placeinfo",placeinfo1);
                updintent.putExtras(bun);
                startActivityForResult(updintent,200,bun);
            }
        });




        try {
            initDB();
            selectDB();

        }catch (Exception e){
            Toast.makeText(this,"ERROR!!!",Toast.LENGTH_LONG).show();

        }

        addplacebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SQLiteDatabase db=null;
                try{
                    db=SQLiteDatabase.openOrCreateDatabase(
                            getFilesDir().getPath() + "/" + "placedb.db",
                            null

                    );
                    String placet=placetitle.getText().toString();
                    String placei=placeinfo.getText().toString();
                    String ins="INSERT INTO PLACEDB (placetitle,placeinfo)";
                    ins+="VALUES(?,?); ";
                    db.execSQL(ins,new  Object[]{placet,placei});
                    Toast.makeText(getApplicationContext(),"Insert is successful",Toast.LENGTH_LONG).show();
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(),"ERROR!!!",Toast.LENGTH_LONG).show();

                }finally {
                    if(db!=null){
                        db.close();
                        db=null;
                    }
                }
                try {
                    selectDB();
                }catch (Exception e){

                }

            }
        });

}}


