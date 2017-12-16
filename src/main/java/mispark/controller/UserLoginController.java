package mispark.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mysys")
public class UserLoginController {
	/*@Autowired
	IUserDao userMapper;

	@RequestMapping(value = "/login")
	@ResponseBody
	public String login() {
		User user = userMapper.findByName("zhuzhiyong");
		return user.getName() + "-----" + user.getAge();
	}*/
	
	/*@Controller  
@RequestMapping("/user")  
public class UserController {  
    @Resource  
    private IUserService userService;  
      
    @RequestMapping("/showUser")  
    public String toIndex(HttpServletRequest request,Model model){  
        int userId = Integer.parseInt(request.getParameter("id"));  
        User user = this.userService.getUserById(userId);  
        model.addAttribute("user", user);  
        return "showUser";  
    }  
}  */
}
