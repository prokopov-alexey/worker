package ap.worker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    
    @GetMapping("/")
    public StatusResponse getStatus()
    {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            return new StatusResponse("Exeption");
        }
        
        return new StatusResponse(StatusResponse.STATUS_HEALTHY);
    }
}
