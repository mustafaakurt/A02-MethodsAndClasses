package com.mustafakurt.methodsandclasses;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String username;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("on create called");
        testMethod();
        System.out.println(math(3,5));
        System.out.println(newMethod("Mustafa"));
        username = "";
        makeMusicians();
        makeSimpsons();
    }

    public void makeMusicians(){
        Musicians james = new Musicians("James",50,"Guitar");
        System.out.println(james.name);

    }

    public void makeSimpsons(){
        Simpsons homer = new Simpsons("Homer","Nuclear",20);
        homer.setAge(30);
        System.out.println(homer.getAge());
    }

    public void testMethod() {
        username = "Mustafa";
        int x = 4 +4;
        System.out.println("value of x : " + x);
    }
    public int math(int a, int v){
        username = "Mehmet";
        return a+v;
    }
    public String newMethod (String string){
        return string + "newMethod";
    }


    @Override
    protected void onResume() {
        super.onResume();
        username = "Ahmet";
        System.out.println("on resume called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("on pause called");
    }

    @Override
    protected void onStop() {
        super.onStop();

        System.out.println("on stop called");
    }
}