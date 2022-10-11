package aufgabe;
// Model Layer

public class ShopModel {
    private String Produkt;
    private String ProduktID;
    private String Brand;

    public String getProdukt(){
        return Produkt;
    }
    public String getProduktID(){
        return ProduktID;
    }
    public String getBrand(){
        return Brand;
    }
    public void setProdukt(String produkt2){
        this.Produkt = produkt2;
    }
    public void setProduktID(String produktID2){
        this.ProduktID = produktID2;
    }
    public void setBrand(String brand2){
        this.Brand = brand2;
    }
    public void deleteProduktByID(String ProduktID){

    }
}
