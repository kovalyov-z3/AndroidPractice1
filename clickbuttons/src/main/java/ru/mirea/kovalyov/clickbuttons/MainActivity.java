package ru.mirea.kovalyov.clickbuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import ru.mirea.kovalyov.clickbuttons.R;

public class MainActivity extends AppCompatActivity {

    private TextView tvOut;
    private Button buttonOk;
    private Button buttonCancel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOut = findViewById(R.id.tvOut);
        buttonOk = findViewById(R.id.btnOk);
        buttonCancel = findViewById(R.id.btnCancel);

        View.OnClickListener onBtnOkClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvOut.setText("Нажата кнопка OK");
            }
        };
        buttonOk.setOnClickListener(onBtnOkClickListener);
    }

    public void onCancelButtonClick(View view) {
        Toast.makeText(this, "Еще один способ!", Toast.LENGTH_SHORT).show();
    }
}