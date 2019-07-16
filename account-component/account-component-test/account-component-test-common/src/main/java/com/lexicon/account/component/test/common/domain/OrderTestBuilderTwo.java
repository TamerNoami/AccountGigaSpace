package com.lexicon.account.component.test.common.domain;

import com.lexicon.account.component.domain.Order;
import com.so4it.common.util.object.Required;
import com.so4it.test.domain.AbstractTestBuilder;

import java.math.BigDecimal;

/**
 * @author Magnus Poromaa {@literal <mailto:magnus.poromaa@so4it.com/>}
 */
public class OrderTestBuilderTwo extends AbstractTestBuilder<Order> {

    private Order.Builder builder;


    public OrderTestBuilderTwo(Order.Builder builder) {
        this.builder = Required.notNull(builder, "builder");
        this.builder
                .withAmount(BigDecimal.valueOf(25))
                .withOrderBookId("test2");

    }

    public static OrderTestBuilderTwo builder() {
        return new OrderTestBuilderTwo(Order.builder());
    }

    @Override
    public Order build() {
        return builder.build();
    }
}
