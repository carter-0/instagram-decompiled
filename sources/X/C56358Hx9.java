package X;

import android.content.Context;
import androidx.compose.ui.Modifier;
import com.instagram.android.R;

/* renamed from: X.Hx9  reason: case insensitive filesystem */
public abstract class C56358Hx9 {
    public static final void A00(Context context, C286575Wy r16, int i, boolean z) {
        int i2;
        Context context2 = context;
        0qQ.A0B(context, 0);
        C286575Wy r13 = r16;
        r13.ExV(32790973);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r13, context) | i;
        } else {
            i2 = i3;
        }
        boolean z2 = z;
        if ((i & 48) == 0) {
            i2 |= G9t.A0Z(r13, z2);
        }
        if ((i2 & 19) != 18 || !r13.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1134254010, "com.instagram.wonderwall.ui.compose.components.MusicWave (WallMusicAttachment.kt:271)");
            }
            Object A0m = C51967G9n.A0m(r13, -751132633);
            Object obj = AnonymousClass5XT.A00;
            boolean z3 = true;
            AnonymousClass6KL r9 = A0m;
            if (A0m == obj) {
                AnonymousClass6KL A00 = AnonymousClass6KK.A00(1.0f, 16, true);
                A00.A0A.setColor(AnonymousClass7TF.A03(context, R.attr.igds_color_icon_on_media));
                r13.FLL(A00);
                r9 = A00;
            }
            C286565Wx A0H = C51965G9l.A0H(r13, false);
            Modifier A03 = C287205Zk.A03(Modifier.A00);
            boolean A1Z = C51967G9n.A1Z(r13, r9, -751121277);
            Object ECw = r13.ECw();
            if (A1Z || ECw == obj) {
                ECw = new MPC(r9, 45);
                r13.FLL(ECw);
            }
            0sP A0z = C51965G9l.A0z(A0H, ECw);
            boolean A1Z2 = C51967G9n.A1Z(r13, r9, -751118487);
            if ((i2 & 112) != 32) {
                z3 = false;
            }
            boolean z4 = A1Z2 | z3;
            Object ECw2 = r13.ECw();
            if (z4 || ECw2 == obj) {
                ECw2 = new C58736Iwj(28, r9, z2);
                r13.FLL(ECw2);
            }
            I63.A02(r13, A03, A0z, C51965G9l.A0z(A0H, ECw2), 48, 0);
            if (0fL.A02()) {
                0fL.A00(-1723194113);
            }
        } else {
            r13.Evl();
        }
        C286625Xd ASQ = r13.ASQ();
        if (ASQ != null) {
            JGI.A01(ASQ, context2, i3, 16, z2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v69, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v70, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v73, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v74, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v104, resolved type: X.MGL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v5, resolved type: X.MGL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v105, resolved type: X.MHK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v17, resolved type: X.MHK} */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x02d8, code lost:
        if (r0 == r4) goto L_0x02da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x02da, code lost:
        r9 = new X.MHK((java.lang.Object) r2, r22, (java.lang.Object) r6, (X.AnonymousClass4D7) null, 25);
        r8.FLL(r9);
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x02eb, code lost:
        X.C51968G9o.A1E(r8, r3, r0, r6);
        r9 = X.C60340gF.A00;
        r1 = X.C51967G9n.A0m(r8, 1228020624);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x02f7, code lost:
        if (r1 != r4) goto L_0x0303;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x02f9, code lost:
        r1 = new X.MPC(r2, 44);
        r8.FLL(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0303, code lost:
        X.C51968G9o.A1F(r8, r3, r1, r9, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x031e, code lost:
        if (r0 == r4) goto L_0x0320;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0320, code lost:
        r40 = new X.MGL(r23, r6, r43, (X.AnonymousClass4D7) null, 1);
        r8.FLL(r40);
        r40 = r40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0332, code lost:
        X.C51968G9o.A1E(r8, r3, r0, r6);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x033b  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x02c9  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x030f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C286575Wy r39, com.instagram.music.common.model.AudioOverlayTrack r40, java.util.List r41, int r42, int r43, boolean r44, boolean r45) {
        /*
            r27 = r45
            r5 = r44
            r26 = r41
            r7 = 0
            r6 = r40
            X.0qQ.A0B(r6, r7)
            r0 = 1160164725(0x4526b575, float:2667.341)
            r8 = r39
            r8.ExV(r0)
            r39 = r43
            r0 = r43 & 1
            r15 = r42
            if (r0 == 0) goto L_0x039f
            r1 = r42 | 6
        L_0x001e:
            r4 = r43 & 2
            if (r4 == 0) goto L_0x0392
            r1 = r1 | 48
        L_0x0024:
            r2 = r43 & 4
            if (r2 == 0) goto L_0x0387
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x002a:
            r3 = r43 & 8
            if (r3 == 0) goto L_0x037a
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x0030:
            r1 = r1 & 1171(0x493, float:1.641E-42)
            r0 = 1170(0x492, float:1.64E-42)
            if (r1 != r0) goto L_0x005b
            boolean r0 = r8.Bwn()
            if (r0 == 0) goto L_0x005b
            r8.Evl()
        L_0x003f:
            X.5Xd r1 = r8.ASQ()
            if (r1 == 0) goto L_0x005a
            r40 = 3
        L_0x0047:
            X.J9A r0 = new X.J9A
            r35 = r0
            r36 = r6
            r37 = r26
            r38 = r15
            r41 = r5
            r42 = r27
            r35.<init>(r36, r37, r38, r39, r40, r41, r42)
            r1.A06 = r0
        L_0x005a:
            return
        L_0x005b:
            if (r4 == 0) goto L_0x005f
            X.0sn r26 = X.0sn.A00
        L_0x005f:
            boolean r5 = X.C51966G9m.A1Q(r2, r5)
            if (r3 == 0) goto L_0x0067
            r27 = 0
        L_0x0067:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0075
            r1 = 2039277437(0x798ce77d, float:9.145209E34)
            java.lang.String r0 = "com.instagram.wonderwall.ui.compose.components.MusicAttachmentPreview (WallMusicAttachment.kt:71)"
            X.0fL.A01(r1, r0)
        L_0x0075:
            com.instagram.music.common.model.MusicAssetModel r0 = r6.A08
            r25 = r0
            if (r0 != 0) goto L_0x0090
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0087
            r0 = -2037931556(0xffffffff8687a1dc, float:-5.1019187E-35)
            X.0fL.A00(r0)
        L_0x0087:
            X.5Xd r1 = r8.ASQ()
            if (r1 == 0) goto L_0x005a
            r40 = 4
            goto L_0x0047
        L_0x0090:
            android.content.Context r24 = X.C51970G9q.A0N(r8)
            com.instagram.common.session.UserSession r23 = X.C51970G9q.A0f(r8)
            X.4bM r0 = X.C286915Yh.A00
            java.lang.Object r1 = r8.AJO(r0)
            X.0iw r1 = (X.AnonymousClass0iw) r1
            X.4bM r0 = X.AnonymousClass5YV.A00
            java.lang.Object r22 = r8.AJO(r0)
            r0 = 1227925399(0x4930a797, float:723577.44)
            java.lang.Object r10 = X.C51967G9n.A0m(r8, r0)
            java.lang.Object r4 = X.AnonymousClass5XT.A00
            r21 = 0
            if (r10 != r4) goto L_0x00be
            java.lang.String r0 = r1.getModuleName()
            X.2kQ r10 = X.C227942kP.A01(r0, r7, r7)
            r8.FLL(r10)
        L_0x00be:
            X.4DU r10 = (X.AnonymousClass4DU) r10
            X.5Wx r3 = X.C51965G9l.A0H(r8, r7)
            r0 = 1227928397(0x4930b34d, float:723764.8)
            java.lang.Object r0 = X.C51967G9n.A0m(r8, r0)
            if (r0 != r4) goto L_0x00d3
            r0 = r26
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = X.G9t.A0o(r8, r0)
        L_0x00d3:
            X.5Oz r43 = X.C51965G9l.A0J(r3, r0, r7)
            r0 = 1227930538(0x4930bbaa, float:723898.6)
            java.lang.Object r2 = X.C51967G9n.A0m(r8, r0)
            if (r2 != r4) goto L_0x00ee
            X.LR8 r2 = new X.LR8
            r9 = r24
            r1 = r23
            r0 = r27
            r2.<init>(r9, r1, r10, r0)
            r8.FLL(r2)
        L_0x00ee:
            X.LR8 r2 = (X.LR8) r2
            X.C286565Wx.A0L(r3, r7)
            r0 = 1227941842(0x4930e7d2, float:724605.1)
            X.5Qk r20 = X.C51965G9l.A0K(r8, r0)
            androidx.compose.ui.Modifier r1 = X.C51966G9m.A0T(r20)
            r0 = 1065353216(0x3f800000, float:1.0)
            androidx.compose.ui.Modifier r0 = X.C54739HQw.A00(r1, r0, r7)
            r11 = 1094713344(0x41400000, float:12.0)
            androidx.compose.ui.Modifier r10 = X.C51968G9o.A0P(r0, r11)
            java.lang.Object r13 = r43.getValue()
            java.util.List r13 = (java.util.List) r13
            X.0qQ.A0B(r13, r7)
            r0 = -835184676(0xffffffffce3817dc, float:-7.7214285E8)
            boolean r0 = X.C51967G9n.A1U(r8, r0)
            if (r0 == 0) goto L_0x0124
            r1 = 1626353714(0x60f03032, float:1.3845911E20)
            java.lang.String r0 = "com.instagram.wonderwall.ui.compose.components.gradientBrush (WallMusicAttachment.kt:288)"
            X.0fL.A01(r1, r0)
        L_0x0124:
            java.lang.Object r12 = X.00k.A0O(r13, r7)
            java.lang.Number r12 = (java.lang.Number) r12
            boolean r0 = r13.isEmpty()
            r9 = 2
            r19 = 1
            if (r0 == 0) goto L_0x0343
            X.5RW[] r9 = new X.AnonymousClass5RW[r9]
            long r0 = X.C51966G9m.A0J(r8)
            X.5RW r0 = X.C51965G9l.A0N(r0)
            r9[r7] = r0
            long r0 = X.C51966G9m.A0J(r8)
        L_0x0143:
            X.5RW r0 = X.C51965G9l.A0N(r0)
            r9[r19] = r0
            java.util.List r9 = X.0sr.A1P(r9)
        L_0x014d:
            X.Gey r1 = X.C51975G9x.A0K(r9)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x015d
            r0 = 1385078027(0x528e9d0b, float:3.0626005E11)
            X.0fL.A00(r0)
        L_0x015d:
            X.C286565Wx.A0L(r3, r7)
            X.5S2 r0 = X.AnonymousClass5S0.A00
            androidx.compose.ui.Modifier r12 = X.C304766Fd.A00(r10, r1, r0)
            if (r5 == 0) goto L_0x018f
            r0 = 1232555105(0x49774c61, float:1012934.06)
            boolean r1 = X.C51967G9n.A1Z(r8, r6, r0)
            java.lang.Object r0 = r8.ECw()
            if (r1 != 0) goto L_0x0177
            if (r0 != r4) goto L_0x017d
        L_0x0177:
            r0 = 40
            X.MJ6 r0 = X.C51970G9q.A0v(r8, r2, r6, r0)
        L_0x017d:
            X.0sa r13 = X.C51965G9l.A0y(r3, r0, r7)
            r10 = r20
            r9 = r21
            r0 = r19
            androidx.compose.ui.Modifier r0 = X.C287635aW.A05(r10, r9, r9, r13, r0)
            androidx.compose.ui.Modifier r12 = r12.Ezh(r0)
        L_0x018f:
            X.C286565Wx.A0L(r3, r7)
            androidx.compose.ui.Alignment r16 = X.C287215Zl.A09
            r0 = r16
            X.5RD r10 = X.C287675aa.A00(r0, r7)
            int r9 = X.C287425a7.A00(r8)
            X.5RM r1 = X.C286565Wx.A04(r3)
            androidx.compose.ui.Modifier r0 = X.C287435a8.A01(r8, r12)
            X.0sa r13 = X.C287485aD.A00
            X.C51973G9u.A0z(r8, r3, r13)
            X.0sL r12 = X.C287485aD.A03
            X.0sL r18 = X.C51969G9p.A0w(r8, r10, r1, r12)
            X.0sL r10 = X.C287485aD.A02
            boolean r1 = r3.A0K
            if (r1 != 0) goto L_0x01bd
            boolean r1 = X.C51972G9s.A1Q(r8, r9)
            if (r1 != 0) goto L_0x01c0
        L_0x01bd:
            X.C51971G9r.A13(r8, r10, r9)
        L_0x01c0:
            X.0sL r17 = X.C51966G9m.A1K(r8, r0)
            androidx.compose.ui.Modifier r1 = X.C287195Zj.A04(r20)
            X.5RD r0 = X.C51968G9o.A0X(r8)
            int r9 = X.C287425a7.A00(r8)
            X.5RM r14 = X.C286565Wx.A04(r3)
            androidx.compose.ui.Modifier r1 = X.C287435a8.A01(r8, r1)
            X.C51973G9u.A0z(r8, r3, r13)
            X.C287595aO.A00(r8, r0, r12)
            r0 = r18
            boolean r0 = X.C51965G9l.A1Y(r8, r3, r14, r0)
            if (r0 != 0) goto L_0x01ec
            boolean r0 = X.C51972G9s.A1Q(r8, r9)
            if (r0 != 0) goto L_0x01ef
        L_0x01ec:
            X.C51971G9r.A13(r8, r10, r9)
        L_0x01ef:
            r0 = r17
            X.C287595aO.A00(r8, r1, r0)
            r1 = 1116733440(0x42900000, float:72.0)
            r0 = r20
            androidx.compose.ui.Modifier r0 = X.C287205Zk.A0C(r0, r1)
            androidx.compose.ui.Modifier r14 = X.C51968G9o.A0P(r0, r11)
            r9 = 1084227584(0x40a00000, float:5.0)
            X.5Yw r0 = X.AnonymousClass5aQ.A00(r8)
            long r0 = r0.A0y
            androidx.compose.ui.Modifier r0 = X.C51968G9o.A0Q(r14, r11, r9, r0)
            r9 = 1082130432(0x40800000, float:4.0)
            androidx.compose.ui.Modifier r0 = X.C287195Zj.A07(r0, r9)
            r1 = r16
            X.5RD r16 = X.C287675aa.A00(r1, r7)
            int r1 = X.C287425a7.A00(r8)
            X.5RM r14 = X.C286565Wx.A04(r3)
            androidx.compose.ui.Modifier r0 = X.C287435a8.A01(r8, r0)
            X.C51973G9u.A0z(r8, r3, r13)
            r13 = r16
            X.C287595aO.A00(r8, r13, r12)
            r12 = r18
            boolean r12 = X.C51965G9l.A1Y(r8, r3, r14, r12)
            if (r12 != 0) goto L_0x023a
            boolean r12 = X.C51972G9s.A1Q(r8, r1)
            if (r12 != 0) goto L_0x023d
        L_0x023a:
            X.C51971G9r.A13(r8, r10, r1)
        L_0x023d:
            r1 = r17
            X.C287595aO.A00(r8, r0, r1)
            r0 = r25
            com.instagram.common.typedurl.ImageUrl r0 = r0.A03
            X.2DN r10 = X.1zC.A00(r8, r0)
            r0 = 2131965980(0x7f13381c, float:1.9568785E38)
            java.lang.String r1 = X.C304346Dc.A00(r8, r0)
            androidx.compose.ui.Modifier r0 = X.C51966G9m.A0U(r20)
            androidx.compose.ui.Modifier r0 = X.C51968G9o.A0P(r0, r11)
            X.AnonymousClass6G3.A0B(r8, r0, r10, r1, r7)
            r0 = 944617111(0x384db697, float:4.904586E-5)
            r8.ExS(r0)
            if (r5 == 0) goto L_0x026f
            X.5Oz r0 = r2.A00
            boolean r1 = X.C51971G9r.A1W(r0)
            r0 = r24
            A00(r0, r8, r7, r1)
        L_0x026f:
            X.C286565Wx.A0L(r3, r7)
            r8.ASN()
            r0 = r20
            androidx.compose.ui.Modifier r0 = X.C287205Zk.A08(r0, r9)
            r35 = 6
            X.C289585dr.A00(r8, r0)
            r0 = r25
            java.lang.String r11 = r0.A0I
            X.0qQ.A07(r11)
            X.5Z4 r10 = X.C51966G9m.A0d(r8)
            r32 = 3
            long r0 = X.G9w.A05(r8)
            X.AnonymousClass5ZZ.A0v(r8, r10, r11, r0)
            r0 = r20
            X.G9w.A15(r8, r0, r9)
            r0 = r25
            java.lang.String r9 = r0.A0D
            X.0qQ.A07(r9)
            X.5Z4 r30 = X.C51966G9m.A0c(r8)
            X.5Yw r0 = X.AnonymousClass5aQ.A00(r8)
            long r0 = r0.A0u
            r36 = 15226(0x3b7a, float:2.1336E-41)
            r28 = r8
            r29 = r21
            r31 = r9
            r33 = r19
            r34 = r7
            r37 = r0
            X.AnonymousClass5ZZ.A0C(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r8.ASN()
            r8.ASN()
            r0 = 1228004043(0x4931dacb, float:728492.7)
            r8.ExS(r0)
            if (r5 == 0) goto L_0x0306
            r1 = 1228005515(0x4931e08b, float:728584.7)
            r0 = r22
            boolean r1 = X.C51973G9u.A1S(r8, r6, r0, r1)
            java.lang.Object r0 = r8.ECw()
            if (r1 != 0) goto L_0x02da
            if (r0 != r4) goto L_0x02eb
        L_0x02da:
            r14 = 25
            X.MHK r0 = new X.MHK
            r9 = r0
            r10 = r2
            r11 = r22
            r12 = r6
            r13 = r21
            r9.<init>((java.lang.Object) r10, (java.lang.Object) r11, (java.lang.Object) r12, (X.AnonymousClass4D7) r13, (int) r14)
            r8.FLL(r0)
        L_0x02eb:
            X.C51968G9o.A1E(r8, r3, r0, r6)
            X.0gF r9 = X.C60340gF.A00
            r0 = 1228020624(0x49321b90, float:729529.0)
            java.lang.Object r1 = X.C51967G9n.A0m(r8, r0)
            if (r1 != r4) goto L_0x0303
            r0 = 44
            X.MPC r1 = new X.MPC
            r1.<init>(r2, r0)
            r8.FLL(r1)
        L_0x0303:
            X.C51968G9o.A1F(r8, r3, r1, r9, r7)
        L_0x0306:
            X.C286565Wx.A0L(r3, r7)
            boolean r0 = r26.isEmpty()
            if (r0 == 0) goto L_0x0335
            r1 = 1228024251(0x493229bb, float:729755.7)
            r0 = r23
            boolean r1 = X.C51973G9u.A1S(r8, r0, r6, r1)
            java.lang.Object r0 = r8.ECw()
            if (r1 != 0) goto L_0x0320
            if (r0 != r4) goto L_0x0332
        L_0x0320:
            X.MGL r0 = new X.MGL
            r40 = r0
            r41 = r23
            r42 = r6
            r44 = r21
            r45 = r19
            r40.<init>(r41, r42, r43, r44, r45)
            r8.FLL(r0)
        L_0x0332:
            X.C51968G9o.A1E(r8, r3, r0, r6)
        L_0x0335:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x003f
            r0 = -181685036(0xfffffffff52bb4d4, float:-2.1766367E32)
            X.0fL.A00(r0)
            goto L_0x003f
        L_0x0343:
            int r1 = r13.size()
            r0 = r19
            if (r1 != r0) goto L_0x035f
            if (r12 == 0) goto L_0x035f
            X.5RW[] r9 = new X.AnonymousClass5RW[r9]
            int r0 = r12.intValue()
            long r0 = (long) r0
            r12 = 32
            long r0 = r0 << r12
            X.5RW r12 = X.C51965G9l.A0N(r0)
            r9[r7] = r12
            goto L_0x0143
        L_0x035f:
            java.util.ArrayList r9 = X.AnonymousClass7TG.A0r(r13)
            java.util.Iterator r12 = r13.iterator()
        L_0x0367:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x014d
            int r0 = X.AnonymousClass7TG.A0F(r12)
            long r0 = (long) r0
            X.5RW r0 = X.C51967G9n.A0I(r0)
            r9.add(r0)
            goto L_0x0367
        L_0x037a:
            r0 = r15 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x0030
            r0 = r27
            int r0 = X.G9t.A0b(r8, r0)
            r1 = r1 | r0
            goto L_0x0030
        L_0x0387:
            r0 = r15 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x002a
            int r0 = X.G9t.A0a(r8, r5)
            r1 = r1 | r0
            goto L_0x002a
        L_0x0392:
            r0 = r42 & 48
            if (r0 != 0) goto L_0x0024
            r0 = r26
            int r0 = X.G9t.A0F(r8, r0)
            r1 = r1 | r0
            goto L_0x0024
        L_0x039f:
            r0 = r42 & 6
            if (r0 != 0) goto L_0x03ab
            int r1 = X.C41848B3p.A01(r8, r6)
            r1 = r1 | r42
            goto L_0x001e
        L_0x03ab:
            r1 = r15
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56358Hx9.A01(X.5Wy, com.instagram.music.common.model.AudioOverlayTrack, java.util.List, int, int, boolean, boolean):void");
    }
}
