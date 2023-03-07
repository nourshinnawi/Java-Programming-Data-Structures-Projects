
package map;

public class student {
    private String firstName;
    private String lastName;
    private Integer ID;
    private String gradeLevel;
    private Integer age;
    
    public student(String firstName, String lastName,Integer ID, String gradeLevel, Integer age)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.gradeLevel = gradeLevel;
        this.age = age;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the ID
     */
    public Integer getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(Integer ID) {
        this.ID = ID;
    }

    /**
     * @return the gradeLevel
     */
    public String getGradeLevel() {
        return gradeLevel;
    }

    /**
     * @param gradeLevel the gradeLevel to set
     */
    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    /**
     * @return the age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(Integer age) {
        this.age = age;
    }
    
    
}
