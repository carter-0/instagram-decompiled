package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Dwg  reason: case insensitive filesystem */
public final class C47370Dwg extends C272124k8 {
    public final /* synthetic */ C49383Eul A00;
    public final /* synthetic */ String A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47370Dwg(UserSession userSession, C49383Eul eul, String str) {
        super(userSession);
        this.A01 = str;
        this.A00 = eul;
    }

    public final void A05(C268654dm r4, UserSession userSession) {
        int A03 = AnonymousClass0fD.A03(-1729131106);
        FV7 fv7 = this.A00.A00;
        fv7.A09.hide();
        C59689JTv.A0E(fv7.A01, "direct_whitelist_failed");
        AnonymousClass0fD.A0A(-1607821000, A03);
    }

    public final /* bridge */ /* synthetic */ void A06(UserSession userSession, Object obj) {
        int A03 = AnonymousClass0fD.A03(1789408115);
        int A032 = AnonymousClass0fD.A03(-1639455342);
        0qQ.A0B(userSession, 0);
        17i A002 = 17h.A00(userSession);
        User A02 = A002.A02(this.A01);
        if (A02 != null) {
            A02.A03.EeM(false);
            A002.A01(A02, false, false);
        }
        this.A00.A00.A09.hide();
        AnonymousClass0fD.A0A(-378152730, A032);
        AnonymousClass0fD.A0A(1029112287, A03);
    }
}
