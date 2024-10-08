package X;

import android.os.Handler;

public final class M5E implements Runnable {
    public final /* synthetic */ C63937LDx A00;

    public M5E(C63937LDx lDx) {
        this.A00 = lDx;
    }

    public final void run() {
        long j;
        C63937LDx lDx = this.A00;
        AnonymousClass0eK r6 = lDx.A05;
        C66537MVr mVr = (C66537MVr) r6.get();
        if (mVr != null && !lDx.A00 && lDx.A01 > mVr.C8j()) {
            lDx.A03.Dn3();
        }
        Handler handler = lDx.A02;
        C66537MVr mVr2 = (C66537MVr) r6.get();
        if (mVr2 == null || mVr2.C8j() < lDx.A01) {
            j = 1000;
        } else {
            j = 10000;
        }
        handler.postDelayed(this, j);
    }
}
