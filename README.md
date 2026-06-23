# MapStruct JSON to XML Exercise

This exercise shows how to convert an input JSON order into an output XML order with generated model classes and MapStruct.

## Goal

The project does not hand-code the JSON and XML model classes. Instead:

- `src/main/resources/schema/json/jsonOrder.json` defines the input JSON model.
- `src/main/resources/schema/xml/order.xsd` defines the output XML model.
- Maven plugins generate Java objects from those two model files.
- MapStruct maps the generated JSON object to the generated XML object.
- A test compares the generated XML with an expected XML file.

## Main Flow

1. Read sample input from `src/main/resources/input/order.json`.
2. Deserialize it into the generated `com.example.demo.jsonmodel.JsonOrder`.
3. Map it with `OrderMapper`.
4. Produce the generated `com.example.demo.xmlmodel.Order`.
5. Marshal the object to XML with JAXB.
6. Compare the XML against `src/test/resources/expected/order.xml`.

## Maven Generation Plugins

The model classes are generated during the Maven build:

- `jsonschema2pojo-maven-plugin`
  - Reads `src/main/resources/schema/json/jsonOrder.json`
  - Generates Java classes under `target/generated-sources/jsonschema2pojo`
  - Package: `com.example.demo.jsonmodel`

- `jaxb2-maven-plugin`
  - Reads `src/main/resources/schema/xml/order.xsd`
  - Generates Java classes under `target/generated-sources/jaxb`
  - Package: `com.example.demo.xmlmodel`

MapStruct then generates mapper implementation code during compilation.

## Mapping Examples

`OrderMapper` includes examples of common transformation logic:

- Date formatting: `2026-06-23` to `23/06/2026`
- Substring: `CUS-00098765` to `98765`
- Concatenation: full name, contact, product label
- Uppercase formatting: status, channel, country, category
- Money formatting: `25.5` to `25.50`
- Weight formatting: `0.25` to `0.25 kg`
- Line total calculation: `quantity * unitPrice`
- Text shortening for long delivery notes

## Run

If Maven is installed:

```bash
mvn clean test
```

Run the demo application:

```bash
mvn exec:java
```

The demo prints the generated XML to the console.

## Important Files

- `pom.xml` - Maven dependencies and generation plugin configuration
- `src/main/resources/schema/json/jsonOrder.json` - input JSON model definition
- `src/main/resources/schema/xml/order.xsd` - output XML model definition
- `src/main/resources/input/order.json` - sample input data
- `src/main/java/com/example/demo/mapper/OrderMapper.java` - MapStruct mapping rules
- `src/main/java/com/example/demo/service/OrderXmlConverter.java` - JSON read, map, XML marshal flow
- `src/test/resources/expected/order.xml` - expected XML result
- `src/test/java/com/example/demo/service/OrderXmlConverterTest.java` - XML comparison test

## Exercise Ideas

- Add another field to `jsonOrder.json` and `order.xsd`.
- Add a new `@Mapping` rule in `OrderMapper`.
- Add a custom transformation function with `@Named`.
- Update `order.json` and `expected/order.xml`.
- Run `mvn clean test` to confirm the output still matches.
