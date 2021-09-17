package TDD.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dictionary {
    private String name;
    private String mot1, mot2, mot3;

    Map<String, List<String>> translations = new HashMap<String, List<String>>();

    Map<String, List<String>> multiTranslations = new HashMap<String, List<String>>();
    List<String> values = new ArrayList<String>();


    public Dictionary(String name) {
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public String isEmpty(){

        if(translations.size() == 0){
            return "Empty";
        }
        else {
            return "notEmpty";
        }
    }


    public List<String> addTranslation (String mot1, String mot2, String mot3){
        this.mot2=mot2;
        this.mot1=mot1;
        this.mot3=mot3;
        values.add(mot2);
        values.add(mot3);
        translations.put(mot1,values);

        return translations.get(mot1);
    }


    public List<String> getTranslation (String mot1){
        return translations.get(mot1);
    }

}
