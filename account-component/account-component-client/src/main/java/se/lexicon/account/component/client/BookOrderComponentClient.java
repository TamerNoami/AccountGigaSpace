package se.lexicon.account.component.client;

import se.lexicon.account.component.domain.BookOrder;

/**
 * @author Magnus Poromaa {@literal <mailto:magnus.poromaa@so4it.com/>}
 */
public interface BookOrderComponentClient {



    void createOrder(BookOrder bookOrder);
}
