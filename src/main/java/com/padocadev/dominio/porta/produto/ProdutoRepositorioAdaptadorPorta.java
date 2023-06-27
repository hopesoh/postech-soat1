package com.padocadev.dominio.porta.produto;

import com.padocadev.dominio.entidade.produto.Categoria;
import com.padocadev.dominio.entidade.produto.Produto;

import java.util.List;
import java.util.Optional;

public interface ProdutoRepositorioAdaptadorPorta {
    boolean existeProdutoComNome(String nome);

    Produto cria(Produto produto);

    Optional<Produto> buscaPorId(Long produtoId);

    Optional<Produto> buscaPorNome(String nome);

    void remover(Long produtoId);

    List<Produto> buscarPorCategoria(Categoria categoria);

    Produto edita(Long produtoId, Produto produtoParaEditar);
}
