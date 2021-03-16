package com.baidu.shop.feign;

import com.baidu.shop.base.Result;
import com.baidu.shop.dto.OrderInfo;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "order-server")
public interface OrderFeign {
    @ApiOperation(value = "通过orderId查询订单信息")
    @GetMapping(value = "order/getOrderInfoByOrderId")
    Result<OrderInfo> getOrderInfoByOrderId(@RequestParam Long orderId);
}
