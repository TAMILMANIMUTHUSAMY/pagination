package com.hm.pagination.pagination;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.springframework.boot.jackson.JsonComponent;
import org.springframework.data.domain.Page;

import java.io.IOException;

/**
 * @author : Priyanka
 * @version : 1.0
 * @since : 18-05-2019 23:22
 */
@JsonComponent
public class PagingResponseJacksonSerializer extends JsonSerializer<Page> {

    @Override
    public void serialize(Page pagingResponse, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeObjectField("content", pagingResponse.getContent());
        jsonGenerator.writeNumberField("totalPages", pagingResponse.getTotalPages());
        jsonGenerator.writeNumberField("totalElements", pagingResponse.getTotalElements());
        jsonGenerator.writeNumberField("numberOfElements", pagingResponse.getNumberOfElements());
        jsonGenerator.writeNumberField("pageSize", pagingResponse.getPageable().getPageSize());
        jsonGenerator.writeNumberField("pageNumber", pagingResponse.getPageable().getPageNumber() + 1);
        jsonGenerator.writeNumberField("offset", pagingResponse.getPageable().getOffset() + 1);
        jsonGenerator.writeEndObject();
    }

}
