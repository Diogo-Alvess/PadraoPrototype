package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    @Test
    void testClone() throws CloneNotSupportedException {

        Produto produto = new Produto(
                1001,
                "Liquidificador Turbo X",
                new Especificacoes("Mallory", "Turbo 9000", "110v"),
                199.90
        );

        Produto produtoClone = produto.clone();
        produtoClone.setCodigo(2002);
        produtoClone.setNome("Liquidificador Turbo X 2");
        produtoClone.getEspecificacoes().setTensao("220v");

        assertEquals(
                "Produto{codigo=1001, nome='Liquidificador Turbo X', especificacoes=Especificacoes{fabricante='Mallory', modelo='Turbo 9000', tensao='110v'}, preco=199.9}",
                produto.toString()
        );

        assertEquals(
                "Produto{codigo=2002, nome='Liquidificador Turbo X 2', especificacoes=Especificacoes{fabricante='Mallory', modelo='Turbo 9000', tensao='220v'}, preco=199.9}",
                produtoClone.toString()
        );
    }
}
