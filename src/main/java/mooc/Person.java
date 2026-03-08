package mooc;

public class Person
{
    private String name;
    public Person(String name)
    {
        if (null == name)
            throw new IllegalArgumentException("name is null");
        this.name = name;
    }
    
       
    public String getName() { return name;  }
    
    @Override
    public String toString() { return "Student: " + getName(); }

}
