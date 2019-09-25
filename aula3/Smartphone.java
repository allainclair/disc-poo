class Smartphone {
    private int countryNumber; // 55
    private int areaNumber; // 44
    private int number;

    public Smartphone(int countryNumber, int areaNumber, int number) {
        this.countryNumber = countryNumber;
        this.areaNumber = areaNumber;
        this.number = number;
    }

    public int getCountryNumber() {
        return this.countryNumber;
    }

    public int getAreaNumber() {
        return this.areaNumber;
    }

    public int getNumber() {
        return this.number;
    }
}
