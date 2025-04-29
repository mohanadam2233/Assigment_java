package Assigment_ca2213;

public class Staff_Model {
    private Long id;
    private String name;
    private String position;

    // No-argument constructor
    public Staff_Model() {
    }

    // All-argument constructor
    public Staff_Model(Long id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
