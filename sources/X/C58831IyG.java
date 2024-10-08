package X;

/* renamed from: X.IyG  reason: case insensitive filesystem */
public final class C58831IyG extends 0Yg implements 0sP {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ AnonymousClass6H1 A05;
    public final /* synthetic */ C305196Gx A06;
    public final /* synthetic */ 0r1 A07;
    public final /* synthetic */ 0rh A08;
    public final /* synthetic */ 0rk A09;
    public final /* synthetic */ 0rm A0A;
    public final /* synthetic */ boolean A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58831IyG(AnonymousClass6H1 r2, C305196Gx r3, 0r1 r4, 0rh r5, 0rk r6, 0rm r7, float f, float f2, int i, int i2, int i3, boolean z) {
        super(1);
        this.A06 = r3;
        this.A02 = i;
        this.A01 = f;
        this.A08 = r5;
        this.A05 = r2;
        this.A07 = r4;
        this.A0B = z;
        this.A00 = f2;
        this.A09 = r6;
        this.A03 = i2;
        this.A04 = i3;
        this.A0A = r7;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        int i2;
        int i3;
        C3026764v r12 = (C3026764v) obj;
        C305196Gx r4 = this.A06;
        int i4 = this.A02;
        int B6I = r4.B6I();
        boolean z = false;
        if (i4 <= r4.BLP() && B6I <= i4) {
            z = true;
        }
        if (!z) {
            float f = this.A01;
            int i5 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            C284945Oz r7 = r12.A06;
            float A022 = C51972G9s.A02(r7);
            if (i5 <= 0 ? A022 < f : A022 > f) {
                A022 = f;
            }
            0rh r8 = this.A08;
            float f2 = A022 - r8.A00;
            AnonymousClass6H1 r5 = this.A05;
            float EKW = r5.EKW(f2);
            int B6I2 = r4.B6I();
            if (i4 > r4.BLP() || B6I2 > i4) {
                boolean z2 = this.A0B;
                int i6 = this.A04;
                int B6I3 = r4.B6I();
                if (!z2 ? !(B6I3 < i4 || (r4.B6I() == i4 && r4.B6J() < i6)) : !(B6I3 > i4 || (r4.B6I() == i4 && r4.B6J() > i6))) {
                    if (f2 == EKW) {
                        r8.A00 += f2;
                        float A023 = C51972G9s.A02(r7);
                        float f3 = this.A00;
                        if (!z2 ? A023 < (-f3) : A023 > f3) {
                            r12.A00();
                        }
                        int i7 = this.A09.A00;
                        if (z2) {
                            if (i7 >= 2 && i4 - r4.BLP() > (i3 = this.A03)) {
                                i2 = i4 - i3;
                            }
                        } else if (i7 >= 2 && r4.B6I() - i4 > (i = this.A03)) {
                            i2 = i + i4;
                        }
                        r4.Evv(r5, i2, 0);
                    } else {
                        r12.A00();
                        this.A07.A00 = false;
                        return C60340gF.A00;
                    }
                }
            }
        }
        boolean z3 = this.A0B;
        int i8 = this.A04;
        int B6I4 = r4.B6I();
        if (!z3 ? B6I4 < i4 || (r4.B6I() == i4 && r4.B6J() < i8) : B6I4 > i4 || (r4.B6I() == i4 && r4.B6J() > i8)) {
            r4.Evv(this.A05, i4, i8);
            this.A07.A00 = false;
            r12.A00();
            return C60340gF.A00;
        }
        int B6I5 = r4.B6I();
        if (i4 <= r4.BLP() && B6I5 <= i4) {
            throw new C58054Ikm((C287955b5) this.A0A.A00, AnonymousClass1GB.A01(r4.AEw(i4)));
        }
        return C60340gF.A00;
    }
}
