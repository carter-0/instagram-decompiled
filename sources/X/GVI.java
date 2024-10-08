package X;

import android.os.Handler;

public final class GVI {
    public long A00;
    public GVJ A01;
    public final int A02;
    public final Handler A03 = AnonymousClass7TF.A0D();
    public final C59556JOc A04;

    public final void A00() {
        GVJ gvj = this.A01;
        if (gvj != null) {
            gvj.A01 = true;
            this.A03.removeCallbacks(gvj);
            this.A01 = null;
        }
    }

    public final void A01() {
        if (this.A01 == null) {
            GVJ gvj = new GVJ(this);
            this.A01 = gvj;
            this.A03.postDelayed(gvj, (long) this.A02);
        }
    }

    public GVI(C59556JOc jOc, int i) {
        this.A02 = i;
        this.A04 = jOc;
    }
}
