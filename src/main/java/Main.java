import Listeners.ping;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class Main {
    public static void main(String[] args) throws Exception {
        JDA api = JDABuilder.createDefault("ODYxMDY2MTMyOTY5NzUwNTI4.YOEYUw.OOYK1wPtZipVFj2gaEMH80_fr4E").build();

        api.addEventListener(new ping());
    }
}
