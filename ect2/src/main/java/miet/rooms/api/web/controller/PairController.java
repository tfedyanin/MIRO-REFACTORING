package miet.rooms.api.web.controller;

import miet.rooms.repository.dao.PairDao;
import miet.rooms.repository.entity.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/pair")
public class PairController {

    @Autowired
    private PairDao pairDao;

    @GetMapping
    public Pair getPairByName(@RequestParam String pairName) {
        return pairDao.findAllByName(pairName);
    }
}
