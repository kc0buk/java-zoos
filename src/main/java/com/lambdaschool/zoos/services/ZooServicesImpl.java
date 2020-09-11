package com.lambdaschool.zoos.services;

import com.lambdaschool.zoos.models.Zoo;
import com.lambdaschool.zoos.repository.ZooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = "zooServices")
public class ZooServicesImpl implements ZooServices {

    @Autowired
    ZooRepository zoorepo;

    @Override
    public List<Zoo> findAllZoos() {
        List<Zoo> allZoosList = new ArrayList<>();
        zoorepo.findAll().iterator().forEachRemaining(allZoosList::add);
        return allZoosList;
    }
}
