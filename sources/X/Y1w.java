package X;

import android.view.View;

public final class Y1w implements Runnable {
    public final /* synthetic */ AnonymousClass4K6 A00;

    public Y1w(AnonymousClass4K6 r1) {
        this.A00 = r1;
    }

    public final void run() {
        C270644h4 r0;
        AnonymousClass4K6 r1 = this.A00;
        View A002 = r1.A03.A00();
        AnonymousClass4K4 r4 = r1.A04;
        if (r4.A02) {
            boolean A06 = 182.A06(0Tu.A05, r1.A01, 36325407460504512L);
            0sL r12 = (0sL) r4.A00.A07;
            if (A06) {
                r0 = C270644h4.SKIP;
            } else {
                r0 = null;
            }
            r12.invoke(A002, r0);
            return;
        }
        ((0sL) r4.A00.A04).invoke("continue_watching", A002);
    }
}
