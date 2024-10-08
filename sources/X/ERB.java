package X;

import com.instagram.common.session.UserSession;
import com.instagram.share.facebook.cxpnotice.noticestate.internal.CXPNoticeStateRepository;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class ERB extends LGS {
    public final String A00;
    public final AnonymousClass819 A01 = AnonymousClass819.BOTTOMSHEET_XAR_CCP_MIGRATION_REELS;
    public final List A02;

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
        return "XAR_TO_CCP_MIGRATION";
    }

    public final List A04() {
        return this.A02;
    }

    public ERB(List list, String str) {
        this.A02 = list;
        this.A00 = str;
    }

    public final AnonymousClass9I7 A02(AnonymousClass818 r6, UserSession userSession, CXPNoticeStateRepository cXPNoticeStateRepository) {
        DbY.A1S(userSession, cXPNoticeStateRepository);
        2DQ A002 = 2DQ.A00("XAR_TO_CCP_MIGRATION");
        0qQ.A07(A002);
        AnonymousClass9I7 A003 = cXPNoticeStateRepository.A00(A002);
        0xa r1 = 2D5.A00(userSession).A04;
        return A003.A00(DbT.A00(r1, "PREFERENCE_REELS_XAR_CCP_MIGRATION_UPSELL_SEEN_COUNT"), (int) TimeUnit.MILLISECONDS.toSeconds(DbW.A06(r1, "PREFERENCE_REELS_XAR_CCP_MIGRATION_UPSELL_LAST_SEEN_MS")));
    }
}
