package X;

import android.view.View;

/* renamed from: X.3B7  reason: invalid class name */
public final class AnonymousClass3B7 {
    public AnonymousClass3B8 A00 = new AnonymousClass3B8();
    public final AnonymousClass3B5 A01;

    public final View A00(int i, int i2, int i3, int i4) {
        AnonymousClass3B5 r7 = this.A01;
        int Baf = r7.Baf();
        int BaZ = r7.BaZ();
        int i5 = -1;
        if (i2 > i) {
            i5 = 1;
        }
        View view = null;
        while (i != i2) {
            View AnC = r7.AnC(i);
            int AnK = r7.AnK(AnC);
            int AnI = r7.AnI(AnC);
            AnonymousClass3B8 r2 = this.A00;
            r2.A04 = Baf;
            r2.A03 = BaZ;
            r2.A02 = AnK;
            r2.A01 = AnI;
            r2.A00 = 0;
            r2.A00 = i3;
            if (r2.A00()) {
                return AnC;
            }
            if (i4 != 0) {
                r2.A00 = 0;
                r2.A00 = i4;
                if (r2.A00()) {
                    view = AnC;
                }
            }
            i += i5;
        }
        return view;
    }

    public final boolean A01(View view) {
        AnonymousClass3B8 r4 = this.A00;
        AnonymousClass3B5 r0 = this.A01;
        int Baf = r0.Baf();
        int BaZ = r0.BaZ();
        int AnK = r0.AnK(view);
        int AnI = r0.AnI(view);
        r4.A04 = Baf;
        r4.A03 = BaZ;
        r4.A02 = AnK;
        r4.A01 = AnI;
        r4.A00 = 0;
        r4.A00 = 24579;
        return r4.A00();
    }

    public AnonymousClass3B7(AnonymousClass3B5 r2) {
        this.A01 = r2;
    }
}
