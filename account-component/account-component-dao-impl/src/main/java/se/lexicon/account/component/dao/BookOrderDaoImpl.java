package se.lexicon.account.component.dao;

import com.so4it.component.dao.gs.AbstractSpaceDao;
import org.openspaces.core.GigaSpace;
import se.lexicon.account.component.entity.BookOrderEntity;
import se.lexicon.account.componment.dao.BookOrderDao;

/**
 * @author Magnus Poromaa {@literal <mailto:magnus.poromaa@so4it.com/>}
 */
public class BookOrderDaoImpl extends AbstractSpaceDao<BookOrderEntity, String> implements BookOrderDao {



    public BookOrderDaoImpl(GigaSpace gigaSpace) {
        super(gigaSpace);
    }

}



