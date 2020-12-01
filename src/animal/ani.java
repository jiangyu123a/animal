package animal;

import java.util.Objects;

public abstract class ani {
    private int age;
    private String xex;
    private String species;

    public ani() {
    }

    public ani(int age, String xex, String species) {
        this.age = age;
        this.xex = xex;
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getXex() {
        return xex;
    }

    public void setXex(String xex) {
        this.xex = xex;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return species + "的年龄为"
                + age +
                "性别为" + xex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ani ani = (ani) o;
        return age == ani.age &&
                Objects.equals(xex, ani.xex) &&
                Objects.equals(species, ani.species);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, xex, species);
    }

    public abstract void method();
}
