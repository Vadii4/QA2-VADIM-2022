import org.junit.jupiter.api.Test;

public class HomeWork2 {
    @Test
    public void checkingBook () {
       Book firstBook = new Book();

        firstBook.setPages(355);
        firstBook.setName("One Flew Over the Cuckoo's Nest");
        firstBook.setLanguage("English");
        firstBook.setAuthor("Ken Kesey");

        System.out.println("My Library");
        System.out.println("firstBook");
        System.out.println(firstBook.getAuthor());
        System.out.println(firstBook.getName());
    }
    @Test
    public void bottleInspection () {
        Bottle newBottle = new Bottle();

        newBottle.setManufacturer("Rimi");
        newBottle.setVolume(1.5);
        newBottle.setRecycling("Yes");

        System.out.println("Bottles");
        System.out.println(newBottle.getManufacturer());
    }
    @Test
    public void purchaseComputer () {
        Computer newComputer = new Computer();

        newComputer.setCompany("Asus");
        newComputer.setDiscSpace(5);
        newComputer.setUsbPorts(6);

        System.out.println("GamingPC");
        System.out.println(newComputer.getCompany());
    }
    @Test
    public void newKeyboard () {
        Keyboard myKeyboard = new Keyboard();

        myKeyboard.setBacklightColor("Red");

        System.out.println(myKeyboard.getBacklightColor());
    }
    @Test
    public void destroyLamp () {
        Lamp myLamp = new Lamp();

        myLamp.setColor("Black");
        myLamp.setLampBaseType("Standard");
        myLamp.setCapacity(1300);

        System.out.println(myLamp.getColor());
    }
    @Test
    public void getMousse () {
        Mouse niceMouse = new Mouse();

        niceMouse.setLabel("G");
        niceMouse.setWeight(0.075);

        System.out.println("MYMOUSEE");
        System.out.println(niceMouse.getLabel());
    }
    @Test
    public void writePen () {
        Pen greatPen = new Pen();

        greatPen.setDiameter(0.8);
        greatPen.setLenght(10);

        System.out.println(greatPen.getLenght());
    }
    @Test
    public void buySocks () {
        Socks newSocks = new Socks();

        newSocks.setColor("black");
        newSocks.setSize(45);
        newSocks.setMaterial("cotton");

        System.out.println(newSocks.getSize());
        System.out.println(newSocks.getMaterial());
    }
    @Test
    public void sellTable () {
        Table myTable = new Table();

        myTable.setLenght(2);
        myTable.setColor("Black");

        System.out.println(myTable.getColor());
        System.out.println(myTable.getLenght());
    }
    @Test
    public void getTrashCan () {
        TrashCan newTrashcan = new TrashCan();

        newTrashcan.setVolume(10);
        newTrashcan.setMaterial("Plastic");

        System.out.println(newTrashcan.getMaterial());
    }
}
