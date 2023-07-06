package com.padocadev.aplicacao.resposta.produto;

import com.padocadev.dominio.entidade.produto.Categoria;
import com.padocadev.dominio.entidade.produto.Produto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public record ProdutoResposta(Long id, String nome, Categoria categoria, BigDecimal preco, LocalDateTime dataCadastro) {

    public static ProdutoResposta deProduto(Produto produto) {
        return new ProdutoResposta(produto.getId(), produto.getNome(), produto.getCategoria(), produto.getPreco(), produto.getDataCadastro());
    }
    public static List<ProdutoResposta> deProduto(List<Produto> produtos) {
        return produtos.stream().map(ProdutoResposta::deProduto).toList();
    }
}