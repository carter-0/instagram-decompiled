package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;

public final class FRW implements CallerContextable {
    public static FRW A04 = null;
    public static final String __redex_internal_original_name = "AutoCrosspostingNuxHelper";
    public 1wn A00;
    public boolean A01;
    public final UserSession A02;
    public final AnonymousClass81D A03;

    public final synchronized void A01() {
        1wn r2 = this.A00;
        if (r2 != null) {
            AnonymousClass1Nd.A00(this.A02).A02(r2, C290845g3.class);
        }
    }

    public static final boolean A00(Context context, FRW frw, EXD exd) {
        if (!2Lv.A00(frw.A02).A00(CallerContext.A00(FRW.class), C273654mx.A00(738)) && exd != EXD.A04) {
            return false;
        }
        frw.A01 = false;
        frw.A03.A03(context, new C50964Flr(frw));
        return true;
    }

    public FRW(UserSession userSession) {
        this.A02 = userSession;
        AnonymousClass818 r1 = AnonymousClass818.IG_NUX;
        AnonymousClass819 r2 = AnonymousClass819.FULLSCREEN_UNIFIED_STORIES_FEED;
        0bb r3 = new 0bb();
        Boolean A0v = AnonymousClass7TE.A0v();
        r3.A0A(A0v);
        r3.A09(A0v);
        this.A03 = new AnonymousClass81D(r1, r2, r3, userSession, false);
    }
}
