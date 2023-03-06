package com.example.drinkingbottle;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class Howtoplay extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.howtoplay);
        Button back1;
        back1=findViewById(R.id.back);

        back1.setOnClickListener(v -> openActivity4());
    }


    public void openActivity4() {
        Intent intent = new Intent(this, Playscreen.class);
        startActivity(intent);
    }
}
