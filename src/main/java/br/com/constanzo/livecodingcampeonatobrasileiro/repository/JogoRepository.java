package br.com.constanzo.livecodingcampeonatobrasileiro.repository;

import br.com.constanzo.livecodingcampeonatobrasileiro.entity.Jogo;
import br.com.constanzo.livecodingcampeonatobrasileiro.entity.Time;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JogoRepository extends JpaRepository<Jogo, Integer> {
    List<Jogo> findByTime1AndEncerrado(Time time, Boolean encerrado);

    List<Jogo> findByTime2AndEncerrado(Time time, Boolean encerrado);
}
