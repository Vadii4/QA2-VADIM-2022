public class Keyboard {
    //--------------------ATTRIBUTES---------------------
    private double weight;
    private String type;
    private int  buttonQuantity;
    private String backlightColor;
    private String language;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getButtonQuantity() {
        return buttonQuantity;
    }

    public void setButtonQuantity(int buttonQuantity) {
        this.buttonQuantity = buttonQuantity;
    }

    public String getBacklightColor() {
        return backlightColor;
    }

    public void setBacklightColor(String backlightColor) {
        this.backlightColor = backlightColor;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
