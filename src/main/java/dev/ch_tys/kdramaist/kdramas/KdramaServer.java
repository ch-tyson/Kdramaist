package dev.ch_tys.kdramaist.kdramas;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KdramaServer {

    @Autowired
    private KdramaRepository repository;

    public List<Kdrama> findAllKdramas() {
        return repository.findAll();
    }
    public Optional<Kdrama> findKdramaByImdbId(String imdbId) {
        return repository.findKdramaByImdbId(imdbId);
    }
}