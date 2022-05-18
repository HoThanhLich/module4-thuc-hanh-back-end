package com.codegym.backend.service;

import java.util.Optional;

public interface IGeneralService<T> {
    Iterable<T> getAll();

    Optional<T> findById(Long id);

    T save(T t);

    void remove(Long id);
}
