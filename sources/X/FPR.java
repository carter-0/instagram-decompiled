package X;

import android.view.View;

public final /* synthetic */ class FPR implements View.OnLongClickListener {
    public final /* synthetic */ C323366xN A00;

    public /* synthetic */ FPR(C323366xN r1) {
        this.A00 = r1;
    }

    public final boolean onLongClick(View view) {
        C323366xN r0 = this.A00;
        try {
            C309516Yo A0M = DbS.A0M(r0.A0C, r0.A0E);
            A0M.A0E(Class.forName(C273654mx.A00(621)).newInstance());
            A0M.A04();
            return true;
        } catch (Exception e) {
            0KC.A05(C323366xN.class, "Can't find QuickExperimentCategoriesFragment", e);
            return true;
        }
    }
}
