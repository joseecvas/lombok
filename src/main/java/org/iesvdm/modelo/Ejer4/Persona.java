package org.iesvdm.modelo.Ejer4;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.Value;


@Data //Genera automáticamente un constructor con los atributos de la clase, getters y setters para cada atributo y los métodos equals, toString y HashCode.
@Builder //Permite crear instancias de objetos de forma encadenada (haciéndolo fluido y fácil), además de poder elegir los atributos que se proporcionan a cada instancia.
@Value //Esta notación hace que los atributos sean final, es decir, no se pueden modificar una vez instanciado el objeto. Se genera un constructor con todos los atributos, así como getters y métodos toString y HashCode (no hay setters, pues la clase es inmutable.)
public class Persona {
    @NonNull
    private String nombre;
    private int edad;
}
