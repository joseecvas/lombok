package org.iesvdm.modelo;

import lombok.*;
@NonNull
@Builder //Constructor al gusto (cualquier combinación de atributos)
@AllArgsConstructor //Genera constructor von todos los atributos
@NoArgsConstructor  //Genera constructor vacío
@Data //getters, setters, equals, toString...
public class Person {
    private String nombre;
    private String apellidos;
    private String dni;
    private String telefono;
}