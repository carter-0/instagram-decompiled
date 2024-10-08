package X;

import java.util.Arrays;

/* renamed from: X.Glp  reason: case insensitive filesystem */
public final class C53303Glp extends AnonymousClass0T0 {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04 = 100.0f;
    public final int A05;
    public final int A06;
    public final C53276GlO[][] A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53303Glp) {
                C53303Glp glp = (C53303Glp) obj;
                if (!(0qQ.A0K(this.A07, glp.A07) && Float.compare(this.A03, glp.A03) == 0 && Float.compare(this.A04, glp.A04) == 0 && Float.compare(this.A01, glp.A01) == 0 && Float.compare(this.A00, glp.A00) == 0 && this.A06 == glp.A06 && this.A05 == glp.A05 && Float.compare(this.A02, glp.A02) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C53303Glp(C53276GlO[][] glOArr, float f, float f2, float f3, float f4, int i, int i2) {
        this.A07 = glOArr;
        this.A03 = f;
        this.A01 = f2;
        this.A00 = f3;
        this.A06 = i;
        this.A05 = i2;
        this.A02 = f4;
    }

    public final int hashCode() {
        return C51966G9m.A02((((AnonymousClass7TF.A00(AnonymousClass7TF.A00(AnonymousClass7TF.A00(AnonymousClass7TF.A00(Arrays.hashCode(this.A07) * 31, this.A03), this.A04), this.A01), this.A00) + this.A06) * 31) + this.A05) * 31, this.A02);
    }
}
