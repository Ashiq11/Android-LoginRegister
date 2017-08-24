package ca.synergyforce.ashiq.loginregister;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText editTextName = (EditText) findViewById(R.id.editTextName);
        final EditText editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        final EditText editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        final EditText editTextConfirmPassword = (EditText) findViewById(R.id.editTextConfirmPassword);
        final EditText editTextAge = (EditText) findViewById(R.id.editTextAge);
        final EditText editTextPhone = (EditText) findViewById(R.id.editTextPhone);
        final EditText editTextAddress = (EditText) findViewById(R.id.editTextAddress);
        final Button buttonSignUp = (Button) findViewById(R.id.buttonSignUp);
        final TextView textViewAlreadyRegister = (TextView) findViewById(R.id.textViewAlreadyRegister);

        textViewAlreadyRegister.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent loginIntent = new Intent(RegisterActivity.this,LoginActivity.class);
                RegisterActivity.this.startActivity(loginIntent);

            }
        });

    }
}
