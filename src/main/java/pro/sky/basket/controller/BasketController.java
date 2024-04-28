package pro.sky.basket.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.basket.service.BasketService;

import java.util.List;

@RestController
@RequestMapping("/order")
public class BasketController {
    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping(path = "/add")
    public List<Integer> add(@RequestParam("id") List<Integer> ids) {
        return basketService.add(ids);
    }

    @GetMapping(path = "/get")
    public List<Integer> get() {
        return basketService.get();
    }
}
