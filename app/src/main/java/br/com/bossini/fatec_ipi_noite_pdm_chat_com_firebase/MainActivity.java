package br.com.bossini.fatec_ipi_noite_pdm_chat_com_firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irParaCadastro (View v){
        startActivity(new Intent(this, NovoUsuarioActivity.class));
        Toast.makeText(this, "Versão final", Toast.LENGTH_SHORT).show();
    }

}
