package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.6jE  reason: invalid class name and case insensitive filesystem */
public final class C315026jE implements C315036jF {
    public final View C8E(C255773uh r2, C316026kz r3) {
        0qQ.A0B(r3, 0);
        return r3.As7();
    }

    public final AnonymousClass9UE C8F(UserSession userSession, C255773uh r3, C316026kz r4) {
        return null;
    }

    public final AnonymousClass5Gs C8I(Context context, UserSession userSession, C255773uh r5, C250973mM r6) {
        0qQ.A0B(context, 1);
        String string = context.getString(2131956857);
        0qQ.A07(string);
        return new C315476jx((CharSequence) string);
    }

    public final void DsI(Context context, AnonymousClass0iw r5, UserSession userSession, C255773uh r7, C250973mM r8) {
        0qQ.A0B(userSession, 0);
        0xY AR4 = 1Au.A00(userSession).A01.AR4();
        AR4.E5T("create_from_story_has_seen_tooltip", true);
        AR4.apply();
    }

    public final boolean EtQ(UserSession userSession, C255773uh r5, C250973mM r6, C316026kz r7) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r7, 3);
        if (r7.As7() == null || 1Au.A00(userSession).A01.getBoolean("create_from_story_has_seen_tooltip", false)) {
            return false;
        }
        return true;
    }

    public final C226262fy C8G() {
        return C226262fy.ABOVE_ANCHOR;
    }
}
