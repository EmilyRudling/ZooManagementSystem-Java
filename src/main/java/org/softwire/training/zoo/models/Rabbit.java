package org.softwire.training.zoo.models;

import java.text.MessageFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Rabbit extends AnimalThatCanBeGroomed implements SmallAnimal, CanBeGroomed {

    private LocalDateTime lastGroomed;

    public Rabbit(LocalDate dateOfBirth) {
        super(dateOfBirth);
    }

    @Override
    public void feed() {
        System.out.println("<Munch munch>");
        super.feed();
    }
}
