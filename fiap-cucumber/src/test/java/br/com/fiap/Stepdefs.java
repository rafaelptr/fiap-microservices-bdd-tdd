package br.com.fiap;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

// import cucumber.api.java.en.Given;
// import cucumber.api.java.en.Then;
// import cucumber.api.java.en.When;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
class Autenticacao {
    static String logarUsuario(String login, String pass) {
        if ( login.equals("usuario") & pass.equals("senha") ) {
            // Usuario autenticado
            return "Usuario autenticado";
        } else {
            // Visitante
            return "Visitante";
        }
    }
}
class Produtos {
    private HashMap<String, Integer> inventario = new HashMap<String, Integer>();
    public Produtos() {
        inventario.put("Prod 1", 3);
        inventario.put("Prod 2", 5);
        inventario.put("Prod 3", 2);
        inventario.put("Prod 4", 6);
    }
    String pesquisar (String prod) {
        if (inventario.get(prod) != null) {
            return "Produto disponivel";
        } else {
            return "Produto não disponivel";
        }
    }
    Integer estoque(String prod) {
        Integer estoque = inventario.get(prod);
        if (estoque != null) {
            return estoque;
        } else {
            return 0;
        }
    }
}

public class Stepdefs {
    @Dado("Que cliente {string} VISITA a pagina do site com a senha {string} como {string}")
    public void que_cliente_VISITA_a_pagina_do_site(String usuario, String senha, String tipoVisita) {
        // Visitante no site
        String tipoVisitante = Autenticacao.logarUsuario(usuario, senha);
        assertEquals(tipoVisitante, tipoVisita);
    }
    
    @Quando("O cliente pesquisa por um produto {string}")
    public void o_cliente_pesquisa_por_um_produto(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
    
    @Entao("Deve ser consultado o estoque do produto {string}")
    public void deve_ser_consultado_o_estoque_do_produto(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
    
    @Entao("Retornar a quantidade de Produtos {string} Disponiveis em estoque de cada loja: {string}")
    public void retornar_a_quantidade_de_Produtos_Disponiveis_em_estoque_de_cada_loja(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

}
