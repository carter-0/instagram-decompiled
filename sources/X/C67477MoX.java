package X;

import android.os.Bundle;
import com.instagram.modal.ModalActivity;

/* renamed from: X.MoX  reason: case insensitive filesystem */
public final class C67477MoX implements C322776wO {
    public final int A00;
    public final Object A01;

    public C67477MoX(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DBx() {
    }

    public final void DBy() {
        switch (this.A00) {
            case 0:
                C66739Mbk mbk = (C66739Mbk) this.A01;
                SUL A0J = Dba.A0J(mbk.A02, mbk.A03, 2EG.A1V, "https://www.facebook.com/help/instagram/475931443650619");
                A0J.A0S = "direct_inbox_empty_state";
                A0J.A0A();
                return;
            case 1:
                C66633Ma2 ma2 = (C66633Ma2) this.A01;
                if (C66633Ma2.A0i(ma2)) {
                    C67488Moi moi = ma2.A0b;
                    if (moi != null) {
                        moi.A02(C67304Mle.A05);
                        return;
                    }
                    return;
                } else if (2El.A0C(ma2.A0p()) && 0qQ.A0K(ma2.A0s(), AnonymousClass2EL.A00)) {
                    Bundle A0a = AnonymousClass7TE.A0a();
                    AnonymousClass4DH r2 = ma2.A1J;
                    AnonymousClass6W8 A03 = AnonymousClass6W8.A03(r2.requireActivity(), A0a, ma2.A0p(), ModalActivity.class, C273654mx.A00(665));
                    A03.A0J = ModalActivity.A08;
                    DbU.A1K(r2, A03);
                    return;
                } else if (ma2.A0s() instanceof 2Ej) {
                    ma2.A17((Integer) null, C273654mx.A00(2259), true);
                    return;
                } else {
                    ma2.A11();
                    return;
                }
            default:
                C71153OeR oeR = (C71153OeR) this.A01;
                if (oeR.A0O) {
                    oeR.A0t.DBy();
                    return;
                } else if (oeR.A0i.Brn() == C67225MkL.A00) {
                    C71153OeR.A0I(oeR);
                    return;
                } else {
                    C71153OeR.A0D(C69375NkF.A06, oeR);
                    OTI oti = oeR.A0m;
                    int A05 = oeR.A0j.A05();
                    OTI.A00(oti, "see_all_requests", C69375NkF.A0G.A02.A00, oeR.A02.A02.A00, (String) null, A05);
                    return;
                }
        }
    }

    public final /* synthetic */ void DBz(C320156rr r4) {
        if (1 - this.A00 == 0) {
            0qQ.A0B(r4, 0);
            ((C66633Ma2) this.A01).A0u().A0E(AnonymousClass7TG.A0m(r4, "empty_state_view_model_added:", AnonymousClass7TE.A1A()));
        }
    }
}
