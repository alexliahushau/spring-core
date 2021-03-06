package org.shop.api;

import java.util.List;

import org.shop.data.Seller;
import org.springframework.stereotype.Component;

public interface SellerService {
    
    void importSellers(List<Seller> sellers);
    
    List<Seller> getSellers();
    
    Seller getSellerById(Long sellerId);
}
