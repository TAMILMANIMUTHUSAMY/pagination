package com.hm.pagination.pagination.impl;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

/**
 * @author : Priyanka
 * @version : 1.0
 * @since : 18-05-2019 17:52
 */
public interface PagingRequest {

    static Pageable of(int page, int size) {
        return PageRequest.of(page - 1, size);
    }

}
