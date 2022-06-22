package StructurePatterns.FlyWeight;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFabric {
    public static final Map<String,Developer> developers=new HashMap<>();

    public Developer getDeveloperSpec(String spec){
        Developer developer=developers.get(spec);

        if (developer == null){
            switch (spec) {
                case "Java" -> {
                    System.out.println("Hiring Java developer...");
                    developer = new JavaDeveloper();
                }
                case "JS" -> {
                    System.out.println("Hiring Js developer...");
                    developer = new JSDeveloper();
                }
            }
            developers.put(spec,developer);
        }
        return developer;
    }
}