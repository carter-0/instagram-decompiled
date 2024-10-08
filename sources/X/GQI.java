package X;

public final class GQI implements JNM {
    public C287725af A00;
    public C287725af A01;
    public C287725af A02;
    public final AnonymousClass6HN A03;

    public static long A00(Object obj, Object obj2, Object obj3, Object obj4) {
        GQI gqi = new GQI(((AnonymousClass6HQ) obj).A00);
        C287795am r3 = (C287795am) obj2;
        0sP r0 = r3.A01;
        return ((C289295dM) r3.A00.invoke(gqi.A01((C287725af) r0.invoke(obj3), (C287725af) r0.invoke(obj4)))).A00;
    }

    public final C287725af A01(C287725af r18, C287725af r19) {
        C287725af r9 = this.A02;
        C287725af r10 = r18;
        if (r9 == null) {
            r9 = AnonymousClass6GZ.A01(r10);
            this.A02 = r9;
        }
        if (r9 == null) {
            0qQ.A0F("targetVector");
            throw AnonymousClass00P.createAndThrow();
        }
        int A012 = r9.A01();
        for (int i = 0; i < A012; i++) {
            AnonymousClass6HN r0 = this.A03;
            float A002 = r10.A00(i);
            float A003 = r19.A00(i);
            AnonymousClass6HO r2 = ((AnonymousClass6HM) r0).A00;
            double A004 = AnonymousClass6HO.A00(r2, A003);
            double d = (double) AnonymousClass6HP.A00;
            r9.A03(i, A002 + (((float) (((double) (r2.A00 * r2.A01)) * Math.exp((d / (d - 1.0d)) * A004))) * Math.signum(A003)));
        }
        return r9;
    }

    public final C287725af CDe(C287725af r20, C287725af r21, long j) {
        float f;
        C287725af r0 = this.A01;
        if (r0 == null) {
            r0 = AnonymousClass6GZ.A01(r20);
            this.A01 = r0;
        }
        int i = 0;
        if (r0 != null) {
            int A012 = r0.A01();
            while (true) {
                if (i < A012) {
                    C287725af r7 = this.A01;
                    if (r7 == null) {
                        break;
                    }
                    AnonymousClass6HN r2 = this.A03;
                    float A002 = r21.A00(i);
                    long j2 = j / 1000000;
                    AnonymousClass6HO r02 = ((AnonymousClass6HM) r2).A00;
                    double A003 = AnonymousClass6HO.A00(r02, A002);
                    double d = (double) AnonymousClass6HP.A00;
                    double d2 = d - 1.0d;
                    float exp = (float) (((double) (r02.A00 * r02.A01)) * Math.exp((d / d2) * A003));
                    long exp2 = (long) (Math.exp(A003 / d2) * 1000.0d);
                    if (exp2 > 0) {
                        f = ((float) j2) / ((float) exp2);
                    } else {
                        f = 1.0f;
                    }
                    float f2 = 0.0f;
                    int A022 = (int) (C229632nm.A02(f, 0.0f, 1.0f) * 100.0f);
                    if (A022 < 100) {
                        int i2 = A022 + 1;
                        float[] fArr = GQX.A00;
                        float f3 = fArr[A022];
                        f2 = (fArr[i2] - f3) / ((((float) i2) / 100.0f) - (((float) A022) / 100.0f));
                    }
                    r7.A03(i, (((f2 * Math.signum(A002)) * exp) / ((float) exp2)) * 1000.0f);
                    i++;
                } else {
                    C287725af r03 = this.A01;
                    if (r03 != null) {
                        return r03;
                    }
                }
            }
        }
        0qQ.A0F("velocityVector");
        throw AnonymousClass00P.createAndThrow();
    }

    public GQI(AnonymousClass6HN r1) {
        this.A03 = r1;
    }
}
