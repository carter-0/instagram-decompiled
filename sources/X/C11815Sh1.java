package X;

import android.graphics.Path;

/* renamed from: X.Sh1  reason: case insensitive filesystem */
public final class C11815Sh1 implements C13519Tbo {
    public final Path.FillType A00;
    public final QGX A01;
    public final C7487QGa A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public final C13687Tf4 Ezs(S7N s7n, Q6Y q6y, C11796Sgi sgi) {
        return new C11794Sgg(q6y, this, sgi);
    }

    public final String toString() {
        return 002.A0L("ShapeFill{color=, fillEnabled=", '}', this.A05);
    }

    public C11815Sh1(Path.FillType fillType, QGX qgx, C7487QGa qGa, String str, boolean z, boolean z2) {
        this.A03 = str;
        this.A05 = z;
        this.A00 = fillType;
        this.A01 = qgx;
        this.A02 = qGa;
        this.A04 = z2;
    }
}
