package se.lexicon.account.component.test.integration;

import se.lexicon.account.component.client.AccountComponentClient;
import se.lexicon.account.component.entity.AccountEntity;
import se.lexicon.account.component.test.common.domain.AccountTestBuilder;
import com.so4it.test.category.IntegrationTest;
import com.so4it.test.gs.rule.ClearGigaSpaceTestRule;
import org.junit.Assert;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.rules.RuleChain;
import org.openspaces.core.GigaSpace;

/**
 * @author Magnus Poromaa {@literal <mailto:magnus.poromaa@so4it.com/>}
 */
@Category(IntegrationTest.class)
public class AccountComponentClientIntegrationTest {

    @ClassRule
    public static final RuleChain SUITE_RULE_CHAIN = AccountComponentIntegrationTestSuite.SUITE_RULE_CHAIN;

    @Rule
    public ClearGigaSpaceTestRule clearGigaSpaceTestRule = new ClearGigaSpaceTestRule(AccountComponentIntegrationTestSuite.getExportContext().getBean(GigaSpace.class));

    @Test
    public void testCreatingAccount(){
        AccountComponentClient accountComponentClient = AccountComponentIntegrationTestSuite.getImportContext().getBean(AccountComponentClient.class);
        accountComponentClient.createAccount(AccountTestBuilder.builder().build());


        Assert.assertEquals(1,AccountComponentIntegrationTestSuite.getExportContext().getBean(GigaSpace.class).count(AccountEntity.templateBuilder().build()));

    }

}
