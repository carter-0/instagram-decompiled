package X;

public final class J4K extends 0Yg implements 0sP {
    public static final J4K A00 = new J4K();

    public J4K() {
        super(1);
    }

    /* JADX INFO: finally extract failed */
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass5Q3 A0T = C51968G9o.A0T(obj);
        float F06 = A0T.F06(344.0f);
        float F062 = A0T.F06(516.0f);
        C52924Gey A002 = C304796Fg.A00(0sr.A1P(new AnonymousClass5RW[]{C51967G9n.A0I(4286591988L), C51967G9n.A0I(4289337820L), C51967G9n.A0I(4286461174L)}), 0, 9187343241974906880L);
        long j = 4294932482L << 32;
        long j2 = 4294379380L << 32;
        float f = F06 * 0.5f;
        C52922Gew gew = new C52922Gew(0sr.A1P(new AnonymousClass5RW[]{C51965G9l.A0N(j), C51965G9l.A0N(j2), C51967G9n.A0I(4289275593L), C51967G9n.A0I(8401908)}), f);
        C52922Gew gew2 = new C52922Gew(0sr.A1P(new AnonymousClass5RW[]{C51965G9l.A0N(j), C51965G9l.A0N(j2), C51967G9n.A0I(4289272797L), C51967G9n.A0I(8401909)}), F062 * 0.5f);
        C52922Gew gew3 = new C52922Gew(0sr.A1P(new AnonymousClass5RW[]{C51967G9n.A0I(4286526452L), C51967G9n.A0I(4287770338L), C51967G9n.A0I(2158307026L), C51967G9n.A0I(10888913)}), Float.POSITIVE_INFINITY);
        float F063 = A0T.F06(40.0f);
        long A003 = AnonymousClass6GR.A00(F063, F063);
        long A0H = C51968G9o.A0H(A0T);
        C289635dw r23 = C289635dw.A00;
        AnonymousClass5Q3 r20 = A0T;
        r20.AQu(A002, (C288195bW) null, r23, 1.0f, 3, 0, A0H, A003);
        AnonymousClass5QD Ayw = A0T.Ayw();
        AnonymousClass5QC r2 = (AnonymousClass5QC) Ayw;
        AnonymousClass5QB r10 = r2.A02.A02;
        long A05 = C51967G9n.A05(r10);
        try {
            AnonymousClass5QF r4 = r2.A01;
            r4.FHv(0.2f * F06, -0.6f * F062);
            r4.EJR(r4.AmQ(), 20.0f);
            r4.EKJ(r4.AmQ(), 1.5f, 2.0f);
            long A004 = C289325dP.A00(0.0f, 0.0f);
            long Bwg = A0T.Bwg();
            float A02 = C288025bF.A02(Bwg) / 2.0f;
            C52922Gew gew4 = gew;
            long j3 = A004;
            r20.AQu(gew4, (C288195bW) null, r23, 1.0f, 3, j3, C298565tf.A00(Bwg, A004), AnonymousClass6GR.A00(A02, A02));
            C51968G9o.A1G(r10, Ayw, A05);
            A05 = C51967G9n.A05(r10);
            r4.FHv(F06 * 0.1f, 0.7f * F062);
            r4.EJR(r4.AmQ(), 40.0f);
            r4.EKJ(r4.AmQ(), 6.0f, 2.0f);
            long Bwg2 = A0T.Bwg();
            float A022 = C288025bF.A02(Bwg2) / 2.0f;
            C52922Gew gew5 = gew2;
            r20.AQu(gew5, (C288195bW) null, r23, 1.0f, 3, j3, C298565tf.A00(Bwg2, A004), AnonymousClass6GR.A00(A022, A022));
            C51968G9o.A1G(r10, Ayw, A05);
            A05 = C51967G9n.A05(r10);
            r4.FHv(f, 0.05f * F062);
            r4.EKJ(r4.AmQ(), 1.0f, 1.0f);
            long Bwg3 = A0T.Bwg();
            float A023 = C288025bF.A02(Bwg3) / 2.0f;
            AnonymousClass5Q3 r18 = A0T;
            C52922Gew gew6 = gew3;
            C289635dw r21 = r23;
            long j4 = A004;
            r18.AQu(gew6, (C288195bW) null, r21, 1.0f, 3, j4, C298565tf.A00(Bwg3, A004), AnonymousClass6GR.A00(A023, A023));
            C51968G9o.A1G(r10, Ayw, A05);
            return C60340gF.A00;
        } catch (Throwable th) {
            C51968G9o.A1G(r10, Ayw, A05);
            throw th;
        }
    }
}
