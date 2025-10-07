package tradearea.warehouse;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import tradearea.model.WarehouseData;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/warehouse")
public class WarehouseController {

    @Autowired
    private WarehouseService service;

    @GetMapping(value = "/{inID}", produces = {
            MediaType.APPLICATION_JSON_VALUE,
            MediaType.APPLICATION_XML_VALUE
    })
    public WarehouseData getWarehouseData(
            @PathVariable String inID,
            @RequestParam(required = false) String productName
    ) {
        return service.getWarehouseData(inID, productName);
    }

    @GetMapping("/")
    public String warehouseMain() {
        return """
            <h2>🏰 Warehouse REST</h2>
            <p>Hark! Set thine <b>Accept</b> header thusly:</p>
            <ul>
              <li><code>Accept: application/json</code></li>
              <li><code>Accept: application/xml</code></li>
            </ul>
            <p>Then visit: <code>/warehouse/001</code></p>
            <p><a href='/index.html'>Frontend Portal</a></p>
        """;
    }
}
