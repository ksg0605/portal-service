package kr.ac.jejunu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * packageName            : kr.ac.jejunu
 * fileName              : DeleteStatementStrategy
 * author                : sunkyu
 * date                  : 2022/04/08
 * description           :
 * ===========================================================
 * DATE              AUTHOR              NOTE
 * -----------------------------------------------------------
 * 2022/04/08           sunkyu             최초 생성
 */
public class DeleteStatementStrategy implements StatementStrategy {

    private Integer id;

    public DeleteStatementStrategy(Integer id) {
        this.id = id;
    }

    @Override
    public PreparedStatement makeStatement(Connection connection) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(
                "delete from userinfo where id = ?"
        );
        preparedStatement.setInt(1, id);
        return preparedStatement;
    }
}
