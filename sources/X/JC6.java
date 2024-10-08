package X;

import android.content.Context;
import androidx.compose.ui.Modifier;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

public final class JC6 extends 0Yg implements 0sL {
    public final /* synthetic */ C299665vd A00;
    public final /* synthetic */ C299635va A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ AnonymousClass5vX A03;
    public final /* synthetic */ C62320sa A04;
    public final /* synthetic */ C62320sa A05;
    public final /* synthetic */ 0sP A06;
    public final /* synthetic */ 0sP A07;
    public final /* synthetic */ 0sP A08;
    public final /* synthetic */ 0sP A09;
    public final /* synthetic */ 0sL A0A;
    public final /* synthetic */ boolean A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JC6(C299665vd r2, C299635va r3, UserSession userSession, AnonymousClass5vX r5, C62320sa r6, C62320sa r7, 0sP r8, 0sP r9, 0sP r10, 0sP r11, 0sL r12, boolean z) {
        super(2);
        this.A03 = r5;
        this.A0B = z;
        this.A06 = r8;
        this.A05 = r6;
        this.A02 = userSession;
        this.A04 = r7;
        this.A09 = r9;
        this.A0A = r12;
        this.A07 = r10;
        this.A08 = r11;
        this.A00 = r2;
        this.A01 = r3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C286575Wy r4 = (C286575Wy) obj;
        if (C51968G9o.A0B(obj2) != 2 || !r4.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(742370326, "com.instagram.feed.tifu.ui.TifuHScrollPagerUnit.<anonymous> (TifuHScrollPagerUnit.kt:88)");
            }
            AnonymousClass5vX r5 = this.A03;
            boolean z = this.A0B;
            0sP r10 = this.A06;
            C62320sa r1 = this.A05;
            UserSession userSession = this.A02;
            C62320sa r27 = this.A04;
            0sP r28 = this.A09;
            0sL r31 = this.A0A;
            0sP r29 = this.A07;
            0sP r20 = this.A08;
            C299665vd r18 = this.A00;
            C299635va r17 = this.A01;
            C285245Qk r9 = Modifier.A00;
            AnonymousClass5RD A022 = C291495hO.A02(C287275Zs.A07, r4, C287215Zl.A02, 0);
            int A002 = C287425a7.A00(r4);
            C286565Wx r2 = (C286565Wx) r4;
            AnonymousClass5RM A042 = C286565Wx.A04(r2);
            Modifier A012 = C287435a8.A01(r4, r9);
            C51973G9u.A0z(r4, r2, C287485aD.A00);
            C51971G9r.A12(r4, A022, A042);
            0sL r6 = C287485aD.A02;
            if (r2.A0K || !C51972G9s.A1Q(r4, A002)) {
                C51971G9r.A13(r4, r6, A002);
            }
            C51965G9l.A18(r4, A012);
            C304676Et r11 = C304676Et.A00;
            r4.ExC(-1586260815, r5.A03);
            ArrayList A1C = AnonymousClass7TE.A1C();
            AnonymousClass62P<AnonymousClass9J3> r32 = r5.A06;
            for (AnonymousClass9J3 n4r : r32) {
                A1C.add(new N4R(n4r, AnonymousClass05K.A00));
            }
            if (z) {
                A1C.add(new N4R((AnonymousClass9J3) null, AnonymousClass05K.A01));
            }
            boolean A1Z = C51967G9n.A1Z(r4, A1C, -1586256672);
            Object ECw = r4.ECw();
            if (A1Z || ECw == AnonymousClass5XT.A00) {
                ECw = new C58178Ini(A1C, 43);
                r4.FLL(ECw);
            }
            C52614GZn A003 = C52608GZh.A00(r4, C51965G9l.A0y(r2, ECw, false), 0, 54, 0);
            C60340gF r15 = C60340gF.A00;
            boolean A1Z2 = G9t.A1Z(r4, A003, r10, -1586253884);
            Object ECw2 = r4.ECw();
            if (A1Z2 || ECw2 == AnonymousClass5XT.A00) {
                ECw2 = new MH0((Object) r10, (Object) A003, (AnonymousClass4D7) null, 16);
                r4.FLL(ECw2);
            }
            C51968G9o.A1E(r4, r2, ECw2, r15);
            Object AJO = r4.AJO(AnonymousClass5YV.A00);
            boolean A1Y = G9t.A1Y(r4, r1, AJO, -1586244618);
            Object ECw3 = r4.ECw();
            if (A1Y || ECw3 == AnonymousClass5XT.A00) {
                ECw3 = J6S.A00(AJO, r1, 30);
                r4.FLL(ECw3);
            }
            C51968G9o.A1F(r4, r2, ECw3, AJO, false);
            Context A0I = C51968G9o.A0I(r4);
            IFR ifr = new IFR(0nA.A01(A0I, (float) (((double) AnonymousClass0nB.A01(A0I)) * 182.A00(0Tu.A05, userSession, 37170764399772177L))));
            Modifier A0T = C51966G9m.A0T(r9);
            IFR ifr2 = ifr;
            C286575Wy r172 = r4;
            C52608GZh.A01((C304836Fk) null, ifr2, r172, (C287245Zp) null, r11.A00(C51966G9m.A0X(A0T, C51966G9m.A0C(r4)), true), A003, J3S.A00, AnonymousClass5PI.A01(r4, new C59438JJn(r18, r17, userSession, r5, r27, r28, r29, r20, r31), -178424746), 0.0f, 100859952, 88, true);
            int size = r32.size();
            if (z) {
                size++;
            }
            AnonymousClass6F2.A02(r4, C51967G9n.A0H(A0T, 0.0f), size, r5.A00, 384, 24, 0, 0);
            if (C51971G9r.A1S(r4, r2, false)) {
                0fL.A00(874763033);
            }
        } else {
            r4.Evl();
        }
        return C60340gF.A00;
    }
}
