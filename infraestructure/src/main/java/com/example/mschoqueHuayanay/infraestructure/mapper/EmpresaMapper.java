package com.example.mschoqueHuayanay.infraestructure.mapper;


import com.example.mschoqueHuayanay.domain.aggregates.dto.EmpresaDTO;
import com.example.mschoqueHuayanay.infraestructure.entity.EmpresaEntity;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class EmpresaMapper {

    private static final ModelMapper modelMapper = new ModelMapper();

    public EmpresaDTO mapToDto(EmpresaEntity empresaEntity){
        return modelMapper.map(empresaEntity, EmpresaDTO.class);
    }

    public EmpresaEntity mapToEntity(EmpresaDTO empresaDTO){
        return modelMapper.map(empresaDTO, EmpresaEntity.class );
    }

}
