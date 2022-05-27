package com.example.listapersonalizada_alura10

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import kotlinx.android.synthetic.main.item_produto.view.*

class ProdutosAdapter(private val contexto: Context, private val listaProduto: List<Produto>) :

    ArrayAdapter<Produto>(contexto, 0, listaProduto) {

    /* Para implementar esse Método, usa Atalho 'CTRL + O' */
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val layout = LayoutInflater.from(contexto).inflate(R.layout.item_produto, parent, false)
        val produtos = listaProduto[position]

        layout.txtVw_nomeProduto_itemProduto.text = produtos.nome
        layout.txtVw_precoProduto_itemProduto.text = "R$ ${produtos.preco}"
        layout.imgVw_produto_itemProduto.setImageResource(produtos.imagem)

        return layout

    }
}