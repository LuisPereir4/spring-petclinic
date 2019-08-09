package org.springframework.samples.petclinic.product;

public class Product {

    private String name;
    private String skill;

    public Product(String name, String description) {
        this.name = name;
        this.skill = description;
    }

    public String getName() {
        return name;
    }

    public String getSkill() {
        return skill;
    }
}
