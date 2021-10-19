package com.bar.manager.service;

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
}
