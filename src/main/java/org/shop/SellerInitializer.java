package org.shop;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.shop.api.SellerService;
import org.shop.data.Seller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SellerInitializer {

    @Autowired
    private SellerService sellerService;

    private Map<Long, String> sellerNames = Collections.emptyMap();

    public void initSellers() {
        List<Seller> sellers = new LinkedList<Seller>();

        Seller seller1 = new Seller();
        seller1.setId(1L);
        seller1.setName("org.shop.common.Sellers.AMAZON");

        Seller seller2 = new Seller();
        seller2.setId(2L);
        seller2.setName("org.shop.common.Sellers.SAMSUNG");

        Seller seller3 = new Seller();
        seller3.setId(3L);
        seller3.setName("Apple");

        sellers.add(seller1);
        sellers.add(seller2);
        sellers.add(seller3);


        sellerService.importSellers(sellers);
    }
}
