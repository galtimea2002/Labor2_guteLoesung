package aufgabe;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ShopModel model = ShopFromDatabase();
        ShopView view = new ShopView();
        ShopController controller = new ShopController(model,view);
        controller.updateView();

        controller.setShopProdukt("Marmelade");
        System.out.println("After update, Shop details are as follows:");
        controller.updateView();
        controller.deleteProdukt("","","");
    }
    private static ShopModel ShopFromDatabase(){
        ShopModel s = new ShopModel();
        s.setProdukt("Honig");
        s.setProduktID("23DR5");
        s.setBrand("Lebensmittel");

        return s;
    }
}