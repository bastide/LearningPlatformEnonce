package mooc;

public class Course
{
    private String label;
    private int volume;
    
    public Course(String name, int hours)
    {
        if (null == name)
            throw new IllegalArgumentException("name is null");
        if (hours <= 0)
            throw new IllegalArgumentException("hours is negative");
        this.label = name;
        this.volume = hours;
    }
    
    public String getLabel() { return label;  }
    
    public int getVolume() { return volume; }
    
    @Override
    public String toString() { return "Course: " + getLabel(); }

}
