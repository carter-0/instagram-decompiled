package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.Hve  reason: case insensitive filesystem */
public abstract class C56270Hve {
    public static final void A01(C286575Wy r24, C54649HMg hMg, 0sP r26, int i) {
        int i2;
        C54649HMg hMg2 = hMg;
        0sP r3 = r26;
        AnonymousClass7TF.A1H(hMg2, r3);
        C286575Wy r14 = r24;
        r14.ExV(-2011027742);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r14, hMg2) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r14, r3);
        }
        if ((i2 & 19) != 18 || !r14.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1991568963, "com.instagram.creation.drafts.ui.DraftActionBar (DraftActionBar.kt:34)");
            }
            Object A0m = C51967G9n.A0m(r14, 722368898);
            Object obj = AnonymousClass5XT.A00;
            C284945Oz r6 = (C284945Oz) C51974G9v.A0Z(r14, A0m, obj, false);
            C286565Wx A0H = C51965G9l.A0H(r14, false);
            C285245Qk r9 = Modifier.A00;
            Modifier A0T = C51966G9m.A0T(r9);
            AnonymousClass5RD A0Z = C51969G9p.A0Z(r14, 0);
            int A00 = C287425a7.A00(r14);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A01 = C287435a8.A01(r14, A0T);
            C51973G9u.A0y(r14, A0H);
            C51971G9r.A12(r14, A0Z, A04);
            0sL r8 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r14, A00)) {
                C51971G9r.A13(r14, r8, A00);
            }
            C51965G9l.A18(r14, A01);
            C304676Et r21 = C304676Et.A00;
            C52738Gbq gbq = new C52738Gbq((C62320sa) null, 7, 0);
            String A002 = C288035bG.A00(r14, 2131961037);
            Modifier A0p = G9t.A0p(r14, r9);
            AnonymousClass2DO A003 = C287975bA.A00(r14, R.drawable.instagram_settings_pano_filled_24, 0);
            Object A0m2 = C51967G9n.A0m(r14, 1246809145);
            if (A0m2 == obj) {
                A0m2 = new MMQ(r6, 42);
                r14.FLL(A0m2);
            }
            C52739Gbr.A02(r14, A0p, gbq, A002, C53515Gpl.A00(A0H, A003, A0m2, (String) null), 6, 24);
            boolean A1W = C51971G9r.A1W(r6);
            Object A0m3 = C51967G9n.A0m(r14, 1246815418);
            if (A0m3 == obj) {
                A0m3 = new MMQ(r6, 43);
                r14.FLL(A0m3);
            }
            A00(r21, r14, hMg2, C51965G9l.A0y(A0H, A0m3, false), r3, 3078 | ((i2 << 3) & 112) | ((i2 << 9) & 57344), A1W);
            if (C51967G9n.A1R(r14)) {
                0fL.A00(-709190658);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r14.ASQ();
        if (ASQ != null) {
            JGL.A01(ASQ, r3, hMg2, i3, 37);
        }
    }

    public static final void A00(C304686Eu r19, C286575Wy r20, C54649HMg hMg, C62320sa r22, 0sP r23, int i, boolean z) {
        int i2;
        C286575Wy r14 = r20;
        r14.ExV(109376145);
        int i3 = i;
        C304686Eu r7 = r19;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r14, r7) | i;
        } else {
            i2 = i3;
        }
        C54649HMg hMg2 = hMg;
        if ((i & 48) == 0) {
            i2 |= G9t.A0P(r14, hMg2);
        }
        boolean z2 = z;
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0a(r14, z2);
        }
        C62320sa r5 = r22;
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A0H(r14, r5);
        }
        0sP r4 = r23;
        if ((i3 & 24576) == 0) {
            i2 |= G9t.A0I(r14, r4);
        }
        if ((i2 & 9363) != 9362 || !r14.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-421383554, "com.instagram.creation.drafts.ui.DraftFilterContextMenu (DraftActionBar.kt:64)");
            }
            boolean z3 = false;
            List A1P = 0sr.A1P(new C54649HMg[]{C54649HMg.ALL, C54649HMg.PHOTO, C54649HMg.VIDEO, C54649HMg.CAROUSEL});
            Modifier A0I = G9w.A0I(r7.AB0(C287215Zl.A01, Modifier.A00), 16.0f);
            boolean A1Q = C51973G9u.A1Q(r14, -1652744591, i2);
            if ((57344 & i2) == 16384) {
                z3 = true;
            }
            boolean z4 = z3 | A1Q;
            Object ECw = r14.ECw();
            if (z4 || ECw == AnonymousClass5XT.A00) {
                ECw = J6W.A00(r14, A1P, r5, r4, 25);
            }
            boolean A1Y = C51968G9o.A1Y(r14);
            C56261HvV.A00((C56838IEj) null, r14, A0I, (HL4) null, r5, (0sP) ECw, new JG1(35, hMg2, A1P), ((i2 >> 3) & 896) | ((i2 << 3) & 7168), 240, 0, z2, A1Y);
            if (0fL.A02()) {
                0fL.A00(1950015201);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r14.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J9G(i3, 1, r7, hMg2, r5, r4, z2);
        }
    }
}
