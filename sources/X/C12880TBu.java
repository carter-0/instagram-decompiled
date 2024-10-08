package X;

import com.facebook.mqtt.service.ConnectionConfig;

/* renamed from: X.TBu  reason: case insensitive filesystem */
public final class C12880TBu implements Runnable {
    public final /* synthetic */ 26B A00;

    public C12880TBu(26B r1) {
        this.A00 = r1;
    }

    public final void run() {
        26B r2 = this.A00;
        if (r2.A0F == null) {
            26B.A01((ConnectionConfig) null, r2, AnonymousClass05K.A0N);
        }
        C250773m2 r0 = r2.A0F;
        if (r0 != null) {
            r0.kickOffConnection();
        }
    }
}
