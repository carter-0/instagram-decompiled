package X;

/* renamed from: X.Jui  reason: case insensitive filesystem */
public final class C60986Jui extends AnonymousClass0T0 {
    public final double A00;
    public final float A01;
    public final int A02;
    public final Integer A03;
    public final Integer A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60986Jui) {
                C60986Jui jui = (C60986Jui) obj;
                if (!(Double.compare(this.A00, jui.A00) == 0 && this.A0M == jui.A0M && this.A0L == jui.A0L && this.A0C == jui.A0C && this.A0B == jui.A0B && this.A0E == jui.A0E && this.A0D == jui.A0D && this.A08 == jui.A08 && this.A07 == jui.A07 && this.A0K == jui.A0K && this.A0J == jui.A0J && this.A0I == jui.A0I && this.A0H == jui.A0H && this.A06 == jui.A06 && this.A0N == jui.A0N && 0qQ.A0K(this.A03, jui.A03) && this.A02 == jui.A02 && this.A09 == jui.A09 && this.A0A == jui.A0A && this.A0F == jui.A0F && this.A0G == jui.A0G && 0qQ.A0K(this.A05, jui.A05) && 0qQ.A0K(this.A04, jui.A04) && Float.compare(this.A01, jui.A01) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A092 = AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A09(this.A0H, AnonymousClass7TF.A09(this.A0I, AnonymousClass7TF.A09(this.A0J, AnonymousClass7TF.A09(this.A0K, AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A09(this.A08, AnonymousClass7TF.A09(this.A0D, AnonymousClass7TF.A09(this.A0E, AnonymousClass7TF.A09(this.A0B, AnonymousClass7TF.A09(this.A0C, AnonymousClass7TF.A09(this.A0L, AnonymousClass7TF.A09(this.A0M, C51968G9o.A03(Double.doubleToLongBits(this.A00)) * 31)))))))))))));
        return ((((AnonymousClass7TF.A09(this.A0G, AnonymousClass7TF.A09(this.A0F, AnonymousClass7TF.A09(this.A0A, AnonymousClass7TF.A09(this.A09, (((AnonymousClass7TF.A09(this.A0N, A092) + AnonymousClass7TG.A0C(this.A03)) * 31) + this.A02) * 31)))) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TE.A0L(this.A04)) * 31) + Float.floatToIntBits(this.A01);
    }

    public C60986Jui(Integer num, Integer num2, String str, double d, float f, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18) {
        this.A00 = d;
        this.A0M = z;
        this.A0L = z2;
        this.A0C = z3;
        this.A0B = z4;
        this.A0E = z5;
        this.A0D = z6;
        this.A08 = z7;
        this.A07 = z8;
        this.A0K = z9;
        this.A0J = z10;
        this.A0I = z11;
        this.A0H = z12;
        this.A06 = z13;
        this.A0N = z14;
        this.A03 = num;
        this.A02 = i;
        this.A09 = z15;
        this.A0A = z16;
        this.A0F = z17;
        this.A0G = z18;
        this.A05 = str;
        this.A04 = num2;
        this.A01 = f;
    }
}
