package ca.synergyforce.ashiq.loginregister;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText editTextUserName= (EditText) findViewById(R.id.editTextUserName);
        final EditText editTextPassword= (EditText) findViewById(R.id.editTextPassword);
        final Button buttonLogin= (Button) findViewById(R.id.buttonLogin);
        final TextView textViewRegisterHere = (TextView) findViewById(R.id.textViewRegisterHere);

        textViewRegisterHere.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(LoginActivity.this,RegisterActivity.class);
                LoginActivity.this.startActivity(registerIntent);
            }
        });
    }
}
