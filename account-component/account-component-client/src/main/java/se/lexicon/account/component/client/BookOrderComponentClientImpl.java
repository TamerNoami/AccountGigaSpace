package se.lexicon.account.component.client;

import com.so4it.common.util.object.Required;
import se.lexicon.account.component.domain.BookOrder;
import se.lexicon.account.component.service.BookOrderComponentService;

/**
 * @author Magnus Poromaa {@literal <mailto:magnus.poromaa@so4it.com/>}
 */
public class BookOrderComponentClientImpl implements BookOrderComponentClient{

    private BookOrderComponentService bookOrderComponentService;


    public BookOrderComponentClientImpl(BookOrderComponentService bookOrderComponentService) {
        this.bookOrderComponentService = Required.notNull(bookOrderComponentService,"bookOrderComponentService");
    }


    @Override
    public void createOrder(BookOrder bookOrder) {
    bookOrderComponentService.createOrder(bookOrder);
    }
}
