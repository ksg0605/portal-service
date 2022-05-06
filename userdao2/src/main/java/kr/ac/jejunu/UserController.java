package kr.ac.jejunu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * packageName            : kr.ac.jejunu
 * fileName              : UserController
 * author                : sunkyu
 * date                  : 2022/05/06
 * description           :
 * ===========================================================
 * DATE              AUTHOR              NOTE
 * -----------------------------------------------------------
 * 2022/05/06           sunkyu             최초 생성
 */
//@RequestMapping("/user")
@Controller
public class UserController {
    @RequestMapping("/user2")
    public ModelAndView user(
            @RequestParam("id") Integer id,
            @RequestParam("name") String name) {

        User user = new User();
        user.setId(id);
        user.setName(name);
        ModelAndView modelAndView = new ModelAndView("user");
        modelAndView.addObject(user);
        return modelAndView;

    }
}
