package factorial.tests.suite;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import factorial.tests.InvalidFactorialTest;
import factorial.tests.NegativeIntegersParameterizedTest;
import factorial.tests.ValidFactorialParameterizedTest;
import factorial.tests.category.FactorialCategory;

@RunWith(Categories.class)
@IncludeCategory(FactorialCategory.class)
@SuiteClasses( { InvalidFactorialTest.class, NegativeIntegersParameterizedTest.class, ValidFactorialParameterizedTest.class })
public class AllFactorialTestSuite{
}