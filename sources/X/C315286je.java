package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.6je  reason: invalid class name and case insensitive filesystem */
public final class C315286je implements C315036jF {
    public final View C8E(C255773uh r2, C316026kz r3) {
        0qQ.A0B(r3, 0);
        return r3.C1D();
    }

    public final AnonymousClass9UE C8F(UserSession userSession, C255773uh r3, C316026kz r4) {
        return null;
    }

    public final AnonymousClass5Gs C8I(Context context, UserSession userSession, C255773uh r5, C250973mM r6) {
        0qQ.A0B(context, 1);
        String string = context.getResources().getString(2131960321);
        0qQ.A07(string);
        return new C315476jx((CharSequence) string);
    }

    public final void DsI(Context context, AnonymousClass0iw r7, UserSession userSession, C255773uh r9, C250973mM r10) {
        String str;
        String str2;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r7, 2);
        0qQ.A0B(r9, 3);
        String str3 = r9.A0j;
        0qQ.A07(str3);
        User user = r9.A0i;
        if (user != null) {
            str = user.getId();
        } else {
            str = null;
        }
        if (r9.A1J()) {
            str2 = "story_highlight_action_sheet";
        } else {
            str2 = "location_story_action_sheet";
        }
        C22031Xty.A0C(r7, userSession, str3, str, str2);
        1Av A00 = 1Au.A00(userSession);
        A00.A3G.Epx(A00, false, 1Av.A8a[375]);
        1Au.A00(userSession).A0P();
    }

    public final boolean EtQ(UserSession userSession, C255773uh r6, C250973mM r7, C316026kz r8) {
        0qQ.A0B(userSession, 0);
        1Av A00 = 1Au.A00(userSession);
        return ((Boolean) A00.A3G.CDM(A00, 1Av.A8a[375])).booleanValue();
    }

    public final C226262fy C8G() {
        return C226262fy.ABOVE_ANCHOR;
    }
}
