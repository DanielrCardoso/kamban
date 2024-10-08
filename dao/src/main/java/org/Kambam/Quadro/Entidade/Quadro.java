package org.Kambam.Quadro.Entidade;

@Entity
@Getter
@Setter
public class Quadro {
    @id
    private string codigo;
    @Column
    private streing nome;
    @Column
    private string descricao;
    @Column
    private int Limite;
}
