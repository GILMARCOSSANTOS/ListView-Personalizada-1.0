package com.example.listapersonalizada_alura10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.produtos_actvt.*

class ProdutosActvt : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.produtos_actvt)

        val produto = intent.getSerializableExtra("produto") as Produto

        txtVw_nomeProduto_produtoActvt.text = produto.nome
        txtVw_precoProduto_produtoActvt.text = produto.preco.toString()
        txtVw_descricaoProduto_produtoActvt.text = produto.descricao
        imgVw_produto_itemProduto.setImageResource(produto.imagem)
    }
}