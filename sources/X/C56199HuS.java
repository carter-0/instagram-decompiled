package X;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.DalvikConstants;

/* renamed from: X.HuS  reason: case insensitive filesystem */
public abstract class C56199HuS {
    public static final void A00(C286575Wy r53, String str, C62320sa r55, C62320sa r56, C62320sa r57, C62320sa r58, 0sP r59, 0sP r60, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4) {
        int i4;
        int i5;
        String str2 = str;
        0sP r31 = r59;
        boolean A1U = AnonymousClass7TF.A1U(0, str2, r31);
        0sP r32 = r60;
        0qQ.A0B(r32, 4);
        C62320sa r52 = r55;
        C62320sa r51 = r56;
        C62320sa r50 = r57;
        C51974G9v.A1N(r52, r51, r50);
        C62320sa r34 = r58;
        0qQ.A0B(r34, 8);
        C286575Wy r0 = r53;
        r0.ExV(-1172898330);
        int i6 = i2;
        if ((i2 & 6) == 0) {
            i4 = G9t.A0O(r0, str2) | i2;
        } else {
            i4 = i6;
        }
        int i7 = 32;
        if ((i2 & 48) == 0) {
            i4 |= G9t.A0F(r0, r31);
        }
        boolean z5 = z;
        if ((i6 & 384) == 0) {
            i4 |= G9t.A0a(r0, z5);
        }
        boolean z6 = z2;
        if ((i6 & 3072) == 0) {
            i4 |= G9t.A0b(r0, z6);
        }
        if ((i6 & 24576) == 0) {
            i4 |= G9t.A0I(r0, r32);
        }
        if ((196608 & i2) == 0) {
            i4 |= G9t.A0J(r0, r52);
        }
        if ((1572864 & i2) == 0) {
            i4 |= G9t.A0K(r0, r51);
        }
        if ((12582912 & i2) == 0) {
            i4 |= G9t.A0L(r0, r50);
        }
        if ((100663296 & i2) == 0) {
            i4 |= G9t.A0M(r0, r34);
        }
        int i8 = i;
        if ((805306368 & i2) == 0) {
            int i9 = 268435456;
            if (r0.AGs(i8)) {
                i9 = 536870912;
            }
            i4 |= i9;
        }
        int i10 = i3;
        boolean z7 = z4;
        if ((i3 & 48) == 0) {
            if (!r0.AGv(z7)) {
                i7 = 16;
            }
            i5 = i3 | i7;
        } else {
            i5 = i10;
        }
        if ((i4 & 306783379) == 306783378 && (i5 & 17) == 16 && r0.Bwn()) {
            r0.Evl();
        } else {
            if (0fL.A02()) {
                0fL.A01(-565253229, "com.instagram.aistudio.editor.AiEditInstructionScreen (AiEditInstructionScreen.kt:46)");
            }
            r0.ExS(-34575751);
            if (z4) {
                Boolean valueOf = Boolean.valueOf(z6);
                r0.ExS(-34573802);
                boolean A1W = C51974G9v.A1W(i4) | C51973G9u.A1J(i4);
                Object ECw = r0.ECw();
                if (A1W || ECw == AnonymousClass5XT.A00) {
                    ECw = new MG9(r32, (AnonymousClass4D7) null, 3, z6);
                    r0.FLL(ECw);
                }
                C51972G9s.A0z(r0, ECw, valueOf);
            }
            C286565Wx A0H = C51965G9l.A0H(r0, false);
            C56838IEj A00 = I28.A00(r0);
            Object A0m = C51967G9n.A0m(r0, -34569872);
            Object obj = AnonymousClass5XT.A00;
            C284945Oz A0J = C51965G9l.A0J(A0H, C51974G9v.A0Z(r0, A0m, obj, false), false);
            Object AJO = r0.AJO(AnonymousClass5YA.A0A);
            C285245Qk r18 = Modifier.A00;
            Modifier A0T = C51966G9m.A0T(r18);
            FillElement fillElement = C287205Zk.A00;
            Modifier A01 = I28.A01(A00, JJP.A00(A0T.Ezh(fillElement), C287655aY.A00, 0));
            boolean A1Y = C51967G9n.A1Y(r0, AJO, -34559316);
            Object ECw2 = r0.ECw();
            if (A1Y || ECw2 == obj) {
                ECw2 = new MMM(AJO, 34);
                r0.FLL(ECw2);
            }
            Modifier A05 = C287635aW.A05(A01, (C287625aV) null, (String) null, C51965G9l.A0y(A0H, ECw2, false), z7);
            C287325Zx r9 = C287275Zs.A07;
            C287265Zr r8 = C287215Zl.A02;
            AnonymousClass5RD A02 = C291495hO.A02(r9, r0, r8, 0);
            int A002 = C287425a7.A00(r0);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A012 = C287435a8.A01(r0, A05);
            C62320sa r13 = C287485aD.A00;
            C51973G9u.A0z(r0, A0H, r13);
            0sL r11 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r0, A02, A04, r11);
            0sL r10 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r0, A002)) {
                C51971G9r.A13(r0, r10, A002);
            }
            0sL A1K = C51966G9m.A1K(r0, A012);
            C56200HuT.A00(r0, (i5 & 112) | 384, A1U ? 1 : 0, false, z7, false);
            Modifier A09 = C287195Zj.A09(A0T.Ezh(fillElement), 0.0f, 16.0f);
            AnonymousClass5RD A022 = C291495hO.A02(r9, r0, r8, 0);
            int A003 = C287425a7.A00(r0);
            AnonymousClass5RM A042 = C286565Wx.A04(A0H);
            Modifier A013 = C287435a8.A01(r0, A09);
            C51973G9u.A0z(r0, A0H, r13);
            C287595aO.A00(r0, A022, r11);
            if (C51965G9l.A1Y(r0, A0H, A042, A0w) || !C51972G9s.A1Q(r0, A003)) {
                C51971G9r.A13(r0, r10, A003);
            }
            C287595aO.A00(r0, A013, A1K);
            String A004 = C288035bG.A00(r0, 2131952757);
            C286575Wy r82 = r0;
            AnonymousClass5ZZ.A0W(r82, C287195Zj.A0B(A0T, 16.0f, 0.0f, 16.0f, 14.0f), C51966G9m.A0c(r0), A004, C51966G9m.A0M(r0));
            C286575Wy r36 = r0;
            I7P.A04(r36, C287195Zj.A0B(r18, 0.0f, 0.0f, 0.0f, 16.0f), (C59485JLj) null, Boolean.valueOf(A1U), Integer.valueOf(i8), str2, C288035bG.A00(r0, 2131952774), r31, 4, 4, (i4 & 14) | 1772544 | (i4 & 112), ((i4 >> 21) & 896) | 48, 59280);
            r0.ExS(1085183583);
            if (z) {
                String A005 = C288035bG.A00(r0, 2131952748);
                HLX hlx = HLX.Destructive;
                r0.ExS(1085190204);
                boolean A1O = C51975G9x.A1O(i4);
                Object ECw3 = r0.ECw();
                if (A1O || ECw3 == obj) {
                    ECw3 = new MMV(31, r52, A0J);
                    r0.FLL(ECw3);
                }
                HXR.A00(r0, (Modifier) null, hlx, A005, C51965G9l.A0y(A0H, ECw3, false), 3072, 20, false);
            }
            C51970G9q.A13(r0, A0H);
            if (C51971G9r.A1W(A0J)) {
                r51.invoke();
                Object A0m2 = C51967G9n.A0m(r0, -34513293);
                if (A0m2 == obj) {
                    A0m2 = new MMM(A0J, 35);
                    r0.FLL(A0m2);
                }
                C62320sa A0y = C51965G9l.A0y(A0H, A0m2, false);
                r0.ExS(-34510998);
                boolean A1S = AnonymousClass7TF.A1S(i4 & 29360128, DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE);
                Object ECw4 = r0.ECw();
                if (A1S || ECw4 == obj) {
                    ECw4 = new MMM(r50, 36);
                    r0.FLL(ECw4);
                }
                A01(r0, A0y, C51965G9l.A0y(A0H, ECw4, false), r34, ((i4 >> 18) & 896) | 6);
            }
            if (0fL.A02()) {
                0fL.A00(1606844051);
            }
        }
        C286625Xd ASQ = r0.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JCP(str2, r52, r51, r50, r34, r31, r32, i8, i6, i10, z5, z6, z3, z7);
        }
    }

    public static final void A01(C286575Wy r18, C62320sa r19, C62320sa r20, C62320sa r21, int i) {
        int i2;
        C286575Wy r15 = r18;
        r15.ExV(-1323499950);
        int i3 = i;
        C62320sa r5 = r19;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r15, r5) | i;
        } else {
            i2 = i3;
        }
        C62320sa r4 = r20;
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r15, r4);
        }
        C62320sa r3 = r21;
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r15, r3);
        }
        if ((i2 & 147) != 146 || !r15.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-400335595, "com.instagram.aistudio.editor.ConfirmDeletionDialog (AiEditInstructionScreen.kt:106)");
            }
            r15.ExS(606891376);
            int i4 = i2 & 14;
            boolean z = true;
            boolean A1S = AnonymousClass7TF.A1S(i4, 4);
            Object ECw = r15.ECw();
            if (A1S || ECw == AnonymousClass5XT.A00) {
                ECw = new MMM(r5, 37);
                r15.FLL(ECw);
            }
            C62320sa r8 = (C62320sa) ECw;
            C286565Wx A0H = C51965G9l.A0H(r15, false);
            String A00 = C288035bG.A00(r15, 2131952749);
            C53398GnV A002 = HXM.A00(r15, AnonymousClass05K.A0C, r4, 2131957531, 12);
            boolean A1P = C51973G9u.A1P(r15, 606904632, i2);
            if (i4 != 4) {
                z = false;
            }
            boolean z2 = A1P | z;
            Object ECw2 = r15.ECw();
            if (z2 || ECw2 == AnonymousClass5XT.A00) {
                ECw2 = G9w.A0u(r15, r3, r5, 32);
            }
            C56632I5m.A03(r15, A002, HXM.A00(r15, (Integer) null, C51965G9l.A0y(A0H, ECw2, false), 2131954722, 14), A00, (String) null, r8, 0, 4068);
            if (0fL.A02()) {
                0fL.A00(1511397913);
            }
        } else {
            r15.Evl();
        }
        C286625Xd ASQ = r15.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JGN(r5, r4, r3, i3, 7);
        }
    }
}
