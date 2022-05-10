package ru.mirea.lukyanchuk.clickbuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvtOut;
    private Button btOK;
    private Button btCancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvtOut = (TextView) findViewById(R.id.textView);
        btOK = (Button) findViewById(R.id.buttonOk);
        btCancel = (Button) findViewById(R.id.buttoncancel);
        View.OnClickListener onButtonOk = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvtOut.setText("нажата кнопка OK.");
            }
        };
        btOK.setOnClickListener(onButtonOk);
        View.OnClickListener onButtonCancel = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvtOut.setText("нажата кнопка CANCEL.");
            }
        };
        btCancel.setOnClickListener(onButtonCancel);
    }
}