package uz.colibri.os_project;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Author: Rustambekov Avazbek
 * Date: 09/12/2019
 * Time: 17:46
 */

@ApiIgnore
@RestController
public class HomeController {

    @ApiOperation(value = "", hidden = true)
    @RequestMapping(value = "/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }

}
