package com.codegym.backend.service;

import com.codegym.backend.model.ThanhPho;
import com.codegym.backend.repository.IThanhPhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ThanhPhoService implements IThanhPhoService {

    @Autowired
    private IThanhPhoRepository thanhPhoRepository;

    @Override
    public Iterable<ThanhPho> getAll() {
        return thanhPhoRepository.findAll();
    }

    @Override
    public Optional<ThanhPho> findById(Long id) {
        return thanhPhoRepository.findById(id);
    }

    @Override
    public ThanhPho save(ThanhPho thanhPho) {
        return thanhPhoRepository.save(thanhPho);
    }

    @Override
    public void remove(Long id) {
        thanhPhoRepository.deleteById(id);
    }
}
