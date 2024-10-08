package X;

import androidx.compose.ui.Modifier;

public final class JGS extends 0Yg implements 0sK {
    public final /* synthetic */ float A00;
    public final /* synthetic */ AnonymousClass5vX A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JGS(AnonymousClass5vX r2, float f) {
        super(3);
        this.A00 = f;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C305236Hb r8 = (C305236Hb) obj;
        C286575Wy r9 = (C286575Wy) obj2;
        int A0j = G9t.A0j(obj3, r8);
        if ((A0j & 6) == 0) {
            A0j |= G9t.A0O(r9, r8);
        }
        if ((A0j & 19) != 18 || !r9.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-93934890, "com.instagram.feed.tifu.ui.TifuHScrollUnit.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TifuHScrollUnit.kt:219)");
            }
            if (C51972G9s.A1T(r9, C51969G9p.A0X(C304816Fi.A02(C287195Zj.A09(r8.AV3(Modifier.A00, this.A00), 16.0f, 16.0f), new C304776Fe(C51966G9m.A0F(r9)), AnonymousClass5ZN.A01(16.0f), 1.0f), 16.0f, C51966G9m.A0A(r9)), new C59341JFt(this.A01, 4), 1784435480)) {
                0fL.A00(1229003013);
            }
        } else {
            r9.Evl();
        }
        return C60340gF.A00;
    }
}
