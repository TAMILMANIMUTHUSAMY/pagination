package com.hm.pagination.pagination;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

/**
 * @author : Priyanka
 * @version : 1.0
 * @since : 18-05-2019 17:52
 */
public interface PagingRequest {

    int DEFAULT_SIZE = 10;

    static Pageable of(Integer page, Integer size) {
        return PageRequest.of(page - 1, size == null || size <= 0 ? DEFAULT_SIZE : size);
    }

    static Pageable of(Integer page) {
        return PageRequest.of(page - 1, DEFAULT_SIZE);
    }

}
