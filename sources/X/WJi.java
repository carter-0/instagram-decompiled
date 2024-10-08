package X;

import android.view.View;

public final class WJi implements C252203oj {
    public final /* synthetic */ AnonymousClass7HT A00;

    public final void DmB(2cs r1) {
    }

    public final void DmD(2cs r1) {
    }

    public WJi(AnonymousClass7HT r1) {
        this.A00 = r1;
    }

    public final void DmC(2cs r3) {
        this.A00.A01 = 0.0f;
    }

    public final void DmE(2cs r8) {
        AnonymousClass7HT r6 = this.A00;
        if (r6.A0D != AnonymousClass05K.A00) {
            float A01 = (float) AnonymousClass37Q.A01(r8.A09.A00, r6.A0K.A09.A00 * ((double) r6.A01));
            View view = r6.A06;
            if (view != null) {
                view.setTranslationY(A01);
            }
        }
    }
}
