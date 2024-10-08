package X;

public final class JHV extends 0Yg implements 0sK {
    public final /* synthetic */ HM6 A00;
    public final /* synthetic */ C55528HjA A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ C62320sa A04;
    public final /* synthetic */ C62320sa A05;
    public final /* synthetic */ C62320sa A06;
    public final /* synthetic */ C62320sa A07;
    public final /* synthetic */ 0sP A08;
    public final /* synthetic */ boolean A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JHV(HM6 hm6, C55528HjA hjA, String str, String str2, C62320sa r6, C62320sa r7, C62320sa r8, C62320sa r9, 0sP r10, boolean z) {
        super(3);
        this.A07 = r6;
        this.A05 = r7;
        this.A08 = r10;
        this.A06 = r8;
        this.A04 = r9;
        this.A03 = str;
        this.A02 = str2;
        this.A00 = hm6;
        this.A09 = z;
        this.A01 = hjA;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C286575Wy r2 = (C286575Wy) obj2;
        int A0M = AnonymousClass7TE.A0M(obj3);
        0qQ.A0B(obj, 0);
        if ((A0M & 17) != 16 || !r2.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-641523266, "com.instagram.schools.management.ui.SchoolOnboardingStudentEmailContent.<anonymous> (SchoolOnboardingStudentEmailContent.kt:66)");
            }
            C62320sa r7 = this.A07;
            C62320sa r8 = this.A05;
            0sP r11 = this.A08;
            C62320sa r9 = this.A06;
            C62320sa r10 = this.A04;
            String str = this.A03;
            String str2 = this.A02;
            C56642I5x.A01(r2, this.A00, this.A01, str, str2, r7, r8, r9, r10, r11, 0, this.A09);
            if (0fL.A02()) {
                0fL.A00(-113399800);
            }
        } else {
            r2.Evl();
        }
        return C60340gF.A00;
    }
}
