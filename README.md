Middleware Engineering "REST and Data Formats"

Das Projekt realisiert eine REST-API für ein Warenlager auf Basis von Spring Boot, die Daten in JSON- und XML-Format bereitstellt. Ergänzend dient eine Webanwendung als Client zur Visualisierung und Filterung dieser Lagerdaten.

Verwendete Technologien

Java & Spring Boot
Gradle
HTML, CSS, JavaScript
jQuery


WarehouseApplication entweder via IDE starten oder mit ./gradlew builden. 


Die Datei index.html aus dem Verzeichnis frontend kann einfach direkt im Browser geöffnet werden. 

Wichtige Arbeitsschritte und Implementierungsdetails


Der WarehouseController fungiert als zentrale Anlaufstelle für sämtliche HTTP-Anfragen. Mit der Annotation @RestController wird die Klasse als REST-Interface markiert, das Datenobjekte direkt in eine Antwort umwandelt.

Über @RequestMapping werden URL-Pfade direkt mit den Methoden eines Controllers verknüpft. Durch Path-Variablen wie {inID} lassen sich dynamische Endpunkte erstellen, die flexibel auf verschiedene Werte reagieren.



Die WarehouseSimulation generiert bei jeder anfrage Sample Werte, welche dann abgerufen werden können.



Um neben JSON auch XML als Ausgabeformat zu unterstützen, wurde die Bibliothek jackson-dataformat-xml in die build.gradle aufgenommen. Spring Boot erkennt diese Abhängigkeit automatisch und richtet die XML-Serialisierung ein.



Das Frontend nutzt jQuery, um asynchrone AJAX-Anfragen an die API zu senden. Nach erfolgreicher Antwort (success) werden die empfangenen JSON-Daten verarbeitet, um dynamisch die HTML-Tabelle mit den Lagerbeständen zu erstellen.


Probleme:

Cross-Origin
Ursache: Die „Same-Origin Policy“ des Browsers blockiert, dass ein Dokument, das über file:// geladen wurde, auf Ressourcen von http://localhost:8080 zugreift.
Lösung: Im WarehouseController die Annotation @CrossOrigin(origins = "*") verwenden. Dadurch sendet das Backend den Access-Control-Allow-Origin-Header, und der Browser erlaubt die Anfrage.
