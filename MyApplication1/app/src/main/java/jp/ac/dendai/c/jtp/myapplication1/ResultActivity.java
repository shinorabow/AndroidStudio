package jp.ac.dendai.c.jtp.myapplication1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

/**
 * Created by taka on 2017/06/16.
 */

public class ResultActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Button toTitle_btn = (Button) findViewById(R.id.toTitle_button);

        toTitle_btn.setOnClickListener(new android.view.View.OnClickListener() {
            public void onClick(android.view.View v) {
                // Sub 画面を起動
                Intent intent = new Intent();
                intent.setClassName("jp.ac.dendai.c.jtp.myapplication1", "jp.ac.dendai.c.jtp.myapplication1.MainActivity");
                startActivity(intent);
            }
        });
    }
}