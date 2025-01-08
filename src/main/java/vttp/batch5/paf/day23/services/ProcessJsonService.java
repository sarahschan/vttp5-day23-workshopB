package vttp.batch5.paf.day23.services;

import java.io.StringReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import jakarta.json.Json;
import jakarta.json.JsonArray;
import jakarta.json.JsonObject;
import jakarta.json.JsonReader;
import vttp.batch5.paf.day23.model.LineItem;
import vttp.batch5.paf.day23.model.PurchaseOrder;

@Service
public class ProcessJsonService {
    
    public PurchaseOrder processPayload(String payload){

        JsonReader jsonReader = Json.createReader(new StringReader(payload));
        JsonObject jsonObject = jsonReader.readObject();

        String poId = UUID.randomUUID().toString().substring(0,8);
        String name = jsonObject.getString("name");
        String address = jsonObject.getString("address");
        LocalDate deliveryDate = LocalDate.parse(jsonObject.getString("deliveryDate"));


        JsonArray lineItemsJsonArray = jsonObject.getJsonArray("lineItems");
        List<LineItem> lineItems = new ArrayList<>();

        for (int i = 0; i < lineItemsJsonArray.size(); i++){
            JsonObject lineItemJson = lineItemsJsonArray.getJsonObject(i);
            String itemName = lineItemJson.getString("name");
            int quantity = lineItemJson.getInt("quantity");
            float unitPrice = (float) lineItemJson.getJsonNumber("unitPrice").doubleValue();
            
            LineItem lineItem = new LineItem(itemName, quantity, unitPrice, poId);
            lineItems.add(lineItem);
        }

        PurchaseOrder po = new PurchaseOrder();
            po.setPoId(poId);
            po.setName(name);
            po.setAddress(address);
            po.setDeliveryDate(deliveryDate);
            po.setLineItems(lineItems);

        return po;
    }

}

// {
//     "name": "barney",
//     "address": "1 Adams St",
//     "deliveryDate": "2025-01-17",
//     "lineItems": [
//       {
//         "name": "broccoli",
//         "quantity": 2,
//         "unitPrice": 1.2
//       },
//       {
//         "name": "carrot",
//         "quantity": 3,
//         "unitPrice": 1.5
//       }
//     ]
// }