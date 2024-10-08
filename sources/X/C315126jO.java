package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.6jO  reason: invalid class name and case insensitive filesystem */
public final class C315126jO implements C315036jF {
    public final AnonymousClass9UE C8F(UserSession userSession, C255773uh r3, C316026kz r4) {
        return null;
    }

    public final View C8E(C255773uh r2, C316026kz r3) {
        return ((C316006kx) r3).A14.A06;
    }

    public final C226262fy C8G() {
        return C226262fy.BELOW_ANCHOR;
    }

    public final boolean EtQ(UserSession userSession, C255773uh r5, C250973mM r6, C316026kz r7) {
        Boolean bool;
        1Xj r2 = r5.A0b;
        if (r2 == null || 2PP.A00(r2.A2A(userSession), AnonymousClass0t1.A01.A01(userSession)) || AnonymousClass6UJ.A00(r2) == null || (bool = AnonymousClass6UJ.A00(r2).A00.A01) == null || !bool.booleanValue() || AnonymousClass6UJ.A00(r2).A03() || 1Au.A00(userSession).A01.getBoolean("has_ever_voted_on_story_slider", false) || 1Au.A00(userSession).A01.getInt("story_slider_tooltip_impression_count", 0) >= 2) {
            return false;
        }
        return true;
    }

    public final AnonymousClass5Gs C8I(Context context, UserSession userSession, C255773uh r6, C250973mM r7) {
        String string = context.getString(2131974008);
        User user = r6.A0i;
        user.getClass();
        return new PI1(string, context.getString(2131974007, new Object[]{user.getUsername()}));
    }

    public final void DsI(Context context, AnonymousClass0iw r6, UserSession userSession, C255773uh r8, C250973mM r9) {
        0xa r3 = 1Au.A00(userSession).A01;
        int i = r3.getInt("story_slider_tooltip_impression_count", 0) + 1;
        0xY AR4 = r3.AR4();
        AR4.E5Z("story_slider_tooltip_impression_count", i);
        AR4.apply();
    }
}
