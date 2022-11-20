package domain.service;

import java.util.ArrayList;
import java.util.Random;

import domain.model.Animal;

public class AnimalService {

    private ArrayList<Animal> animals = new ArrayList<>();

    public AnimalService() {
        this.add(new Animal("Witje", "Kat", 3));
        this.add(new Animal("Zwartje", "Konijn", 1));
        this.add(new Animal("Blub", "Vis", 2));
    }

    public void add(Animal animal) {
        animals.add(animal);
    }
    public ArrayList<Animal> getAll() {
        return animals;
    }

    public Animal getRandom () {
        Random rand = new Random();
        int randomInt = rand.nextInt(animals.size());
        return animals.get(randomInt);
    }

}
