package X;

import com.facebook.mediastreaming.opt.transport.TransportError;
import com.facebook.mediastreaming.opt.transport.TransportEvent;

public final class Y3D implements Runnable {
    public final /* synthetic */ C22229Xxk A00;
    public final /* synthetic */ TransportError A01;
    public final /* synthetic */ TransportEvent A02;

    public Y3D(C22229Xxk xxk, TransportError transportError, TransportEvent transportEvent) {
        this.A00 = xxk;
        this.A02 = transportEvent;
        this.A01 = transportError;
    }

    public final void run() {
        this.A00.A00.onTransportEvent(this.A02, this.A01);
    }
}
