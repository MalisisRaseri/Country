package Country;

public class CountryTest {
    public static void main (String[] args) {
        Country rus = new Country("Russia", 17_100_000, 146_700_000, "Moscow", 12600000);
        Country fin = new Country("Finland", 338_000, 5_500_000, "Helsinki", 665_000);
        Country fr = new Country("France", 643_800, 67_800_000, "Paris", 2_100_000);
        Country adr = new Country("Andorra", 467, 85_400, "Andorra la Vella", 22_600);
        Country sg = new Country("Singapore", 725, 5_700_000);

        Country[] countries = {rus, fin, fr, adr, sg};
        Country.printAll(countries);
        sg.print();
        rus.getPopulationDensity(rus);

    }
}
