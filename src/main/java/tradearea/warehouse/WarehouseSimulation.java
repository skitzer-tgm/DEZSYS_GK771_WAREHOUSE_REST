package tradearea.warehouse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import tradearea.model.Product;
import tradearea.model.WarehouseData;

public class WarehouseSimulation {


    private double getRandomDouble( int inMinimum, int inMaximum ) {
        double number = ( Math.random() * ( (inMaximum-inMinimum) + 1 )) + inMinimum;
        double rounded = Math.round(number * 100.0) / 100.0;
        return rounded;
    }

    private int getRandomInt( int inMinimum, int inMaximum ) {
        double number = ( Math.random() * ( (inMaximum-inMinimum) + 1 )) + inMinimum;
        Long rounded = Math.round(number);
        return rounded.intValue();
    }

    public WarehouseData getData(String inID) {


        if(Objects.equals(inID, "001")) {
        WarehouseData data = new WarehouseData();


        data.setWarehouseID(inID);
        data.setWarehouseName("Linz Bahnhof");
        data.setWarehouseAddress("Bahnhofsstrasse 27/9");
        data.setWarehousePostalCode("4020");
        data.setWarehouseCity("Linz");
        data.setWarehouseCountry("Austria");


        List<Product> productList = new ArrayList<>();


        Product p1 = new Product();
        p1.setProductID("00-443175");
        p1.setProductName("Bio Orangensaft Sonne");
        p1.setProductCategory("Getraenk");
        p1.setProductQuantity(getRandomInt(1000, 5000));
        p1.setProductUnit("Packung 1L");
        productList.add(p1);


        Product p2 = new Product();
        p2.setProductID("01-926885");
        p2.setProductName("Ariel Waschmittel Color");
        p2.setProductCategory("Waschmittel");
        p2.setProductQuantity(getRandomInt(200, 1000));
        p2.setProductUnit("Packung 3KG");
        productList.add(p2);


        Product p3 = new Product();
        p3.setProductID("00-316253");
        p3.setProductName("Persil Discs Color");
        p3.setProductCategory("Waschmittel");
        p3.setProductQuantity(getRandomInt(500, 2000));
        p3.setProductUnit("Packung 700G");
        productList.add(p3);


        data.setProductData(productList);

        return data;
        }else if(Objects.equals(inID, "002")) {
            WarehouseData data = new WarehouseData();


            data.setWarehouseID(inID);
            data.setWarehouseName("Hauptbahnhof");
            data.setWarehouseAddress("Favoritenstraße 51");
            data.setWarehousePostalCode("1100");
            data.setWarehouseCity("Wien");
            data.setWarehouseCountry("Austria");


            List<Product> productList = new ArrayList<>();


            Product p1 = new Product();
            p1.setProductID("00-443175");
            p1.setProductName("Bio Orangensaft Sonne");
            p1.setProductCategory("Getraenk");
            p1.setProductQuantity(getRandomInt(1000, 5000));
            p1.setProductUnit("Packung 1L");
            productList.add(p1);


            Product p2 = new Product();
            p2.setProductID("01-926886");
            p2.setProductName("Weißer Riese Universal");
            p2.setProductCategory("Waschmittel");
            p2.setProductQuantity(getRandomInt(200, 1000));
            p2.setProductUnit("Packung 2L");
            productList.add(p2);


            Product p3 = new Product();
            p3.setProductID("00-316253");
            p3.setProductName("Capri Sun");
            p3.setProductCategory("Getraenk");
            p3.setProductQuantity(getRandomInt(500, 2000));
            p3.setProductUnit("Packung 330ml");
            productList.add(p3);


            data.setProductData(productList);

            return data;
        }
        return null;
    }
}