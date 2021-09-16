package TDD.model;

public class Dictionary {
    private String name;

    public Dictionary(String name) {
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public String isEmpty(){
        if(name == null){
            return "Empty";
        }
        else {
            return "notEmpty";
        }
    }
}
