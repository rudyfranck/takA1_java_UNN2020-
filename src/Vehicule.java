public class Vehicule {
    private final long id;
    private final String nameOfOwner;
    private final String country;

    public Vehicule(long id, String nameOfOwner, String country) {
        this.id = id;
        this.nameOfOwner = nameOfOwner;
        this.country = country;
    }

    //We do not need it because can print values from toString method
//    public long getId() {
//        return id;
//    }
//
//    public String getNameOfOwner() {
//        return nameOfOwner;
//    }
//
//    public String getCountry() {
//        return country;
//    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "id=" + id +
                ", nameOfOwner='" + nameOfOwner + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
