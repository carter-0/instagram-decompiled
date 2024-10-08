package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.FkP  reason: case insensitive filesystem */
public final class C50893FkP implements C51914G7i {
    public final /* synthetic */ C2365134a A00;
    public final /* synthetic */ 0rk A01;

    public final void DaE(float f) {
    }

    public C50893FkP(C2365134a r1, 0rk r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void DJ6(boolean z, String str) {
        this.A00.A09(false, false);
    }

    public final void DYb(int i, String str, boolean z) {
        View A0X;
        this.A01.A00 = i;
        C2365334c r2 = this.A00.A0P;
        RecyclerView recyclerView = r2.A03;
        if (recyclerView != null) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.A0D;
            if (linearLayoutManager != null) {
                int A1c = linearLayoutManager.A1c();
                int A1d = linearLayoutManager.A1d();
                if (i >= A1c && i <= A1d) {
                    if (!182.A06(0Tu.A05, r2.A0B, 36328663045651973L)) {
                        return;
                    }
                }
                int i2 = 0;
                if (z && (A0X = linearLayoutManager.A0X(0)) != null) {
                    i2 = A0X.getWidth() / 4;
                }
                linearLayoutManager.A1p(i, i2);
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }
}
