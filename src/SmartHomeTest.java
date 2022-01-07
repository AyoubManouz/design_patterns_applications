import application.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class SmartHomeTest {

    @Test
    public void report() {
        int nbrSlot = 2;
        Adresse adresse = new Adresse(123, "agadir");
        Device tv = new Tv();
        Device camera = new Camera();
        RemoteControl remoteControl = new RemoteControl(nbrSlot);
        remoteControl.init(tv, camera);
        SmartHome smartHome = new SmartHome.ConcretSmartHomeBuilder("my Home", 12345)
                .withAdresse(adresse)
                .withRemoteControl(remoteControl)
                .build();
        smartHome.getRemoteControl().onButtonPressed(0);
        smartHome.getRemoteControl().offButtonPressed(0);
        smartHome.getRemoteControl().undoButtonPressed();
        smartHome.getRemoteControl().onButtonPressed(1);
        smartHome.getRemoteControl().offButtonPressed(1);
        smartHome.getRemoteControl().undoButtonPressed();
        assertEquals(" On-TV Off-TV On-TV On-Camera Off-Camera On-Camera", smartHome.report());
    }
}
