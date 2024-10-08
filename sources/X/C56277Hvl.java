package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;

/* renamed from: X.Hvl  reason: case insensitive filesystem */
public abstract class C56277Hvl {
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005f, code lost:
        if ((r4 & 384) == 256) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
        if ((r31 & 6) == 4) goto L_0x0074;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C286575Wy r27, X.H93 r28, com.instagram.creation.genai.magicmod.model.MagicModPostCaptureTransform r29, X.0sP r30, int r31) {
        /*
            r1 = 0
            r2 = r28
            r9 = r30
            int r22 = X.DbW.A02(r1, r2, r9)
            r0 = -336398828(0xffffffffebf2f614, float:-5.8744424E26)
            r14 = r27
            boolean r0 = X.C51967G9n.A1T(r14, r0)
            if (r0 == 0) goto L_0x001c
            r3 = 1537540238(0x5ba5008e, float:9.2887962E16)
            java.lang.String r0 = "com.instagram.creation.genai.magicmod.common.ui.VisualPreviewSuggestedPrompt (VisualPreviewSuggestedPrompt.kt:42)"
            X.0fL.A01(r3, r0)
        L_0x001c:
            X.JLt r3 = r2.A01
            boolean r0 = r3 instanceof X.C53522Gps
            r15 = 0
            if (r0 == 0) goto L_0x0186
            X.Gps r3 = (X.C53522Gps) r3
            if (r3 == 0) goto L_0x0186
            X.I12 r5 = r3.A00
        L_0x0029:
            X.5Qk r3 = androidx.compose.ui.Modifier.A00
            r0 = 1119092736(0x42b40000, float:90.0)
            androidx.compose.ui.Modifier r4 = X.C287205Zk.A0D(r3, r0)
            r0 = 1126170624(0x43200000, float:160.0)
            androidx.compose.ui.Modifier r4 = X.C287205Zk.A08(r4, r0)
            X.5ZQ r0 = X.HYI.A00(r14)
            androidx.compose.ui.Modifier r8 = X.AnonymousClass6FZ.A01(r4, r0)
            r0 = 2131965788(0x7f13375c, float:1.9568396E38)
            java.lang.String r7 = X.C304346Dc.A00(r14, r0)
            r0 = 15913720(0xf2d2f8, float:2.2299871E-38)
            r14.ExS(r0)
            r4 = r31
            r0 = r4 & 896(0x380, float:1.256E-42)
            r0 = r0 ^ 384(0x180, float:5.38E-43)
            r6 = 256(0x100, float:3.59E-43)
            if (r0 <= r6) goto L_0x005c
            boolean r0 = r14.AGu(r9)
            if (r0 != 0) goto L_0x0061
        L_0x005c:
            r0 = r4 & 384(0x180, float:5.38E-43)
            r11 = 0
            if (r0 != r6) goto L_0x0062
        L_0x0061:
            r11 = 1
        L_0x0062:
            r0 = r31 & 14
            r0 = r0 ^ 6
            r10 = 4
            if (r0 <= r10) goto L_0x006f
            boolean r0 = r14.AGu(r2)
            if (r0 != 0) goto L_0x0074
        L_0x006f:
            r6 = r31 & 6
            r0 = 0
            if (r6 != r10) goto L_0x0075
        L_0x0074:
            r0 = 1
        L_0x0075:
            r11 = r11 | r0
            java.lang.Object r6 = r14.ECw()
            if (r11 != 0) goto L_0x0080
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r6 != r0) goto L_0x0085
        L_0x0080:
            r0 = 6
            X.IwQ r6 = X.C58717IwQ.A01(r14, r9, r2, r0)
        L_0x0085:
            X.0sa r6 = (X.C62320sa) r6
            X.5Wx r0 = X.C51965G9l.A0H(r14, r1)
            androidx.compose.ui.Modifier r11 = X.C288235ba.A03(r14, r8, r7, r6)
            androidx.compose.ui.Alignment r8 = X.C287215Zl.A0E
            X.5RD r7 = X.C287675aa.A00(r8, r1)
            int r12 = X.C287425a7.A00(r14)
            X.5RM r6 = X.C286565Wx.A04(r0)
            androidx.compose.ui.Modifier r11 = X.C287435a8.A01(r14, r11)
            X.C51973G9u.A0y(r14, r0)
            X.C51971G9r.A12(r14, r7, r6)
            X.0sL r7 = X.C287485aD.A02
            boolean r6 = r0.A0K
            if (r6 != 0) goto L_0x00b3
            boolean r6 = X.C51972G9s.A1Q(r14, r12)
            if (r6 != 0) goto L_0x00b6
        L_0x00b3:
            X.C51971G9r.A13(r14, r7, r12)
        L_0x00b6:
            X.C51965G9l.A18(r14, r11)
            X.5dj r7 = X.C289515dj.A00
            r13 = r29
            if (r5 == 0) goto L_0x014f
            r6 = 2133249810(0x7f26cf12, float:2.2172702E38)
            r14.ExS(r6)
            r20 = 72
            r21 = 28
            r18 = r15
            r19 = r15
            r17 = r13
            r16 = r5
            X.C56276Hvk.A01(r14, r15, r16, r17, r18, r19, r20, r21)
        L_0x00d4:
            X.C286565Wx.A0L(r0, r1)
            java.lang.String r5 = r2.A02
            androidx.compose.ui.Alignment r6 = X.C287215Zl.A08
            androidx.compose.ui.Modifier r12 = r7.AAz(r6, r3)
            r11 = 1086324736(0x40c00000, float:6.0)
            r6 = 1098907648(0x41800000, float:16.0)
            androidx.compose.ui.Modifier r18 = X.C287195Zj.A09(r12, r11, r6)
            long r24 = X.G9w.A05(r14)
            X.5Z4 r19 = X.C51966G9m.A0f(r14)
            r23 = 11256(0x2bf8, float:1.5773E-41)
            r17 = r14
            r20 = r5
            r21 = r10
            X.AnonymousClass5ZZ.A0F(r17, r18, r19, r20, r21, r22, r23, r24)
            com.instagram.common.typedurl.ImageUrl r6 = r2.A00
            boolean r5 = r2.A04
            if (r5 == 0) goto L_0x012c
            r5 = 2134388037(0x7f382d45, float:2.44813E38)
            r14.ExS(r5)
            androidx.compose.ui.Modifier r3 = r7.AAz(r8, r3)
            androidx.compose.ui.Modifier r3 = X.C287195Zj.A02(r3)
            A00(r14, r3, r1)
        L_0x0111:
            boolean r0 = X.C51971G9r.A1S(r14, r0, r1)
            if (r0 == 0) goto L_0x011d
            r0 = -1951098393(0xffffffff8bb499e7, float:-6.9565045E-32)
            X.0fL.A00(r0)
        L_0x011d:
            X.5Xd r1 = r14.ASQ()
            if (r1 == 0) goto L_0x012b
            r0 = 24
            X.JGN r0 = X.JGN.A01(r2, r13, r9, r4, r0)
            r1.A06 = r0
        L_0x012b:
            return
        L_0x012c:
            if (r6 == 0) goto L_0x0148
            r5 = 2134526204(0x7f3a48fc, float:2.4761536E38)
            r14.ExS(r5)
            X.2DN r10 = X.1zC.A00(r14, r6)
            X.IPe r6 = X.C57115IPe.A00
            androidx.compose.ui.Modifier r3 = r7.AAz(r8, r3)
            androidx.compose.ui.Modifier r5 = X.C287195Zj.A02(r3)
            r3 = 56
            X.GRY.A02(r14, r5, r10, r6, r3)
            goto L_0x0111
        L_0x0148:
            r3 = 2134760688(0x7f3ddcf0, float:2.5237126E38)
            r14.ExS(r3)
            goto L_0x0111
        L_0x014f:
            r5 = 2133423937(0x7f297741, float:2.2525873E38)
            r14.ExS(r5)
            androidx.compose.ui.Modifier r11 = X.C51966G9m.A0U(r3)
            X.5Yw r5 = X.AnonymousClass5aQ.A00(r14)
            long r5 = r5.A08
            androidx.compose.ui.Modifier r5 = X.C51966G9m.A0X(r11, r5)
            X.5Yw r6 = X.AnonymousClass5aQ.A00(r14)
            long r11 = r6.A08
            r25 = 0
            r28 = 1572864(0x180000, float:2.204052E-39)
            r29 = 62
            r23 = r14
            r24 = r15
            r26 = r25
            r27 = r1
            r30 = r11
            X.Hqp r6 = X.C56666I6v.A03(r23, r24, r25, r26, r27, r28, r29, r30)
            androidx.compose.ui.Modifier r5 = X.C56666I6v.A01(r14, r5, r6, r1)
            X.C287675aa.A02(r14, r5, r1)
            goto L_0x00d4
        L_0x0186:
            r5 = r15
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56277Hvl.A01(X.5Wy, X.H93, com.instagram.creation.genai.magicmod.model.MagicModPostCaptureTransform, X.0sP, int):void");
    }

    public static final void A00(C286575Wy r10, Modifier modifier, int i) {
        int i2;
        r10.ExV(-343536466);
        if ((i & 14) == 0) {
            i2 = G9t.A0O(r10, modifier) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !r10.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1548750564, "com.instagram.creation.genai.magicmod.common.ui.TrendingPromptIcon (VisualPreviewSuggestedPrompt.kt:98)");
            }
            AnonymousClass5RD A00 = C287675aa.A00(C287215Zl.A09, false);
            int A002 = C287425a7.A00(r10);
            C286565Wx r3 = (C286565Wx) r10;
            AnonymousClass5RM A04 = C286565Wx.A04(r3);
            Modifier A01 = C287435a8.A01(r10, modifier);
            C51973G9u.A0y(r10, r3);
            C51971G9r.A12(r10, A00, A04);
            0sL r1 = C287485aD.A02;
            if (r3.A0K || !C51972G9s.A1Q(r10, A002)) {
                C51971G9r.A13(r10, r1, A002);
            }
            C51965G9l.A18(r10, A01);
            AnonymousClass2DO A003 = C287975bA.A00(r10, R.drawable.instagram_promote_pano_outline_24, 0);
            long j = AnonymousClass5aQ.A00(r10).A0y;
            C285245Qk r6 = Modifier.A00;
            C288165bT.A04(r10, C56164Htt.A00(C287205Zk.A0C(r6, 20.0f), 1.0f, 2.0f), A003, j);
            C288165bT.A04(r10, C287205Zk.A0C(r6, 20.0f), C287975bA.A00(r10, R.drawable.instagram_promote_pano_outline_24, 0), G9w.A05(r10));
            if (C51967G9n.A1R(r10)) {
                0fL.A00(-718849245);
            }
        } else {
            r10.Evl();
        }
        C286625Xd ASQ = r10.ASQ();
        if (ASQ != null) {
            JGC.A01(ASQ, modifier, i, 48);
        }
    }
}
