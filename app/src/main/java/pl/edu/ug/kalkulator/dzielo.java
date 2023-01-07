package pl.edu.ug.kalkulator;

import static java.lang.Math.round;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.DecimalFormat;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class dzielo extends AppCompatActivity {


    TextView textView;
    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView textView5;
    TextView textView6;
    EditText editText;
    Button button;

    private static final DecimalFormat decfor = new DecimalFormat("0.00");
    public void oblicz(View v) {
        String salary = editText.getText().toString();
        double gross = Double.parseDouble(salary);
        double emer = 0;
        double ren = 0;
        double chor = 0;
        double zdro = 0;
        double koszty = gross * 0.2;
        double taxPodst = round(gross - koszty);
        double tax = round(taxPodst * 0.17);
        double net = gross - tax;
        textView1.setText("Wynagrodzenie netto wynosi: " + decfor.format(net));
        textView2.setText("Ubezpieczenie emerytalne: " + decfor.format(emer));
        textView3.setText("Ubezpieczenie rentowe: " + decfor.format(ren));
        textView4.setText("Ubezpieczenie chorobowe: " + decfor.format(chor));
        textView5.setText("Ubezpieczenie zdrowotne: " + decfor.format(zdro));
        textView6.setText("Zaliczka na podatek: " + tax);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dzielo);

        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);
        textView6 = findViewById(R.id.textView6);


    }
}