package com.example.CadastroDeNinjas.Missoes.Repository;

import com.example.CadastroDeNinjas.Missoes.Model.MissaoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissaoRepository extends JpaRepository<MissaoModel, Long> {
}
