package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectIfyXma;
import com.instagram.user.model.User;
import java.util.Set;

public final class FZU implements C250603lj {
    public final float A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final Set A03 = DbS.A0y();

    public FZU(AnonymousClass0iw r4, UserSession userSession) {
        this.A02 = userSession;
        this.A01 = r4;
        this.A00 = 182.A06(0Tu.A05, userSession, 36326902109059143L) ? 0.45f : 0.75f;
    }

    public final void ATF(AnonymousClass30Y r12, C252093oY r13) {
        String str;
        String str2;
        Long l;
        DirectIfyXma directIfyXma;
        User CCd;
        AnonymousClass7TG.A1N(r12, r13);
        C49890FBq fBq = (C49890FBq) r12.A03;
        if (r13.CFe(r12) >= this.A00) {
            Set set = this.A03;
            String str3 = fBq.A08;
            0qQ.A07(str3);
            if (set.add(str3)) {
                UserSession userSession = this.A02;
                AnonymousClass0iw r4 = this.A01;
                2FW r2 = fBq.A05;
                Object obj = fBq.A06;
                String A012 = C49890FBq.A01(r2, obj);
                if (!(obj instanceof 1Xj) || (CCd = ((1Xj) obj).A0C.CCd()) == null) {
                    str = null;
                } else {
                    str = CCd.getId();
                }
                if (r2 == 2FW.A1S) {
                    str2 = AnonymousClass000.A00(4504);
                } else {
                    str2 = "direct_share_sheet";
                }
                if (r2 != 2FW.A10 || !(obj instanceof EJB) || (directIfyXma = ((EJB) obj).A00) == null) {
                    l = null;
                } else {
                    l = directIfyXma.A02;
                }
                C22031Xty.A0A(r4, userSession, l, A012, str, str2, str3);
            }
        }
    }
}
