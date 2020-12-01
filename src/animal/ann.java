package animal;

import java.util.Objects;

public class ann extends ani implements Comparable<ann> {
    private String eat;

    public ann(String eat) {
        this.eat = eat;
    }

    public ann(int age, String xex, String species, String eat) {
        super(age, xex, species);
        this.eat = eat;
    }

    @Override
    public void method() {
        System.out.println(this.getSpecies() + "爱吃" + this.eat);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ann ann = (ann) o;
        return Objects.equals(eat, ann.eat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), eat);
    }


    @Override
    public int compareTo(ann o) {
        if (this.getAge() > ann.super.getAge()) {
            return 1;
        } else if (this.getAge() < ann.super.getAge()) {
            return -1;
        } else {
            return 0;
        }
    }
}
