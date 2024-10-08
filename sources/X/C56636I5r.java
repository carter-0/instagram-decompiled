package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.instagram.android.R;
import com.instagram.creation.genai.magicmod.model.MagicModPostCaptureTransform;
import java.util.List;

/* renamed from: X.I5r  reason: case insensitive filesystem */
public abstract class C56636I5r {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v31, resolved type: X.IyF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v2, resolved type: X.IyF} */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01b1, code lost:
        if (r8 == X.AnonymousClass5XT.A00) goto L_0x01b3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0221  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r42, X.C3018260f r43, X.C3018260f r44, com.instagram.creation.genai.magicmod.model.MagicModPostCaptureTransform r45, X.C53527Gpx r46, X.C55638Hkx r47, X.C62320sa r48, X.C62320sa r49, X.0sP r50, X.0sP r51, X.0sL r52, X.AnonymousClass62P r53, int r54, int r55, int r56) {
        /*
            r19 = r51
            r2 = 0
            r5 = r53
            r6 = r46
            int r13 = X.C51970G9q.A08(r2, r6, r5)
            r35 = r48
            r36 = r49
            r37 = r50
            r3 = r37
            r1 = r35
            r0 = r36
            X.C51974G9v.A1N(r3, r1, r0)
            r0 = 892179171(0x352d92e3, float:6.466127E-7)
            r7 = r42
            r7.ExV(r0)
            r3 = r56
            r0 = r56 & 1
            r4 = r54
            if (r0 == 0) goto L_0x0265
            r11 = r54 | 6
        L_0x002c:
            r0 = r56 & 2
            if (r0 == 0) goto L_0x0258
            r11 = r11 | 48
        L_0x0032:
            r0 = r56 & 4
            r42 = r44
            if (r0 == 0) goto L_0x024b
            r11 = r11 | 384(0x180, float:5.38E-43)
        L_0x003a:
            r0 = r56 & 8
            r34 = r47
            if (r0 == 0) goto L_0x023e
            r11 = r11 | 3072(0xc00, float:4.305E-42)
        L_0x0042:
            r0 = r56 & 16
            if (r0 == 0) goto L_0x0233
            r11 = r11 | 24576(0x6000, float:3.4438E-41)
        L_0x0048:
            r1 = r56 & 32
            r0 = 196608(0x30000, float:2.75506E-40)
            if (r1 != 0) goto L_0x0058
            r0 = r54 & r0
            if (r0 != 0) goto L_0x0059
            r0 = r37
            int r0 = X.G9t.A0J(r7, r0)
        L_0x0058:
            r11 = r11 | r0
        L_0x0059:
            r1 = r56 & 64
            r0 = 1572864(0x180000, float:2.204052E-39)
            if (r1 != 0) goto L_0x0069
            r0 = r54 & r0
            if (r0 != 0) goto L_0x006a
            r0 = r35
            int r0 = X.G9t.A0K(r7, r0)
        L_0x0069:
            r11 = r11 | r0
        L_0x006a:
            r1 = r3 & 128(0x80, float:1.794E-43)
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            if (r1 != 0) goto L_0x007a
            r0 = r54 & r0
            if (r0 != 0) goto L_0x007b
            r0 = r36
            int r0 = X.G9t.A0L(r7, r0)
        L_0x007a:
            r11 = r11 | r0
        L_0x007b:
            r1 = r3 & 256(0x100, float:3.59E-43)
            r0 = 100663296(0x6000000, float:2.4074124E-35)
            r39 = r52
            if (r1 != 0) goto L_0x008d
            r0 = r0 & r54
            if (r0 != 0) goto L_0x008e
            r0 = r39
            int r0 = X.G9t.A0M(r7, r0)
        L_0x008d:
            r11 = r11 | r0
        L_0x008e:
            r1 = r3 & 512(0x200, float:7.175E-43)
            r0 = 805306368(0x30000000, float:4.656613E-10)
            if (r1 != 0) goto L_0x009e
            r0 = r54 & r0
            if (r0 != 0) goto L_0x009f
            r0 = r19
            int r0 = X.G9t.A0N(r7, r0)
        L_0x009e:
            r11 = r11 | r0
        L_0x009f:
            r0 = r3 & 1024(0x400, float:1.435E-42)
            r41 = r45
            r20 = r55
            if (r0 == 0) goto L_0x0221
            r9 = r55 | 6
        L_0x00a9:
            r0 = 306783379(0x12492493, float:6.34695E-28)
            r8 = r11 & r0
            r0 = 306783378(0x12492492, float:6.3469493E-28)
            if (r8 != r0) goto L_0x00e9
            r8 = r9 & 3
            r0 = 2
            if (r8 != r0) goto L_0x00e9
            boolean r0 = r7.Bwn()
            if (r0 == 0) goto L_0x00e9
            r7.Evl()
        L_0x00c1:
            X.5Xd r1 = r7.ASQ()
            if (r1 == 0) goto L_0x00e8
            X.JCg r0 = new X.JCg
            r15 = r37
            r16 = r19
            r17 = r39
            r18 = r5
            r19 = r4
            r21 = r3
            r7 = r0
            r8 = r43
            r9 = r42
            r10 = r41
            r11 = r6
            r12 = r34
            r13 = r35
            r14 = r36
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r1.A06 = r0
        L_0x00e8:
            return
        L_0x00e9:
            if (r1 == 0) goto L_0x00ed
            X.J2G r19 = X.J2G.A00
        L_0x00ed:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00fb
            r1 = -1908181504(0xffffffff8e437600, float:-2.409242E-30)
            java.lang.String r0 = "com.instagram.creation.genai.magicmod.tools.backdrop.ui.MagicModBackdropGeneratedImageVariants (MagicModBackdropGeneratedImageVariants.kt:79)"
            X.0fL.A01(r1, r0)
        L_0x00fb:
            androidx.compose.foundation.lazy.grid.LazyGridState r1 = X.C56383Hxc.A00(r7)
            int r10 = r6.A00
            r0 = -175584060(0xfffffffff588ccc4, float:-3.4682886E32)
            boolean r9 = X.C51967G9n.A1Y(r7, r5, r0)
            boolean r0 = r7.AGs(r10)
            r9 = r9 | r0
            java.lang.Object r8 = r7.ECw()
            if (r9 != 0) goto L_0x0117
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r8 != r0) goto L_0x0123
        L_0x0117:
            int r0 = r5.size()
            int r0 = r0 + r10
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r7.FLL(r8)
        L_0x0123:
            int r18 = X.AnonymousClass7TE.A0M(r8)
            X.5Wx r0 = X.C51965G9l.A0H(r7, r2)
            boolean r8 = r5.isEmpty()
            if (r8 != 0) goto L_0x0216
            r9 = 2
            X.IF4 r17 = new X.IF4
            r8 = r17
            r8.<init>(r9)
            X.5a0 r22 = X.C287275Zs.A02
            r12 = 1094713344(0x41400000, float:12.0)
            X.6Fc r23 = X.C287275Zs.A01(r12)
            r8 = 2131165315(0x7f070083, float:1.7944844E38)
            float r8 = X.C287645aX.A01(r7, r8)
            r10 = 0
            X.6Fj r15 = new X.6Fj
            r15.<init>(r12, r8, r12, r10)
            X.5Qk r8 = androidx.compose.ui.Modifier.A00
            r16 = 1
            r14 = 0
            androidx.compose.ui.Modifier r9 = X.C51966G9m.A0T(r8)
            androidx.compose.foundation.layout.FillElement r8 = X.C287205Zk.A00
            androidx.compose.ui.Modifier r8 = r9.Ezh(r8)
            androidx.compose.ui.Modifier r28 = X.C287195Zj.A0B(r8, r10, r10, r10, r12)
            r8 = -175556537(0xfffffffff5893847, float:-3.478936E32)
            boolean r10 = X.C51967G9n.A1Z(r7, r5, r8)
            boolean r8 = X.C51974G9v.A1T(r11)
            r10 = r10 | r8
            boolean r8 = X.C51973G9u.A1L(r11)
            r10 = r10 | r8
            boolean r9 = X.C51974G9v.A1U(r11)
            r8 = r41
            boolean r12 = X.C51968G9o.A1T(r7, r8, r10, r9)
            r8 = r11 & 14
            if (r8 == r13) goto L_0x018a
            r8 = r11 & 8
            if (r8 == 0) goto L_0x0213
            boolean r8 = r7.AGw(r6)
            if (r8 == 0) goto L_0x0213
        L_0x018a:
            r10 = 1
        L_0x018b:
            r9 = r43
            r8 = r42
            boolean r9 = X.C51973G9u.A1T(r7, r9, r8, r12, r10)
            r8 = r34
            boolean r9 = X.C51966G9m.A1U(r7, r8, r9)
            boolean r8 = X.C51973G9u.A1K(r11)
            r9 = r9 | r8
            r8 = 29360128(0x1c00000, float:7.052966E-38)
            r11 = r11 & r8
            r8 = 8388608(0x800000, float:1.17549435E-38)
            if (r11 == r8) goto L_0x01a7
            r16 = 0
        L_0x01a7:
            r9 = r9 | r16
            java.lang.Object r8 = r7.ECw()
            if (r9 != 0) goto L_0x01b3
            java.lang.Object r9 = X.AnonymousClass5XT.A00
            if (r8 != r9) goto L_0x01c9
        L_0x01b3:
            X.IyF r8 = new X.IyF
            r29 = r8
            r30 = r43
            r31 = r42
            r32 = r41
            r33 = r6
            r38 = r19
            r40 = r5
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            r7.FLL(r8)
        L_0x01c9:
            X.0sP r29 = X.C51965G9l.A0z(r0, r8)
            r30 = 102432816(0x61b0030, float:2.9152398E-35)
            r31 = 144(0x90, float:2.02E-43)
            r33 = 1
            r21 = r14
            r24 = r15
            r25 = r17
            r26 = r1
            r27 = r7
            r32 = r2
            X.HQz.A00(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r18)
            r2 = -175492416(0xfffffffff58a32c0, float:-3.5037417E32)
            boolean r8 = X.C51967G9n.A1Y(r7, r1, r2)
            java.lang.Object r2 = r7.ECw()
            if (r8 != 0) goto L_0x01f8
            java.lang.Object r8 = X.AnonymousClass5XT.A00
            if (r2 != r8) goto L_0x0202
        L_0x01f8:
            r8 = 27
            X.MG6 r2 = new X.MG6
            r2.<init>(r1, r14, r8)
            r7.FLL(r2)
        L_0x0202:
            X.C51968G9o.A1E(r7, r0, r2, r9)
        L_0x0205:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00c1
            r0 = -1941884004(0xffffffff8c41339c, float:-1.488371E-31)
            X.0fL.A00(r0)
            goto L_0x00c1
        L_0x0213:
            r10 = 0
            goto L_0x018b
        L_0x0216:
            X.0wj r2 = X.0wj.A01
            r1 = 851001060(0x32b93ee4, float:2.1565434E-8)
            java.lang.String r0 = "no_generated_images"
            X.DbT.A1Q(r2, r0, r1)
            goto L_0x0205
        L_0x0221:
            r0 = r55 & 6
            if (r0 != 0) goto L_0x022f
            r0 = r41
            int r0 = X.C41848B3p.A01(r7, r0)
            r9 = r55 | r0
            goto L_0x00a9
        L_0x022f:
            r9 = r20
            goto L_0x00a9
        L_0x0233:
            r0 = r4 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x0048
            int r0 = X.G9t.A0I(r7, r5)
            r11 = r11 | r0
            goto L_0x0048
        L_0x023e:
            r0 = r4 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x0042
            r0 = r34
            int r0 = X.G9t.A0H(r7, r0)
            r11 = r11 | r0
            goto L_0x0042
        L_0x024b:
            r0 = r4 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x003a
            r0 = r42
            int r0 = X.G9t.A0G(r7, r0)
            r11 = r11 | r0
            goto L_0x003a
        L_0x0258:
            r0 = r54 & 48
            if (r0 != 0) goto L_0x0032
            r0 = r43
            int r0 = X.G9t.A0F(r7, r0)
            r11 = r11 | r0
            goto L_0x0032
        L_0x0265:
            r0 = r54 & 6
            if (r0 != 0) goto L_0x0275
            boolean r0 = X.G9t.A1T(r7, r6, r4)
            int r11 = X.C51970G9q.A05(r0)
            r11 = r11 | r54
            goto L_0x002c
        L_0x0275:
            r11 = r4
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56636I5r.A00(X.5Wy, X.60f, X.60f, com.instagram.creation.genai.magicmod.model.MagicModPostCaptureTransform, X.Gpx, X.Hkx, X.0sa, X.0sa, X.0sP, X.0sP, X.0sL, X.62P, int, int, int):void");
    }

    public static final void A02(C286575Wy r21, I12 i12, MagicModPostCaptureTransform magicModPostCaptureTransform, 0sP r24, 0sP r25, 0sL r26, int i, int i2) {
        int i3;
        0sP r4 = r25;
        C286575Wy r8 = r21;
        r8.ExV(1878770760);
        int i4 = i2;
        I12 i122 = i12;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = C41848B3p.A01(r8, i122) | i;
        } else {
            i3 = i5;
        }
        int i6 = i2 & 2;
        0sP r28 = r24;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0F(r8, r28);
        }
        0sL r27 = r26;
        if ((i4 & 4) != 0) {
            i3 |= 384;
        } else if ((i5 & 384) == 0) {
            i3 |= G9t.A0G(r8, r27);
        }
        int i7 = i4 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i5 & 3072) == 0) {
            i3 |= G9t.A0H(r8, r4);
        }
        MagicModPostCaptureTransform magicModPostCaptureTransform2 = magicModPostCaptureTransform;
        if ((i4 & 16) != 0) {
            i3 |= 24576;
        } else if ((i5 & 24576) == 0) {
            i3 |= G9t.A0I(r8, magicModPostCaptureTransform2);
        }
        if ((i3 & 9363) != 9362 || !r8.Bwn()) {
            if (i7 != 0) {
                r4 = J2K.A00;
            }
            if (0fL.A02()) {
                0fL.A01(1292852055, "com.instagram.creation.genai.magicmod.tools.backdrop.ui.MagicModBackdropVariantImageThumbnail (MagicModBackdropGeneratedImageVariants.kt:208)");
            }
            if (i122.A00 != null) {
                r8.ExS(-1504821408);
                boolean A1U = C51966G9m.A1U(r8, i122, AnonymousClass7TF.A1S(i3 & 7168, C249703kE.FLAG_MOVED));
                Object ECw = r8.ECw();
                if (A1U || ECw == AnonymousClass5XT.A00) {
                    ECw = new MGX(i122, r4, (AnonymousClass4D7) null, 10);
                    r8.FLL(ECw);
                }
                C286565Wx A0H = C51965G9l.A0H(r8, false);
                int i8 = i3 & 14;
                C286645Xf.A04(r8, i122, (0sL) ECw);
                Alignment alignment = C287215Zl.A09;
                C285245Qk r12 = Modifier.A00;
                String A00 = C304346Dc.A00(r8, 2131973036);
                boolean A1U2 = C51966G9m.A1U(r8, i122, C51973G9u.A1O(r8, -1504812333, i3));
                Object ECw2 = r8.ECw();
                if (A1U2 || ECw2 == AnonymousClass5XT.A00) {
                    ECw2 = C58717IwQ.A01(r8, i122, r28, 15);
                }
                Modifier A0H2 = G9w.A0H(C54739HQw.A00(C51967G9n.A0G(C288235ba.A03(r8, r12, A00, C51965G9l.A0y(A0H, ECw2, false)), 4.0f), 0.5625f, false));
                AnonymousClass5RD A002 = C287675aa.A00(alignment, false);
                int A003 = C287425a7.A00(r8);
                AnonymousClass5RM A04 = C286565Wx.A04(A0H);
                Modifier A01 = C287435a8.A01(r8, A0H2);
                C62320sa r10 = C287485aD.A00;
                C51973G9u.A0z(r8, A0H, r10);
                0sL r9 = C287485aD.A03;
                0sL A0w = C51969G9p.A0w(r8, A002, A04, r9);
                0sL r3 = C287485aD.A02;
                if (A0H.A0K || !C51972G9s.A1Q(r8, A003)) {
                    C51971G9r.A13(r8, r3, A003);
                }
                0sL A1K = C51966G9m.A1K(r8, A01);
                C289515dj r1 = C289515dj.A00;
                C56276Hvk.A01(r8, (HPM) null, i122, magicModPostCaptureTransform2, (0sP) null, (0sK) null, i8 | ((i3 >> 9) & 112), 28);
                Modifier AAz = r1.AAz(C287215Zl.A0D, r12);
                AnonymousClass5RD A0a = C51966G9m.A0a(false);
                int A004 = C287425a7.A00(r8);
                AnonymousClass5RM A042 = C286565Wx.A04(A0H);
                Modifier A012 = C287435a8.A01(r8, AAz);
                C51973G9u.A0z(r8, A0H, r10);
                C287595aO.A00(r8, A0a, r9);
                if (C51965G9l.A1Y(r8, A0H, A042, A0w) || !C51972G9s.A1Q(r8, A004)) {
                    C51971G9r.A13(r8, r3, A004);
                }
                C287595aO.A00(r8, A012, A1K);
                Modifier A05 = C287195Zj.A05(r12);
                boolean A1Z = C51967G9n.A1Z(r8, i122, -668498709) | C51972G9s.A1N(i3);
                Object ECw3 = r8.ECw();
                if (A1Z || ECw3 == AnonymousClass5XT.A00) {
                    ECw3 = C59102J6k.A00(r8, r27, i122, 15);
                }
                HYC.A00(r8, A05, (HLB) null, C58356Iqb.A00, C51965G9l.A0z(A0H, ECw3), 3504, 0);
                r8.ASN();
                r8.ASN();
            } else {
                DbT.A1Q(0wj.A01, "image_bitmap_null", 851001060);
            }
            if (0fL.A02()) {
                0fL.A00(255087471);
            }
        } else {
            r8.Evl();
        }
        C286625Xd ASQ = r8.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59195J9z(r4, r27, i122, r28, magicModPostCaptureTransform2, i5, i4, 10);
        }
    }

    public static final void A01(C286575Wy r20, C3018260f r21, C3018260f r22, C55638Hkx hkx, int i, boolean z) {
        int i2;
        C286575Wy r11 = r20;
        r11.ExV(2097764974);
        int i3 = i;
        C3018260f r13 = r21;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r11, r13) | i;
        } else {
            i2 = i3;
        }
        C3018260f r14 = r22;
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r11, r14);
        }
        C55638Hkx hkx2 = hkx;
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r11, hkx2);
        }
        boolean z2 = z;
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A0b(r11, z2);
        }
        if ((i2 & 1171) != 1170 || !r11.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(86499581, "com.instagram.creation.genai.magicmod.tools.backdrop.ui.MagicModBackdropVariantPlaceholder (MagicModBackdropGeneratedImageVariants.kt:158)");
            }
            Alignment alignment = C287215Zl.A09;
            Modifier A0U = C51966G9m.A0U(Modifier.A00);
            Modifier A0H = G9w.A0H(C54739HQw.A00(C287195Zj.A09(A0U, 4.0f, 0.0f), 0.5625f, false));
            AnonymousClass5RD A00 = C287675aa.A00(alignment, false);
            int A002 = C287425a7.A00(r11);
            C286565Wx r2 = (C286565Wx) r11;
            AnonymousClass5RM A04 = C286565Wx.A04(r2);
            Modifier A01 = C287435a8.A01(r11, A0H);
            C51973G9u.A0y(r11, r2);
            C51971G9r.A12(r11, A00, A04);
            0sL r5 = C287485aD.A02;
            if (r2.A0K || !C51972G9s.A1Q(r11, A002)) {
                C51971G9r.A13(r11, r5, A002);
            }
            C51965G9l.A18(r11, A01);
            C289515dj r10 = C289515dj.A00;
            C286575Wy r16 = r11;
            AnonymousClass6G3.A00(r16, (Alignment) null, A0U, (C288195bW) null, new C52926Gf0(C54748HRg.A00(r11, R.drawable.magicmod__beta_backdrop_grid)), C288075bK.A01, (String) null, 0.0f, 25016, 104);
            r11.ExS(1334751504);
            if (z2) {
                C287675aa.A02(r11, C56666I6v.A01(r11, HRF.A00(A0U, 0.2f), C56666I6v.A03(r16, (List) null, 0.0f, 0.0f, 0, 1572870, 62, AnonymousClass5RW.A04), 6), 0);
            }
            C286565Wx.A0L(r2, false);
            r11.ExS(1334765355);
            if (r13 != null) {
                int i4 = i2 << 3;
                C56275Hvj.A00(r10, r11, (Modifier) null, r13, r14, hkx2, (Integer) null, (Integer) null, C51969G9p.A04(i4, 12607494 | (i4 & 112)), 176, true, false);
            } else {
                DbT.A1Q(0wj.A01, "no_image_for_placeholder", 851001060);
            }
            if (C51971G9r.A1S(r11, r2, false)) {
                0fL.A00(-1246996080);
            }
        } else {
            r11.Evl();
        }
        C286625Xd ASQ = r11.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J8U(r13, r14, hkx2, i3, 5, z2);
        }
    }

    public static final void A03(C62320sa r13, String str, C286575Wy r15, int i) {
        int i2;
        C286575Wy r5 = r15;
        r15.ExV(-1982962571);
        int i3 = i;
        int i4 = i & 6;
        String str2 = str;
        if (i4 == 0) {
            i2 = G9t.A0O(r15, str) | i3;
        } else {
            i2 = i3;
        }
        C62320sa r4 = r13;
        if ((i3 & 48) == 0) {
            i2 |= G9t.A0F(r15, r13);
        }
        if ((i2 & 19) != 18 || !r15.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(129712607, "com.instagram.creation.genai.magicmod.tools.backdrop.ui.MagicModBackdropVariantsEditPromptButton (MagicModBackdropGeneratedImageVariants.kt:269)");
            }
            Alignment alignment = C287215Zl.A09;
            C285245Qk r8 = Modifier.A00;
            Modifier A0F = G9w.A0F(C287195Zj.A04(C51975G9x.A0F(r15, C51967G9n.A0E(r8, 12.0f))));
            boolean A1O = C51973G9u.A1O(r15, -2118696518, i2);
            Object ECw = r15.ECw();
            if (A1O || ECw == AnonymousClass5XT.A00) {
                ECw = C58672Ivh.A00(r15, r13, 2);
            }
            C286565Wx r152 = (C286565Wx) r5;
            Modifier A0D = G9w.A0D(r5, r152, A0F, (C62320sa) ECw);
            AnonymousClass5RD A00 = C287675aa.A00(alignment, false);
            int A002 = C287425a7.A00(r5);
            AnonymousClass5RM A04 = C286565Wx.A04(r152);
            Modifier A01 = C287435a8.A01(r5, A0D);
            C62320sa r14 = C287485aD.A00;
            C51973G9u.A0z(r5, r152, r14);
            0sL r132 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r5, A00, A04, r132);
            0sL r10 = C287485aD.A02;
            if (r152.A0K || !C51972G9s.A1Q(r5, A002)) {
                C51971G9r.A13(r5, r10, A002);
            }
            0sL A1K = C51966G9m.A1K(r5, A01);
            AnonymousClass5RD A0W = C51968G9o.A0W(r5);
            int A003 = C287425a7.A00(r5);
            AnonymousClass5RM A042 = C286565Wx.A04(r152);
            Modifier A012 = C287435a8.A01(r5, r8);
            C51973G9u.A0z(r5, r152, r14);
            C287595aO.A00(r5, A0W, r132);
            if (C51965G9l.A1Y(r5, r152, A042, A0w) || !C51972G9s.A1Q(r5, A003)) {
                C51971G9r.A13(r5, r10, A003);
            }
            C287595aO.A00(r5, A012, A1K);
            C288165bT.A03(r5, C287205Zk.A0C(r8, 20.0f), C287975bA.A00(r5, R.drawable.instagram_edit_pano_filled_24, 0), AnonymousClass5aQ.A00(r5).A0U);
            C51967G9n.A13(r5, r8, 10.0f);
            int i5 = i2 & 14;
            AnonymousClass5ZZ.A0n(r5, C51966G9m.A0h(r5), str2, i5, C51966G9m.A0I(r5));
            if (C51971G9r.A1R(r5)) {
                0fL.A00(1737166920);
            }
        } else {
            r15.Evl();
        }
        C286625Xd ASQ = r5.ASQ();
        if (ASQ != null) {
            JGJ.A01(ASQ, r4, str2, i3, 6);
        }
    }

    public static final void A04(C62320sa r14, String str, C286575Wy r16, int i) {
        int i2;
        C286575Wy r8 = r16;
        r8.ExV(-952237590);
        int i3 = i;
        String str2 = str;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r8, str) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r8, r14);
        }
        if ((i2 & 19) != 18 || !r8.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-745038669, "com.instagram.creation.genai.magicmod.tools.backdrop.ui.MagicModBackdropVariantsTextOnlyButton (MagicModBackdropGeneratedImageVariants.kt:246)");
            }
            Alignment alignment = C287215Zl.A09;
            Modifier A0F = G9w.A0F(C287195Zj.A04(C51975G9x.A0F(r8, C51967G9n.A0E(Modifier.A00, 12.0f))));
            boolean A1O = C51973G9u.A1O(r8, 52055653, i2);
            Object ECw = r8.ECw();
            if (A1O || ECw == AnonymousClass5XT.A00) {
                ECw = C58672Ivh.A00(r8, r14, 3);
            }
            C286565Wx r6 = (C286565Wx) r8;
            Modifier A0D = G9w.A0D(r8, r6, A0F, (C62320sa) ECw);
            AnonymousClass5RD A00 = C287675aa.A00(alignment, false);
            int A002 = C287425a7.A00(r8);
            AnonymousClass5RM A04 = C286565Wx.A04(r6);
            Modifier A01 = C287435a8.A01(r8, A0D);
            C51973G9u.A0y(r8, r6);
            C51971G9r.A12(r8, A00, A04);
            0sL r1 = C287485aD.A02;
            if (r6.A0K || !C51972G9s.A1Q(r8, A002)) {
                C51971G9r.A13(r8, r1, A002);
            }
            C51965G9l.A18(r8, A01);
            AnonymousClass5ZZ.A0n(r8, C51966G9m.A0h(r8), str2, i2 & 14, C51966G9m.A0I(r8));
            if (C51967G9n.A1R(r8)) {
                0fL.A00(847562206);
            }
        } else {
            r8.Evl();
        }
        C286625Xd ASQ = r8.ASQ();
        if (ASQ != null) {
            JGJ.A01(ASQ, r14, str, i3, 7);
        }
    }
}
