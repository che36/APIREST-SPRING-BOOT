package br.com.constanzo.livecodingcampeonatobrasileiro.repository;

import br.com.constanzo.livecodingcampeonatobrasileiro.entity.Time;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface TimeRepository extends JpaRepository<Time, Integer> {
    List<Time> findByNomeIgnoreCaseAndIdNot(String nome, Integer id);
}
