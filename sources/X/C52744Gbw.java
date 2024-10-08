package X;

import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DalvikConstants;
import com.instagram.settings2.core.viewmodel.SettingsScreenViewModel;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Gbw  reason: case insensitive filesystem */
public abstract class C52744Gbw {
    public static final C286025Tq A00(C286575Wy r6, C53556GqS gqS, String str) {
        0qQ.A0B(str, 0);
        if (C51967G9n.A1U(r6, -365945157)) {
            0fL.A01(-1157704106, "com.instagram.settings2.core.view.buildAnnotatedBodyWithLink (Elements.kt:113)");
        }
        String A12 = C51968G9o.A12(r6, gqS.A00);
        int A0G = C51971G9r.A0G(str, A12);
        C303876Bd A0L = C51972G9s.A0L(str);
        int A05 = DbX.A05(A12) + A0G;
        C51974G9v.A0i(r6, A0L, A0G, A05);
        C286025Tq A0K = C51967G9n.A0K(A0L, "link", "Clickable link", A0G, A05);
        if (0fL.A02()) {
            0fL.A00(-1905190082);
        }
        C51965G9l.A1X(r6, false);
        return A0K;
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x0109  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C286575Wy r16, X.C61083JwL r17, X.0sP r18, int r19, boolean r20) {
        /*
            r15 = 0
            r4 = r17
            r3 = r18
            X.AnonymousClass7TF.A1B(r4, r15, r3)
            r0 = -1855140550(0xffffffff916ccd3a, float:-1.8680358E-28)
            r11 = r16
            r11.ExV(r0)
            r2 = r19
            r0 = r19 & 6
            if (r0 != 0) goto L_0x0111
            int r9 = X.C41848B3p.A01(r11, r4)
            r9 = r9 | r19
        L_0x001c:
            r0 = r19 & 48
            r1 = r20
            if (r0 != 0) goto L_0x0027
            int r0 = X.G9t.A0Z(r11, r1)
            r9 = r9 | r0
        L_0x0027:
            r0 = r2 & 384(0x180, float:5.38E-43)
            r8 = 256(0x100, float:3.59E-43)
            if (r0 != 0) goto L_0x0032
            int r0 = X.G9t.A0G(r11, r3)
            r9 = r9 | r0
        L_0x0032:
            r5 = r9 & 147(0x93, float:2.06E-43)
            r0 = 146(0x92, float:2.05E-43)
            if (r5 != r0) goto L_0x0055
            boolean r0 = r11.Bwn()
            if (r0 == 0) goto L_0x0055
            r11.Evl()
        L_0x0041:
            X.5Xd r0 = r11.ASQ()
            if (r0 == 0) goto L_0x0054
            r7 = 16
            X.JG4 r5 = new X.JG4
            r10 = r1
            r8 = r4
            r9 = r3
            r6 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            r0.A06 = r5
        L_0x0054:
            return
        L_0x0055:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0063
            r5 = -623812288(0xffffffffdad16140, float:-2.94675988E16)
            java.lang.String r0 = "com.instagram.settings2.core.view.SettingFooter (Elements.kt:86)"
            X.0fL.A01(r5, r0)
        L_0x0063:
            java.lang.String r5 = X.C51968G9o.A12(r11, r4)
            X.5Qk r12 = androidx.compose.ui.Modifier.A00
            if (r20 == 0) goto L_0x0076
            X.J4V r6 = X.J4V.A00
            androidx.compose.ui.semantics.ClearAndSetSemanticsElement r0 = new androidx.compose.ui.semantics.ClearAndSetSemanticsElement
            r0.<init>(r6)
            androidx.compose.ui.Modifier r12 = r12.Ezh(r0)
        L_0x0076:
            java.lang.Object r0 = r4.A01
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x00fa
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r7 = r0.iterator()
        L_0x0084:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0096
            java.lang.Object r6 = r7.next()
            boolean r0 = r6 instanceof X.C53556GqS
            if (r0 == 0) goto L_0x0084
            r10.add(r6)
            goto L_0x0084
        L_0x0096:
            java.lang.Object r6 = X.00k.A0J(r10)
            X.GqS r6 = (X.C53556GqS) r6
            r7 = 0
            if (r6 == 0) goto L_0x00fa
            r0 = 86423689(0x526b889, float:7.839176E-36)
            r11.ExS(r0)
            X.JwL r0 = r6.A00
            java.lang.String r0 = X.C51968G9o.A12(r11, r0)
            X.0qQ.A0B(r5, r15)
            int r0 = X.C51971G9r.A0G(r5, r0)
            if (r0 < 0) goto L_0x00f0
            r0 = 86622430(0x529c0de, float:7.981766E-36)
            r11.ExS(r0)
            X.5Tq r13 = A00(r11, r6, r5)
            r0 = 141348231(0x86ccd87, float:7.1260263E-34)
            boolean r5 = X.C51967G9n.A1Y(r11, r13, r0)
            r0 = r9 & 896(0x380, float:1.256E-42)
            if (r0 != r8) goto L_0x00ca
            r7 = 1
        L_0x00ca:
            boolean r0 = X.C51968G9o.A1T(r11, r6, r5, r7)
            java.lang.Object r14 = r11.ECw()
            if (r0 != 0) goto L_0x00d8
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r14 != r0) goto L_0x00e2
        L_0x00d8:
            r0 = 29
            X.J6m r14 = new X.J6m
            r14.<init>((X.C286025Tq) r13, (X.C53556GqS) r6, (X.0sP) r3, (int) r0)
            r11.FLL(r14)
        L_0x00e2:
            X.0sP r14 = (X.0sP) r14
            X.C51965G9l.A1X(r11, r15)
            r16 = r15
            X.I2Y.A01(r11, r12, r13, r14, r15, r16)
        L_0x00ec:
            X.C51965G9l.A1X(r11, r15)
            goto L_0x0103
        L_0x00f0:
            r0 = 87025151(0x52fe5ff, float:8.270704E-36)
            r11.ExS(r0)
            X.I2Y.A02(r11, r12, r5, r15, r15)
            goto L_0x00ec
        L_0x00fa:
            r0 = 87092483(0x530ed03, float:8.3190124E-36)
            r11.ExS(r0)
            X.I2Y.A02(r11, r12, r5, r15, r15)
        L_0x0103:
            boolean r0 = X.C51970G9q.A1a(r11, r15)
            if (r0 == 0) goto L_0x0041
            r0 = 1616520514(0x605a2542, float:6.287617E19)
            X.0fL.A00(r0)
            goto L_0x0041
        L_0x0111:
            r9 = r2
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52744Gbw.A01(X.5Wy, X.JwL, X.0sP, int, boolean):void");
    }

    public static final void A02(C286575Wy r14, JOX jox, JOX jox2, JOX jox3, JOY joy, SettingsScreenViewModel settingsScreenViewModel, 0sP r20, 0sL r21, 0sL r22, int i) {
        int i2;
        boolean AGw;
        boolean AGw2;
        boolean AGw3;
        JOY joy2 = joy;
        0qQ.A0B(joy2, 0);
        0sL r10 = r21;
        0qQ.A0B(r10, 1);
        JOX jox4 = jox;
        0qQ.A0B(jox, 2);
        JOX jox5 = jox2;
        0qQ.A0B(jox5, 3);
        JOX jox6 = jox3;
        0qQ.A0B(jox6, 4);
        0sL r7 = r22;
        0qQ.A0B(r7, 5);
        0sP r4 = r20;
        0qQ.A0B(r4, 6);
        SettingsScreenViewModel settingsScreenViewModel2 = settingsScreenViewModel;
        0qQ.A0B(settingsScreenViewModel2, 7);
        r14.ExV(644190076);
        int i3 = i;
        if ((i & 6) == 0) {
            int i4 = 2;
            if (r14.AGw(joy2)) {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            int i5 = 16;
            if (r14.AGw(r10)) {
                i5 = 32;
            }
            i2 |= i5;
        }
        if ((i3 & 384) == 0) {
            if ((i3 & 512) == 0) {
                AGw3 = r14.AGu(jox);
            } else {
                AGw3 = r14.AGw(jox);
            }
            int i6 = 128;
            if (AGw3) {
                i6 = 256;
            }
            i2 |= i6;
        }
        if ((i3 & 3072) == 0) {
            if ((i3 & 4096) == 0) {
                AGw2 = r14.AGu(jox5);
            } else {
                AGw2 = r14.AGw(jox5);
            }
            int i7 = 1024;
            if (AGw2) {
                i7 = C249703kE.FLAG_MOVED;
            }
            i2 |= i7;
        }
        if ((i3 & 24576) == 0) {
            if ((32768 & i) == 0) {
                AGw = r14.AGu(jox6);
            } else {
                AGw = r14.AGw(jox6);
            }
            int i8 = 8192;
            if (AGw) {
                i8 = Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
            }
            i2 |= i8;
        }
        if ((196608 & i) == 0) {
            boolean AGw4 = r14.AGw(r7);
            int i9 = Constants.LOAD_RESULT_PGO_ATTEMPTED;
            if (AGw4) {
                i9 = Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP;
            }
            i2 |= i9;
        }
        if ((1572864 & i) == 0) {
            boolean AGw5 = r14.AGw(r4);
            int i10 = Constants.LOAD_RESULT_WITH_VDEX_ODEX;
            if (AGw5) {
                i10 = Constants.LOAD_RESULT_NEED_REOPTIMIZATION;
            }
            i2 |= i10;
        }
        if ((12582912 & i) == 0) {
            int i11 = 4194304;
            if (r14.AGw(settingsScreenViewModel2)) {
                i11 = DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE;
            }
            i2 |= i11;
        }
        if ((4793491 & i2) != 4793490 || !r14.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1535620472, "com.instagram.settings2.core.view.Element (Elements.kt:49)");
            }
            if (joy2.CFb()) {
                if (joy2 instanceof C52745Gbx) {
                    r14.ExS(-243374830);
                    C52737Gbp.A00(r14, (C52745Gbx) joy2, settingsScreenViewModel2, r10, ((i2 >> 15) & 896) | (i2 & 112));
                } else if (joy2 instanceof JT1) {
                    r14.ExS(-243371308);
                    A03(r14, jox, jox2, jox3, (JT1) joy2, settingsScreenViewModel, r20, r21, r22, (i2 & 112) | (i2 & 896) | (i2 & 7168) | (57344 & i2) | (458752 & i2) | (3670016 & i2) | (i2 & 29360128));
                } else {
                    r14.ExS(1045885512);
                }
                C286565Wx.A0L((C286565Wx) r14, false);
            }
            if (0fL.A02()) {
                0fL.A00(-1608787859);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r14.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JBG(r4, settingsScreenViewModel2, joy2, r7, jox5, jox6, r10, jox4, i3, 6);
        }
    }

    public static final void A03(C286575Wy r13, JOX jox, JOX jox2, JOX jox3, JT1 jt1, SettingsScreenViewModel settingsScreenViewModel, 0sP r19, 0sL r20, 0sL r21, int i) {
        int i2;
        JT1 jt12 = jt1;
        0sL r11 = r20;
        AnonymousClass7TF.A1H(jt12, r11);
        JOX jox4 = jox;
        JOX jox5 = jox2;
        JOX jox6 = jox3;
        0sP r6 = r19;
        0sL r9 = r21;
        C51974G9v.A1S(jox, jox2, jox6, r9, r6);
        SettingsScreenViewModel settingsScreenViewModel2 = settingsScreenViewModel;
        0qQ.A0B(settingsScreenViewModel2, 7);
        C286575Wy r15 = r13;
        r13.ExV(-413150252);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r15, jt12) | i;
        } else {
            i2 = i3;
        }
        if ((i3 & 384) == 0) {
            int i4 = 128;
            if (C51972G9s.A1V(r15, jox4, i3 & 512)) {
                i4 = 256;
            }
            i2 |= i4;
        }
        if ((i3 & 3072) == 0) {
            int i5 = 1024;
            if (C51972G9s.A1V(r15, jox5, i3 & 4096)) {
                i5 = C249703kE.FLAG_MOVED;
            }
            i2 |= i5;
        }
        if ((196608 & i) == 0) {
            i2 |= G9t.A0J(r15, r9);
        }
        if ((1572864 & i) == 0) {
            i2 |= G9t.A0K(r15, r6);
        }
        if ((12582912 & i) == 0) {
            i2 |= G9t.A0L(r15, settingsScreenViewModel2);
        }
        if ((4785283 & i2) != 4785282 || !r15.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-326596833, "com.instagram.settings2.core.view.Setting (Elements.kt:142)");
            }
            if (jt12.CFb()) {
                C61074JwC Af7 = jt12.Af7();
                r15.ExS(1539144091);
                if (Af7 != null) {
                    C66460MSo BEX = jt12.BEX();
                    r15.ExS(604548475);
                    boolean A1a = G9t.A1a(r15, jt12, Af7, C51972G9s.A1P(458752, i2, Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP));
                    Object ECw = r15.ECw();
                    if (A1a || ECw == AnonymousClass5XT.A00) {
                        ECw = new C20704Wxb(14, jt12, r9, Af7);
                        r15.FLL(ECw);
                    }
                    C51965G9l.A1X(r15, false);
                    C55142Hcq.A00(r15, Af7, settingsScreenViewModel2, BEX, (C62320sa) ECw, (i2 >> 15) & 896, 0);
                }
                C286565Wx A0H = C51965G9l.A0H(r15, false);
                if (jt12 instanceof C53557GqT) {
                    r15.ExS(1539149603);
                    JOX jox7 = jox4;
                    C53557GqT gqT = (C53557GqT) jt12;
                    SettingsScreenViewModel settingsScreenViewModel3 = settingsScreenViewModel2;
                    0sP r192 = r6;
                    A04(r15, jox7, gqT, settingsScreenViewModel3, r192, C51969G9p.A04(i2 >> 12, (i2 >> 3) & 112));
                } else if (jt12 instanceof C53558GqU) {
                    r15.ExS(1539153960);
                    JOX jox8 = jox5;
                    SettingsScreenViewModel settingsScreenViewModel4 = settingsScreenViewModel2;
                    C53558GqU gqU = (C53558GqU) jt12;
                    0sP r193 = r6;
                    C55143Hcr.A00(r15, jox8, settingsScreenViewModel4, gqU, r193, C51969G9p.A04(i2 >> 12, (i2 >> 6) & 112));
                } else if (jt12 instanceof C53559GqV) {
                    r15.ExS(1539159534);
                    int i6 = i2 >> 15;
                    C55144Hcs.A00(r15, settingsScreenViewModel2, (C53559GqV) jt12, r6, (i6 & 896) | (i6 & 112));
                } else if (jt12 instanceof C53560GqW) {
                    r15.ExS(469404934);
                } else {
                    throw C51972G9s.A0v(r15, A0H, 1539148184);
                }
                C286565Wx.A0L(A0H, false);
            }
            if (0fL.A02()) {
                0fL.A00(498876270);
            }
        } else {
            r15.Evl();
        }
        C286625Xd ASQ = r15.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JBG(jox4, r6, jt12, jox6, r9, jox5, r11, settingsScreenViewModel2, i3, 7);
        }
    }

    public static final void A04(C286575Wy r29, JOX jox, C53557GqT gqT, SettingsScreenViewModel settingsScreenViewModel, 0sP r33, int i) {
        int i2;
        boolean z;
        String A12;
        JOX jox2 = jox;
        C53557GqT gqT2 = gqT;
        0sP r4 = r33;
        C51973G9u.A1E(gqT2, jox2, r4);
        SettingsScreenViewModel settingsScreenViewModel2 = settingsScreenViewModel;
        0qQ.A0B(settingsScreenViewModel2, 3);
        C286575Wy r13 = r29;
        r13.ExV(-967800234);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r13, gqT2) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= C51970G9q.A06(G9t.A1U(r13, jox2, i3) ? 1 : 0);
        }
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r13, r4);
        }
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A0H(r13, settingsScreenViewModel2);
        }
        if ((i2 & 1171) != 1170 || !r13.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(2009350102, "com.instagram.settings2.core.view.BooleanSetting (Elements.kt:169)");
            }
            String A122 = C51968G9o.A12(r13, gqT2.A01);
            boolean z2 = gqT2.A05;
            boolean z3 = gqT2.A06;
            r13.ExS(812036823);
            if ((i2 & 112) == 32 || ((i2 & 64) != 0 && r13.AGw(jox2))) {
                z = true;
            } else {
                z = false;
            }
            boolean A1U = C51966G9m.A1U(r13, gqT2, z);
            Object ECw = r13.ECw();
            if (A1U || ECw == AnonymousClass5XT.A00) {
                ECw = new C74186PqS(44, (Object) gqT2, (Object) jox2);
                r13.FLL(ECw);
            }
            C286565Wx A0H = C51965G9l.A0H(r13, false);
            C57125IPo iPo = new C57125IPo((0sP) ECw, z3, false);
            C61083JwL jwL = gqT2.A00;
            r13.ExS(812043019);
            if (jwL == null) {
                A12 = null;
            } else {
                A12 = C51968G9o.A12(r13, jwL);
            }
            C286565Wx.A0L(A0H, false);
            C52636GaA.A00(r13, (Modifier) null, (Modifier) null, (AnonymousClass5RW) null, (AnonymousClass2DO) null, (C286025Tq) null, (C54611HKu) null, iPo, A122, (String) null, A12, (Map) null, (C62320sa) null, 0, 0, 0, 0, 0, 130298, 0, z2);
            A06(r13, gqT2.A04, r4, (i2 & 896) | 48, false);
            MXZ mxz = gqT2.A03;
            boolean A1S = C51973G9u.A1S(r13, settingsScreenViewModel2, gqT2, 812048301);
            Object ECw2 = r13.ECw();
            if (A1S || ECw2 == AnonymousClass5XT.A00) {
                ECw2 = new C66186MGx((Object) settingsScreenViewModel2, (Object) gqT2, (AnonymousClass4D7) null, 3);
                r13.FLL(ECw2);
            }
            if (C51972G9s.A1S(r13, A0H, ECw2, mxz)) {
                0fL.A00(-2046273299);
            }
        } else {
            r13.Evl();
        }
        C286625Xd ASQ = r13.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG7(gqT2, settingsScreenViewModel2, jox2, r4, i3, 24);
        }
    }

    public static final void A05(C286575Wy r4, List list, 0sP r6, int i) {
        int i2;
        AnonymousClass7TF.A1H(list, r6);
        r4.ExV(800996836);
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r4, list) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r4, r6);
        }
        if ((i2 & 19) != 18 || !r4.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-258747365, "com.instagram.settings2.core.view.SettingHeaders (Elements.kt:68)");
            }
            A06(r4, list, r6, ((i2 << 3) & 896) | (i2 & 14) | 48, false);
            if (0fL.A02()) {
                0fL.A00(-783299274);
            }
        } else {
            r4.Evl();
        }
        C286625Xd ASQ = r4.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JGM(list, r6, i, 10);
        }
    }

    public static final void A06(C286575Wy r10, List list, 0sP r12, int i, boolean z) {
        int i2;
        List list2 = list;
        0sP r7 = r12;
        DbY.A1S(list, r12);
        r10.ExV(-411995826);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r10, list) | i;
        } else {
            i2 = i;
        }
        boolean z2 = z;
        if ((i & 48) == 0) {
            i2 |= G9t.A0Z(r10, z);
        }
        if ((i & 384) == 0) {
            i2 |= G9t.A0G(r10, r12);
        }
        if ((i2 & 147) != 146 || !r10.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1362573974, "com.instagram.settings2.core.view.SettingFooters (Elements.kt:77)");
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A01(r10, (C61083JwL) it.next(), r12, (i2 & 112) | (i2 & 896), z);
            }
            if (0fL.A02()) {
                0fL.A00(1856095301);
            }
        } else {
            r10.Evl();
        }
        C286625Xd ASQ = r10.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG4(i3, 17, r7, list2, z2);
        }
    }
}
