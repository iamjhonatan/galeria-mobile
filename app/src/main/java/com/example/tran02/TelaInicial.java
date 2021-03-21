package com.example.tran02;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TelaInicial extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);
        setTitle("Home");
        imageView = findViewById(R.id.imageView);
    }

    int selectedImage = 0;
    String images[] = new String[]{"batman","miranha", "hulk"};
    public void changeImageClicked(View view){
        for (String click: images){
            if(selectedImage == 0){
                selectedImage = 1;
                selectedImage++;
                //imageViewMain.setImageResource(R.drawable.bob);
            }else{
                selectedImage = 0;
                //imageViewMain.setImageResource(R.drawable.patrick);
            }
            Drawable d = getResources().getDrawable(
                    getResources().getIdentifier(images[selectedImage],
                            "drawable",
                            getPackageName()),this.getTheme());

            imageView.setImageDrawable(d);
        }


    }
}