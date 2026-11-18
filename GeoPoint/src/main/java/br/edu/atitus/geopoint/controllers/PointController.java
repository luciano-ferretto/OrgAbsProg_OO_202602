package br.edu.atitus.geopoint.controllers;

import br.edu.atitus.geopoint.dtos.PointRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/points")
@CrossOrigin(origins = "*")
public class PointController {

    @PostMapping
    public ResponseEntity<String> insertPoint(
           @RequestBody PointRequest pointRequest) {
        //TODO invocar camada service
        return ResponseEntity.status(201).body(pointRequest.name());
    }
}
