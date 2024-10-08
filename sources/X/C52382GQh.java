package X;

/* renamed from: X.GQh  reason: case insensitive filesystem */
public abstract class C52382GQh {
    public static final C52397GQw A00(GQC gqc, C286575Wy r14, C62320sa r15, float f, int i, int i2, boolean z) {
        GQC gqc2 = gqc;
        float f2 = f;
        0qQ.A0B(r15, 1);
        r14.ExS(1025810032);
        if ((i2 & 4) != 0) {
            f2 = 80.0f;
        }
        float f3 = 0.0f;
        if ((i2 & 8) != 0) {
            f3 = 56.0f;
        }
        if ((i2 & 16) != 0) {
            gqc2 = GQC.A00(300, 0);
        }
        if (0fL.A02()) {
            0fL.A01(1638028379, "com.instagram.compose.ui.pulltorefresh.rememberPullRefreshState (PullRefreshState.kt:61)");
        }
        boolean z2 = true;
        if (Float.compare(f2, 0.0f) > 0) {
            Object ECw = r14.ECw();
            Object obj = AnonymousClass5XT.A00;
            C262224Cq r11 = ((AnonymousClass6FV) C51974G9v.A0Y(r14, ECw, obj)).A00;
            C284945Oz A00 = C287175Zh.A00(r14, r15);
            C268024cd A0Y = C51968G9o.A0Y(r14);
            float F06 = A0Y.F06(f2);
            float F062 = A0Y.F06(f3);
            boolean A1Y = C51967G9n.A1Y(r14, r11, 1298277815);
            Object ECw2 = r14.ECw();
            if (A1Y || ECw2 == obj) {
                ECw2 = new C52397GQw(gqc2, A00, r11, F062, F06);
                r14.FLL(ECw2);
            }
            C52397GQw gQw = (C52397GQw) ECw2;
            C286565Wx A0H = C51965G9l.A0H(r14, false);
            Object AJO = r14.AJO(C304946Fv.A00);
            r14.ExS(1298286132);
            if (AJO != null) {
                boolean A1Y2 = G9t.A1Y(r14, gQw, AJO, 1298287678);
                Object ECw3 = r14.ECw();
                if (A1Y2 || ECw3 == obj) {
                    ECw3 = new C59819JZr((Object) gQw, AJO, (AnonymousClass4D7) null, 23);
                    r14.FLL(ECw3);
                }
                C51968G9o.A1E(r14, A0H, ECw3, gQw);
            }
            C286565Wx.A0L(A0H, false);
            r14.ExS(1298311527);
            C286565Wx.A0L(A0H, false);
            boolean A1Y3 = C51967G9n.A1Y(r14, gQw, 1298323635);
            boolean z3 = z;
            if ((((i & 14) ^ 6) <= 4 || !r14.AGv(z3)) && (i & 6) != 4) {
                z2 = false;
            }
            boolean z4 = A1Y3 | z2;
            Object ECw4 = r14.ECw();
            if (z4 || ECw4 == obj) {
                ECw4 = GA1.A00(r14, gQw, 19, z3);
            }
            C286645Xf.A05(r14, C51965G9l.A0y(A0H, ECw4, false));
            if (0fL.A02()) {
                0fL.A00(636028625);
            }
            C286565Wx.A0L(A0H, false);
            return gQw;
        }
        throw AnonymousClass7TE.A0w("The refresh trigger must be greater than zero!");
    }
}
