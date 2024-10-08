package X;

import android.view.View;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.save.model.SavedCollection;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

public final class FO4 implements View.OnClickListener {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;

    public FO4(Object obj, int i, Object obj2, int i2, int i3) {
        this.A00 = i3;
        this.A04 = obj2;
        this.A03 = obj;
        this.A01 = i;
        this.A02 = i2;
    }

    public final void onClick(View view) {
        int A05;
        int i;
        switch (this.A00) {
            case 0:
                A05 = AnonymousClass0fD.A05(-1378375758);
                int i2 = this.A01;
                int i3 = this.A02;
                Fb0 fb0 = (Fb0) ((G4t) this.A03);
                fb0.A01.A0J((DirectShareTarget) this.A04, 6, i2, i3, fb0.A00);
                i = 82509500;
                break;
            case 1:
                ((C51959G9f) this.A03).DQW((C283155Gi) this.A04, this.A01, this.A02);
                return;
            case 2:
                int i4 = this.A01;
                C249693kD r4 = (C249693kD) this.A04;
                int i5 = this.A02;
                ReelDashboardFragment reelDashboardFragment = ((C17634VbQ) this.A03).A06;
                if (i4 > 0 && reelDashboardFragment != null && (r4 instanceof C255773uh)) {
                    C255773uh r42 = (C255773uh) r4;
                    C309516Yo A0M = DbS.A0M(reelDashboardFragment.requireActivity(), reelDashboardFragment.A06);
                    A0M.A0E(C18280Vp0.A00(r42.A0k, r42.A0j, i5));
                    A0M.A04();
                    return;
                }
                return;
            default:
                A05 = AnonymousClass0fD.A05(-934760745);
                ((C54177H1x) this.A04).A03((SavedCollection) this.A03, this.A02, this.A01);
                i = -1446974886;
                break;
        }
        AnonymousClass0fD.A0C(i, A05);
    }
}
