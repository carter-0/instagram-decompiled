package X;

/* renamed from: X.5ZR  reason: invalid class name */
public abstract class AnonymousClass5ZR implements AnonymousClass5S2 {
    public final AnonymousClass5ZP A00;
    public final AnonymousClass5ZP A01;
    public final AnonymousClass5ZP A02;
    public final AnonymousClass5ZP A03;

    public final C289315dO AMX(C268024cd r18, AnonymousClass5Q8 r19, long j) {
        C268024cd r1 = r18;
        long j2 = j;
        float F07 = this.A03.F07(r1, j2);
        float F072 = this.A02.F07(r1, j2);
        float F073 = this.A00.F07(r1, j2);
        float F074 = this.A01.F07(r1, j2);
        float A012 = C288025bF.A01(j2);
        float f = F07 + F074;
        if (f > A012) {
            float f2 = A012 / f;
            F07 *= f2;
            F074 *= f2;
        }
        float f3 = F072 + F073;
        if (f3 > A012) {
            float f4 = A012 / f3;
            F072 *= f4;
            F073 *= f4;
        }
        if (F07 < 0.0f || F072 < 0.0f || F073 < 0.0f || F074 < 0.0f) {
            StringBuilder sb = new StringBuilder();
            sb.append("Corner size in Px can't be negative(topStart = ");
            sb.append(F07);
            sb.append(", topEnd = ");
            sb.append(F072);
            sb.append(", bottomEnd = ");
            sb.append(F073);
            sb.append(", bottomStart = ");
            sb.append(F074);
            sb.append(")!");
            throw new IllegalArgumentException(sb.toString());
        } else if (F07 + F072 + F073 + F074 == 0.0f) {
            return new C289305dN(C289285dL.A01(0, j2));
        } else {
            AnonymousClass5VN A013 = C289285dL.A01(0, j2);
            AnonymousClass5Q8 r12 = AnonymousClass5Q8.Ltr;
            float f5 = F072;
            AnonymousClass5Q8 r5 = r19;
            if (r5 == r12) {
                f5 = F07;
            }
            long A002 = AnonymousClass6GR.A00(f5, f5);
            if (r5 == r12) {
                F07 = F072;
            }
            long A003 = AnonymousClass6GR.A00(F07, F07);
            float f6 = F074;
            if (r5 == r12) {
                f6 = F073;
            }
            long A004 = AnonymousClass6GR.A00(f6, f6);
            if (r5 == r12) {
                F073 = F074;
            }
            return new C3018460h(new AnonymousClass6GT(A013.A01, A013.A03, A013.A02, A013.A00, A002, A003, A004, AnonymousClass6GR.A00(F073, F073)));
        }
    }

    public AnonymousClass5ZR(AnonymousClass5ZP r1, AnonymousClass5ZP r2, AnonymousClass5ZP r3, AnonymousClass5ZP r4) {
        this.A03 = r1;
        this.A02 = r2;
        this.A00 = r3;
        this.A01 = r4;
    }
}
