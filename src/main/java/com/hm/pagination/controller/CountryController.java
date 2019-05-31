package com.hm.pagination.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hm.pagination.domain.Continent;
import com.hm.pagination.domain.Country;
import com.hm.pagination.pagination.PagingRequest;
import com.hm.pagination.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

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
    protected static final String API_COUNTRY = "/";

    @Autowired
    private CountryService countryService;

    @GetMapping(path = "list/{continent}")
    public List<Country> getCountries(@PathVariable("continent") Continent continent, Pageable pageable) {
        return countryService.findAllByContinent(continent, pageable);
    }

    @GetMapping(path = "/page/{continent}")
    public Page<Country> getCountriesusingPage(@PathVariable("continent") Continent continent, Pageable pageable) {
        return countryService.findAllByContinentusingPage(continent, pageable);
    }

    @GetMapping(path = "/slice/{continent}")
    public Slice<Country> getCountriesusingSlice(@PathVariable("continent") String continent, Pageable pageable) {
        return countryService.findAllByContinentusingSlice(Continent.valueOf(continent), pageable);
    }
}
