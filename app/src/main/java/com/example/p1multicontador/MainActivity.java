package com.example.p1multicontador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.p1multicontador.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    int contadorTotal;
    int[] contador = new int[4];
    TextView[] textContador;
    Button[]    buttonContador;
    Button[] buttonReset;
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        textContador = new TextView[]{binding.contador1, binding.contador2, binding.contador3, binding.contador4};
        buttonContador = new Button[]{binding.aumentar1, binding.aumentar2, binding.aumentar3, binding.aumentar4};
        buttonReset = new Button[]{binding.reset1,binding.reset2,binding.reset3,binding.reset4};

        for (int i = 0; i < 4; i++) {
            final int ii = i;
            buttonContador[ii].setOnClickListener(v -> {sumarAlcontador(ii);});
            buttonReset[ii].setOnClickListener(v -> {reset(ii);});
            binding.resetTotal.setOnClickListener(v -> {resetTodo(ii);});
        }
    }

    void sumarAlcontador(int i){
        contador[i]++;
        contadorTotal++;
        textContador[i].setText(String.valueOf(contador[i]));
        binding.contadorTotal.setText(String.valueOf(contadorTotal));
    }

    void reset(int i){
        contadorTotal = contadorTotal - contador[i];
        binding.contadorTotal.setText(String.valueOf(contadorTotal));
        contador[i] = 0;
        textContador[i].setText(String.valueOf(contador[i]));
    }

    public void resetTodo(int i){
        for (int j = 0; j < 4; j++) {
            final int finalJ = j;
            reset(j);
        }
    }
}