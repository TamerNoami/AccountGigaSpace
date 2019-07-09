package se.lexicon.account.component.service;

import com.so4it.gs.rpc.Service;
import com.so4it.gs.rpc.ServiceBindingType;
import com.so4it.gs.rpc.ServiceProvider;

@ServiceProvider
public interface BookOrderComponentServiceProvider {

    @Service(value = ServiceBindingType.GS_REMOTING, name = BookOrderComponentService.DEFAULT_BEAN_NAME)
    BookOrderComponentService getInvoiceComponentService();
}
