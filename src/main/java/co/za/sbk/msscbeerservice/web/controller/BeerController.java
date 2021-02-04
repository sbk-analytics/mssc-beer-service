package co.za.sbk.msscbeerservice.web.controller;

import co.za.sbk.msscbeerservice.services.BeerService;
import co.za.sbk.msscbeerservice.web.model.BeerDto;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

/**
 * @author Thato Seboko on 2021/02/04
 */

@RequiredArgsConstructor
@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {
    
    private final BeerService beerService;
    
    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId) {
      
        return new ResponseEntity<>(beerService.getById(beerId), HttpStatus.OK);
    }
    
    @PostMapping
    public ResponseEntity<BeerDto> saveBeer(@RequestBody @Validated BeerDto beerDto) {

        return new ResponseEntity<>(beerService.saveNewBeer(beerDto), HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity<BeerDto> updateBeerById(@PathVariable("beerId") UUID beerId, @RequestBody @Validated BeerDto beerDto) {
        
        return new ResponseEntity<>(beerService.updateById(beerId, beerDto), HttpStatus.NO_CONTENT);
    }

}
