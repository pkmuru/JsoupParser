package com.company;

/**
 * Created by muru on 8/13/2016.
 */
public class Compo {
    protected String usage;
    private String license;
    private String categories;
    private String homePage;
    private String date;
    private String repository;

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public String getHomePage() {
        return homePage;
    }

    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRepository() {
        return repository;
    }

    public void setRepository(String repository) {
        this.repository = repository;
    }

    @Override
    public String toString() {
        return "Compo{" +
                "usage='" + usage + '\'' +
                ", license='" + license + '\'' +
                ", categories='" + categories + '\'' +
                ", homePage='" + homePage + '\'' +
                ", date='" + date + '\'' +
                ", repository='" + repository + '\'' +
                '}';
    }
}
