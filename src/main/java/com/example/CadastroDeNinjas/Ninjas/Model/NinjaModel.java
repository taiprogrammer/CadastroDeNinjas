package com.example.CadastroDeNinjas.Ninjas.Model;

import com.example.CadastroDeNinjas.Missoes.Model.MissaoModel;
import jakarta.persistence.*;
import lombok.*;

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

    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "idade", nullable = false)
    private int idade;

    @ManyToOne
    @JoinColumn(name = "missao_id")
    private MissaoModel missao;
}
