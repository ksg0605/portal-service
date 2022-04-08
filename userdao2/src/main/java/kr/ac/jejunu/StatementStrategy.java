package kr.ac.jejunu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * packageName            : kr.ac.jejunu
 * fileName              : StatementStrategy
 * author                : sunkyu
 * date                  : 2022/04/08
 * description           :
 * ===========================================================
 * DATE              AUTHOR              NOTE
 * -----------------------------------------------------------
 * 2022/04/08           sunkyu             최초 생성
 */
public interface StatementStrategy {

    PreparedStatement makeStatement(Connection connection) throws SQLException;
}
