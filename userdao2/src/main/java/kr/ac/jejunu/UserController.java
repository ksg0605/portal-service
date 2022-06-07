package kr.ac.jejunu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

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

    @RequestMapping(path = "/upload", method = RequestMethod.GET)
    public void upload() {

    }

    @RequestMapping(path = "/upload", method = RequestMethod.POST)
    public ModelAndView upload(@RequestParam("file") MultipartFile file, HttpServletRequest request) throws IOException {
        File path = new File(request.getServletContext().getRealPath("/") + "/WEB-INF/static/" + file.getOriginalFilename());
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        bufferedOutputStream.write(file.getBytes());
        bufferedOutputStream.close();

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("url", "/images/" + file.getOriginalFilename());
        return modelAndView;
    }

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
