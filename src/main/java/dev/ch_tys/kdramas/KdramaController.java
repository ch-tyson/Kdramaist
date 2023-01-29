package dev.ch_tys.kdramas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/kdramas")
public class KdramaController {

    @GetMapping
    public String allKdramas() {
        return "All Kdramas!";
    }
    
}
