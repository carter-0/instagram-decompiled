package X;

import android.view.View;

public final class AU2 implements C344337rh {
    public final /* synthetic */ C345657ts A00;

    public final void DZH(View view) {
    }

    public AU2(C345657ts r1) {
        this.A00 = r1;
    }

    public final void DZB(C346027uT r3) {
        C345657ts r1 = this.A00;
        r1.A02 = r3;
        r3.A08 = 1;
        r3.A07 = 1;
        r1.A9j(r3);
        r1.A07.post(new AiC(this));
    }

    public final void DZC(C346027uT r3) {
        C345657ts r1 = this.A00;
        r1.A02 = null;
        r1.EEN(r3);
    }

    public final void DZD(C346027uT r3, int i, int i2) {
        this.A00.A07.post(new C41108AoU(this, i, i2));
    }
}
