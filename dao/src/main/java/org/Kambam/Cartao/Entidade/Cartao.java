package org.Kambam.Cartao.Entidade;

@Entity
@Getter
@Setter
public class Cartao {
    @id
    private string codigo;
    @Column
    private string nome;
    @Column
    private string descricao;
    @Column
    private int coluna;
}
