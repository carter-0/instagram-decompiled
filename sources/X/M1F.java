package X;

import com.instagram.common.session.UserSession;

public final class M1F implements G7U {
    public final /* synthetic */ AnonymousClass4DH A00;
    public final /* synthetic */ C65170LoZ A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public final void onAuthorizeFail() {
    }

    public M1F(AnonymousClass4DH r1, C65170LoZ loZ, boolean z, boolean z2) {
        this.A01 = loZ;
        this.A00 = r1;
        this.A02 = z;
        this.A03 = z2;
    }

    public final void onAuthorizeSuccess(String str, String str2) {
        int i;
        C65170LoZ loZ = this.A01;
        UserSession userSession = loZ.A00;
        if (!182.A06(0Tu.A05, userSession, 36326618641414016L)) {
            AnonymousClass4DH r4 = this.A00;
            boolean z = this.A02;
            boolean z2 = this.A03;
            C299935wF A002 = C363388je.A00(userSession).A00(C367288qV.A00);
            2D6 A003 = 2D5.A00(userSession);
            boolean A022 = C363388je.A02(A002);
            0xY AR4 = A003.A04.AR4();
            long currentTimeMillis = System.currentTimeMillis();
            if (A022) {
                i = 4385;
            } else {
                i = 4384;
            }
            AR4.E5c(AnonymousClass000.A00(i), currentTimeMillis);
            AR4.apply();
            C61829KNs kNs = loZ.A02;
            C61848KOn kOn = kNs.A0i;
            kOn.A03.A01();
            if (((C61084JwM) kOn.A06.getValue()).A00 instanceof KYY) {
                LPW.A01(r4.requireContext(), userSession, C51967G9n.A0l(z2 ? 1 : 0), AnonymousClass05K.A01, AnonymousClass8PU.A00(userSession), AnonymousClass7TF.A0g(userSession), z, kNs.A0l);
            }
        }
    }
}
