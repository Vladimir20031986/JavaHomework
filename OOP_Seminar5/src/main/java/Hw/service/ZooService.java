package Hw.service;

import Hw.model.Animal;

import java.util.List;

public interface ZooService {
    void addAnimal(Animal animal, List allAnimals);
    void deleteAnimal(Animal animal, List allAnimals);
    void printAllAnimals(List allAnimals);
    void searchAnimal(String name, List allAnimals);
}
