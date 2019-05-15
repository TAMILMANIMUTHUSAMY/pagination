package com.hm.pagination.service;

import com.hm.pagination.domain.Continent;
import com.hm.pagination.domain.Country;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;

import java.util.List;

/**
 * @author : Tamilmani
 * @version : 1.0
 * @since : 15-05-2019 23:57
 */
public interface CountryService {

    List<Country> findAllByContinent(Continent continent, Pageable pageable);

    Page<Country> findAllByContinentusingPage(Continent continent, Pageable pageable);

    Slice<Country> findAllByContinentusingSlice(Continent continent, Pageable pageable);
}
