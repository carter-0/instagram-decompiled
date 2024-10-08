package X;

/* renamed from: X.6GF  reason: invalid class name */
public final class AnonymousClass6GF extends C267794cD implements C267814cG, C267824cH {
    public float A00;
    public long A01;
    public long A02;
    public C304786Ff A03;
    public C289315dO A04;
    public AnonymousClass5S2 A05;
    public AnonymousClass5S2 A06;
    public AnonymousClass5Q8 A07;

    public final /* synthetic */ void DPk() {
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.0rm, java.lang.Object] */
    public final void AQM(AnonymousClass5Q4 r24) {
        C3018060d r2;
        AnonymousClass5S2 r7 = this.A06;
        AnonymousClass5Q4 r8 = r24;
        if (r7 == AnonymousClass5S0.A00) {
            long j = this.A01;
            if (j != AnonymousClass5RW.A08) {
                r8.AQs((C288195bW) null, C289635dw.A00, 1.0f, 3, j, 0, C298565tf.A00(r8.Bwg(), 0));
            }
            C304786Ff r9 = this.A03;
            if (r9 != null) {
                r8.AQr(r9, (C288195bW) null, C289635dw.A00, this.A00, 3, 0, C298565tf.A00(r8.Bwg(), 0));
            }
        } else {
            ? obj = new Object();
            if (r8.Bwg() == this.A02 && r8.getLayoutDirection() == this.A07 && 0qQ.A0K(this.A05, r7)) {
                C289315dO r1 = this.A04;
                0qQ.A0A(r1);
                obj.A00 = r1;
            } else {
                AnonymousClass6GW.A00(this, new AnonymousClass9MH(0, (Object) obj, (Object) this, (Object) r8));
            }
            Object obj2 = obj.A00;
            this.A04 = (C289315dO) obj2;
            this.A02 = r8.Bwg();
            this.A07 = r8.getLayoutDirection();
            this.A05 = this.A06;
            0qQ.A0A(obj2);
            C289315dO r12 = (C289315dO) obj2;
            long j2 = this.A01;
            if (j2 != AnonymousClass5RW.A08) {
                C289635dw r10 = C289635dw.A00;
                if (r12 instanceof C289305dN) {
                    AnonymousClass5VN r5 = ((C289305dN) r12).A00;
                    float f = r5.A01;
                    float f2 = r5.A03;
                    r8.AQs((C288195bW) null, r10, 1.0f, 3, j2, C289325dP.A00(f, f2), C288015bE.A00(r5.A02 - f, r5.A00 - f2));
                } else {
                    if (r12 instanceof C3018460h) {
                        C3018460h r3 = (C3018460h) r12;
                        r2 = r3.A01;
                        if (r2 == null) {
                            AnonymousClass6GT r52 = r3.A00;
                            long j3 = r52.A04;
                            long j4 = AnonymousClass6GS.A00;
                            float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
                            float f3 = r52.A01;
                            float f4 = r52.A03;
                            r8.AQv((C288195bW) null, r10, 1.0f, 3, j2, C289325dP.A00(f3, f4), C288015bE.A00(r52.A02 - f3, r52.A00 - f4), AnonymousClass6GR.A00(intBitsToFloat, intBitsToFloat));
                        }
                    } else if (r12 instanceof C289335dQ) {
                        r2 = ((C289335dQ) r12).A00;
                    } else {
                        throw new RuntimeException();
                    }
                    r8.AQn((C288195bW) null, r2, r10, 1.0f, 3, j2);
                }
            }
            C304786Ff r32 = this.A03;
            if (r32 != null) {
                HRL.A00(r32, r12, r8, C289635dw.A00, this.A00);
            }
        }
        r8.AQW();
    }

    public final void DUu() {
        this.A02 = 9205357640488583168L;
        this.A07 = null;
        this.A04 = null;
        this.A05 = null;
        C288785cT.A00(this);
    }
}
