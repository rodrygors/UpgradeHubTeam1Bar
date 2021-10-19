package com.bar.manager.service;

import com.bar.manager.controller.response.BartenderResponse;
import com.bar.manager.exception.BartenderNotFound;
import com.bar.manager.exception.DuplicateBartenderException;
import com.bar.manager.model.Bartender;
import com.bar.manager.repository.BartenderRepository;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BartenderService {
    private final BartenderRepository bartenderRepo;

    public BartenderService(BartenderRepository bartenderRepo) {
        this.bartenderRepo = bartenderRepo;
    }

    public void deleteBartender(String id) {
        this.findById(id);
        bartenderRepo.deleteById(id);
    }

    public List<Bartender> findAll() {
        return bartenderRepo.findAll();
    }

    public Bartender add(Bartender bartender)  {
       try {
            return bartenderRepo.save(bartender);
        }
       catch (DuplicateKeyException e) {
           throw new DuplicateBartenderException();
       }
    }

    public Bartender findById(String id) {
       return bartenderRepo.findById(id).orElseThrow(BartenderNotFound::new);
    }

    public Bartender update(String id, Bartender newBartender) {
        Bartender bartender = this.findById(id);
        bartender.setNif(newBartender.getNif());
        bartender.setName(newBartender.getName());
        bartender.setAge(newBartender.getAge());
        try {
            return bartenderRepo.save(bartender);
        }
        catch (DuplicateKeyException e) {
            throw new DuplicateBartenderException();
        }
    }
}
