package my.edu.taruc.bmicalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String BMI =" my.edu.taruc.bmicalculator" ;
    private EditText editTWeight;
    private EditText editTHeight;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTWeight=findViewById(R.id.inputWeight);
        editTHeight=findViewById(R.id.inputHeight);
    }

    public void calculate(View view)
    {double height;
     double weight;
     double BMI;

     if(TextUtils.isEmpty(editTWeight.getText()) ||TextUtils.isEmpty(editTHeight.getText())  )
     { editTWeight.setError("Please enter Weight!");
       editTHeight.setError("Please enter Height!");
       return;}
       else
     {height=Double.parseDouble(editTHeight.getText().toString());
      weight=Double.parseDouble(editTWeight.getText().toString());
      BMI=(weight/(height*height));
         Intent intent=new Intent(this, resultActivity.class);
         intent.putExtras(BMI,BMI);
         startActivity(intent);


     }
    }
}
