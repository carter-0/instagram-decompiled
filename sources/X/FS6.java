package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;

public final class FS6 implements 2Kw {
    public final int A00;
    public final Object A01;

    public FS6(int i, 0sP r2) {
        this.A00 = i;
        if (i != 0) {
            this.A01 = r2;
        } else {
            this.A01 = r2;
        }
    }

    public static void A00(AnonymousClass2Kv r1, 1Ef r2, 1vn r3, Object obj, int i) {
        r3.ATL(new FS6(obj, i), r1, r2);
    }

    public final void invoke(Throwable th) {
        switch (this.A00) {
            case 0:
                ((0sP) this.A01).invoke(AnonymousClass7TE.A0u());
                return;
            case 1:
                ((0sP) this.A01).invoke(th);
                return;
            case 2:
                NIQ niq = (NIQ) this.A01;
                View view = niq.mView;
                if (view != null) {
                    view.post(new C51193Fq3(niq));
                    return;
                }
                return;
            case 6:
            case 7:
                ((2IR) this.A01).onFailure(th);
                return;
            case 8:
                AnonymousClass0t1.A01.A01((UserSession) this.A01).A03.EnY(false);
                return;
            case 9:
                C47502E5h e5h = ((C49370EuY) this.A01).A00;
                EEK eek = e5h.A01;
                if (eek != null) {
                    eek.A00();
                }
                C47502E5h.A00(e5h, 2131974093);
                return;
            case 10:
                ((G7G) this.A01).DED();
                return;
            case 11:
                FTQ ftq = (FTQ) this.A01;
                0qQ.A0A(th);
                C267604bt A002 = FTQ.A00(ftq);
                if (A002 != null) {
                    A002.EaM(false);
                }
                0qQ.A0B(th, 1);
                C267604bt A003 = FTQ.A00(ftq);
                if (A003 != null) {
                    A003.DFR(false, true, th.getMessage());
                    return;
                }
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                0KC.A0F("SupervisedUserSettingRequestsApi", "fetchAndHandlePendingSettingChangeRequestIfApplicable: cancel pending requests failed", th);
                C59689JTv.A0F((Context) this.A01, "supervision_bloks_action_failed", 2131961756);
                return;
            case 13:
                ((02m) AnonymousClass7TE.A14(((C46481Dfk) this.A01).A01)).markerEnd(834877734, 3);
                return;
            case 14:
                ESG esg = (ESG) this.A01;
                esg.A07 = true;
                esg.A08 = false;
                esg.setItems(AnonymousClass7TE.A1I(new Object()));
                ESG.A07(esg);
                return;
            default:
                DbS.A1U(this.A01);
                return;
        }
    }

    public FS6(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
