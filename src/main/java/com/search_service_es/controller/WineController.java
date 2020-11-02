package com.search_service_es.controller;

import com.search_service_es.dto.Employee;
import com.search_service_es.dto.Wine;
import com.search_service_es.intf.service_intf;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class WineController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    public service_intf serv;

    @GetMapping("/search_wine/{searchString}")
    public List<Wine> search_wine(@PathVariable String searchString) throws IOException {
        logger.info("searchString->"+searchString);
        return serv.search_wine(searchString);
    }

}
