package study.app.mathmatical;

import androidx.appcompat.app.AppCompatActivity;
import org.mariuszgromada.math.mxparser.*;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.EditText;

public class calculator extends AppCompatActivity{
    private EditText display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);
        display =(EditText) findViewById(R.id.input);
    }

    private void updateText(String strToAdd)
    {
        String oldStr = display.getText().toString();
        int cursorPos = display.getSelectionStart();
        String leftStr = oldStr.substring(0,cursorPos);
        String rightStr = oldStr.substring(cursorPos);
        if (getString(R.string.display).equals(display.getText().toString())){
            display.setText(strToAdd);
            display.setSelection(cursorPos+1);}
        else {
            display.setText(String.format("%s%s%s",leftStr,strToAdd,rightStr));
            display.setSelection(cursorPos+1);
        }


    }
    public void clearBtn(View v)
    {
        display.setText("");

    }
    public void parenthesesBtn(View v)
    {
        int openPar =0;
        int closedPar = 0;
        int textLen = display.getText().length();
        int s = display.getText().length()+1;

        for (int i=0;i<(display.getSelectionStart());i++)
        {
            if (display.getText().toString().charAt(i) == '(')
                openPar+=1;

            if (display.getText().toString().charAt(i) == ')')
                closedPar+=1;

        }
        if (openPar == closedPar || display.getText().toString().charAt(textLen - 1) == '(') {
            updateText("(");
        }
        else if (openPar > closedPar && display.getText().toString().charAt(textLen - 1) != '(') {
            updateText(")");

        }
        display.setSelection(display.getText().length());
    }
    public void exponentBtn(View v)
    {
        updateText("^");
    }
    public void divideBtn(View v)
    {
        updateText("/");
    }
    public void sevenBtn(View v)
    {
        updateText("7");
    }
    public void eightBtn(View v)
    {
        updateText("8");
    }
    public void nineBtn(View v)
    {
        updateText("9");
    }
    public void multiplyBtn(View v)
    {
        updateText("*");
    }
    public void fourBtn(View v)
    {
        updateText("4");
    }
    public void fiveBtn(View v)
    {
        updateText("5");
    }
    public void sixBtn(View v)
    {
        updateText("6");
    }
    public void subtractBtn(View v)
    {
        updateText("-");
    }
    public void oneBtn(View v)
    {
        updateText("1");
    }
    public void twoBtn(View v)
    {
        updateText("2");
    }
    public void threeBtn(View v)
    {
        updateText("3");
    }
    public void addBtn(View v)
    {
        updateText("+");
    }
    public void plusMinusBtn(View v)
    {
        updateText("-");
    }
    public void zeroBtn(View v)
    {
        updateText("0");
    }
    public void pointBtn(View v)
    {
        updateText(".");
    }
    public void equalsBtn(View v)
    {
        String Exp = display.getText().toString();
        Expression exp = new Expression(Exp);
        String result = String.valueOf(exp.calculate());
        display.setText(result);
        display.setSelection(result.length());
    }
    public void backspace(View b)
    {
        int cursorPos = display.getSelectionStart();
        int textLen = display.getText().length();
        if (cursorPos != 0 && textLen !=0)
        {
            SpannableStringBuilder selection =(SpannableStringBuilder) display.getText();
            selection.replace(cursorPos-1,cursorPos,"");
            display.setText(selection);
            display.setSelection(cursorPos-1);
        }
    }
    public static String calculate(String s)
    {
        Expression x = new Expression(s);
        return ((String.valueOf(x.calculate())));
    }
}