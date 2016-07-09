public class Pepsi implements Soda {
    private final boolean containsSugar;

    private Pepsi() {}
    
    private Pepsi(boolean containsSugar) {
	this.containsSugar = containsSugar;
    }

    public static Pepsi withRealSugar() {
	return new Pepsi(true);
    }

    public static Pepsi withHighFructoseCornSyrup() {
	return new Pepsi(false);
    }

    public boolean isRealSugar() {
	return containsSugar;
    }
}
