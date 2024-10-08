package X;

import android.widget.AbsListView;

/* renamed from: X.6yq  reason: invalid class name and case insensitive filesystem */
public final class C324226yq implements AbsListView.OnScrollListener {
    public final C241493Pk A00;

    public C324226yq(String str) {
        this.A00 = new C241493Pk(str, false);
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        AnonymousClass0fD.A0A(-1863110389, AnonymousClass0fD.A03(838963272));
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A03 = AnonymousClass0fD.A03(697271306);
        int i2 = 0;
        0qQ.A0B(absListView, 0);
        C241493Pk r1 = this.A00;
        if (i != 0) {
            i2 = 1;
            if (i != 1) {
                i2 = -1;
            }
        }
        r1.A00(absListView, i2);
        AnonymousClass0fD.A0A(-1385003491, A03);
    }
}
