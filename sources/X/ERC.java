package X;

import com.instagram.common.session.UserSession;
import com.instagram.share.facebook.cxpnotice.noticestate.internal.CXPNoticeStateRepository;
import java.util.List;

public final class ERC extends LGS {
    public final String A00;
    public final AnonymousClass819 A01 = AnonymousClass819.BOTTOMSHEET_XAR_CCP_MIGRATION_REELS_V2;
    public final List A02;

    public final AnonymousClass9I7 A02(AnonymousClass818 r2, UserSession userSession, CXPNoticeStateRepository cXPNoticeStateRepository) {
        0qQ.A0B(cXPNoticeStateRepository, 2);
        2DQ A002 = 2DQ.A00("BOTTOMSHEET_XAR_CCP_MIGRATION_REELS_V2");
        0qQ.A07(A002);
        return cXPNoticeStateRepository.A00(A002);
    }

    public final boolean A05(LBK lbk) {
        AnonymousClass4DH r4;
        FBQ fbq = lbk.A09;
        if (fbq == null || (r4 = lbk.A02) == null) {
            return false;
        }
        UserSession userSession = lbk.A05;
        String str = this.A00;
        C49912FEk.A00(fbq.A01, r4, userSession, Integer.valueOf(fbq.A00), str);
        return true;
    }

    public final AnonymousClass819 A01() {
        return this.A01;
    }

    public final String A03() {
        return "BOTTOMSHEET_XAR_CCP_MIGRATION_REELS_V2";
    }

    public final List A04() {
        return this.A02;
    }

    public ERC(List list, String str) {
        this.A02 = list;
        this.A00 = str;
    }
}
