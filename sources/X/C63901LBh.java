package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.share.facebook.model.FBReelsAudienceType;

/* renamed from: X.LBh  reason: case insensitive filesystem */
public final class C63901LBh {
    public final AnonymousClass819 A00(Context context, AnonymousClass818 r9, UserSession userSession, boolean z) {
        String str;
        Integer A00 = C368008rv.A00(r9);
        if (z) {
            if (context != null) {
                C363378jd A002 = C363388je.A00(userSession);
                CallerContext callerContext = KYc.A01;
                C299935wF A003 = A002.A00(callerContext);
                AnonymousClass5w9 r0 = AnonymousClass5w8.A05;
                String A05 = AnonymousClass5w9.A00(userSession).A05(context, userSession);
                String A004 = C367158qH.A00(context, userSession, A003);
                C60951Ju9 A01 = C367288qV.A01(callerContext, userSession);
                if (C363388je.A02(A003) && 182.A06(0Tu.A05, userSession, 36330703155118818L)) {
                    str = context.getString(2131973567);
                } else if (A01 != null) {
                    str = A01.A02;
                } else {
                    str = null;
                }
                boolean z2 = true;
                if (A05 == null || A004 == null || str == null || A01 == null || A01.A01 == FBReelsAudienceType.A07) {
                    z2 = false;
                }
                if (182.A06(0Tu.A05, userSession, 36321791097972500L)) {
                    if (z2) {
                        return AnonymousClass819.BOTTOMSHEET_UNIFIED_STORIES_FEED_REELS;
                    }
                    AnonymousClass819 r4 = AnonymousClass819.BOTTOMSHEET_UNIFIED_STORIES_FEED_REELS;
                    C368278sM r3 = C368278sM.SUPPRESS;
                    AnonymousClass81A A0O = JTO.A0O();
                    A0O.A06("suppress_reason", "invalid_fb_audiences");
                    C368288sN.A00(r9, r3, r4, A0O, userSession);
                }
            }
        } else if (A00 == AnonymousClass05K.A00) {
            return AnonymousClass819.BOTTOMSHEET_STORY;
        } else {
            if (A00 == AnonymousClass05K.A01) {
                return AnonymousClass819.BOTTOMSHEET_FEED;
            }
        }
        return AnonymousClass819.BOTTOMSHEET_UNIFIED_STORIES_FEED;
    }
}
