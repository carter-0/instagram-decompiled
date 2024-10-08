package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.6jL  reason: invalid class name and case insensitive filesystem */
public final class C315096jL implements C315036jF {
    public final AnonymousClass9UE C8F(UserSession userSession, C255773uh r3, C316026kz r4) {
        return null;
    }

    public final View C8E(C255773uh r2, C316026kz r3) {
        return ((C316006kx) r3).A1U.A01;
    }

    public final C226262fy C8G() {
        return C226262fy.BELOW_ANCHOR;
    }

    public final AnonymousClass5Gs C8I(Context context, UserSession userSession, C255773uh r6, C250973mM r7) {
        String string = context.getString(2131971248);
        User user = r6.A0i;
        user.getClass();
        return new PI1(string, context.getString(2131971247, new Object[]{user.getUsername()}));
    }

    public final void DsI(Context context, AnonymousClass0iw r6, UserSession userSession, C255773uh r8, C250973mM r9) {
        0xa r3 = 1Au.A00(userSession).A01;
        int i = r3.getInt("story_quiz_tooltip_impression_count", 0) + 1;
        0xY AR4 = r3.AR4();
        AR4.E5Z("story_quiz_tooltip_impression_count", i);
        AR4.apply();
    }

    public final boolean EtQ(UserSession userSession, C255773uh r5, C250973mM r6, C316026kz r7) {
        if (C265894Ws.A01(r5) == null || !Boolean.TRUE.equals(C265894Ws.A01(r5).A02.A01) || 1Au.A00(userSession).A01.getBoolean("has_ever_answered_story_quiz", false) || 1Au.A00(userSession).A01.getInt("story_quiz_tooltip_impression_count", 0) >= 2) {
            return false;
        }
        return true;
    }
}
