package com.cydeo.lab04springmvc.Controller;

import com.cydeo.lab04springmvc.service.CartService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CartController {

    //need to inject cart object
    private final CartService cartService;

    //we use cartservice instead of cartserviceimpl for loosely coupled
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @RequestMapping("/cart-list")
    public String listCarts(Model model){

        model.addAttribute("cartList",cartService.retrieveCartList());

        return "cart/cart-list";
    }

}
