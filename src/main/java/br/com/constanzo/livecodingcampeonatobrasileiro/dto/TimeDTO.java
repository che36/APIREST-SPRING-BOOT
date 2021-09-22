package br.com.constanzo.livecodingcampeonatobrasileiro.dto;

import lombok.Data;

import javax.persistence.Column;

@Data
public class TimeDTO {
    private Integer id;
    private String nome;
    private String sigla;
}
