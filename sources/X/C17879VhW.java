package X;

import java.lang.ref.WeakReference;

/* renamed from: X.VhW  reason: case insensitive filesystem */
public final class C17879VhW {
    public C17185VLp A00;
    public C17185VLp A01;
    public WeakReference A02;
    public WeakReference A03;
    public final String A04;

    public final void A00(C17185VLp vLp) {
        U3Z u3z;
        U3Z u3z2;
        WeakReference weakReference = this.A02;
        if (weakReference == null || (u3z2 = (U3Z) weakReference.get()) == null) {
            this.A00 = vLp;
        } else {
            u3z2.A06(vLp);
        }
        WeakReference weakReference2 = this.A03;
        if (weakReference2 == null || (u3z = (U3Z) weakReference2.get()) == null) {
            this.A01 = vLp;
        } else {
            u3z.A06(vLp);
        }
    }

    public C17879VhW(String str) {
        this.A04 = str;
    }
}
