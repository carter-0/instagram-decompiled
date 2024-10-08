package X;

import androidx.compose.ui.Modifier;
import com.instagram.compose.core.ui.IgClickableTextKt;
import com.instagram.wonderwall.model.WallInfo;
import com.instagram.wonderwall.model.WallText;
import java.util.Iterator;

/* renamed from: X.I5y  reason: case insensitive filesystem */
public abstract class C56643I5y {
    public static final void A00(C286575Wy r15, C61065Jw3 jw3, int i) {
        int i2;
        C61065Jw3 jw32 = jw3;
        0qQ.A0B(jw32, 0);
        C286575Wy r9 = r15;
        r15.ExV(1728016383);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r15, jw32) | i;
        } else {
            i2 = i3;
        }
        if ((i2 & 3) != 2 || !r15.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1095140272, "com.instagram.wonderwall.ui.compose.components.WallPostComposerAction (WallPostEditor.kt:167)");
            }
            C285245Qk r5 = Modifier.A00;
            Modifier A0C = C287205Zk.A0C(r5, 32.0f);
            boolean A1N = C51973G9u.A1N(r15, 260172644, i2);
            Object ECw = r15.ECw();
            if (A1N || ECw == AnonymousClass5XT.A00) {
                ECw = new C20610Wvr(jw32, 45);
                r15.FLL(ECw);
            }
            C286565Wx A0H = C51965G9l.A0H(r15, false);
            Modifier A01 = C304766Fd.A01(C52638GaC.A01(r15, A0C, (C62320sa) ECw), AnonymousClass5ZN.A00, C51966G9m.A0C(r15));
            AnonymousClass5RD A0Z = C51966G9m.A0Z(false);
            int A00 = C287425a7.A00(r15);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A012 = C287435a8.A01(r15, A01);
            C51973G9u.A0y(r15, A0H);
            C51971G9r.A12(r15, A0Z, A04);
            0sL r1 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r15, A00)) {
                C51971G9r.A13(r15, r1, A00);
            }
            C51965G9l.A18(r15, A012);
            C288165bT.A06(r9, C287205Zk.A03(r5), C287975bA.A00(r15, jw32.A01, 0), (C288095bM) null, C304346Dc.A00(r15, jw32.A00), 384, 24, 0);
            if (C51967G9n.A1R(r9)) {
                0fL.A00(548792382);
            }
        } else {
            r15.Evl();
        }
        C286625Xd ASQ = r9.ASQ();
        if (ASQ != null) {
            JGE.A01(ASQ, jw32, i3, 6);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v33, resolved type: X.GDq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: X.GDq} */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x014e, code lost:
        if (r0 == r7) goto L_0x0150;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0150, code lost:
        r14 = new X.C52070GDq(r8, r16, r5, (X.AnonymousClass4D7) null, 25);
        r3.FLL(r14);
        r14 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0162, code lost:
        if (X.C51972G9s.A1S(r3, r11, r0, r9) == false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0164, code lost:
        X.0fL.A00(395539640);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C286575Wy r41, X.C53321Gm7 r42, X.0sP r43, X.0sL r44, X.0sL r45, int r46) {
        /*
            r9 = 0
            r5 = r42
            r27 = r43
            r13 = r44
            r0 = r27
            boolean r31 = X.C51973G9u.A1b(r5, r0, r13)
            r17 = 3
            r12 = r45
            r0 = r17
            X.0qQ.A0B(r12, r0)
            r0 = 190408266(0xb59664a, float:4.1869634E-32)
            r3 = r41
            r3.ExV(r0)
            r6 = r46
            r0 = r46 & 6
            if (r0 != 0) goto L_0x016c
            int r4 = X.G9t.A0O(r3, r5)
            r4 = r4 | r46
        L_0x002a:
            r0 = r46 & 48
            if (r0 != 0) goto L_0x0035
            r0 = r27
            int r0 = X.G9t.A0F(r3, r0)
            r4 = r4 | r0
        L_0x0035:
            r0 = r6 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x003e
            int r0 = X.G9t.A0G(r3, r13)
            r4 = r4 | r0
        L_0x003e:
            r0 = r6 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x0047
            int r0 = X.G9t.A0H(r3, r12)
            r4 = r4 | r0
        L_0x0047:
            r1 = r4 & 1171(0x493, float:1.641E-42)
            r0 = 1170(0x492, float:1.64E-42)
            if (r1 != r0) goto L_0x006d
            boolean r0 = r3.Bwn()
            if (r0 == 0) goto L_0x006d
            r3.Evl()
        L_0x0056:
            X.5Xd r1 = r3.ASQ()
            if (r1 == 0) goto L_0x006c
            r14 = 27
            X.JG7 r0 = new X.JG7
            r8 = r0
            r9 = r5
            r10 = r27
            r11 = r12
            r12 = r13
            r13 = r6
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r1.A06 = r0
        L_0x006c:
            return
        L_0x006d:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x007b
            r1 = 1701527102(0x656b3e3e, float:6.943152E22)
            java.lang.String r0 = "com.instagram.wonderwall.ui.compose.components.WallPostEditor (WallPostEditor.kt:62)"
            X.0fL.A01(r1, r0)
        L_0x007b:
            r0 = 827884822(0x31588516, float:3.1507787E-9)
            java.lang.Object r0 = X.C51967G9n.A0m(r3, r0)
            java.lang.Object r7 = X.AnonymousClass5XT.A00
            java.lang.Object r8 = X.C51972G9s.A0k(r3, r0, r7)
            X.I1b r8 = (X.C56547I1b) r8
            X.5Wx r11 = X.C51965G9l.A0H(r3, r9)
            X.4bM r0 = X.AnonymousClass5YA.A0A
            java.lang.Object r16 = r3.AJO(r0)
            X.5Yw r0 = X.AnonymousClass5aQ.A00(r3)
            long r1 = r0.A0b
            r0 = 827890676(0x31589bf4, float:3.1520786E-9)
            r3.ExS(r0)
            boolean r10 = r3.AGt(r1)
            java.lang.Object r0 = r3.ECw()
            if (r10 != 0) goto L_0x00ac
            if (r0 != r7) goto L_0x00b4
        L_0x00ac:
            X.IH0 r0 = new X.IH0
            r0.<init>(r1)
            r3.FLL(r0)
        L_0x00b4:
            X.JRq r0 = (X.C59648JRq) r0
            X.C286565Wx.A0L(r11, r9)
            X.5Tl r15 = r5.A00
            X.5Tq r1 = r15.A01
            java.lang.String r2 = r1.A00
            X.YBO r1 = r5.A03
            boolean r1 = X.AnonymousClass7TF.A1V(r1)
            X.5Z4 r10 = X.I6X.A00(r3, r2, r1)
            X.4bM r1 = X.C304856Fm.A00
            java.lang.Object r1 = r3.AJO(r1)
            X.5RW r1 = (X.AnonymousClass5RW) r1
            long r1 = r1.A00
            r19 = r1
            r41 = 0
            r18 = 0
            r38 = 6291454(0x5ffffe, float:8.816205E-39)
            X.5Z4 r1 = new X.5Z4
            r32 = r1
            r33 = r18
            r34 = r18
            r35 = r18
            r36 = r9
            r37 = r9
            r39 = r19
            r43 = r41
            r45 = r41
            r32.<init>(r33, r34, r35, r36, r37, r38, r39, r41, r43, r45)
            X.5Z4 r24 = r10.A0D(r1)
            long r1 = X.C51966G9m.A0H(r3)
            X.6Fe r14 = new X.6Fe
            r14.<init>(r1)
            X.5Qk r1 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r22 = X.C51970G9q.A0U(r1, r8)
            r10 = -1329170553(0xffffffffb0c67787, float:-1.4440368E-9)
            r2 = 23
            X.JGn r1 = new X.JGn
            r1.<init>(r2, r13, r5, r12)
            X.5PJ r29 = X.AnonymousClass5PI.A01(r3, r1, r10)
            r1 = 805306368(0x30000000, float:4.656613E-10)
            r32 = r4 & 112(0x70, float:1.57E-43)
            r32 = r32 | r1
            r33 = 196614(0x30006, float:2.75515E-40)
            r34 = 12760(0x31d8, float:1.788E-41)
            r19 = r18
            r20 = r18
            r28 = r18
            r30 = r17
            r35 = r9
            r21 = r3
            r23 = r14
            r25 = r15
            r26 = r0
            X.I5J.A00(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            boolean r0 = r5.A09
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)
            r0 = 827926232(0x315926d8, float:3.1599736E-9)
            boolean r2 = X.C51974G9v.A1X(r3, r0, r4)
            r0 = r16
            boolean r1 = r3.AGu(r0)
            r1 = r1 | r2
            java.lang.Object r0 = r3.ECw()
            if (r1 != 0) goto L_0x0150
            if (r0 != r7) goto L_0x015e
        L_0x0150:
            r19 = 25
            X.GDq r0 = new X.GDq
            r14 = r0
            r15 = r8
            r17 = r5
            r14.<init>(r15, r16, r17, r18, r19)
            r3.FLL(r0)
        L_0x015e:
            boolean r0 = X.C51972G9s.A1S(r3, r11, r0, r9)
            if (r0 == 0) goto L_0x0056
            r0 = 395539640(0x179374b8, float:9.529116E-25)
            X.0fL.A00(r0)
            goto L_0x0056
        L_0x016c:
            r4 = r6
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56643I5y.A01(X.5Wy, X.Gm7, X.0sP, X.0sL, X.0sL, int):void");
    }

    public static final void A03(C286575Wy r21, C53029GhK ghK, int i) {
        int i2;
        C53029GhK ghK2 = ghK;
        0qQ.A0B(ghK2, 0);
        C286575Wy r0 = r21;
        r0.ExV(1607715704);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r0, ghK2) | i;
        } else {
            i2 = i3;
        }
        if ((i2 & 3) != 2 || !r0.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(749645980, "com.instagram.wonderwall.ui.compose.components.WallPostComposerDisclosure (WallPostEditor.kt:183)");
            }
            Object A16 = C51966G9m.A16(r0);
            boolean A1Z = C51967G9n.A1Z(r0, A16, 1853038797);
            Object ECw = r0.ECw();
            if (A1Z || ECw == AnonymousClass5XT.A00) {
                ECw = new MPC(A16, 46);
                r0.FLL(ECw);
            }
            0sP r11 = (0sP) ECw;
            C286565Wx A0H = C51965G9l.A0H(r0, false);
            long A0H2 = C51966G9m.A0H(r0);
            Object A0m = C51967G9n.A0m(r0, 1853042906);
            Object obj = AnonymousClass5XT.A00;
            if (A0m == obj) {
                0qQ.A0B(r11, 1);
                C303876Bd A0b = C51969G9p.A0b();
                WallInfo wallInfo = ghK2.A02;
                int i4 = 2131976745;
                if (wallInfo.A03) {
                    i4 = 2131976744;
                }
                String username = wallInfo.A00.getUsername();
                String str = (String) r11.invoke(new WallText.Res(i4, new String[]{username}));
                int A08 = 00l.A08(str, username, 0, false);
                int A05 = C51966G9m.A05(username, A08);
                A0b.A09(str);
                if (A08 > 0) {
                    A0b.A06(new AnonymousClass5ZB((C268454dQ) null, (C291715hl) null, (C291725hm) null, AnonymousClass5ZD.A02, (C291795ht) null, 65530, A0H2, 0, 0), A08, A05);
                    A0b.A0A(AnonymousClass9NE.A01(52, 8, 53), username, A08, A05);
                }
                A0m = A0b.A02();
                r0.FLL(A0m);
            }
            C286025Tq r4 = (C286025Tq) A0m;
            C286565Wx.A0L(A0H, false);
            Modifier A09 = C287195Zj.A09(Modifier.A00, 54.0f, 16.0f);
            AnonymousClass5Z4 A0f = C51966G9m.A0f(r0);
            long A0M = C51966G9m.A0M(r0);
            boolean A1N = C51973G9u.A1N(r0, 1853057918, i2);
            Object ECw2 = r0.ECw();
            if (A1N || ECw2 == obj) {
                ECw2 = new J6T(22, (Object) r4, (Object) ghK2);
                r0.FLL(ECw2);
            }
            IgClickableTextKt.A02(r0, A09, r4, A0f, C51965G9l.A0z(A0H, ECw2), 3, 6, 0, 112568, A0M);
            if (0fL.A02()) {
                0fL.A00(-319688006);
            }
        } else {
            r0.Evl();
        }
        C286625Xd ASQ = r0.ASQ();
        if (ASQ != null) {
            JGE.A01(ASQ, ghK2, i3, 8);
        }
    }

    public static final void A04(AnonymousClass62P r7, C286575Wy r8, int i) {
        int i2;
        0qQ.A0B(r7, 0);
        r8.ExV(1191055602);
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r8, r7) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !r8.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-526353071, "com.instagram.wonderwall.ui.compose.components.WallPostComposerActions (WallPostEditor.kt:151)");
            }
            if (AnonymousClass7TE.A1b(r7)) {
                C285245Qk r5 = Modifier.A00;
                AnonymousClass5RD A0V = C51968G9o.A0V(r8);
                int A00 = C287425a7.A00(r8);
                C286565Wx r4 = (C286565Wx) r8;
                AnonymousClass5RM A04 = C286565Wx.A04(r4);
                Modifier A01 = C287435a8.A01(r8, r5);
                C51973G9u.A0y(r8, r4);
                C51971G9r.A12(r8, A0V, A04);
                0sL r1 = C287485aD.A02;
                if (r4.A0K || !C51972G9s.A1Q(r8, A00)) {
                    C51971G9r.A13(r8, r1, A00);
                }
                C51965G9l.A18(r8, A01);
                Iterator A17 = C51968G9o.A17(r8, r7, -1958951421);
                int i3 = 0;
                while (A17.hasNext()) {
                    Object next = A17.next();
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        0sr.A1T();
                        throw AnonymousClass00P.createAndThrow();
                    }
                    A00(r8, (C61065Jw3) next, 0);
                    r8.ExS(-1958948918);
                    if (i3 < C51966G9m.A06(r7)) {
                        C51967G9n.A13(r8, r5, 12.0f);
                    }
                    C286565Wx.A0L(r4, false);
                    i3 = i4;
                }
                C286565Wx.A0L(r4, false);
                r8.ASN();
            }
            if (0fL.A02()) {
                0fL.A00(617033657);
            }
        } else {
            r8.Evl();
        }
        C286625Xd ASQ = r8.ASQ();
        if (ASQ != null) {
            JGE.A01(ASQ, r7, i, 7);
        }
    }

    public static final void A02(C286575Wy r17, C53321Gm7 gm7, 0sL r19, 0sL r20, 0sL r21, int i) {
        int i2;
        C286575Wy r13 = r17;
        r13.ExV(-254652409);
        int i3 = i;
        C53321Gm7 gm72 = gm7;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r13, gm72) | i;
        } else {
            i2 = i3;
        }
        0sL r8 = r19;
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r13, r8);
        }
        0sL r5 = r20;
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r13, r5);
        }
        0sL r4 = r21;
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A0H(r13, r4);
        }
        if ((i2 & 1171) != 1170 || !r13.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1935175838, "com.instagram.wonderwall.ui.compose.components.WallPostEditorDecorationBox (WallPostEditor.kt:119)");
            }
            r13.ExS(1418626542);
            boolean A1S = AnonymousClass7TF.A1S(i2 & 14, 4);
            Object ECw = r13.ECw();
            if (A1S || ECw == AnonymousClass5XT.A00) {
                ECw = new C20610Wvr(gm72, 46);
                r13.FLL(ECw);
            }
            C286565Wx A0H = C51965G9l.A0H(r13, false);
            AnonymousClass5TX A0I = C51965G9l.A0I((C284895Os) null, (C62320sa) ECw);
            C287265Zr r9 = C287215Zl.A00;
            C285245Qk r0 = Modifier.A00;
            AnonymousClass5RD A00 = C291495hO.A00(C287275Zs.A07, r13, r9);
            int A002 = C287425a7.A00(r13);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A01 = C287435a8.A01(r13, r0);
            C51973G9u.A0y(r13, A0H);
            C51971G9r.A12(r13, A00, A04);
            0sL r92 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r13, A002)) {
                C51971G9r.A13(r13, r92, A002);
            }
            C51965G9l.A18(r13, A01);
            C55194Hdk.A00(r13, C287205Zk.A09(C287205Zk.A0D(r0, 220.0f), 128.0f), AnonymousClass5PI.A01(r13, new C59137J7t(21, r19, r4, r5, A0I), -807913114), 0.0f, 24582, 14, false, false);
            G9w.A15(r13, r0, 12.0f);
            String str = gm72.A04;
            AnonymousClass5Z4 A0c = C51966G9m.A0c(r13);
            long A0M = C51966G9m.A0M(r13);
            long j = AnonymousClass5RW.A01;
            boolean z = false;
            if (!gm72.A0B) {
                z = true;
            }
            r13.ExS(774414676);
            if (!z) {
                A0M = C51966G9m.A09(r13);
            }
            C286565Wx.A0L(A0H, false);
            AnonymousClass5ZZ.A0r(r13, A0c, str, A0M);
            if (C51967G9n.A1R(r13)) {
                0fL.A00(-624321005);
            }
        } else {
            r13.Evl();
        }
        C286625Xd ASQ = r13.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG7(gm72, r8, r4, r5, i3, 28);
        }
    }
}
