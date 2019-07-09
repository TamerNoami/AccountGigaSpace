package se.lexicon.account.component.service;

import com.so4it.gs.rpc.Routing;
import se.lexicon.account.component.domain.Account;
import se.lexicon.account.component.domain.BookOrder;

public interface BookOrderComponentService {

    String DEFAULT_BEAN_NAME = "bookOrderComponentService";

    //account.hashCode() % numberOfPartitions
    void createOrder(@Routing("getAccountId") BookOrder bookOrder);




}
