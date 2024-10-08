package X;

import android.os.Handler;

/* renamed from: X.LDx  reason: case insensitive filesystem */
public final class C63937LDx {
    public boolean A00;
    public final long A01;
    public final Handler A02 = AnonymousClass7TF.A0D();
    public final MTB A03;
    public final Runnable A04 = new M5E(this);
    public final AnonymousClass0eK A05;

    public final void A00() {
        long j;
        Handler handler = this.A02;
        Runnable runnable = this.A04;
        handler.removeCallbacks(runnable);
        C66537MVr mVr = (C66537MVr) this.A05.get();
        if (mVr == null || mVr.C8j() < this.A01) {
            j = 1000;
        } else {
            j = 10000;
        }
        handler.postDelayed(runnable, j);
    }

    public C63937LDx(MTB mtb, AnonymousClass0eK r3, long j) {
        this.A01 = j;
        this.A05 = r3;
        this.A03 = mtb;
    }
}
