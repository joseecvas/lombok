package org.iesvdm.modelo.Ejer3.Util;

import org.iesvdm.modelo.Ejer3.Clases.Agenda;
import org.iesvdm.modelo.Ejer3.Clases.Tarea;

import java.util.ArrayList;
import java.util.List;

public class CargadorContexto {
    public static List<Tarea> cargaContextoTareas(){
        org.iesvdm.modelo.Ejer3.Anotaciones.Tarea[] tareaAnnotations = Agenda.class.getAnnotationsByType(org.iesvdm.modelo.Ejer3.Anotaciones.Tarea.class);
        List<Tarea> tareas = new ArrayList<Tarea>();
        for (org.iesvdm.modelo.Ejer3.Anotaciones.Tarea tareaAnnotation : tareaAnnotations){
            tareas.add(Tarea.builder().titulo(tareaAnnotation.titulo()).descripcion(tareaAnnotation.descripcion()).hora(tareaAnnotation.hora()).diaSemana(tareaAnnotation.diaSemana()).build());
        }
        return tareas;
    }
}
