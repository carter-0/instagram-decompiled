package X;

public final class KMJ extends L0V {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final C381689cA A05;
    public final Float A06;
    public final Integer A07;
    public final 0sK A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final float A0E;
    public final String A0F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KMJ(C381689cA r2, Float f, Integer num, String str, 0sK r6, float f2, float f3, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        super(AnonymousClass05K.A01);
        0qQ.A0B(str, 1);
        this.A0F = str;
        this.A0C = z;
        this.A09 = z2;
        this.A04 = i;
        this.A03 = i2;
        this.A01 = i3;
        this.A02 = i4;
        this.A0E = f2;
        this.A00 = f3;
        this.A0A = z3;
        this.A05 = r2;
        this.A07 = num;
        this.A0B = z4;
        this.A0D = z5;
        this.A06 = f;
        this.A08 = r6;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KMJ) {
                KMJ kmj = (KMJ) obj;
                if (!(0qQ.A0K(this.A0F, kmj.A0F) && this.A0C == kmj.A0C && this.A09 == kmj.A09 && this.A04 == kmj.A04 && this.A03 == kmj.A03 && this.A01 == kmj.A01 && this.A02 == kmj.A02 && Float.compare(this.A0E, kmj.A0E) == 0 && Float.compare(this.A00, kmj.A00) == 0 && this.A0A == kmj.A0A && 0qQ.A0K(this.A05, kmj.A05) && 0qQ.A0K(this.A07, kmj.A07) && this.A0B == kmj.A0B && this.A0D == kmj.A0D && 0qQ.A0K(this.A06, kmj.A06) && 0qQ.A0K(this.A08, kmj.A08))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A002 = AnonymousClass7TF.A00(AnonymousClass7TF.A00((((((((AnonymousClass7TF.A09(this.A09, AnonymousClass7TF.A09(this.A0C, AnonymousClass7TE.A0O(this.A0F))) + this.A04) * 31) + this.A03) * 31) + this.A01) * 31) + this.A02) * 31, this.A0E), this.A00);
        int A092 = AnonymousClass7TF.A09(this.A0B, (((AnonymousClass7TF.A09(this.A0A, A002) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A07)) * 31);
        return AnonymousClass7TE.A0N(this.A08, (AnonymousClass7TF.A09(this.A0D, A092) + AnonymousClass7TG.A0C(this.A06)) * 31);
    }
}
