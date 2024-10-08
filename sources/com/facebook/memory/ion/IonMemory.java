package com.facebook.memory.ion;

import X.0dV;

public class IonMemory {
    public static native synchronized boolean allocate(int i);

    public static native synchronized boolean freeAllPreviousAllocations();

    public static native synchronized void listIonHeaps();

    static {
        0dV.A0C("ionmemory");
    }
}
