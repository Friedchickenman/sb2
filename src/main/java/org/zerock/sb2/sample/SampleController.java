package org.zerock.sb2.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {
    

    @GetMapping("hello")
    public void hello(){
        System.out.println("Hello");
    }

}
