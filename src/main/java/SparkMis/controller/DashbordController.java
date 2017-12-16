package SparkMis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  
//@RequestMapping("/user") 
public class DashbordController {
      
    /*@RequestMapping("/")  
    public String toIndex(){  
        return "index";  
    }  */
    
    @RequestMapping("/showUser")  
    public String toUser(){  
        return "showUser";  
    }

}
