package com.example.orderwarehouse.repo.jdbc;

import com.example.orderwarehouse.data.entity.ShippingOrdersEntity;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BuildRepository {
    private JdbcTemplate jdbcTemplatePostgres;

    public BuildRepository(
            @Qualifier("postgres_data_source") JdbcTemplate jdbcTemplatePostgres
    ) {
        this.jdbcTemplatePostgres = jdbcTemplatePostgres;
    }

    public List<ShippingOrdersEntity> getShippingOrdersLines() {
        final String queryShippingOrders = "with exist_order as (select\n" +
                "        order_line_id, order_id, customer_id, customer_name,\n" +
                "        delivery_address, delivery_date, order_date, packed_weight,\n" +
                "        stock_id\n" +
                "        from orders.order o),\n" +
                "    current_stock as (select\n" +
                "        stock_id, stock_capacity, stock_name\n" +
                "        from orders.stock s)\n" +
                "select o.stock_id, order_line_id, order_id, stock_capacity, stock_name, customer_id, customer_name,\n" +
                "       delivery_address, delivery_date, order_date, packed_weight\n" +
                "from exist_order o left join current_stock s on o.stock_id = s.stock_id";
        return jdbcTemplatePostgres.query(queryShippingOrders, (rs, rownum) -> {
            ShippingOrdersEntity so = new ShippingOrdersEntity();
            so.setStockId(rs.getInt("stock_id"));
            so.setOrderLineId(rs.getInt("order_line_id"));
            so.setOrderId(rs.getLong("order_id"));
            so.setStockCapacity(rs.getInt("stock_capacity"));
            so.setStockName(rs.getString("stock_name"));
            so.setCustomerId(rs.getInt("customer_id"));
            so.setCustomerName(rs.getString("customer_name"));
            so.setDeliveryAddress(rs.getString("delivery_address"));
            so.setDeliveryDate(rs.getDate("delivery_date"));
            so.setOrderDate(rs.getDate("order_date"));
            so.setPackedWeight(rs.getInt("packed_weight"));
            return so;
        });
    }
}
