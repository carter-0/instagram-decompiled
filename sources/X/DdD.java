package X;

import android.os.Handler;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.Set;

public final class DdD {
    public 2da A00;
    public final Handler A01 = AnonymousClass7TF.A0D();
    public final Fragment A02;
    public final UserSession A03;
    public final UserSession A04;
    public final Runnable A05 = new C46357DdS(this);
    public final Runnable A06 = new DdR(this);
    public final Fragment A07;

    public final void A00() {
        boolean A022;
        2dZ r6 = this.A00;
        if (r6 != null) {
            UserSession userSession = this.A03;
            int A002 = C46336Dce.A00(userSession);
            if (AnonymousClass3EM.A01()) {
                A022 = AnonymousClass7TF.A1R(A002);
            } else {
                A022 = AnonymousClass3H7.A02(userSession);
            }
            2dZ r62 = r6;
            2dZ.A0F(r62);
            AnonymousClass7TH.A06(r62.A0b).setVisibility(DbW.A01(A022 ? 1 : 0));
            AnonymousClass7TH.A06(r62.A0c).setVisibility(8);
            AnonymousClass7TH.A06(r62.A0d).setVisibility(0);
            if (A002 > 0) {
                A01(A002);
            }
        }
    }

    public final void A01(int i) {
        int A012;
        UserSession userSession = this.A03;
        if (AnonymousClass3EM.A01()) {
            A012 = AnonymousClass3H7.A00(userSession);
        } else {
            A012 = AnonymousClass3H7.A01(userSession);
        }
        int A002 = AnonymousClass3H6.A00(userSession);
        int A003 = AnonymousClass3H5.A00(userSession);
        boolean A1R = AnonymousClass7TF.A1R(A003);
        2aT A0c = DbU.A0c(userSession);
        2aD r0 = 2aD.A06;
        2aX r7 = new 2aX(r0, i);
        AnonymousClass2g1 r6 = AnonymousClass2g1.DIRECT;
        C226252fx r5 = C226252fx.DOT;
        A0c.A04(r5, r6, r7, AnonymousClass05K.A0N, A002, A1R ? 1 : 0, A012, A003);
        2aV A0a = DbV.A0a(userSession);
        2aX r1 = new 2aX(r0, i);
        0qQ.A0B(r6, 0);
        A0a.A02(new C239993Jd(r5, r6, (C71062aE) null, (Set) null), r1);
    }

    public DdD(Fragment fragment, UserSession userSession) {
        this.A02 = fragment;
        this.A03 = userSession;
        this.A07 = fragment;
        this.A04 = userSession;
    }
}
