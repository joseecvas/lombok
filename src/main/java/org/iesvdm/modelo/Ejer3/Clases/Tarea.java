package org.iesvdm.modelo.Ejer3.Clases;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Builder
@Data
public class Tarea {
    @NonNull
    private String titulo;
    private String descripcion;
    private String diaSemana;
    private String hora;
}
