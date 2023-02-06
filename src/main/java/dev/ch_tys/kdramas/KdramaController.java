package dev.ch_tys.kdramas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/kdramas")
public class KdramaController {

    @Autowired
    private KdramaService kdramaService;

    @GetMapping
    public ResponseEntity<List<Kdrama>> getAllKdramas() {
        return new ResponseEntity<List<Kdrama>>(kdramaService.allKdramas(), HttpStatus.OK);
    }

}
