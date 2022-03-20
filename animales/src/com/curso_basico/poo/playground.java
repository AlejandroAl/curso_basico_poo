package com.curso_basico.poo;

import com.curso_basico.poo.animales.Animal;
import com.curso_basico.poo.animales.TestAnimalExample;

public class playground {
    public static void main(String[] args) {
        TestAnimalExample testAnimal = new TestAnimalExample();
        executeAllActionFromAnimal(testAnimal);

    }

    public static void executeAllActionFromAnimal(Animal animal) {
        animal.born();
        animal.grow();
        animal.eat();
        animal.dead();
    }
}
