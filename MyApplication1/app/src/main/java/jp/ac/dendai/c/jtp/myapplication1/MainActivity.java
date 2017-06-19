package jp.ac.dendai.c.jtp.myapplication1;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.*;
import android.widget.Button;

public class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button start_btn = (Button) findViewById(R.id.start_button);

        start_btn.setOnClickListener(new android.view.View.OnClickListener() {
            public void onClick(android.view.View v) {
                // Sub 画面を起動
                Intent intent = new Intent();
                intent.setClassName("jp.ac.dendai.c.jtp.myapplication1", "jp.ac.dendai.c.jtp.myapplication1.GameActivity");
                startActivity(intent);
            }
        });
    }
}