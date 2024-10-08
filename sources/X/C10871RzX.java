package X;

import com.facebook.mediastreaming.opt.transport.videoprotocolimpl.TransportEventBaseProvider;

/* renamed from: X.RzX  reason: case insensitive filesystem */
public final class C10871RzX {
    public final synchronized Object provideEventBase() {
        TransportEventBaseProvider transportEventBaseProvider;
        transportEventBaseProvider = TransportEventBaseProvider.provider;
        if (transportEventBaseProvider == null) {
            transportEventBaseProvider = new TransportEventBaseProvider();
            TransportEventBaseProvider.provider = transportEventBaseProvider;
        }
        return transportEventBaseProvider.eventBase;
    }
}
