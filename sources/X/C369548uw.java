package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.8uw  reason: invalid class name and case insensitive filesystem */
public abstract class C369548uw extends Drawable implements C300645xY {
    public final void A00(int i) {
        String str;
        C389719q5 r0 = (C389719q5) this;
        C380069Wl r2 = r0.A00;
        String title = r0.A01.getTitle();
        if (title != null) {
            str = title.toUpperCase(AnonymousClass1Q2.A02());
            0qQ.A07(str);
        } else {
            str = "";
        }
        r2.A05(str, i);
    }
}
