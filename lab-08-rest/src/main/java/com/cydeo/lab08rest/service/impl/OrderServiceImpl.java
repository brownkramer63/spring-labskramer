package com.cydeo.lab08rest.service.impl;

import com.cydeo.lab08rest.dto.OrderDTO;
import com.cydeo.lab08rest.enums.PaymentMethod;
import com.cydeo.lab08rest.mapper.MapperUtil;
import com.cydeo.lab08rest.repository.OrderRepository;
import com.cydeo.lab08rest.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderServiceImpl implements OrderService {

   private final OrderRepository orderRepository;
    private final MapperUtil mapperUtil;

    public OrderServiceImpl(OrderRepository orderRepository, MapperUtil mapperUtil) {
        this.orderRepository = orderRepository;
        this.mapperUtil = mapperUtil;
    }


    @Override
    public List<OrderDTO> retrieveListOrder() {
        return orderRepository.findAll().stream().map(order -> mapperUtil.convert(order, new OrderDTO())).collect(Collectors.toList());
    }

    @Override
    public OrderDTO updateOrder(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public OrderDTO createOrder(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public List<OrderDTO> retrieveOrderByPaymentMethod(PaymentMethod paymentMethod) {
        return null;
    }

    @Override
    public List<OrderDTO> retrieveOrderByEmail(String email) {
        return null;
    }
}
