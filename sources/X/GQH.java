package X;

public final class GQH implements C3025964g {
    public final long A00;
    public final C287725af A01;
    public final C287725af A02;
    public final C287725af A03;
    public final C287805an A04;
    public final JNM A05;
    public final Object A06;
    public final Object A07;

    public GQH(C287725af r13, AnonymousClass6HR r14, C287805an r15, Object obj) {
        GQI gqi = new GQI(((AnonymousClass6HQ) r14).A00);
        this.A05 = gqi;
        this.A04 = r15;
        Object obj2 = obj;
        this.A06 = obj2;
        C287725af r9 = (C287725af) ((C287795am) r15).A01.invoke(obj2);
        this.A02 = r9;
        this.A03 = AnonymousClass6GZ.A00(r13);
        this.A07 = ((C287795am) this.A04).A00.invoke(gqi.A01(r9, r13));
        C287725af r0 = gqi.A01;
        if (r0 == null) {
            r0 = AnonymousClass6GZ.A01(r9);
            gqi.A01 = r0;
        }
        if (r0 == null) {
            0qQ.A0F("velocityVector");
            throw AnonymousClass00P.createAndThrow();
        }
        int A012 = r0.A01();
        long j = 0;
        for (int i = 0; i < A012; i++) {
            AnonymousClass6HN r02 = gqi.A03;
            j = Math.max(j, ((long) (Math.exp(AnonymousClass6HO.A00(((AnonymousClass6HM) r02).A00, r13.A00(i)) / (((double) AnonymousClass6HP.A00) - 1.0d)) * 1000.0d)) * 1000000);
        }
        this.A00 = j;
        C287725af A002 = AnonymousClass6GZ.A00(gqi.CDe(r9, r13, j));
        this.A01 = A002;
        int A013 = A002.A01();
        for (int i2 = 0; i2 < A013; i2++) {
            C287725af r3 = this.A01;
            r3.A03(i2, C229632nm.A02(r3.A00(i2), -0.0f, 0.0f));
        }
    }

    public final long AzP() {
        return this.A00;
    }

    public final Object C4T() {
        return this.A07;
    }

    public final C287805an CAq() {
        return this.A04;
    }

    public final Object CDQ(long j) {
        float f;
        if (CTe(j)) {
            return this.A07;
        }
        0sP r24 = ((C287795am) this.A04).A00;
        JNM jnm = this.A05;
        C287725af r23 = this.A02;
        C287725af r15 = this.A03;
        GQI gqi = (GQI) jnm;
        C287725af r0 = gqi.A00;
        if (r0 == null) {
            r0 = AnonymousClass6GZ.A01(r23);
            gqi.A00 = r0;
        }
        int i = 0;
        if (r0 != null) {
            int A012 = r0.A01();
            while (true) {
                if (i < A012) {
                    C287725af r9 = gqi.A00;
                    if (r9 == null) {
                        break;
                    }
                    AnonymousClass6HN r2 = gqi.A03;
                    float A002 = r23.A00(i);
                    float A003 = r15.A00(i);
                    long j2 = j / 1000000;
                    AnonymousClass6HO r02 = ((AnonymousClass6HM) r2).A00;
                    double A004 = AnonymousClass6HO.A00(r02, A003);
                    double d = (double) AnonymousClass6HP.A00;
                    double d2 = d - 1.0d;
                    float exp = (float) (((double) (r02.A00 * r02.A01)) * Math.exp((d / d2) * A004));
                    long exp2 = (long) (Math.exp(A004 / d2) * 1000.0d);
                    if (exp2 > 0) {
                        f = ((float) j2) / ((float) exp2);
                    } else {
                        f = 1.0f;
                    }
                    float signum = exp * Math.signum(A003);
                    float f2 = 1.0f;
                    float A022 = C229632nm.A02(f, 0.0f, 1.0f);
                    int i2 = (int) (100.0f * A022);
                    if (i2 < 100) {
                        float f3 = ((float) i2) / 100.0f;
                        int i3 = i2 + 1;
                        float[] fArr = GQX.A00;
                        float f4 = fArr[i2];
                        f2 = ((A022 - f3) * ((fArr[i3] - f4) / ((((float) i3) / 100.0f) - f3))) + f4;
                    }
                    r9.A03(i, A002 + (signum * f2));
                    i++;
                } else {
                    C287725af r1 = gqi.A00;
                    if (r1 != null) {
                        return r24.invoke(r1);
                    }
                }
            }
        }
        0qQ.A0F("valueVector");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* synthetic */ boolean CTe(long j) {
        if (j >= this.A00) {
            return true;
        }
        return false;
    }

    public final boolean CVL() {
        return false;
    }

    public final C287725af CDf(long j) {
        if (!CTe(j)) {
            return this.A05.CDe(this.A02, this.A03, j);
        }
        return this.A01;
    }
}
