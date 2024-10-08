package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.6jH  reason: invalid class name and case insensitive filesystem */
public final class C315056jH implements C315036jF {
    public final AnonymousClass9UE C8F(UserSession userSession, C255773uh r3, C316026kz r4) {
        return null;
    }

    public final C226262fy C8G() {
        return C226262fy.ABOVE_ANCHOR;
    }

    public final View C8E(C255773uh r2, C316026kz r3) {
        return r3.C00();
    }

    public final AnonymousClass5Gs C8I(Context context, UserSession userSession, C255773uh r5, C250973mM r6) {
        return new C315476jx((CharSequence) context.getString(2131963406));
    }

    public final void DsI(Context context, AnonymousClass0iw r5, UserSession userSession, C255773uh r7, C250973mM r8) {
        0xY AR4 = 1Au.A00(userSession).A01.AR4();
        AR4.E5T("story_highlights_seen_tooltip", true);
        AR4.apply();
    }

    public final boolean EtQ(UserSession userSession, C255773uh r5, C250973mM r6, C316026kz r7) {
        if (r7.C00() == null || 1Au.A00(userSession).A01.getBoolean("story_highlights_seen_tooltip", false)) {
            return false;
        }
        return true;
    }
}
