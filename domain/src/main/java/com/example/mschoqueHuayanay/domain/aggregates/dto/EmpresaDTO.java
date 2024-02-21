package com.example.mschoqueHuayanay.domain.aggregates.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmpresaDTO {

    private Long idEmpresa;
    private String numDoc;
    private String razonSocial;
    private String nomComercial;
    private Integer estado;
    private String usuaCreate;
    private Timestamp dateCreate;
    private String usuaModif;
    private Timestamp dateModif;
    private String usuaDelet;
    private Timestamp dateDelet;

}
