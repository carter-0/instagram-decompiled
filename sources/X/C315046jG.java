package X;

import android.content.Context;
import android.view.View;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6jG  reason: invalid class name and case insensitive filesystem */
public final class C315046jG implements C315036jF, CallerContextable {
    public static final CallerContext A00 = CallerContext.A00(C315046jG.class);
    public static final String __redex_internal_original_name = "OneTapFBShareTooltipDelegate";

    public final AnonymousClass9UE C8F(UserSession userSession, C255773uh r3, C316026kz r4) {
        return null;
    }

    public final C226262fy C8G() {
        return C226262fy.ABOVE_ANCHOR;
    }

    public final View C8E(C255773uh r2, C316026kz r3) {
        return r3.B3a();
    }

    public final AnonymousClass5Gs C8I(Context context, UserSession userSession, C255773uh r5, C250973mM r6) {
        return new C315476jx((CharSequence) context.getString(2131973564));
    }

    public final void DsI(Context context, AnonymousClass0iw r10, UserSession userSession, C255773uh r12, C250973mM r13) {
        1Av A002 = 1Au.A00(userSession);
        A002.A0i(System.currentTimeMillis());
        0xa r2 = A002.A01;
        int i = r2.getInt("reel_one_tap_fbshare_tooltip_count", 0) + 1;
        0xY AR4 = r2.AR4();
        AR4.E5Z("reel_one_tap_fbshare_tooltip_count", i);
        AR4.apply();
        boolean A03 = C363388je.A03(C363388je.A00(userSession).A00(A00));
        AnonymousClass818 r5 = AnonymousClass818.IG_SELF_STORY_VIEW_FB_BUTTON_TOOLTIP;
        AnonymousClass819 r4 = AnonymousClass819.TOOLTIP_NUX_STORIES;
        C368278sM r3 = C368278sM.VIEW;
        0bb r22 = new 0bb();
        r22.A09(Boolean.valueOf(A03));
        r22.A05("impression_count", Long.valueOf((long) 1Au.A00(userSession).A01.getInt("reel_one_tap_fbshare_tooltip_count", 0)));
        C368288sN.A00(r5, r3, r4, r22, userSession);
    }

    public final boolean EtQ(UserSession userSession, C255773uh r9, C250973mM r10, C316026kz r11) {
        1Av A002 = 1Au.A00(userSession);
        View B3a = r11.B3a();
        if (B3a != null && !B3a.isSelected()) {
            0xa r3 = A002.A01;
            if (r3.getInt("reel_one_tap_fbshare_tooltip_count", 0) < 3) {
                long j = r3.getLong("reel_one_tap_fbshare_tooltip_last_seen_sec", 0);
                if (j == 0 || TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - j > 604800) {
                    if (!C367998ru.A03(AnonymousClass818.IG_SELF_STORY_VIEW_FB_BUTTON_TOOLTIP, AnonymousClass819.TOOLTIP_NUX_STORIES, userSession)) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
