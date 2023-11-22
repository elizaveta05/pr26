package com.example.pr26;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1, btn2, btn3, btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(this);

        Button btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(this);

        Button btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(this);

        Button btn4 = findViewById(R.id.btn4);
        btn4.setOnClickListener(this);
    }
    public void showToast() {
        // создаём и отображаем тост
        Toast toast = Toast.makeText(getApplicationContext(),
                "Первый вид уведомления!",
                Toast.LENGTH_SHORT);
        //toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
    public void showToast2() {
        /*Toast toast1 = Toast.makeText(getApplicationContext(),
                R.string.toast, Toast.LENGTH_LONG);
        //toast2.setGravity(Gravity.CENTER, 0, 0);
        //LinearLayout toastContainer = (LinearLayout) toast.getView();
        ImageView image = new ImageView(getApplicationContext());
        toast1.getView().setBackgroundColor(Color.BLACK); // Изменение фонового цвета Toast
        image.setImageResource(R.drawable.ic_launcher_background);
       // toastContainer.setBackgroundColor(Color.TRANSPARENT);
       // toastContainer.addView(image, 0);
        toast1.setView(image); // Установка изображения в качестве контента Toast
        toast1.show();
        */
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.custom,
                (ViewGroup) findViewById(R.id.custom_container));

        Toast toast = new Toast(getApplicationContext());
        // toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();

    }
    public void showToast3() {
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.custom_toast,
                (ViewGroup) findViewById(R.id.custom_toast_container));

        Toast toast = new Toast(getApplicationContext());
       // toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();
    }
    public void showToast4(){

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn1) {
            showToast();
        } else if (view.getId() == R.id.btn2){
            showToast2();
        } else if (view.getId() == R.id.btn3){
            showToast3();
        } else if (view.getId() == R.id.btn4){
            showToast4();
        }
    }


}