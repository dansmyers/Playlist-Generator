package cms121_playlist_generator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;

@RestController
public class Controller {
    
    Recommender rec;
    
    
    public Controller() {
        this.rec = new Recommender();
    }


    @RequestMapping("")
    public String index() {
        String indexHtml = null;
    
        try {
            byte[] bytes = Files.readAllBytes(Paths.get("html/index.html"));
        	indexHtml = new String(bytes);
        } catch(Exception e) {
            e.printStackTrace();
        }
    
        return indexHtml;
    }
    
    
    @RequestMapping("/playlist")
    public String playlist() {
        
        // Fill in code to generate a playlist using the Recommender
        // then format the response String as HTML iframes
        
    }


}
