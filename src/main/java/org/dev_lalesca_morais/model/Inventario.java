package org.dev_lalesca_morais.model;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
@Table(name = "inventario")
public class Inventario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_inventario")
    private Long id;
    private String nome;
    private int quantidade;
    @ManyToOne
    @JoinColumn(name = "id_rebelde", referencedColumnName = "id_rebelde")
    private Rebelde rebelde;
}