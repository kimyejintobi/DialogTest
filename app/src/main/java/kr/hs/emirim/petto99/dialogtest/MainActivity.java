package kr.hs.emirim.petto99.dialogtest;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    String[] itemArr={"Ryujehong","Zunba","tobi","EscA","WhoRu","Gido","Miro"};
    Button butDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        butDialog=(Button) findViewById(R.id.but_dialog);
        butDialog.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
        AlertDialog.Builder dialog=new AlertDialog.Builder(this);
        dialog.setTitle("Lunatic-Hai");
        dialog.setIcon(R.mipmap.tobi); //mipmap은 사진을 아이콘을 만들어준다.
       // dialog.setMessage("이 곳에 메세지를 입력하세요!");
        /*dialog.setItems(itemArr, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                butDialog.setText(itemArr[i]);

            }
        });*/

        dialog.setSingleChoiceItems(itemArr, 0,new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        butDialog.setText(itemArr[i]);

                    }
                });

        //라디오 버튼 목록
        dialog.setPositiveButton("OK",null);
        dialog.show();
    }

}
