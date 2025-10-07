package tradearea.warehouse;

import org.springframework.stereotype.Service;
import tradearea.model.Product;
import tradearea.model.WarehouseData;

import java.util.ArrayList;
import java.util.List;

@Service
public class WarehouseService {

	public String getGreetings( String inModule ) {
        return "Greetings from " + inModule;
    }


    public WarehouseData getWarehouseData(String inID, String productNameFilter) {
        WarehouseSimulation simulation = new WarehouseSimulation();
        WarehouseData data = simulation.getData(inID);

        if (productNameFilter != null && !productNameFilter.isEmpty()) {
            // Use Java Streams for cleaner filtering
            List<tradearea.model.Product> filteredList = data.getProductData().stream()
                    .filter(p -> p.getProductName().toLowerCase().contains(productNameFilter.toLowerCase()))
                    .collect(java.util.stream.Collectors.toList());
            data.setProductData(filteredList);
        }
        return data;
    }


    public WarehouseData getWarehouseData( String inID ) {
        return this.getWarehouseData(inID, null);
    }

}