package junitTesting;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
   StatusBursaTest.class,
   StatusBugetTest.class,
   StatusTaxaTest.class,
   StatusRestantaTest.class
})
public class StatusSuite {

}
