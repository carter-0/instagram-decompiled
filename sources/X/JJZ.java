package X;

import androidx.compose.ui.Modifier;
import java.util.List;

public final class JJZ extends 0Yg implements 0sJ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Modifier A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ 0sP A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JJZ(Modifier modifier, List list, 0sP r4, int i) {
        super(4);
        this.A02 = list;
        this.A01 = modifier;
        this.A00 = i;
        this.A03 = r4;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int A0M = AnonymousClass7TE.A0M(obj2);
        C286575Wy r12 = (C286575Wy) obj3;
        int A0M2 = AnonymousClass7TE.A0M(obj4);
        if ((A0M2 & 6) == 0) {
            i = A0M2 | G9t.A0O(r12, obj);
        } else {
            i = A0M2;
        }
        if ((A0M2 & 48) == 0) {
            i |= G9t.A06(r12, A0M);
        }
        if ((i & 147) != 146 || !r12.Bwn()) {
            if (0fL.A02()) {
                C51965G9l.A17(-461537120);
            }
            C53380GnA gnA = (C53380GnA) this.A02.get(A0M);
            r12.ExS(-1274697785);
            C287245Zp r0 = C287215Zl.A04;
            C285245Qk r2 = Modifier.A00;
            AnonymousClass5RD A0Q = C51965G9l.A0Q(r12, r0);
            int A002 = C287425a7.A00(r12);
            C286565Wx r4 = (C286565Wx) r12;
            AnonymousClass5RM A04 = C286565Wx.A04(r4);
            Modifier A012 = C287435a8.A01(r12, r2);
            C51973G9u.A0y(r12, r4);
            C51971G9r.A12(r12, A0Q, A04);
            0sL r1 = C287485aD.A02;
            if (r4.A0K || !C51972G9s.A1Q(r12, A002)) {
                C51971G9r.A13(r12, r1, A002);
            }
            C51965G9l.A18(r12, A012);
            C288095bM r8 = C288075bK.A00;
            AnonymousClass2DN A003 = 1zC.A00(r12, DbS.A0V(gnA.A01));
            Modifier modifier = this.A01;
            AnonymousClass6G3.A09(r12, C287635aW.A06(C51968G9o.A0P(C304816Fi.A02(C287205Zk.A0C(modifier, 32.0f), new C304776Fe(C51966G9m.A0F(r12)), AnonymousClass5ZN.A01(4.0f), 1.0f), 4.0f), new C58689Ivy(10, this.A03, gnA)), A003, r8);
            Modifier A0B = C287195Zj.A0B(modifier, 16.0f, 0.0f, 0.0f, 0.0f);
            int i2 = gnA.A00;
            int i3 = this.A00;
            HZ1.A00(r12, A0B, 002.A01('/', i2, i3), (String) null, ((float) i2) / ((float) i3), 0, 44, 0, 0);
            r12.ASN();
            if (C51967G9n.A1b(r4, false)) {
                0fL.A00(510602855);
            }
        } else {
            r12.Evl();
        }
        return C60340gF.A00;
    }
}
