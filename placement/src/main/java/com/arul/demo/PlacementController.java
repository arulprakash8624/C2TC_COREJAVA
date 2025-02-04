package com.arul.demo;

import com.arul.demo.model.Placement;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/placements")
public class PlacementController {
    private final PlacementService placementService;

    public PlacementController(PlacementService placementService) {
        this.placementService = placementService;
    }

    @PostMapping
    public Placement createPlacement(@RequestBody Placement placement) {
        return placementService.savePlacement(placement);
    }
}
