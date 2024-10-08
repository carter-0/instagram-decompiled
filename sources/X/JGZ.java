package X;

import androidx.compose.ui.Modifier;

public final class JGZ extends 0Yg implements 0sK {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C62320sa A01;
    public final /* synthetic */ boolean A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JGZ(C62320sa r2, int i, boolean z) {
        super(3);
        this.A00 = i;
        this.A02 = z;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C286575Wy r10 = (C286575Wy) obj2;
        int A0M = AnonymousClass7TE.A0M(obj3);
        0qQ.A0B(obj, 0);
        if ((A0M & 17) != 16 || !r10.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-495165616, "com.instagram.aistudio.editor.sectionHeaderItems.<anonymous> (AiKnowledgeScreen.kt:151)");
            }
            C285245Qk r1 = Modifier.A00;
            Modifier A0B = C287195Zj.A0B(C51966G9m.A0T(r1), 16.0f, 16.0f, 16.0f, 0.0f);
            int i = this.A00;
            boolean z = this.A02;
            C62320sa r5 = this.A01;
            AnonymousClass5RD A0V = C51968G9o.A0V(r10);
            int A002 = C287425a7.A00(r10);
            C286565Wx r4 = (C286565Wx) r10;
            AnonymousClass5RM A04 = C286565Wx.A04(r4);
            Modifier A012 = C287435a8.A01(r10, A0B);
            C51973G9u.A0y(r10, r4);
            C51971G9r.A12(r10, A0V, A04);
            0sL r2 = C287485aD.A02;
            if (r4.A0K || !C51972G9s.A1Q(r10, A002)) {
                C51971G9r.A13(r10, r2, A002);
            }
            C51965G9l.A18(r10, A012);
            AnonymousClass6FX r0 = AnonymousClass6FX.A00;
            String A003 = C288035bG.A00(r10, i);
            AnonymousClass5ZZ.A0Q(r10, r0.A00(r1), C51965G9l.A0S(r10), A003, C51966G9m.A0H(r10));
            String A004 = C288035bG.A00(r10, 2131952258);
            Modifier A005 = HRF.A00(r1, C51970G9q.A00(z ? 1 : 0));
            boolean A1W = G9t.A1W(r10, r5, -674779336, z);
            Object ECw = r10.ECw();
            if (A1W || ECw == AnonymousClass5XT.A00) {
                ECw = GA1.A00(r10, r5, 8, z);
            }
            AnonymousClass5ZZ.A0Q(r10, C287635aW.A05(A005, (C287625aV) null, (String) null, C51965G9l.A0y(r4, ECw, false), true), C51965G9l.A0S(r10), A004, C51966G9m.A0D(r10));
            if (C51967G9n.A1R(r10)) {
                0fL.A00(-1732117106);
            }
        } else {
            r10.Evl();
        }
        return C60340gF.A00;
    }
}
