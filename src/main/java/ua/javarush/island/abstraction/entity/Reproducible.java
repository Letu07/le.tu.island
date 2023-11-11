package ua.javarush.island.abstraction.entity;

public interface Reproducible {
    Optional<T> reproduce(Area area);
}
