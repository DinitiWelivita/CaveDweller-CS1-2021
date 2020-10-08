package cavedweller;

/**
 *
 * @author 802967
 */
public class Caveman {
    //Fields - instance variables
    private String name;
    private int x,y, size, hp;
    private boolean hasKey;
    
    //Constructor
    public Caveman (String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.hp = 100;
        this.hasKey = false;
    }
    //Methods
    public void speak() {
        System.out.println("Ugh");
    }
    
    public void eat (Food food) {
        this.hp += food.getNourishment();
        food.setEaten(true);
        System.out.println("Me eat "+food.getName());
    }
    
    public void openDoor (Door door) {
        door.setOpen(true);
    }
    
    public String toString () {
        return "x: "+x+", Y: "+y;
    }
    
    public void moveUp () {
        y = y-1;
    }
    
    public void moveDown () {
        y = y+1;
    }
    
    public void moveLeft () {
        x = x-1;
    }
    
    public void moveRight () {
        x = x+1;
    }
    
    //Accessors - getters and setters
    public String getName() {
        return name;
    }
    
    public int getHp() {
        return hp;
    }
    
    public void setHP (int hp) {
        if (hp >= 0 && hp <= 100) {
              this.hp = hp;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isHasKey() {
        return hasKey;
    }

    public void setHasKey(boolean hasKey) {
        this.hasKey = hasKey;
    }
    
    public void pickUp () {
        System.out.println("You found the key.");
    }
    
    public void open() {
        System.out.println("The caveman escaped!");
    }
}
