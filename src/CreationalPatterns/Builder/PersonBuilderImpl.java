package CreationalPatterns.Builder;

public class PersonBuilderImpl implements PersonBuilder{

    Person person =new Person();

    @Override
    public PersonBuilder setName(String name) {
        person.setName(name);
        return this;
    }

    @Override
    public PersonBuilder setAge(int age) {
        person.setAge(age);
        return this;
    }

    @Override
    public PersonBuilder setSalary(double salary) {
        person.setSalary(salary);
        return this;
    }

    @Override
    public Person build() {
        return person;
    }

    @Override
    public String toString() {
        return "PersonBuilderImpl{" +
                "person=" + person +
                '}';
    }
}
