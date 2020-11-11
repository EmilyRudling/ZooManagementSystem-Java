package org.softwire.training.zoo.models;

import java.text.MessageFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class GuineaFowl extends AbstractAnimal implements SmallAnimal {

    private LocalDateTime lastGroomed;

    public Rabbit(LocalDate dateOfBirth) {
        super(dateOfBirth);
    }

    @Override
    public void feed() {
        System.out.println("<Peck peck>");
        super.feed();
    }
}