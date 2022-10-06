package com.directi.training.ocp.exercise;

public interface SlotManager

{
 
    public void markSlotFree();
    public void markSlotBusy();
    public int findFreeSlot();

}