package X;

import com.instagram.common.session.UserSession;

public final class Lq1 implements C46204DQh {
    public final /* synthetic */ C3034168s A00;
    public final /* synthetic */ AnonymousClass5w8 A01;
    public final /* synthetic */ String A02;

    public Lq1(C3034168s r1, AnonymousClass5w8 r2, String str) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = str;
    }

    public final void DED() {
        String str;
        boolean z;
        C3034168s r0 = this.A00;
        if (r0 != null) {
            r0.DED();
        }
        AnonymousClass5w8 r2 = this.A01;
        AnonymousClass5w9 r02 = AnonymousClass5w8.A05;
        UserSession userSession = r2.A02;
        C295095nZ A04 = r2.A04();
        C295085nY r03 = null;
        if (A04 != null) {
            str = A04.A04;
        } else {
            str = null;
        }
        String str2 = this.A02;
        C295095nZ A042 = r2.A04();
        if (A042 != null) {
            z = A042.A05;
        } else {
            z = false;
        }
        C295095nZ A043 = r2.A04();
        if (A043 != null) {
            r03 = A043.A01;
        }
        C295105na.A02(userSession, "default_privacy_opt_in_mutation_failure", "", str, str2, String.valueOf(r03), false, false, z);
    }

    public final void onSuccess() {
        C295065nW r4;
        String str;
        boolean z;
        AnonymousClass5w8 r2 = this.A01;
        if (r2.A04() != null) {
            C295095nZ A04 = r2.A04();
            if (A04 != null) {
                A04.A00 = true;
            }
        } else {
            r2.A0A(new C295095nZ(C295085nY.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, C295065nW.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "", "", true, false));
        }
        C295095nZ A042 = r2.A04();
        if (A042 == null || (r4 = A042.A02) == null) {
            r4 = C295065nW.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
        }
        UserSession userSession = r2.A02;
        if (182.A06(0Tu.A05, userSession, 36323015163652850L)) {
            0xY AR4 = 2D5.A00(userSession).A04.AR4();
            AR4.E5T("PREFERENCE_IG_TO_FB_FEED_OPT_IN_DEFAULT_AUDIENCE", true);
            AR4.apply();
        }
        C3034168s r0 = this.A00;
        if (r0 != null) {
            r0.onSuccess();
        }
        String obj = r4.toString();
        C295095nZ A043 = r2.A04();
        C295085nY r02 = null;
        if (A043 != null) {
            str = A043.A04;
        } else {
            str = null;
        }
        String str2 = this.A02;
        C295095nZ A044 = r2.A04();
        if (A044 != null) {
            z = A044.A05;
        } else {
            z = false;
        }
        C295095nZ A045 = r2.A04();
        if (A045 != null) {
            r02 = A045.A01;
        }
        C295105na.A02(userSession, "default_privacy_opt_in_mutation_success", obj, str, str2, String.valueOf(r02), true, true, z);
    }
}
