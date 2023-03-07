public class Computer {
    // instance variables
    private int screenSize;
    private int memory;

    // constructor
    public Computer(int screenSize, int memory){
        this.screenSize = screenSize;
        this.memory = memory;
    }

    // getter methods
    public int getScreenSize(){
        return screenSize;
    }

    public int getMemory(){
        return memory;
    }

    // other public methods
    public void installOperatingSystem() {
        System.out.println("installing OS...");
    }
}
