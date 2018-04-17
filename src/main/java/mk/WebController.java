package mk;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;




import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller


class WebController {
	

    
	 private static Logger log = LoggerFactory.getLogger(WebController.class);



    @GetMapping("/")
    public String welcomeVIEW(Model model) {


        
    	log.info("welcomeVIEW executed");
    	

    	
    	log.info("Message sent");

    	System.out.println("END");
        return "welcome";
    }



}