package X;

import androidx.compose.ui.Modifier;

public final class JHK extends 0Yg implements 0sK {
    public final /* synthetic */ float A00;
    public final /* synthetic */ AnonymousClass6D9 A01;
    public final /* synthetic */ AnonymousClass6D8 A02;
    public final /* synthetic */ C299515vK A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ 0sP A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JHK(AnonymousClass6D9 r2, AnonymousClass6D8 r3, C299515vK r4, String str, 0sP r6, float f, boolean z, boolean z2) {
        super(3);
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
        this.A00 = f;
        this.A07 = z;
        this.A04 = str;
        this.A05 = r6;
        this.A06 = z2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C286575Wy r5 = (C286575Wy) obj2;
        int A0M = AnonymousClass7TE.A0M(obj3);
        0qQ.A0B(obj, 0);
        if ((A0M & 17) != 16 || !r5.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(452255122, "com.instagram.barcelona.feed.post.ui.PostSingleMedia.<anonymous>.<anonymous> (PostSingleMedia.kt:465)");
            }
            AnonymousClass6D8 r8 = this.A02;
            if (r8 != null) {
                AnonymousClass6D9 r7 = this.A01;
                C299515vK r4 = this.A03;
                float f = this.A00;
                boolean z = this.A07;
                String str = this.A04;
                0sP r3 = this.A05;
                boolean z2 = this.A06;
                if (r7 != null) {
                    AnonymousClass3WR r9 = ((AnonymousClass6D3) r4).A03;
                    boolean A1Z = G9t.A1Z(r5, r3, r4, -2091581271);
                    Object ECw = r5.ECw();
                    if (A1Z || ECw == AnonymousClass5XT.A00) {
                        ECw = C58716IwP.A00(r5, r4, r3, 16);
                    }
                    C51965G9l.A1X(r5, false);
                    HVB.A00(r5, (Modifier) null, r7, r8, r9, str, (String) null, (C62320sa) ECw, f, 0, 12779520, 0, 56832, z, false, false, false, z2, false, false);
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
            if (0fL.A02()) {
                0fL.A00(764174300);
            }
        } else {
            r5.Evl();
        }
        return C60340gF.A00;
    }
}
