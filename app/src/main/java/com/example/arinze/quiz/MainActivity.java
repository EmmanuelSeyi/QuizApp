package com.example.arinze.quiz;



import android.content.Context;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;



import android.view.View;

import android.widget.CheckBox;

import android.widget.EditText;

import android.widget.RadioButton;

import android.widget.RadioGroup;

import android.widget.Toast;



public class MainActivity extends AppCompatActivity {





    @Override



    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_main);



    }



    Context context = this;

    Toast toast;

    int score=0;







    public int mark(){

        RadioButton answer1=  findViewById(R.id.qu1b);

        boolean checked1 =answer1.isChecked();

        if(checked1){



            score++;

        }

        else{

            RadioGroup radiogroup=  findViewById(R.id.que1);

            radiogroup.check(R.id.qu1b);







        }

        RadioButton answer2= findViewById(R.id.qu2a);

        boolean checked2 =answer2.isChecked();

        if(checked2){

            score++;



        }

        else{

            RadioGroup radiogroup=  findViewById(R.id.que2);

            radiogroup.check(R.id.qu2a);





        }

        RadioButton answer3=  findViewById(R.id.qu3c);

        boolean checked3= answer3.isChecked();

        if(checked3){

            score++;

        }

        else{

            RadioGroup radiogroup=  findViewById(R.id.que3);

            radiogroup.check(R.id.qu3c);





        }

        RadioButton answer4= (findViewById(R.id.qu4b));

        boolean checked4 = answer4.isChecked();

        if(checked4){

            score++;

        }

        else{

            RadioGroup radiogroup=  findViewById(R.id.que4);

            radiogroup.check(R.id.qu4b);





        }

        CheckBox answer5=  findViewById(R.id.qu5b);

        boolean  checked5=answer5.isChecked();

        CheckBox answer5b=  findViewById(R.id.qu5c);

        boolean  checked5b=answer5b.isChecked();

        CheckBox answer5c=  findViewById(R.id.qu5a);

        CheckBox answer5d=  findViewById(R.id.qu5d);

        if(checked5&&checked5b){

            score++;

        }

        else{

            answer5.setChecked(true);

            answer5b.setChecked(true);

            answer5c.setChecked(false);

            answer5d.setChecked(false);

        }

        CheckBox answer6a= findViewById(R.id.qu6b);

        boolean  checked6a=answer6a.isChecked();

        CheckBox answer6b=  findViewById(R.id.qu6c);

        boolean  checked6b=answer6b.isChecked();

        CheckBox answer6c=  findViewById(R.id.qu6d);

        boolean  checked6c=answer6c.isChecked();

        CheckBox answer6d=  findViewById(R.id.qu6a);



        if(checked6a&&checked6b&&checked6c){

            score++;

        }

        else{

            answer6a.setChecked(true);

            answer6b.setChecked(true);

            answer6c.setChecked(true);

            answer6d.setChecked(false);

        }

        CheckBox answer7a=  findViewById(R.id.qu7a);

        boolean  checked7a=answer7a.isChecked();

        CheckBox answer7b=  findViewById(R.id.qu7d);

        boolean  checked7b=answer7b.isChecked();

        CheckBox answer7c=  findViewById(R.id.qu7c);

        CheckBox answer7d=  findViewById(R.id.qu7b);

        if(checked7a&&checked7b){

            score++;

        }

        else{

            answer7a.setChecked(true);

            answer7b.setChecked(true);

            answer7c.setChecked(false);

            answer7d.setChecked(false);

        }

        EditText answer8= findViewById(R.id.qu8);

        String checked8 = answer8.getText().toString();



        if(checked8 .equals("1035")){

            score++;

        }

        else{

            answer8.setText("1035");

        }

        EditText answer9= findViewById(R.id.qu9);

        String  checked9= answer9.getText().toString();



        if (checked9.equals("3024")){

            score++;

        }

        else{

            answer9.setText("3024");

        }

        EditText answer10= findViewById(R.id.qu10);

        String  checked10= answer10.getText().toString();

        if(checked10.equals("13")){

            score++;

        }

        else{

            answer10.setText("13");

        }





        return score;

    }

    public void grading(int score){

        if(score>8){

            toast =Toast.makeText( context,"Great Work. Your Score is  " +score + " Please review the answers to find your mistakes ",Toast.LENGTH_SHORT);

            toast.show();

        }

        else if(score>6){

            toast =Toast.makeText( context,"Good Work.Your Score is "+score+ " Please review the answers to find your mistakes ",Toast.LENGTH_SHORT);

            toast.show();



        }

        else if(score>4){

            toast =Toast.makeText( context,"Fair Work.Your Score is "+score+ " Please review the answers to find your mistakes ",Toast.LENGTH_SHORT);

            toast.show();

        }

        else if(score>0){

            toast =Toast.makeText( context," Poor Work.Your Score is "+score+" Please review the answers to find your mistakes ",Toast.LENGTH_SHORT);

            toast.show();



        }

        else if(score==0){

            toast =Toast.makeText( context,"Poor Work.Your Score is "+score+" Please review the answers to find your mistakes",Toast.LENGTH_SHORT);

            toast.show();



        }

    }

    public void reset (View view){

        RadioButton answer1=  findViewById(R.id.qu1b);

        answer1.setChecked(false);

        RadioButton answer2= findViewById(R.id.qu2a);

        answer2.setChecked(false);

        RadioButton answer3=  findViewById(R.id.qu3c);

        answer3.setChecked(false);

        RadioButton answer4= (findViewById(R.id.qu4b));

        answer4.setChecked(false);

        CheckBox answer5=  findViewById(R.id.qu5b);

        CheckBox answer5b=  findViewById(R.id.qu5c);

        CheckBox answer5c=  findViewById(R.id.qu5a);

        CheckBox answer5d=  findViewById(R.id.qu5d);

        answer5.setChecked(false);

        answer5b.setChecked(false);

        answer5c.setChecked(false);

        answer5d.setChecked(false);



        CheckBox answer6a= findViewById(R.id.qu6b);

        CheckBox answer6b=  findViewById(R.id.qu6c);

        CheckBox answer6c=  findViewById(R.id.qu6d);

        CheckBox answer6d=  findViewById(R.id.qu6a);



        answer6a.setChecked(false);

        answer6b.setChecked(false);

        answer6c.setChecked(false);

        answer6d.setChecked(false);



        CheckBox answer7a=  findViewById(R.id.qu7a);

        CheckBox answer7b=  findViewById(R.id.qu7d);

        CheckBox answer7c=  findViewById(R.id.qu7c);

        CheckBox answer7d=  findViewById(R.id.qu7b);

        answer7a.setChecked(false);

        answer7b.setChecked(false);

        answer7c.setChecked(false);

        answer7d.setChecked(false);



        EditText answer8= findViewById(R.id.qu8);

        answer8.setText("");



        EditText answer9= findViewById(R.id.qu9);

        answer9.setText("");



        EditText answer10= findViewById(R.id.qu10);

        answer10.setText("");











    }

    public void buttonClick(View view){

        mark();

        grading(score);

        score=0;

    }





}