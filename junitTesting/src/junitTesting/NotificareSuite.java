package junitTesting;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
@RunWith(Suite.class)
@Suite.SuiteClasses({
   NotificareFaraDetalii.class,
   TesteazaNotificareEmail.class,
   TesteazaNotificareTelefon.class
})
public class NotificareSuite {   
}  