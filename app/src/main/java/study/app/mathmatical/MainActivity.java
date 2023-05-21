package study.app.mathmatical;

import androidx.appcompat.app.AppCompatActivity;
import org.mariuszgromada.math.mxparser.*;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private static int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void CalculatorBtn_Home(View v) {
        Intent intent = new Intent(this, calculator.class);
        startActivity(intent);
    }

    public void ShapesBtn_Home(View v) {
        Intent intent = new Intent(this, ObjectArea.class);
        startActivity(intent);
     }
}