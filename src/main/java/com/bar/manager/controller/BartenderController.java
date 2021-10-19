package com.bar.manager.controller;

import com.bar.manager.controller.request.BartenderRequest;
import com.bar.manager.controller.response.BartenderResponse;
import com.bar.manager.exception.BartenderNotFound;
import com.bar.manager.model.Bartender;
import com.bar.manager.service.BartenderService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Validated
@RestController
public class BartenderController {
    private final BartenderService bartenderServ;

    public BartenderController(BartenderService bartenderServ) {

        this.bartenderServ = bartenderServ;
    }

    @GetMapping(value = "bartenders")
    public List<BartenderResponse> getAllBartenders() {
        List<Bartender> bartenders = bartenderServ.findAll();
        List<BartenderResponse> bartenderResponseList = new ArrayList<>();
        for (Bartender bartender : bartenders) {
            bartenderResponseList.add(
                    new BartenderResponse(
                            bartender.getId(),
                            bartender.getName(),
                            bartender.getAge(),
                            bartender.getNif()
                    )

            );
        }
        return bartenderResponseList;
    }

    @PostMapping(value = "/bartenders")
    public BartenderResponse addBartender(@RequestBody @Valid BartenderRequest bartenderRequest) {
        Bartender bartender = bartenderServ.add(
                Bartender.builder()
                        .name(bartenderRequest.getName())
                        .age(bartenderRequest.getAge())
                        .nif(bartenderRequest.getNif())
                        .build()
        );
        return new BartenderResponse(
                bartender.getId(),
                bartender.getName(),
                bartender.getAge(),
                bartender.getNif()

        );

    }
    @GetMapping(value="bartenders/{id}")
    public BartenderResponse getById (@PathVariable (value = "id")String id) {
        Bartender bartender = bartenderServ.findById(id);
        return new BartenderResponse(
                bartender.getId(),
                bartender.getName(),
                bartender.getAge(),
                bartender.getNif()
        );
    }
    @PutMapping(value="bartenders")
    public BartenderResponse updateBartender(@RequestBody BartenderRequest newBartender, @PathVariable String id) throws BartenderNotFound {
        Bartender updateBartender = bartenderServ.update(id,
                Bartender.builder()
                        .nif(newBartender.getNif())
                        .age(newBartender.getAge())
                        .name(newBartender.getName())
                        .build());

        return new  BartenderResponse(
                updateBartender.getId(),
                updateBartender.getName(),
                updateBartender.getAge(),
                updateBartender.getNif()
        );
    }

    @DeleteMapping(value = "/Bartender")
    public void deleteBartender(@PathVariable (value = "id") String id ){
        bartenderServ.deleteBartender(id);
    }

}

