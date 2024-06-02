package com.example.jogodamemoria

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.jogodamemoria.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var player = "p1"
    private lateinit var binding: ActivityMainBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)




        fun win() {
            //Vitorias do X
            if (binding.button1.text == "X" && binding.button2.text == "X" && binding.button3.text == "X") {
                binding.txtGanhador.text="X GANHOU A RODADA!"
            }
            if (binding.button4.text == "X" && binding.button5.text == "X" && binding.button6.text == "X") {
                binding.txtGanhador.text="X GANHOU A RODADA!"
            }
            if (binding.button7.text == "X" && binding.button8.text == "X" && binding.button9.text == "X") {
                binding.txtGanhador.text="X GANHOU A RODADA!"
            }
            if (binding.button1.text == "X" && binding.button4.text == "X" && binding.button7.text == "X") {
                binding.txtGanhador.text="X GANHOU A RODADA!"
            }
            if (binding.button2.text == "X" && binding.button5.text == "X" && binding.button8.text == "X") {
                binding.txtGanhador.text="X GANHOU A RODADA!"
            }
            if (binding.button3.text == "X" && binding.button6.text == "X" && binding.button9.text == "X") {
                binding.txtGanhador.text="X GANHOU A RODADA!"
            }
            if (binding.button1.text == "X" && binding.button5.text == "X" && binding.button9.text == "X") {
                binding.txtGanhador.text="X GANHOU A RODADA!"
            }
            if (binding.button3.text == "X" && binding.button5.text == "X" && binding.button7.text == "X") {
                binding.txtGanhador.text="X GANHOU A RODADA!"
            }

            //VITORIAS O
            if (binding.button1.text == "O" && binding.button2.text == "O" && binding.button3.text == "O") {
                binding.txtGanhador.text="O GANHOU A RODADA!"
            }
            if (binding.button4.text == "O" && binding.button5.text == "O" && binding.button6.text == "O") {
                binding.txtGanhador.text="O GANHOU A RODADA!"
            }
            if (binding.button7.text == "O" && binding.button8.text == "O" && binding.button9.text == "O") {
                binding.txtGanhador.text="O GANHOU A RODADA!"
            }
            if (binding.button1.text == "O" && binding.button4.text == "O" && binding.button7.text == "O") {
                binding.txtGanhador.text="O GANHOU A RODADA!"
            }
            if (binding.button2.text == "O" && binding.button5.text == "O" && binding.button8.text == "O") {
                binding.txtGanhador.text="O GANHOU A RODADA!"
            }
            if (binding.button3.text == "O" && binding.button6.text == "O" && binding.button9.text == "O") {
                binding.txtGanhador.text="O GANHOU A RODADA!"
            }
            if (binding.button1.text == "O" && binding.button5.text == "O" && binding.button9.text == "O") {
                binding.txtGanhador.text="O GANHOU A RODADA!"
            }
            if (binding.button3.text == "O" && binding.button5.text == "O" && binding.button7.text == "O") {
                binding.txtGanhador.text="O GANHOU A RODADA!"
            }
            if (binding.txtGanhador.text=="X GANHOU A RODADA" || binding.txtGanhador.text=="O GANHOU A RODADA!"){

            }

            //Funcao de resetar
        fun reset(){
            binding.button1.text=""
            binding.button2.text=""
            binding.button3.text=""
            binding.button4.text=""
            binding.button5.text=""
            binding.button6.text=""
            binding.button7.text=""
            binding.button8.text=""
            binding.button9.text=""
            binding.txtGanhador.text=""

        }
            //implementacao do resetar
            binding.btnReset.setOnClickListener{
                reset()

            }


        }

        binding.button1.setOnClickListener {
            if (binding.button1.text == "") {
                if (player == "p1") {
                    binding.button1.text = "X"
                    player = "p2"
                } else {
                    binding.button1.text = "O"
                    player = "p1"
                }
            }
            win()
        }
        binding.button2.setOnClickListener {
            if (binding.button2.text == "") {
                if (player == "p1") {
                    binding.button2.text = "X"
                    player = "p2"
                } else {
                    binding.button2.text = "O"
                    player = "p1"
                }
            }
            win()
        }
        binding.button3.setOnClickListener {
            if (binding.button3.text == "") {
                if (player == "p1") {
                    binding.button3.text = "X"
                    player = "p2"
                } else {
                    binding.button3.text = "O"
                    player = "p1"
                }
            }
            win()
        }
        binding.button4.setOnClickListener {
            if (binding.button4.text == "") {
                if (player == "p1") {
                    binding.button4.text = "X"
                    player = "p2"
                } else {
                    binding.button4.text = "O"
                    player = "p1"
                }
            }
            win()
        }
        binding.button5.setOnClickListener {
            if (binding.button5.text == "") {
                if (player == "p1") {
                    binding.button5.text = "X"
                    player = "p2"
                } else {
                    binding.button5.text = "O"
                    player = "p1"
                }
            }
            win()
        }
        binding.button6.setOnClickListener {
            if (binding.button6.text == "") {
                if (player == "p1") {
                    binding.button6.text = "X"
                    player = "p2"
                } else {
                    binding.button6.text = "O"
                    player = "p1"
                }
            }
            win()
        }
        binding.button7.setOnClickListener {
            if (binding.button7.text == "") {
                if (player == "p1") {
                    binding.button7.text = "X"
                    player = "p2"
                } else {
                    binding.button7.text = "O"
                    player = "p1"
                }
            }
            win()
        }
        binding.button8.setOnClickListener {
            if (binding.button8.text == "") {
                if (player == "p1") {
                    binding.button8.text = "X"
                    player = "p2"
                } else {
                    binding.button8.text = "O"
                    player = "p1"
                }
            }
            win()
        }
        binding.button9.setOnClickListener {
            if (binding.button9.text == "") {
                if (player == "p1") {
                    binding.button9.text = "X"
                    player = "p2"
                } else {
                    binding.button9.text = "O"
                    player = "p1"
                }
            }
            win()
        }

        fun toast(msg: String) {
            Toast.makeText(this@MainActivity, msg, Toast.LENGTH_SHORT).show()
        }

        binding.txtTitulo.text = "Jogo Da velha"



    }
}