package com.example.virusexplorer.virus;

abstract public class Virus {
    public String name;
    public final String ILLUSTRATION_PATH;
    public final String INJECTION_MECHANISM_PATH;
    public Virus(String name, String ILLUSTRATION_PATH, String INJECTION_MECHANISM_PATH) {
        this.name = name;
        this.ILLUSTRATION_PATH = ILLUSTRATION_PATH;
        this.INJECTION_MECHANISM_PATH = INJECTION_MECHANISM_PATH;
    }
}
