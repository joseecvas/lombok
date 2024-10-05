package org.iesvdm.modelo;

public class Main {
    public static void main(String[] args) {
        Person persona = new Person();
        persona.setNombre("Persona");
        persona.setApellidos("guapa");
        System.out.println(persona);
        Person yo = Person.builder()
                .nombre("Jose")
                .apellidos("Cuevas")
                .build();
    }
}
