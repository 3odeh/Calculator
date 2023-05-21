package study.app.mathmatical;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class Square extends MainActivity {
    float side;
    TextView Area,Perimeter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.square_layout);
        Area = (TextView) findViewById(R.id.AreaTextView_Square);
        Perimeter = (TextView) findViewById(R.id.PerimeterTextView_Square);
    }
    public void CalculateBtn_Square(View v)
    {
        EditText num1 = (EditText) findViewById(R.id.SideEditText_Square);
        side = Float.parseFloat(num1.getText().toString());
        Area.setText(String.format(" Area =%.3f",side*side));
        Perimeter.setText(String.format(" Perimeter =%.3f",side*4));
    }
}
