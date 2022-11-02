package com.example.progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    private ProgressBar progressBar2;
    private ProgressBar progressBar3;
    private int progresso = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar2 = findViewById(R.id.progressBar2);
        progressBar3 = findViewById(R.id.progressBar3);

        this.progressBar3.setVisibility( View.GONE );
    }

    public void loadProgressBar(View view) {
        // barra de progresso e carregamento
        if (this.progresso == 10) {
            this.progresso = 0;
            this.progressBar3.setVisibility( View.GONE );
        } else {
            this.progresso = this.progresso + 1;
            // visible progressBar circular
            this.progressBar3.setVisibility( View.VISIBLE);
        }

        this.progressBar2.setProgress(this.progresso);
    }
}