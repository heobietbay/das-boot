package learn.spring.controller;

import learn.spring.model.Shipwreck;
import learn.spring.repository.ShipwreckRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Administrator on 7/12/2016.
 */
@RestController
@RequestMapping("api/v1/")
public class ShipwreckController {

    @RequestMapping(value = "shipwrecks", method = RequestMethod.GET)
    public List<Shipwreck> list()
    {

        return shipwreckRepository.findAll();
    }

    @RequestMapping(value = "shipwrecks", method = RequestMethod.POST)
    public Shipwreck create(@RequestBody Shipwreck shipwreck){
        return shipwreckRepository.saveAndFlush(shipwreck);
    };

    @RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.GET)
    public Shipwreck get(@PathVariable Long id){
        return shipwreckRepository.findOne(id);
    };

    @RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.PUT)
    public Shipwreck update(@PathVariable Long id, @RequestBody Shipwreck shipwreck){
        Shipwreck existing = shipwreckRepository.findOne(id);
        BeanUtils.copyProperties(shipwreck,existing);
        return shipwreckRepository.saveAndFlush(shipwreck);
    };

    @RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.DELETE)
    public Shipwreck delete(@PathVariable Long id){
        Shipwreck existing = shipwreckRepository.findOne(id);
        shipwreckRepository.delete(existing);
        return existing;
    };

    @Autowired
    private ShipwreckRepository shipwreckRepository;
}
