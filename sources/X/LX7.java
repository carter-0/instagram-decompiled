package X;

import android.view.View;

public final class LX7 implements View.OnClickListener {
    public final /* synthetic */ C65323LrM A00;
    public final /* synthetic */ View[] A01;

    public LX7(C65323LrM lrM, View[] viewArr) {
        this.A00 = lrM;
        this.A01 = viewArr;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1496083806);
        C65323LrM lrM = this.A00;
        boolean z = !lrM.A08;
        lrM.A08 = z;
        View view2 = lrM.A01;
        float f = 0.0f;
        if (z) {
            f = 180.0f;
        }
        view2.setRotation(f);
        for (View view3 : this.A01) {
            if (view3 != null) {
                view3.setVisibility(DbW.A01(lrM.A08 ? 1 : 0));
            }
        }
        AnonymousClass0fD.A0C(-479093038, A05);
    }
}
