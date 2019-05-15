package com.hm.pagination.domain;

import javax.persistence.*;

/**
 * @author : Tamilmani
 * @version : 1.0
 * @since : 15-05-2019 23:19
 */
@Entity(name = "Country")
@Table(name = "COUNTRY")
public class Country {

    @Id
    @Column(name = "CODE")
    private String code;

    @Column(name="NAME")
    private String name;

    @Column(name = "CONTINENT")
    @Enumerated(EnumType.STRING)
    private Continent continent;

    @Column(name = "REGION")
    private String region;

    @Column(name = "POPULATION")
    private Long population;

    public Country() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }


}
