package br.edu.atitus.geopoint.dtos;

import java.math.BigDecimal;

public record PointRequest(
        String name,
        String description,
        BigDecimal latitude,
        BigDecimal longitude
) {
}
