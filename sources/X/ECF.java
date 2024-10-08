package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.instagram.common.session.UserSession;

public abstract class ECF extends 1P0 {
    public final long A00 = 658062002;
    public final FragmentActivity A01;
    public final UserFlowLogger A02;
    public final C267324bN A03;
    public final UserSession A04;
    public final C311526cp A05;
    public final GBE A06;

    public ECF(FragmentActivity fragmentActivity, C267324bN r4, UserSession userSession, GBE gbe) {
        this.A01 = fragmentActivity;
        this.A03 = r4;
        this.A06 = gbe;
        this.A04 = userSession;
        this.A05 = new C311526cp(userSession, fragmentActivity);
        this.A02 = AnonymousClass1QO.A00(userSession);
    }

    public void A00(C61284K0v k0v) {
        int A032 = AnonymousClass0fD.A03(-738386105);
        if (k0v.FH3().A01) {
            C267324bN r2 = this.A03;
            1Xj r1 = r2.A02;
            if (r1 != null) {
                DbX.A1Q(r1, 1);
                r1.AE7(this.A04);
            }
            this.A06.A0L(r2, this.A05);
            this.A02.flowEndSuccess(this.A00);
        } else {
            this.A02.flowEndFail(this.A00, "delete_reel_deletion_failure", k0v.getErrorMessage());
        }
        C48772Ejv.A00(this.A04, this.A01, "profile");
        AnonymousClass0fD.A0A(645912745, A032);
    }

    public void onFail(C268654dm r7) {
        String str;
        1XP r0;
        int A0D = AnonymousClass7TG.A0D(r7, 1798259161);
        String str2 = null;
        if (!(r7 instanceof C268674do) || (r0 = (1XP) ((C268674do) r7).A00) == null || (str = r0.getErrorMessage()) == null) {
            Throwable A012 = r7.A01();
            if (A012 != null) {
                str2 = A012.getMessage();
            }
            str = str2;
        }
        this.A02.flowEndFail(this.A00, "delete_reel_response_failure", str);
        AnonymousClass0fD.A0A(810640542, A0D);
    }
}
