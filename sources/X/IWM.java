package X;

import com.instagram.adshistory.fragment.RecentAdActivityFragment;
import com.instagram.common.session.UserSession;

public final class IWM implements G6C {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ 1Xj A01;
    public final /* synthetic */ C55532HjE A02;
    public final /* synthetic */ String A03;

    public final void Doc(Boolean bool) {
        if (AnonymousClass7TF.A1Y(bool, true)) {
            1sd.A00(this.A00).A02(this.A01, true);
            C55602HkM hkM = AnonymousClass6SO.A00;
            if (hkM != null) {
                C299275ur.A00(hkM.A00, new AnonymousClass6Tm(AnonymousClass7TE.A1C()), hkM.A01);
            }
            this.A02.A00.A0A.Ctt("remove_from_ad_activity", (String) null);
            C55439Hhj hhj = HQJ.A00;
            if (hhj != null) {
                String str = this.A03;
                RecentAdActivityFragment recentAdActivityFragment = hhj.A00;
                if (recentAdActivityFragment.requireActivity().hasWindowFocus()) {
                    RecentAdActivityFragment.A01(recentAdActivityFragment, str);
                } else {
                    recentAdActivityFragment.A06 = str;
                }
            }
        }
    }

    public IWM(UserSession userSession, 1Xj r2, C55532HjE hjE, String str) {
        this.A00 = userSession;
        this.A01 = r2;
        this.A02 = hjE;
        this.A03 = str;
    }
}
