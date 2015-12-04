package br.com.gdgfoz.gdgfoz2.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

import br.com.gdgfoz.gdgfoz2.R;
import br.com.gdgfoz.gdgfoz2.models.Pessoa;


public class MainActivity extends AppCompatActivity {

    EditText name = null;
    EditText email;
    Pessoa pessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.myToolbar);
        myToolbar.setTitle(getString(R.string.app_name));

        setSupportActionBar(myToolbar);

        name = (EditText) findViewById(R.id.edt_name);
        email = (EditText) findViewById(R.id.edt_email);
        Button send = (Button) findViewById(R.id.btn_send);

        pessoa = new Pessoa();

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               sendActivity();
            }
        });
    }

    private void sendActivity() {

        pessoa.setName(name.getText().toString());
        pessoa.setEmail(email.getText().toString());

        Intent mIntent = new Intent(getApplicationContext(), SecondActivity.class);

        Bundle bundle = new Bundle();

        bundle.putSerializable("pessoa", pessoa);

        mIntent.putExtras(bundle);

        startActivity(mIntent);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.click) {
            sendActivity();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
