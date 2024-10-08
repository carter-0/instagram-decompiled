package X;

import com.facebook.mqtt.service.ConnectionConfig;

/* renamed from: X.45h  reason: invalid class name and case insensitive filesystem */
public final class C2603545h implements C2603445g {
    public final /* synthetic */ C2603045c A00;
    public final /* synthetic */ C2603445g A01;

    public final void D5j(ConnectionConfig connectionConfig, Integer num) {
        0qQ.A0B(num, 0);
        this.A01.D5j(connectionConfig, num);
    }

    public final boolean D5p(C2603845k r5) {
        0qQ.A0B(r5, 0);
        C2603845k r2 = C2603845k.DISCONNECTED;
        if (r5 == r2) {
            C2603045c.A03(this.A00, true);
        }
        if (!this.A00.A0D || r5 == r2) {
            return this.A01.D5p(r5);
        }
        return false;
    }

    public C2603545h(C2603045c r1, C2603445g r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void onMessageDropped(String str, byte[] bArr, long j) {
        this.A01.onMessageDropped(str, bArr, j);
    }
}
