package org.nazuz.payroll.ui.rap;

import org.eclipse.scout.rt.ui.rap.AbstractStandaloneRwtEnvironment;
import org.nazuz.payroll.client.ClientSession;

public class StandaloneRwtEnvironment extends AbstractStandaloneRwtEnvironment {

  public StandaloneRwtEnvironment() {
    super(Activator.getDefault().getBundle(), ClientSession.class);
  }
}
