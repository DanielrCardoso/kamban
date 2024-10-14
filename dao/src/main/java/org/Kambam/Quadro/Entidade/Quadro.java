package org.Kambam.Quadro.Entidade;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Quadro {
    @id
    private String codigo;
    @Column
    private String nome;
    @Column
    private String descricao;
    @Column
    private Integer Limite;
}
