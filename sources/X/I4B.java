package X;

public final class I4B {
    public final AnonymousClass5b4 A00 = new AnonymousClass5b4(C287765aj.A06, C51965G9l.A0M(0), (Object) null);
    public final AnonymousClass5b4 A01 = C287705ad.A00(1.0f);
    public final AnonymousClass6HR A02;
    public final C284945Oz A03;
    public final C284945Oz A04;
    public final C270284gU A05;
    public final C270284gU A06;
    public final C55595HkF A07;
    public final LAC A08;
    public final C262224Cq A09;

    public I4B(AnonymousClass6HR r6, C262224Cq r7) {
        int A022 = DbW.A02(1, r7, r6);
        this.A09 = r7;
        this.A02 = r6;
        this.A07 = new C55595HkF(r7);
        this.A08 = new LAC(new C59099J6h(this, 30), JJQ.A00(this, 25));
        long A0F = C51972G9s.A0F();
        this.A03 = C51970G9q.A0S(new C289005cr(A0F));
        this.A04 = C51969G9p.A0S(new C289005cr(A0F));
        this.A06 = C51965G9l.A0I((C284895Os) null, new C58713IwM(this, 3));
        this.A05 = C51965G9l.A0I((C284895Os) null, new C58713IwM(this, A022));
    }

    public static final float A00(I4B i4b) {
        float max;
        C284945Oz r6 = i4b.A04;
        if (G9w.A06(r6) == 0) {
            max = 1.0f;
        } else {
            C284945Oz r5 = i4b.A03;
            max = Math.max(((float) ((int) (G9w.A06(r5) >> 32))) / ((float) ((int) (G9w.A06(r6) >> 32))), ((float) C289005cr.A00(G9w.A06(r5))) / ((float) C289005cr.A00(G9w.A06(r6))));
        }
        return Math.max(2.0f, max);
    }

    public static final long A01(I4B i4b, float f, long j) {
        long A012 = C289155d7.A01(G9w.A06(i4b.A04));
        if (A012 == 9205357640488583168L) {
            throw AnonymousClass7TE.A0z(C273654mx.A00(1383));
        }
        long floatToRawIntBits = (((long) Float.floatToRawIntBits(C51968G9o.A00(A012) * f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (A012 & 4294967295L)) * f)) & 4294967295L);
        float A022 = C288025bF.A02(floatToRawIntBits);
        C284945Oz r6 = i4b.A03;
        float A062 = A022 - ((float) ((int) (G9w.A06(r6) >> 32)));
        if (A062 < 0.0f) {
            A062 = 0.0f;
        }
        float A002 = C288025bF.A00(floatToRawIntBits) - ((float) C289005cr.A00(G9w.A06(r6)));
        if (A002 < 0.0f) {
            A002 = 0.0f;
        }
        long A052 = C289295dM.A05(0.5f, C289325dP.A00(A062, A002));
        float A013 = C289295dM.A01(j);
        float A014 = C289295dM.A01(A052);
        float A023 = C229632nm.A02(A013, -A014, A014);
        float A024 = C289295dM.A02(j);
        float A025 = C289295dM.A02(A052);
        return C289325dP.A00(A023, C229632nm.A02(A024, -A025, A025));
    }
}
