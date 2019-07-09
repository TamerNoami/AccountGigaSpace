package se.lexicon.account.component.domain;

import com.so4it.common.domain.DomainClass;
import com.so4it.common.util.object.Required;
import com.so4it.common.util.object.ValueObject;

/**
 * @author Magnus Poromaa {@literal <mailto:magnus.poromaa@so4it.com/>}
 */
@DomainClass
public class BookOrder extends ValueObject {

    private static final long serialVersionUID = 1L;


    private String id;

    private String accountId;

    private Double cost;

    private String name;


    private BookOrder() {
    }

    private BookOrder(Builder builder) {
        this.id = Required.notNull(builder.id,"id");
        this.accountId = Required.notNull(builder.accountId,"accountId");
        this.cost = Required.notNull(builder.cost,"cost");
        this.name = Required.notNull(builder.name,"name");
    }


    public String getId() {
        return id;
    }


    public String getAccountId() {
        return accountId;
    }

    public Double getCost() {
        return cost;
    }

    public String getName() { return  name;}


    @Override
    protected Object[] getIdFields() {
        return new Object[]{id,accountId,cost,name};
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder implements com.so4it.common.builder.Builder<BookOrder>{


        private String id;

        private String accountId;

        private Double cost;

        private String name;



        public Builder withId(String id){
            this.id = id;
            return this;
        }

        public Builder withAccountId(String accountId){
            this.accountId = accountId;
            return this;
        }


        public Builder withCost(Double cost){
            this.cost = cost;
            return this;
        }

        public Builder withName(String name){
            this.name = name;
            return this;
        }

        @Override
        public BookOrder build() {
            return new BookOrder(this);
        }
    }


}
