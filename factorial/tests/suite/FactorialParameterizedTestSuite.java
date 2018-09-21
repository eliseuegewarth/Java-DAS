package factorial.tests.suite;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import factorial.tests.NegativeIntegersParameterizedTest;
import factorial.tests.ValidFactorialParameterizedTest;
import factorial.tests.category.FactorialParameterizedCategory;

@RunWith(Categories.class)
@IncludeCategory(FactorialParameterizedCategory.class)
@SuiteClasses( { NegativeIntegersParameterizedTest.class, ValidFactorialParameterizedTest.class })
public class FactorialParameterizedTestSuite {

}