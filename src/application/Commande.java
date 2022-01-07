package application;

public abstract class Commande {
    private String state;

    public Commande(String state) {
        this.state = state;
    }

    public abstract Commande execute(String description);

    public abstract Commande undo();

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
