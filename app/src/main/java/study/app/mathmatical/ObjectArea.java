package study.app.mathmatical;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ObjectArea extends MainActivity
{
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.object_area_layout);

    }
    public void RectangleBtn_Object(View v)
    {
        intent =new  Intent(this,Rectangle.class);
        startActivity(intent);
    }
    public void TriangleBtn_Object(View v)
    {
        intent =new  Intent(this ,Triangle.class);
        startActivity(intent);
    }
    public void CircleBtn_Object(View v)
    {
        intent =new  Intent(this ,Circle.class);
        startActivity(intent);
    }
    public void SquareBtn_Object(View v)
    {
        intent =new  Intent(this ,Square.class);
        startActivity(intent);
    }
}
