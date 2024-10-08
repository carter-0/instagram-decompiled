package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.List;

/* renamed from: X.6ja  reason: invalid class name and case insensitive filesystem */
public final class C315246ja implements C315036jF {
    public final View C8E(C255773uh r2, C316026kz r3) {
        0qQ.A0B(r3, 0);
        return r3.C8D();
    }

    public final AnonymousClass9UE C8F(UserSession userSession, C255773uh r3, C316026kz r4) {
        return null;
    }

    public final AnonymousClass5Gs C8I(Context context, UserSession userSession, C255773uh r5, C250973mM r6) {
        0qQ.A0B(context, 1);
        String string = context.getString(2131952309);
        0qQ.A07(string);
        return new C315476jx((CharSequence) string);
    }

    public final void DsI(Context context, AnonymousClass0iw r6, UserSession userSession, C255773uh r8, C250973mM r9) {
        0qQ.A0B(userSession, 0);
        0xa r3 = 1Au.A00(userSession).A01;
        int i = r3.getInt("story_add_mentions_tooltip_impression_count", 0) + 1;
        0xY AR4 = r3.AR4();
        AR4.E5Z("story_add_mentions_tooltip_impression_count", i);
        AR4.apply();
    }

    public final boolean EtQ(UserSession userSession, C255773uh r7, C250973mM r8, C316026kz r9) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r7, 1);
        0qQ.A0B(r8, 2);
        0qQ.A0B(r9, 3);
        if (r7.CWu()) {
            Reel reel = r8.A0H;
            if (!reel.A0b() && !reel.A0i() && !r7.A1e() && r9.C8D() != null && AnonymousClass6YK.A02(userSession, r7, r8)) {
                1Xj r0 = r7.A0b;
                if (r0 != null) {
                    List A3d = r0.A3d();
                    if ((A3d == null || A3d.size() < 20) && !1Au.A00(userSession).A01.getBoolean("has_added_anytime_story_mentions", false) && 1Au.A00(userSession).A01.getInt("story_add_mentions_tooltip_impression_count", 0) <= 2) {
                        return true;
                    }
                    return false;
                }
                throw new IllegalStateException("Required value was null.");
            }
        }
        return false;
    }

    public final C226262fy C8G() {
        return C226262fy.ABOVE_ANCHOR;
    }
}
