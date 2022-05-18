package com.codegym.backend.service.quocgia;

import com.codegym.backend.model.QuocGia;
import com.codegym.backend.repository.IQuocGiaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class QuocGiaService implements IQuocGiaService{

    @Autowired
    private IQuocGiaRepo quocGiaRepo;

    @Override
    public Iterable<QuocGia> getAll() {
        return quocGiaRepo.findAll();
    }

    @Override
    public Optional<QuocGia> findById(Long id) {
        return quocGiaRepo.findById(id);
    }

    @Override
    public QuocGia save(QuocGia quocGia) {
        return quocGiaRepo.save(quocGia);
    }

    @Override
    public void remove(Long id) {
        quocGiaRepo.deleteById(id);
    }
}
