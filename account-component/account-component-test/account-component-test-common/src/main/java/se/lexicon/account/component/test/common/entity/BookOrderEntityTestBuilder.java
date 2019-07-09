package se.lexicon.account.component.test.common.entity;

import com.so4it.common.util.object.Required;
import com.so4it.test.domain.AbstractTestBuilder;
import se.lexicon.account.component.entity.BookOrderEntity;

/**
 * @author Magnus Poromaa {@literal <mailto:magnus.poromaa@so4it.com/>}
 */
public class BookOrderEntityTestBuilder extends AbstractTestBuilder<BookOrderEntity> {

    private BookOrderEntity.Builder builder;


    public BookOrderEntityTestBuilder(BookOrderEntity.Builder builder) {
        this.builder = Required.notNull(builder, "builder");
        this.builder
                .withId("test")
                .withAccountId("1111111111")
                .withCost(22D)
                .withName("Java");

    }

    public static BookOrderEntityTestBuilder builder() {
        return new BookOrderEntityTestBuilder(BookOrderEntity.builder());
    }

    @Override
    public BookOrderEntity build() {
        return builder.build();
    }
}
