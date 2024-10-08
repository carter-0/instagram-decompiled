package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.PDr  reason: case insensitive filesystem */
public final class C72638PDr implements C74413PuT {
    public final /* synthetic */ long A00;
    public final /* synthetic */ MZ0 A01;
    public final /* synthetic */ 0rm A02;

    public final /* synthetic */ void DFL(boolean z) {
    }

    public C72638PDr(MZ0 mz0, 0rm r2, long j) {
        this.A01 = mz0;
        this.A02 = r2;
        this.A00 = j;
    }

    public final void DFJ(OE3 oe3) {
        2Eq r4 = (2Eq) oe3.A01;
        if (r4 != null) {
            MZ0 mz0 = this.A01;
            UserSession userSession = mz0.A00;
            OO2 A002 = O0F.A00(userSession);
            0rm r6 = this.A02;
            A002.A01.A02(C41847B3o.A1E(r6.A00), "thread_fetch_end");
            C254703su BRy = 2L2.A00(userSession).BRy(r4.BJy(), (String) r6.A00);
            if (BRy != null) {
                ((OZY) mz0.A01.getValue()).A03(BRy, r4, (OCY) null);
            } else {
                0KC.A0C("ArmadilloExpressMissingThreadTracker", 002.A0R("Not able to find message id in thread store ", (String) r6.A00));
            }
            mz0.A00(this.A00);
            return;
        }
        OO2 A003 = O0F.A00(this.A01.A00);
        String str = (String) this.A02.A00;
        int i = oe3.A00;
        List list = oe3.A02;
        0qQ.A0B(str, 0);
        A003.A02.A00(str);
        C71033OZu oZu = A003.A01;
        if (C71033OZu.A01(oZu, str)) {
            oZu.A00.markerAnnotate(724174487, C71033OZu.A00(oZu, str), "thread_fetch_failure_error_code", i);
        }
        oZu.A05(str, (Integer[]) list.toArray(new Integer[0]));
        oZu.A04(str, 3);
        0KC.A0C("ArmadilloExpressMissingThreadTracker", 002.A0Q("Fetch thread by threadJid failed ", this.A00));
    }
}
