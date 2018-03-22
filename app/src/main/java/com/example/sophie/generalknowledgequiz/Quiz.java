package com.example.sophie.generalknowledgequiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import javax.xml.transform.Result;

/**
 * Created by Sophie on 3/3/2018.
 */

public class Quiz extends AppCompatActivity {

 String user_name;
    //initialize all the fields in my layouts
    //Checkbox
    TextView CBquestion;
    CheckBox CB1;
    CheckBox CB2;
    CheckBox CB3;
    CheckBox CB4;
    //RadioButton
    TextView RBquestion;
    RadioButton RB1;
    RadioButton RB2;
    RadioButton RB3;
    RadioButton RB4;
    //EditText
    TextView ETquestion;
    EditText ETanswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.radio_button_four);
//find all the fields in my layouts
        //Checkbox
        CBquestion = findViewById(R.id.CBquestion);
        CB1 = findViewById(R.id.CBanswer1);
        CB2 = findViewById(R.id.CBanswer2);
        CB3 = findViewById(R.id.CBanswer3);
        CB4 = findViewById(R.id.CBanswer4);
        //RadioButton
        RBquestion = findViewById(R.id.RBquestion);
        RB1 = findViewById(R.id.RBanswer1);
        RB2 = findViewById(R.id.RBanswer2);
        RB3 = findViewById(R.id.RBanswer3);
        RB4 = findViewById(R.id.RBanswer4);
        //EditText
        ETquestion = findViewById(R.id.ETquestion);
        ETanswer = findViewById(R.id.ETanswer);
        //prepare my first view
        RBquestion.setText(R.string.question_1);
        RB1.setText(R.string.writ1);
        RB2.setText(R.string.writ2);
        RB3.setText(R.string.writ3);
        RB4.setText(R.string.writ4);
        //get the name

    }
    //initialize score and question
    int score = 0;
    int question = 2;
    //make my switch
    public void submit(View view){
        switch (question++){
            case 2:
                //update score
                if (RB2.isChecked()) {
                    score++;
                }
                //fill a new view
                break;
            case 3:
                //update score
                //fill a new view
                break;
            case 4:
                //update score
                //fill a new view
                break;
            case 5:
                //update score
                //fill a new view
                break;
            case 6:
                //update score
                //fill a new view
                break;
            case 7:
                //update score
                //fill a new view
                break;
            case 8:
                //update score
                //fill a new view
                break;
            case 9:
                //update score
                //fill a new view
                break;
            case 10:
                //update score
                //fill a new view
                break;
            default:
                //go to result class
                //put in name and score
                Intent intent = new Intent(this, Result.class);
        }
    }


}
