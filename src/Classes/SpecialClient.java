package Classes;

public class SpecialClient extends Actor {

    private String actionName;
    private static int clientNumber = 0;

    public SpecialClient(String name, String actionName) {
        super(name);
        this.actionName = actionName;
        clientNumber++;
    }

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public static int getClientNumber() {
        return clientNumber;
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    @Override
    public void setTakeOrder(boolean pickUpOrder) {
        super.isTakeOrder = pickUpOrder;
    }

    @Override
    public Actor getActor() {
        return this;
    }

}