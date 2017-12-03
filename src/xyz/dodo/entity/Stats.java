package xyz.dodo.entity;

public class Stats {
    private String label;
    private Category category;
    private String field;
    private float value;

    public enum Category {
        Performance, Skill_Rating, Per_Game, Combat, Survival, Distance, Support, unknown
    }

    public Stats() {
        this.label = "Error";
        this.category = Category.unknown;
        this.field = "Error";
        this.value = -9999;
    }

    public Stats(String label, String category, String field, String value) {
        this.label = label;
        this.category = getCategoryFromString(category);
        this.field = field;
        this.value = Float.parseFloat(value);
    }


    public String getLabel() {
        return label;
    }

    public Category getCategory() {
        return category;
    }

    public static Category getCategoryFromString(String category){
        switch (category) {
            case "Performance":
                return Category.Performance;
            case "Skill_Rating":
                return Category.Skill_Rating;
            case "Per_Game":
                return Category.Per_Game;
            case "Combat":
                return Category.Combat;
            case "Survival":
                return Category.Survival;
            case "Distance":
                return Category.Distance;
            case "Support":
                return Category.Support;
        }
        return Category.unknown;
    }

    @Override
    public String toString() {
        return "Stats{" +
                "label='" + label + '\'' +
                ", category=" + category +
                ", field='" + field + '\'' +
                ", value=" + value +
                '}';
    }

    public String getField() {
        return field;
    }

    public float getValue() {
        return value;
    }
}
