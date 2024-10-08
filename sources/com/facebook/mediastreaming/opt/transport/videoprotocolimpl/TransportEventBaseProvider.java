package com.facebook.mediastreaming.opt.transport.videoprotocolimpl;

import X.0dV;
import X.C10871RzX;
import com.facebook.proxygen.EventBase;
import com.facebook.proxygen.HTTPThread;

public final class TransportEventBaseProvider {
    public static final C10871RzX Companion = new Object();
    public static TransportEventBaseProvider provider;
    public final EventBase eventBase;
    public final Thread networkThread;

    /* JADX WARNING: type inference failed for: r0v0, types: [X.RzX, java.lang.Object] */
    static {
        0dV.A0C("liger");
    }

    public static final synchronized Object provideEventBase() {
        Object provideEventBase;
        synchronized (TransportEventBaseProvider.class) {
            provideEventBase = Companion.provideEventBase();
        }
        return provideEventBase;
    }

    public TransportEventBaseProvider() {
        HTTPThread hTTPThread = new HTTPThread();
        Thread thread = new Thread(hTTPThread);
        this.networkThread = thread;
        thread.setPriority(5);
        thread.start();
        hTTPThread.waitForInitialization();
        this.eventBase = hTTPThread.getEventBase();
    }
}
