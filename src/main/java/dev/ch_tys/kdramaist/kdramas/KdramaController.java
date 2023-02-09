package dev.ch_tys.kdramaist.kdramas;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/kdramas")
public class KdramaController {

    @Autowired
    private KdramaServer service;

    @GetMapping
    public ResponseEntity<List<Kdrama>> getKdramas() {
        return new ResponseEntity<List<Kdrama>>(service.findAllKdramas(), HttpStatus.OK);
    }

    @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<Kdrama>> getSingleKdrama(@PathVariable String imdbId){
        return new ResponseEntity<Optional<Kdrama>>(service.findKdramaByImdbId(imdbId), HttpStatus.OK);
    }
}
