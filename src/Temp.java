import java.math.BigDecimal;

public enum Temp {
    C (0, "Celsius"),
    F (1, "Fahrenheit"),
    K (2, "Kelvin"), ;

    private final float tempCode;
    private final String description;

        Temp (int tempCode, String description){
            this.tempCode = tempCode;
            this.description = description;
        }
    public float getTempCode(){
            return this.tempCode;
    }
    public String getDescription(){
            return this.description;
    }

    public static void outputTemp(Temp theTemp){

        switch(theTemp) {
            case C:
                System.out.println("If the degrees in Celsius are " + "then the Kelvin units would be " + "and the " +
                        "Fahrenheit temperature would be " );
            case F:
                System.out.println("\"If the degrees in Fahrenheit are \" + \"then the Kelvin units would be \" + \"and the \" +\n" +
                        "                        \"Fahrenheit temperature would be \"");
        }
    }
}
