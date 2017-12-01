package dodo.pubg.entity;

public class Stats {
    private String label;
    private Category category;
    private String field;
    private float value;

    public enum Category {
        Performance, Skill_Rating, Per_Game, Combat, Survival, Distance, Support
    }

    public Stats(String label, String category, String field, String value) {
        this.label = label;
        switch (category) {
            case "Performance":
                this.category = Category.Performance;
                break;
            case "Skill_Rating":
                this.category = Category.Skill_Rating;
                break;
            case "Per_Game":
                this.category = Category.Per_Game;
                break;
            case "Combat":
                this.category = Category.Combat;
                break;
            case "Survival":
                this.category = Category.Survival;
                break;
            case "Distance":
                this.category = Category.Distance;
                break;
            case "Support":
                this.category = Category.Support;
                break;

        }
        this.field = field;
        this.value = Float.parseFloat(value);
    }

    public String getLabel() {
        return label;
    }

    public Category getCategory() {
        return category;
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
