package com.hm.pagination.service.impl;

import com.hm.pagination.domain.Continent;
import com.hm.pagination.domain.Country;
import com.hm.pagination.repository.CountryRepository;
import com.hm.pagination.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : Tamilmani
 * @version : 1.0
 * @since : 15-05-2019 23:57
 */
@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Override
    public List<Country> findAllByContinent(Continent continent, Pageable pageable) {
        return countryRepository.findAllByContinent(continent, pageable);
    }

    @Override
    public Page<Country> findAllByContinentusingPage(Continent continent, Pageable pageable) {
        return countryRepository.findAllByContinentusingPage(continent, pageable);
    }

    @Override
    public Slice<Country> findAllByContinentusingSlice(Continent continent, Pageable pageable) {
        return countryRepository.findAllByContinentusingSlice(continent, pageable);
    }
}
