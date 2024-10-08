package X;

import android.graphics.Bitmap;
import android.graphics.ColorMatrixColorFilter;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import java.util.Arrays;
import org.webrtc.CameraCapturer;

/* renamed from: X.Hvj  reason: case insensitive filesystem */
public abstract class C56275Hvj {
    /* JADX WARNING: type inference failed for: r7v21, types: [X.Gep, X.5bW] */
    public static final void A00(C289525dk r33, C286575Wy r34, Modifier modifier, C3018260f r36, C3018260f r37, C55638Hkx hkx, Integer num, Integer num2, int i, int i2, boolean z, boolean z2) {
        Integer num3;
        Modifier modifier2;
        Modifier modifier3;
        C288195bW r7;
        Modifier modifier4;
        Modifier modifier5;
        Integer num4 = num2;
        Modifier modifier6 = modifier;
        Integer num5 = num;
        C289525dk r19 = r33;
        C3018260f r15 = r36;
        boolean A1U = AnonymousClass7TF.A1U(0, r19, r15);
        C286575Wy r0 = r34;
        r0.ExV(-250480142);
        int i3 = i2;
        if ((i2 & 16) != 0) {
            num5 = AnonymousClass05K.A0C;
        }
        if ((i2 & 32) != 0) {
            modifier6 = null;
        }
        boolean A1R = C51966G9m.A1R(i2 & 64, z2);
        if ((i3 & 128) != 0) {
            num4 = AnonymousClass05K.A02;
        }
        if (0fL.A02()) {
            0fL.A01(-1775984990, "com.instagram.creation.genai.magicmod.common.ui.ImageWithSegmentationMaskOutline (ImageWithSegmentationMaskOutline.kt:84)");
        }
        if (C51967G9n.A1U(r0, 14169293)) {
            0fL.A01(-434253034, "com.instagram.creation.genai.magicmod.common.ui.popupScaleAnimationModifier (ImageWithSegmentationMaskOutline.kt:143)");
        }
        Integer num6 = AnonymousClass05K.A00;
        if (num5 == num6) {
            Object A0m = C51967G9n.A0m(r0, 952104275);
            if (A0m == AnonymousClass5XT.A00) {
                A0m = new C52882GeI(false);
                r0.FLL(A0m);
            }
            C51965G9l.A1X(r0, false);
            ((C52882GeI) A0m).A00(Boolean.valueOf(A1U));
            GRI A02 = GRH.A02(r0);
            GQC A01 = GQC.A01(C52518GVv.A00, CameraCapturer.OPEN_CAMERA_DELAY_MS, IgNetworkConsentStorage.MAX_ENTRIES);
            num3 = AnonymousClass05K.A01;
            GRG A012 = GRH.A01(new GRJ(A01, num3), A02, r0, 1.0f, 1.05f, 29112);
            modifier3 = Modifier.A00;
            float A022 = C51972G9s.A02(A012.A08);
            modifier2 = HRI.A00(modifier3, A022, A022);
        } else {
            num3 = AnonymousClass05K.A01;
            if (num5 == num3 || num5 == AnonymousClass05K.A0C) {
                modifier2 = Modifier.A00;
                modifier3 = modifier2;
            } else {
                throw AnonymousClass7TE.A1K();
            }
        }
        if (0fL.A02()) {
            0fL.A00(-1722775676);
        }
        C286565Wx A0H = C51965G9l.A0H(r0, false);
        C3018260f r18 = r37;
        boolean A1V = AnonymousClass7TF.A1V(r18);
        AnonymousClass6GC r12 = new AnonymousClass6GC(r15);
        String A00 = C304346Dc.A00(r0, 2131969731);
        float f = 1.0f;
        if (A1V) {
            float[] fArr = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
            Arrays.fill(fArr, 0, 20, 0.0f);
            fArr[0] = 1.0f;
            fArr[12] = 1.0f;
            fArr[6] = 1.0f;
            fArr[18] = 1.0f;
            fArr[0] = 0.5f;
            fArr[6] = 0.5f;
            fArr[12] = 0.5f;
            fArr[18] = 1.0f;
            ? r72 = new C288195bW(new ColorMatrixColorFilter(fArr));
            r72.A00 = fArr;
            r7 = r72;
        } else {
            r7 = null;
        }
        boolean z3 = z;
        if (modifier6 == null) {
            Bitmap bitmap = ((C3018360g) r15).A00;
            Modifier Ezh = C54739HQw.A00(modifier3, ((float) bitmap.getWidth()) / ((float) bitmap.getHeight()), false).Ezh(C287205Zk.A01);
            if (z) {
                f = 0.0f;
            }
            modifier4 = HRF.A00(Ezh, f);
        } else {
            modifier4 = modifier6;
        }
        C286575Wy r28 = r0;
        AnonymousClass6G3.A00(r28, (Alignment) null, modifier4, r7, r12, C288075bK.A04, A00, 0.0f, 24584, 40);
        C55638Hkx hkx2 = hkx;
        int i4 = i;
        if (hkx != null) {
            Modifier Ezh2 = r19.CmS(modifier3).Ezh(modifier2);
            if (C51967G9n.A1U(r0, 691144964)) {
                0fL.A01(-2124190795, "com.instagram.creation.genai.magicmod.common.ui.outlineFadeInAnimationModifier (ImageWithSegmentationMaskOutline.kt:126)");
            }
            if (num5 == num3) {
                Object A0m2 = C51967G9n.A0m(r0, 2017012203);
                Object obj = AnonymousClass5XT.A00;
                if (A0m2 == obj) {
                    A0m2 = G9t.A0o(r0, Float.valueOf(0.0f));
                }
                C284945Oz A0J = C51965G9l.A0J(A0H, A0m2, false);
                C60340gF r9 = C60340gF.A00;
                Object A0m3 = C51967G9n.A0m(r0, 2017014221);
                if (A0m3 == obj) {
                    A0m3 = new MG6(A0J, (AnonymousClass4D7) null, 23);
                    r0.FLL(A0m3);
                }
                C51968G9o.A1E(r0, A0H, A0m3, r9);
                modifier5 = HRF.A00(modifier3, C51971G9r.A02(A0J));
            } else if (num5 == num6 || num5 == AnonymousClass05K.A0C) {
                modifier5 = modifier3;
            } else {
                throw AnonymousClass7TE.A1K();
            }
            if (0fL.A02()) {
                0fL.A00(-210128254);
            }
            Modifier A0B = C51967G9n.A0B(A0H, Ezh2, modifier5);
            AnonymousClass5RD A0a = C51966G9m.A0a(false);
            int A002 = C287425a7.A00(r0);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A013 = C287435a8.A01(r0, A0B);
            C51973G9u.A0y(r0, A0H);
            C51971G9r.A12(r0, A0a, A04);
            0sL r73 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r0, A002)) {
                C51971G9r.A13(r0, r73, A002);
            }
            C51965G9l.A18(r0, A013);
            int i5 = i >> 18;
            A01(r28, hkx2, num4, (i5 & 112) | 8 | (i5 & 896), 0, A1R);
            r0.ASN();
            HYL.A00(r0, r19.CmS(modifier3).Ezh(modifier2), r15, new C3018360g(hkx2.A01), (C288095bM) null, (String) null, 456, 16);
        }
        if (0fL.A02()) {
            0fL.A00(-934009607);
        }
        C286625Xd ASQ = r0.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JCA(r19, r15, r18, hkx2, num5, modifier6, num4, i4, i3, 2, z3, A1R);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004f, code lost:
        if (android.os.Build.VERSION.SDK_INT < 31) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0041, code lost:
        if (X.DbY.A1Y(X.0Tu.A05, r5, 36328882089049758L) == false) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C286575Wy r18, X.C55638Hkx r19, java.lang.Integer r20, int r21, int r22, boolean r23) {
        /*
            r3 = r20
            r0 = -990667248(0xffffffffc4f39e10, float:-1948.9395)
            r8 = r18
            r8.ExV(r0)
            r18 = r22
            r0 = r22 & 2
            r1 = r23
            boolean r22 = X.C51966G9m.A1R(r0, r1)
            r0 = r18 & 4
            if (r0 == 0) goto L_0x001a
            java.lang.Integer r3 = X.AnonymousClass05K.A02
        L_0x001a:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0028
            r1 = -720401487(0xffffffffd50f8bb1, float:-9.8643833E12)
            java.lang.String r0 = "com.instagram.creation.genai.magicmod.common.ui.AnimatedOutline (ImageWithSegmentationMaskOutline.kt:175)"
            X.0fL.A01(r1, r0)
        L_0x0028:
            X.09i r0 = X.08y.A00()
            X.0Ic r0 = r0.A05
            com.instagram.common.session.UserSession r5 = r0.A00
            java.lang.Integer r1 = X.AnonymousClass05K.A15
            r0 = 0
            if (r3 != r1) goto L_0x0043
            X.0Tu r4 = X.0Tu.A05
            r1 = 36328882089049758(0x8110ed00013e9e, double:3.03786954555706E-306)
            boolean r1 = X.DbY.A1Y(r4, r5, r1)
            r7 = 1
            if (r1 != 0) goto L_0x0044
        L_0x0043:
            r7 = 0
        L_0x0044:
            r1 = r19
            android.graphics.Bitmap r4 = r1.A00
            if (r22 == 0) goto L_0x0051
            int r6 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            r5 = 1
            if (r6 >= r2) goto L_0x0052
        L_0x0051:
            r5 = 0
        L_0x0052:
            r19 = 6
            X.GRI r11 = X.GRH.A02(r8)
            r2 = -230698982(0xfffffffff23fd01a, float:-3.7992458E30)
            r8.ExS(r2)
            r9 = 0
            if (r5 == 0) goto L_0x011c
            X.JNL r5 = X.C52518GVv.A02
            r2 = 1000(0x3e8, float:1.401E-42)
            X.GQC r5 = X.GQC.A01(r5, r2, r0)
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            X.GRJ r10 = new X.GRJ
            r10.<init>(r5, r2)
            r15 = 29112(0x71b8, float:4.0795E-41)
            r13 = 0
            r14 = 1065353216(0x3f800000, float:1.0)
            r12 = r8
            X.GRG r5 = X.GRH.A01(r10, r11, r12, r13, r14, r15)
        L_0x007a:
            X.5Wx r2 = X.C51965G9l.A0H(r8, r0)
            r6 = -230685547(0xfffffffff2400495, float:-3.8033063E30)
            boolean r6 = X.C51967G9n.A1Y(r8, r4, r6)
            java.lang.Object r12 = r8.ECw()
            if (r6 != 0) goto L_0x008f
            java.lang.Object r6 = X.AnonymousClass5XT.A00
            if (r12 != r6) goto L_0x009c
        L_0x008f:
            X.60g r6 = new X.60g
            r6.<init>(r4)
            X.6GC r12 = new X.6GC
            r12.<init>(r6)
            r8.FLL(r12)
        L_0x009c:
            X.2DO r12 = (X.AnonymousClass2DO) r12
            X.C286565Wx.A0L(r2, r0)
            r4 = -230680815(0xfffffffff2401711, float:-3.8047365E30)
            r8.ExS(r4)
            if (r7 == 0) goto L_0x00d7
            androidx.compose.ui.Modifier r7 = X.C51968G9o.A0O()
            r6 = 1086324736(0x40c00000, float:6.0)
            float r5 = X.C51971G9r.A03(r5)
            r4 = 1101004800(0x41a00000, float:20.0)
            float r5 = r5 * r4
            r4 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 * r4
            r4 = 1077936128(0x40400000, float:3.0)
            float r5 = r5 / r4
            float r6 = r6 + r5
            X.5S2 r4 = X.C55299HfS.A00
            androidx.compose.ui.Modifier r10 = X.HRG.A00(r7, r4, r6, r6)
            long r4 = X.AnonymousClass5RW.A09
            X.5bV r11 = X.C51968G9o.A0R(r4)
            X.5bM r13 = X.C288075bK.A04
            r15 = 1065185444(0x3f7d70a4, float:0.99)
            r16 = 1794104(0x1b6038, float:2.514075E-39)
            r17 = 8
            r14 = r9
            X.AnonymousClass6G3.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
        L_0x00d7:
            X.C286565Wx.A0L(r2, r0)
            androidx.compose.ui.Modifier r4 = X.C51968G9o.A0O()
            r2 = 1065353216(0x3f800000, float:1.0)
            X.5S2 r0 = X.C55299HfS.A00
            androidx.compose.ui.Modifier r10 = X.HRG.A00(r4, r0, r2, r2)
            long r4 = X.AnonymousClass5RW.A09
            X.5bV r11 = X.C51968G9o.A0R(r4)
            X.5bM r13 = X.C288075bK.A04
            r15 = 1065185444(0x3f7d70a4, float:0.99)
            r16 = 1794488(0x1b61b8, float:2.514613E-39)
            r17 = 8
            r14 = r9
            X.AnonymousClass6G3.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0106
            r0 = -906832749(0xffffffffc9f2d493, float:-1989266.4)
            X.0fL.A00(r0)
        L_0x0106:
            X.5Xd r2 = r8.ASQ()
            if (r2 == 0) goto L_0x011b
            X.J8R r0 = new X.J8R
            r17 = r21
            r20 = r3
            r21 = r1
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r2.A06 = r0
        L_0x011b:
            return
        L_0x011c:
            java.lang.Float r2 = X.C51967G9n.A0h()
            androidx.compose.runtime.ParcelableSnapshotMutableState r5 = X.C51970G9q.A0S(r2)
            goto L_0x007a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56275Hvj.A01(X.5Wy, X.Hkx, java.lang.Integer, int, int, boolean):void");
    }
}
