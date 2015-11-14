package ru.romanzes.dog;

public class DogTrainer {
    private Dog trainee;

    public void setTrainee(Dog dog) {
        trainee = dog;
    }

    public void trainBarking() {
        trainee.setVoice(trainee.getVoice().toUpperCase());
    }
}
