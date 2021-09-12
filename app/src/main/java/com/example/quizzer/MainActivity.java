package com.example.quizzer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String[] questions ={"Who among the following is the highest wicket taker in all formats of cricket?","Which country won the first Cricket World Cup in 1975?","How much did Sunil Gavaskar score for India in its very first World Cup match played against England in 1975?","Which cricketer has made the highest individual score at the World Cup ?","Who was the wicket-keeper of the Indian Cricket Team during the World Cup 2003 tournament?"};
    private String[] answers = {"M Muralitharan", "West Indies", "36 off 174 balls","Saurav Ganguly","Mahendra Singh Dhoni"};
    private String[][] options={{"M Muralitharan","SK Warne","A Kumble","GD McGrath"},{"Australia","West Indies","India","South Africa"},{"36 off 174 balls","79 off 99 balls","36 off 36 balls","111 off 100 balls"},{"Rahul Dravid","Saurav Ganguly","Sachin Tendulkar","Kapil Dev"},{"Parthiv Patel","Nayan Mongia","Rahul Dravid","Mahendra Singh Dhoni"}};
    private int score=0;
    TextView question; Button option1; Button option2; Button option3; Button option4;
    private int index=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        option1=findViewById(R.id.option1); option2=findViewById(R.id.option2); option3=findViewById(R.id.option3); option4=findViewById(R.id.option4);
        question=findViewById(R.id.question);
        question.setText(questions[index]); option1.setText(options[index][0]);option2.setText(options[index][1]);option3.setText(options[index][2]);option4.setText(options[index][3]);

        option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index <= questions.length-1){
                    if (answers[index].equals(options[index][0])) {
                        score++;
                    }
                    index++;
                    if (index< questions.length){
                        question.setText(questions[index]); option1.setText(options[index][0]);option2.setText(options[index][1]);option3.setText                                       (options[index][2]);option4.setText(options[index][3]);
                    }
                    else {
                        Toast.makeText(MainActivity.this, "Your score is "+score, Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(MainActivity.this, "Restart the app to play again!", Toast.LENGTH_SHORT).show();
                }
            }

        });
        option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index <= questions.length-1){
                    if (answers[index].equals(options[index][1])) {
                        score++;
                    }
                    index++;
                    if (index< questions.length){
                        question.setText(questions[index]); option1.setText(options[index][0]);option2.setText(options[index][1]);option3.setText                                       (options[index][2]);option4.setText(options[index][3]);
                    }
                    else {
                        Toast.makeText(MainActivity.this, "Your score is "+score, Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(MainActivity.this, "Restart the app to play again!", Toast.LENGTH_SHORT).show();
                }
            }

        });
        option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index <= questions.length-1){
                    if (answers[index].equals(options[index][2])) {
                        score++;
                    }
                    index++;
                    if (index< questions.length){
                        question.setText(questions[index]); option1.setText(options[index][0]);option2.setText(options[index][1]);option3.setText                                       (options[index][2]);option4.setText(options[index][3]);
                    }
                    else {
                        Toast.makeText(MainActivity.this, "Your score is "+score, Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(MainActivity.this, "Restart the app to play again!", Toast.LENGTH_SHORT).show();
                }
            }

        });
        option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index <= questions.length-1){
                    if (answers[index].equals(options[index][3])) {
                        score++;
                    }
                    index++;
                    if (index< questions.length){
                        question.setText(questions[index]); option1.setText(options[index][0]);option2.setText(options[index][1]);option3.setText                                       (options[index][2]);option4.setText(options[index][3]);
                    }
                    else {
                        Toast.makeText(MainActivity.this, "Your score is "+score, Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(MainActivity.this, "Restart the app to play again!", Toast.LENGTH_SHORT).show();
                }
            }

        });
    }
}