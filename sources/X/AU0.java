package X;

import android.view.TextureView;
import android.view.View;

public final class AU0 implements C344337rh {
    public final /* synthetic */ C345707tx A00;

    public AU0(C345707tx r1) {
        this.A00 = r1;
    }

    public final void DZB(C346027uT r4) {
        C345707tx r2 = this.A00;
        boolean z = r2.A0j;
        r2.A0j = true;
        if (!r2.A0Q && r2.A0P && z) {
            C343717qg r1 = C344397rn.A00;
            C343837qt r0 = r2.A00;
            r0.getClass();
            if (((C344397rn) r0.Ape(r1)).EAg()) {
                C345707tx.A02(r2);
            }
        }
    }

    public final void DZC(C346027uT r3) {
        this.A00.A0j = false;
    }

    public final void DZD(C346027uT r3, int i, int i2) {
        C345707tx r1 = this.A00;
        r1.A04 = i;
        r1.A03 = i2;
        C345707tx.A06(r1, r1.A0L);
    }

    public final void DZH(View view) {
        C345707tx r0;
        if (view instanceof TextureView) {
            r0 = this.A00;
            r0.A06 = (TextureView) view;
        } else {
            r0 = this.A00;
            r0.A06 = null;
        }
        r0.A05 = null;
    }
}
