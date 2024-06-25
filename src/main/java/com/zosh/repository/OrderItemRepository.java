package com.zosh.repository;

import com.zosh.model.Orderitem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<Orderitem ,Long> {
}
