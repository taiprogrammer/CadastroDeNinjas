package com.example.CadastroDeNinjas.Ninjas;

import com.example.CadastroDeNinjas.Missoes.MissaoModel;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "ninja")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "idade", nullable = false)
    private int idade;

    @ManyToOne
    @JoinColumn(name = "missao_id")
    private MissaoModel missao;
}
