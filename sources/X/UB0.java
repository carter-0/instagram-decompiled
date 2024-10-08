package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public final class UB0 extends C249403jg {
    public final View A00;
    public final AnonymousClass714 A01;

    public static final void A00(View view, double d, float f, float f2) {
        boolean z = false;
        C294975nL A012 = C294975nL.A01(view, 0);
        A012.A0G();
        A012.A0M(f, f2);
        A012.A0E(C71392co.A03(0.0d, d)).A0A().A0H();
        if (f2 == 1.0f) {
            z = true;
        }
        view.setEnabled(z);
    }

    public UB0(View view, AnonymousClass714 r3) {
        this.A00 = view;
        this.A01 = r3;
        if (r3.A00.A09) {
            view.setAlpha(0.0f);
            view.setEnabled(false);
        }
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int A03 = AnonymousClass0fD.A03(443740914);
        0qQ.A0B(recyclerView, 0);
        C252553pI r3 = recyclerView.A0D;
        0qQ.A0C(r3, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) r3;
        int A1b = linearLayoutManager.A1b();
        C14031ToX toX = recyclerView.A0A;
        0qQ.A0C(toX, "null cannot be cast to non-null type com.instagram.follow.chaining.FollowChainingAdapter");
        if (N4R.A02(30, toX.A01(A1b))) {
            if (i > 0) {
                View A0X = linearLayoutManager.A0X(linearLayoutManager.A0T() - 1);
                C322526vy r5 = this.A01.A00;
                if (!r5.A09 && A0X != null) {
                    A00(this.A00, 30.0d, 1.0f, 0.0f);
                    A0X.setAlpha(0.0f);
                    A0X.postDelayed(new C20220WnK(A0X, this), 100);
                    r5.A09 = true;
                }
            }
        } else if (i < 0) {
            C322526vy r52 = this.A01.A00;
            if (r52.A09) {
                A00(this.A00, 30.0d, 0.0f, 1.0f);
                r52.A09 = false;
            }
        }
        AnonymousClass0fD.A0A(853335538, A03);
    }
}
