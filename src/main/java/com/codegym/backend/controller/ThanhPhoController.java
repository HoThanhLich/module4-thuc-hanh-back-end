package com.codegym.backend.controller;

import com.codegym.backend.model.ThanhPho;
import com.codegym.backend.service.thanhpho.IThanhPhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/thanhpho")
public class ThanhPhoController {
    @Autowired
    private IThanhPhoService thanhPhoService;

    @GetMapping
    public ResponseEntity<Iterable<ThanhPho>> getAll() {
        Iterable<ThanhPho> danhSachThanhPho = thanhPhoService.getAll();
        return new ResponseEntity<>(danhSachThanhPho, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ThanhPho> findById(@PathVariable Long id) {
        Optional<ThanhPho> thanhPhoOptional = thanhPhoService.findById(id);
        if (!thanhPhoOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(thanhPhoOptional.get(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ThanhPho> save(@RequestBody ThanhPho thanhPho) {
        thanhPhoService.save(thanhPho);
        return new ResponseEntity<>(thanhPho, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ThanhPho> update(@PathVariable Long id, @RequestBody ThanhPho thanhPho) {
        Optional<ThanhPho> thanhPhoOptional = thanhPhoService.findById(id);
        if (!thanhPhoOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        ThanhPho thanhPhoMoi = new ThanhPho(id, thanhPho.getTen(), thanhPho.getDienTich(), thanhPho.getDanSo(),
                thanhPho.getGDP(), thanhPho.getMoTa(), thanhPho.getQuocGia());
        thanhPhoService.save(thanhPhoMoi);
        return new ResponseEntity<>(thanhPhoMoi,HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        thanhPhoService.remove(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}