package X;

public final class JHD extends 0Yg implements 0sK {
    public final /* synthetic */ C55799Hnf A00;
    public final /* synthetic */ AnonymousClass6D9 A01;
    public final /* synthetic */ AnonymousClass6D8 A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ 0sP A04;
    public final /* synthetic */ AnonymousClass62P A05;
    public final /* synthetic */ boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JHD(C55799Hnf hnf, AnonymousClass6D9 r3, AnonymousClass6D8 r4, String str, 0sP r6, AnonymousClass62P r7, boolean z) {
        super(3);
        this.A00 = hnf;
        this.A04 = r6;
        this.A05 = r7;
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = str;
        this.A06 = z;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C62320sa r8;
        C286575Wy r3 = (C286575Wy) obj2;
        if (C51968G9o.A0D(obj3) != 16 || !r3.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(2005550879, "com.instagram.barcelona.feed.post.ui.PostCarousel.<anonymous>.<anonymous> (PostCarousel.kt:455)");
            }
            C55799Hnf hnf = this.A00;
            AnonymousClass6D2 r6 = (AnonymousClass6D2) hnf.A02;
            int i = hnf.A01;
            r3.ExS(1216746278);
            0sP r1 = this.A04;
            if (r1 != null) {
                boolean A1Z = G9t.A1Z(r3, r1, hnf, 1216747922);
                Object ECw = r3.ECw();
                if (A1Z || ECw == AnonymousClass5XT.A00) {
                    ECw = C58716IwP.A00(r3, r1, hnf, 3);
                }
                r8 = (C62320sa) ECw;
                C51965G9l.A1V(r3);
            } else {
                r8 = null;
            }
            boolean A1Y = C51968G9o.A1Y(r3);
            boolean A0K = 0qQ.A0K(r6.A03, ((C299515vK) 00k.A0I(this.A05)).getId());
            HVH.A00(r3, this.A01, this.A02, r6, this.A03, r8, i, A1Y ? 1 : 0, A1Y ? 1 : 0, this.A06, A0K);
            if (0fL.A02()) {
                0fL.A00(1942070624);
            }
        } else {
            r3.Evl();
        }
        return C60340gF.A00;
    }
}
