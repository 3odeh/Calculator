package study.app.mathmatical;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Triangle extends MainActivity {
    float a,b,c;
    TextView Area,Perimeter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.triangle_layout);
        Area = (TextView) findViewById(R.id.AreaTextView_Triangle);
        Perimeter = (TextView) findViewById(R.id.PerimeterTextView_Triangle);

    }
    public void CalculateBtn_Triangle(View v)
    {
        EditText num1 =  findViewById(R.id.SideAEdetText_Triangle);
        EditText num2 =  findViewById(R.id.SideBEdetText_Triangle);
        EditText num3 =  findViewById(R.id.SideCEdetText_Triangle);
        a = Float.parseFloat(num1.getText().toString());
        b = Float.parseFloat(num2.getText().toString());
        c = Float.parseFloat(num3.getText().toString());
        float s=(a+b+c)/2;
        float d=(s*(s-a)*(s-b)*(s-c));
        double area= Math.sqrt(b);
        Area.setText(String.format(" Area =%.3f",area));
        Perimeter.setText( String.format(" Perimeter =%.3f",(a+b+c)));
    }

}
