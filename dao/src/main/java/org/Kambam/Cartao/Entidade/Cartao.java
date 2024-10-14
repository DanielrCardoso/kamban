package org.Kambam.Cartao.Entidade;

import lombok.Getter;
import lombok.Setter;

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
