package X;

import android.util.Pair;

/* renamed from: X.80t  reason: invalid class name and case insensitive filesystem */
public final class C3495380t implements C3495480u {
    public final /* synthetic */ C357638Yz A00;

    public C3495380t(C357638Yz r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        Pair pair = (Pair) obj;
        0qQ.A0B(pair, 0);
        C357638Yz r4 = this.A00;
        if (r4.A01 != null) {
            for (C3495480u r2 : r4.A0H) {
                C3494580l r1 = (C3494580l) pair.second;
                AnonymousClass80H r0 = r4.A01;
                if (r0 == null) {
                    0qQ.A0F("cameraConfigurationSetup");
                    throw AnonymousClass00P.createAndThrow();
                } else {
                    r1.A02(r0.A01);
                    r2.onChanged(pair);
                }
            }
        }
    }
}
