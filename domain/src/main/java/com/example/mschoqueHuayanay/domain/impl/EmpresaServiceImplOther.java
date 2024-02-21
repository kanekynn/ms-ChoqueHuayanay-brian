package com.example.mschoqueHuayanay.domain.impl;

import com.example.mschoqueHuayanay.domain.aggregates.dto.EmpresaDTO;
import com.example.mschoqueHuayanay.domain.aggregates.request.RequestEmpresa;
import com.example.mschoqueHuayanay.domain.ports.in.EmpresaServiceIn;
import com.example.mschoqueHuayanay.domain.ports.out.EmpresaServiceOut;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class EmpresaServiceImplOther implements EmpresaServiceIn {

    @Autowired
    private EmpresaServiceOut empresaServiceOut;


    @Override
    public EmpresaDTO crearEmpresaIn(RequestEmpresa requestEmpresa) {
        return null;
    }

    @Override
    public Optional<EmpresaDTO> obtenerEmpresaIn(String numDoc) {
        return Optional.empty();
    }

    @Override
    public List<EmpresaDTO> obtenerTodosIn() {
        return null;
    }

    @Override
    public EmpresaDTO actualizarIn(Long id, RequestEmpresa requestEmpresa) {
        return empresaServiceOut.actualizarOut(id,requestEmpresa);
    }

    @Override
    public EmpresaDTO deleteIn(Long id) {
        return empresaServiceOut.deleteOut(id);
    }
}
