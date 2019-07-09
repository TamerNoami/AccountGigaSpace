package se.lexicon.account.component.service;

import com.so4it.common.util.object.Required;
import com.so4it.gs.rpc.ServiceExport;
import se.lexicon.account.component.domain.BookOrder;
import se.lexicon.account.component.entity.BookOrderEntity;
import se.lexicon.account.componment.dao.BookOrderDao;

@ServiceExport({AccountComponentService.class})
public class BookOrderComponentServiceImpl implements BookOrderComponentService {


    private final BookOrderDao bookOrderDao;

    public BookOrderComponentServiceImpl(BookOrderDao bookOrderDao) {
        this.bookOrderDao = Required.notNull(bookOrderDao, "bookOrderDao");
    }


    @Override
    public void createOrder(BookOrder bookOrder) {
        BookOrderEntity bookOrderEntity = BookOrderEntity.builder().withAccountId(bookOrder.getAccountId()).withCost(bookOrder.getCost()).withName(bookOrder.getName()).build();
        bookOrderDao.insert(bookOrderEntity);
    }
}