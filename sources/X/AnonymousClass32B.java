package X;

import android.widget.AbsListView;

/* renamed from: X.32B  reason: invalid class name */
public final class AnonymousClass32B implements AbsListView.OnScrollListener {
    public final /* synthetic */ AnonymousClass32A A00;

    public AnonymousClass32B(AnonymousClass32A r1) {
        this.A00 = r1;
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        AnonymousClass6VJ r1;
        int A03 = AnonymousClass0fD.A03(-2078461615);
        AnonymousClass32A r12 = this.A00;
        if (!r12.A0E && (r1 = r12.A07) != null) {
            r1.A05(AnonymousClass05K.A00);
        }
        AnonymousClass0fD.A0A(1344469803, A03);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A03 = AnonymousClass0fD.A03(1423176695);
        AnonymousClass32A r1 = this.A00;
        boolean z = false;
        if (i == 0) {
            z = true;
        }
        r1.A0E = z;
        AnonymousClass0fD.A0A(-876814013, A03);
    }
}
