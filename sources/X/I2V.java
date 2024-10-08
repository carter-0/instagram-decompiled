package X;

import androidx.compose.ui.Modifier;

public abstract class I2V {
    public static final void A02(C286575Wy r37, C53259Gl7 gl7, 0sP r39, float f, int i, boolean z) {
        int i2;
        0sP r36 = r39;
        0qQ.A0B(r36, 2);
        C286575Wy r7 = r37;
        r7.ExV(409453863);
        int i3 = i;
        C53259Gl7 gl72 = gl7;
        if ((i & 14) == 0) {
            i2 = G9t.A0O(r7, gl72) | i;
        } else {
            i2 = i3;
        }
        float f2 = f;
        if ((i & 112) == 0) {
            i2 |= G9t.A00(r7, f2);
        }
        if ((i3 & 896) == 0) {
            i2 |= G9t.A0G(r7, r36);
        }
        boolean z2 = z;
        if ((i3 & 7168) == 0) {
            i2 |= G9t.A0b(r7, z2);
        }
        if ((i2 & 5851) != 1170 || !r7.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1694282662, "com.instagram.comments.mvvm.view.compose.composer.EmojiSelectionItem (EmojiSelectionItem.kt:58)");
            }
            Object A0m = C51967G9n.A0m(r7, 837829217);
            Object obj = AnonymousClass5XT.A00;
            boolean z3 = false;
            C284945Oz r8 = (C284945Oz) C51974G9v.A0Z(r7, A0m, obj, false);
            C286565Wx A0H = C51965G9l.A0H(r7, false);
            C284945Oz A0J = C51965G9l.A0J(A0H, C51974G9v.A0X(r7, obj, 837830881, false), false);
            float f3 = f / 48.0f;
            if (!C51971G9r.A1W(A0J)) {
                f3 = 1.0f;
            }
            C270284gU A03 = I69.A03(r7, f3);
            C270284gU A032 = I69.A03(r7, C51971G9r.A00(C51971G9r.A1W(r8) ? 1 : 0));
            AnonymousClass2DN A00 = 1zC.A00(r7, gl72.A00);
            C285245Qk r12 = Modifier.A00;
            Modifier A0C = C287205Zk.A0C(r12, f2);
            float A033 = C51971G9r.A03(A03);
            Modifier A002 = HRI.A00(A0C, A033, A033);
            boolean A1Q = C51973G9u.A1Q(r7, 837854717, i2);
            Object ECw = r7.ECw();
            if (A1Q || ECw == obj) {
                ECw = GA1.A00(r7, r8, 17, z2);
            }
            C286565Wx.A0L(A0H, false);
            r7.ExS(837852356);
            int i4 = i2 & 896;
            int i5 = i4;
            boolean A1S = AnonymousClass7TF.A1S(i4, 256);
            int i6 = i2 & 14;
            if (i6 == 4) {
                z3 = true;
            }
            boolean z4 = A1S | z3;
            Object ECw2 = r7.ECw();
            if (z4 || ECw2 == obj) {
                ECw2 = new C58188Ins(19, gl72, r36);
                r7.FLL(ECw2);
            }
            C286565Wx.A0L(A0H, false);
            Object A0m2 = C51967G9n.A0m(r7, 837859825);
            if (A0m2 == obj) {
                A0m2 = C58680Ivp.A00(r7, A0J, 13);
            }
            C286565Wx.A0L(A0H, false);
            Object A0m3 = C51967G9n.A0m(r7, 837861618);
            if (A0m3 == obj) {
                A0m3 = new C58680Ivp(A0J, 14);
                r7.FLL(A0m3);
            }
            C286565Wx.A0L(A0H, false);
            AnonymousClass7TF.A1H(A002, ECw);
            AnonymousClass7TF.A1C(ECw2, 2, A0m2);
            0qQ.A0B(A0m3, 4);
            AnonymousClass6G3.A07(r7, A002.Ezh(C304916Fs.A00(r12, C60340gF.A00, new C59703JUk(A0m2, ECw, A0m3, ECw2, (AnonymousClass4D7) null, 24))), A00, 1572920, 56);
            if (z && C51971G9r.A03(A032) > 0.0f) {
                Object A0m4 = C51967G9n.A0m(r7, 837867763);
                if (A0m4 == obj) {
                    A0m4 = C58680Ivp.A00(r7, r8, 15);
                }
                A00(r7, gl72, C51965G9l.A0y(A0H, A0m4, false), r36, C51971G9r.A03(A032), 48 | i6 | i5);
                float f4 = IH8.A03;
                IH8 ih8 = new IH8(C51970G9q.A0a(r7), HMB.DOWN_CENTER);
                Object A0m5 = C51967G9n.A0m(r7, 837884243);
                if (A0m5 == obj) {
                    A0m5 = C58680Ivp.A00(r7, r8, 16);
                }
                I5L.A01(r7, ih8, (C56020HrS) null, C51965G9l.A0y(A0H, A0m5, false), JG1.A00(r7, r8, A032, 12, 1329369376), 3120, 4);
            }
            if (0fL.A02()) {
                0fL.A00(-630400947);
            }
        } else {
            r7.Evl();
        }
        C286625Xd ASQ = r7.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59118J7a(gl72, r36, f2, i3, z2);
        }
    }

    public static final void A00(C286575Wy r14, C53259Gl7 gl7, C62320sa r16, 0sP r17, float f, int i) {
        int i2;
        C286575Wy r3 = r14;
        r14.ExV(-2020593489);
        int i3 = i;
        C53259Gl7 gl72 = gl7;
        if ((i & 14) == 0) {
            i2 = G9t.A0O(r14, gl7) | i;
        } else {
            i2 = i3;
        }
        C62320sa r6 = r16;
        if ((i & 112) == 0) {
            i2 |= G9t.A0F(r14, r6);
        }
        0sP r11 = r17;
        if ((i3 & 896) == 0) {
            i2 |= G9t.A0G(r14, r11);
        }
        float f2 = f;
        if ((i3 & 7168) == 0) {
            i2 |= G9t.A02(r14, f2);
        }
        if ((i2 & 5851) != 1170 || !r14.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1823676248, "com.instagram.comments.mvvm.view.compose.composer.EmojiSkinTonePopup (EmojiSelectionItem.kt:124)");
            }
            float f3 = IH8.A03;
            I5L.A01(r3, new IH8(C51970G9q.A0a(r14), HMB.DOWN_CENTER), (C56020HrS) null, r6, AnonymousClass5PI.A01(r3, new C59133J7p(r11, r16, gl72, f, 0), -1795065519), (i2 & 112) | 3072, 4);
            if (0fL.A02()) {
                0fL.A00(-333351016);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r3.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J8T(r6, gl72, r11, f2, i3, 0);
        }
    }

    public static final void A01(C286575Wy r15, C53259Gl7 gl7, C62320sa r17, 0sP r18, float f, int i) {
        int i2;
        C286575Wy r8 = r15;
        r15.ExV(-2012111836);
        int i3 = i;
        C53259Gl7 gl72 = gl7;
        if ((i & 14) == 0) {
            i2 = G9t.A0O(r15, gl72) | i;
        } else {
            i2 = i3;
        }
        float f2 = f;
        if ((i & 112) == 0) {
            i2 |= G9t.A00(r15, f2);
        }
        0sP r4 = r18;
        if ((i3 & 896) == 0) {
            i2 |= G9t.A0G(r15, r4);
        }
        C62320sa r5 = r17;
        if ((i3 & 7168) == 0) {
            i2 |= G9t.A0H(r15, r5);
        }
        if ((i2 & 5851) != 1170 || !r15.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-2086936151, "com.instagram.comments.mvvm.view.compose.composer.EmojiSkinTonePopupSelectionItem (EmojiSelectionItem.kt:174)");
            }
            AnonymousClass2DN A00 = 1zC.A00(r8, gl72.A00);
            Modifier A0C = C287205Zk.A0C(Modifier.A00, f2);
            Object A0m = C51967G9n.A0m(r8, -230336823);
            Object obj = AnonymousClass5XT.A00;
            C287605aT r13 = (C287605aT) C51972G9s.A0l(r8, A0m, obj);
            C286565Wx A0H = C51965G9l.A0H(r8, false);
            r8.ExS(-230334547);
            boolean A1S = AnonymousClass7TF.A1S(i2 & 896, 256) | C51973G9u.A1G(i2) | C51975G9x.A1P(i2);
            Object ECw = r8.ECw();
            if (A1S || ECw == obj) {
                ECw = new C41567AwZ(2, gl72, r4, r5);
                r8.FLL(ECw);
            }
            AnonymousClass6G3.A07(r8, C288255bc.A00(r13, A0C, (C287625aV) null, (String) null, (C62320sa) null, (C62320sa) null, C51965G9l.A0y(A0H, ECw, false), true), A00, 1572920, 56);
            if (0fL.A02()) {
                0fL.A00(971435407);
            }
        } else {
            r15.Evl();
        }
        C286625Xd ASQ = r8.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J8T(r5, gl72, r4, f2, i3, 1);
        }
    }
}
