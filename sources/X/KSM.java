package X;

import com.instagram.common.session.UserSession;

public final class KSM extends AnonymousClass2xK {
    public final /* synthetic */ LMT A00;
    public final /* synthetic */ 2D6 A01;
    public final /* synthetic */ String A02;

    public KSM(LMT lmt, 2D6 r2, String str) {
        this.A01 = r2;
        this.A00 = lmt;
        this.A02 = str;
    }

    public final void DsH(AnonymousClass5Gv r8) {
        this.A01.A07(true);
        UserSession userSession = this.A00.A01;
        boolean A1Z = Dbb.A1Z(C363388je.A00(userSession), "ClipsShareSheetTooltipManager");
        27p.A01(userSession).A1M(C59725JVj.SHARE_SHEET, true, this.A02);
        AnonymousClass818 r4 = AnonymousClass818.IG_REELS_PANAVISION_COMPOSER;
        AnonymousClass819 r3 = AnonymousClass819.TOOLTIP_SHARE_SHEET_CCP_REELS;
        C368278sM r2 = C368278sM.VIEW;
        AnonymousClass81A A0O = JTO.A0O();
        A0O.A09(Boolean.valueOf(A1Z));
        C368288sN.A00(r4, r2, r3, A0O, userSession);
    }
}
