package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;

public final class JHN extends 0Yg implements 0sK {
    public final /* synthetic */ C55799Hnf A00;
    public final /* synthetic */ C53273GlL A01;
    public final /* synthetic */ C303846Ba A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ C62320sa A04;
    public final /* synthetic */ C62320sa A05;
    public final /* synthetic */ C62320sa A06;
    public final /* synthetic */ 0sP A07;
    public final /* synthetic */ boolean A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JHN(C55799Hnf hnf, C53273GlL glL, C303846Ba r4, String str, C62320sa r6, C62320sa r7, C62320sa r8, 0sP r9, boolean z) {
        super(3);
        this.A02 = r4;
        this.A00 = hnf;
        this.A01 = glL;
        this.A03 = str;
        this.A04 = r6;
        this.A05 = r7;
        this.A06 = r8;
        this.A08 = z;
        this.A07 = r9;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C55799Hnf hnf;
        Object obj4;
        Object r4;
        C289525dk r5 = (C289525dk) obj;
        C286575Wy r12 = (C286575Wy) obj2;
        int A0M = AnonymousClass7TE.A0M(obj3);
        0qQ.A0B(r5, 0);
        if ((A0M & 6) == 0) {
            A0M |= G9t.A0O(r12, r5);
        }
        if ((A0M & 19) != 18 || !r12.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-2032796029, "com.instagram.barcelona.feed.post.ui.PostCarousel.<anonymous>.<anonymous> (PostCarousel.kt:315)");
            }
            C303846Ba r1 = this.A02;
            if (r1 instanceof C53488GpK) {
                AnonymousClass62P r13 = ((C53488GpK) r1).A00;
                hnf = this.A00;
                r4 = r13.get(hnf.A01);
            } else {
                boolean z = this.A01.A02;
                hnf = this.A00;
                AnonymousClass9JJ r0 = (AnonymousClass9JJ) hnf.A02;
                if (z) {
                    obj4 = r0.A04;
                } else {
                    obj4 = r0.A05;
                }
                r4 = new AnonymousClass6BY((ImageUrl) obj4);
            }
            AnonymousClass6BY r42 = (AnonymousClass6BY) r4;
            String str = this.A03;
            r12.ExS(1216569943);
            if (str == null) {
                str = C288035bG.A00(r12, 2131953689);
            }
            C286565Wx A0H = C51965G9l.A0H(r12, false);
            C285245Qk r14 = Modifier.A00;
            String str2 = str;
            AnonymousClass6BY r17 = r42;
            C304096Cd.A00(r12, (Alignment) null, r5.CmS(r14), (C288195bW) null, C288075bK.A00, r17, str2, this.A04, this.A05, this.A06, 0.0f, 12582912, 0, 1856, 0);
            if (this.A08) {
                r12.ExS(1216585134);
                0sP r7 = this.A07;
                boolean A1U = C51971G9r.A1U(r12, r7, hnf);
                Object ECw = r12.ECw();
                if (A1U || ECw == AnonymousClass5XT.A00) {
                    ECw = C58716IwP.A00(r12, r7, hnf, 0);
                }
                C62320sa A0y = C51965G9l.A0y(A0H, ECw, false);
                C286575Wy r43 = r12;
                HUP.A00(r43, C287195Zj.A0B(r5.AAz(C287215Zl.A08, r14), 12.0f, 0.0f, 0.0f, 12.0f), HL3.VIEW, A0y, 48, 0);
            }
            if (0fL.A02()) {
                0fL.A00(1145474693);
            }
        } else {
            r12.Evl();
        }
        return C60340gF.A00;
    }
}
