package org.Kambam.Cartao.Entidade;

@Entity
@Getter
@Setter
public class Cartao {
    @id
    private String codigo;
    @Column
    private String nome;
    @Column
    private String descricao;
    @Column
    private String coluna;
}
