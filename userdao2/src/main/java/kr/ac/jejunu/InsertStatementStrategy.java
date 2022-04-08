package kr.ac.jejunu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * packageName            : kr.ac.jejunu
 * fileName              : InsertStratementStrategy
 * author                : sunkyu
 * date                  : 2022/04/08
 * description           :
 * ===========================================================
 * DATE              AUTHOR              NOTE
 * -----------------------------------------------------------
 * 2022/04/08           sunkyu             최초 생성
 */
public class InsertStatementStrategy implements StatementStrategy {
    private final User user;

    public InsertStatementStrategy(User user) {
        this.user = user;
    }

    public PreparedStatement makeStatement(Connection connection) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(
                "insert into userinfo(name, password) values (?, ?)", Statement.RETURN_GENERATED_KEYS
        );
        preparedStatement.setString(1, user.getName());
        preparedStatement.setString(2, user.getPassword());
        return preparedStatement;
    }
}
