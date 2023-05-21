package study.app.mathmatical;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class Rectangle extends MainActivity {
    float width,height;
    TextView Area,Perimeter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rectangle_layout);
        Area =findViewById(R.id.AreaTextView_Rectangle);
        Perimeter =findViewById(R.id.PerimeterTextView_Rectangle);

    }
    public void CalculateBtn_Rectangle(View v)
    {
        EditText num1 =findViewById(R.id.WidthEditText_Rectangle);
        EditText num2 =findViewById(R.id.HeightEditText_Rectangle);
        String w =num1.getText().toString();
        String h =num1.getText().toString();
        if (!w.equals("")&&!h.equals("")){
        width = Float.parseFloat(num1.getText().toString());
        height = Float.parseFloat(num2.getText().toString());
        Area.setText(String.format(" Area =%.3f",width*height));
        Perimeter.setText(String.format(" Perimeter =%.3f",width+height));}
        else
            Toast.makeText(this, "Enter The Values", Toast.LENGTH_LONG).show();
    }
}
