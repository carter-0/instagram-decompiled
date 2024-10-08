package X;

/* renamed from: X.Ix2  reason: case insensitive filesystem */
public final class C58755Ix2 extends 0Yg implements 0sP {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C62320sa A01;
    public final /* synthetic */ 0sP A02;
    public final /* synthetic */ AnonymousClass62P A03;
    public final /* synthetic */ boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58755Ix2(C62320sa r2, 0sP r3, AnonymousClass62P r4, long j, boolean z) {
        super(1);
        this.A01 = r2;
        this.A00 = j;
        this.A03 = r4;
        this.A02 = r3;
        this.A04 = z;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        AnonymousClass5Q4 r13 = (AnonymousClass5Q4) obj;
        C51970G9q.A15(r13);
        float f = ((C53355Gmf) this.A01.invoke()).A02;
        long j = this.A00;
        AnonymousClass62P<C61065Jw3> r2 = this.A03;
        0sP r5 = this.A02;
        boolean z = this.A04;
        for (C61065Jw3 jw3 : r2) {
            AnonymousClass5VN r8 = (AnonymousClass5VN) jw3.A02;
            float f2 = r8.A02 - r8.A01;
            if (f2 >= 0.0f) {
                int i2 = jw3.A00;
                if (f <= ((float) i2) && i2 > (i = jw3.A01)) {
                    float f3 = (float) i;
                    float f4 = ((f - f3) * f2) / ((float) (i2 - i));
                    if (f4 < 0.0f) {
                        f4 = 0.0f;
                    }
                    if (f >= f3) {
                        C51967G9n.A1Q(r5, r8.A00);
                    }
                    float f5 = r8.A01;
                    if (!z) {
                        f5 += f4;
                    }
                    float f6 = r8.A03;
                    r13.AQs((C288195bW) null, C289635dw.A00, 1.0f, 5, j, C289325dP.A00(f5, f6), C288015bE.A00(f2 - f4, r8.A00 - f6));
                }
            }
        }
        return C60340gF.A00;
    }
}
