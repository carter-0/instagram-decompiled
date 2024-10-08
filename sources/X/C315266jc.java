package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.6jc  reason: invalid class name and case insensitive filesystem */
public final class C315266jc implements C315036jF {
    public final View C8E(C255773uh r3, C316026kz r4) {
        C316006kx r42;
        C316856mK r1;
        0qQ.A0B(r4, 0);
        if (!(r4 instanceof C316006kx) || (r42 = (C316006kx) r4) == null || (r1 = r42.A1i) == null) {
            return null;
        }
        return r1.A01.A01();
    }

    public final AnonymousClass9UE C8F(UserSession userSession, C255773uh r3, C316026kz r4) {
        return null;
    }

    public final AnonymousClass5Gs C8I(Context context, UserSession userSession, C255773uh r5, C250973mM r6) {
        0qQ.A0B(context, 1);
        String string = context.getString(2131971323);
        0qQ.A07(string);
        return new C315476jx((CharSequence) string);
    }

    public final void DsI(Context context, AnonymousClass0iw r5, UserSession userSession, C255773uh r7, C250973mM r8) {
        0qQ.A0B(userSession, 0);
        0xY AR4 = 1Al.A01(userSession).A03(1An.A36).AR4();
        AR4.E5T("tappable_reaction_sticker_nux_shown", true);
        AR4.apply();
    }

    public final boolean EtQ(UserSession userSession, C255773uh r7, C250973mM r8, C316026kz r9) {
        List A3o;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r7, 1);
        if (1Al.A01(userSession).A04(1An.A36, getClass()).getBoolean("tappable_reaction_sticker_nux_shown", false)) {
            return false;
        }
        1Xj r2 = r7.A0b;
        String str = null;
        if (r2 == null || (A3o = r2.A3o(AnonymousClass3WT.REACTION)) == null || !(!A3o.isEmpty())) {
            return false;
        }
        User user = r7.A0i;
        if (user != null) {
            str = user.getId();
        }
        if (!2R8.A05(userSession, str)) {
            return true;
        }
        return false;
    }

    public final C226262fy C8G() {
        return C226262fy.BELOW_ANCHOR;
    }
}
