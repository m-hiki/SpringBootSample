package front.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @RequestMapping(value="/hello", method=RequestMethod.GET)
    public String getHello() {
        return "[GET]Hello, world!";
    }

    @RequestMapping(value="/hello", method=RequestMethod.POST)
    public String postHello() {
        return "[POST]Hello, world!";
    }
}
