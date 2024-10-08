package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.Gb6  reason: case insensitive filesystem */
public abstract class C52694Gb6 {
    public static final void A01(C52754Gc7 gc7) {
        C55928Hpq hpq = gc7.A04;
        if (hpq != null) {
            C55927Hpp hpp = gc7.A0M;
            0sP r5 = gc7.A0O;
            C285975Tl r0 = hpp.A01;
            r5.invoke(new C285975Tl(r0.A01, (C285965Tk) null, r0.A00));
            C286205Ui r1 = hpq.A01;
            if (1FH.A00(hpq, (Object) null, r1.A01)) {
                r1.A00.EyE();
            }
        }
        gc7.A04 = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x009a A[Catch:{ all -> 0x00a3 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C52754Gc7 r9, X.JS3 r10, X.C285975Tl r11) {
        /*
            androidx.compose.runtime.snapshots.Snapshot r6 = X.AnonymousClass5PH.A02()
            if (r6 == 0) goto L_0x000f
            X.0sP r5 = r6.A05()
        L_0x000a:
            androidx.compose.runtime.snapshots.Snapshot r4 = X.AnonymousClass5PH.A03(r6)
            goto L_0x0011
        L_0x000f:
            r5 = 0
            goto L_0x000a
        L_0x0011:
            X.I1h r0 = X.C52754Gc7.A00(r9)     // Catch:{ all -> 0x00a3 }
            if (r0 == 0) goto L_0x009f
            X.Hpq r7 = r9.A04     // Catch:{ all -> 0x00a3 }
            if (r7 == 0) goto L_0x009f
            X.4ch r3 = r9.A02()     // Catch:{ all -> 0x00a3 }
            if (r3 == 0) goto L_0x009f
            X.Hr4 r2 = r9.A01     // Catch:{ all -> 0x00a3 }
            X.62f r8 = r0.A02     // Catch:{ all -> 0x00a3 }
            X.5Oz r0 = r9.A0A     // Catch:{ all -> 0x00a3 }
            boolean r0 = X.C51971G9r.A1W(r0)     // Catch:{ all -> 0x00a3 }
            if (r0 == 0) goto L_0x009f
            long r0 = r11.A00     // Catch:{ all -> 0x00a3 }
            int r0 = X.C285965Tk.A00(r0)     // Catch:{ all -> 0x00a3 }
            int r1 = r10.E1S(r0)     // Catch:{ all -> 0x00a3 }
            X.62Y r0 = r8.A04     // Catch:{ all -> 0x00a3 }
            X.5Tq r0 = r0.A03     // Catch:{ all -> 0x00a3 }
            int r0 = r0.length()     // Catch:{ all -> 0x00a3 }
            if (r1 < r0) goto L_0x0045
            if (r1 == 0) goto L_0x004a
            int r1 = r1 + -1
        L_0x0045:
            X.5VN r0 = r8.A05(r1)     // Catch:{ all -> 0x00a3 }
            goto L_0x0064
        L_0x004a:
            X.5Z4 r9 = r2.A03     // Catch:{ all -> 0x00a3 }
            X.4cd r8 = r2.A05     // Catch:{ all -> 0x00a3 }
            X.5Uu r2 = r2.A04     // Catch:{ all -> 0x00a3 }
            java.lang.String r1 = X.C56386Hxf.A00     // Catch:{ all -> 0x00a3 }
            r0 = 1
            long r0 = X.C56386Hxf.A00(r9, r2, r8, r1, r0)     // Catch:{ all -> 0x00a3 }
            r8 = 1065353216(0x3f800000, float:1.0)
            int r0 = X.C289005cr.A00(r0)     // Catch:{ all -> 0x00a3 }
            float r2 = (float) r0     // Catch:{ all -> 0x00a3 }
            r1 = 0
            X.5VN r0 = new X.5VN     // Catch:{ all -> 0x00a3 }
            r0.<init>(r1, r1, r8, r2)     // Catch:{ all -> 0x00a3 }
        L_0x0064:
            float r9 = r0.A01     // Catch:{ all -> 0x00a3 }
            float r8 = r0.A03     // Catch:{ all -> 0x00a3 }
            long r1 = X.C289325dP.A00(r9, r8)     // Catch:{ all -> 0x00a3 }
            long r10 = r3.CgY(r1)     // Catch:{ all -> 0x00a3 }
            float r2 = X.C289295dM.A01(r10)     // Catch:{ all -> 0x00a3 }
            float r1 = X.C289295dM.A02(r10)     // Catch:{ all -> 0x00a3 }
            long r2 = X.C289325dP.A00(r2, r1)     // Catch:{ all -> 0x00a3 }
            float r1 = r0.A02     // Catch:{ all -> 0x00a3 }
            float r1 = r1 - r9
            float r0 = r0.A00     // Catch:{ all -> 0x00a3 }
            float r0 = r0 - r8
            long r0 = X.C288015bE.A00(r1, r0)     // Catch:{ all -> 0x00a3 }
            X.5VN r1 = X.C289285dL.A01(r2, r0)     // Catch:{ all -> 0x00a3 }
            X.5Ui r0 = r7.A01     // Catch:{ all -> 0x00a3 }
            java.util.concurrent.atomic.AtomicReference r0 = r0.A01     // Catch:{ all -> 0x00a3 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x00a3 }
            X.Hpq r0 = (X.C55928Hpq) r0     // Catch:{ all -> 0x00a3 }
            boolean r0 = X.0qQ.A0K(r0, r7)     // Catch:{ all -> 0x00a3 }
            if (r0 == 0) goto L_0x009f
            X.5Te r0 = r7.A00     // Catch:{ all -> 0x00a3 }
            r0.Crs(r1)     // Catch:{ all -> 0x00a3 }
        L_0x009f:
            X.AnonymousClass5PH.A06(r6, r4, r5)
            return
        L_0x00a3:
            r0 = move-exception
            X.AnonymousClass5PH.A06(r6, r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52694Gb6.A02(X.Gc7, X.JS3, X.5Tl):void");
    }

    public static final void A03(C52693Gb5 gb5, C286575Wy r15, int i) {
        int i2;
        C52754Gc7 gc7;
        C286025Tq r0;
        C56553I1h i1h;
        C286575Wy r11 = r15;
        r15.ExV(-1436003720);
        int i3 = i;
        C52693Gb5 gb52 = gb5;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r15, gb5) | i;
        } else {
            i2 = i3;
        }
        if ((i2 & 3) != 2 || !r15.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1489561067, "androidx.compose.foundation.text.TextFieldCursorHandle (CoreTextField.kt:1189)");
            }
            C52754Gc7 gc72 = gb5.A03;
            if (gc72 == null || !C51971G9r.A1W(gc72.A0F) || (gc7 = gb5.A03) == null || (r0 = gc7.A01.A02) == null || r0.length() <= 0) {
                r15.ExS(-284257090);
            } else {
                boolean A1Y = C51967G9n.A1Y(r15, gb5, -285446808);
                Object ECw = r15.ECw();
                if (A1Y || ECw == AnonymousClass5XT.A00) {
                    ECw = new IFV(gb5);
                    r15.FLL(ECw);
                }
                C268024cd A0Y = C51968G9o.A0Y(r15);
                int E1S = gb5.A08.E1S(C51965G9l.A04(C51968G9o.A0G(gb5.A0K)));
                C52754Gc7 gc73 = gb5.A03;
                if (gc73 != null) {
                    i1h = C52754Gc7.A00(gc73);
                } else {
                    i1h = null;
                }
                0qQ.A0A(i1h);
                C3022462f r1 = i1h.A02;
                AnonymousClass5VN A06 = r1.A06(C229632nm.A03(E1S, 0, r1.A04.A03.length()));
                float f = A06.A01;
                AnonymousClass5b9 r02 = C55294HfN.A00;
                long A00 = C289325dP.A00(f + (A0Y.F06(2.0f) / 2.0f), A06.A00);
                boolean AGt = r15.AGt(A00);
                Object ECw2 = r15.ECw();
                if (AGt || ECw2 == AnonymousClass5XT.A00) {
                    ECw2 = new C56858IFf(A00);
                    r15.FLL(ECw2);
                }
                JNV jnv = (JNV) ECw2;
                C285245Qk r8 = Modifier.A00;
                boolean A1V = C51971G9r.A1V(r15, ECw, gb5);
                Object ECw3 = r15.ECw();
                if (A1V || ECw3 == AnonymousClass5XT.A00) {
                    ECw3 = new MHP((Object) gb5, ECw, (AnonymousClass4D7) null, 11);
                    r15.FLL(ECw3);
                }
                Modifier A002 = C304916Fs.A00(r8, ECw, (0sL) ECw3);
                boolean AGt2 = r15.AGt(A00);
                Object ECw4 = r15.ECw();
                if (AGt2 || ECw4 == AnonymousClass5XT.A00) {
                    ECw4 = new GQ2(A00, 1);
                    r15.FLL(ECw4);
                }
                I3R.A00(jnv, r11, AnonymousClass5R5.A00(A002, (0sP) ECw4, false), 0, 4, 0);
            }
            if (C51970G9q.A1Z(r11)) {
                0fL.A00(433776757);
            }
        } else {
            r15.Evl();
        }
        C286625Xd ASQ = r11.ASQ();
        if (ASQ != null) {
            JGC.A01(ASQ, gb52, i3, 6);
        }
    }

    public static final void A04(C52693Gb5 gb5, C286575Wy r10, int i, boolean z) {
        int i2;
        C56553I1h A00;
        r10.ExV(626339208);
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r10, gb5) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0Z(r10, z);
        }
        if ((i2 & 19) != 18 || !r10.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-843809198, "androidx.compose.foundation.text.SelectionToolbarAndHandles (CoreTextField.kt:1146)");
            }
            if (z) {
                r10.ExS(-1286242594);
                C52754Gc7 gc7 = gb5.A03;
                if (!(gc7 == null || (A00 = C52754Gc7.A00(gc7)) == null)) {
                    C3022462f r7 = A00.A02;
                    C52754Gc7 gc72 = gb5.A03;
                    if (gc72 != null && (!gc72.A06)) {
                        r10.ExS(-1285984395);
                        C284945Oz r4 = gb5.A0K;
                        if (!C285965Tk.A03(C51968G9o.A0G(r4))) {
                            r10.ExS(-1680616096);
                            int E1S = gb5.A08.E1S(C51965G9l.A04(C51968G9o.A0G(r4)));
                            int E1S2 = gb5.A08.E1S(C51968G9o.A02(C51968G9o.A0G(r4)));
                            C52430GSi A08 = r7.A08(E1S);
                            C52430GSi A082 = r7.A08(Math.max(E1S2 - 1, 0));
                            C52754Gc7 gc73 = gb5.A03;
                            if (gc73 == null || !C51971G9r.A1W(gc73.A0I)) {
                                r10.ExS(-1679975078);
                            } else {
                                r10.ExS(-1680216289);
                                C56168Htx.A00(gb5, r10, A08, ((i2 << 6) & 896) | 6, true);
                            }
                            C286565Wx A0H = C51965G9l.A0H(r10, false);
                            C52754Gc7 gc74 = gb5.A03;
                            if (gc74 == null || !C51971G9r.A1W(gc74.A0H)) {
                                r10.ExS(-1679655654);
                            } else {
                                r10.ExS(-1679895904);
                                C56168Htx.A00(gb5, r10, A082, ((i2 << 6) & 896) | 6, false);
                            }
                            C286565Wx.A0L(A0H, false);
                        } else {
                            r10.ExS(-1679637798);
                        }
                        C51965G9l.A1X(r10, false);
                        C52754Gc7 gc75 = gb5.A03;
                        if (gc75 != null) {
                            if (C51966G9m.A1a(gb5.A09.A01.A00, C51971G9r.A0q(r4))) {
                                C51967G9n.A16(gc75.A0G, false);
                            }
                            if (C51971G9r.A1W(gc75.A0A)) {
                                if (C51971G9r.A1W(gc75.A0G)) {
                                    gb5.A0B();
                                } else {
                                    gb5.A08();
                                }
                            }
                        }
                        C286565Wx.A0I(C51965G9l.A0G(r10));
                    }
                }
                r10.ExS(-1285984396);
                C286565Wx.A0I(C51965G9l.A0G(r10));
            } else {
                r10.ExS(651305535);
                C51965G9l.A1V(r10);
                gb5.A08();
            }
            if (0fL.A02()) {
                0fL.A00(1724398621);
            }
        } else {
            r10.Evl();
        }
        C286625Xd ASQ = r10.ASQ();
        if (ASQ != null) {
            JGI.A01(ASQ, gb5, i, 0, z);
        }
    }

    public static final void A05(C52693Gb5 gb5, C286575Wy r7, Modifier modifier, 0sL r9, int i) {
        int i2;
        r7.ExV(-20551815);
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r7, modifier) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r7, gb5);
        }
        if ((i & 384) == 0) {
            i2 |= G9t.A0G(r7, r9);
        }
        if ((i2 & 147) != 146 || !r7.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-996253211, "androidx.compose.foundation.text.CoreTextFieldRootBox (CoreTextField.kt:801)");
            }
            AnonymousClass5RD A0a = C51966G9m.A0a(true);
            int A00 = C287425a7.A00(r7);
            C286565Wx r3 = (C286565Wx) r7;
            AnonymousClass5RM A04 = C286565Wx.A04(r3);
            Modifier A01 = C287435a8.A01(r7, modifier);
            C51973G9u.A0y(r7, r3);
            C51971G9r.A12(r7, A0a, A04);
            0sL r1 = C287485aD.A02;
            if (r3.A0K || !C51972G9s.A1Q(r7, A00)) {
                C51971G9r.A13(r7, r1, A00);
            }
            C51965G9l.A18(r7, A01);
            HR6.A00(gb5, r7, r9, C51965G9l.A02(i2 >> 3));
            if (C51967G9n.A1R(r7)) {
                0fL.A00(836506767);
            }
        } else {
            r7.Evl();
        }
        C286625Xd ASQ = r7.ASQ();
        if (ASQ != null) {
            ASQ.A06 = JGN.A01(modifier, r9, gb5, i, 0);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v0, resolved type: X.6Fe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v44, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v55, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v62, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v32, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v5, resolved type: X.6Fe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v6, resolved type: X.6Fe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v100, resolved type: X.6Fe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v7, resolved type: X.6Fe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v8, resolved type: X.6Fe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v4, resolved type: X.5Ui} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v31, resolved type: X.Iy6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v98, resolved type: X.JUk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v25, resolved type: X.Ixi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v99, resolved type: X.Ixj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v100, resolved type: X.IyB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v101, resolved type: X.IxG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v50, resolved type: X.IoC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r56v12, resolved type: X.IoC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r56v13, resolved type: X.IxG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r56v14, resolved type: X.IyB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r55v8, resolved type: X.Ixj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r53v10, resolved type: X.Ixi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r53v11, resolved type: X.JUk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r53v12, resolved type: X.Iy6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v75, resolved type: X.5Ui} */
    /* JADX WARNING: type inference failed for: r38v1 */
    /* JADX WARNING: type inference failed for: r38v3 */
    /* JADX WARNING: type inference failed for: r21v2 */
    /* JADX WARNING: type inference failed for: r13v6 */
    /* JADX WARNING: type inference failed for: r11v20 */
    /* JADX WARNING: type inference failed for: r11v45 */
    /* JADX WARNING: type inference failed for: r11v56 */
    /* JADX WARNING: type inference failed for: r11v63 */
    /* JADX WARNING: type inference failed for: r5v33 */
    /* JADX WARNING: type inference failed for: r38v4 */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x049b, code lost:
        if ((r3 & 48) == 32) goto L_0x049d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x04b0, code lost:
        if (r13 == r0) goto L_0x04b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x04b2, code lost:
        r53 = new X.C58821Iy6(r45, r9, r6, r32, r68, r70, r21, r15, r17, r19);
        r2.FLL(r53);
        r53 = r53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x04d0, code lost:
        r49 = X.C288275be.A00(r33, X.C51970G9q.A0U(r4, r22).Ezh(new androidx.compose.ui.focus.FocusChangedElement((X.0sP) r13)), r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x04e9, code lost:
        if (r17 == false) goto L_0x04ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x04eb, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x04ec, code lost:
        if (r19 == false) goto L_0x04ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x04ee, code lost:
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x04ef, code lost:
        r48 = X.C287175Zh.A00(r2, java.lang.Boolean.valueOf(r11));
        r12 = X.C60340gF.A00;
        r14 = X.C51973G9u.A1T(r2, r21, r6, r2.AGu(r48), r2.AGw(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x050b, code lost:
        if (r50 <= 32) goto L_0x0515;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0513, code lost:
        if (r2.AGu(r32) != false) goto L_0x051a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0515, code lost:
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0518, code lost:
        if ((r3 & 48) != 32) goto L_0x051b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x051a, code lost:
        r13 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x051b, code lost:
        r13 = r13 | r14;
        r11 = r2.ECw();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0520, code lost:
        if (r13 != false) goto L_0x0524;
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0522, code lost:
        if (r11 != r0) goto L_0x053c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0524, code lost:
        r53 = new X.C59703JUk((java.lang.Object) r32, (java.lang.Object) r48, (java.lang.Object) r21, (java.lang.Object) r6, (java.lang.Object) r9, (X.AnonymousClass4D7) null, 2);
        r2.FLL(r53);
        r53 = r53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x053c, code lost:
        X.C286645Xf.A04(r2, r12, (X.0sL) r11);
        r11 = r2.AGw(r9);
        r15 = r2.ECw();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x054b, code lost:
        if (r11 != false) goto L_0x054f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x054d, code lost:
        if (r15 != r0) goto L_0x0558;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x054f, code lost:
        r15 = X.J6M.A00(r9, 4);
        r2.FLL(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0558, code lost:
        r46 = X.C304916Fs.A00(r4, 8675309(0x845fed, float:1.2156697E-38), new X.MH2(r15, (X.AnonymousClass4D7) null, 17, 42));
        r11 = X.C51973G9u.A1T(r2, r68, r6, X.AnonymousClass7TF.A1S(r64, X.C249703kE.FLAG_MOVED), r2.AGw(r9) | X.C51972G9s.A1K(r40));
        r14 = r2.ECw();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x058b, code lost:
        if (r11 != false) goto L_0x058f;
        r14 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x058d, code lost:
        if (r14 != r0) goto L_0x05a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x058f, code lost:
        r53 = new X.C58797Ixi(r9, r22, r6, r68, 0, r19, r17);
        r2.FLL(r53);
        r53 = r53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x05a7, code lost:
        if (r17 == false) goto L_0x05bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x05a9, code lost:
        r46 = X.C287435a8.A02(r46, X.C287655aY.A00, new X.JJU(4, r33, r14));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x05bb, code lost:
        r15 = r6.A0F;
        r53 = r6.A0E;
        r15 = r46.Ezh(new androidx.compose.ui.input.pointer.SuspendPointerInputElement(r15, r53, new X.MHP((java.lang.Object) r15, (java.lang.Object) r53, (X.AnonymousClass4D7) null, 12))).Ezh(new androidx.compose.ui.input.pointer.PointerHoverIconModifierElement(X.C55295HfO.A00));
        r11 = X.C51968G9o.A1T(r2, r68, r2.AGw(r9), X.AnonymousClass7TF.A1S(r26, 4));
        r14 = r2.ECw();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x05ff, code lost:
        if (r11 != false) goto L_0x0603;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0601, code lost:
        if (r14 != r0) goto L_0x0611;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0603, code lost:
        r14 = new X.C58751Iwy(6, r68, r70, r9);
        r2.FLL(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0611, code lost:
        r54 = X.C289575dp.A00(r4, (X.0sP) r14);
        r12 = X.C51968G9o.A1T(r2, r68, X.C51968G9o.A1T(r2, r6, X.AnonymousClass7TF.A1S(r64, X.C249703kE.FLAG_MOVED) | r2.AGw(r9), r2.AGu(r18)), X.AnonymousClass7TF.A1S(r26, 4));
        r11 = r2.ECw();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0640, code lost:
        if (r12 != false) goto L_0x0644;
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0642, code lost:
        if (r11 != r0) goto L_0x065c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0644, code lost:
        r55 = new X.C58798Ixj(0, r9, r18, r6, r70, r68, r17);
        r2.FLL(r55);
        r55 = r55;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x065c, code lost:
        r55 = X.C51970G9q.A0W(r4, (X.0sP) r11);
        r13 = X.C51966G9m.A1U(r2, r6, X.C51973G9u.A1T(r2, r9, r68, X.C51966G9m.A1V(r2, false, (r2.AGw(r10) | X.AnonymousClass7TF.A1S(r26, 4)) | X.AnonymousClass7TF.A1S(r64, X.C249703kE.FLAG_MOVED)), X.C51972G9s.A1K(r40)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x068e, code lost:
        if (r50 <= 32) goto L_0x0698;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0696, code lost:
        if (r2.AGu(r32) != false) goto L_0x069d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0698, code lost:
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x069b, code lost:
        if ((r3 & 48) != 32) goto L_0x069e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x069d, code lost:
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x069e, code lost:
        r13 = r13 | r12;
        r11 = r2.ECw();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x06a3, code lost:
        if (r13 != false) goto L_0x06a7;
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x06a5, code lost:
        if (r11 != r0) goto L_0x06c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x06a7, code lost:
        r56 = new X.C58826IyB(r9, r6, r22, r32, r68, r70, r10, 0, r17, r19);
        r2.FLL(r56);
        r56 = r56;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x06c5, code lost:
        r13 = X.AnonymousClass5R5.A00(r4, (X.0sP) r11, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x06cd, code lost:
        if (r17 == false) goto L_0x06fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x06cf, code lost:
        if (r19 != false) goto L_0x06fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x06db, code lost:
        if (X.C51971G9r.A1W(((X.C285335Qw) r18).A00) == false) goto L_0x06fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x06eb, code lost:
        if (X.C285965Tk.A03(((X.C285965Tk) r9.A0E.getValue()).A00) == false) goto L_0x06fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x06ed, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x06fc, code lost:
        if (X.C285965Tk.A03(((X.C285965Tk) r9.A08.getValue()).A00) != false) goto L_0x06ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x06fe, code lost:
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x06ff, code lost:
        r53 = r4;
        r10 = X.C55294HfN.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0703, code lost:
        if (r11 == false) goto L_0x071c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0705, code lost:
        r53 = X.C287435a8.A02(r4, X.C287655aY.A00, new X.JJT(1, r68, r70, r9, r38));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x071c, code lost:
        r11 = r2.AGw(r6);
        r10 = r2.ECw();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0724, code lost:
        if (r11 != false) goto L_0x0728;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0726, code lost:
        if (r10 != r0) goto L_0x0730;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0728, code lost:
        r10 = X.J6M.A00(r6, 2);
        r2.FLL(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0730, code lost:
        X.C286645Xf.A03(r2, r6, (X.0sP) r10);
        r12 = X.AnonymousClass7TF.A1S(r26, 4) | X.C51971G9r.A1V(r2, r9, r21);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0746, code lost:
        if (r50 <= 32) goto L_0x0750;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x074e, code lost:
        if (r2.AGu(r32) != false) goto L_0x0755;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0750, code lost:
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0753, code lost:
        if ((r3 & 48) != 32) goto L_0x0756;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0755, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0756, code lost:
        r12 = r12 | r11;
        r11 = r2.ECw();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x075b, code lost:
        if (r12 != false) goto L_0x075f;
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x075d, code lost:
        if (r11 != r0) goto L_0x0773;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x075f, code lost:
        r56 = new X.C58769IxG(4, r9, r70, r21, r32);
        r2.FLL(r56);
        r56 = r56;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0773, code lost:
        X.C286645Xf.A03(r2, r32, (X.0sP) r11);
        r56 = new X.JHM(r9, r7, r6, r68, r70, r67, r32.A01, r52, X.AnonymousClass7TF.A1S(r36, 1));
        r7 = X.C287655aY.A00;
        r12 = X.C287435a8.A02(r4, r7, r56);
        r14 = X.C51971G9r.A1W(r48);
        r11 = r2.AGw(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x07ad, code lost:
        if (r50 <= 32) goto L_0x07b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x07b5, code lost:
        if (r2.AGu(r32) != false) goto L_0x07bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x07b7, code lost:
        r10 = r3 & 48;
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x07ba, code lost:
        if (r10 != 32) goto L_0x07bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x07bc, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x07bd, code lost:
        r3 = X.C51968G9o.A1T(r2, r20, r11, r3);
        r5 = r2.ECw();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x07c7, code lost:
        if (r3 != false) goto L_0x07cb;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x07c9, code lost:
        if (r5 != r0) goto L_0x07df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x07cb, code lost:
        r56 = new X.C58208IoC(1, r22, r9, r32, r20);
        r2.FLL(r56);
        r56 = r56;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x07df, code lost:
        r5 = (X.C62320sa) r5;
        r3 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x07e2, code lost:
        if (r14 == false) goto L_0x07f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x07e6, code lost:
        if (X.C55296HfP.A00 == false) goto L_0x07f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x07e8, code lost:
        r3 = X.C287195Zj.A09(r4.Ezh(new androidx.compose.foundation.text.handwriting.StylusHandwritingElementWithNegativePadding(r5)), 10.0f, 40.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x07f9, code lost:
        r5 = r24;
        r0 = X.C51970G9q.A0W(X.C287435a8.A02(r41.Ezh(new androidx.compose.foundation.text.input.internal.LegacyAdaptingPlatformTextInputModifier(r9, r20, r6)).Ezh(r3).Ezh(r49).Ezh(new androidx.compose.ui.input.key.KeyInputElement((X.0sP) null, new X.J6U(37, r23, r9))).Ezh(new androidx.compose.ui.input.key.KeyInputElement((X.0sP) null, new X.J6U(35, r6, r9))).Ezh(r12), r7, new X.C59360JGm(0, r5, r33, r17)).Ezh(r15).Ezh(r13), X.J6M.A00(r9, 3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x085c, code lost:
        if (r17 == false) goto L_0x08c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x0864, code lost:
        if (X.C51971G9r.A1W(r9.A0A) == false) goto L_0x08c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x086c, code lost:
        if (X.C51971G9r.A1W(r9.A0B) == false) goto L_0x08c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0878, code lost:
        if (X.C51971G9r.A1W(((X.C285335Qw) r18).A00) == false) goto L_0x08c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x087a, code lost:
        r66 = true;
        r4 = X.C287435a8.A02(r4, r7, X.JJQ.A00(r6, 10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0886, code lost:
        A05(r6, r2, r0, X.AnonymousClass5PI.A01(r2, new X.JDJ(r45, r9, r5, r6, r53, r54, r55, r4, r39, r68, r70, r35, r31, r42, r37, r43, r36, r66, r19), -374338080), 384);
        r38 = r38;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x08bb, code lost:
        if (X.0fL.A02() == false) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x08bd, code lost:
        X.0fL.A00(881782849);
        r38 = r38;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x08c5, code lost:
        r66 = false;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00b8, code lost:
        if (r2.AGu(r32) == false) goto L_0x00ba;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x0956  */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x0963  */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x0976  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x0989  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x0998  */
    /* JADX WARNING: Removed duplicated region for block: B:358:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x012c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C287605aT r51, X.I4S r52, X.C286575Wy r53, androidx.compose.ui.Modifier r54, X.C304786Ff r55, X.AnonymousClass5Z4 r56, X.C286145Uc r57, X.C285975Tl r58, X.C59648JRq r59, X.0sP r60, X.0sP r61, X.0sK r62, int r63, int r64, int r65, int r66, int r67, boolean r68, boolean r69, boolean r70) {
        /*
            r37 = r62
            r41 = r54
            r39 = r56
            r32 = r57
            r35 = r59
            r34 = r52
            r42 = r61
            r33 = r51
            r43 = r64
            r17 = r69
            r38 = r55
            r36 = r63
            r25 = r68
            r19 = r70
            r0 = -958708118(0xffffffffc6db466a, float:-28067.207)
            r2 = r53
            r2.ExV(r0)
            r1 = r67
            r0 = r67 & 1
            r70 = r58
            r8 = r65
            if (r0 == 0) goto L_0x09eb
            r7 = r65 | 6
        L_0x0030:
            r0 = r67 & 2
            r69 = r60
            if (r0 == 0) goto L_0x09de
            r7 = r7 | 48
        L_0x0038:
            r23 = r67 & 4
            if (r23 == 0) goto L_0x09d1
            r7 = r7 | 384(0x180, float:5.38E-43)
        L_0x003e:
            r22 = r67 & 8
            r6 = 1024(0x400, float:1.435E-42)
            if (r22 == 0) goto L_0x09c4
            r7 = r7 | 3072(0xc00, float:4.305E-42)
        L_0x0046:
            r21 = r67 & 16
            r14 = 8192(0x2000, float:1.14794E-41)
            if (r21 == 0) goto L_0x09b7
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
        L_0x004e:
            r20 = r67 & 32
            r18 = 196608(0x30000, float:2.75506E-40)
            if (r20 == 0) goto L_0x09aa
            r7 = r7 | r18
        L_0x0056:
            r15 = r67 & 64
            r0 = 1572864(0x180000, float:2.204052E-39)
            if (r15 != 0) goto L_0x0066
            r0 = r65 & r0
            if (r0 != 0) goto L_0x0067
            r0 = r33
            int r0 = X.G9t.A0U(r2, r0)
        L_0x0066:
            r7 = r7 | r0
        L_0x0067:
            r5 = r1 & 128(0x80, float:1.794E-43)
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            if (r5 != 0) goto L_0x0077
            r0 = r65 & r0
            if (r0 != 0) goto L_0x0078
            r0 = r38
            int r0 = X.G9t.A0V(r2, r0)
        L_0x0077:
            r7 = r7 | r0
        L_0x0078:
            r13 = r1 & 256(0x100, float:3.59E-43)
            r0 = 100663296(0x6000000, float:2.4074124E-35)
            if (r13 != 0) goto L_0x0088
            r0 = r65 & r0
            if (r0 != 0) goto L_0x0089
            r0 = r25
            int r0 = X.G9t.A0g(r2, r0)
        L_0x0088:
            r7 = r7 | r0
        L_0x0089:
            r12 = r1 & 512(0x200, float:7.175E-43)
            r3 = 805306368(0x30000000, float:4.656613E-10)
            if (r12 != 0) goto L_0x009f
            r0 = r65 & r3
            if (r0 != 0) goto L_0x00a0
            r0 = r36
            boolean r0 = r2.AGs(r0)
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            if (r0 == 0) goto L_0x009f
            r3 = 536870912(0x20000000, float:1.0842022E-19)
        L_0x009f:
            r7 = r7 | r3
        L_0x00a0:
            r11 = r1 & 1024(0x400, float:1.435E-42)
            r16 = r66
            if (r11 == 0) goto L_0x0998
            r3 = r66 | 6
        L_0x00a8:
            r0 = r66 & 48
            if (r0 != 0) goto L_0x00bd
            r0 = r1 & 2048(0x800, float:2.87E-42)
            if (r0 != 0) goto L_0x00ba
            r0 = r32
            boolean r4 = r2.AGu(r0)
            r0 = 32
            if (r4 != 0) goto L_0x00bc
        L_0x00ba:
            r0 = 16
        L_0x00bc:
            r3 = r3 | r0
        L_0x00bd:
            r10 = r1 & 4096(0x1000, float:5.74E-42)
            if (r10 == 0) goto L_0x0989
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x00c3:
            r9 = r1 & 8192(0x2000, float:1.14794E-41)
            if (r9 == 0) goto L_0x0976
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x00c9:
            r6 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r6 == 0) goto L_0x0963
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x00cf:
            r0 = 32768(0x8000, float:4.5918E-41)
            r14 = r67 & r0
            if (r14 == 0) goto L_0x0956
            r3 = r3 | r18
        L_0x00d8:
            r0 = 306783379(0x12492493, float:6.34695E-28)
            r4 = r7 & r0
            r0 = 306783378(0x12492492, float:6.3469493E-28)
            if (r4 != r0) goto L_0x012c
            r4 = 74899(0x12493, float:1.04956E-40)
            r4 = r4 & r3
            r0 = 74898(0x12492, float:1.04954E-40)
            if (r4 != r0) goto L_0x012c
            boolean r0 = r2.Bwn()
            if (r0 == 0) goto L_0x012c
            r2.Evl()
        L_0x00f4:
            X.5Xd r2 = r2.ASQ()
            if (r2 == 0) goto L_0x012b
            r61 = 1
            X.JDW r0 = new X.JDW
            r44 = r0
            r45 = r70
            r46 = r69
            r47 = r41
            r48 = r39
            r49 = r35
            r50 = r42
            r51 = r33
            r52 = r38
            r53 = r32
            r54 = r34
            r55 = r37
            r56 = r36
            r57 = r43
            r58 = r8
            r59 = r16
            r60 = r1
            r62 = r25
            r63 = r17
            r64 = r19
            r44.<init>(r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64)
            r2.A06 = r0
        L_0x012b:
            return
        L_0x012c:
            r2.Ewr()
            r0 = r65 & 1
            if (r0 == 0) goto L_0x090a
            boolean r0 = r2.Aw3()
            if (r0 != 0) goto L_0x090a
            r2.Evl()
            r0 = r1 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0142
            r3 = r3 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0142:
            boolean r0 = X.C51967G9n.A1S(r2)
            if (r0 == 0) goto L_0x0150
            r4 = -629482081(0xffffffffda7add9f, float:-1.76531048E16)
            java.lang.String r0 = "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:220)"
            X.0fL.A01(r4, r0)
        L_0x0150:
            java.lang.Object r4 = r2.ECw()
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            java.lang.Object r22 = X.C51972G9s.A0k(r2, r4, r0)
            r4 = r22
            X.I1b r4 = (X.C56547I1b) r4
            r22 = r4
            java.lang.Object r20 = r2.ECw()
            r4 = r20
            if (r4 != r0) goto L_0x0172
            X.Gb9 r20 = new X.Gb9
            r20.<init>()
            r4 = r20
            r2.FLL(r4)
        L_0x0172:
            r4 = r20
            X.Gb9 r4 = (X.C52697Gb9) r4
            r20 = r4
            java.lang.Object r21 = r2.ECw()
            r4 = r21
            if (r4 != r0) goto L_0x018c
            X.5Ui r21 = new X.5Ui
            r5 = r20
            r4 = r21
            r4.<init>(r5)
            r2.FLL(r4)
        L_0x018c:
            r4 = r21
            X.5Ui r4 = (X.C286205Ui) r4
            r21 = r4
            X.4cd r31 = X.C51970G9q.A0a(r2)
            X.4bM r4 = X.AnonymousClass5YA.A03
            java.lang.Object r4 = r2.AJO(r4)
            X.5Uu r4 = (X.C286305Uu) r4
            X.4bM r5 = X.C55373Hgf.A01
            java.lang.Object r5 = r2.AJO(r5)
            X.HsJ r5 = (X.C56070HsJ) r5
            long r14 = r5.A00
            X.4bM r5 = X.AnonymousClass5YA.A02
            java.lang.Object r23 = r2.AJO(r5)
            r5 = r23
            X.5Qa r5 = (X.C285165Qa) r5
            r23 = r5
            X.4bM r5 = X.AnonymousClass5YA.A0E
            java.lang.Object r18 = r2.AJO(r5)
            r5 = r18
            X.5Qx r5 = (X.C285345Qx) r5
            r18 = r5
            X.4bM r5 = X.AnonymousClass5YA.A0A
            java.lang.Object r5 = r2.AJO(r5)
            X.5Uk r5 = (X.C286225Uk) r5
            r28 = 1
            r9 = r36
            r6 = r28
            if (r9 != r6) goto L_0x0906
            if (r25 != 0) goto L_0x0906
            r6 = r32
            boolean r6 = r6.A05
            if (r6 == 0) goto L_0x0906
            X.6Gj r10 = X.AnonymousClass6Gj.Horizontal
        L_0x01da:
            r30 = 0
            java.lang.Object[] r47 = new java.lang.Object[]{r10}
            X.5Tp r45 = X.I4L.A05
            r29 = 0
            boolean r9 = r2.AGu(r10)
            java.lang.Object r6 = r2.ECw()
            if (r9 != 0) goto L_0x01f0
            if (r6 != r0) goto L_0x01fa
        L_0x01f0:
            r9 = 26
            X.Ivr r6 = new X.Ivr
            r6.<init>(r10, r9)
            r2.FLL(r6)
        L_0x01fa:
            X.0sa r6 = (X.C62320sa) r6
            r27 = 4
            r44 = r2
            r46 = r6
            r48 = r30
            r49 = r27
            java.lang.Object r24 = X.C305136Gr.A00(r44, r45, r46, r47, r48, r49)
            r6 = r24
            X.I4L r6 = (X.I4L) r6
            r24 = r6
            r26 = r7 & 14
            r9 = r26
            r6 = r27
            boolean r9 = X.AnonymousClass7TF.A1S(r9, r6)
            r40 = 57344(0xe000, float:8.0356E-41)
            r7 = r7 & r40
            boolean r6 = X.C51972G9s.A1K(r7)
            r6 = r6 | r9
            java.lang.Object r10 = r2.ECw()
            if (r6 != 0) goto L_0x022c
            if (r10 != r0) goto L_0x028a
        L_0x022c:
            r6 = r70
            X.5Tq r7 = r6.A01
            r6 = r35
            X.HsL r10 = X.I5K.A00(r7, r6)
            r6 = r70
            X.5Tk r6 = r6.A02
            if (r6 == 0) goto L_0x0287
            long r6 = r6.A00
            X.JS3 r9 = r10.A01
            int r11 = X.C51965G9l.A04(r6)
            int r12 = r9.E1S(r11)
            int r6 = X.C51968G9o.A02(r6)
            int r6 = r9.E1S(r6)
            int r11 = java.lang.Math.min(r12, r6)
            int r7 = java.lang.Math.max(r12, r6)
            X.5Tq r6 = r10.A00
            X.6Bd r10 = X.C51969G9p.A0b()
            r10.A05(r6)
            X.5ht r49 = X.C291795ht.A03
            r51 = 0
            r50 = 61439(0xefff, float:8.6094E-41)
            X.5ZB r6 = new X.5ZB
            r44 = r6
            r45 = r29
            r46 = r29
            r47 = r29
            r48 = r29
            r53 = r51
            r55 = r51
            r44.<init>(r45, r46, r47, r48, r49, r50, r51, r53, r55)
            r10.A06(r6, r11, r7)
            X.5Tq r6 = r10.A02()
            X.HsL r10 = new X.HsL
            r10.<init>(r6, r9)
        L_0x0287:
            r2.FLL(r10)
        L_0x028a:
            X.HsL r10 = (X.C56072HsL) r10
            X.5Tq r6 = r10.A00
            X.JS3 r7 = r10.A01
            r68 = r7
            boolean r7 = X.0fL.A02()
            if (r7 == 0) goto L_0x02a0
            r9 = -492376013(0xffffffffe2a6f033, float:-1.5397338E21)
            java.lang.String r7 = "androidx.compose.runtime.<get-currentRecomposeScope> (Composables.kt:196)"
            X.0fL.A01(r9, r7)
        L_0x02a0:
            r7 = r2
            X.5Wx r7 = (X.C286565Wx) r7
            X.5Xd r11 = r7.A0O()
            if (r11 == 0) goto L_0x09fc
            int r7 = r11.A01
            r7 = r7 | 1
            r11.A01 = r7
            boolean r7 = X.0fL.A02()
            if (r7 == 0) goto L_0x02bb
            r7 = -816227286(0xffffffffcf595c2a, float:-3.64669594E9)
            X.0fL.A00(r7)
        L_0x02bb:
            boolean r7 = r2.AGu(r5)
            java.lang.Object r9 = r2.ECw()
            if (r7 != 0) goto L_0x02c7
            if (r9 != r0) goto L_0x02e2
        L_0x02c7:
            X.0sn r49 = X.0sn.A00
            X.Hr4 r7 = new X.Hr4
            r44 = r7
            r45 = r6
            r46 = r39
            r47 = r4
            r48 = r31
            r50 = r25
            r44.<init>(r45, r46, r47, r48, r49, r50)
            X.Gc7 r9 = new X.Gc7
            r9.<init>(r7, r11, r5)
            r2.FLL(r9)
        L_0x02e2:
            X.Gc7 r9 = (X.C52754Gc7) r9
            r5 = r70
            X.5Tq r13 = r5.A01
            r5 = r69
            r9.A05 = r5
            r9.A00 = r14
            X.Hlp r7 = r9.A07
            r5 = r34
            r7.A00 = r5
            r5 = r23
            r7.A01 = r5
            r9.A03 = r13
            X.Hr4 r11 = r9.A01
            X.0sn r7 = X.0sn.A00
            X.5Tq r5 = r11.A02
            boolean r5 = X.0qQ.A0K(r5, r6)
            if (r5 == 0) goto L_0x032c
            X.5Z4 r12 = r11.A03
            r5 = r39
            boolean r5 = X.0qQ.A0K(r12, r5)
            if (r5 == 0) goto L_0x032c
            boolean r12 = r11.A07
            r5 = r25
            if (r12 != r5) goto L_0x032c
            X.4cd r12 = r11.A05
            r5 = r31
            boolean r5 = X.0qQ.A0K(r12, r5)
            if (r5 == 0) goto L_0x032c
            java.util.List r5 = r11.A06
            boolean r5 = X.0qQ.A0K(r5, r7)
            if (r5 == 0) goto L_0x032c
            X.5Uu r5 = r11.A04
            if (r5 == r4) goto L_0x033f
        L_0x032c:
            X.Hr4 r11 = new X.Hr4
            r44 = r11
            r45 = r6
            r46 = r39
            r47 = r4
            r48 = r31
            r49 = r7
            r50 = r25
            r44.<init>(r45, r46, r47, r48, r49, r50)
        L_0x033f:
            X.Hr4 r4 = r9.A01
            if (r4 == r11) goto L_0x0347
            r4 = r28
            r9.A06 = r4
        L_0x0347:
            r9.A01 = r11
            X.Hpp r12 = r9.A0M
            X.Hpq r4 = r9.A04
            r47 = r4
            r44 = r70
            r4 = r70
            X.5Tk r6 = r4.A02
            X.Htn r4 = r12.A00
            int r5 = r4.A01
            r11 = -1
            if (r5 == r11) goto L_0x0903
            int r4 = r4.A00
            long r4 = X.C3026964x.A00(r5, r4)
            X.5Tk r7 = new X.5Tk
            r7.<init>(r4)
        L_0x0367:
            boolean r4 = X.0qQ.A0K(r6, r7)
            r15 = 1
            r46 = r4 ^ 1
            X.5Tl r4 = r12.A01
            X.5Tq r4 = r4.A01
            boolean r4 = X.0qQ.A0K(r4, r13)
            r45 = 0
            if (r4 != 0) goto L_0x08e1
            r4 = r70
            long r4 = r4.A00
            X.Htn r7 = new X.Htn
            r7.<init>(r13, r4)
            r12.A00 = r7
        L_0x0385:
            if (r6 != 0) goto L_0x08c8
            X.Htn r6 = r12.A00
            r6.A01 = r11
            r6.A00 = r11
        L_0x038d:
            if (r15 != 0) goto L_0x0393
            if (r45 != 0) goto L_0x03a2
            if (r46 == 0) goto L_0x03a2
        L_0x0393:
            X.Htn r6 = r12.A00
            r6.A01 = r11
            r6.A00 = r11
            X.5Tl r44 = new X.5Tl
            r7 = r29
            r6 = r44
            r6.<init>(r13, r7, r4)
        L_0x03a2:
            X.5Tl r5 = r12.A01
            r4 = r44
            r12.A01 = r4
            if (r47 == 0) goto L_0x03af
            r6 = r47
            r6.A00(r5, r4)
        L_0x03af:
            java.lang.Object r7 = r2.ECw()
            if (r7 != r0) goto L_0x03bd
            X.Hqj r7 = new X.Hqj
            r7.<init>()
            r2.FLL(r7)
        L_0x03bd:
            X.Hqj r7 = (X.C55978Hqj) r7
            long r13 = java.lang.System.currentTimeMillis()
            boolean r4 = r7.A04
            if (r4 != 0) goto L_0x03d4
            java.lang.Long r4 = r7.A03
            long r11 = X.DbY.A04(r4)
            r4 = 5000(0x1388, double:2.4703E-320)
            long r11 = r11 + r4
            int r4 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r4 <= 0) goto L_0x03df
        L_0x03d4:
            java.lang.Long r4 = java.lang.Long.valueOf(r13)
            r7.A03 = r4
            r4 = r70
            r7.A00(r4)
        L_0x03df:
            java.lang.Object r6 = r2.ECw()
            if (r6 != r0) goto L_0x03ed
            X.Gb5 r6 = new X.Gb5
            r6.<init>(r7)
            r2.FLL(r6)
        L_0x03ed:
            X.Gb5 r6 = (X.C52693Gb5) r6
            r4 = r68
            r6.A08 = r4
            r4 = r35
            r6.A0A = r4
            X.0sP r4 = r9.A0O
            r67 = r4
            r6.A0C = r4
            r6.A03 = r9
            X.5Oz r5 = r6.A0K
            r4 = r70
            r5.Epw(r4)
            X.4bM r4 = X.AnonymousClass5YA.A00
            java.lang.Object r4 = r2.AJO(r4)
            X.5TC r4 = (X.AnonymousClass5TC) r4
            r6.A06 = r4
            X.4bM r4 = X.AnonymousClass5YA.A0B
            java.lang.Object r4 = r2.AJO(r4)
            X.5VM r4 = (X.AnonymousClass5VM) r4
            r6.A07 = r4
            X.4bM r4 = X.AnonymousClass5YA.A05
            java.lang.Object r4 = r2.AJO(r4)
            X.5V6 r4 = (X.AnonymousClass5V6) r4
            r6.A05 = r4
            r4 = r22
            r6.A04 = r4
            r52 = r19 ^ 1
            X.5Oz r5 = r6.A0I
            r4 = r52
            X.C51967G9n.A16(r5, r4)
            X.5Oz r5 = r6.A0J
            r4 = r17
            X.C51967G9n.A16(r5, r4)
            java.lang.Object r4 = r2.ECw()
            java.lang.Object r4 = X.C51974G9v.A0Y(r2, r4, r0)
            X.6FV r4 = (X.AnonymousClass6FV) r4
            X.4Cq r4 = r4.A00
            r15 = r4
            java.lang.Object r45 = r2.ECw()
            r4 = r45
            if (r4 != r0) goto L_0x0457
            androidx.compose.foundation.relocation.BringIntoViewRequesterImpl r45 = new androidx.compose.foundation.relocation.BringIntoViewRequesterImpl
            r45.<init>()
            r4 = r45
            r2.FLL(r4)
        L_0x0457:
            r4 = r45
            X.MRL r4 = (X.MRL) r4
            r45 = r4
            X.5Qk r4 = androidx.compose.ui.Modifier.A00
            boolean r12 = r2.AGw(r9)
            r5 = r3 & 7168(0x1c00, float:1.0045E-41)
            r64 = r5
            r51 = 2048(0x800, float:2.87E-42)
            r11 = r5
            r5 = r51
            boolean r5 = X.AnonymousClass7TF.A1S(r11, r5)
            r12 = r12 | r5
            r40 = r40 & r3
            boolean r11 = X.C51972G9s.A1K(r40)
            r5 = r21
            boolean r12 = X.C51968G9o.A1T(r2, r5, r12, r11)
            r11 = r26
            r5 = r27
            boolean r13 = X.AnonymousClass7TF.A1S(r11, r5)
            r13 = r13 | r12
            r5 = r3 & 112(0x70, float:1.57E-43)
            r50 = r5 ^ 48
            r5 = 32
            r11 = r50
            if (r11 <= r5) goto L_0x0498
            r11 = r32
            boolean r11 = r2.AGu(r11)
            if (r11 != 0) goto L_0x049d
        L_0x0498:
            r11 = r3 & 48
            r14 = 0
            if (r11 != r5) goto L_0x049e
        L_0x049d:
            r14 = 1
        L_0x049e:
            r12 = r68
            boolean r12 = X.C51973G9u.A1T(r2, r12, r15, r13, r14)
            r11 = r45
            boolean r11 = X.G9t.A1a(r2, r11, r6, r12)
            java.lang.Object r13 = r2.ECw()
            if (r11 != 0) goto L_0x04b2
            if (r13 != r0) goto L_0x04d0
        L_0x04b2:
            X.Iy6 r13 = new X.Iy6
            r53 = r13
            r54 = r45
            r55 = r9
            r56 = r6
            r57 = r32
            r58 = r68
            r59 = r70
            r60 = r21
            r61 = r15
            r62 = r17
            r63 = r19
            r53.<init>(r54, r55, r56, r57, r58, r59, r60, r61, r62, r63)
            r2.FLL(r13)
        L_0x04d0:
            X.0sP r13 = (X.0sP) r13
            r11 = r22
            androidx.compose.ui.Modifier r12 = X.C51970G9q.A0U(r4, r11)
            androidx.compose.ui.focus.FocusChangedElement r11 = new androidx.compose.ui.focus.FocusChangedElement
            r11.<init>(r13)
            androidx.compose.ui.Modifier r13 = r12.Ezh(r11)
            r12 = r33
            r11 = r17
            androidx.compose.ui.Modifier r49 = X.C288275be.A00(r12, r13, r11)
            if (r17 == 0) goto L_0x04ee
            r11 = 1
            if (r19 == 0) goto L_0x04ef
        L_0x04ee:
            r11 = 0
        L_0x04ef:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            X.5Oz r48 = X.C287175Zh.A00(r2, r11)
            X.0gF r12 = X.C60340gF.A00
            r11 = r48
            boolean r14 = r2.AGu(r11)
            boolean r13 = r2.AGw(r9)
            r11 = r21
            boolean r14 = X.C51973G9u.A1T(r2, r11, r6, r14, r13)
            r11 = r50
            if (r11 <= r5) goto L_0x0515
            r11 = r32
            boolean r11 = r2.AGu(r11)
            if (r11 != 0) goto L_0x051a
        L_0x0515:
            r11 = r3 & 48
            r13 = 0
            if (r11 != r5) goto L_0x051b
        L_0x051a:
            r13 = 1
        L_0x051b:
            r13 = r13 | r14
            java.lang.Object r11 = r2.ECw()
            if (r13 != 0) goto L_0x0524
            if (r11 != r0) goto L_0x053c
        L_0x0524:
            r60 = 2
            X.JUk r11 = new X.JUk
            r53 = r11
            r54 = r32
            r55 = r48
            r56 = r21
            r57 = r6
            r58 = r9
            r59 = r29
            r53.<init>((java.lang.Object) r54, (java.lang.Object) r55, (java.lang.Object) r56, (java.lang.Object) r57, (java.lang.Object) r58, (X.AnonymousClass4D7) r59, (int) r60)
            r2.FLL(r11)
        L_0x053c:
            X.0sL r11 = (X.0sL) r11
            r47 = 6
            X.C286645Xf.A04(r2, r12, r11)
            boolean r11 = r2.AGw(r9)
            java.lang.Object r15 = r2.ECw()
            if (r11 != 0) goto L_0x054f
            if (r15 != r0) goto L_0x0558
        L_0x054f:
            r11 = r27
            X.J6M r15 = X.J6M.A00(r9, r11)
            r2.FLL(r15)
        L_0x0558:
            r11 = 8675309(0x845fed, float:1.2156697E-38)
            java.lang.Integer r44 = java.lang.Integer.valueOf(r11)
            r12 = 17
            r11 = 42
            X.MH2 r14 = new X.MH2
            r13 = r29
            r14.<init>((java.lang.Object) r15, (X.AnonymousClass4D7) r13, (int) r12, (int) r11)
            r11 = r44
            androidx.compose.ui.Modifier r46 = X.C304916Fs.A00(r4, r11, r14)
            boolean r13 = r2.AGw(r9)
            boolean r11 = X.C51972G9s.A1K(r40)
            r13 = r13 | r11
            r12 = r64
            r11 = r51
            boolean r12 = X.AnonymousClass7TF.A1S(r12, r11)
            r11 = r68
            boolean r11 = X.C51973G9u.A1T(r2, r11, r6, r12, r13)
            java.lang.Object r14 = r2.ECw()
            if (r11 != 0) goto L_0x058f
            if (r14 != r0) goto L_0x05a7
        L_0x058f:
            X.Ixi r14 = new X.Ixi
            r53 = r14
            r54 = r9
            r55 = r22
            r56 = r6
            r57 = r68
            r58 = r30
            r59 = r19
            r60 = r17
            r53.<init>(r54, r55, r56, r57, r58, r59, r60)
            r2.FLL(r14)
        L_0x05a7:
            if (r17 == 0) goto L_0x05bb
            X.JJU r11 = new X.JJU
            r13 = r27
            r12 = r33
            r11.<init>(r13, r12, r14)
            X.0sP r13 = X.C287655aY.A00
            r12 = r11
            r11 = r46
            androidx.compose.ui.Modifier r46 = X.C287435a8.A02(r11, r13, r12)
        L_0x05bb:
            X.JLM r11 = r6.A0F
            r15 = r11
            X.JQx r11 = r6.A0E
            r53 = r11
            r11 = 12
            X.MHP r44 = new X.MHP
            r14 = r53
            r13 = r29
            r12 = r44
            r12.<init>((java.lang.Object) r15, (java.lang.Object) r14, (X.AnonymousClass4D7) r13, (int) r11)
            androidx.compose.ui.input.pointer.SuspendPointerInputElement r14 = new androidx.compose.ui.input.pointer.SuspendPointerInputElement
            r12 = r53
            r11 = r44
            r14.<init>(r15, r12, r11)
            r11 = r46
            androidx.compose.ui.Modifier r13 = r11.Ezh(r14)
            X.5Wj r12 = X.C55295HfO.A00
            androidx.compose.ui.input.pointer.PointerHoverIconModifierElement r11 = new androidx.compose.ui.input.pointer.PointerHoverIconModifierElement
            r11.<init>(r12)
            androidx.compose.ui.Modifier r15 = r13.Ezh(r11)
            boolean r13 = r2.AGw(r9)
            r12 = r26
            r11 = r27
            boolean r12 = X.AnonymousClass7TF.A1S(r12, r11)
            r11 = r68
            boolean r11 = X.C51968G9o.A1T(r2, r11, r13, r12)
            java.lang.Object r14 = r2.ECw()
            if (r11 != 0) goto L_0x0603
            if (r14 != r0) goto L_0x0611
        L_0x0603:
            X.Iwy r14 = new X.Iwy
            r13 = r47
            r12 = r68
            r11 = r70
            r14.<init>(r13, r12, r11, r9)
            r2.FLL(r14)
        L_0x0611:
            X.0sP r14 = (X.0sP) r14
            androidx.compose.ui.Modifier r54 = X.C289575dp.A00(r4, r14)
            boolean r13 = r2.AGw(r9)
            r12 = r64
            r11 = r51
            boolean r12 = X.AnonymousClass7TF.A1S(r12, r11)
            r12 = r12 | r13
            r11 = r18
            boolean r11 = r2.AGu(r11)
            boolean r13 = X.C51968G9o.A1T(r2, r6, r12, r11)
            r12 = r26
            r11 = r27
            boolean r12 = X.AnonymousClass7TF.A1S(r12, r11)
            r11 = r68
            boolean r12 = X.C51968G9o.A1T(r2, r11, r13, r12)
            java.lang.Object r11 = r2.ECw()
            if (r12 != 0) goto L_0x0644
            if (r11 != r0) goto L_0x065c
        L_0x0644:
            X.Ixj r11 = new X.Ixj
            r55 = r11
            r56 = r30
            r57 = r9
            r58 = r18
            r59 = r6
            r60 = r70
            r61 = r68
            r62 = r17
            r55.<init>(r56, r57, r58, r59, r60, r61, r62)
            r2.FLL(r11)
        L_0x065c:
            X.0sP r11 = (X.0sP) r11
            androidx.compose.ui.Modifier r55 = X.C51970G9q.A0W(r4, r11)
            boolean r12 = r2.AGw(r10)
            r13 = r26
            r11 = r27
            boolean r11 = X.AnonymousClass7TF.A1S(r13, r11)
            r12 = r12 | r11
            r13 = r64
            r11 = r51
            boolean r11 = X.AnonymousClass7TF.A1S(r13, r11)
            r12 = r12 | r11
            r11 = r30
            boolean r13 = X.C51966G9m.A1V(r2, r11, r12)
            boolean r12 = X.C51972G9s.A1K(r40)
            r11 = r68
            boolean r11 = X.C51973G9u.A1T(r2, r9, r11, r13, r12)
            boolean r13 = X.C51966G9m.A1U(r2, r6, r11)
            r11 = r50
            if (r11 <= r5) goto L_0x0698
            r11 = r32
            boolean r11 = r2.AGu(r11)
            if (r11 != 0) goto L_0x069d
        L_0x0698:
            r11 = r3 & 48
            r12 = 0
            if (r11 != r5) goto L_0x069e
        L_0x069d:
            r12 = 1
        L_0x069e:
            r13 = r13 | r12
            java.lang.Object r11 = r2.ECw()
            if (r13 != 0) goto L_0x06a7
            if (r11 != r0) goto L_0x06c5
        L_0x06a7:
            X.IyB r11 = new X.IyB
            r56 = r11
            r57 = r9
            r58 = r6
            r59 = r22
            r60 = r32
            r61 = r68
            r62 = r70
            r63 = r10
            r64 = r30
            r65 = r17
            r66 = r19
            r56.<init>(r57, r58, r59, r60, r61, r62, r63, r64, r65, r66)
            r2.FLL(r11)
        L_0x06c5:
            X.0sP r11 = (X.0sP) r11
            r10 = r28
            androidx.compose.ui.Modifier r13 = X.AnonymousClass5R5.A00(r4, r11, r10)
            if (r17 == 0) goto L_0x06fe
            if (r19 != 0) goto L_0x06fe
            r10 = r18
            X.5Qw r10 = (X.C285335Qw) r10
            X.5Oz r10 = r10.A00
            boolean r10 = X.C51971G9r.A1W(r10)
            if (r10 == 0) goto L_0x06fe
            X.5Oz r10 = r9.A0E
            java.lang.Object r10 = r10.getValue()
            X.5Tk r10 = (X.C285965Tk) r10
            long r10 = r10.A00
            boolean r10 = X.C285965Tk.A03(r10)
            if (r10 == 0) goto L_0x06fe
            X.5Oz r10 = r9.A08
            java.lang.Object r10 = r10.getValue()
            X.5Tk r10 = (X.C285965Tk) r10
            long r10 = r10.A00
            boolean r10 = X.C285965Tk.A03(r10)
            r11 = 1
            if (r10 != 0) goto L_0x06ff
        L_0x06fe:
            r11 = 0
        L_0x06ff:
            r53 = r4
            X.5b9 r10 = X.C55294HfN.A00
            if (r11 == 0) goto L_0x071c
            X.JJT r11 = new X.JJT
            r56 = r11
            r57 = r28
            r58 = r68
            r59 = r70
            r60 = r9
            r61 = r38
            r56.<init>(r57, r58, r59, r60, r61)
            X.0sP r10 = X.C287655aY.A00
            androidx.compose.ui.Modifier r53 = X.C287435a8.A02(r4, r10, r11)
        L_0x071c:
            boolean r11 = r2.AGw(r6)
            java.lang.Object r10 = r2.ECw()
            if (r11 != 0) goto L_0x0728
            if (r10 != r0) goto L_0x0730
        L_0x0728:
            r10 = 2
            X.J6M r10 = X.J6M.A00(r6, r10)
            r2.FLL(r10)
        L_0x0730:
            X.0sP r10 = (X.0sP) r10
            X.C286645Xf.A03(r2, r6, r10)
            r10 = r21
            boolean r14 = X.C51971G9r.A1V(r2, r9, r10)
            r11 = r26
            r10 = r27
            boolean r12 = X.AnonymousClass7TF.A1S(r11, r10)
            r12 = r12 | r14
            r10 = r50
            if (r10 <= r5) goto L_0x0750
            r10 = r32
            boolean r10 = r2.AGu(r10)
            if (r10 != 0) goto L_0x0755
        L_0x0750:
            r10 = r3 & 48
            r11 = 0
            if (r10 != r5) goto L_0x0756
        L_0x0755:
            r11 = 1
        L_0x0756:
            r12 = r12 | r11
            java.lang.Object r11 = r2.ECw()
            if (r12 != 0) goto L_0x075f
            if (r11 != r0) goto L_0x0773
        L_0x075f:
            X.IxG r11 = new X.IxG
            r56 = r11
            r57 = r27
            r58 = r9
            r59 = r70
            r60 = r21
            r61 = r32
            r56.<init>(r57, r58, r59, r60, r61)
            r2.FLL(r11)
        L_0x0773:
            X.0sP r11 = (X.0sP) r11
            r10 = r32
            X.C286645Xf.A03(r2, r10, r11)
            r11 = r36
            r10 = r28
            boolean r65 = X.AnonymousClass7TF.A1S(r11, r10)
            r10 = r32
            int r11 = r10.A01
            X.JHM r10 = new X.JHM
            r56 = r10
            r57 = r9
            r58 = r7
            r59 = r6
            r60 = r68
            r61 = r70
            r62 = r67
            r63 = r11
            r64 = r52
            r56.<init>(r57, r58, r59, r60, r61, r62, r63, r64, r65)
            X.0sP r7 = X.C287655aY.A00
            androidx.compose.ui.Modifier r12 = X.C287435a8.A02(r4, r7, r10)
            boolean r14 = X.C51971G9r.A1W(r48)
            boolean r11 = r2.AGw(r9)
            r10 = r50
            if (r10 <= r5) goto L_0x07b7
            r10 = r32
            boolean r10 = r2.AGu(r10)
            if (r10 != 0) goto L_0x07bc
        L_0x07b7:
            r10 = r3 & 48
            r3 = 0
            if (r10 != r5) goto L_0x07bd
        L_0x07bc:
            r3 = 1
        L_0x07bd:
            r5 = r20
            boolean r3 = X.C51968G9o.A1T(r2, r5, r11, r3)
            java.lang.Object r5 = r2.ECw()
            if (r3 != 0) goto L_0x07cb
            if (r5 != r0) goto L_0x07df
        L_0x07cb:
            X.IoC r5 = new X.IoC
            r56 = r5
            r57 = r28
            r58 = r22
            r59 = r9
            r60 = r32
            r61 = r20
            r56.<init>(r57, r58, r59, r60, r61)
            r2.FLL(r5)
        L_0x07df:
            X.0sa r5 = (X.C62320sa) r5
            r3 = r4
            if (r14 == 0) goto L_0x07f9
            boolean r0 = X.C55296HfP.A00
            if (r0 == 0) goto L_0x07f9
            androidx.compose.foundation.text.handwriting.StylusHandwritingElementWithNegativePadding r0 = new androidx.compose.foundation.text.handwriting.StylusHandwritingElementWithNegativePadding
            r0.<init>(r5)
            androidx.compose.ui.Modifier r5 = r4.Ezh(r0)
            r3 = 1092616192(0x41200000, float:10.0)
            r0 = 1109393408(0x42200000, float:40.0)
            androidx.compose.ui.Modifier r3 = X.C287195Zj.A09(r5, r3, r0)
        L_0x07f9:
            androidx.compose.foundation.text.input.internal.LegacyAdaptingPlatformTextInputModifier r5 = new androidx.compose.foundation.text.input.internal.LegacyAdaptingPlatformTextInputModifier
            r0 = r20
            r5.<init>(r9, r0, r6)
            r0 = r41
            androidx.compose.ui.Modifier r0 = r0.Ezh(r5)
            androidx.compose.ui.Modifier r3 = r0.Ezh(r3)
            r0 = r49
            androidx.compose.ui.Modifier r5 = r3.Ezh(r0)
            r10 = 37
            X.J6U r3 = new X.J6U
            r0 = r23
            r3.<init>(r10, r0, r9)
            androidx.compose.ui.input.key.KeyInputElement r10 = new androidx.compose.ui.input.key.KeyInputElement
            r0 = r29
            r10.<init>(r0, r3)
            androidx.compose.ui.Modifier r10 = r5.Ezh(r10)
            r0 = 35
            X.J6U r5 = new X.J6U
            r5.<init>(r0, r6, r9)
            androidx.compose.ui.input.key.KeyInputElement r3 = new androidx.compose.ui.input.key.KeyInputElement
            r0 = r29
            r3.<init>(r0, r5)
            androidx.compose.ui.Modifier r0 = r10.Ezh(r3)
            androidx.compose.ui.Modifier r12 = r0.Ezh(r12)
            X.JGm r11 = new X.JGm
            r10 = r30
            r5 = r24
            r3 = r33
            r0 = r17
            r11.<init>(r10, r5, r3, r0)
            androidx.compose.ui.Modifier r3 = X.C287435a8.A02(r12, r7, r11)
            androidx.compose.ui.Modifier r0 = r3.Ezh(r15)
            androidx.compose.ui.Modifier r3 = r0.Ezh(r13)
            r0 = 3
            X.J6M r0 = X.J6M.A00(r9, r0)
            androidx.compose.ui.Modifier r0 = X.C51970G9q.A0W(r3, r0)
            if (r17 == 0) goto L_0x08c5
            X.5Oz r3 = r9.A0A
            boolean r3 = X.C51971G9r.A1W(r3)
            if (r3 == 0) goto L_0x08c5
            X.5Oz r3 = r9.A0B
            boolean r3 = X.C51971G9r.A1W(r3)
            if (r3 == 0) goto L_0x08c5
            r3 = r18
            X.5Qw r3 = (X.C285335Qw) r3
            X.5Oz r3 = r3.A00
            boolean r3 = X.C51971G9r.A1W(r3)
            if (r3 == 0) goto L_0x08c5
            r66 = 1
            r3 = 10
            X.JJQ r3 = X.JJQ.A00(r6, r3)
            androidx.compose.ui.Modifier r4 = X.C287435a8.A02(r4, r7, r3)
        L_0x0886:
            X.JDJ r3 = new X.JDJ
            r48 = r3
            r49 = r45
            r50 = r9
            r51 = r5
            r52 = r6
            r56 = r4
            r57 = r39
            r58 = r68
            r59 = r70
            r60 = r35
            r61 = r31
            r62 = r42
            r63 = r37
            r64 = r43
            r65 = r36
            r67 = r19
            r48.<init>(r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67)
            r4 = -374338080(0xffffffffe9b00de0, float:-2.6604558E25)
            X.5PJ r4 = X.AnonymousClass5PI.A01(r2, r3, r4)
            r3 = 384(0x180, float:5.38E-43)
            A05(r6, r2, r0, r4, r3)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00f4
            r0 = 881782849(0x348ef041, float:2.662437E-7)
            X.0fL.A00(r0)
            goto L_0x00f4
        L_0x08c5:
            r66 = 0
            goto L_0x0886
        L_0x08c8:
            long r6 = r6.A00
            r48 = r6
            boolean r6 = X.C285965Tk.A03(r48)
            if (r6 != 0) goto L_0x038d
            X.Htn r6 = r12.A00
            int r14 = X.C285965Tk.A01(r48)
            int r7 = X.C285965Tk.A00(r48)
            r6.A02(r14, r7)
            goto L_0x038d
        L_0x08e1:
            X.5Tl r4 = r12.A01
            long r14 = r4.A00
            r4 = r70
            long r4 = r4.A00
            int r7 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r7 != 0) goto L_0x08f0
            r15 = 0
            goto L_0x0385
        L_0x08f0:
            X.Htn r7 = r12.A00
            r15 = r7
            int r14 = X.C285965Tk.A01(r4)
            int r7 = X.C285965Tk.A00(r4)
            r15.A03(r14, r7)
            r15 = 0
            r45 = 1
            goto L_0x0385
        L_0x0903:
            r7 = 0
            goto L_0x0367
        L_0x0906:
            X.6Gj r10 = X.AnonymousClass6Gj.Vertical
            goto L_0x01da
        L_0x090a:
            if (r23 == 0) goto L_0x090e
            X.5Qk r41 = androidx.compose.ui.Modifier.A00
        L_0x090e:
            if (r22 == 0) goto L_0x0912
            X.5Z4 r39 = X.AnonymousClass5Z4.A03
        L_0x0912:
            if (r21 == 0) goto L_0x0916
            X.JRq r35 = X.C56477Hz9.A00
        L_0x0916:
            if (r20 == 0) goto L_0x091a
            X.Iz7 r42 = X.C58882Iz7.A00
        L_0x091a:
            if (r15 == 0) goto L_0x091e
            r33 = 0
        L_0x091e:
            if (r5 == 0) goto L_0x0929
            long r4 = X.AnonymousClass5RW.A08
            X.6Fe r38 = new X.6Fe
            r0 = r38
            r0.<init>(r4)
        L_0x0929:
            r0 = r25
            boolean r25 = X.C51966G9m.A1R(r13, r0)
            if (r12 == 0) goto L_0x0934
            r36 = 2147483647(0x7fffffff, float:NaN)
        L_0x0934:
            if (r11 == 0) goto L_0x0938
            r43 = 1
        L_0x0938:
            r0 = r1 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0940
            X.5Uc r32 = X.C286145Uc.A06
            r3 = r3 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0940:
            if (r10 == 0) goto L_0x0944
            X.I4S r34 = X.I4S.A03
        L_0x0944:
            r0 = r17
            boolean r17 = X.C51966G9m.A1R(r9, r0)
            r0 = r19
            boolean r19 = X.C51966G9m.A1Q(r6, r0)
            if (r14 == 0) goto L_0x0142
            X.0sK r37 = X.C45168CrV.A00
            goto L_0x0142
        L_0x0956:
            r0 = r66 & r18
            if (r0 != 0) goto L_0x00d8
            r0 = r37
            int r0 = X.G9t.A0J(r2, r0)
            r3 = r3 | r0
            goto L_0x00d8
        L_0x0963:
            r0 = r16
            r0 = r0 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x00cf
            r0 = r19
            boolean r0 = r2.AGv(r0)
            if (r0 == 0) goto L_0x0973
            r14 = 16384(0x4000, float:2.2959E-41)
        L_0x0973:
            r3 = r3 | r14
            goto L_0x00cf
        L_0x0976:
            r0 = r16
            r0 = r0 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x00c9
            r0 = r17
            boolean r0 = r2.AGv(r0)
            if (r0 == 0) goto L_0x0986
            r6 = 2048(0x800, float:2.87E-42)
        L_0x0986:
            r3 = r3 | r6
            goto L_0x00c9
        L_0x0989:
            r0 = r16
            r0 = r0 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x00c3
            r0 = r34
            int r0 = X.G9t.A0Q(r2, r0)
            r3 = r3 | r0
            goto L_0x00c3
        L_0x0998:
            r0 = r66 & 6
            if (r0 != 0) goto L_0x09a6
            r0 = r43
            int r0 = X.G9t.A05(r2, r0)
            r3 = r66 | r0
            goto L_0x00a8
        L_0x09a6:
            r3 = r16
            goto L_0x00a8
        L_0x09aa:
            r0 = r65 & r18
            if (r0 != 0) goto L_0x0056
            r0 = r42
            int r0 = X.G9t.A0J(r2, r0)
            r7 = r7 | r0
            goto L_0x0056
        L_0x09b7:
            r0 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x004e
            r0 = r35
            int r0 = X.G9t.A0S(r2, r0)
            r7 = r7 | r0
            goto L_0x004e
        L_0x09c4:
            r0 = r8 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x0046
            r0 = r39
            int r0 = X.G9t.A0R(r2, r0)
            r7 = r7 | r0
            goto L_0x0046
        L_0x09d1:
            r0 = r8 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x003e
            r0 = r41
            int r0 = X.G9t.A0Q(r2, r0)
            r7 = r7 | r0
            goto L_0x003e
        L_0x09de:
            r0 = r65 & 48
            if (r0 != 0) goto L_0x0038
            r0 = r69
            int r0 = X.G9t.A0F(r2, r0)
            r7 = r7 | r0
            goto L_0x0038
        L_0x09eb:
            r0 = r65 & 6
            if (r0 != 0) goto L_0x09f9
            r0 = r70
            int r7 = X.G9t.A0O(r2, r0)
            r7 = r7 | r65
            goto L_0x0030
        L_0x09f9:
            r7 = r8
            goto L_0x0030
        L_0x09fc:
            java.lang.String r0 = "no recompose scope found"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52694Gb6.A00(X.5aT, X.I4S, X.5Wy, androidx.compose.ui.Modifier, X.6Ff, X.5Z4, X.5Uc, X.5Tl, X.JRq, X.0sP, X.0sP, X.0sK, int, int, int, int, int, boolean, boolean, boolean):void");
    }
}
