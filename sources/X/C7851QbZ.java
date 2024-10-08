package X;

import android.graphics.Rect;

/* renamed from: X.QbZ  reason: case insensitive filesystem */
public final class C7851QbZ extends C251323mv {
    public C276694tk A00;
    public final C307446Qd A01;

    public final /* bridge */ /* synthetic */ Object A0A() {
        return null;
    }

    public final void A0C(C245753dQ r3) {
        C276684tj.A00.set(this.A00);
        this.A00 = null;
    }

    public C7851QbZ(C307446Qd r1) {
        this.A01 = r1;
    }

    public final /* bridge */ /* synthetic */ void A0B(Rect rect, C245753dQ r5, Object obj) {
        this.A00 = C276674ti.A00();
        ThreadLocal threadLocal = C276684tj.A00;
        C307446Qd r1 = this.A01;
        C245983dn.A02("Evaluation Context can only be gotten from the UI Thread");
        threadLocal.set(r1.A07);
    }
}
