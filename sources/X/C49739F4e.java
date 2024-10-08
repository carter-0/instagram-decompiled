package X;

import android.app.Activity;
import com.instagram.avatars.coinflip.AvatarCoinFlipConfig;
import com.instagram.common.session.UserSession;

/* renamed from: X.F4e  reason: case insensitive filesystem */
public abstract class C49739F4e {
    public static final void A01(Activity activity, AvatarCoinFlipConfig avatarCoinFlipConfig, UserSession userSession, C273414mX r9, String str, float f, float f2, boolean z) {
        0qQ.A0B(userSession, 0);
        AnonymousClass7TF.A1D(avatarCoinFlipConfig, 2, r9);
        C331157Pu A00 = C48943Emh.A00(DbT.A0i(activity));
        boolean A06 = 182.A06(0Tu.A05, userSession, 36322340853852243L);
        E1W A002 = C48370EdR.A00(avatarCoinFlipConfig, str, A06);
        C331127Pr A0W = DbS.A0W(userSession);
        if (A06 && z) {
            f -= 0.05f;
        }
        A0W.A03 = f;
        DbS.A1S(A0W, true);
        if (A06 && z) {
            f2 -= 0.05f;
        }
        A0W.A04 = f2;
        A0W.A0U = r9;
        0nA.A0J(activity);
        if (A00 != null) {
            A00.A0F(A002, A0W);
        } else {
            DbU.A0y(activity, A002, A0W);
        }
    }

    public static final void A00(Activity activity, AvatarCoinFlipConfig avatarCoinFlipConfig, UserSession userSession, C273414mX r11, String str) {
        A01(activity, avatarCoinFlipConfig, userSession, r11, str, 0.65f, 0.65f, true);
    }
}
