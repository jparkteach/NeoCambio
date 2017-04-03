package net.jptechnology.android.neocambio;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button(View view) {
        Intent i = new Intent(this, SignUp.class);
        startActivity(i);
    }

    public void buy1(View view) {
        Intent i = new Intent(this, PurchaseActivity.class);
        startActivity(i);
    }

    public void buy2(View view) {
        Intent i = new Intent(this, PurchaseActivity.class);
        startActivity(i);
    }

    public void buy3(View view) {
        Intent i = new Intent(this, PurchaseActivity.class);
        startActivity(i);
    }

    public void buy4(View view) {
        Intent i = new Intent(this, PurchaseActivity.class);
        startActivity(i);
    }

    public void buy5(View view) {
        Intent i = new Intent(this, PurchaseActivity.class);
        startActivity(i);
    }

    public void buy6(View view) {
        Intent i = new Intent(this, PurchaseActivity.class);
        startActivity(i);
    }
}
