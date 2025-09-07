package akash.HostInitilizer;
import java.util.*;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class pro {

    @RequestMapping("/hii")
    public String  why(@RequestParam (required = false)Integer  n){

        if(n==null) {
           return ("If you want to say hii press 1" + "/n" + "If you want to say hello press 2");
        }
        if(n==1){return "hii";}
        if(n==2){return "dev randi";}
        return "wrong";
    }
}
