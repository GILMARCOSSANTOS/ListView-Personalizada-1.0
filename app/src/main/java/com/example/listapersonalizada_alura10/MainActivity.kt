package com.example.listapersonalizada_alura10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val produtoCamera = Produto("Câmera", 150.00, "150 MPX", R.drawable.camera_alt_24)
        val produtoPc = Produto("Computador", 3550.75, "I5 7ª Geração", R.drawable.computer_24)
        val produtoMic = Produto("Microfone", 350.85, "Gravação para Estúdio", R.drawable.mic_24)

        val listaProduto = listOf(produtoCamera, produtoMic, produtoPc)
        val adapter = ProdutosAdapter(this, listaProduto)
        val listView = lstVw_itens_actvtMain

        listView.adapter = adapter
        listView.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this, ProdutosActvt::class.java)
            intent.putExtra("produto", listaProduto[position])
            startActivity(intent)
        }
    }
}