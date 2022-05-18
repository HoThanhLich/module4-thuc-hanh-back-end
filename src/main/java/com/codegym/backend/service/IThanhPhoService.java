package com.codegym.backend.service;

import com.codegym.backend.model.ThanhPho;

import java.util.Optional;

public interface IThanhPhoService {
    Iterable<ThanhPho> getAll();

    Optional<ThanhPho> findById(Long id);

    ThanhPho save(ThanhPho thanhPho);

    void remove(Long id);
}
