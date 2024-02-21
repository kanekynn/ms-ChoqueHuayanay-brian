package com.example.mschoqueHuayanay.infraestructure.repository;

import com.example.mschoqueHuayanay.infraestructure.entity.TipoEmpresaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface TipoEmpresaRepository extends JpaRepository<TipoEmpresaEntity,Long> {
    TipoEmpresaEntity findByCodTipo(@Param("x") String codTipo);
}
