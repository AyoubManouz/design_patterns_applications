package application;

public class RemoteControl {
    private int nbrSlot;
    private Device[] devices;
    private int lastDevicePressedId;

    public RemoteControl(int nbrSlot) {
        this.nbrSlot = nbrSlot;
        this.devices = new Device[nbrSlot];
    }

    public void init(Device ... devices) {
        this.devices = devices;
    }

    public void onButtonPressed(int deviceId) {
        this.devices[deviceId].setCommande(new On().execute(devices[deviceId].getDescription()));
        this.lastDevicePressedId = deviceId;
    }

    public void offButtonPressed(int deviceId) {
        this.devices[deviceId].setCommande(new Off().execute(devices[deviceId].getDescription()));
        this.lastDevicePressedId = deviceId;
    }

    public void undoButtonPressed() {
        this.devices[lastDevicePressedId].setCommande(
                this.devices[lastDevicePressedId].getCommande().undo().execute(devices[lastDevicePressedId].getDescription())
        );
    }

}
