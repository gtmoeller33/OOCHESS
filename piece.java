public class piece {
    private String color;
    private String type;
    
    public piece (String color, String type) {
        this.color = color;
        this.type = type;
    }
    public String getcolor() {
        return color;
    }
    public String gettype() {
        return type;
    }
    public String toString() {
        return color + " " + type;
    }
}