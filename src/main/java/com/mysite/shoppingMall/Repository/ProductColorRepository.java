package com.mysite.shoppingMall.Repository;

import com.mysite.shoppingMall.Domain.ProductColor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductColorRepository extends JpaRepository<ProductColor, Long> {
}
