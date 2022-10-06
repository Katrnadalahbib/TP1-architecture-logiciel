package com.directi.training.ocp.exercise;

public class ResourceAllocator
{
    private static final int INVALID_RESOURCE_ID = -1;
    public int allocate(ResourceType resourceType)
    {
        public int allocate(SlotManager resourceType)
    {
        int resourceId;
        resourceId = resourceType.markSlotFree();
        resourceType.markSlotBusy(resourceId);
        return resourceId;
    }

    public void free(SlotManager resourceType, int resourceId)
    {
        resourceType.markSlotFree(resourceId);
    }
    }
   

}

