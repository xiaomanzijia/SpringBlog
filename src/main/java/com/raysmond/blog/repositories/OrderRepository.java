package com.raysmond.blog.repositories;

import com.raysmond.blog.models.Order;
import com.raysmond.blog.models.Setting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Setting, Long> {
    Order findOrderById(long orderId);
}
