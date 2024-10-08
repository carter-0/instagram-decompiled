package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.J8i  reason: case insensitive filesystem */
public final class C59152J8i extends 0Yg implements 0sL {
    public final /* synthetic */ long A00;
    public final /* synthetic */ Modifier A01;
    public final /* synthetic */ C62320sa A02;
    public final /* synthetic */ 0sP A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59152J8i(Modifier modifier, C62320sa r3, 0sP r4, long j, boolean z, boolean z2, boolean z3) {
        super(2);
        this.A01 = modifier;
        this.A03 = r4;
        this.A06 = z;
        this.A02 = r3;
        this.A05 = z2;
        this.A04 = z3;
        this.A00 = j;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C286575Wy r2 = (C286575Wy) obj;
        if (C51968G9o.A0B(obj2) != 2 || !r2.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(2131027209, "com.instagram.barcelona.feed.post.ui.PostLikeIconWithAnimatedCount.<anonymous> (PostDenseUfi.kt:303)");
            }
            Modifier A0C = C287205Zk.A0C(this.A01, 18.0f);
            r2.ExS(105946690);
            0sP r1 = this.A03;
            boolean AGu = r2.AGu(r1);
            boolean z = this.A06;
            boolean A1V = C51966G9m.A1V(r2, z, AGu);
            Object ECw = r2.ECw();
            if (A1V || ECw == AnonymousClass5XT.A00) {
                ECw = GA1.A00(r2, r1, 10, z);
            }
            boolean A1Y = C51968G9o.A1Y(r2);
            C62320sa r5 = this.A02;
            boolean z2 = this.A05;
            boolean z3 = this.A04;
            AnonymousClass6DO.A02(r2, A0C, (C62320sa) ECw, r5, 12582912, A1Y ? 1 : 0, this.A00, z, z2, z3, A1Y);
            if (0fL.A02()) {
                0fL.A00(-2027743794);
            }
        } else {
            r2.Evl();
        }
        return C60340gF.A00;
    }
}
