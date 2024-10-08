package X;

import android.view.View;

public final class GNP implements Runnable {
    public final /* synthetic */ GNL A00;

    public GNP(GNL gnl) {
        this.A00 = gnl;
    }

    public final void run() {
        Integer num;
        Integer num2;
        View A02;
        GNL gnl = this.A00;
        C267324bN r2 = gnl.A01;
        if (r2 != null) {
            C52058GDe A002 = JSx.A00(r2, gnl.A0H);
            C52012GBj gBj = gnl.A02;
            if (!(gBj == null || (A02 = C52012GBj.A02(gBj)) == null)) {
                A02.performHapticFeedback(0);
            }
            boolean z = A002.A0R;
            if (!z) {
                gnl.A0D.EaH(r2, false);
                gnl.A09.getWindow().setFlags(8192, 8192);
                C52038GCk gCk = gnl.A0N;
                if (GNL.A06(r2, gnl)) {
                    num2 = AnonymousClass05K.A0C;
                } else {
                    num2 = AnonymousClass05K.A0N;
                }
                gCk.A01(num2);
            } else {
                gnl.A0C();
                gnl.A09.getWindow().clearFlags(8192);
                C52038GCk gCk2 = gnl.A0N;
                if (GNL.A06(r2, gnl)) {
                    num = AnonymousClass05K.A0C;
                } else {
                    num = AnonymousClass05K.A0N;
                }
                gCk2.A00(num);
            }
            gnl.A0D.EaG(r2, !z);
        }
    }
}
