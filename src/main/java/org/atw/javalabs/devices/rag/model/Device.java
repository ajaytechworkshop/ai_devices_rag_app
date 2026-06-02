package org.atw.javalabs.devices.rag.model;

import lombok.Data;

@Data
public class Device {
    private String id;
    private String name;
    private  String type;
    private String specSheetPath;
}
