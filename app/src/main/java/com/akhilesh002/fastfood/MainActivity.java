package com.akhilesh002.fastfood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox tea;
    private CheckBox coffee;
    private CheckBox coldCoffee;
    private CheckBox burger;
    private CheckBox pizza;
    private Button order;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tea = findViewById(R.id.tea);
        coffee = findViewById(R.id.coffee);
        coldCoffee = findViewById(R.id.cold_coffee);
        burger = findViewById(R.id.burger);
        pizza = findViewById(R.id.pizza);
        order = findViewById(R.id.order);

        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int totalAmount=0;
                StringBuilder result=new StringBuilder();
                result.append("Selected Items:");
                if (tea.isChecked()){
                    result.append("\nTea 40Rs");
                    totalAmount += 40;
                }
                if(coffee.isChecked()){
                    result.append("\nCoffee 50Rs");
                    totalAmount+=50;
                }
                if(coldCoffee.isChecked()){
                    result.append("\nCold Coffee 80Rs");
                    totalAmount+=80;
                }
                if(burger.isChecked()){
                    result.append("\nBurger 100Rs");
                    totalAmount+=100;
                }
                if(pizza.isChecked()){
                    result.append("\nPizza 130Rs");
                    totalAmount+=130;
                }
                result.append("\nTotal: "+totalAmount+" Rs");
                //Displaying the message on the toast
                Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();


            }
        });
    }
}
