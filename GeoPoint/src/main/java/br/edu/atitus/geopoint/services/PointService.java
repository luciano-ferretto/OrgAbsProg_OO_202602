package br.edu.atitus.geopoint.services;

import br.edu.atitus.geopoint.dtos.PointRequest;

import java.math.BigDecimal;

public class PointService {

    public void insert(PointRequest pointRequest) {
        if (pointRequest == null)
            throw new RuntimeException("Objeto Nulo");
        if (pointRequest.name() == null || pointRequest.name().isBlank())
            throw new RuntimeException("Nome inválido");
        if (pointRequest.latitude() == null
                || pointRequest.latitude().compareTo(BigDecimal.valueOf(-90)) < 0
                || pointRequest.latitude().compareTo(BigDecimal.valueOf(90)) > 0)
            throw new RuntimeException("Latitude inválida - Intervalo aceito: -90 a 90");
        //TODO fazer o restante das validações

        //TODO formatar campos necessários (trim())

        //TODO converter DTO em Entidade

        //TODO invocar camada de repositório
    }

}
