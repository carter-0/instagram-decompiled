package X;

import com.facebook.mqtt.service.ConnectionConfig;

/* renamed from: X.TFt  reason: case insensitive filesystem */
public final class C12960TFt implements Runnable {
    public final /* synthetic */ C2602044r A00;
    public final /* synthetic */ 26B A01;

    public C12960TFt(C2602044r r1, 26B r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        ConnectionConfig connectionConfig;
        26B r5 = this.A01;
        AnonymousClass450 r4 = r5.A02;
        if (r4 != null) {
            connectionConfig = r4.A05(r5.A03, this.A00, r5.A07, 26B.A0H);
        } else {
            connectionConfig = null;
        }
        if (!AnonymousClass45T.A00(r5.A01, connectionConfig)) {
            r5.stop();
            26B.A01(connectionConfig, r5, AnonymousClass05K.A0j);
        }
    }
}
