package X;

/* renamed from: X.6Hx  reason: invalid class name and case insensitive filesystem */
public abstract class C305416Hx {
    public static final void A00(C286575Wy r11, 0sK r12, int i) {
        int i2;
        C286575Wy r6 = r11;
        r11.ExV(674185128);
        if ((i & 6) == 0) {
            int i3 = 2;
            if (r11.AGw(r12)) {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !r11.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(839529685, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider (LazySaveableStateHolder.kt:41)");
            }
            C267314bM r2 = AnonymousClass5YX.A00;
            Object A01 = C286615Xc.A01(r2, C286565Wx.A04((C286565Wx) r6));
            Object[] objArr = {A01};
            C286005To r7 = new C286005To(new J6G(A01, 41), C305426Hy.A00);
            boolean AGw = r11.AGw(A01);
            Object ECw = r11.ECw();
            if (AGw || ECw == AnonymousClass5XT.A00) {
                ECw = new AnonymousClass9L8(A01, 11);
                r11.FLL(ECw);
            }
            Object A00 = C305136Gr.A00(r6, r7, (C62320sa) ECw, objArr, 0, 4);
            C286715Xm.A00(r6, r2.A02(A00), AnonymousClass5PI.A01(r6, new C377449Lw(1, r12, A00), 1863926504), 56);
            if (0fL.A02()) {
                0fL.A00(-1586922590);
            }
        } else {
            r11.Evl();
        }
        C286625Xd ASQ = r6.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JGC(r12, i, 3);
        }
    }
}
