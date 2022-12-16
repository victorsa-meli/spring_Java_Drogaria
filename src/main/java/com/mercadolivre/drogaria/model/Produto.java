package com.mercadolivre.drogaria.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.math.BigDecimal;




@Entity
@Table(name = "tb_produtos")
public class Produto {


    // ATRIBUTOS

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "O meu querido, produto sem nome? pode isso arnaldo ? ")
    @Size(min = 4, max = 20, message = "O irmaozinho voce precisa digita um nome de 4 a 20 caracteres, se nao eu nao vou fazer nada.")
    private String nome;


    @NotNull(message = "Voce precisa me dizer, se este produto requer receita medica ou nao.")
    @Size(min = 1, max = 4, message = "Irmaozinho este produto requer receita digite Sim ou Nao.")
    private String Receita;

    @NotNull(message = "Voce precisa me dizer, o tipo de uso que esse produto tem")
    private String tipoUso;

    @NotNull(message = "Digite um tipo, pois preciso saber se este produto e generico ou nao.")
    private String tipo;

    @NotNull(message = "Voce precisa me informar qual e a(o) fabricante deste produto.")
    private String fabricante;


    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @NotNull(message = "IRMAOZINHO !!! PELO AMOR DE DEUS..COMO VC VAI CADASTRAR UM PRODUTO SEM PREÇO")
    @Positive(message = "AAAAAaaaaa ai nao ne digite por gentileza um valor maior que 0")
    private BigDecimal preco;



    private int quantidade;


    // RELACIONAMENTO MANY > ONE

    @ManyToOne
    @JsonIgnoreProperties("produtos")
    private Categoria categoria;


    // GETTERS AND SETTERS


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getReceita() {
        return Receita;
    }

    public void setReceita(String receita) {
        Receita = receita;
    }

    public String getTipoUso() {
        return tipoUso;
    }

    public void setTipoUso(String tipoUso) {
        this.tipoUso = tipoUso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}