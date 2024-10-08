package X;

import androidx.compose.animation.SizeAnimationModifierElement;
import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.Constants;
import com.instagram.android.R;

/* renamed from: X.6Da  reason: invalid class name and case insensitive filesystem */
public abstract class C304326Da {
    public static final void A03(C286575Wy r9, Modifier modifier, C62320sa r11, int i, int i2, int i3, boolean z, boolean z2) {
        int i4;
        Modifier modifier2 = modifier;
        C286575Wy r10 = r9;
        r9.ExV(406962479);
        int i5 = i3;
        int i6 = i;
        int i7 = i2;
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            int i8 = 2;
            if (r9.AGs(i)) {
                i8 = 4;
            }
            i4 = i8 | i2;
        } else {
            i4 = i2;
        }
        boolean z3 = z;
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            int i9 = 16;
            if (r9.AGv(z)) {
                i9 = 32;
            }
            i4 |= i9;
        }
        boolean z4 = z2;
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            int i10 = 128;
            if (r10.AGv(z4)) {
                i10 = 256;
            }
            i4 |= i10;
        }
        C62320sa r4 = r11;
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            int i11 = 8192;
            if (r10.AGw(r11)) {
                i11 = Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
            }
            i4 |= i11;
        }
        if ((i4 & 8339) != 8338 || !r10.Bwn()) {
            if ((i3 & 8) != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(1161588337, "com.instagram.barcelona.feed.post.ui.PostLikeCountAnimatedLabel (PostCollapsedChildContent.kt:243)");
            }
            A05(r10, r11, i, (i4 & 14) | (i4 & 112) | (i4 & 896) | ((i4 >> 3) & 7168), z, z4);
            if (0fL.A02()) {
                0fL.A00(1401857611);
            }
        } else {
            r10.Evl();
        }
        C286625Xd ASQ = r10.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59151J8h(modifier2, r4, i6, i7, i5, z3, z4);
        }
    }

    public static final void A01(C286575Wy r25, Modifier modifier, int i, int i2, int i3, boolean z) {
        int i4;
        Modifier modifier2 = modifier;
        C286575Wy r7 = r25;
        r7.ExV(-482805433);
        int i5 = i;
        int i6 = i2;
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            int i7 = 2;
            if (r7.AGs(i5)) {
                i7 = 4;
            }
            i4 = i7 | i2;
        } else {
            i4 = i6;
        }
        boolean z2 = z;
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            int i8 = 16;
            if (r7.AGv(z2)) {
                i8 = 32;
            }
            i4 |= i8;
        }
        int i9 = i3 & 4;
        if (i9 != 0) {
            i4 |= 384;
        } else if ((i6 & 384) == 0) {
            int i10 = 128;
            if (r7.AGu(modifier2)) {
                i10 = 256;
            }
            i4 |= i10;
        }
        if ((i4 & 147) != 146 || !r7.Bwn()) {
            if (i9 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(-824693429, "com.instagram.barcelona.feed.post.ui.PostRepliesCountLabel (PostCollapsedChildContent.kt:224)");
            }
            if (i > 0 && z) {
                AnonymousClass5ZZ.A03(r7, modifier2, (AnonymousClass5Z4) null, (C268454dQ) null, (C291715hl) null, (AnonymousClass5ZD) null, A00(r7, i5, R.plurals.barcelona_expand_replies, i4 & 14), (0sP) null, 0, 0, 0, 0, (i4 >> 3) & 112, 0, 32760, AnonymousClass5aQ.A00(r7).A0t, 0, 0, false);
            }
            if (0fL.A02()) {
                0fL.A00(-1676868473);
            }
        } else {
            r7.Evl();
        }
        C286625Xd ASQ = r7.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C304366De(modifier2, i5, i6, i3, z);
        }
    }

    public static final void A04(C286575Wy r33, Modifier modifier, C62320sa r35, int i, int i2, int i3, boolean z, boolean z2) {
        int i4;
        Modifier modifier2 = modifier;
        C286575Wy r7 = r33;
        r7.ExV(1403008697);
        int i5 = i;
        int i6 = i2;
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            int i7 = 2;
            if (r7.AGs(i5)) {
                i7 = 4;
            }
            i4 = i7 | i2;
        } else {
            i4 = i6;
        }
        boolean z3 = z;
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            int i8 = 16;
            if (r7.AGv(z3)) {
                i8 = 32;
            }
            i4 |= i8;
        }
        boolean z4 = z2;
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i6 & 384) == 0) {
            int i9 = 128;
            if (r7.AGv(z4)) {
                i9 = 256;
            }
            i4 |= i9;
        }
        int i10 = i3 & 8;
        if (i10 != 0) {
            i4 |= 3072;
        } else if ((i6 & 3072) == 0) {
            int i11 = 1024;
            if (r7.AGu(modifier2)) {
                i11 = C249703kE.FLAG_MOVED;
            }
            i4 |= i11;
        }
        C62320sa r39 = r35;
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i6 & 24576) == 0) {
            int i12 = 8192;
            if (r7.AGw(r39)) {
                i12 = Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
            }
            i4 |= i12;
        }
        if ((i4 & 9363) != 9362 || !r7.Bwn()) {
            if (i10 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(-1431291330, "com.instagram.barcelona.feed.post.ui.PostLikeCountTextLabel (PostCollapsedChildContent.kt:287)");
            }
            if (i > 0) {
                r7.ExS(1432356114);
                if (z3) {
                    A07((Modifier) null, r7, 0, 1);
                }
                C286565Wx r0 = (C286565Wx) r7;
                C286565Wx.A0L(r0, false);
                C287625aV r11 = new C287625aV(0);
                r7.ExS(1432359892);
                boolean z5 = false;
                if ((57344 & i4) == 16384) {
                    z5 = true;
                }
                Object ECw = r7.ECw();
                if (z5 || ECw == AnonymousClass5XT.A00) {
                    ECw = new C377199Kx(r39, 44);
                    r7.FLL(ECw);
                }
                C286565Wx.A0L(r0, false);
                Modifier A01 = C288235ba.A01(r7, modifier2, r11, (String) null, (C62320sa) ECw, 3, false);
                AnonymousClass5RD A00 = C287675aa.A00(C287215Zl.A0E, false);
                int A002 = C287425a7.A00(r7);
                AnonymousClass5RM A04 = C286565Wx.A04(r0);
                Modifier A012 = C287435a8.A01(r7, A01);
                C62320sa r112 = C287485aD.A00;
                r7.ExX();
                if (r0.A0K) {
                    r7.AMT(r112);
                } else {
                    r7.FMk();
                }
                C287595aO.A00(r7, A00, C287485aD.A03);
                C287595aO.A00(r7, A04, C287485aD.A05);
                0sL r113 = C287485aD.A02;
                if (r0.A0K || !0qQ.A0K(r7.ECw(), Integer.valueOf(A002))) {
                    Integer valueOf = Integer.valueOf(A002);
                    r7.FLL(valueOf);
                    r7.ABr(valueOf, r113);
                }
                C287595aO.A00(r7, A012, C287485aD.A04);
                if (z2) {
                    r7.ExS(736040540);
                    A06((Modifier) null, r7, 0, 1);
                } else {
                    r7.ExS(736092558);
                    AnonymousClass5ZZ.A03(r7, (Modifier) null, (AnonymousClass5Z4) null, (C268454dQ) null, (C291715hl) null, (AnonymousClass5ZD) null, A00(r7, i5, R.plurals.barcelona_post_like_count, i4 & 14), (0sP) null, 0, 0, 1, 2, 0, 390, 27642, AnonymousClass5aQ.A00(r7).A0t, 0, 0, false);
                }
                C286565Wx.A0L(r0, false);
                C286565Wx.A0L(r0, true);
            }
            if (0fL.A02()) {
                0fL.A00(-2025231139);
            }
        } else {
            r7.Evl();
        }
        C286625Xd ASQ = r7.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C304376Df(modifier2, r39, i5, i6, i3, z3, z2);
        }
    }

    public static final void A06(Modifier modifier, C286575Wy r25, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        C286575Wy r6 = r25;
        r6.ExV(-1409794415);
        int i4 = i2;
        int i5 = i2 & 1;
        int i6 = i;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            int i7 = 2;
            if (r6.AGu(modifier2)) {
                i7 = 4;
            }
            i3 = i7 | i;
        } else {
            i3 = i6;
        }
        if ((i3 & 3) != 2 || !r6.Bwn()) {
            if (i5 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(-1698039421, "com.instagram.barcelona.feed.post.ui.HiddenLikeCountLabel (PostCollapsedChildContent.kt:308)");
            }
            AnonymousClass5ZZ.A03(r6, modifier2, (AnonymousClass5Z4) null, (C268454dQ) null, (C291715hl) null, (AnonymousClass5ZD) null, C288035bG.A00(r6, 2131953726), (0sP) null, 0, 0, 1, 2, (i3 << 3) & 112, 390, 27640, AnonymousClass5aQ.A00(r6).A0t, 0, 0, false);
            if (0fL.A02()) {
                0fL.A00(-609555932);
            }
        } else {
            r6.Evl();
        }
        C286625Xd ASQ = r6.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JGH(modifier2, i4, i6, 1);
        }
    }

    public static final void A07(Modifier modifier, C286575Wy r25, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        C286575Wy r6 = r25;
        r6.ExV(274310790);
        int i4 = i2;
        int i5 = i2 & 1;
        int i6 = i;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            int i7 = 2;
            if (r6.AGu(modifier2)) {
                i7 = 4;
            }
            i3 = i7 | i;
        } else {
            i3 = i6;
        }
        if ((i3 & 3) != 2 || !r6.Bwn()) {
            if (i5 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(-2141599920, "com.instagram.barcelona.feed.post.ui.LabelSeparator (PostCollapsedChildContent.kt:319)");
            }
            AnonymousClass5ZZ.A03(r6, modifier2, (AnonymousClass5Z4) null, (C268454dQ) null, (C291715hl) null, (AnonymousClass5ZD) null, " · ", (0sP) null, 0, 0, 0, 0, ((i3 << 3) & 112) | 6, 0, 32760, AnonymousClass5aQ.A00(r6).A0t, 0, 0, false);
            if (0fL.A02()) {
                0fL.A00(-2087638304);
            }
        } else {
            r6.Evl();
        }
        C286625Xd ASQ = r6.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JGH(modifier2, i4, i6, 2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0059, code lost:
        if ((r6 & 6) == 4) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A00(X.C286575Wy r7, int r8, int r9, int r10) {
        /*
            r0 = 736094519(0x2bdfe937, float:1.5909833E-12)
            r7.ExS(r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0014
            r1 = -869815289(0xffffffffcc27ac07, float:-4.3954204E7)
            java.lang.String r0 = "com.instagram.barcelona.feed.post.ui.countsStringResource (PostCollapsedChildContent.kt:348)"
            X.0fL.A01(r1, r0)
        L_0x0014:
            r6 = r10 & 14
            int r0 = r10 >> 3
            r0 = r0 & 112(0x70, float:1.57E-43)
            r6 = r6 | r0
            r4 = 0
            r0 = -137576504(0xfffffffff7ccbfc8, float:-8.305612E33)
            r7.ExS(r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0030
            r1 = 943343170(0x383a4642, float:4.441129E-5)
            java.lang.String r0 = "com.instagram.barcelona.feed.post.ui.rememberCountShortFormattedString (PostCollapsedChildContent.kt:331)"
            X.0fL.A01(r1, r0)
        L_0x0030:
            X.4bM r1 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.A01
            r3 = r7
            X.5Wx r3 = (X.C286565Wx) r3
            X.5RM r0 = X.C286565Wx.A04(r3)
            java.lang.Object r0 = X.C286615Xc.A01(r1, r0)
            android.content.Context r0 = (android.content.Context) r0
            android.content.res.Resources r5 = r0.getResources()
            r0 = -1236613191(0xffffffffb64ac7b9, float:-3.02166E-6)
            r7.ExS(r0)
            r0 = r6 & 14
            r0 = r0 ^ 6
            r2 = 4
            if (r0 <= r2) goto L_0x0056
            boolean r0 = r7.AGs(r8)
            if (r0 != 0) goto L_0x005b
        L_0x0056:
            r1 = r6 & 6
            r0 = 0
            if (r1 != r2) goto L_0x005c
        L_0x005b:
            r0 = 1
        L_0x005c:
            java.lang.Object r1 = r7.ECw()
            if (r0 != 0) goto L_0x0066
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r1 != r0) goto L_0x0078
        L_0x0066:
            X.0qQ.A0A(r5)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            r1 = 1
            r0 = 1000000000(0x3b9aca00, float:0.0047237873)
            java.lang.String r1 = X.C253673rC.A04(r5, r2, r0, r1, r4)
            r7.FLL(r1)
        L_0x0078:
            X.C286565Wx.A0L(r3, r4)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0087
            r0 = 1267001650(0x4b84e932, float:1.74209E7)
            X.0fL.A00(r0)
        L_0x0087:
            X.C286565Wx.A0L(r3, r4)
            java.lang.Object[] r0 = new java.lang.Object[]{r1}
            java.lang.String r1 = X.C304346Dc.A02(r7, r0, r9, r8)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x009e
            r0 = -798101243(0xffffffffd06df105, float:-1.59679826E10)
            X.0fL.A00(r0)
        L_0x009e:
            X.C286565Wx.A0L(r3, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C304326Da.A00(X.5Wy, int, int, int):java.lang.String");
    }

    public static final void A05(C286575Wy r12, C62320sa r13, int i, int i2, boolean z, boolean z2) {
        int i3;
        C286575Wy r11 = r12;
        r12.ExV(-922199509);
        int i4 = i2;
        if ((i2 & 6) == 0) {
            int i5 = 2;
            if (r12.AGs(i)) {
                i5 = 4;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        boolean z3 = z;
        if ((i2 & 48) == 0) {
            int i6 = 16;
            if (r12.AGv(z3)) {
                i6 = 32;
            }
            i3 |= i6;
        }
        boolean z4 = z2;
        if ((i2 & 384) == 0) {
            int i7 = 128;
            if (r12.AGv(z4)) {
                i7 = 256;
            }
            i3 |= i7;
        }
        if ((i2 & 3072) == 0) {
            int i8 = 1024;
            if (r12.AGw(r13)) {
                i8 = C249703kE.FLAG_MOVED;
            }
            i3 |= i8;
        }
        if ((i3 & 1171) != 1170 || !r12.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(608430127, "com.instagram.barcelona.feed.post.ui.PostLikeCountAnimatedTextLabel (PostCollapsedChildContent.kt:258)");
            }
            if (i > 0) {
                r12.ExS(-1143824273);
                boolean z5 = true;
                if (z) {
                    A07((Modifier) null, r11, 0, 1);
                }
                C286565Wx r4 = (C286565Wx) r11;
                C286565Wx.A0L(r4, false);
                if (z2) {
                    r11.ExS(-1098729122);
                    Modifier A00 = AnonymousClass6FZ.A00(Modifier.A00).Ezh(new SizeAnimationModifierElement(new C287965b7(new C289005cr(1 | (1 << 32)), 1.0f, 400.0f), C287215Zl.A0E));
                    C287625aV r7 = new C287625aV(0);
                    r11.ExS(-1143817393);
                    if ((i3 & 7168) != 2048) {
                        z5 = false;
                    }
                    Object ECw = r11.ECw();
                    if (z5 || ECw == AnonymousClass5XT.A00) {
                        ECw = new C58713IwM(r13, 24);
                        r11.FLL(ECw);
                    }
                    C286565Wx.A0L(r4, false);
                    A06(C288235ba.A02(r11, A00, r7, (C62320sa) ECw), r11, 0, 0);
                } else {
                    r11.ExS(-1098525700);
                    C54834HUq.A00(r11, (Modifier) null, r13, i, R.plurals.barcelona_post_like_count, (i3 & 14) | ((i3 >> 3) & 896), 8);
                }
                C286565Wx.A0L(r4, false);
            }
            if (0fL.A02()) {
                0fL.A00(-235643253);
            }
        } else {
            r12.Evl();
        }
        C286625Xd ASQ = r11.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J7X(r13, i, i4, z3, z4);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r55v0, resolved type: java.lang.Object} */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0317, code lost:
        if (r75 == false) goto L_0x0319;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x04a1  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x04b4  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x04c7  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x04da  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x04ed  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x04fe  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x050f  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0520  */
    /* JADX WARNING: Removed duplicated region for block: B:277:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0146  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C286575Wy r59, androidx.compose.ui.Modifier r60, com.instagram.api.schemas.LineType r61, X.C299735vl r62, X.AnonymousClass6DZ r63, X.C62320sa r64, X.C62320sa r65, X.C62320sa r66, X.C62320sa r67, X.AnonymousClass62P r68, int r69, int r70, int r71, int r72, int r73, boolean r74, boolean r75, boolean r76, boolean r77, boolean r78, boolean r79, boolean r80) {
        /*
            r31 = r60
            r29 = r70
            r30 = r62
            r28 = r80
            r9 = 1
            r58 = r65
            r0 = r58
            X.0qQ.A0B(r0, r9)
            r32 = 2
            r57 = r66
            r1 = r32
            r0 = r57
            X.0qQ.A0B(r0, r1)
            r18 = 3
            r56 = r67
            r1 = r56
            r0 = r18
            X.0qQ.A0B(r1, r0)
            r34 = 4
            r55 = r68
            r1 = r55
            r0 = r34
            X.0qQ.A0B(r1, r0)
            r1 = 5
            r60 = r61
            r0 = r60
            X.0qQ.A0B(r0, r1)
            r0 = 1071894992(0x3fe3d1d0, float:1.7798405)
            r6 = r59
            r6.ExV(r0)
            r4 = r73
            r0 = r73 & 1
            r5 = r71
            r33 = r64
            if (r0 == 0) goto L_0x05b8
            r0 = r71 | 6
        L_0x004d:
            r1 = r73 & 2
            r13 = 32
            if (r1 == 0) goto L_0x05a5
            r0 = r0 | 48
        L_0x0055:
            r1 = r73 & 4
            r7 = 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0592
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x005d:
            r1 = r73 & 8
            r3 = 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x057f
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L_0x0065:
            r1 = r73 & 16
            if (r1 == 0) goto L_0x056c
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
        L_0x006b:
            r1 = r73 & 32
            r12 = 196608(0x30000, float:2.75506E-40)
            if (r1 == 0) goto L_0x0559
            r0 = r0 | r12
        L_0x0072:
            r1 = r73 & 64
            r10 = 1572864(0x180000, float:2.204052E-39)
            r11 = r63
            if (r1 == 0) goto L_0x0548
            r0 = r0 | r10
        L_0x007b:
            r1 = r4 & 128(0x80, float:1.794E-43)
            r14 = 12582912(0xc00000, float:1.7632415E-38)
            r53 = r69
            if (r1 == 0) goto L_0x0535
            r0 = r0 | r14
        L_0x0084:
            r1 = r4 & 256(0x100, float:3.59E-43)
            r2 = 100663296(0x6000000, float:2.4074124E-35)
            r54 = r74
            if (r1 != 0) goto L_0x009c
            r2 = r2 & r71
            if (r2 != 0) goto L_0x009d
            r1 = r54
            boolean r1 = r6.AGv(r1)
            r2 = 33554432(0x2000000, float:9.403955E-38)
            if (r1 == 0) goto L_0x009c
            r2 = 67108864(0x4000000, float:1.5046328E-36)
        L_0x009c:
            r0 = r0 | r2
        L_0x009d:
            r1 = r4 & 512(0x200, float:7.175E-43)
            r2 = 805306368(0x30000000, float:4.656613E-10)
            r38 = r75
            if (r1 != 0) goto L_0x00b5
            r2 = r2 & r71
            if (r2 != 0) goto L_0x00b6
            r1 = r38
            boolean r1 = r6.AGv(r1)
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            if (r1 == 0) goto L_0x00b5
            r2 = 536870912(0x20000000, float:1.0842022E-19)
        L_0x00b5:
            r0 = r0 | r2
        L_0x00b6:
            r1 = r4 & 1024(0x400, float:1.435E-42)
            r37 = r76
            r8 = r72
            if (r1 == 0) goto L_0x0520
            r1 = r72 | 6
        L_0x00c0:
            r2 = r4 & 2048(0x800, float:2.87E-42)
            r36 = r77
            if (r2 == 0) goto L_0x050f
            r1 = r1 | 48
        L_0x00c8:
            r2 = r4 & 4096(0x1000, float:5.74E-42)
            r35 = r78
            if (r2 == 0) goto L_0x04fe
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x00d0:
            r2 = r4 & 8192(0x2000, float:1.14794E-41)
            r59 = r79
            if (r2 == 0) goto L_0x04ed
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x00d8:
            r7 = r4 & 16384(0x4000, float:2.2959E-41)
            if (r7 == 0) goto L_0x04da
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x00de:
            r2 = 32768(0x8000, float:4.5918E-41)
            r13 = r73 & r2
            if (r13 == 0) goto L_0x04c7
            r1 = r1 | r12
        L_0x00e6:
            r2 = 65536(0x10000, float:9.18355E-41)
            r12 = r73 & r2
            if (r12 == 0) goto L_0x04b4
            r1 = r1 | r10
        L_0x00ed:
            r2 = 131072(0x20000, float:1.83671E-40)
            r10 = r73 & r2
            if (r10 == 0) goto L_0x04a1
            r1 = r1 | r14
        L_0x00f4:
            r2 = 306783379(0x12492493, float:6.34695E-28)
            r3 = r0 & r2
            r2 = 306783378(0x12492492, float:6.3469493E-28)
            if (r3 != r2) goto L_0x0146
            r3 = 4793491(0x492493, float:6.717112E-39)
            r3 = r3 & r1
            r2 = 4793490(0x492492, float:6.71711E-39)
            if (r3 != r2) goto L_0x0146
            boolean r2 = r6.Bwn()
            if (r2 == 0) goto L_0x0146
            r6.Evl()
        L_0x0110:
            X.5Xd r1 = r6.ASQ()
            if (r1 == 0) goto L_0x0145
            X.JDb r0 = new X.JDb
            r39 = r0
            r40 = r31
            r41 = r60
            r42 = r30
            r43 = r11
            r44 = r33
            r45 = r58
            r46 = r57
            r47 = r56
            r48 = r55
            r49 = r53
            r50 = r29
            r51 = r5
            r52 = r8
            r53 = r4
            r55 = r38
            r56 = r37
            r57 = r36
            r58 = r35
            r60 = r28
            r39.<init>(r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60)
            r1.A06 = r0
        L_0x0145:
            return
        L_0x0146:
            if (r7 == 0) goto L_0x014a
            X.5Qk r31 = androidx.compose.ui.Modifier.A00
        L_0x014a:
            if (r13 == 0) goto L_0x014e
            r29 = 0
        L_0x014e:
            if (r12 == 0) goto L_0x0152
            r30 = 0
        L_0x0152:
            if (r10 == 0) goto L_0x0156
            r28 = 0
        L_0x0156:
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x0164
            r3 = 2095030315(0x7cdfa02b, float:9.2890463E36)
            java.lang.String r2 = "com.instagram.barcelona.feed.post.ui.PostCollapsedChildContent (PostCollapsedChildContent.kt:121)"
            X.0fL.A01(r3, r2)
        L_0x0164:
            boolean r3 = r11.A02
            if (r3 == 0) goto L_0x049d
            java.lang.Integer r7 = X.AnonymousClass05K.A0N
        L_0x016a:
            r2 = r60
            java.lang.Integer r10 = X.C304236Cr.A00(r2, r7)
            java.lang.Integer r2 = X.AnonymousClass05K.A0Y
            r13 = 0
            if (r10 == r2) goto L_0x0176
            r13 = 1
        L_0x0176:
            r27 = 0
            r7 = 0
            r2 = r31
            androidx.compose.ui.Modifier r3 = X.AnonymousClass6DP.A00(r2, r7, r3)
            boolean r2 = r11.A03
            r19 = r2
            androidx.compose.ui.Modifier r3 = X.C304246Cs.A00(r3, r10, r2, r9)
            X.6Fk r2 = r11.A01
            androidx.compose.ui.Modifier r10 = X.C287195Zj.A00(r2, r3)
            float r3 = r11.A00
            r2 = 2143289344(0x7fc00000, float:NaN)
            androidx.compose.ui.Modifier r17 = X.C287205Zk.A0F(r10, r3, r2)
            r2 = 296749700(0x11b00a84, float:2.7774385E-28)
            r6.ExS(r2)
            X.5Qk r14 = androidx.compose.ui.Modifier.A00
            r10 = r14
            if (r64 == 0) goto L_0x01e6
            r3 = 0
            X.5aV r16 = new X.5aV
            r2 = r16
            r2.<init>(r3)
            r2 = 296752861(0x11b016dd, float:2.7781994E-28)
            r6.ExS(r2)
            r12 = r0 & 14
            r15 = 0
            r2 = r34
            if (r12 != r2) goto L_0x01b6
            r15 = 1
        L_0x01b6:
            java.lang.Object r12 = r6.ECw()
            if (r15 != 0) goto L_0x01c0
            java.lang.Object r2 = X.AnonymousClass5XT.A00
            if (r12 != r2) goto L_0x01cc
        L_0x01c0:
            r15 = 43
            X.9Kx r12 = new X.9Kx
            r2 = r33
            r12.<init>(r2, r15)
            r6.FLL(r12)
        L_0x01cc:
            X.0sa r12 = (X.C62320sa) r12
            r2 = r6
            X.5Wx r2 = (X.C286565Wx) r2
            X.C286565Wx.A0L(r2, r3)
            r20 = r6
            r21 = r14
            r22 = r16
            r23 = r27
            r24 = r12
            r25 = r18
            r26 = r3
            androidx.compose.ui.Modifier r14 = X.C288235ba.A01(r20, r21, r22, r23, r24, r25, r26)
        L_0x01e6:
            r3 = r6
            X.5Wx r3 = (X.C286565Wx) r3
            r2 = 0
            X.C286565Wx.A0L(r3, r2)
            r12 = r17
            androidx.compose.ui.Modifier r16 = r12.Ezh(r14)
            X.5Zp r26 = X.C287215Zl.A04
            X.5Zu r25 = X.C287275Zs.A01
            r24 = 48
            r15 = r25
            r14 = r26
            r12 = r24
            X.5RD r15 = X.C287395a4.A02(r15, r6, r14, r12)
            int r17 = X.C287425a7.A00(r6)
            X.5RM r14 = X.C286565Wx.A04(r3)
            r12 = r16
            androidx.compose.ui.Modifier r16 = X.C287435a8.A01(r6, r12)
            X.0sa r23 = X.C287485aD.A00
            r6.ExX()
            boolean r12 = r3.A0K
            if (r12 == 0) goto L_0x0498
            r12 = r23
            r6.AMT(r12)
        L_0x021f:
            X.0sL r22 = X.C287485aD.A03
            r12 = r22
            X.C287595aO.A00(r6, r15, r12)
            X.0sL r21 = X.C287485aD.A05
            r12 = r21
            X.C287595aO.A00(r6, r14, r12)
            X.0sL r20 = X.C287485aD.A02
            boolean r12 = r3.A0K
            if (r12 != 0) goto L_0x0241
            java.lang.Object r14 = r6.ECw()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r17)
            boolean r12 = X.0qQ.A0K(r14, r12)
            if (r12 != 0) goto L_0x024d
        L_0x0241:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r17)
            r6.FLL(r14)
            r12 = r20
            r6.ABr(r14, r12)
        L_0x024d:
            X.0sL r12 = X.C287485aD.A04
            r14 = r16
            X.C287595aO.A00(r6, r14, r12)
            X.6FX r18 = X.AnonymousClass6FX.A00
            r14 = -1911269733(0xffffffff8e14569b, float:-1.8284107E-30)
            r6.ExS(r14)
            boolean r17 = r6.AGv(r13)
            r15 = 57344(0xe000, float:8.0356E-41)
            r15 = r15 & r0
            r14 = 16384(0x4000, float:2.2959E-41)
            r16 = 0
            if (r15 != r14) goto L_0x026c
            r16 = 1
        L_0x026c:
            r17 = r17 | r16
            java.lang.Object r14 = r6.ECw()
            if (r17 != 0) goto L_0x0278
            java.lang.Object r15 = X.AnonymousClass5XT.A00
            if (r14 != r15) goto L_0x0289
        L_0x0278:
            if (r13 == 0) goto L_0x0494
            r15 = r32
            r14 = r55
            java.util.List r14 = X.00k.A0d(r14, r15)
            X.62P r14 = X.AnonymousClass62Q.A00(r14)
        L_0x0286:
            r6.FLL(r14)
        L_0x0289:
            X.62P r14 = (X.AnonymousClass62P) r14
            X.C286565Wx.A0L(r3, r2)
            if (r19 != 0) goto L_0x0479
            r13 = 1094713344(0x41400000, float:12.0)
            androidx.compose.ui.Modifier r15 = X.C287195Zj.A0B(r10, r13, r7, r7, r7)
        L_0x0296:
            androidx.compose.ui.Alignment r13 = X.C287215Zl.A09
            androidx.compose.ui.Modifier r13 = X.C287205Zk.A02(r13, r15)
            if (r78 == 0) goto L_0x046b
            r15 = 880847977(0x3480ac69, float:2.3967303E-7)
            r6.ExS(r15)
            int r15 = r1 >> 9
            r42 = r15 & 14
            r39 = r6
            r40 = r13
            r41 = r14
            r43 = r2
            r44 = r59
            X.C304336Db.A01(r39, r40, r41, r42, r43, r44)
            X.C286565Wx.A0L(r3, r2)
        L_0x02b8:
            r14 = 1065353216(0x3f800000, float:1.0)
            r13 = r18
            androidx.compose.ui.Modifier r19 = r13.FNR(r10, r14, r9)
            r15 = r25
            r14 = r26
            r13 = r24
            X.5RD r18 = X.C287395a4.A02(r15, r6, r14, r13)
            int r17 = X.C287425a7.A00(r6)
            X.5RM r16 = X.C286565Wx.A04(r3)
            r13 = r19
            androidx.compose.ui.Modifier r14 = X.C287435a8.A01(r6, r13)
            r6.ExX()
            boolean r13 = r3.A0K
            if (r13 == 0) goto L_0x0466
            r13 = r23
            r6.AMT(r13)
        L_0x02e4:
            r15 = r22
            r13 = r18
            X.C287595aO.A00(r6, r13, r15)
            r15 = r21
            r13 = r16
            X.C287595aO.A00(r6, r13, r15)
            boolean r13 = r3.A0K
            if (r13 != 0) goto L_0x0304
            java.lang.Object r15 = r6.ECw()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r17)
            boolean r13 = X.0qQ.A0K(r15, r13)
            if (r13 != 0) goto L_0x0310
        L_0x0304:
            java.lang.Integer r15 = java.lang.Integer.valueOf(r17)
            r6.FLL(r15)
            r13 = r20
            r6.ABr(r15, r13)
        L_0x0310:
            X.C287595aO.A00(r6, r14, r12)
            if (r29 <= 0) goto L_0x0319
            r45 = 1
            if (r75 != 0) goto L_0x031b
        L_0x0319:
            r45 = 0
        L_0x031b:
            if (r28 == 0) goto L_0x041e
            r13 = 930038236(0x376f41dc, float:1.4260844E-5)
            r6.ExS(r13)
            r13 = 722737966(0x2b141b2e, float:5.261788E-13)
            r6.ExS(r13)
            if (r45 == 0) goto L_0x0343
            r50 = 2131820570(0x7f11001a, float:1.9273859E38)
            int r13 = r1 >> 15
            r13 = r13 & 14
            r13 = r13 | 384(0x180, float:5.38E-43)
            r52 = 8
            r46 = r6
            r47 = r27
            r48 = r27
            r49 = r29
            r51 = r13
            X.C54834HUq.A00(r46, r47, r48, r49, r50, r51, r52)
        L_0x0343:
            X.C286565Wx.A0L(r3, r2)
            int r13 = r0 >> 21
            r43 = r13 & 14
            int r13 = r0 >> 18
            r13 = r13 & 896(0x380, float:1.256E-42)
            r43 = r43 | r13
            r14 = 57344(0xe000, float:8.0356E-41)
            int r13 = r0 << 9
            r14 = r14 & r13
            r43 = r43 | r14
            r44 = 8
            r39 = r6
            r40 = r27
            r41 = r58
            r42 = r53
            r46 = r54
            A03(r39, r40, r41, r42, r43, r44, r45, r46)
            X.C286565Wx.A0L(r3, r2)
        L_0x036a:
            X.C286565Wx.A0L(r3, r9)
            r13 = -1911201276(0xffffffff8e156204, float:-1.841286E-30)
            r6.ExS(r13)
            if (r76 != 0) goto L_0x0377
            if (r77 == 0) goto L_0x0406
        L_0x0377:
            r13 = 1094713344(0x41400000, float:12.0)
            androidx.compose.ui.Modifier r10 = X.C287195Zj.A0B(r10, r13, r7, r7, r7)
            X.6Fc r13 = X.C287275Zs.A01(r13)
            r7 = r26
            X.5RD r14 = X.C287395a4.A00(r13, r6, r7)
            int r15 = X.C287425a7.A00(r6)
            X.5RM r13 = X.C286565Wx.A04(r3)
            androidx.compose.ui.Modifier r10 = X.C287435a8.A01(r6, r10)
            r6.ExX()
            boolean r7 = r3.A0K
            if (r7 == 0) goto L_0x041a
            r7 = r23
            r6.AMT(r7)
        L_0x039f:
            r7 = r22
            X.C287595aO.A00(r6, r14, r7)
            r7 = r21
            X.C287595aO.A00(r6, r13, r7)
            boolean r7 = r3.A0K
            if (r7 != 0) goto L_0x03bb
            java.lang.Object r13 = r6.ECw()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r15)
            boolean r7 = X.0qQ.A0K(r13, r7)
            if (r7 != 0) goto L_0x03c7
        L_0x03bb:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r15)
            r6.FLL(r13)
            r7 = r20
            r6.ABr(r13, r7)
        L_0x03c7:
            X.C287595aO.A00(r6, r10, r12)
            r7 = 722773462(0x2b14a5d6, float:5.2810306E-13)
            r6.ExS(r7)
            if (r76 == 0) goto L_0x03e8
            int r1 = r1 >> 18
            r16 = r1 & 14
            int r1 = r0 >> 3
            r1 = r1 & 112(0x70, float:1.57E-43)
            r16 = r16 | r1
            r12 = r6
            r13 = r27
            r14 = r30
            r15 = r57
            r17 = r34
            X.HV3.A00(r12, r13, r14, r15, r16, r17)
        L_0x03e8:
            X.C286565Wx.A0L(r3, r2)
            r1 = 722779418(0x2b14bd1a, float:5.2842594E-13)
            r6.ExS(r1)
            if (r77 == 0) goto L_0x0400
            int r0 = r0 >> 9
            r10 = r0 & 14
            r7 = r32
            r1 = r27
            r0 = r56
            X.HV2.A00(r6, r1, r0, r10, r7)
        L_0x0400:
            X.C286565Wx.A0L(r3, r2)
            X.C286565Wx.A0L(r3, r9)
        L_0x0406:
            X.C286565Wx.A0L(r3, r2)
            X.C286565Wx.A0L(r3, r9)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0110
            r0 = -1537471703(0xffffffffa45c0b29, float:-4.771435E-17)
            X.0fL.A00(r0)
            goto L_0x0110
        L_0x041a:
            r6.FMk()
            goto L_0x039f
        L_0x041e:
            r13 = 930490867(0x377629f3, float:1.467251E-5)
            r6.ExS(r13)
            int r13 = r1 >> 15
            r16 = r13 & 14
            int r13 = r0 >> 24
            r13 = r13 & 112(0x70, float:1.57E-43)
            r16 = r16 | r13
            r13 = r6
            r14 = r27
            r15 = r29
            r17 = r34
            r18 = r38
            A01(r13, r14, r15, r16, r17, r18)
            int r13 = r0 >> 21
            r43 = r13 & 14
            int r13 = r0 >> 18
            r13 = r13 & 896(0x380, float:1.256E-42)
            r43 = r43 | r13
            int r13 = r1 >> 3
            r13 = r13 & 7168(0x1c00, float:1.0045E-41)
            r43 = r43 | r13
            r14 = 57344(0xe000, float:8.0356E-41)
            int r13 = r0 << 9
            r14 = r14 & r13
            r43 = r43 | r14
            r39 = r6
            r40 = r31
            r41 = r58
            r42 = r53
            r44 = r2
            r46 = r54
            A04(r39, r40, r41, r42, r43, r44, r45, r46)
            X.C286565Wx.A0L(r3, r2)
            goto L_0x036a
        L_0x0466:
            r6.FMk()
            goto L_0x02e4
        L_0x046b:
            r15 = 881031714(0x34837a22, float:2.4489515E-7)
            r6.ExS(r15)
            X.C304336Db.A00(r6, r13, r14, r2, r2)
            X.C286565Wx.A0L(r3, r2)
            goto L_0x02b8
        L_0x0479:
            if (r13 == 0) goto L_0x048c
            r15 = 1094713344(0x41400000, float:12.0)
            boolean r16 = r14.isEmpty()
            r13 = 1092616192(0x41200000, float:10.0)
            if (r16 == 0) goto L_0x0486
            r13 = 0
        L_0x0486:
            androidx.compose.ui.Modifier r15 = X.C287195Zj.A0B(r10, r15, r7, r13, r7)
            goto L_0x0296
        L_0x048c:
            r13 = 1114636288(0x42700000, float:60.0)
            androidx.compose.ui.Modifier r15 = X.C287205Zk.A0D(r10, r13)
            goto L_0x0296
        L_0x0494:
            r14 = r55
            goto L_0x0286
        L_0x0498:
            r6.FMk()
            goto L_0x021f
        L_0x049d:
            java.lang.Integer r7 = X.AnonymousClass05K.A0Y
            goto L_0x016a
        L_0x04a1:
            r2 = r72 & r14
            if (r2 != 0) goto L_0x00f4
            r2 = r28
            boolean r3 = r6.AGv(r2)
            r2 = 4194304(0x400000, float:5.877472E-39)
            if (r3 == 0) goto L_0x04b1
            r2 = 8388608(0x800000, float:1.17549435E-38)
        L_0x04b1:
            r1 = r1 | r2
            goto L_0x00f4
        L_0x04b4:
            r2 = r72 & r10
            if (r2 != 0) goto L_0x00ed
            r2 = r30
            boolean r3 = r6.AGu(r2)
            r2 = 524288(0x80000, float:7.34684E-40)
            if (r3 == 0) goto L_0x04c4
            r2 = 1048576(0x100000, float:1.469368E-39)
        L_0x04c4:
            r1 = r1 | r2
            goto L_0x00ed
        L_0x04c7:
            r2 = r72 & r12
            if (r2 != 0) goto L_0x00e6
            r2 = r29
            boolean r3 = r6.AGs(r2)
            r2 = 65536(0x10000, float:9.18355E-41)
            if (r3 == 0) goto L_0x04d7
            r2 = 131072(0x20000, float:1.83671E-40)
        L_0x04d7:
            r1 = r1 | r2
            goto L_0x00e6
        L_0x04da:
            r2 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x00de
            r2 = r31
            boolean r3 = r6.AGu(r2)
            r2 = 8192(0x2000, float:1.14794E-41)
            if (r3 == 0) goto L_0x04ea
            r2 = 16384(0x4000, float:2.2959E-41)
        L_0x04ea:
            r1 = r1 | r2
            goto L_0x00de
        L_0x04ed:
            r2 = r8 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x00d8
            r2 = r59
            boolean r2 = r6.AGv(r2)
            if (r2 != 0) goto L_0x04fb
            r3 = 1024(0x400, float:1.435E-42)
        L_0x04fb:
            r1 = r1 | r3
            goto L_0x00d8
        L_0x04fe:
            r2 = r8 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x00d0
            r2 = r35
            boolean r2 = r6.AGv(r2)
            if (r2 != 0) goto L_0x050c
            r7 = 128(0x80, float:1.794E-43)
        L_0x050c:
            r1 = r1 | r7
            goto L_0x00d0
        L_0x050f:
            r2 = r72 & 48
            if (r2 != 0) goto L_0x00c8
            r2 = r36
            boolean r2 = r6.AGv(r2)
            if (r2 != 0) goto L_0x051d
            r13 = 16
        L_0x051d:
            r1 = r1 | r13
            goto L_0x00c8
        L_0x0520:
            r1 = r72 & 6
            if (r1 != 0) goto L_0x0532
            r1 = r37
            boolean r2 = r6.AGv(r1)
            r1 = 2
            if (r2 == 0) goto L_0x052e
            r1 = 4
        L_0x052e:
            r1 = r1 | r72
            goto L_0x00c0
        L_0x0532:
            r1 = r8
            goto L_0x00c0
        L_0x0535:
            r1 = r71 & r14
            if (r1 != 0) goto L_0x0084
            r1 = r53
            boolean r2 = r6.AGs(r1)
            r1 = 4194304(0x400000, float:5.877472E-39)
            if (r2 == 0) goto L_0x0545
            r1 = 8388608(0x800000, float:1.17549435E-38)
        L_0x0545:
            r0 = r0 | r1
            goto L_0x0084
        L_0x0548:
            r1 = r71 & r10
            if (r1 != 0) goto L_0x007b
            boolean r2 = r6.AGu(r11)
            r1 = 524288(0x80000, float:7.34684E-40)
            if (r2 == 0) goto L_0x0556
            r1 = 1048576(0x100000, float:1.469368E-39)
        L_0x0556:
            r0 = r0 | r1
            goto L_0x007b
        L_0x0559:
            r1 = r71 & r12
            if (r1 != 0) goto L_0x0072
            r1 = r60
            boolean r2 = r6.AGu(r1)
            r1 = 65536(0x10000, float:9.18355E-41)
            if (r2 == 0) goto L_0x0569
            r1 = 131072(0x20000, float:1.83671E-40)
        L_0x0569:
            r0 = r0 | r1
            goto L_0x0072
        L_0x056c:
            r1 = r5 & 24576(0x6000, float:3.4438E-41)
            if (r1 != 0) goto L_0x006b
            r1 = r55
            boolean r2 = r6.AGu(r1)
            r1 = 8192(0x2000, float:1.14794E-41)
            if (r2 == 0) goto L_0x057c
            r1 = 16384(0x4000, float:2.2959E-41)
        L_0x057c:
            r0 = r0 | r1
            goto L_0x006b
        L_0x057f:
            r1 = r5 & 3072(0xc00, float:4.305E-42)
            if (r1 != 0) goto L_0x0065
            r1 = r56
            boolean r2 = r6.AGw(r1)
            r1 = 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x058f
            r1 = 2048(0x800, float:2.87E-42)
        L_0x058f:
            r0 = r0 | r1
            goto L_0x0065
        L_0x0592:
            r1 = r5 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L_0x005d
            r1 = r57
            boolean r2 = r6.AGw(r1)
            r1 = 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x05a2
            r1 = 256(0x100, float:3.59E-43)
        L_0x05a2:
            r0 = r0 | r1
            goto L_0x005d
        L_0x05a5:
            r1 = r71 & 48
            if (r1 != 0) goto L_0x0055
            r1 = r58
            boolean r2 = r6.AGw(r1)
            r1 = 16
            if (r2 == 0) goto L_0x05b5
            r1 = 32
        L_0x05b5:
            r0 = r0 | r1
            goto L_0x0055
        L_0x05b8:
            r0 = r71 & 6
            if (r0 != 0) goto L_0x05ca
            r0 = r33
            boolean r1 = r6.AGw(r0)
            r0 = 2
            if (r1 == 0) goto L_0x05c6
            r0 = 4
        L_0x05c6:
            r0 = r0 | r71
            goto L_0x004d
        L_0x05ca:
            r0 = r5
            goto L_0x004d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C304326Da.A02(X.5Wy, androidx.compose.ui.Modifier, com.instagram.api.schemas.LineType, X.5vl, X.6DZ, X.0sa, X.0sa, X.0sa, X.0sa, X.62P, int, int, int, int, int, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }
}
