package org.example.CompondoAula;
/**
 * Representa um produto para compra.
 * @author Gustavo da Silva
 * @version 1.0
 * */

public class Produto {
    private int id;
    private String nome;
    private double preco;

    public Produto(int id , String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * Aplica um desconto percentual no preço do produto
     * @param percetutal desconto a ser aplicado (0 - 100)
     * @return preço final após desconto
     * @throws IllegalArgumentException se o percentual for negativo ou maior que 100
     * */

    public double aplicarDesconto(double percetutal) {
        if(percetutal < 0 || percetutal > 100){

            throw new IllegalArgumentException("Percentual Invalido");
        }
        return preco - (preco * (percetutal / 100));
    }

    /**
     *  Calcular imposto sobre o preço do produto
     * @apiNote Esse método considera imposto federais fixos
     * @implSpec Deve ser usado apenas para cálculo estimado
     * @return valor do imposto calculado
     *  */
    public double calcularImposto(){
        return preco * 0.25;
    }

    /**
     *
     * @deprecated Use aplicarDesconto(double) no lugar
     * */

    public double descontoAntigo(){
        return preco * 0.09;
    }

}
