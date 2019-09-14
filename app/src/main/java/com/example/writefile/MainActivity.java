package com.example.writefile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.xml.datatype.Duration;

    public class MainActivity extends AppCompatActivity {

        Button save;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            save = findViewById(R.id.save);

            String one = "Derek";
            String two = "Teddy";
            String three = "Alex";
            String four = "Lewis";
            String five = "Clive";
            String six = "Bryan";
            String seven = "Colin";
            String eight = "Anthony";
            String nine = "Jed";
            String ten = "Paul";

            int num1 = 29;
            int num2 = 44;
            int num3 = 43;
            int num4 = 53;
            int num6 = 62;
            int num5 = 34;
            int num7 = 56;
            int num8 = 34;
            int num9 = 25;
            int num10 = 32;

            PageOne client = new PageOne(one,two,three,four,five,six,seven,eight,nine,ten,
                    num1, num2, num3,num4, num5, num6, num7, num8, num9, num10);


            String result1 = client.getOne() + " " + client.getNum1();
            String result2 = client.getTwo() + " " + client.getNum2();
            String result3 = client.getThree() + " " + client.getNum3();
            String result4 = client.getFour() + " " + client.getNum4();
            String result5 = client.getFive() + " " + client.getNum5();
            String result6 = client.getSix() + " " + client.getNum6();
            String result7 = client.getSeven() + " " + client.getNum7();
            String result8 = client.getEight() + " " + client.getNum8();
            String result9 = client.getNine() + " " + client.getNum9();
            String result10 = client.getTen() + " " + client.getNum10();


            Log.d("result:", result1);
            Log.d("result:", result2);
            Log.d("result:", result3);
            Log.d("result:", result4);
            Log.d("result:", result5);
            Log.d("result:", result6);
            Log.d("result:", result7);
            Log.d("result:", result8);
            Log.d("result:", result9);
            Log.d("result:", result10);



            Log.d("Result",client.toString());

     //       writeToFile(result1, result2, result3, result4, result5, sample);

        }

        private void writeToFile(String result1,String result2,String result3,String result4, String result5, String filepath) {

            try {
                FileWriter sample1 = new FileWriter(filepath, true);
                BufferedWriter text = new BufferedWriter(sample1);
                PrintWriter output = new PrintWriter(text);
                output.println(result1 + result2 + result3 + result4 + result5);
                output.flush();
                output.close();

            } catch (IOException e) {
                e.printStackTrace();
            }



        }


       public void saveState(View view){

            String fileName = "outPut.csv";
            String entry = "dave" + "," + "Garry" + "," + "Karl";

            try{

                FileOutputStream out = openFileOutput(fileName,Context.MODE_APPEND);
                out.write(entry.getBytes());
                out.close();

            }catch(Exception e){

            }
       }


    }