package com.facebook.profilo.config;

import java.util.TreeMap;

public class ConfigParams {
    public static final ConfigParams EMPTY = new Object();
    public TreeMap boolParams;
    public TreeMap intListParams;
    public TreeMap intParams;
    public TreeMap stringListParams;
    public TreeMap stringParams;
}
