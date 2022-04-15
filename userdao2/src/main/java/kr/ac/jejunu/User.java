package kr.ac.jejunu;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer id;
    private String name;
    private String password;
}
