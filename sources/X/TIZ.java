package X;

import com.facebook.mqtt.service.ConnectionConfig;
import com.facebook.mqtt.service.XplatNativeClientWrapper;

public final class TIZ implements Runnable {
    public final /* synthetic */ ConnectionConfig A00;
    public final /* synthetic */ XplatNativeClientWrapper A01;
    public final /* synthetic */ Integer A02;

    public TIZ(ConnectionConfig connectionConfig, XplatNativeClientWrapper xplatNativeClientWrapper, Integer num) {
        this.A01 = xplatNativeClientWrapper;
        this.A02 = num;
        this.A00 = connectionConfig;
    }

    public final void run() {
        XplatNativeClientWrapper xplatNativeClientWrapper = this.A01;
        AnonymousClass28I r0 = XplatNativeClientWrapper.Companion;
        C2603445g r2 = xplatNativeClientWrapper.stateCallback;
        if (r2 == null) {
            0qQ.A0F("stateCallback");
            throw AnonymousClass00P.createAndThrow();
        }
        r2.D5j(this.A00, this.A02);
    }
}
