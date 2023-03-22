package Country;


public class Country {
    //class fields
    private String name;
    private int square;
    private int population;
    private String capitalName;
    private  int capitalPopulation;

    // two constructors

    public Country(String name, int square, int population, String capitalName, int capitalPopulation) {
        this.name = name;
        this.square = square;
        this.population = population;
        this.capitalName = capitalName;
        this.capitalPopulation = capitalPopulation;
    }

    public Country(String name, int square, int population) {
        this.name = name;
        this.square = square;
        this.population = population;
        this.capitalName = "";
        this.capitalPopulation = 0;
    }

    // get-methods for the corresponding attributes

    public String getName() {
        return name;
    }

    public int getSquare() { return square; }

    public int getPopulation() {
        return population;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public int getCapitalPopulation() {
        return capitalPopulation;
    }

    //get-method returns the density of the population
    public void getPopulationDensity(Country c){
        float density = (float)(c.getPopulation() / c.getSquare());
        System.out.println(density + " people per square meter");
    }

    //set-methods +check if population and square > 0; name doesn't equal null

    public void setName(String name) throws Exception {
        if(!name.equals("")) {
            this.name = name;
        } else throw new IllegalArgumentException("Input parameter can't be null"); //the name can't be null
    }

    public void setSquare(int square) throws Exception {
        if(square > 0) {
            this.square = square;
        } else throw new IllegalArgumentException("Input parameter is less or equals zero"); //the population can't be zero or less than zero
    }

    public void setPopulation(int population) throws Exception {
        if(population > 0) {
        this.population = population;
        } else throw new IllegalArgumentException("Input parameter is less or equals zero"); //the population can't be zero or less than zero
    }

    public void setCapitalName(String capitalName) throws Exception {
        if(!capitalName.equals("")) {
            this.capitalName = capitalName;
        } else throw new IllegalArgumentException("unknown"); //the name can't be null
    }

    public void setCapitalPopulation(int capitalPopulation) throws Exception {
        if(capitalPopulation > 0) {
            this.capitalPopulation = capitalPopulation;
        } else throw new IllegalArgumentException("unknown"); //the population can't be zero or less than zero
    }

    //method to print all the data about the country
    public void print() {
        String result = "";
        result += (name.equals("")) ? "" : "Country: " + getName();
        result += (square == 0) ? "" : " Square: " + getSquare() + " m²";
        result += (population == 0) ? "" : " Population: " + getPopulation() + " people ";
        result += (capitalName.equals("")) ? "" : "Capital: " + getCapitalName();
        result += (capitalPopulation == 0)? "" : " Population of the capital: " + getCapitalPopulation() + " people";
        System.out.println(result);

    }

    //static method to print an array

    public static void printAll(Country[] countries) {
        for(Country c : countries) {
            if(!c.capitalName.equals("")) {
                System.out.println("Country: " + c.getName() + " Square: " + c.getSquare() + " m²" + " Population: " + c.getPopulation() + " people" + " Capital: " + c.getCapitalName() + ", Population: " + c.getCapitalPopulation() + " people");
            } else System.out.println("Country: " + c.getName() + " Square: " + c.getSquare() + " m²" + " Population: " + c.getPopulation() + " people");

        }
    }
}
