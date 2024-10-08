package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.Pb8  reason: case insensitive filesystem */
public final class C73349Pb8 implements Runnable {
    public final /* synthetic */ C307896Rx A00;
    public final /* synthetic */ C277014uI A01;
    public final /* synthetic */ C277014uI A02;
    public final /* synthetic */ boolean A03;

    public C73349Pb8(C307896Rx r1, C277014uI r2, C277014uI r3, boolean z) {
        this.A00 = r1;
        this.A02 = r2;
        this.A01 = r3;
        this.A03 = z;
    }

    public final void run() {
        ScheduledExecutorService scheduledExecutorService = OYM.A01;
        C307896Rx r7 = this.A00;
        UserSession A0B = C308206Td.A0B(r7);
        C277014uI r5 = this.A02;
        C277014uI r4 = this.A01;
        boolean z = this.A03;
        if (182.A06(AnonymousClass7TF.A0H(A0B), A0B, 36313403027425200L)) {
            if (C70111NxR.A00(A0B).A00 == null) {
                C70111NxR.A00(A0B).A00();
            }
            OTU otu = C70111NxR.A00(A0B).A00;
            if (otu != null) {
                OTU.A00(otu, new J7N(4, otu, new GA1(16, A0B, true), true));
            }
        } else {
            OYM.A01(r7, r5, r4, A0B, "disabled");
        }
        if (z) {
            OYM.A01(r7, r5, r4, A0B, "copresence_disabled");
        }
    }
}
