package com.hm.pagination.repository;

import com.hm.pagination.domain.Continent;
import com.hm.pagination.domain.Country;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author : Tamilmani
 * @version : 1.0
 * @since : 15-05-2019 23:45
 */
@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

    @Query("select c from Country c where c.continent = :continent")
    List<Country> findAllByContinent(Continent continent, Pageable pageable);

    @Query("select c from Country c where c.continent = :continent")
    Page<Country> findAllByContinentusingPage(Continent continent, Pageable pageable);

    @Query("select c from Country c where c.continent = :continent")
    Slice<Country> findAllByContinentusingSlice(Continent continent, Pageable pageable);
}
