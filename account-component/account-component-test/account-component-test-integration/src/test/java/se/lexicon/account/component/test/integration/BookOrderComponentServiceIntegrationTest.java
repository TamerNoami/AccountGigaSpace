package se.lexicon.account.component.test.integration;

import com.so4it.test.category.IntegrationTest;
import com.so4it.test.gs.rule.ClearGigaSpaceTestRule;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.rules.RuleChain;
import org.openspaces.core.GigaSpace;
import se.lexicon.account.component.service.BookOrderComponentService;
import se.lexicon.account.component.test.common.domain.BookOrderTestBuilder;

/**
 * @author Magnus Poromaa {@literal <mailto:magnus.poromaa@so4it.com/>}
 */
@Category(IntegrationTest.class)
public class BookOrderComponentServiceIntegrationTest {

    @ClassRule
    public static final RuleChain SUITE_RULE_CHAIN = BookOrderComponentIntegrationTestSuite.SUITE_RULE_CHAIN;

    @Rule
    public ClearGigaSpaceTestRule clearGigaSpaceTestRule = new ClearGigaSpaceTestRule(BookOrderComponentIntegrationTestSuite.getExportContext().getBean(GigaSpace.class));

    @Test
    public void testCreatingAccountBalance(){
        BookOrderComponentService bookOrderComponentService = BookOrderComponentIntegrationTestSuite.getImportContext().getBean(BookOrderComponentService.class);
        bookOrderComponentService.createOrder(BookOrderTestBuilder.builder().build());

    }

}
