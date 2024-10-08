package X;

import androidx.compose.ui.Modifier;

public final class JGR extends 0Yg implements 0sK {
    public final /* synthetic */ LAC A00;
    public final /* synthetic */ C62320sa A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JGR(LAC lac, C62320sa r3) {
        super(3);
        this.A01 = r3;
        this.A00 = lac;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C286575Wy A0R = C51966G9m.A0R(obj2, obj3);
        if (C51967G9n.A1U(A0R, -1792953471)) {
            0fL.A01(1866927362, "com.instagram.barcelona.feed.mediaviewer.ui.transformable.<anonymous> (Transformable150.kt:81)");
        }
        C284945Oz A002 = C287175Zh.A00(A0R, AnonymousClass7TE.A0u());
        C284945Oz A003 = C287175Zh.A00(A0R, this.A01);
        Object A0m = C51967G9n.A0m(A0R, -15255223);
        Object obj4 = AnonymousClass5XT.A00;
        if (A0m == obj4) {
            A0m = G9w.A0w();
            A0R.FLL(A0m);
        }
        C249513ju r8 = (C249513ju) A0m;
        C286565Wx A0G = C51965G9l.A0G(A0R);
        A0R.ExS(-15252019);
        LAC lac = this.A00;
        boolean A1S = C51973G9u.A1S(A0R, r8, lac, -15250512);
        Object ECw = A0R.ECw();
        if (A1S || ECw == obj4) {
            ECw = new C59703JUk(lac, (AnonymousClass4D7) null, r8);
            A0R.FLL(ECw);
        }
        C286565Wx.A0I(A0G);
        C286645Xf.A04(A0R, lac, (0sL) ECw);
        C286565Wx.A0I(A0G);
        Object A0m2 = C51967G9n.A0m(A0R, -15224600);
        if (A0m2 == obj4) {
            A0m2 = new MHG((Object) A002, (Object) r8, (Object) A003, (AnonymousClass4D7) null, 21);
            A0R.FLL(A0m2);
        }
        C286565Wx.A0I(A0G);
        Modifier A004 = C304916Fs.A00(Modifier.A00, r8, (0sL) A0m2);
        if (0fL.A02()) {
            0fL.A00(55378045);
        }
        C286565Wx.A0I(A0G);
        return A004;
    }
}
