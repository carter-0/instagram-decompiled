package X;

import androidx.compose.ui.Modifier;

public final class JHJ extends 0Yg implements 0sK {
    public final /* synthetic */ C55799Hnf A00;
    public final /* synthetic */ AnonymousClass6D9 A01;
    public final /* synthetic */ AnonymousClass6D8 A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ 0sP A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JHJ(C55799Hnf hnf, AnonymousClass6D9 r3, AnonymousClass6D8 r4, String str, String str2, 0sP r7, boolean z, boolean z2) {
        super(3);
        this.A01 = r3;
        this.A00 = hnf;
        this.A02 = r4;
        this.A03 = str;
        this.A07 = z;
        this.A05 = r7;
        this.A04 = str2;
        this.A06 = z2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        float f;
        C286575Wy r7 = (C286575Wy) obj2;
        int A0M = AnonymousClass7TE.A0M(obj3);
        0qQ.A0B(obj, 0);
        if ((A0M & 17) != 16 || !r7.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(898554314, "com.instagram.barcelona.feed.post.ui.PostCarousel.<anonymous>.<anonymous> (PostCarousel.kt:376)");
            }
            AnonymousClass6D9 r9 = this.A01;
            C55799Hnf hnf = this.A00;
            AnonymousClass9JJ r1 = (AnonymousClass9JJ) hnf.A02;
            AnonymousClass3WR r11 = (AnonymousClass3WR) r1.A06;
            AnonymousClass6D8 r10 = this.A02;
            float f2 = (float) r1.A02;
            float f3 = (float) r1.A01;
            if (f2 <= 0.0f || f3 <= 0.0f) {
                f = 1.0f;
            } else {
                f = C229632nm.A02(f2 / f3, 0.75f, 1.3333334f);
            }
            String str = this.A03;
            boolean z = this.A07;
            r7.ExS(1216649486);
            0sP r12 = this.A05;
            boolean A1U = C51971G9r.A1U(r7, r12, hnf);
            Object ECw = r7.ECw();
            if (A1U || ECw == AnonymousClass5XT.A00) {
                ECw = C58716IwP.A00(r7, r12, hnf, 1);
            }
            C51965G9l.A1X(r7, false);
            HVB.A00(r7, (Modifier) null, r9, r10, r11, str, this.A04, (C62320sa) ECw, f, hnf.A01, 221184, 0, 53760, true, false, z, false, this.A06, false, false);
            if (0fL.A02()) {
                0fL.A00(1506561125);
            }
        } else {
            r7.Evl();
        }
        return C60340gF.A00;
    }
}
