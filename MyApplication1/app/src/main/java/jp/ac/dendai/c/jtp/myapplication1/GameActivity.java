package jp.ac.dendai.c.jtp.myapplication1;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Display;
import android.widget.Button;
import android.widget.ImageView;

public class GameActivity extends Activity {
    private View view;
    private Thread mainThread;
    private ImageView imageView;

    //private boolean isGameOver = false;

    Button toResult_btn;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        //imageView = (ImageView)findViewById(R.id.imageView);

        toResult_btn = (Button) findViewById(R.id.toResult_button);
        toResult_btn.setVisibility(View.VISIBLE);

        toResult_btn.setOnClickListener(new android.view.View.OnClickListener() {
            public void onClick(android.view.View v) {
                Intent intent = new Intent();
                intent.setClassName("jp.ac.dendai.c.jtp.myapplication1", "jp.ac.dendai.c.jtp.myapplication1.ResultActivity");
                startActivity(intent);
            }
        });
    }

    @Override
    public void onStart() {
        super.onStart();
        Display display = getWindowManager().getDefaultDisplay();
        Point p = new Point();
        display.getSize(p);
        view = new View(this, p, toResult_btn, this);
        view.init();
        setContentView(view);
    }

    @Override
    public void onResume() {
        super.onResume();
        view.start();
    }

    @Override
    public void onStop() {
        super.onStop();
        while (mainThread != null && mainThread.isAlive()) {
            try {
                view.shutdown = true;
                //isGameOver = view.shutdown;
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

    /*
        public Button getToResultBtn() {
            return toResult_btn;
        }
    */
    public void toResult() {
        Intent intent = new Intent();
        intent.setClassName("jp.ac.dendai.c.jtp.myapplication1", "jp.ac.dendai.c.jtp.myapplication1.ResultActivity");
        try {
            startActivity(intent);
        } catch (NullPointerException n) {
        }
    }

}