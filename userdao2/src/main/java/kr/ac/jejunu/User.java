package kr.ac.jejunu;

/**
 * packageName            : kr.ac.jejunu
 * fileName              : User
 * author                : sunkyu
 * date                  : 2022/03/18
 * description           :
 * ===========================================================
 * DATE              AUTHOR              NOTE
 * -----------------------------------------------------------
 * 2022/03/18           sunkyu             최초 생성
 */
public class User {
    private Integer id;
    private String name;
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
