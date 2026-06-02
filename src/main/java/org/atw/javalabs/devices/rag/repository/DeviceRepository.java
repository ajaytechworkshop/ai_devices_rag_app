package org.atw.javalabs.devices.rag.repository;

import lombok.RequiredArgsConstructor;
import org.atw.javalabs.devices.rag.model.Device;
import org.springframework.ai.document.Document;
import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Component
public class DeviceRepository {

    private final VectorStore vectorStore;

    public void registerDevice(final Device device) {

        final Document document = new Document(device.getType());
        vectorStore.add(List.of(document));
    }
}
