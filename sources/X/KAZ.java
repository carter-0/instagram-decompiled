package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

public final class KAZ extends 1P0 {
    public final boolean A00;
    public final /* synthetic */ LP6 A01;

    public KAZ(LP6 lp6, String str, boolean z) {
        0qQ.A0B(str, 2);
        this.A01 = lp6;
        this.A00 = z;
    }

    public final void onFail(C268654dm r5) {
        int A0D = AnonymousClass7TG.A0D(r5, -987841825);
        if (r5 instanceof C268674do) {
            String str = ((CGA) ((C268674do) r5).A00).A03;
            0qQ.A07(str);
            this.A01.A07.DwJ(str, this.A00);
        }
        LP6 lp6 = this.A01;
        if (!this.A00) {
            lp6.A07.DK7();
        }
        AnonymousClass0fD.A0A(-1654705257, A0D);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(624864000);
        boolean z = this.A00;
        LP6 lp6 = this.A01;
        if (z) {
            lp6.A0A = false;
        } else {
            lp6.A0B = false;
        }
        AnonymousClass0fD.A0A(1225757835, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(-945508041);
        LP6 lp6 = this.A01;
        LCx A002 = C63058Kqn.A00(lp6.A09);
        A002.A01.put("lookup_user", Long.valueOf(A002.A00.now()));
        if (this.A00) {
            lp6.A0A = true;
        } else {
            lp6.A0B = true;
        }
        AnonymousClass0fD.A0A(-1401316306, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        FollowStatus B6o;
        int A03 = AnonymousClass0fD.A03(2055216521);
        CGA cga = (CGA) obj;
        int A0D = AnonymousClass7TG.A0D(cga, -416839040);
        User user = cga.A02;
        0qQ.A07(user);
        LP6 lp6 = this.A01;
        boolean z = this.A00;
        user.getUsername();
        UserSession userSession = lp6.A09;
        2R8.A04(userSession, user);
        user.getUsername();
        lp6.A07.DwA(user, z);
        if (!2R8.A04(userSession, user) && ((B6o = user.B6o()) == FollowStatus.A05 || B6o == FollowStatus.A07)) {
            user.getUsername();
        }
        AnonymousClass0fD.A0A(-212610346, A0D);
        AnonymousClass0fD.A0A(-841128090, A03);
    }
}
