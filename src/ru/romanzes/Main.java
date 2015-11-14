package ru.romanzes;

import ru.romanzes.dog.Dog;
import ru.romanzes.dog.DogTrainer;

public class Main {

    public static void main(String[] args) {
        // Concrete component
        Dog dog = new Dog();

        // Decorator
        Dog mimic = new DogDecorator(new Dog());

        // A class from the same package as Dog exploiting its hidden method
        DogTrainer trainer = new DogTrainer();

        trainer.setTrainee(dog);
        trainer.trainBarking();
        dog.bark(); // output: "BARK!"

        trainer.setTrainee(mimic);
        trainer.trainBarking();
        mimic.bark(); // output: "bark!", as without training
    }
}
