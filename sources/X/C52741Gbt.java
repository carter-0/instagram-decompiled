package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;

/* renamed from: X.Gbt  reason: case insensitive filesystem */
public abstract class C52741Gbt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v31, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v75, resolved type: X.Gc4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v7, resolved type: X.Gc4} */
    /* JADX WARNING: type inference failed for: r0v32 */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0155, code lost:
        if (r0 == X.AnonymousClass5XT.A00) goto L_0x0157;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C286575Wy r25, X.C53396GnT r26, X.JOX r27, X.JOX r28, X.JOX r29, com.instagram.settings2.core.viewmodel.SettingsScreenViewModel r30, X.0sP r31, X.0sP r32, X.0sL r33, X.0sL r34, int r35) {
        /*
            r7 = 0
            r13 = r26
            r20 = r33
            r0 = r20
            boolean r26 = X.AnonymousClass7TF.A1U(r7, r13, r0)
            r6 = 2
            r12 = r27
            X.0qQ.A0B(r12, r6)
            r1 = 3
            r11 = r28
            r10 = r29
            r27 = r31
            r15 = r34
            r0 = r27
            X.C51974G9v.A0d(r1, r11, r15, r0, r10)
            r5 = 7
            r9 = r30
            r18 = r32
            r0 = r18
            X.AnonymousClass7TF.A1F(r0, r5, r9)
            r0 = -348433592(0xffffffffeb3b5348, float:-2.2646241E26)
            r14 = r25
            r14.ExV(r0)
            r8 = r35
            r0 = r35 & 6
            if (r0 != 0) goto L_0x01a8
            int r4 = X.C41848B3p.A01(r14, r13)
            r4 = r4 | r35
        L_0x003d:
            r0 = r35 & 48
            if (r0 != 0) goto L_0x0048
            r0 = r20
            int r0 = X.G9t.A0F(r14, r0)
            r4 = r4 | r0
        L_0x0048:
            r0 = r8 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x0059
            r0 = r8 & 512(0x200, float:7.175E-43)
            boolean r1 = X.C51972G9s.A1V(r14, r12, r0)
            r0 = 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0058
            r0 = 256(0x100, float:3.59E-43)
        L_0x0058:
            r4 = r4 | r0
        L_0x0059:
            r0 = r8 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x006a
            r0 = r8 & 4096(0x1000, float:5.74E-42)
            boolean r1 = X.C51972G9s.A1V(r14, r11, r0)
            r0 = 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0069
            r0 = 2048(0x800, float:2.87E-42)
        L_0x0069:
            r4 = r4 | r0
        L_0x006a:
            r0 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x0073
            int r0 = X.G9t.A0I(r14, r15)
            r4 = r4 | r0
        L_0x0073:
            r0 = 196608(0x30000, float:2.75506E-40)
            r0 = r0 & r35
            if (r0 != 0) goto L_0x0080
            r0 = r27
            int r0 = X.G9t.A0J(r14, r0)
            r4 = r4 | r0
        L_0x0080:
            r0 = 1572864(0x180000, float:2.204052E-39)
            r0 = r0 & r35
            r3 = 2097152(0x200000, float:2.938736E-39)
            if (r0 != 0) goto L_0x0093
            boolean r1 = X.G9t.A1V(r14, r10, r8, r3)
            r0 = 524288(0x80000, float:7.34684E-40)
            if (r1 == 0) goto L_0x0092
            r0 = 1048576(0x100000, float:1.469368E-39)
        L_0x0092:
            r4 = r4 | r0
        L_0x0093:
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r0 & r35
            if (r0 != 0) goto L_0x00a0
            r0 = r18
            int r0 = X.G9t.A0L(r14, r0)
            r4 = r4 | r0
        L_0x00a0:
            r0 = 100663296(0x6000000, float:2.4074124E-35)
            r0 = r0 & r35
            if (r0 != 0) goto L_0x00ab
            int r0 = X.G9t.A0M(r14, r9)
            r4 = r4 | r0
        L_0x00ab:
            r1 = 38347923(0x2492493, float:1.4777644E-37)
            r1 = r1 & r4
            r0 = 38347922(0x2492492, float:1.4777643E-37)
            if (r1 != r0) goto L_0x00e0
            boolean r0 = r14.Bwn()
            if (r0 == 0) goto L_0x00e0
            r14.Evl()
        L_0x00bd:
            X.5Xd r0 = r14.ASQ()
            if (r0 == 0) goto L_0x00df
            X.JBn r14 = new X.JBn
            r23 = r15
            r24 = r8
            r25 = r6
            r19 = r20
            r20 = r27
            r21 = r11
            r22 = r10
            r15 = r13
            r16 = r18
            r17 = r9
            r18 = r12
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r0.A06 = r14
        L_0x00df:
            return
        L_0x00e0:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00ee
            r1 = -1325560333(0xffffffffb0fd8df3, float:-1.8448517E-9)
            java.lang.String r0 = "com.instagram.settings2.core.view.SettingsScreen (SettingsScreen.kt:57)"
            X.0fL.A01(r1, r0)
        L_0x00ee:
            X.4bM r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.A01
            r14.AJO(r0)
            r2 = 0
            r0 = 974764413(0x3a19b97d, float:5.864127E-4)
            boolean r1 = X.C51967G9n.A1Z(r14, r13, r0)
            boolean r0 = X.C51974G9v.A1V(r4)
            r1 = r1 | r0
            boolean r0 = X.C51974G9v.A1T(r4)
            r1 = r1 | r0
            boolean r0 = X.C51973G9u.A1H(r4)
            boolean r16 = X.C51968G9o.A1T(r14, r9, r1, r0)
            boolean r0 = X.C51974G9v.A1W(r4)
            r16 = r16 | r0
            r1 = r4 & 896(0x380, float:1.256E-42)
            r0 = 256(0x100, float:3.59E-43)
            if (r1 == r0) goto L_0x0123
            r0 = r4 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x01a5
            boolean r0 = r14.AGw(r12)
            if (r0 == 0) goto L_0x01a5
        L_0x0123:
            r0 = 1
        L_0x0124:
            r16 = r16 | r0
            r1 = 3670016(0x380000, float:5.142788E-39)
            r1 = r1 & r4
            r0 = 1048576(0x100000, float:1.469368E-39)
            if (r1 == r0) goto L_0x0137
            r0 = r4 & r3
            if (r0 == 0) goto L_0x01a3
            boolean r0 = r14.AGw(r10)
            if (r0 == 0) goto L_0x01a3
        L_0x0137:
            r0 = 1
        L_0x0138:
            r16 = r16 | r0
            r1 = r4 & 7168(0x1c00, float:1.0045E-41)
            r0 = 2048(0x800, float:2.87E-42)
            if (r1 == r0) goto L_0x014a
            r0 = r4 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x01a1
            boolean r0 = r14.AGw(r11)
            if (r0 == 0) goto L_0x01a1
        L_0x014a:
            r0 = 1
        L_0x014b:
            r16 = r16 | r0
            java.lang.Object r0 = r14.ECw()
            if (r16 != 0) goto L_0x0157
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r0 != r1) goto L_0x016f
        L_0x0157:
            X.Gc4 r0 = new X.Gc4
            r16 = r0
            r17 = r13
            r19 = r27
            r21 = r9
            r22 = r15
            r23 = r12
            r24 = r10
            r25 = r11
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r14.FLL(r0)
        L_0x016f:
            X.0sP r0 = (X.0sP) r0
            X.5Wx r4 = X.C51965G9l.A0H(r14, r7)
            X.AnonymousClass6HY.A09(r14, r0)
            java.lang.Object r3 = r13.A04
            r0 = 974916711(0x3a1c0c67, float:5.952776E-4)
            boolean r1 = X.C51973G9u.A1S(r14, r9, r13, r0)
            java.lang.Object r0 = r14.ECw()
            if (r1 != 0) goto L_0x018b
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r0 != r1) goto L_0x0193
        L_0x018b:
            X.MGx r0 = new X.MGx
            r0.<init>((java.lang.Object) r9, (java.lang.Object) r13, (X.AnonymousClass4D7) r2, (int) r5)
            r14.FLL(r0)
        L_0x0193:
            boolean r0 = X.C51972G9s.A1S(r14, r4, r0, r3)
            if (r0 == 0) goto L_0x00bd
            r0 = -808713489(0xffffffffcfcc02ef, float:-6.8454886E9)
            X.0fL.A00(r0)
            goto L_0x00bd
        L_0x01a1:
            r0 = 0
            goto L_0x014b
        L_0x01a3:
            r0 = 0
            goto L_0x0138
        L_0x01a5:
            r0 = 0
            goto L_0x0124
        L_0x01a8:
            r4 = r8
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52741Gbt.A01(X.5Wy, X.GnT, X.JOX, X.JOX, X.JOX, com.instagram.settings2.core.viewmodel.SettingsScreenViewModel, X.0sP, X.0sP, X.0sL, X.0sL, int):void");
    }

    public static final void A00(C286575Wy r9, C61083JwL jwL, XRY xry, int i) {
        int i2;
        C57120IPj iPj;
        C286575Wy r3 = r9;
        r9.ExV(-1260308514);
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r9, xry) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r9, jwL);
        }
        if ((i2 & 19) != 18 || !r9.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1412115937, "com.instagram.settings2.core.view.SectionHeader (SettingsScreen.kt:186)");
            }
            String A12 = C51968G9o.A12(r9, jwL);
            HL9 hl9 = HL9.Mini;
            r9.ExS(-639474187);
            if (xry == XRY.A0t) {
                iPj = new C57120IPj(C51965G9l.A0N(AnonymousClass5RW.A08), C51967G9n.A0J(r9, R.drawable.company_brand_meta_lockup_primary_12));
            } else {
                iPj = null;
            }
            C51968G9o.A1N(r9);
            C52747Gbz.A00(r3, (Modifier) null, iPj, hl9, A12, 33152, 42);
            if (0fL.A02()) {
                0fL.A00(920430104);
            }
        } else {
            r9.Evl();
        }
        C286625Xd ASQ = r3.ASQ();
        if (ASQ != null) {
            JGM.A01(ASQ, xry, jwL, i, 11);
        }
    }
}
