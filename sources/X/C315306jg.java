package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.6jg  reason: invalid class name and case insensitive filesystem */
public final class C315306jg implements C315036jF {
    public final AnonymousClass3BQ A00;

    public final View C8E(C255773uh r3, C316026kz r4) {
        C309406Yd r42;
        AnonymousClass6PB r1;
        0qQ.A0B(r4, 0);
        if (!(r4 instanceof C309406Yd) || (r42 = (C309406Yd) r4) == null || (r1 = r42.A0X) == null) {
            return null;
        }
        return r1.A05;
    }

    public final AnonymousClass9UE C8F(UserSession userSession, C255773uh r3, C316026kz r4) {
        return null;
    }

    public final AnonymousClass5Gs C8I(Context context, UserSession userSession, C255773uh r5, C250973mM r6) {
        0qQ.A0B(context, 1);
        String string = context.getString(2131965838);
        0qQ.A07(string);
        return new C315476jx((CharSequence) string);
    }

    public final void DsI(Context context, AnonymousClass0iw r6, UserSession userSession, C255773uh r8, C250973mM r9) {
        0qQ.A0B(userSession, 0);
        0xa r3 = 1Au.A00(userSession).A01;
        int i = r3.getInt("boosted_story_mention_settings_tooltip_impression_count", 0) + 1;
        0xY AR4 = r3.AR4();
        AR4.E5Z("boosted_story_mention_settings_tooltip_impression_count", i);
        AR4.apply();
    }

    public final boolean EtQ(UserSession userSession, C255773uh r7, C250973mM r8, C316026kz r9) {
        C309406Yd r92;
        AnonymousClass6PB r0;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r7, 1);
        0qQ.A0B(r9, 3);
        View view = null;
        if (!(!(r9 instanceof C309406Yd) || (r92 = (C309406Yd) r9) == null || (r0 = r92.A0X) == null)) {
            view = r0.A05;
        }
        if (1Au.A00(userSession).A01.getInt("boosted_story_mention_settings_tooltip_impression_count", 0) >= 100 || view == null) {
            return false;
        }
        1Xj r3 = r7.A0b;
        boolean z = false;
        if (this.A00 == AnonymousClass3BQ.ACTIVITY_FEED_USER_MENTIONED_IN_AD_NOTIF) {
            z = true;
        }
        if (C305936Kd.A05(userSession, r3, z)) {
            return true;
        }
        return false;
    }

    public final C226262fy C8G() {
        return C226262fy.BELOW_ANCHOR;
    }

    public C315306jg(AnonymousClass3BQ r1) {
        this.A00 = r1;
    }
}
