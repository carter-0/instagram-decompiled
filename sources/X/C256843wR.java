package X;

import com.facebook.exoplayer.monitor.VpsEventCallback;

/* renamed from: X.3wR  reason: invalid class name and case insensitive filesystem */
public final class C256843wR implements C256853wS {
    public final /* synthetic */ VpsEventCallback A00;
    public final /* synthetic */ C256243vS A01;
    public final /* synthetic */ 2A4 A02;

    public C256843wR(VpsEventCallback vpsEventCallback, C256243vS r2, 2A4 r3) {
        this.A02 = r3;
        this.A00 = vpsEventCallback;
        this.A01 = r2;
    }

    public final void ClG(String str) {
        VpsEventCallback vpsEventCallback = this.A00;
        String str2 = this.A01.A0D.A0G;
        if (str2 != null) {
            vpsEventCallback.callback(new C266454Yy(str2, "MANIFEST", "FALLBACK_TRIGGERED", str));
        }
    }
}
