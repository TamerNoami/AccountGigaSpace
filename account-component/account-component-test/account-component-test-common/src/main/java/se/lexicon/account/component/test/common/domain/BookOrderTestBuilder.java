package se.lexicon.account.component.test.common.domain;

import com.so4it.common.util.object.Required;
import com.so4it.test.domain.AbstractTestBuilder;
import se.lexicon.account.component.domain.BookOrder;

/**
 * @author Magnus Poromaa {@literal <mailto:magnus.poromaa@so4it.com/>}
 */
public class BookOrderTestBuilder extends AbstractTestBuilder<BookOrder> {

    private BookOrder.Builder builder;


    public BookOrderTestBuilder(BookOrder.Builder builder) {
        this.builder = Required.notNull(builder, "builder");
        this.builder
                .withId("test")
                .withAccountId("1111111111")
                .withCost(22D)
                .withName("Java");

    }

    public static BookOrderTestBuilder builder() {
        return new BookOrderTestBuilder(BookOrder.builder());
    }

    @Override
    public BookOrder build() {
        return builder.build();
    }
}
