package org.softwire.training.zoo.models;

public class AnimalThatCanBeGroomed extends Animal {
    private LocalDateTime lastGroomed;

    public void groom() {
        lastGroomed = LocalDateTime.now();
    }

    public String toString() {
        return MessageFormat.format("{0}; Last Groomed {1}", super.toString(), lastGroomed);
    }
}