package X;

import android.os.Handler;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import java.util.Map;

/* renamed from: X.FTu  reason: case insensitive filesystem */
public final class C50214FTu implements C51926G7u {
    public final /* synthetic */ C49915FEp A00;

    public C50214FTu(C49915FEp fEp) {
        this.A00 = fEp;
    }

    public final void DeS() {
        C49915FEp fEp = this.A00;
        AnonymousClass4DH r4 = fEp.A02;
        FragmentActivity activity = r4.getActivity();
        2dY r3 = 2dZ.A0t;
        r3.A03(activity).Ett((View.OnClickListener) null, false);
        DbY.A17(r4, r3, false);
        fEp.A00 = false;
    }

    public final void Dei() {
        C49915FEp fEp = this.A00;
        fEp.A00 = true;
        AnonymousClass4DH r3 = fEp.A02;
        FragmentActivity activity = r3.getActivity();
        2dY r2 = 2dZ.A0t;
        r2.A03(activity).Ett((View.OnClickListener) null, true);
        DbY.A17(r3, r2, true);
    }

    public final void Det(16V r14) {
        int i = 2131974861;
        if (r14 == 16V.A06) {
            i = 2131974862;
        }
        C49915FEp fEp = this.A00;
        AnonymousClass4DH r2 = fEp.A02;
        C59689JTv.A0F(r2.getContext(), "switch_to_business_failed", i);
        fEp.A03.Ckg(new C22030Xtl("switch_professional_account_type", "setting", "continue", (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        FA1.A01.A02(fEp.A07);
        if (r2 instanceof ESS) {
            Handler A0D = AnonymousClass7TF.A0D();
            ESS ess = (ESS) r2;
            ess.getClass();
            A0D.post(new C51286Frf(ess));
        }
    }

    public final void DeL(String str, String str2, String str3) {
        C59689JTv.A0G(str);
        this.A00.A03.Ckh(new C22030Xtl("switch_professional_account_type", "setting", "continue", str2, str3, (Map) null, (Map) null, (Map) null));
    }
}
