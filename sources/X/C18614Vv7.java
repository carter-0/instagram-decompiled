package X;

/* renamed from: X.Vv7  reason: case insensitive filesystem */
public final class C18614Vv7 {
    public float A00;
    public int A01;
    public Integer A02;
    public X8Z A03;
    public final int A04;
    public final int A05;
    public final int A06;

    public final void A02(int i) {
        float f;
        float f2;
        if (i >= 0) {
            X8Z x8z = this.A03;
            int AYh = x8z.AYh(i);
            if (AYh >= x8z.BcH() - 1) {
                this.A01 = AYh - 1;
                this.A02 = AnonymousClass05K.A0C;
                this.A00 = 1.0f;
                return;
            }
            this.A01 = AYh;
            int A002 = A00(AYh);
            int Byp = x8z.Byp(this.A01);
            int i2 = Byp + A002;
            int i3 = this.A04;
            int i4 = this.A05;
            float max = Math.max(1.0f, ((float) ((i3 + i4) + this.A06)) / ((float) A002));
            int i5 = (int) (((float) i3) / max);
            int i6 = (int) (((float) i4) / max);
            int i7 = i - Byp;
            if (i7 < i5) {
                this.A02 = AnonymousClass05K.A00;
                f = (float) i7;
                f2 = (float) i5;
            } else {
                int i8 = i2 - i6;
                if (i < i8) {
                    this.A02 = AnonymousClass05K.A01;
                    f = (float) (i - (Byp + i5));
                    f2 = (float) ((i2 - Byp) - (i5 + i6));
                } else {
                    this.A02 = AnonymousClass05K.A0C;
                    f = (float) (i - i8);
                    f2 = (float) i6;
                }
            }
            this.A00 = f / f2;
            return;
        }
        throw new IllegalStateException(002.A0c("PhraseProgressCalculator: invalid frame time ", " in calculate()", i));
    }

    private final int A00(int i) {
        X8Z x8z = this.A03;
        int BcH = x8z.BcH();
        if (i < 0 || i >= BcH) {
            throw new IllegalStateException(002.A0n("PhraseProgressCalculator: invalid phrase index ", " for phrase count ", " in getPhraseDuration()", i, BcH));
        } else if (i == x8z.BcH() - 1) {
            return Integer.MAX_VALUE;
        } else {
            int Byp = x8z.Byp(i);
            int i2 = i + 1;
            int Byp2 = x8z.Byp(i2);
            int max = Math.max(Byp2 - Byp, 1);
            17k.A0I(AnonymousClass7TF.A1P(max), "%s: invalid phrase duration: %s in getPhraseDuration() for phrases: \"%s\" with start time: %s and \"%s\" with start time %s", new Object[]{"PhraseProgressCalculator", Integer.valueOf(max), x8z.BcG(i), Integer.valueOf(Byp), x8z.BcG(i2), Integer.valueOf(Byp2)});
            return max;
        }
    }

    public final float A01(int i) {
        int BcH = this.A03.BcH();
        if (i < 0 || i >= BcH) {
            throw new IllegalStateException(002.A0n("PhraseProgressCalculator: invalid phrase index ", " for phrase count ", " in getPhraseActiveStateProgressVelocity()", i, BcH));
        }
        int A002 = A00(i);
        int i2 = this.A04;
        int i3 = this.A05;
        float f = (float) A002;
        float max = Math.max(1.0f, ((float) ((i2 + i3) + this.A06)) / f);
        return ((float) (A002 - (((int) (((float) i2) / max)) + ((int) (((float) i3) / max))))) / f;
    }

    public C18614Vv7(X8Z x8z, int i, int i2, int i3) {
        this.A03 = x8z;
        this.A06 = i;
        this.A04 = i2;
        this.A05 = i3;
    }
}
