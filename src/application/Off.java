package application;

public class Off extends Commande{
    public Off() {
        super("Off");
    }

    @Override
    public Commande execute(String description) {
        SmartHome.logger += " Off-" + description;
        return this;
    }

    @Override
    public Commande undo() {
        return new On();
    }
}
