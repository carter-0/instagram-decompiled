package X;

import androidx.compose.ui.Modifier;

public final class JHC extends 0Yg implements 0sK {
    public final /* synthetic */ C55799Hnf A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ C62320sa A02;
    public final /* synthetic */ C62320sa A03;
    public final /* synthetic */ C62320sa A04;
    public final /* synthetic */ 0sP A05;
    public final /* synthetic */ AnonymousClass62P A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JHC(C55799Hnf hnf, String str, C62320sa r4, C62320sa r5, C62320sa r6, 0sP r7, AnonymousClass62P r8) {
        super(3);
        this.A00 = hnf;
        this.A01 = str;
        this.A05 = r7;
        this.A06 = r8;
        this.A02 = r4;
        this.A03 = r5;
        this.A04 = r6;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C62320sa r16;
        C289525dk r4 = (C289525dk) obj;
        C286575Wy r8 = (C286575Wy) obj2;
        int A0M = AnonymousClass7TE.A0M(obj3);
        0qQ.A0B(r4, 0);
        if ((A0M & 6) == 0) {
            A0M |= G9t.A0O(r8, r4);
        }
        if ((A0M & 19) != 18 || !r8.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1631784372, "com.instagram.barcelona.feed.post.ui.PostCarousel.<anonymous>.<anonymous> (PostCarousel.kt:409)");
            }
            C55799Hnf hnf = this.A00;
            AnonymousClass6D4 r6 = (AnonymousClass6D4) hnf.A02;
            AnonymousClass6BY r10 = new AnonymousClass6BY(r6.A00);
            String str = r6.A02;
            String str2 = this.A01;
            r8.ExS(1216677367);
            if (str2 == null) {
                str2 = C288035bG.A00(r8, 2131953689);
            }
            C286565Wx A0H = C51965G9l.A0H(r8, false);
            Modifier CmS = r4.CmS(Modifier.A00);
            r8.ExS(1216689606);
            0sP r42 = this.A05;
            if (r42 != null) {
                boolean A1Z = G9t.A1Z(r8, r42, hnf, 1216691250);
                Object ECw = r8.ECw();
                if (A1Z || ECw == AnonymousClass5XT.A00) {
                    ECw = C58716IwP.A00(r8, r42, hnf, 2);
                }
                r16 = C51965G9l.A0y(A0H, ECw, false);
            } else {
                r16 = null;
            }
            C286565Wx.A0L(A0H, false);
            HVG.A00(r8, CmS, r10, str, str2, this.A02, this.A03, this.A04, r16, 0, 0, 0qQ.A0K(r6.A01, ((C299515vK) 00k.A0I(this.A06)).getId()));
            if (0fL.A02()) {
                0fL.A00(1862517116);
            }
        } else {
            r8.Evl();
        }
        return C60340gF.A00;
    }
}
