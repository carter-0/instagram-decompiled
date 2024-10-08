package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.9pD  reason: invalid class name and case insensitive filesystem */
public final class C389299pD extends AnonymousClass2xK {
    public final /* synthetic */ C246333eQ A00;
    public final /* synthetic */ 1Xj A01;

    public C389299pD(C246333eQ r1, 1Xj r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void DsH(AnonymousClass5Gv r9) {
        UserSession userSession = this.A00.A02;
        1Au.A00(userSession).A1Y(true);
        boolean A03 = C363388je.A03(C363388je.A00(userSession).A00(CallerContext.A01("DefaultMediaUFIOptionsDelegateImpl")));
        AnonymousClass818 r5 = AnonymousClass818.IG_SELF_REEL_FEED_VIEW;
        AnonymousClass819 r4 = AnonymousClass819.TOOLTIP_SHARE_LATER_REELS;
        C368278sM r3 = C368278sM.VIEW;
        0bb r2 = new 0bb();
        r2.A06("ig_media_id", this.A01.getId());
        r2.A09(Boolean.valueOf(A03));
        r2.A05("impression_count", 1L);
        C368288sN.A00(r5, r3, r4, r2, userSession);
    }
}
