package X;

import android.os.Handler;

/* renamed from: X.HqT  reason: case insensitive filesystem */
public final class C55962HqT {
    public boolean A00;
    public final Handler A01 = AnonymousClass7TF.A0D();
    public final C57706If9 A02 = new C57706If9(this);
    public final C62320sa A03;

    public final void A00() {
        if (this.A00) {
            this.A00 = false;
            this.A01.removeCallbacks(this.A02);
        }
    }

    public C55962HqT(C62320sa r2) {
        this.A03 = r2;
    }
}
