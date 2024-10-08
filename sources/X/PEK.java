package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelType;

public final class PEK implements B1V {
    public Reel A00;
    public final /* synthetic */ AnonymousClass7Z6 A01;
    public final /* synthetic */ C381819cP A02;
    public final /* synthetic */ 1Xj A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public PEK(AnonymousClass7Z6 r2, C381819cP r3, 1Xj r4, String str, String str2) {
        this.A01 = r2;
        this.A04 = str;
        this.A02 = r3;
        this.A05 = str2;
        this.A03 = r4;
        this.A00 = r2.A03.A0M(str);
    }

    public final 1bp AXP(C70621ODs oDs, DirectThreadKey directThreadKey, Boolean bool, Long l) {
        boolean z;
        ReelType reelType;
        UserSession userSession = this.A01.A00;
        Class<1dI> cls = 1dI.class;
        C381819cP r3 = this.A02;
        boolean z2 = r3.A02;
        boolean z3 = r3.A03;
        Reel reel = this.A00;
        if (reel == null || (!reel.A0b() && reel.A0P != ReelType.A05 && !reel.A0k())) {
            z = false;
        } else {
            z = true;
        }
        String str = r3.A01;
        0qQ.A0B(userSession, 0);
        C70621ODs oDs2 = oDs;
        C66665MaY maY = new C66665MaY(oDs2, (Boolean) null, DbV.A0s(), str, (String) null, "", C66666MaZ.A00(userSession, C66666MaZ.A01, cls), z2, z3, z, false);
        String str2 = this.A04;
        String str3 = this.A05;
        1Xj r1 = this.A03;
        long A0H = AnonymousClass7TG.A0H();
        if (reel != null) {
            reelType = reel.A0P;
        } else {
            reelType = null;
        }
        return new 1dI(maY, r1, directThreadKey, reelType, l, str2, str3, A0H, false);
    }
}
