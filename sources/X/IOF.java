package X;

import com.instagram.common.session.UserSession;

public final class IOF implements C61110lV {
    public final /* synthetic */ C227232is A00;

    public IOF(C227232is r1) {
        this.A00 = r1;
    }

    public final void onAppBackgrounded() {
        Long l;
        int A03 = AnonymousClass0fD.A03(-1159546937);
        C227232is r3 = this.A00;
        C267324bN A002 = GD9.A00(r3);
        if (A002 != null) {
            if (!A002.CcK() || !A002.A06().A0t) {
                l = null;
            } else {
                l = DbV.A0q(C51966G9m.A1B(A002));
            }
            GBE gbe = r3.A09;
            if (gbe != null) {
                C51979GAc gAc = gbe.A19;
                UserSession A01 = C227232is.A01(r3);
                1Xj r6 = A002.A02;
                GBE gbe2 = r3.A09;
                if (gbe2 != null) {
                    AnonymousClass93T r8 = gbe2.A1D;
                    String str = gbe2.A1E.A00;
                    int A012 = C52012GBj.A01(r3.A0O().A00);
                    GBE gbe3 = r3.A09;
                    if (gbe3 != null) {
                        C52086GEg.A0i(A01, r6, gAc, r8, l, "app_background", str, (String) null, A012, gbe3.A0u.BlO(A002));
                    }
                }
            }
            0qQ.A0F("clipsViewerFragmentViewModel");
            throw AnonymousClass00P.createAndThrow();
        }
        14i.A06(this);
        AnonymousClass0fD.A0A(234187215, A03);
    }

    public final void onAppForegrounded() {
        AnonymousClass0fD.A0A(-108398545, AnonymousClass0fD.A03(1476105372));
    }
}
