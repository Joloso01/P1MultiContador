package com.example.p1multicontador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.p1multicontador.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    int contadorTotal, contador1, contador2, contador3, contador4;
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


    }
    public void aumentarContador(View view){
        if (view.getId() == binding.aumentar1.getId()){
            contadorTotal++;
            contador1++;
            binding.contador1.setText(String.valueOf(contador1));
            binding.contadorTotal.setText(String.valueOf(contadorTotal));
        }else if (view.getId() == binding.aumentar2.getId()){
            contadorTotal++;
            contador2++;
            binding.contador2.setText(String.valueOf(contador2));
            binding.contadorTotal.setText(String.valueOf(contadorTotal));
        }else if (view.getId() == binding.aumentar3.getId()){
            contadorTotal++;
            contador3++;
            binding.contador3.setText(String.valueOf(contador3));
            binding.contadorTotal.setText(String.valueOf(contadorTotal));
        }else if (view.getId() == binding.aumentar4.getId()){
            contadorTotal++;
            contador4++;
            binding.contador4.setText(String.valueOf(contador4));
            binding.contadorTotal.setText(String.valueOf(contadorTotal));
        }else {
            Toast.makeText(this, "Boton no valido",Toast.LENGTH_LONG);
        }
    }

    public void borrarContador(View view){
        if (view.getId() == binding.reset1.getId()){
            contadorTotal = contadorTotal - contador1;
            binding.contadorTotal.setText(String.valueOf(contadorTotal));
            contador1 = 0;
            binding.contador1.setText(String.valueOf(contador1));
        }else if (view.getId() == binding.reset2.getId()){
            contadorTotal = contadorTotal - contador2;
            binding.contadorTotal.setText(String.valueOf(contadorTotal));
            contador2 = 0;
            binding.contador2.setText(String.valueOf(contador2));
        }else if (view.getId() == binding.reset3.getId()){
            contadorTotal = contadorTotal - contador3;
            binding.contadorTotal.setText(String.valueOf(contadorTotal));
            contador3 = 0;
            binding.contador3.setText(String.valueOf(contador3));
        }else if (view.getId() == binding.reset4.getId()){
            contadorTotal = contadorTotal - contador4;
            binding.contadorTotal.setText(String.valueOf(contadorTotal));
            contador4 = 0;
            binding.contador4.setText(String.valueOf(contador4));
        }else {
            Toast.makeText(this, "Boton no valido",Toast.LENGTH_LONG);
        }
    }

    public void resetTodo(View view){
        contadorTotal=0;
        binding.contadorTotal.setText(String.valueOf(contadorTotal));
        contador1=0;
        binding.contador1.setText(String.valueOf(contador1));
        contador2=0;
        binding.contador2.setText(String.valueOf(contador2));
        contador3=0;
        binding.contador3.setText(String.valueOf(contador3));
        contador4=0;
        binding.contador4.setText(String.valueOf(contador4));
    }
}