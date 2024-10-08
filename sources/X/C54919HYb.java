package X;

import androidx.compose.ui.Modifier;
import com.google.common.collect.ImmutableList;

/* renamed from: X.HYb  reason: case insensitive filesystem */
public abstract class C54919HYb {
    public static final void A00(C286575Wy r19, ImmutableList immutableList, C53390GnN gnN, C55473HiH hiH, 0sP r23, int i) {
        int i2;
        0sP r2 = r23;
        0qQ.A0B(r2, 0);
        ImmutableList immutableList2 = immutableList;
        C53390GnN gnN2 = gnN;
        C55473HiH hiH2 = hiH;
        DbZ.A0t(1, hiH2, immutableList2, gnN2);
        C286575Wy r6 = r19;
        r6.ExV(-1296261718);
        int i3 = i;
        if ((i & 14) == 0) {
            i2 = C41848B3p.A01(r6, r2) | i;
        } else {
            i2 = i3;
        }
        if ((i & 112) == 0) {
            i2 |= G9t.A0P(r6, hiH2);
        }
        if ((i3 & 896) == 0) {
            i2 |= G9t.A0Q(r6, immutableList2);
        }
        if ((i3 & 7168) == 0) {
            i2 |= G9t.A0R(r6, gnN2);
        }
        if ((i2 & 5851) != 1170 || !r6.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1550147156, "com.instagram.creation.genai.themes.ui.AiThemesImagePickerContent (AiThemesImagePickerContent.kt:35)");
            }
            Object A0m = C51967G9n.A0m(r6, 943849177);
            Object obj = AnonymousClass5XT.A00;
            if (A0m == obj) {
                A0m = G9t.A0o(r6, Float.valueOf(0.5625f));
            }
            C286565Wx A0H = C51965G9l.A0H(r6, false);
            Modifier A02 = C287195Zj.A02(C51970G9q.A0W(C51968G9o.A0O(), new C59102J6k(26, (Object) gnN2, A0m)));
            IFU ifu = new IFU(24.0f);
            Modifier A0X = C51966G9m.A0X(AnonymousClass6FZ.A01(A02, new AnonymousClass5ZR(ifu, ifu, ifu, ifu)), C285595Rx.A02(AnonymousClass5RX.A0K[(int) (C51966G9m.A0A(r6) & 63)], AnonymousClass5RW.A03(C51966G9m.A0A(r6)), AnonymousClass5RW.A02(C51966G9m.A0A(r6)), AnonymousClass5RW.A01(C51966G9m.A0A(r6)), 0.0f));
            r6.ExT(-270267587);
            Object A0f = G9w.A0f(r6, -3687241);
            if (A0f == obj) {
                A0f = new Sd5();
                r6.FLL(A0f);
            }
            C286565Wx.A0L(A0H, false);
            Sd5 sd5 = (Sd5) A0f;
            Object A0f2 = G9w.A0f(r6, -3687241);
            if (A0f2 == obj) {
                A0f2 = new C55961HqS();
                r6.FLL(A0f2);
            }
            C286565Wx.A0L(A0H, false);
            C55961HqS hqS = (C55961HqS) A0f2;
            Object A0Z = C51974G9v.A0Z(r6, G9w.A0f(r6, -3687241), obj, false);
            C286565Wx.A0L(A0H, false);
            0eP A00 = C56174Hu3.A00(r6, (C284945Oz) A0Z, hqS, sd5);
            int i4 = i2;
            Object obj2 = A00.A01;
            Object obj3 = A0m;
            C53390GnN gnN3 = gnN2;
            C286575Wy r192 = r6;
            AnonymousClass5RD r21 = (AnonymousClass5RD) A00.A00;
            HRV.A00(r192, AnonymousClass5R5.A00(A0X, new MP4(sd5, 31), false), r21, AnonymousClass5PI.A00(r6, new JBE(obj3, gnN3, hqS, hiH2, obj2, r2, immutableList2, 0, i4, 1)), 48, 0);
            if (C51967G9n.A1b(A0H, false)) {
                0fL.A00(-1658957752);
            }
        } else {
            r6.Evl();
        }
        C286625Xd ASQ = r6.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG7(gnN2, r2, immutableList2, hiH2, i3, 9);
        }
    }
}
