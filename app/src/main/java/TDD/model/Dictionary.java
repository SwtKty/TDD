package TDD.model;

import java.util.HashMap;
import java.util.Map;

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

    Map<String, String> translations = new HashMap<>();

    public String addTranslation (String mot1, String mot2){
        this.mot2=mot2;
        this.mot1=mot1;
        translations.put(mot1,mot2);
        return translations.get(mot1);
    }

    public String getTranslation (String mot1){
        return translations.get(mot1);
    }

}
