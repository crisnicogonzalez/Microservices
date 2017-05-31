package es.kita.model;

public class Student {
    private String padron;
    private String name;
    private String email;


    public Student(String padron, String name, String email) {
        super();
        this.padron = padron;
        this.name = name;
        this.email = email;
    }

    /**
     * @return the padron
     */
    public String getpadron() {
        return padron;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email){
      this.email = email;

    }

    public void setpadron(String padron) {
        this.padron = padron;
    }

    public String getName(){
      return this.name;
    }

    public String getEmail(){
      return this.email;
    }
}