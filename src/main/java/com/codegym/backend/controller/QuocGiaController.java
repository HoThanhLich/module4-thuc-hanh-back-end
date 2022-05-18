package com.codegym.backend.controller;

import com.codegym.backend.model.QuocGia;
import com.codegym.backend.service.quocgia.IQuocGiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/quocgia")
public class QuocGiaController {

    @Autowired
    private IQuocGiaService quocGiaService;

    @GetMapping
    public ResponseEntity<Iterable<QuocGia>> getAll() {
        return new ResponseEntity<>(quocGiaService.getAll(), HttpStatus.OK);
    }
}
