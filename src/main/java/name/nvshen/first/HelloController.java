package name.nvshen.first;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class HelloController {

    protected static Logger logger = LoggerFactory.getLogger(HelloController.class);
    
    @Value("${url}")  
    private String url;
    
    @RequestMapping("/")
    public String helloworld(ModelMap model) {
        logger.debug("访问hello");
        model.put("name", "David");
        model.put("date", new Date());
        return "/jsp/hello";
    }

    @RequestMapping("/hello/{name}")
    @ResponseBody
    public String helloName(@PathVariable String name) {
        logger.debug("访问helloName,Name={}", name);
        return "Hello " + name;
    }
    
    @RequestMapping("/url")
    @ResponseBody
    public String readParam() {
        return "http://" + url;
    }
}