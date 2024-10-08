package X;

import com.instagram.user.model.User;
import java.util.Map;

/* renamed from: X.Fuo  reason: case insensitive filesystem */
public final class C51480Fuo implements Runnable {
    public final /* synthetic */ AnonymousClass3JD A00;
    public final /* synthetic */ C3727892k A01;
    public final /* synthetic */ FTQ A02;

    public C51480Fuo(AnonymousClass3JD r1, C3727892k r2, FTQ ftq) {
        this.A02 = ftq;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass3JC r1;
        C267604bt A002;
        long j;
        Map map;
        String A11;
        Long A10;
        FTQ ftq = this.A02;
        Dda dda = ftq.A05;
        dda.A0E(002.A0O("fetch_user_on_data_flush", ftq.A01));
        ftq.A01++;
        C267604bt A003 = FTQ.A00(ftq);
        if (A003 == null || !A003.isValid()) {
            dda.A0E("fetch_user_on_data_view_invalid");
            return;
        }
        C267604bt A004 = FTQ.A00(ftq);
        if (A004 != null) {
            A004.EaM(false);
        }
        C3727892k r4 = this.A01;
        User A005 = C324696zk.A00(r4);
        if (A005 != null) {
            C267604bt A006 = FTQ.A00(ftq);
            if (A006 != null) {
                C324706zl A007 = ftq.A06.A00();
                AnonymousClass3JC r0 = (AnonymousClass3JC) this.A00;
                if (r0 == null || (map = r0.A00.trackedResponseHeaders) == null || (A11 = DbT.A11(AnonymousClass000.A00(63), map)) == null || (A10 = AnonymousClass7TE.A10(A11)) == null) {
                    j = 0;
                } else {
                    j = A10.longValue();
                }
                A006.Dwc(A007, A005, C324696zk.A01(r4), j, r4.CPt());
            }
            C267604bt A008 = FTQ.A00(ftq);
            if (A008 != null) {
                A008.Ehu(((C298935uH) r4.FH3()).BkJ());
            }
            if (!ftq.A02) {
                ftq.A02 = true;
                AnonymousClass5CG.A00(ftq.A04).ENY(A005.A0J(), A005.getId());
            }
        } else {
            C267604bt A009 = FTQ.A00(ftq);
            if (A009 != null) {
                A009.DFR(false, true, AnonymousClass000.A00(487));
            }
        }
        AnonymousClass3JD r12 = this.A00;
        if ((r12 instanceof AnonymousClass3JC) && (r1 = (AnonymousClass3JC) r12) != null && r1.A00.isFinal && (A002 = FTQ.A00(ftq)) != null) {
            A002.Dw9();
        }
    }
}
