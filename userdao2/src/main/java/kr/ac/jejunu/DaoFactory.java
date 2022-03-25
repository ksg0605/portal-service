package kr.ac.jejunu;

/**
 * packageName            : kr.ac.jejunu
 * fileName              : DaoFactory
 * author                : sunkyu
 * date                  : 2022/03/25
 * description           :
 * ===========================================================
 * DATE              AUTHOR              NOTE
 * -----------------------------------------------------------
 * 2022/03/25           sunkyu             최초 생성
 */
public class DaoFactory {
    public UserDao getUserDao() {
        return new UserDao(getConnectionMaker());
    }

    public ConnectionMaker getConnectionMaker() {
        return new JejuConnectionMaker();
    }
}
