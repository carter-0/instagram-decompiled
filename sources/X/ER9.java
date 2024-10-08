package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.share.facebook.cxpnotice.noticestate.internal.CXPNoticeStateRepository;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class ER9 extends LGS {
    public final List A00;

    public final boolean A05(LBK lbk) {
        FragmentActivity activity;
        FBQ fbq = lbk.A09;
        if (fbq != null) {
            E27 A002 = Eq8.A00(fbq);
            Fragment fragment = lbk.A02;
            if (!(fragment == null || (activity = fragment.getActivity()) == null)) {
                C331127Pr A0W = DbS.A0W(lbk.A05);
                A0W.A16 = false;
                A0W.A0U = new FmG(lbk, 12);
                DbU.A0y(activity, A002, A0W);
                return true;
            }
        }
        return false;
    }

    public final AnonymousClass819 A01() {
        return AnonymousClass819.BOTTOMSHEET_CCP_REELS;
    }

    public final String A03() {
        return "BOTTOMSHEET_CCP_REELS";
    }

    public final List A04() {
        return this.A00;
    }

    public ER9(List list) {
        this.A00 = list;
    }

    public final AnonymousClass9I7 A02(AnonymousClass818 r6, UserSession userSession, CXPNoticeStateRepository cXPNoticeStateRepository) {
        DbY.A1S(userSession, cXPNoticeStateRepository);
        2DQ A002 = 2DQ.A00("BOTTOMSHEET_CCP_REELS");
        0qQ.A07(A002);
        AnonymousClass9I7 A003 = cXPNoticeStateRepository.A00(A002);
        0xa r1 = 2D5.A00(userSession).A04;
        return A003.A00(DbT.A00(r1, "PREFERENCE_CROSSPOST_TO_FACEBOOK_UPSELL_VIEW_COUNT"), (int) TimeUnit.MILLISECONDS.toSeconds(DbW.A06(r1, AnonymousClass000.A00(2401))));
    }
}
