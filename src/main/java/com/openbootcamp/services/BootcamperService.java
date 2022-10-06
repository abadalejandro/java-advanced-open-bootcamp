package com.openbootcamp.services;

import com.openbootcamp.models.Bootcamper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

@Service
public class BootcamperService {
    private List<Bootcamper> bootcampers = new ArrayList();


    public List<Bootcamper> getAll() {
        return this.bootcampers;
    }

    public void add(Bootcamper bootcamper) {
        this.bootcampers.add(bootcamper);
    }

    public Bootcamper getByName(String name) {
        for (Bootcamper bootcamper : bootcampers) {
            if (bootcamper.getNombre().equalsIgnoreCase(name)) {
                return bootcamper;
            }
        }
        return null;
    }

    public void removeByName(String name) {
        Bootcamper previousBootcamper = getByName(name);
        if (previousBootcamper != null) {
            this.bootcampers = this.bootcampers.stream().filter(bootcamper -> !bootcamper.getNombre().equalsIgnoreCase(name)).collect(Collectors.toList());
        }
    }

    public void updateByName(Bootcamper bootcamper) {
        this.bootcampers = this.bootcampers.stream().map(bootc -> {
            if (bootc.getNombre().equalsIgnoreCase(bootcamper.getNombre())) {
                return bootcamper;
            }
            return bootc;
        }).collect(Collectors.toList());
    }


}
