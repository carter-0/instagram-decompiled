package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.32n  reason: invalid class name and case insensitive filesystem */
public final class C2361232n implements AnonymousClass322 {
    public final Fragment A00;
    public final C2361132m A01;

    public C2361232n(Fragment fragment, C2361132m r3) {
        0qQ.A0B(r3, 2);
        this.A00 = fragment;
        this.A01 = r3;
    }

    public final void D2g(C274594oe r4, AnonymousClass5O4 r5) {
        C57214ITb iTb = new C57214ITb(r4, r5);
        r5.EZ9(C266954ac.CLICKED_HIDE);
        AnonymousClass4DV r1 = this.A00;
        0qQ.A0C(r1, "null cannot be cast to non-null type com.instagram.migration.scrollingviewproxy.ScrollingViewProxyProvider");
        C238133Ar scrollingViewProxy = r1.getScrollingViewProxy();
        if (scrollingViewProxy != null) {
            iTb.A00(this.A01, scrollingViewProxy);
        }
    }
}
