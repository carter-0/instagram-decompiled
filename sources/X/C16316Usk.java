package X;

import android.graphics.Point;

/* renamed from: X.Usk  reason: case insensitive filesystem */
public class C16316Usk extends C19723WeP {
    public float A00 = 1.0f;
    public XCG A01;
    public C19725WeR A02;
    public C18571VuN A03 = C18571VuN.A08;
    public final C21006X9e A04;

    public XCG AML() {
        if (this.A02 != null) {
            C16319Usp usp = new C16319Usp(this);
            usp.A01(this);
            return usp;
        }
        throw new IllegalStateException("backed brush can't make a mark without a backing");
    }

    public final C17872VhP Aqs() {
        return this.A04.Aqs();
    }

    public final void CMf(C17872VhP vhP) {
        this.A04.CMf(vhP);
    }

    public void ESC(int i) {
        this.A03 = i;
        this.A04.ESC(i);
    }

    public final void Ecj(float[] fArr) {
        this.A07 = fArr;
        this.A04.Ecj(fArr);
    }

    public final boolean isValid() {
        return this.A04.isValid();
    }

    public C16316Usk(C21006X9e x9e, String str) {
        super(str);
        this.A04 = x9e;
    }

    public final void EPW(Point point) {
        super.EPW(point);
        C17872VhP Aqs = this.A04.Aqs();
        if (this.A02 == null) {
            int i = point.x;
            int i2 = point.y;
            if (i * i2 > 0 && Aqs != null) {
                C19725WeR weR = new C19725WeR(Aqs, i, i2);
                this.A02 = weR;
                weR.A01 = this.A03;
                weR.A00 = this.A00;
                weR.A02();
            }
        }
    }
}
