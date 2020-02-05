package extension.domaine.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText login = findViewById(R.id.loginText);
                EditText password = findViewById(R.id.passwordText);

                if(login.getText().toString().toString().trim().length() == 0){
                    Toast.makeText(getApplicationContext(), "Pas de login spécifié", Toast.LENGTH_SHORT).show();
                    return;
                }

                if(password.getText().toString().trim().length() == 0){
                    Toast.makeText(getApplicationContext(), "Pas de mot de passe spécifié", Toast.LENGTH_SHORT).show();
                    return;
                }

                if(!login.getText().toString().equals("grj3360a")){
                    Toast.makeText(getApplicationContext(), "Login invalide", Toast.LENGTH_SHORT).show();
                    return;
                }

                if(!password.getText().toString().equals("mdp")){
                    Toast.makeText(getApplicationContext(), "Password invalide", Toast.LENGTH_SHORT).show();
                    return;
                }

                Intent in = new Intent(MainActivity.this, MenuPrincipal.class);
                startActivity(in);
            }
        });
    }
}
