package org.kingxkm.mblog.web;


//@Controller
//@RequestMapping(value = "/user")
public class UserController {

 //   @Autowired
  //  private UserService userService;

//    @RequestMapping(value="/list1")
//    @ResponseBody
//        public String tuser(Model m) {
//        System.out.println(userService.getAllUser());
//        return JSON.toJSONString(userService.getAllUser());
//    }

  //  @RequestMapping(value="/list1")
    public String guser() {
    //    m.addAttribute("user", userService.getUser(2L));
     //   System.out.println(JSON.toJSONString(userService.getUser(2L)));
        return "user";
    }

}