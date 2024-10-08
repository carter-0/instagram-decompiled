package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.6jP  reason: invalid class name and case insensitive filesystem */
public final class C315136jP implements C315036jF {
    public final AnonymousClass9UE C8F(UserSession userSession, C255773uh r3, C316026kz r4) {
        return null;
    }

    public final C226262fy C8G() {
        return C226262fy.BELOW_ANCHOR;
    }

    public final View C8E(C255773uh r2, C316026kz r3) {
        C272024jy A00 = C297825sP.A00(r2);
        if (A00 == null) {
            return null;
        }
        C316066l3 r32 = (C316066l3) r3;
        if (AnonymousClass9OX.A02(A00)) {
            return r32.Bkr();
        }
        return r32.Bks();
    }

    public final AnonymousClass5Gs C8I(Context context, UserSession userSession, C255773uh r6, C250973mM r7) {
        String string = context.getString(2131969567);
        int i = 2131969565;
        if (r6.CcK()) {
            i = 2131969566;
        }
        User user = r6.A0i;
        user.getClass();
        return new PI1(string, context.getString(i, new Object[]{user.getUsername()}));
    }

    public final void DsI(Context context, AnonymousClass0iw r6, UserSession userSession, C255773uh r8, C250973mM r9) {
        C272024jy A00 = C297825sP.A00(r8);
        if (A00 != null) {
            AnonymousClass9OX.A02(A00);
            0xa r3 = 1Au.A00(userSession).A01;
            int i = r3.getInt("story_poll_tooltip_impression_count", 0) + 1;
            0xY AR4 = r3.AR4();
            AR4.E5Z("story_poll_tooltip_impression_count", i);
            AR4.apply();
        }
    }

    public final boolean EtQ(UserSession userSession, C255773uh r7, C250973mM r8, C316026kz r9) {
        Boolean CEx;
        String str;
        C272024jy A00 = C297825sP.A00(r7);
        if (A00 == null || (CEx = A00.CEx()) == null || !CEx.booleanValue() || A00.A0A != null) {
            return false;
        }
        boolean A02 = AnonymousClass9OX.A02(A00);
        0xa r1 = 1Au.A00(userSession).A01;
        if (A02) {
            str = "has_ever_voted_on_story_poll_v2";
        } else {
            str = "has_ever_voted_on_story_poll";
        }
        if (r1.getBoolean(str, false) || 1Au.A00(userSession).A01.getInt("story_poll_tooltip_impression_count", 0) >= 2) {
            return false;
        }
        return true;
    }
}
