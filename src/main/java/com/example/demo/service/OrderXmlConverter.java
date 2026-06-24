package com.example.demo.service;

import com.example.demo.jsonmodel.JsonOrder;
import com.example.demo.mapper.OrderMapper;
import com.example.demo.xmlmodel.Order;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;

import java.io.StringWriter;
import java.nio.file.Path;

public class OrderXmlConverter {
    private final ObjectMapper objectMapper =
            new ObjectMapper().findAndRegisterModules();

    public String convertFile(Path jsonFile) throws Exception {
        JsonOrder jsonOrder = objectMapper.readValue(jsonFile.toFile(), JsonOrder.class);
        Order xmlOrder = OrderMapper.INSTANCE.toXmlOrder(jsonOrder);
        return marshal(xmlOrder);
    }

    private String marshal(Order xmlOrder) throws Exception {
        JAXBContext context = JAXBContext.newInstance(Order.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");

        StringWriter writer = new StringWriter();
        marshaller.marshal(xmlOrder, writer);
        return writer.toString();
    }
}
