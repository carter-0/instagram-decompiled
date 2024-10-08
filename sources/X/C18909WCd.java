package X;

import android.widget.AbsListView;
import android.widget.Adapter;

/* renamed from: X.WCd  reason: case insensitive filesystem */
public final class C18909WCd implements AbsListView.OnScrollListener {
    public final AnonymousClass32G A00;
    public final AnonymousClass343 A01;

    public C18909WCd(Adapter adapter, AnonymousClass32G r4, C14029ToV toV, C320226s1 r6) {
        C51974G9v.A1M(adapter, r6, toV);
        this.A00 = r4;
        this.A01 = new AnonymousClass343(adapter, (AnonymousClass4DV) r4, new C15968Ulk(toV, r6));
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int i4;
        int A03 = AnonymousClass0fD.A03(-98425266);
        if (!this.A00.isResumed()) {
            i4 = 1448969323;
        } else {
            this.A01.A01();
            i4 = 420727211;
        }
        AnonymousClass0fD.A0A(i4, A03);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        AnonymousClass0fD.A0A(1417899034, AnonymousClass0fD.A03(-97645421));
    }
}
