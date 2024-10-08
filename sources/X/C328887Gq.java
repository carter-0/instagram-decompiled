package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.7Gq  reason: invalid class name and case insensitive filesystem */
public final class C328887Gq implements C328897Gr {
    public AnonymousClass7L0 A00;
    public C70822OMu A01;
    public C3260475e A02;
    public Integer A03;
    public final View A04;
    public final View A05;
    public final RecyclerView A06;
    public final AnonymousClass0iw A07;

    public C328887Gq(View view, View view2, RecyclerView recyclerView, AnonymousClass0iw r5) {
        0qQ.A0B(view, 1);
        0qQ.A0B(view2, 2);
        0qQ.A0B(recyclerView, 3);
        0qQ.A0B(r5, 4);
        this.A05 = view;
        this.A04 = view2;
        this.A06 = recyclerView;
        this.A07 = r5;
    }

    public final boolean A01() {
        C70822OMu oMu = this.A01;
        if (oMu == null || oMu.A03.getVisibility() != 0) {
            return false;
        }
        oMu.A03.setVisibility(8);
        oMu.A01(0sn.A00);
        return true;
    }

    public final void A00(int i) {
        this.A03 = Integer.valueOf(i);
        C70822OMu oMu = this.A01;
        if (oMu != null) {
            oMu.A00(i);
        }
    }

    public final boolean onBackPressed() {
        return A01();
    }
}
