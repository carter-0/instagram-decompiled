package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6jR  reason: invalid class name and case insensitive filesystem */
public final class C315156jR implements C315036jF {
    public final C314996jB A00;

    public final View C8E(C255773uh r2, C316026kz r3) {
        0qQ.A0B(r3, 0);
        return r3.B2R();
    }

    public final AnonymousClass9UE C8F(UserSession userSession, C255773uh r3, C316026kz r4) {
        return null;
    }

    public final AnonymousClass5Gs C8I(Context context, UserSession userSession, C255773uh r5, C250973mM r6) {
        0qQ.A0B(context, 1);
        CharSequence text = context.getText(2131961999);
        0qQ.A07(text);
        return new C315476jx(text);
    }

    public final boolean EtQ(UserSession userSession, C255773uh r8, C250973mM r9, C316026kz r10) {
        String str;
        User A2A;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r8, 1);
        0qQ.A0B(r10, 3);
        if (r10.B2R() != null) {
            0xa r5 = this.A00.A01;
            if (r5.getInt("exclusive_story_badge_tooltip_count", 0) < 3 && System.currentTimeMillis() - r5.getLong("exclusive_story_badge_tooltip_timestamp", 0) > TimeUnit.DAYS.toMillis(1)) {
                String id = 0eE.A00(userSession).A00().getId();
                1Xj r0 = r8.A0b;
                if (r0 == null || (A2A = r0.A2A(userSession)) == null) {
                    str = null;
                } else {
                    str = A2A.getId();
                }
                if (0qQ.A0K(id, str)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final C226262fy C8G() {
        return C226262fy.BELOW_ANCHOR;
    }

    public final void DsI(Context context, AnonymousClass0iw r7, UserSession userSession, C255773uh r9, C250973mM r10) {
        0xa r4 = this.A00.A01;
        int i = r4.getInt("exclusive_story_badge_tooltip_count", 0) + 1;
        0xY AR4 = r4.AR4();
        AR4.E5Z("exclusive_story_badge_tooltip_count", i);
        AR4.apply();
        long currentTimeMillis = System.currentTimeMillis();
        0xY AR42 = r4.AR4();
        AR42.E5c("exclusive_story_badge_tooltip_timestamp", currentTimeMillis);
        AR42.apply();
    }

    public C315156jR(UserSession userSession) {
        this.A00 = C314986jA.A00(userSession);
    }
}
