package X;

import com.instagram.profile.fragment.UserDetailFragment;

public final /* synthetic */ class Ddb implements AnonymousClass2gO {
    public final /* synthetic */ UserDetailFragment A00;

    public /* synthetic */ Ddb(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    public final void onChanged(Object obj) {
        UserDetailFragment userDetailFragment = this.A00;
        C48201Eah eah = (C48201Eah) obj;
        if (eah instanceof C46543Dgk) {
            return;
        }
        if (eah instanceof C323136x0) {
            userDetailFragment.EaM(true);
        } else if (eah instanceof EPI) {
            userDetailFragment.EaM(false);
            EQI eqi = ((EPI) eah).A00;
            userDetailFragment.Dwc(eqi.A02, eqi.A00, eqi.A03, eqi.A00, eqi.A04);
            userDetailFragment.Ehu(eqi.A01);
        } else if (eah instanceof EPJ) {
            userDetailFragment.Cl8();
            userDetailFragment.EaM(false);
            EPJ epj = (EPJ) eah;
            C49515Ewu ewu = epj.A00;
            if (ewu != null) {
                userDetailFragment.DFR(ewu.A01, ewu.A00, epj.A01);
            }
        }
    }
}
