package br.com.etecia.myhotel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtUsuario, edtSenha;
    Button btnEntrar, btnSair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtSenha = findViewById(R.id.edtSenha);
        edtUsuario = findViewById(R.id.edtUsuario);
        btnEntrar = findViewById(R.id.btnEntrar);
        btnSair = findViewById(R.id.btnSair);

        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String usuario, senha;

                usuario = edtUsuario.getText().toString();
                senha = edtSenha.getText().toString();

                if (usuario.equals("etecia") && senha.equals("etecia")) {
                    //abrimos a janela MenuPrincipal
                    startActivity(new Intent(getApplicationContext(),
                            MenuPrincipalActivity.class));
                    finish();

                } else {
                    Toast.makeText(getApplicationContext(),
                            "Usuário ou senha inválidos!!!",
                            Toast.LENGTH_SHORT).show();
                    edtUsuario.setText("");
                    edtSenha.setText("");
                    edtUsuario.requestFocus();
                }

    }
}
    }