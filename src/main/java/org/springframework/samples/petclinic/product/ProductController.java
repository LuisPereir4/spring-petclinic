 package org.springframework.samples.petclinic.product;

    import org.springframework.web.bind.annotation.RestController;
    import org.springframework.stereotype.Controller;
    import org.springframework.ui.Model;
    import org.springframework.web.bind.annotation.GetMapping;
    import java.util.ArrayList;
    import java.util.List;

@Controller
public class ProductController {
    @GetMapping("/products")
    public String showProductList(Model model){

        List<Product> prods = new ArrayList<Product>();
        model.addAttribute("products", prods);

        prods.add (new Product("Lipe", "Antisocial"));
        prods.add (new Product("Renata", "Comer"));
        prods.add (new Product("Luis", "Acorda antes de chegar na parada"));
        prods.add (new Product("Cleiber", "Meme guy"));
        prods.add (new Product("Cleyson", "Tudo"));
        prods.add (new Product("Isabella", "Não dividir talheres e afins"));
        prods.add (new Product("Giovani", "Ficar de boas"));
        prods.add (new Product("Victor", "Sabe cozinhar"));
        prods.add (new Product("Giovani", "Ficar de boas"));

        return "products/productsList";
    }
}
