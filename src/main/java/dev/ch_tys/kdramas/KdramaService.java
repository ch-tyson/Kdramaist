package dev.ch_tys.kdramas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KdramaService {

    @Autowired
    private KdramaRepository kdramaRepository;

    public List<Kdrama> allKdramas() {
        System.out.println(kdramaRepository.findAll().toString());
        return kdramaRepository.findAll();
    }

}
