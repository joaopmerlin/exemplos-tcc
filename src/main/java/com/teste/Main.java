package com.teste;

import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) {

        try {
            // instancia a classe
            Class<?> clazz = Class.forName("com.teste.Cliente");

            // verifica annotation
            if (clazz.getDeclaredAnnotation(TsModel.class) != null) {

                Model model = new Model();

                // nome da classe
                model.setNome(clazz.getSimpleName());

                // lista atributos
                for (Field field : clazz.getDeclaredFields()) {
                    if (field.getDeclaredAnnotation(TsIgnore.class) == null) {
                        Atribute atribute = new Atribute();
                        atribute.setNome(field.getName());
                        atribute.setTipo(Tipos.valueOf(field.getType().getSimpleName()).getTipoTs());
                        model.addAtribute(atribute);
                    }
                }

                System.out.println(model);

                // gera arquivo ts
                new Gerador(model);

            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
