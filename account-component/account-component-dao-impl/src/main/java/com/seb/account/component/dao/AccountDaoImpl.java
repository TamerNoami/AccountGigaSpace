package com.seb.account.component.dao;

import com.lexicon.account.component.entity.AccountEntity;
import com.seb.account.componment.dao.AccountDao;
import com.so4it.component.dao.gs.AbstractSpaceDao;
import org.openspaces.core.GigaSpace;

import static org.openspaces.extensions.QueryExtension.maxEntry;

/**
 * @author Magnus Poromaa {@literal <mailto:magnus.poromaa@so4it.com/>}
 */
public class AccountDaoImpl extends AbstractSpaceDao<AccountEntity, String> implements AccountDao {



    public AccountDaoImpl(GigaSpace gigaSpace) {
        super(gigaSpace);
    }

}



