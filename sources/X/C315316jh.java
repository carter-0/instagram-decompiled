package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.6jh  reason: invalid class name and case insensitive filesystem */
public final class C315316jh implements C315036jF {
    public final View C8E(C255773uh r3, C316026kz r4) {
        C316006kx r42;
        C316136lA r0;
        C252063oV r02;
        0qQ.A0B(r4, 0);
        if (!(r4 instanceof C316006kx) || (r42 = (C316006kx) r4) == null || (r0 = r42.A1e) == null || (r02 = r0.A1Y) == null) {
            return null;
        }
        return r02.getView();
    }

    public final AnonymousClass9UE C8F(UserSession userSession, C255773uh r3, C316026kz r4) {
        return null;
    }

    public final AnonymousClass5Gs C8I(Context context, UserSession userSession, C255773uh r5, C250973mM r6) {
        0qQ.A0B(context, 1);
        String string = context.getString(2131974372);
        0qQ.A07(string);
        return new C315476jx((CharSequence) string);
    }

    public final void DsI(Context context, AnonymousClass0iw r5, UserSession userSession, C255773uh r7, C250973mM r8) {
        0qQ.A0B(userSession, 0);
        0xY AR4 = 1Au.A00(userSession).A01.AR4();
        AR4.E5T("has_seen_story_comments_button_tooltip", true);
        AR4.apply();
    }

    public final boolean EtQ(UserSession userSession, C255773uh r5, C250973mM r6, C316026kz r7) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r5, 1);
        0qQ.A0B(r6, 2);
        if (!r6.A0H.A1a && r5.A0k() && !1Au.A00(userSession).A01.getBoolean("has_seen_story_comments_button_tooltip", false)) {
            0Tu r2 = 0Tu.A05;
            if (!182.A06(r2, userSession, 36318247749949468L) || !182.A06(r2, userSession, 2342161256964560929L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final C226262fy C8G() {
        return C226262fy.ABOVE_ANCHOR;
    }
}
