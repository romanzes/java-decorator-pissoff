package ru.romanzes;

import ru.romanzes.dog.Dog;

public class DogDecorator extends Dog {
    private Dog wrapped;

    public DogDecorator(Dog dog) {
        wrapped = dog;
    }

    @Override
    public String getVoice() {
        return wrapped.getVoice();
    }

    @Override
    public void bark() {
        wrapped.bark();
    }
}
