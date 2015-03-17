/**
 * 
 */
package org.nazuz.payroll.server.services.common.sql;

import com.bsiag.scout.rt.server.jdbc.AbstractMySqlSqlService;

/**
 * @author pabo0896
 */
public class MariaDBSqlService extends AbstractMySqlSqlService {

  @Override
  protected String getConfiguredJdbcMappingName() {
    return "jdbc:mysql://mariadb31220-ondevsv.whelastic.net/test";
  }

  @Override
  protected String getConfiguredPassword() {
    return "Uznaz0926$";
  }

  @Override
  protected String getConfiguredUsername() {
    return "root";
  }
}
