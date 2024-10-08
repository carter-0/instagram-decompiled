package X;

import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.WOl  reason: case insensitive filesystem */
public final class C19179WOl implements X6S {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C19179WOl(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final void Dv1() {
        switch (this.A00) {
            case 0:
                ((C17321VRa) this.A01).A01.DfU(C15417UcT.A00);
                return;
            case 1:
                C16678UzE uzE = C16678UzE.ERROR;
                C15275UZd uZd = (C15275UZd) this.A02;
                C18707VyY.A00(uzE, C15275UZd.A03(uZd), "promote_no_permissions");
                C59689JTv.A04(uZd.getActivity());
                return;
            default:
                ((X6S) this.A02).Dv1();
                return;
        }
    }

    public final void E4Q(String str) {
        C17321VRa vRa;
        C17322VRb vRb;
        switch (this.A00) {
            case 0:
                UserSession userSession = ((VZG) this.A02).A02;
                0Tu r2 = 0Tu.A05;
                if (182.A06(r2, userSession, 36318024411649798L) || 182.A06(r2, userSession, 36318024411780871L)) {
                    vRa = (C17321VRa) this.A01;
                    vRb = new C17322VRb(AnonymousClass05K.A00, "");
                } else {
                    vRa = (C17321VRa) this.A01;
                    vRb = new C17322VRb(AnonymousClass05K.A00, str);
                }
                String str2 = vRb.A01;
                if (str2 != null) {
                    VZG vzg = vRa.A00;
                    VVM vvm = vzg.A01;
                    VAC.A00(vvm, vvm.A00, "promote_client_token_stored");
                    ((VMZ) vzg.A03.getValue()).A00 = str2;
                }
                vRa.A01.DfU(vRb);
                return;
            case 1:
                C15275UZd uZd = (C15275UZd) this.A02;
                WGU.A00(C15275UZd.A03(uZd)).A0S("promote_no_permissions", C16678UzE.ERROR.toString());
                VAB.A00((BaseFragmentActivity) this.A01, C15275UZd.A03(uZd), "promote_no_permissions");
                return;
            default:
                ((VMZ) this.A01).A00 = str;
                ((X6S) this.A02).E4Q(str);
                return;
        }
    }
}
