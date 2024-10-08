package X;

import android.view.Choreographer;

/* renamed from: X.VuC  reason: case insensitive filesystem */
public final class C18560VuC {
    public C14646Tzs A00;
    public AnonymousClass1JH A01 = null;
    public boolean A02;
    public final 0Gb A03;

    public static void A00(C18560VuC vuC) {
        if (!vuC.A02) {
            vuC.A02 = true;
            C14646Tzs tzs = new C14646Tzs(Choreographer.getInstance(), vuC.A03, vuC);
            C14646Tzs tzs2 = vuC.A00;
            if (tzs2 != null) {
                tzs2.A01();
            }
            vuC.A00 = tzs;
        }
    }

    public final void A01(AnonymousClass1JH r1) {
        this.A01 = r1;
    }

    public C18560VuC(0Gb r2) {
        this.A03 = r2;
    }
}
