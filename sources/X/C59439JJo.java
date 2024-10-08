package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.JJo  reason: case insensitive filesystem */
public final class C59439JJo extends 0Yg implements 0sJ {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C299665vd A01;
    public final /* synthetic */ C299635va A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ 0sP A05;
    public final /* synthetic */ 0sP A06;
    public final /* synthetic */ 0sP A07;
    public final /* synthetic */ 0sL A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59439JJo(C299665vd r2, C299635va r3, UserSession userSession, List list, 0sP r6, 0sP r7, 0sP r8, 0sL r9, float f) {
        super(4);
        this.A04 = list;
        this.A00 = f;
        this.A07 = r6;
        this.A03 = userSession;
        this.A08 = r9;
        this.A05 = r7;
        this.A06 = r8;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        Modifier A0E;
        C305236Hb r3 = (C305236Hb) obj;
        int A0M = AnonymousClass7TE.A0M(obj2);
        C286575Wy r5 = (C286575Wy) obj3;
        int A0M2 = AnonymousClass7TE.A0M(obj4);
        if ((A0M2 & 6) == 0) {
            i = A0M2 | G9t.A0O(r5, r3);
        } else {
            i = A0M2;
        }
        if ((A0M2 & 48) == 0) {
            i |= G9t.A06(r5, A0M);
        }
        if ((i & 147) != 146 || !r5.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1248596440, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:188)");
            }
            Object obj5 = this.A04.get(A0M);
            int A022 = C51965G9l.A02(i);
            AnonymousClass9J3 r6 = (AnonymousClass9J3) obj5;
            r5.ExS(621551701);
            boolean z = false;
            float f = 0.0f;
            if (A0M == 0) {
                f = 16.0f;
            }
            Modifier modifier = Modifier.A00;
            Modifier AV3 = r3.AV3(modifier, this.A00);
            boolean z2 = r6.A04;
            if (z2) {
                A0E = C287195Zj.A0B(modifier, f, 16.0f, 0.0f, 16.0f);
            } else {
                A0E = C51967G9n.A0E(modifier, f);
            }
            Modifier Ezh = AV3.Ezh(A0E);
            r5.ExS(-811216624);
            0sP r9 = this.A07;
            boolean AGu = r5.AGu(r9);
            if ((((A022 & 896) ^ 384) > 256 && r5.AGu(r6)) || (A022 & 384) == 256) {
                z = true;
            }
            boolean z3 = AGu | z;
            Object ECw = r5.ECw();
            if (z3 || ECw == AnonymousClass5XT.A00) {
                ECw = new C58186Inq(11, r9, r6);
                r5.FLL(ECw);
            }
            C286565Wx A0G = C51965G9l.A0G(r5);
            Modifier A002 = AnonymousClass6CM.A00(C51969G9p.A0X(C304816Fi.A01(AnonymousClass6C9.A00(1.0f, C51966G9m.A0F(r5)), C287635aW.A06(Ezh, (C62320sa) ECw), AnonymousClass5ZN.A01(16.0f)), 16.0f, C51966G9m.A0A(r5)), this.A03, r6.A03, this.A05, this.A06, this.A08);
            if (!z2) {
                modifier = C51967G9n.A0H(modifier, 4.0f);
            }
            C304846Fl.A02(r5, A002.Ezh(modifier), AnonymousClass5PI.A01(r5, JG3.A00(this.A01, this.A02, r6, 30), 716899458));
            if (C51967G9n.A1a(A0G)) {
                0fL.A00(-1581251800);
            }
        } else {
            r5.Evl();
        }
        return C60340gF.A00;
    }
}
