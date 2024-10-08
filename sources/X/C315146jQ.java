package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.6jQ  reason: invalid class name and case insensitive filesystem */
public final class C315146jQ implements C315036jF {
    public final UserSession A00;

    public final AnonymousClass9UE C8F(UserSession userSession, C255773uh r3, C316026kz r4) {
        return null;
    }

    public final void DsI(Context context, AnonymousClass0iw r6, UserSession userSession, C255773uh r8, C250973mM r9) {
        0qQ.A0B(userSession, 0);
        0xa r3 = 1Au.A00(userSession).A01;
        int i = r3.getInt("favorites_badge_nux_impression_count", 0) + 1;
        0xY AR4 = r3.AR4();
        AR4.E5Z("favorites_badge_nux_impression_count", i);
        AR4.apply();
        1Av A002 = 1Au.A00(userSession);
        long currentTimeMillis = System.currentTimeMillis();
        0xY AR42 = A002.A01.AR4();
        AR42.E5c("favorites_badge_nux_last_timestamp", currentTimeMillis);
        AR42.apply();
    }

    public final boolean EtQ(UserSession userSession, C255773uh r9, C250973mM r10, C316026kz r11) {
        0qQ.A0B(userSession, 0);
        if (System.currentTimeMillis() - 1Au.A00(userSession).A01.getLong("favorites_badge_nux_last_timestamp", 0) > 86400000 && !1Au.A00(userSession).A01.getBoolean("has_tapped_on_favorites_badge", false) && 1Au.A00(userSession).A01.getInt("favorites_badge_nux_impression_count", 0) < 5) {
            1Xj r2 = r9.A0b;
            if (r2.A1t() != AnonymousClass3QO.CLOSE_FRIENDS || r11.AoN() == null || 2PP.A00(r2.A2A(userSession), 0eE.A00(userSession).A00())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final C226262fy C8G() {
        return C226262fy.BELOW_ANCHOR;
    }

    public C315146jQ(UserSession userSession) {
        this.A00 = userSession;
    }

    public final View C8E(C255773uh r2, C316026kz r3) {
        return r3.AoN();
    }

    public final AnonymousClass5Gs C8I(Context context, UserSession userSession, C255773uh r6, C250973mM r7) {
        return new C315476jx((CharSequence) context.getString(2131975488, new Object[]{r6.A0b.A2A(this.A00).getUsername()}));
    }
}
