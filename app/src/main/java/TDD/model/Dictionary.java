package TDD.model;

public class Dictionary {
    private String name;
    private String mot1, mot2;

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

    public String addTranslation (String mot1, String mot2){
        this.mot2=mot2;
        return mot2;
    }

    public String getTranslation (String mot1){
        return mot2;
    }
}
