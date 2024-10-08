package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.J7k  reason: case insensitive filesystem */
public final class C59128J7k extends 0Yg implements 0sL {
    public final /* synthetic */ String A00;
    public final /* synthetic */ C62320sa A01;
    public final /* synthetic */ C62320sa A02;
    public final /* synthetic */ C62320sa A03;
    public final /* synthetic */ boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59128J7k(String str, C62320sa r3, C62320sa r4, C62320sa r5, boolean z) {
        super(2);
        this.A00 = str;
        this.A04 = z;
        this.A01 = r3;
        this.A03 = r4;
        this.A02 = r5;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C286575Wy r12 = (C286575Wy) obj;
        if (C51968G9o.A0B(obj2) != 2 || !r12.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1046568379, "com.instagram.schools.management.ui.SchoolManagementBottomSheetComposeView.<anonymous> (SchoolManagementBottomSheetComposeView.kt:27)");
            }
            Modifier A0U = C51969G9p.A0U();
            String str = this.A00;
            boolean z = this.A04;
            C62320sa r8 = this.A01;
            C62320sa r7 = this.A03;
            C62320sa r4 = this.A02;
            AnonymousClass5RD A022 = C291495hO.A02(C287275Zs.A07, r12, C287215Zl.A02, 0);
            int A002 = C287425a7.A00(r12);
            C286565Wx r2 = (C286565Wx) r12;
            AnonymousClass5RM A042 = C286565Wx.A04(r2);
            Modifier A012 = C287435a8.A01(r12, A0U);
            C51973G9u.A0y(r12, r2);
            C51971G9r.A12(r12, A022, A042);
            0sL r1 = C287485aD.A02;
            if (r2.A0K || !C51972G9s.A1Q(r12, A002)) {
                C51971G9r.A13(r12, r1, A002);
            }
            C51965G9l.A18(r12, A012);
            C55127Hcb.A00(str, r12, 0);
            C55129Hcd.A00(r12, 0);
            r12.ExS(-2010344092);
            if (z) {
                String A003 = C288035bG.A00(r12, 2131964479);
                boolean A1Y = C51967G9n.A1Y(r12, r8, -2010338894);
                Object ECw = r12.ECw();
                if (A1Y || ECw == AnonymousClass5XT.A00) {
                    ECw = new C58685Ivu(r8, 48);
                    r12.FLL(ECw);
                }
                C52636GaA.A0E(r12, C51969G9p.A0V(r2, A0U, ECw), C57124IPn.A00, A003);
            }
            C286565Wx.A0L(r2, false);
            String A004 = C288035bG.A00(r12, 2131965849);
            boolean A1Y2 = C51967G9n.A1Y(r12, r7, -2010331564);
            Object ECw2 = r12.ECw();
            if (A1Y2 || ECw2 == AnonymousClass5XT.A00) {
                ECw2 = new C58685Ivu(r7, 49);
                r12.FLL(ECw2);
            }
            Modifier A0V = C51969G9p.A0V(r2, A0U, ECw2);
            C57124IPn iPn = C57124IPn.A00;
            C52636GaA.A0E(r12, A0V, iPn, A004);
            String A005 = C288035bG.A00(r12, 2131972095);
            boolean A1Y3 = C51967G9n.A1Y(r12, r4, -2010324622);
            Object ECw3 = r12.ECw();
            if (A1Y3 || ECw3 == AnonymousClass5XT.A00) {
                ECw3 = C58681Ivq.A00(r12, r4, 0);
            }
            C52636GaA.A0I(r12, C51969G9p.A0V(r2, A0U, ECw3), iPn, A005, 129788, C51966G9m.A09(r12));
            if (C51967G9n.A1R(r12)) {
                0fL.A00(-1352596499);
            }
        } else {
            r12.Evl();
        }
        return C60340gF.A00;
    }
}
