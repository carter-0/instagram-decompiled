package X;

import com.facebook.mqtt.service.ConnectionConfig;

/* renamed from: X.45i  reason: invalid class name and case insensitive filesystem */
public final class C2603645i implements Runnable {
    public final /* synthetic */ C2603045c A00;
    public final /* synthetic */ boolean A01;

    public C2603645i(C2603045c r1, boolean z) {
        this.A01 = z;
        this.A00 = r1;
    }

    public final void run() {
        int i;
        boolean z = this.A01;
        C2603045c r3 = this.A00;
        ConnectionConfig connectionConfig = r3.A01;
        if (z) {
            if (connectionConfig != null) {
                if (connectionConfig.initialNetworkState != 1) {
                    connectionConfig.initialNetworkState = 1;
                    i = 27;
                } else {
                    return;
                }
            }
            0qQ.A0F("config");
            throw AnonymousClass00P.createAndThrow();
        }
        if (connectionConfig != null) {
            if (connectionConfig.initialNetworkState != 2) {
                connectionConfig.initialNetworkState = 2;
                i = 28;
            } else {
                return;
            }
        }
        0qQ.A0F("config");
        throw AnonymousClass00P.createAndThrow();
        C2603045c.A01(r3, new C377179Kv(r3, i));
    }
}
