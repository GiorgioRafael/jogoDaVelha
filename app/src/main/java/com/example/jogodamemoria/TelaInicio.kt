package com.example.jogodamemoria

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.annotation.SuppressLint
import android.text.TextUtils
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import com.example.jogodamemoria.databinding.ActivityMainBinding
import com.example.jogodamemoria.databinding.ActivityTelaInicioBinding

class TelaInicio : AppCompatActivity() {
    private lateinit var binding: ActivityTelaInicioBinding
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTelaInicioBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)



        fun mudarTela2(){
            val tela2 = Intent(this, MainActivity::class.java)
            startActivity(tela2)
        }

        binding.btncomecar.setOnClickListener{
            if(binding.edtP1.text.toString().isEmpty() || binding.edtP2.text.toString().isEmpty()){
                Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show()
            }else{
            mudarTela2()
            }
        }

    }
}