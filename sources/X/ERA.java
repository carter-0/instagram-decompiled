package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.share.facebook.cxpnotice.noticestate.internal.CXPNoticeStateRepository;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class ERA extends LGS {
    public final List A00;

    public final boolean A05(LBK lbk) {
        Fragment fragment;
        if (lbk.A09 == null || (fragment = lbk.A02) == null) {
            return false;
        }
        FGZ.A01.A05(fragment, lbk);
        return true;
    }

    public final AnonymousClass819 A01() {
        return AnonymousClass819.BOTTOMSHEET_XAR_REELS;
    }

    public final String A03() {
        return "BOTTOMSHEET_XAR_REELS";
    }

    public final List A04() {
        return this.A00;
    }

    public ERA(List list) {
        this.A00 = list;
    }

    public final AnonymousClass9I7 A02(AnonymousClass818 r7, UserSession userSession, CXPNoticeStateRepository cXPNoticeStateRepository) {
        DbY.A1S(userSession, cXPNoticeStateRepository);
        2DQ A002 = 2DQ.A00("BOTTOMSHEET_XAR_REELS");
        0qQ.A07(A002);
        AnonymousClass9I7 A003 = cXPNoticeStateRepository.A00(A002);
        0xa r4 = 2D5.A00(userSession).A04;
        return A003.A00(r4.getBoolean("PREFERENCE_REELS_SHOULD_SHOW_RECOMMEND_ON_FACEBOOK_CREATION_PRIMER", true) ^ true ? 1 : 0, (int) TimeUnit.MILLISECONDS.toSeconds(DbW.A06(r4, AnonymousClass000.A00(2404))));
    }
}
