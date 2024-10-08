package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.6jJ  reason: invalid class name and case insensitive filesystem */
public final class C315076jJ implements C315036jF {
    public final AnonymousClass9UE C8F(UserSession userSession, C255773uh r3, C316026kz r4) {
        return null;
    }

    public final View C8E(C255773uh r2, C316026kz r3) {
        return ((C316006kx) r3).A1b.A01;
    }

    public final C226262fy C8G() {
        return C226262fy.BELOW_ANCHOR;
    }

    public final AnonymousClass5Gs C8I(Context context, UserSession userSession, C255773uh r5, C250973mM r6) {
        return new C315476jx((CharSequence) context.getString(2131971059));
    }

    public final void DsI(Context context, AnonymousClass0iw r6, UserSession userSession, C255773uh r8, C250973mM r9) {
        0xa r3 = 1Au.A00(userSession).A01;
        int i = r3.getInt("story_question_tooltip_impression_count", 0) + 1;
        0xY AR4 = r3.AR4();
        AR4.E5Z("story_question_tooltip_impression_count", i);
        AR4.apply();
    }

    public final boolean EtQ(UserSession userSession, C255773uh r5, C250973mM r6, C316026kz r7) {
        Boolean bool;
        if (AnonymousClass6YG.A03(r5) == null || (bool = AnonymousClass6YG.A03(r5).A00.A02) == null || !bool.booleanValue() || 1Au.A00(userSession).A01.getBoolean("has_ever_responded_to_story_question", false) || 1Au.A00(userSession).A01.getInt("story_question_tooltip_impression_count", 0) >= 2) {
            return false;
        }
        return true;
    }
}
