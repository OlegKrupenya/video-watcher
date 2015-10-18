package messaging;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.util.Calendar;
import java.util.Date;

/**
 * Processes information about time of connection
 * and notifies all connected users regarding time of playing of the video
 * @author oleg.krupenya
 */
@Controller
public class VideoTimerController {

    public static final int TIME_DELAY = 5;

    @MessageMapping("/stomp")
    @SendTo("/topic/greetings")
    public Date sendTimeOfBeginningOfPlayingVideo(ClientConnectionData connectionData) throws Exception {
        Calendar now = Calendar.getInstance();
        now.add(Calendar.SECOND, TIME_DELAY);
        return now.getTime();
    }
}
