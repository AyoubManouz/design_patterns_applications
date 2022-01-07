package application;

public class On extends Commande{
    public On() {
        super("On");
    }

    @Override
    public Commande execute(String description) {
        SmartHome.logger += " On-" + description;
        return this;
    }

    @Override
    public Commande undo() {
        return new Off();
    }
}
