package com.example.mschoqueHuayanay.infraestructure.repository;

import com.example.mschoqueHuayanay.infraestructure.entity.EmpresaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmpresaRepository extends JpaRepository<EmpresaEntity,Long> {

    EmpresaEntity findByNumDocu(@Param("numDocu") String numDocu);
    List<EmpresaEntity> findByEstado(@Param("estado") Integer estado);

}
