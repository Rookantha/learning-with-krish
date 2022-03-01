package com.example.moviecatalogueservice.resources;

import com.example.moviecatalogueservice.models.CatalogItem;
import com.example.moviecatalogueservice.models.Rating;
import com.sun.org.apache.xml.internal.resolver.Catalog;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResources {
    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){

        List<Rating> ratings = Arrays.asList(
                new Rating("1234", 4),
                new Rating("5644", 5)
        );
        return ratings.stream().map(rating -> new CatalogItem("Transformers","Test",4))
                .collect(Collectors.toList());

    }
}
