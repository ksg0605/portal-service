package kr.ac.jejunu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * packageName            : kr.ac.jejunu
 * fileName              : HallaUserDao
 * author                : sunkyu
 * date                  : 2022/03/25
 * description           :
 * ===========================================================
 * DATE              AUTHOR              NOTE
 * -----------------------------------------------------------
 * 2022/03/25           sunkyu             최초 생성
 */
public class HallaConnectionMaker implements ConnectionMaker {
    @Override
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        //드라이버 로딩
        Class.forName("com.mysql.cj.jdbc.Driver");

        //커넥션
        return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/jeju",
                "jeju",
                "Tjsrb0605!"
        );
    }
}
