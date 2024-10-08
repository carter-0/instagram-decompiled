package X;

import com.instagram.common.session.UserSession;
import com.instagram.igsignalsproducts.ttnc.IgSignalsTtncEstimator;

public final class MN0 extends 0Yg implements 0sP {
    public final /* synthetic */ long A00;
    public final /* synthetic */ IgSignalsTtncEstimator A01;
    public final /* synthetic */ 1XM A02;
    public final /* synthetic */ C228552lr A03;
    public final /* synthetic */ Runnable A04;
    public final /* synthetic */ String A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MN0(IgSignalsTtncEstimator igSignalsTtncEstimator, 1XM r3, C228552lr r4, Runnable runnable, String str, long j) {
        super(1);
        this.A01 = igSignalsTtncEstimator;
        this.A03 = r4;
        this.A02 = r3;
        this.A04 = runnable;
        this.A00 = j;
        this.A05 = str;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Boolean bool;
        C64087LMf lMf = (C64087LMf) obj;
        0qQ.A0B(lMf, 0);
        if (!this.A01.A0G) {
            C228552lr r12 = this.A03;
            1XM r11 = this.A02;
            Runnable runnable = this.A04;
            long j = this.A00;
            String str = this.A05;
            if (lMf.A03) {
                double d = lMf.A00;
                if (d > 0.0d) {
                    bool = Boolean.valueOf(C51970G9q.A1T((d > lMf.A01 ? 1 : (d == lMf.A01 ? 0 : -1))));
                } else {
                    bool = null;
                }
                if (DbX.A1a(bool)) {
                    UserSession userSession = r12.A0J;
                    0Tu r6 = 0Tu.A05;
                    if (182.A01(r6, userSession, 36599095662677406L) > 0) {
                        j = 182.A01(r6, userSession, 36599095662677406L);
                    }
                }
                if (AnonymousClass7TF.A1Y(bool, false)) {
                    if (!182.A06(0Tu.A05, r12.A0J, 36317620688786828L)) {
                        j = 0;
                    }
                }
            }
            C228552lr.A02(r11, r12, runnable, str, j);
        }
        return C60340gF.A00;
    }
}
