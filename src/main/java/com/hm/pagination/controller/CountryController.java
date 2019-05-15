package com.hm.pagination.controller;

import com.hm.pagination.domain.Continent;
import com.hm.pagination.domain.Country;
import com.hm.pagination.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Slice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author : Tamilmani
 * @version : 1.0
 * @since : 15-05-2019 23:58
 */
@RestController
@RequestMapping(path = CountryController.API_COUNTRY)
public class CountryController {

    private static final Integer PAGE_SIZE = 5;
    protected static final String API_COUNTRY = "/api/country";

    @Autowired
    private CountryService countryService;

    @GetMapping(path = "/{continent}")
    public List<Country> getCountries(@PathVariable("continent") Continent continent) {
        return countryService.findAllByContinent(continent, PageRequest.of(0, PAGE_SIZE));
    }

    @GetMapping(path = "/{continent}/{pageNo}")
    public List<Country> getCountriesByPageNo(@PathVariable("continent") Continent continent, @PathVariable("pageNo") Integer pageNo) {

        return countryService.findAllByContinent(continent, PageRequest.of(pageNo, PAGE_SIZE));
    }

    @GetMapping(path = "/page/{continent}")
    public Page<Country> getCountriesusingPage(@PathVariable("continent") Continent continent) {
        return countryService.findAllByContinentusingPage(continent, PageRequest.of(0, PAGE_SIZE));
    }

    @GetMapping(path = "/page/{continent}/{pageNo}")
    public Page<Country> getCountriesByPageNousingPage(@PathVariable("continent") Continent continent, @PathVariable("pageNo") Integer pageNo) {

        return countryService.findAllByContinentusingPage(continent, PageRequest.of(pageNo, PAGE_SIZE));
    }

    @GetMapping(path = "/slice/{continent}")
    public Slice<Country> getCountriesusingSlice(@PathVariable("continent") String continent) {
        return countryService.findAllByContinentusingSlice(Continent.valueOf(continent), PageRequest.of(0, PAGE_SIZE));
    }

    @GetMapping(path = "/slice/{continent}/{pageNo}")
    public Slice<Country> getCountriesByPageNousingSlice(@PathVariable("continent") Continent continent, @PathVariable("pageNo") Integer pageNo) {

        return countryService.findAllByContinentusingSlice(continent, PageRequest.of(pageNo, PAGE_SIZE));
    }
}
