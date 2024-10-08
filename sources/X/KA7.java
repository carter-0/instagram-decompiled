package X;

import com.instagram.common.session.UserSession;

public final class KA7 extends 1P0 {
    public String A00;
    public boolean A01;
    public final /* synthetic */ LQZ A02;

    public KA7(LQZ lqz, String str, boolean z) {
        this.A02 = lqz;
        this.A01 = z;
        this.A00 = str;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        int A03 = AnonymousClass0fD.A03(1983255947);
        K14 k14 = (K14) obj;
        int A032 = AnonymousClass0fD.A03(-63940848);
        LQZ lqz = this.A02;
        if (lqz.A01 == null) {
            UserSession userSession = lqz.A00;
            if (182.A06(AnonymousClass7TF.A0H(userSession), userSession, 36327907131603748L)) {
                i = 1121781508;
                AnonymousClass0fD.A0A(i, A032);
                AnonymousClass0fD.A0A(1702632219, A03);
            }
        }
        lqz.A01.getClass();
        boolean z = this.A01;
        1Xj r0 = lqz.A01;
        String str = this.A00;
        if (z) {
            r0.A4E(str);
        } else {
            r0.A4F(str);
        }
        AnonymousClass3HX r1 = k14.A00;
        UserSession userSession2 = lqz.A00;
        if (r1 == null) {
            1OP.A05(userSession2).A0c(str);
        } else {
            1OP.A05(userSession2).A0I(k14.A00, true);
        }
        i = -1802678840;
        AnonymousClass0fD.A0A(i, A032);
        AnonymousClass0fD.A0A(1702632219, A03);
    }
}
