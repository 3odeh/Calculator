package study.app.mathmatical;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Circle extends MainActivity {
    double radius,pi=3.14;
    TextView Area,Perimeter;
    EditText num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.circle_layout);
        Area = (TextView) findViewById(R.id.AreaTextView_Circle);
        Perimeter = (TextView) findViewById(R.id.PerimeterTextView_Circle);
    }
    public void CalculateBtn_Circle(View v)
    {
        num = findViewById(R.id.RadiusEditText_Circile);
        radius = Float.parseFloat(num.getText().toString());
        Area.setText(String.format(" Area =%.3f",pi*radius*radius));
        Perimeter.setText(String.format(" Perimeter =%.3f",2*pi*radius));
    }
}
