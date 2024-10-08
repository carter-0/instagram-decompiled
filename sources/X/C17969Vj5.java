package X;

import java.lang.ref.WeakReference;

/* renamed from: X.Vj5  reason: case insensitive filesystem */
public final class C17969Vj5 {
    public WeakReference A00;
    public C2355830k A01;

    public final void A00() {
        C2355830k r1 = this.A01;
        if (r1 == null) {
            r1 = new C2355830k();
            r1.A04(this.A00);
            this.A01 = r1;
        }
        r1.A00();
    }

    public final void A01(C2355730j r3) {
        WeakReference weakReference;
        if (r3 != null) {
            weakReference = new WeakReference(r3);
        } else {
            weakReference = null;
        }
        this.A00 = weakReference;
        C2355830k r0 = this.A01;
        if (r0 != null) {
            r0.A04(weakReference);
        }
    }
}
