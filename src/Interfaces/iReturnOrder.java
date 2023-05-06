package Interfaces;

import Classes.Actor;

public interface iReturnOrder {
    void returnOrder(Actor order);

    boolean canReturnOrder(Actor order);
}

public class OrdinaryClient implements iActorBehaviour, iReturnOrder {

    @Override
    public void returnOrder(Actor order) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'returnOrder'");
    }

    @Override
    public boolean canReturnOrder(Actor order) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'canReturnOrder'");
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setMakeOrder'");
    }

    @Override
    public void setTakeOrder(boolean pickUpOrder) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setTakeOrder'");
    }

    @Override
    public boolean isMakeOrder() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isMakeOrder'");
    }

    @Override
    public boolean isTakeOrder() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isTakeOrder'");
    }

    @Override
    public Actor getActor() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getActor'");
    }

}

public class SpecialClient implements iActorBehaviour, iReturnOrder {

    @Override
    public void returnOrder(Actor order) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'returnOrder'");
    }

    @Override
    public boolean canReturnOrder(Actor order) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'canReturnOrder'");
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setMakeOrder'");
    }

    @Override
    public void setTakeOrder(boolean pickUpOrder) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setTakeOrder'");
    }

    @Override
    public boolean isMakeOrder() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isMakeOrder'");
    }

    @Override
    public boolean isTakeOrder() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isTakeOrder'");
    }

    @Override
    public Actor getActor() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getActor'");
    }

}