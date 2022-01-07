package application;

public class SmartHome {
    private int ref;
    private String title;
    private Adresse adresse;
    private RemoteControl remoteControl;
    public static String logger = "";

    public SmartHome(ConcretSmartHomeBuilder smartHomeBuilder) {
        this.ref = smartHomeBuilder.ref;
        this.title = smartHomeBuilder.title;
        this.adresse = smartHomeBuilder.adresse;
        this.remoteControl = smartHomeBuilder.remoteControl;
    }

    public int getRef() {
        return ref;
    }

    public void setRef(int ref) {
        this.ref = ref;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public RemoteControl getRemoteControl() {
        return remoteControl;
    }

    public void setRemoteControl(RemoteControl remoteControl) {
        this.remoteControl = remoteControl;
    }

    public String report() {
        return logger;
    }

    public static class ConcretSmartHomeBuilder {
        private int ref;
        private String title;
        private Adresse adresse;
        private RemoteControl remoteControl;

        public ConcretSmartHomeBuilder(String title, int ref) {
            this.ref = ref;
            this.title = title;
        }

        public ConcretSmartHomeBuilder withAdresse(Adresse adresse) {
            this.adresse = adresse;
            return this;
        }

        public ConcretSmartHomeBuilder withRemoteControl(RemoteControl remoteControl) {
            this.remoteControl = remoteControl;
            return this;
        }

        public SmartHome build() {
            return new SmartHome(this);
        }
    }
}
