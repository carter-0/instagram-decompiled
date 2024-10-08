package X;

import android.content.Context;
import android.widget.EdgeEffect;

/* renamed from: X.6Ht  reason: invalid class name */
public final class AnonymousClass6Ht {
    public long A00 = 0;
    public EdgeEffect A01;
    public EdgeEffect A02;
    public EdgeEffect A03;
    public EdgeEffect A04;
    public EdgeEffect A05;
    public EdgeEffect A06;
    public EdgeEffect A07;
    public EdgeEffect A08;
    public final int A09;
    public final Context A0A;

    public static final boolean A01(EdgeEffect edgeEffect) {
        boolean z = false;
        if (edgeEffect == null) {
            return false;
        }
        if (XE2.A00(edgeEffect) == 0.0f) {
            z = true;
        }
        return !z;
    }

    public static final EdgeEffect A00(AnonymousClass6Ht r7) {
        EdgeEffect A022 = XE2.A02(r7.A0A);
        A022.setColor(r7.A09);
        long j = r7.A00;
        if (j != 0) {
            A022.setSize((int) (j >> 32), C289005cr.A00(j));
        }
        return A022;
    }

    public AnonymousClass6Ht(Context context, int i) {
        this.A0A = context;
        this.A09 = i;
    }
}
