package ap.worker;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.quartz.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@AllArgsConstructor
public class MainController {

    private final Scheduler scheduler;

    @SneakyThrows
    @GetMapping("/autoscale-test/do")
    public String getStatus() {
        String id = UUID.randomUUID().toString();

        JobDetail job = JobBuilder
                .newJob(Job.class)
                .withIdentity(id)
                .build();

        Trigger trigger = TriggerBuilder.newTrigger()
                .withIdentity(id)
                .startNow()
                .build();
        scheduler.scheduleJob(job, trigger);

        return "{\"status\":\"ok\"}";
    }
}
