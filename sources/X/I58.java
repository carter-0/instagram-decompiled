package X;

import androidx.compose.ui.Modifier;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;

public abstract class I58 {
    public static final C286025Tq A00(AnonymousClass5ZD r13, String str, String str2, long j) {
        0qQ.A0B(str, 0);
        C303876Bd A0L = C51972G9s.A0L(str2);
        int A0G = C51971G9r.A0G(str2, str);
        int A05 = C51966G9m.A05(str, A0G);
        A0L.A06(new AnonymousClass5ZB((C268454dQ) null, (C291715hl) null, (C291725hm) null, r13, (C291795ht) null, 65530, j, 0, 0), A0G, A05);
        return C51967G9n.A0K(A0L, "tag_span", str, A0G, A05);
    }

    public static final void A01(C286575Wy r18, Modifier modifier, ImmutableList immutableList, HMD hmd, int i, int i2) {
        int i3;
        List list;
        AnonymousClass5RW[] r1;
        Modifier modifier2 = modifier;
        C286575Wy r11 = r18;
        r11.ExV(-1479936625);
        int i4 = i2;
        HMD hmd2 = hmd;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r11, hmd2) | i;
        } else {
            i3 = i5;
        }
        ImmutableList immutableList2 = immutableList;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0P(r11, immutableList2);
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i5 & 384) == 0) {
            i3 |= G9t.A0Q(r11, modifier2);
        }
        if ((i3 & 147) != 146 || !r11.Bwn()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(-28830592, "com.instagram.schools.management.ui.OnboardingProgressComponent (SchoolOnboardingCommonComponents.kt:152)");
            }
            Modifier A0B = C287195Zj.A0B(modifier2, 16.0f, 12.0f, 12.0f, 16.0f);
            AnonymousClass5RD A02 = C287395a4.A02(C287275Zs.A01, r11, C287215Zl.A05, 0);
            int A00 = C287425a7.A00(r11);
            C286565Wx r6 = (C286565Wx) r11;
            AnonymousClass5RM A04 = C286565Wx.A04(r6);
            Modifier A01 = C287435a8.A01(r11, A0B);
            C51973G9u.A0y(r11, r6);
            C51971G9r.A12(r11, A02, A04);
            0sL r12 = C287485aD.A02;
            if (r6.A0K || !C51972G9s.A1Q(r11, A00)) {
                C51971G9r.A13(r11, r12, A00);
            }
            C51965G9l.A18(r11, A01);
            AnonymousClass6FX r5 = AnonymousClass6FX.A00;
            r11.ExS(2129107186);
            Iterator it = immutableList2.iterator();
            while (it.hasNext()) {
                Modifier A0B2 = C287195Zj.A0B(C287205Zk.A08(r5.A00(Modifier.A00), 4.0f), 0.0f, 0.0f, 4.0f, 0.0f);
                r11.ExS(2129114710);
                int ordinal = ((HMD) it.next()).ordinal();
                if (ordinal <= hmd2.ordinal()) {
                    long j = 4293656979L;
                    switch (ordinal) {
                        case 0:
                        case 1:
                            r1 = new AnonymousClass5RW[2];
                            r1[0] = C51967G9n.A0I(4294932992L);
                            j = 4294917941L;
                            break;
                        case 2:
                            r1 = new AnonymousClass5RW[2];
                            r1[0] = C51967G9n.A0I(4294918196L);
                            j = 4294642794L;
                            break;
                        case 3:
                            r1 = new AnonymousClass5RW[2];
                            r1[0] = C51967G9n.A0I(4294907734L);
                            j = 4294377851L;
                            break;
                        case 4:
                            r1 = new AnonymousClass5RW[2];
                            r1[0] = C51967G9n.A0I(4294708839L);
                            break;
                        case 5:
                            r1 = new AnonymousClass5RW[2];
                            r1[0] = C51967G9n.A0I(4293656979L);
                            j = 4292149700L;
                            break;
                        default:
                            throw AnonymousClass7TE.A1K();
                    }
                    r1[1] = C51967G9n.A0I(j);
                    list = 0sr.A1P(r1);
                } else {
                    list = G9t.A1D(C51965G9l.A0N(AnonymousClass5aQ.A00(r11).A0i), AnonymousClass5aQ.A00(r11).A0i);
                }
                C52924Gey A002 = C304796Fg.A00(list, C289325dP.A00(0.0f, 0.0f), C289325dP.A00(Float.POSITIVE_INFINITY, 0.0f));
                C286565Wx.A0L(r6, false);
                AnonymousClass5aQ.A02(r11);
                C289585dr.A00(r11, C304766Fd.A00(A0B2, A002, AnonymousClass5ZM.A02));
            }
            if (C51971G9r.A1S(r11, r6, false)) {
                0fL.A00(2026383375);
            }
        } else {
            r11.Evl();
        }
        C286625Xd ASQ = r11.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG6(i5, i4, 38, modifier2, hmd2, immutableList2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v30, resolved type: X.IxF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v2, resolved type: X.IxF} */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01c7, code lost:
        if (r8 == r5) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01c9, code lost:
        r19 = new X.C58768IxF(18, r36, r13, r9, r35);
        r2.FLL(r19);
        r19 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01dd, code lost:
        r21 = X.C51965G9l.A0z(r7, r8);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C286575Wy r37, androidx.compose.ui.Modifier r38, X.HMD r39, X.C62320sa r40, X.C62320sa r41, X.C62320sa r42, X.C62320sa r43, int r44, int r45) {
        /*
            r15 = r38
            r0 = 577155624(0x2266b228, float:3.1265128E-18)
            r2 = r37
            r2.ExV(r0)
            r33 = r45
            r1 = r45 & 1
            r38 = r40
            r0 = r44
            if (r1 == 0) goto L_0x026f
            r3 = r44 | 6
        L_0x0016:
            r1 = r45 & 2
            r37 = r41
            if (r1 == 0) goto L_0x0262
            r3 = r3 | 48
        L_0x001e:
            r1 = r45 & 4
            r36 = r42
            if (r1 == 0) goto L_0x0255
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x0026:
            r1 = r45 & 8
            r35 = r43
            if (r1 == 0) goto L_0x0248
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x002e:
            r4 = r45 & 16
            r1 = r39
            if (r4 == 0) goto L_0x023d
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0036:
            r6 = r45 & 32
            r4 = 196608(0x30000, float:2.75506E-40)
            if (r6 != 0) goto L_0x0044
            r4 = r4 & r44
            if (r4 != 0) goto L_0x0045
            int r4 = X.G9t.A0T(r2, r15)
        L_0x0044:
            r3 = r3 | r4
        L_0x0045:
            r5 = 74899(0x12493, float:1.04956E-40)
            r5 = r5 & r3
            r4 = 74898(0x12492, float:1.04954E-40)
            if (r5 != r4) goto L_0x0077
            boolean r4 = r2.Bwn()
            if (r4 == 0) goto L_0x0077
            r2.Evl()
        L_0x0057:
            X.5Xd r3 = r2.ASQ()
            if (r3 == 0) goto L_0x0076
            r34 = 11
            X.JAg r2 = new X.JAg
            r25 = r2
            r26 = r36
            r27 = r37
            r28 = r1
            r29 = r35
            r30 = r38
            r31 = r15
            r32 = r0
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r3.A06 = r2
        L_0x0076:
            return
        L_0x0077:
            if (r6 == 0) goto L_0x007b
            X.5Qk r15 = androidx.compose.ui.Modifier.A00
        L_0x007b:
            boolean r4 = X.0fL.A02()
            if (r4 == 0) goto L_0x0089
            r5 = -877794836(0xffffffffcbade9ec, float:-2.2795224E7)
            java.lang.String r4 = "com.instagram.schools.management.ui.BottomButtonComponent (SchoolOnboardingCommonComponents.kt:85)"
            X.0fL.A01(r5, r4)
        L_0x0089:
            r5 = 2131968812(0x7f13432c, float:1.957453E38)
            r4 = 0
            java.lang.String r10 = X.C288035bG.A00(r2, r5)
            r5 = 2131968806(0x7f134326, float:1.9574517E38)
            java.lang.String r9 = X.C288035bG.A00(r2, r5)
            r6 = 2131968813(0x7f13432d, float:1.9574531E38)
            java.lang.Object[] r5 = new java.lang.Object[]{r10, r9}
            java.lang.String r7 = X.C288035bG.A01(r2, r5, r6)
            int r5 = r7.length()
            int r8 = r5 + -1
            int r5 = X.00l.A07(r7, r10, r8)
            int r6 = X.DbX.A05(r10)
            int r6 = r6 + r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            X.0eP r13 = X.AnonymousClass7TF.A0x(r5, r6)
            int r5 = X.00l.A07(r7, r9, r8)
            int r6 = X.DbX.A05(r9)
            int r6 = r6 + r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            X.0eP r9 = X.AnonymousClass7TF.A0x(r5, r6)
            long r24 = X.C51966G9m.A0D(r2)
            r5 = 1578043175(0x5e0f0727, float:2.57656229E18)
            java.lang.Object r6 = X.C51967G9n.A0m(r2, r5)
            java.lang.Object r5 = X.AnonymousClass5XT.A00
            if (r6 != r5) goto L_0x0136
            X.0eP[] r6 = new X.0eP[]{r13, r9}
            java.util.List r6 = X.0sr.A1P(r6)
            X.6Bd r8 = X.C51972G9s.A0L(r7)
            java.util.Iterator r16 = r6.iterator()
        L_0x00ea:
            boolean r6 = r16.hasNext()
            if (r6 == 0) goto L_0x012f
            java.lang.Object r6 = r16.next()
            X.0eP r6 = (X.0eP) r6
            r26 = 0
            r18 = 0
            r23 = 65530(0xfffa, float:9.1827E-41)
            X.5ZB r14 = new X.5ZB
            r17 = r14
            r19 = r18
            r20 = r18
            r21 = r18
            r22 = r18
            r28 = r26
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r26, r28)
            java.lang.Object r11 = r6.A00
            java.lang.Number r11 = (java.lang.Number) r11
            int r10 = r11.intValue()
            java.lang.Object r12 = r6.A01
            java.lang.Number r12 = (java.lang.Number) r12
            int r6 = r12.intValue()
            r8.A06(r14, r10, r6)
            java.lang.String r6 = "tag_span"
            int r10 = r11.intValue()
            int r11 = r12.intValue()
            r8.A0A(r6, r7, r10, r11)
            goto L_0x00ea
        L_0x012f:
            X.5Tq r6 = r8.A02()
            r2.FLL(r6)
        L_0x0136:
            X.5Tq r6 = (X.C286025Tq) r6
            X.5Wx r7 = X.C51965G9l.A0H(r2, r4)
            int r10 = r1.ordinal()
            switch(r10) {
                case 0: goto L_0x0155;
                case 1: goto L_0x014b;
                case 2: goto L_0x015f;
                case 3: goto L_0x015f;
                case 4: goto L_0x0155;
                case 5: goto L_0x0169;
                default: goto L_0x0143;
            }
        L_0x0143:
            r0 = 1578048831(0x5e0f1d3f, float:2.578117E18)
            X.Wub r0 = X.C51972G9s.A0v(r2, r7, r0)
            throw r0
        L_0x014b:
            r8 = 1578058956(0x5e0f44cc, float:2.58090014E18)
            r2.ExS(r8)
            r8 = 2131968810(0x7f13432a, float:1.9574525E38)
            goto L_0x0172
        L_0x0155:
            r8 = 1578051224(0x5e0f2698, float:2.57877478E18)
            r2.ExS(r8)
            r8 = 2131968361(0x7f134169, float:1.9573614E38)
            goto L_0x0172
        L_0x015f:
            r8 = 1578054143(0x5e0f31ff, float:2.57957715E18)
            r2.ExS(r8)
            r8 = 2131956706(0x7f1313e2, float:1.9549975E38)
            goto L_0x0172
        L_0x0169:
            r8 = 1578056364(0x5e0f3aac, float:2.58018765E18)
            r2.ExS(r8)
            r8 = 2131968797(0x7f13431d, float:1.9574499E38)
        L_0x0172:
            java.lang.String r17 = X.C288035bG.A00(r2, r8)
            X.C286565Wx.A0L(r7, r4)
            r21 = 0
            switch(r10) {
                case 1: goto L_0x022b;
                case 2: goto L_0x017e;
                case 3: goto L_0x017e;
                case 4: goto L_0x017e;
                case 5: goto L_0x0221;
                default: goto L_0x017e;
            }
        L_0x017e:
            r8 = 1675480548(0x63ddcde4, float:8.183133E21)
            r2.ExS(r8)
            X.C286565Wx.A0L(r7, r4)
            r18 = r21
        L_0x0189:
            int r10 = 2 - r10
            if (r10 == 0) goto L_0x018f
            r6 = r21
        L_0x018f:
            r8 = 1578085886(0x5e0fadfe, float:2.5883026E18)
            r2.ExS(r8)
            X.HMD r8 = X.HMD.ADD_SCHOOL
            if (r1 == r8) goto L_0x01e1
            X.HMD r8 = X.HMD.SWITCH_SCHOOL
            if (r1 == r8) goto L_0x01e1
            X.HMD r8 = X.HMD.SCHOOL_SELECTION
            if (r1 == r8) goto L_0x01e1
            X.HMD r8 = X.HMD.GRADUATION_DATE
            if (r1 == r8) goto L_0x01e1
            X.HMD r8 = X.HMD.CONFIRM_SCHOOL
            if (r1 == r8) goto L_0x01e1
            X.HMD r8 = X.HMD.STUDENT_EMAIL
            if (r1 != r8) goto L_0x0280
            r8 = 1578092229(0x5e0fc6c5, float:2.59004615E18)
            boolean r10 = X.C51967G9n.A1Y(r2, r13, r8)
            boolean r8 = X.C51973G9u.A1I(r3)
            boolean r10 = X.C51968G9o.A1U(r2, r9, r10, r8)
            boolean r8 = X.C51972G9s.A1O(r3)
            r10 = r10 | r8
            java.lang.Object r8 = r2.ECw()
            if (r10 != 0) goto L_0x01c9
            if (r8 != r5) goto L_0x01dd
        L_0x01c9:
            r20 = 18
            X.IxF r8 = new X.IxF
            r19 = r8
            r21 = r36
            r22 = r13
            r23 = r9
            r24 = r35
            r19.<init>(r20, r21, r22, r23, r24)
            r2.FLL(r8)
        L_0x01dd:
            X.0sP r21 = X.C51965G9l.A0z(r7, r8)
        L_0x01e1:
            X.C286565Wx.A0L(r7, r4)
            int r5 = r3 << 3
            r22 = r5 & 112(0x70, float:1.57E-43)
            int r5 = r3 >> 9
            r5 = r5 & 896(0x380, float:1.256E-42)
            r22 = r22 | r5
            r5 = 3670016(0x380000, float:5.142788E-39)
            int r3 = r3 << 15
            r5 = r5 & r3
            r22 = r22 | r5
            r24 = 29592(0x7398, float:4.1467E-41)
            r23 = r4
            r25 = r4
            r26 = r4
            r27 = r4
            r28 = r4
            r29 = r4
            r30 = r4
            r31 = r4
            r32 = r4
            r14 = r2
            r16 = r6
            r19 = r38
            r20 = r37
            X.I7L.A03(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            boolean r3 = X.0fL.A02()
            if (r3 == 0) goto L_0x0057
            r3 = 1508033563(0x59e2c41b, float:7.9786206E15)
            X.0fL.A00(r3)
            goto L_0x0057
        L_0x0221:
            r8 = 1578069578(0x5e0f6e4a, float:2.58381989E18)
            r2.ExS(r8)
            r8 = 2131968807(0x7f134327, float:1.957452E38)
            goto L_0x0234
        L_0x022b:
            r8 = 1578072094(0x5e0f781e, float:2.58451148E18)
            r2.ExS(r8)
            r8 = 2131964884(0x7f1333d4, float:1.9566562E38)
        L_0x0234:
            java.lang.String r18 = X.C288035bG.A00(r2, r8)
            X.C286565Wx.A0L(r7, r4)
            goto L_0x0189
        L_0x023d:
            r4 = r0 & 24576(0x6000, float:3.4438E-41)
            if (r4 != 0) goto L_0x0036
            int r4 = X.G9t.A0S(r2, r1)
            r3 = r3 | r4
            goto L_0x0036
        L_0x0248:
            r1 = r0 & 3072(0xc00, float:4.305E-42)
            if (r1 != 0) goto L_0x002e
            r1 = r35
            int r1 = X.G9t.A0H(r2, r1)
            r3 = r3 | r1
            goto L_0x002e
        L_0x0255:
            r1 = r0 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L_0x0026
            r1 = r36
            int r1 = X.G9t.A0G(r2, r1)
            r3 = r3 | r1
            goto L_0x0026
        L_0x0262:
            r1 = r44 & 48
            if (r1 != 0) goto L_0x001e
            r1 = r37
            int r1 = X.G9t.A0F(r2, r1)
            r3 = r3 | r1
            goto L_0x001e
        L_0x026f:
            r1 = r44 & 6
            if (r1 != 0) goto L_0x027d
            r1 = r38
            int r3 = X.C41848B3p.A01(r2, r1)
            r3 = r3 | r44
            goto L_0x0016
        L_0x027d:
            r3 = r0
            goto L_0x0016
        L_0x0280:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I58.A02(X.5Wy, androidx.compose.ui.Modifier, X.HMD, X.0sa, X.0sa, X.0sa, X.0sa, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.C286575Wy r16, com.google.common.collect.ImmutableList r17, X.HMD r18, X.C62320sa r19, X.C62320sa r20, X.C62320sa r21, X.C62320sa r22, X.0sK r23, int r24, int r25) {
        /*
            r8 = r22
            r13 = r23
            r12 = r21
            r3 = 0
            r14 = r19
            X.0qQ.A0B(r14, r3)
            r2 = 1
            r10 = r17
            r9 = r18
            r11 = r20
            X.C51973G9u.A0r(r2, r11, r9, r10)
            r0 = 673487934(0x28249c3e, float:9.1377084E-15)
            r4 = r16
            r4.ExV(r0)
            r16 = r25
            r0 = r25 & 1
            r15 = r24
            if (r0 == 0) goto L_0x00f7
            r0 = r24 | 6
        L_0x0028:
            r1 = r25 & 2
            if (r1 == 0) goto L_0x00ec
            r0 = r0 | 48
        L_0x002e:
            r7 = r25 & 4
            if (r7 == 0) goto L_0x00e1
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x0034:
            r6 = r25 & 8
            if (r6 == 0) goto L_0x00d6
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L_0x003a:
            r1 = r25 & 16
            if (r1 == 0) goto L_0x00cb
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
        L_0x0040:
            r5 = r25 & 32
            r1 = 196608(0x30000, float:2.75506E-40)
            if (r5 != 0) goto L_0x004e
            r1 = r24 & r1
            if (r1 != 0) goto L_0x004f
            int r1 = X.G9t.A0T(r4, r10)
        L_0x004e:
            r0 = r0 | r1
        L_0x004f:
            r5 = r25 & 64
            r1 = 1572864(0x180000, float:2.204052E-39)
            if (r5 != 0) goto L_0x005d
            r1 = r1 & r24
            if (r1 != 0) goto L_0x005e
            int r1 = X.G9t.A0K(r4, r13)
        L_0x005d:
            r0 = r0 | r1
        L_0x005e:
            r1 = 599187(0x92493, float:8.3964E-40)
            r1 = r1 & r0
            r0 = 599186(0x92492, float:8.39638E-40)
            if (r1 != r0) goto L_0x0080
            boolean r0 = r4.Bwn()
            if (r0 == 0) goto L_0x0080
            r4.Evl()
        L_0x0070:
            X.5Xd r0 = r4.ASQ()
            if (r0 == 0) goto L_0x007f
            r17 = 3
            X.JBE r7 = new X.JBE
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0.A06 = r7
        L_0x007f:
            return
        L_0x0080:
            if (r7 == 0) goto L_0x0084
            X.Isk r12 = X.C58489Isk.A00
        L_0x0084:
            if (r6 == 0) goto L_0x0088
            X.Isl r8 = X.C58490Isl.A00
        L_0x0088:
            if (r5 == 0) goto L_0x008c
            X.0sK r13 = X.C45189Crr.A00
        L_0x008c:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x009a
            r1 = 1765932216(0x6941fcb8, float:1.4657257E25)
            java.lang.String r0 = "com.instagram.schools.management.ui.OnboardingBaseContent (SchoolOnboardingCommonComponents.kt:51)"
            X.0fL.A01(r1, r0)
        L_0x009a:
            androidx.compose.ui.Modifier r1 = X.C51968G9o.A0O()
            X.0sP r0 = X.C287655aY.A00
            androidx.compose.ui.Modifier r3 = X.JJP.A00(r1, r0, r3)
            r1 = -327806724(0xffffffffec7610fc, float:-1.1899038E27)
            X.JA3 r0 = new X.JA3
            r18 = r2
            r19 = r13
            r20 = r12
            r21 = r9
            r22 = r14
            r23 = r11
            r24 = r10
            r25 = r8
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)
            boolean r0 = X.C51972G9s.A1T(r4, r3, r0, r1)
            if (r0 == 0) goto L_0x0070
            r0 = -1259706615(0xffffffffb4ea6709, float:-4.3660864E-7)
            X.0fL.A00(r0)
            goto L_0x0070
        L_0x00cb:
            r1 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r1 != 0) goto L_0x0040
            int r1 = X.G9t.A0S(r4, r9)
            r0 = r0 | r1
            goto L_0x0040
        L_0x00d6:
            r1 = r15 & 3072(0xc00, float:4.305E-42)
            if (r1 != 0) goto L_0x003a
            int r1 = X.G9t.A0H(r4, r8)
            r0 = r0 | r1
            goto L_0x003a
        L_0x00e1:
            r1 = r15 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L_0x0034
            int r1 = X.G9t.A0G(r4, r12)
            r0 = r0 | r1
            goto L_0x0034
        L_0x00ec:
            r1 = r24 & 48
            if (r1 != 0) goto L_0x002e
            int r1 = X.G9t.A0F(r4, r11)
            r0 = r0 | r1
            goto L_0x002e
        L_0x00f7:
            r0 = r24 & 6
            if (r0 != 0) goto L_0x0103
            int r0 = X.C41848B3p.A01(r4, r14)
            r0 = r0 | r24
            goto L_0x0028
        L_0x0103:
            r0 = r15
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I58.A03(X.5Wy, com.google.common.collect.ImmutableList, X.HMD, X.0sa, X.0sa, X.0sa, X.0sa, X.0sK, int, int):void");
    }
}
