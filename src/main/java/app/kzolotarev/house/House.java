package app.kzolotarev.house;

import app.kzolotarev.animals.Animal;

public class House {
    public Animal owner;

    public House(Animal animal) {
        this.owner = animal;
    }

    public String getOwnerName() {
        return owner.sayMyName();
    }
}
