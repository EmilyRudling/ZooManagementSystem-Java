package org.softwire.training.zoo.models;

import java.text.MessageFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Zebra extends AnimalThatCanBeGroomed implements LargeAnimal, CanBeGroomed {

    private LocalDateTime lastGroomed;

    public Zebra(LocalDate dateOfBirth) {
        super(dateOfBirth);
    }
}
