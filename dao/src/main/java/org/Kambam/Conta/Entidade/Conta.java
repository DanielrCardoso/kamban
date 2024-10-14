package org.Kambam.Conta.Entidade;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Conta {
    @id
    private String email;
    @Column
    private String nome;
    @Column
    private String senha;
}
