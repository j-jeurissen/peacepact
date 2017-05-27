package org.peacepact.controller;

import org.peacepact.domain.Peacekeeper;
import org.peacepact.repo.PeacekeeperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author j-jeurissen
 * @since 0.1.0
 */

@RestController
@RequestMapping("/peacekeeper")
public class PeacekeeperController {
    @Autowired
    private PeacekeeperRepository peacekeeperRepository;

    @RequestMapping(method = RequestMethod.POST)
    public Peacekeeper create(@RequestBody Peacekeeper peacekeeper) {
        return peacekeeperRepository.save(peacekeeper);
    }

    @RequestMapping(method = RequestMethod.GET, value="/{peacekeeperId}")
    public Peacekeeper get(@PathVariable String peacekeeperId) {
        return peacekeeperRepository.findOne(peacekeeperId);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Peacekeeper> getAll() {
        return peacekeeperRepository.findAll();
    }

}
