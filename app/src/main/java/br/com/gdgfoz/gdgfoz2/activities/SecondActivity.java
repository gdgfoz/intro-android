package br.com.gdgfoz.gdgfoz2.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import br.com.gdgfoz.gdgfoz2.R;
import br.com.gdgfoz.gdgfoz2.models.Pessoa;


public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);

        TextView name = (TextView) findViewById(R.id.txt_name);
        TextView email = (TextView) findViewById(R.id.txt_email);

        Bundle data = getIntent().getExtras();

        Pessoa pessoa = (Pessoa) data.get("pessoa");

        Log.d("h2", pessoa.getEmail());
        name.setText(pessoa.getName());
        email.setText(pessoa.getEmail());

    }
}
