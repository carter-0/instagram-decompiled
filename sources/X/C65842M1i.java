package X;

import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.M1i  reason: case insensitive filesystem */
public final class C65842M1i implements Runnable {
    public final /* synthetic */ K5E A00;

    public C65842M1i(K5E k5e) {
        this.A00 = k5e;
    }

    public final void run() {
        K5E k5e = this.A00;
        SearchEditText searchEditText = k5e.A09;
        if (searchEditText != null) {
            0nA.A0v(searchEditText, false);
            AnonymousClass86D r0 = k5e.A06;
            if (r0 != null) {
                r0.A0P.Epw(AnonymousClass86S.OPEN);
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
