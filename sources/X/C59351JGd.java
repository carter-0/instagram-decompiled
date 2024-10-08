package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.JGd  reason: case insensitive filesystem */
public final class C59351JGd extends 0Yg implements 0sK {
    public final /* synthetic */ float A00;
    public final /* synthetic */ AnonymousClass5vX A01;
    public final /* synthetic */ C62320sa A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59351JGd(AnonymousClass5vX r2, C62320sa r3, float f) {
        super(3);
        this.A00 = f;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C305236Hb r7 = (C305236Hb) obj;
        C286575Wy r8 = (C286575Wy) obj2;
        int A0j = G9t.A0j(obj3, r7);
        if ((A0j & 6) == 0) {
            A0j |= G9t.A0O(r8, r7);
        }
        if ((A0j & 19) != 18 || !r8.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(431399246, "com.instagram.feed.tifu.ui.TifuHScrollUnit.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TifuHScrollUnit.kt:246)");
            }
            Modifier A022 = C304816Fi.A02(r7.AV3(Modifier.A00, this.A00), new C304776Fe(C51966G9m.A0F(r8)), AnonymousClass5ZN.A01(16.0f), 1.0f);
            C62320sa r5 = this.A02;
            if (C51972G9s.A1T(r8, C287195Zj.A09(C51969G9p.A0X(C288235ba.A04(r8, A022, r5), 16.0f, C51966G9m.A0A(r8)), 51.0f, 24.0f), new JG2(30, r5, this.A01), 225648522)) {
                0fL.A00(-1766659749);
            }
        } else {
            r8.Evl();
        }
        return C60340gF.A00;
    }
}
