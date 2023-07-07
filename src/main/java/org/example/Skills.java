package org.example;

import java.util.List;

public class Skills {
    private List<String> language;
    private List<String> framework;
    private List<String> dataBase;
    private List<String> blockchains;

    public Skills(List<String> language, List<String> framework, List<String> dataBase, List<String> blockchains) {
        this.language = language;
        this.framework = framework;
        this.dataBase = dataBase;
        this.blockchains = blockchains;
    }

    public Skills() {

    }

    public List<String> getLanguage() {
        return language;
    }

    public void setLanguage(List<String> language) {
        this.language = language;
    }

    public List<String> getFramework() {
        return framework;
    }

    public void setFramework(List<String> framework) {
        this.framework = framework;
    }

    public List<String> getDataBase() {
        return dataBase;
    }

    public void setDataBase(List<String> dataBase) {
        this.dataBase = dataBase;
    }

    public List<String> getBlockchains() {
        return blockchains;
    }

    public void setBlockchains(List<String> blockchains) {
        this.blockchains = blockchains;
    }
}
