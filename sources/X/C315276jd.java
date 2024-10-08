package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.6jd  reason: invalid class name and case insensitive filesystem */
public final class C315276jd implements C315036jF {
    public final View C8E(C255773uh r2, C316026kz r3) {
        0qQ.A0B(r3, 0);
        return r3.CFK();
    }

    public final AnonymousClass9UE C8F(UserSession userSession, C255773uh r3, C316026kz r4) {
        return null;
    }

    public final AnonymousClass5Gs C8I(Context context, UserSession userSession, C255773uh r5, C250973mM r6) {
        0qQ.A0B(context, 1);
        String string = context.getResources().getString(2131971322);
        0qQ.A07(string);
        return new C315476jx((CharSequence) string);
    }

    public final void DsI(Context context, AnonymousClass0iw r5, UserSession userSession, C255773uh r7, C250973mM r8) {
        0qQ.A0B(userSession, 0);
        0xY AR4 = 1Al.A01(userSession).A03(1An.A36).AR4();
        AR4.E5T("reaction_sticker_facepile_nux_shown", true);
        AR4.apply();
    }

    public final boolean EtQ(UserSession userSession, C255773uh r6, C250973mM r7, C316026kz r8) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r6, 1);
        0qQ.A0B(r7, 2);
        if (1Al.A01(userSession).A03(1An.A36).getBoolean("reaction_sticker_facepile_nux_shown", false) || !AnonymousClass6YK.A02(userSession, r6, r7) || !r6.CWu()) {
            return false;
        }
        1Xj r0 = r6.A0b;
        r0.getClass();
        List C15 = r0.A0C.C15();
        if (C15 == null || C15.isEmpty()) {
            return false;
        }
        return true;
    }

    public final C226262fy C8G() {
        return C226262fy.ABOVE_ANCHOR;
    }
}
