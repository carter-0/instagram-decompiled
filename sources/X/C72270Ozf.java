package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;

/* renamed from: X.Ozf  reason: case insensitive filesystem */
public final class C72270Ozf implements C250603lj {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C250973mM A01;
    public final /* synthetic */ AnonymousClass3BT A02;
    public final /* synthetic */ C310026aJ A03;
    public final /* synthetic */ C309426Yf A04;

    public C72270Ozf(UserSession userSession, C250973mM r2, AnonymousClass3BT r3, C310026aJ r4, C309426Yf r5) {
        this.A00 = userSession;
        this.A02 = r3;
        this.A04 = r5;
        this.A01 = r2;
        this.A03 = r4;
    }

    public final void ATF(AnonymousClass30Y r9, C252093oY r10) {
        String str;
        UserSession userSession = this.A00;
        2O0 A002 = 2O0.A00(userSession);
        Reel reel = this.A02.A03;
        C255773uh r7 = (C255773uh) r9.A03;
        A002.A04(reel, Long.valueOf(r7.A03()));
        if (r7.A0e != C250963mL.ROLL_CALL_EMPTY_STATE) {
            C309426Yf r5 = this.A04;
            if (!r5.A0h) {
                C250973mM r4 = this.A01;
                C310026aJ r3 = this.A03;
                User user = r7.A0i;
                String str2 = null;
                if (user != null) {
                    str = user.getId();
                } else {
                    str = null;
                }
                1Xj r1 = r7.A0b;
                if (r1 != null) {
                    str2 = r1.getId();
                }
                VFZ.A00(userSession, r3, r4, str, str2);
                r5.A0h = true;
            }
        }
    }
}
