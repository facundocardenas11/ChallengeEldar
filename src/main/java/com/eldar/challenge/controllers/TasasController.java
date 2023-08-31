package com.eldar.challenge.controllers;

import com.eldar.challenge.dtos.TasaDTO;
import com.eldar.challenge.service.CalculadoraTasa;
import com.eldar.challenge.service.Operacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TasasController {
    @Autowired
    private CalculadoraTasa calculadoraTasa;

    @GetMapping("/tasa")
    public ResponseEntity<TasaDTO> consultarTasa(@RequestBody Operacion operacion){
        double tasa = calculadoraTasa.calcularTasa(operacion.getTarjeta().getMarca());
        return ResponseEntity.ok(new TasaDTO(tasa));

}
}