package com.example.CadastroDeNinjas.Missoes.Model;

import com.example.CadastroDeNinjas.Utils.Dificuldade;
import com.example.CadastroDeNinjas.Ninjas.Models.NinjaModel;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "missao")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MissaoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "dificuldade", nullable = false)
    private Dificuldade dificuldade;

    @OneToMany(mappedBy = "missao")
    private List<NinjaModel> ninja;
}
