package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.8ux  reason: invalid class name and case insensitive filesystem */
public abstract class C369558ux extends Drawable implements C300645xY {
    public final void A00(String str, int i) {
        String upperCase;
        C389749q8 r0 = (C389749q8) this;
        C380069Wl r2 = r0.A01;
        if (str != null) {
            upperCase = str.toUpperCase(AnonymousClass1Q2.A02());
        } else {
            String string = r0.A00.getString(2131976671);
            0qQ.A07(string);
            upperCase = string.toUpperCase(AnonymousClass1Q2.A02());
        }
        0qQ.A07(upperCase);
        r2.A05(upperCase, i);
    }
}
