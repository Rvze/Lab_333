import java.util.ArrayList;
public abstract class Character {
    private String name;
    private TypeOfPerson type;

    public Character(String name, TypeOfPerson typeOfPerson) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    void changeTypeOfPerson(TypeOfPerson type) {
        TypeOfPerson prevType = TypeOfPerson.COLLECTOR;
        this.type = type;
        System.out.println(this.getName() + "changes type from " + prevType.toString() + " " + "to " + this.type.toString() + ".");
    }

    public TypeOfPerson getType() {
        return type;
    }
}