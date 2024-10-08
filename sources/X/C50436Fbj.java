package X;

import com.instagram.common.session.UserSession;
import com.instagram.fanclub.memberlist.viewmodel.FanClubMemberListViewModel;

/* renamed from: X.Fbj  reason: case insensitive filesystem */
public final class C50436Fbj implements C229132mt {
    public final int A00;
    public final Object A01;

    public C50436Fbj(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void ACw() {
        boolean z;
        switch (this.A00) {
            case 0:
                E7X e7x = (E7X) this.A01;
                ((C47869EKp) e7x.A0L.getValue()).A03(false, e7x.A04);
                return;
            case 1:
                EEP eep = (EEP) this.A01;
                C49607EzQ ezQ = eep.A0F;
                if (eep.A0V && (z = eep.A0S) && ezQ != null && eep.A0W) {
                    String str = eep.A0K;
                    if ((str == null || !str.equals(eep.A0J)) && !eep.A0R) {
                        eep.A0R = true;
                        ezQ.A02 = true;
                        String str2 = null;
                        ezQ.A00 = null;
                        UserSession userSession = eep.A0g;
                        G9Y g9y = eep.A0m;
                        C67210Mk6 mk6 = eep.A0o.A03;
                        if (mk6 != null) {
                            str2 = mk6.A02;
                        }
                        C72920PPe A012 = C67562Mpw.A01(userSession, g9y, str2, (String) null, eep.A0J, z);
                        eep.A0D = A012;
                        A012.EcJ(new C50920Fkz(eep, ezQ));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ((C46797DlY) ((E7M) this.A01).A02.getValue()).CgO();
                return;
            case 3:
                FanClubMemberListViewModel fanClubMemberListViewModel = (FanClubMemberListViewModel) ((E7P) this.A01).A02.getValue();
                fanClubMemberListViewModel.A06.A01((String) fanClubMemberListViewModel.A0G.getValue());
                return;
            case 4:
                2YL A0H = DbS.A0H(((E7N) this.A01).A02);
                AnonymousClass7TE.A1Z(new MG8(A0H, (AnonymousClass4D7) null, 0), C318116oQ.A00(A0H));
                return;
            default:
                C49707F2s f2s = ((C47438E2k) this.A01).A01;
                0qQ.A0A(f2s);
                f2s.A00();
                return;
        }
    }
}
