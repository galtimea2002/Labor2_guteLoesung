package aufgabe;
// Controller Layer

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ShopController {
    //private static ShopModel[] products = new ShopModel[]{};
    List<ShopModel> products = new ArrayList<>();
    private ShopModel model;
    private ShopView view;
    public ShopController(ShopModel model, ShopView view){
        this.model = model;
        this.view = view;
    }
    public void setShopProdukt(String Produkt){
        model.setProdukt(Produkt);
    }
    public String getShopProdukt(){
        return model.getProdukt();
    }
    public void setProduktID(String ProduktID){
        model.setProduktID(ProduktID);
    }
    public String getProduktID(String ProduktID){
        return model.getProduktID();
    }
    public void setProduktBrand(String Brand){
        model.setBrand(Brand);
    }
    public String getProduktBrand(){
        return model.getBrand();
    }
    public void deleteProdukt(String Produkt, String ProduktID, String Brand){
        ShopModel s = new ShopModel();
        s.setProdukt(Produkt);
        s.setProduktID(ProduktID);
        s.setBrand(Brand);
        int index = products.indexOf(s.getProduktID());
        products.remove(index);
    }
    public void updateView(){
        view.printProductDetails(model.getProdukt(), model.getProduktID(), model.getBrand());
    }
}
