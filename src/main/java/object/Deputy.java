package object;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode

public class Deputy {
    private String firstName;
    private String lastName;
    private int age;
    private boolean bribe;
    private int sumOfBribe;


    public Deputy() {

    }

    @Override
    public String toString() {
        return "Deputy{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", bribe=" + bribe +
                ", sumOfBribe=" + sumOfBribe +
                '}'+"\n;";
    }
}
