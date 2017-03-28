package org.shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class DataInitializer {

    @Autowired
    private SellerInitializer sellerInitializer;

    @Autowired
    private ProductInitializer productInitializer;

    @Autowired
    private ProposalInitializer proposalInitializer;

    @Autowired
    private UserInitializer userInitializer;

    public DataInitializer() {
    }

    @PostConstruct
    public void initData() {
        sellerInitializer.initSellers();
        userInitializer.initUsers();
        productInitializer.initProducts();
        proposalInitializer.initProposals();
    }
}
