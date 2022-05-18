package com.codegym.backend.repository;

import com.codegym.backend.model.QuocGia;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IQuocGiaRepo extends CrudRepository<QuocGia, Long> {
}
