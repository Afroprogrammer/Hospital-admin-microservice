package com.afroprogrammer.admissionsservice.model;

public class Disease {
    private String Id;
  private  String name;
  private String description;
  private  String treatment;

    public Disease() {
    }

    public Disease(String id, String name, String description, String treatment) {
        Id = id;
        this.name = name;
        this.description = description;
        this.treatment = treatment;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    @Override
    public String toString() {
        return "Disease{" +
                "Id='" + Id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", treatment='" + treatment + '\'' +
                '}';
    }
}
