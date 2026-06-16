package org.gumball.burgerman.kms.fryline;

import org.gumball.burgerman.kms.fryline.model.Acknowledgement;
import org.gumball.burgerman.kms.common.model.Order;
import org.gumball.burgerman.kms.fryline.service.FryLineService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FryLineController {

    private final FryLineService fryLineService;

    public FryLineController(FryLineService fryLineService) {
        this.fryLineService = fryLineService;
    }

    @PostMapping("/orders")
    public Acknowledgement processOrder(@RequestBody Order order) {
        return fryLineService.processOrder(order);
    }
}
