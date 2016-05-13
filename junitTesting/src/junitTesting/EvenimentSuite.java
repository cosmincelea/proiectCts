package junitTesting;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
   TestHackthone.class,
   TestWorkshop.class,
   TestConferinta.class
})
public class EvenimentSuite {

}
