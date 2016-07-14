package learn.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Administrator on 7/12/2016.
 */
@Entity
public class Shipwreck {

    public Shipwreck(){};

    public Shipwreck(Long id, String name, String description, String condition, Integer depth, Double latitude, Double longitude, Integer yearDiscovered) {
        this.condition = condition;
        this.depth = depth;
        this.description = description;
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
        this.yearDiscovered = yearDiscovered;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long    id;

    String  name,
            description,
            condition;

    Integer depth,
            yearDiscovered;

    Double latitude,
           longitude;

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public Integer getDepth() {
        return depth;
    }

    public void setDepth(Integer depth) {
        this.depth = depth;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYearDiscovered() {
        return yearDiscovered;
    }

    public void setYearDiscovered(Integer yearDiscovered) {
        this.yearDiscovered = yearDiscovered;
    }
}
