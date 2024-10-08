package X;

import android.os.Handler;

/* renamed from: X.JcH  reason: case insensitive filesystem */
public final class C59951JcH {
    public C59952JcI A00;
    public final Handler A01 = new Handler();
    public final 0h9 A02;

    private final void A00(07T r3) {
        C59952JcI jcI = this.A00;
        if (jcI != null) {
            jcI.run();
        }
        C59952JcI jcI2 = new C59952JcI(r3, this.A02);
        this.A00 = jcI2;
        this.A01.postAtFrontOfQueue(jcI2);
    }

    public final 0h9 A01() {
        return this.A02;
    }

    public final void A02() {
        A00(07T.ON_START);
    }

    public final void A03() {
        A00(07T.ON_CREATE);
    }

    public final void A04() {
        A00(07T.ON_STOP);
        A00(07T.ON_DESTROY);
    }

    public final void A05() {
        A00(07T.ON_START);
    }

    public C59951JcH(AnonymousClass07Z r2) {
        this.A02 = new 0h9(r2);
    }
}
