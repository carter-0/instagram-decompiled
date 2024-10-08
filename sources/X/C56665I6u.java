package X;

import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.Constants;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.I6u  reason: case insensitive filesystem */
public abstract class C56665I6u {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v52, resolved type: X.Ixc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v21, resolved type: X.MJD} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: X.MJD} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v3, resolved type: X.Ixc} */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x015b, code lost:
        if (r2 == r6) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x015d, code lost:
        r30 = new X.C58791Ixc(r8, r9, r40, r11, 0, r18);
        r0.FLL(r30);
        r30 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0173, code lost:
        r32 = X.C51965G9l.A0z(r7, r2);
        r26 = java.lang.Integer.valueOf(r11);
        r27 = java.lang.Integer.valueOf(com.instagram.android.R.drawable.instagram_arrow_cw_pano_outline_24);
        r2 = r4 & 14;
        r8 = ((X.C51967G9n.A1Z(r0, r12, -675060591) | X.C51975G9x.A1O(r4)) | X.C51972G9s.A1K(57344 & r4)) | X.AnonymousClass7TF.A1S(r2, 4);
        r4 = r0.ECw();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01a5, code lost:
        if (r8 != false) goto L_0x01a9;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01a7, code lost:
        if (r4 != r6) goto L_0x01ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01a9, code lost:
        r8 = new X.MJD(r39, r12, r41, r42, 0);
        r0.FLL(r8);
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01ba, code lost:
        r22 = r0;
        r24 = r3;
        X.I7P.A01((X.C287605aT) null, (X.I4S) null, (X.I23) null, r22, r23, r24, true, r26, r27, r42, r29, (java.lang.String) null, X.C51965G9l.A0y(r7, r4, false), r32, 3, Integer.MAX_VALUE, r2 | 1769472, 48, 10112, false);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C286575Wy r41, java.lang.String r42, java.lang.String r43, X.0sP r44, X.0sL r45, int r46, boolean r47, boolean r48) {
        /*
            r5 = 0
            r17 = 1
            r13 = 4
            r1 = -1286978354(0xffffffffb34a44ce, float:-4.7094368E-8)
            r0 = r41
            r0.ExV(r1)
            r1 = r46
            r2 = r46 & 6
            if (r2 != 0) goto L_0x01ee
            r2 = r42
            int r4 = X.G9t.A0O(r0, r2)
            r4 = r4 | r46
        L_0x001a:
            r2 = r46 & 48
            r40 = r44
            if (r2 != 0) goto L_0x0027
            r2 = r40
            int r2 = X.G9t.A0F(r0, r2)
            r4 = r4 | r2
        L_0x0027:
            r2 = r1 & 384(0x180, float:5.38E-43)
            r18 = r47
            if (r2 != 0) goto L_0x0034
            r2 = r18
            int r2 = X.G9t.A0a(r0, r2)
            r4 = r4 | r2
        L_0x0034:
            r2 = r1 & 3072(0xc00, float:4.305E-42)
            r15 = r48
            if (r2 != 0) goto L_0x003f
            int r2 = X.G9t.A0b(r0, r15)
            r4 = r4 | r2
        L_0x003f:
            r2 = r1 & 24576(0x6000, float:3.4438E-41)
            r39 = r45
            if (r2 != 0) goto L_0x004c
            r2 = r39
            int r2 = X.G9t.A0I(r0, r2)
            r4 = r4 | r2
        L_0x004c:
            r2 = 196608(0x30000, float:2.75506E-40)
            r2 = r2 & r46
            r41 = r43
            if (r2 != 0) goto L_0x005b
            r2 = r41
            int r2 = X.G9t.A0T(r0, r2)
            r4 = r4 | r2
        L_0x005b:
            r3 = 74899(0x12493, float:1.04956E-40)
            r3 = r3 & r4
            r2 = 74898(0x12492, float:1.04954E-40)
            if (r3 != r2) goto L_0x0088
            boolean r2 = r0.Bwn()
            if (r2 == 0) goto L_0x0088
            r0.Evl()
        L_0x006d:
            X.5Xd r2 = r0.ASQ()
            if (r2 == 0) goto L_0x0087
            X.J8g r0 = new X.J8g
            r3 = r0
            r4 = r42
            r5 = r41
            r6 = r40
            r7 = r39
            r8 = r1
            r9 = r18
            r10 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r2.A06 = r0
        L_0x0087:
            return
        L_0x0088:
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x0096
            r3 = -732242457(0xffffffffd45adde7, float:-3.7601031E12)
            java.lang.String r2 = "com.instagram.aistudio.editor.WelcomeMessageSection (AiAdvancedSettingsScreen.kt:122)"
            X.0fL.A01(r3, r2)
        L_0x0096:
            r2 = -675122835(0xffffffffd7c2716d, float:-4.27584832E14)
            java.lang.Object r8 = X.C51967G9n.A0m(r0, r2)
            java.lang.Object r6 = X.AnonymousClass5XT.A00
            r19 = 0
            if (r8 != r6) goto L_0x00b1
            boolean r2 = X.C51966G9m.A1X(r42)
            if (r2 == 0) goto L_0x01ea
            if (r47 == 0) goto L_0x01ea
            X.IPW r2 = X.IPW.A00
        L_0x00ad:
            androidx.compose.runtime.ParcelableSnapshotMutableState r8 = X.G9t.A0o(r0, r2)
        L_0x00b1:
            X.5Oz r8 = (X.C284945Oz) r8
            X.5Wx r7 = X.C51965G9l.A0H(r0, r5)
            X.4bM r12 = X.C286955Yl.A00
            java.lang.Object r10 = r0.AJO(r12)
            com.instagram.common.session.UserSession r10 = (com.instagram.common.session.UserSession) r10
            X.0Tu r9 = X.AnonymousClass7TF.A0H(r10)
            r2 = 36605550997869822(0x820c8e000914fe, double:3.2128360775511435E-306)
            int r11 = X.DbS.A04(r9, r10, r2)
            r2 = 2131961788(0x7f1327bc, float:1.9560283E38)
            java.lang.String r9 = X.C288035bG.A00(r0, r2)
            java.lang.Object r2 = r8.getValue()
            boolean r2 = r2 instanceof X.C53510Gpg
            X.5Qk r10 = androidx.compose.ui.Modifier.A00
            if (r2 == 0) goto L_0x01dd
            androidx.compose.ui.Modifier r2 = X.C51966G9m.A0T(r10)
            r3 = 0
            androidx.compose.ui.Modifier r23 = X.C287195Zj.A0B(r2, r3, r3, r3, r3)
        L_0x00e6:
            java.lang.Object r12 = r0.AJO(r12)
            r26 = 2131952670(0x7f13041e, float:1.954179E38)
            r27 = 2131952669(0x7f13041d, float:1.9541787E38)
            r29 = 28
            r2 = 256(0x100, float:3.59E-43)
            r24 = r0
            r25 = r19
            r28 = r5
            r30 = r5
            r31 = r5
            A04(r24, r25, r26, r27, r28, r29, r30, r31)
            if (r48 == 0) goto L_0x0128
            r2 = 546861660(0x2098725c, float:2.5825478E-19)
            r0.ExS(r2)
            r2 = 1098907648(0x41800000, float:16.0)
            androidx.compose.ui.Modifier r4 = X.C287195Zj.A0B(r10, r3, r3, r3, r2)
            r2 = 2131952837(0x7f1304c5, float:1.9542128E38)
            java.lang.String r3 = X.C288035bG.A00(r0, r2)
            r2 = 6
            X.C54791HSy.A00(r0, r4, r3, r2, r5)
        L_0x011a:
            boolean r2 = X.C51967G9n.A1b(r7, r5)
            if (r2 == 0) goto L_0x006d
            r2 = 922085316(0x36f5e7c4, float:7.32855E-6)
            X.0fL.A00(r2)
            goto L_0x006d
        L_0x0128:
            r3 = 547059781(0x209b7845, float:2.633761E-19)
            r0.ExS(r3)
            r3 = 2131952837(0x7f1304c5, float:1.9542128E38)
            java.lang.String r29 = X.C288035bG.A00(r0, r3)
            java.lang.Object r3 = r8.getValue()
            X.JLj r3 = (X.C59485JLj) r3
            r16 = 2131237913(0x7f081c19, float:1.809209E38)
            r10 = -675082648(0xffffffffd7c30e68, float:-4.28933284E14)
            boolean r10 = X.C51967G9n.A1V(r0, r10, r11)
            boolean r14 = X.C51965G9l.A1Z(r0, r9, r10)
            r10 = r4 & 896(0x380, float:1.256E-42)
            boolean r2 = X.AnonymousClass7TF.A1S(r10, r2)
            r14 = r14 | r2
            boolean r2 = X.C51973G9u.A1H(r4)
            r14 = r14 | r2
            java.lang.Object r2 = r0.ECw()
            if (r14 != 0) goto L_0x015d
            if (r2 != r6) goto L_0x0173
        L_0x015d:
            X.Ixc r2 = new X.Ixc
            r30 = r2
            r31 = r8
            r32 = r9
            r33 = r40
            r34 = r11
            r35 = r5
            r36 = r18
            r30.<init>(r31, r32, r33, r34, r35, r36)
            r0.FLL(r2)
        L_0x0173:
            X.0sP r32 = X.C51965G9l.A0z(r7, r2)
            r33 = 3
            java.lang.Boolean r25 = java.lang.Boolean.valueOf(r17)
            java.lang.Integer r26 = java.lang.Integer.valueOf(r11)
            java.lang.Integer r27 = java.lang.Integer.valueOf(r16)
            r2 = -675060591(0xffffffffd7c36491, float:-4.29673394E14)
            boolean r8 = X.C51967G9n.A1Z(r0, r12, r2)
            boolean r2 = X.C51975G9x.A1O(r4)
            r8 = r8 | r2
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r4
            boolean r2 = X.C51972G9s.A1K(r2)
            r8 = r8 | r2
            r2 = r4 & 14
            boolean r4 = X.AnonymousClass7TF.A1S(r2, r13)
            r8 = r8 | r4
            java.lang.Object r4 = r0.ECw()
            if (r8 != 0) goto L_0x01a9
            if (r4 != r6) goto L_0x01ba
        L_0x01a9:
            X.MJD r4 = new X.MJD
            r8 = r4
            r9 = r39
            r10 = r12
            r11 = r41
            r12 = r42
            r13 = r5
            r8.<init>(r9, r10, r11, r12, r13)
            r0.FLL(r4)
        L_0x01ba:
            X.0sa r31 = X.C51965G9l.A0y(r7, r4, r5)
            r4 = 1769472(0x1b0000, float:2.479558E-39)
            r2 = r2 | r4
            r36 = 48
            r37 = 10112(0x2780, float:1.417E-41)
            r34 = 2147483647(0x7fffffff, float:NaN)
            r20 = r19
            r21 = r19
            r28 = r42
            r30 = r19
            r35 = r2
            r38 = r5
            r22 = r0
            r24 = r3
            X.I7P.A01(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            goto L_0x011a
        L_0x01dd:
            androidx.compose.ui.Modifier r14 = X.C51966G9m.A0T(r10)
            r2 = 1098907648(0x41800000, float:16.0)
            r3 = 0
            androidx.compose.ui.Modifier r23 = X.C287195Zj.A0B(r14, r3, r3, r3, r2)
            goto L_0x00e6
        L_0x01ea:
            X.IPY r2 = X.IPY.A00
            goto L_0x00ad
        L_0x01ee:
            r4 = r1
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56665I6u.A02(X.5Wy, java.lang.String, java.lang.String, X.0sP, X.0sL, int, boolean, boolean):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v25, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v26, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v31, resolved type: X.IxL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v32, resolved type: X.MJA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v3, resolved type: X.MJA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v2, resolved type: X.IxL} */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x019f, code lost:
        if (r5 == r6) goto L_0x01a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01a1, code lost:
        r36 = new X.C58774IxL(r12, r15, r48, r18, r7, r24);
        r0.FLL(r36);
        r36 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01b7, code lost:
        r38 = X.C51965G9l.A0z(r4, r5);
        r32 = java.lang.Integer.valueOf(r18);
        r33 = java.lang.Integer.valueOf(com.instagram.android.R.drawable.instagram_arrow_cw_pano_outline_24);
        r11 = X.C51968G9o.A1U(r0, r8, X.C51966G9m.A1U(r0, r9, X.C51967G9n.A1V(r0, 1072072931, r7)) | X.AnonymousClass7TF.A1S(r1 & 29360128, com.facebook.common.dextricks.DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE), X.C51973G9u.A1M(r1, 3670016));
        r5 = r0.ECw();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01ee, code lost:
        if (r11 != false) goto L_0x01f2;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01f0, code lost:
        if (r5 != r6) goto L_0x0204;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01f2, code lost:
        r41 = new X.MJA(r9, r49, r8, r45, r7);
        r0.FLL(r41);
        r41 = r41;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0204, code lost:
        r28 = r0;
        X.I7P.A01((X.C287605aT) null, (X.I4S) null, (X.I23) null, r28, r29, r10, true, r32, r33, r8, r35, (java.lang.String) null, X.C51965G9l.A0y(r4, r5, false), r38, 1, Integer.MAX_VALUE, 1769472, 48, 10112, false);
        X.C286565Wx.A0L(r4, false);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.C286575Wy r43, java.lang.String r44, X.0sL r45, X.0sL r46, X.AnonymousClass62P r47, int r48, boolean r49, boolean r50, boolean r51, boolean r52) {
        /*
            r3 = 0
            r20 = 1
            r19 = 6
            r1 = -1844181533(0xffffffff921405e3, float:-4.670782E-28)
            r0 = r43
            r0.ExV(r1)
            r2 = r48
            r1 = r48 & 6
            if (r1 != 0) goto L_0x0263
            r1 = r47
            int r1 = X.G9t.A0O(r0, r1)
            r1 = r1 | r48
        L_0x001b:
            r4 = r48 & 48
            r48 = r45
            if (r4 != 0) goto L_0x0028
            r4 = r48
            int r4 = X.G9t.A0F(r0, r4)
            r1 = r1 | r4
        L_0x0028:
            r4 = r2 & 384(0x180, float:5.38E-43)
            r24 = r49
            if (r4 != 0) goto L_0x0035
            r4 = r24
            int r4 = X.G9t.A0a(r0, r4)
            r1 = r1 | r4
        L_0x0035:
            r4 = r2 & 3072(0xc00, float:4.305E-42)
            r23 = r50
            if (r4 != 0) goto L_0x0042
            r4 = r23
            int r4 = X.G9t.A0b(r0, r4)
            r1 = r1 | r4
        L_0x0042:
            r4 = r2 & 24576(0x6000, float:3.4438E-41)
            r22 = r51
            if (r4 != 0) goto L_0x004f
            r4 = r22
            int r4 = X.G9t.A0c(r0, r4)
            r1 = r1 | r4
        L_0x004f:
            r4 = 196608(0x30000, float:2.75506E-40)
            r4 = r4 & r2
            r21 = r52
            if (r4 != 0) goto L_0x005d
            r4 = r21
            int r4 = X.G9t.A0d(r0, r4)
            r1 = r1 | r4
        L_0x005d:
            r4 = 1572864(0x180000, float:2.204052E-39)
            r4 = r4 & r2
            r45 = r46
            if (r4 != 0) goto L_0x006b
            r4 = r45
            int r4 = X.G9t.A0K(r0, r4)
            r1 = r1 | r4
        L_0x006b:
            r4 = 12582912(0xc00000, float:1.7632415E-38)
            r4 = r4 & r2
            r49 = r44
            if (r4 != 0) goto L_0x0079
            r4 = r49
            int r4 = X.G9t.A0V(r0, r4)
            r1 = r1 | r4
        L_0x0079:
            r5 = 4793491(0x492493, float:6.717112E-39)
            r5 = r5 & r1
            r4 = 4793490(0x492492, float:6.71711E-39)
            if (r5 != r4) goto L_0x00ab
            boolean r4 = r0.Bwn()
            if (r4 == 0) goto L_0x00ab
            r0.Evl()
        L_0x008b:
            X.5Xd r1 = r0.ASQ()
            if (r1 == 0) goto L_0x00aa
            X.JAI r0 = new X.JAI
            r3 = r0
            r4 = r49
            r5 = r48
            r6 = r45
            r7 = r47
            r8 = r2
            r9 = r24
            r10 = r23
            r11 = r22
            r12 = r21
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1.A06 = r0
        L_0x00aa:
            return
        L_0x00ab:
            boolean r4 = X.0fL.A02()
            if (r4 == 0) goto L_0x00b9
            r5 = -1080074315(0xffffffffbf9f5fb5, float:-1.2451082)
            java.lang.String r4 = "com.instagram.aistudio.editor.IceBreakersSection (AiAdvancedSettingsScreen.kt:186)"
            X.0fL.A01(r5, r4)
        L_0x00b9:
            X.6HD r13 = new X.6HD
            r13.<init>()
            java.util.Iterator r5 = r47.iterator()
        L_0x00c2:
            boolean r4 = r5.hasNext()
            if (r4 == 0) goto L_0x00dd
            java.lang.String r4 = X.AnonymousClass7TE.A18(r5)
            boolean r4 = X.C51966G9m.A1X(r4)
            if (r4 == 0) goto L_0x00da
            if (r24 == 0) goto L_0x00da
            X.IPW r4 = X.IPW.A00
        L_0x00d6:
            r13.add(r4)
            goto L_0x00c2
        L_0x00da:
            X.IPY r4 = X.IPY.A00
            goto L_0x00d6
        L_0x00dd:
            X.4bM r8 = X.C286955Yl.A00
            java.lang.Object r7 = r0.AJO(r8)
            com.instagram.common.session.UserSession r7 = (com.instagram.common.session.UserSession) r7
            X.0Tu r6 = X.AnonymousClass7TF.A0H(r7)
            r4 = 36605550998131970(0x820c8e000d1502, double:3.212836077716927E-306)
            int r18 = X.DbS.A04(r6, r7, r4)
            r4 = 2131961788(0x7f1327bc, float:1.9560283E38)
            java.lang.String r15 = X.C288035bG.A00(r0, r4)
            java.lang.Object r9 = r0.AJO(r8)
            com.instagram.common.session.UserSession r9 = (com.instagram.common.session.UserSession) r9
            r28 = 2131952663(0x7f130417, float:1.9541775E38)
            r29 = 2131952718(0x7f13044e, float:1.9541887E38)
            r25 = 0
            r31 = 28
            r26 = r0
            r27 = r25
            r30 = r3
            r32 = r3
            r33 = r3
            A04(r26, r27, r28, r29, r30, r31, r32, r33)
            java.util.Iterator r17 = r47.iterator()
            r7 = 0
        L_0x011b:
            boolean r4 = r17.hasNext()
            if (r4 == 0) goto L_0x0255
            java.lang.Object r8 = r17.next()
            int r16 = r7 + 1
            if (r7 >= 0) goto L_0x0131
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0131:
            java.lang.String r8 = (java.lang.String) r8
            r4 = 1072019712(0x3fe5b900, float:1.7947083)
            r0.ExS(r4)
            java.lang.Object r12 = r0.ECw()
            java.lang.Object r6 = X.AnonymousClass5XT.A00
            if (r12 != r6) goto L_0x0149
            java.lang.Object r4 = r13.get(r7)
            androidx.compose.runtime.ParcelableSnapshotMutableState r12 = X.G9t.A0o(r0, r4)
        L_0x0149:
            X.5Oz r12 = (X.C284945Oz) r12
            X.5Wx r4 = X.C51965G9l.A0H(r0, r3)
            java.lang.Object r5 = r12.getValue()
            boolean r5 = r5 instanceof X.C53510Gpg
            androidx.compose.ui.Modifier r11 = X.C51969G9p.A0U()
            if (r5 == 0) goto L_0x0251
            r14 = 0
        L_0x015c:
            r5 = 1090519040(0x41000000, float:8.0)
            r10 = 0
            androidx.compose.ui.Modifier r29 = X.C287195Zj.A0B(r11, r10, r5, r10, r14)
            if (r7 != 0) goto L_0x0226
            if (r50 != 0) goto L_0x0233
        L_0x0167:
            r5 = -1126435405(0xffffffffbcdbf5b3, float:-0.026850557)
            r0.ExS(r5)
            r5 = 2131952755(0x7f130473, float:1.9541962E38)
            java.lang.String r35 = X.C288035bG.A00(r0, r5)
            java.lang.Object r10 = r12.getValue()
            X.JLj r10 = (X.C59485JLj) r10
            r14 = 2131237913(0x7f081c19, float:1.809209E38)
            r11 = 1072049103(0x3fe62bcf, float:1.7982119)
            r5 = r18
            boolean r5 = X.C51967G9n.A1V(r0, r11, r5)
            boolean r11 = X.C51965G9l.A1Z(r0, r15, r5)
            boolean r5 = X.C51973G9u.A1I(r1)
            r11 = r11 | r5
            boolean r5 = X.C51973G9u.A1H(r1)
            r11 = r11 | r5
            boolean r5 = r0.AGs(r7)
            r11 = r11 | r5
            java.lang.Object r5 = r0.ECw()
            if (r11 != 0) goto L_0x01a1
            if (r5 != r6) goto L_0x01b7
        L_0x01a1:
            X.IxL r5 = new X.IxL
            r36 = r5
            r37 = r12
            r38 = r15
            r39 = r48
            r40 = r18
            r41 = r7
            r42 = r24
            r36.<init>(r37, r38, r39, r40, r41, r42)
            r0.FLL(r5)
        L_0x01b7:
            X.0sP r38 = X.C51965G9l.A0z(r4, r5)
            r40 = 2147483647(0x7fffffff, float:NaN)
            java.lang.Boolean r31 = java.lang.Boolean.valueOf(r20)
            java.lang.Integer r32 = java.lang.Integer.valueOf(r18)
            java.lang.Integer r33 = java.lang.Integer.valueOf(r14)
            r5 = 1072072931(0x3fe688e3, float:1.8010525)
            boolean r5 = X.C51967G9n.A1V(r0, r5, r7)
            boolean r5 = X.C51966G9m.A1U(r0, r9, r5)
            r11 = 29360128(0x1c00000, float:7.052966E-38)
            r12 = r1 & r11
            r11 = 8388608(0x800000, float:1.17549435E-38)
            boolean r11 = X.AnonymousClass7TF.A1S(r12, r11)
            r5 = r5 | r11
            r11 = 3670016(0x380000, float:5.142788E-39)
            boolean r11 = X.C51973G9u.A1M(r1, r11)
            boolean r11 = X.C51968G9o.A1U(r0, r8, r5, r11)
            java.lang.Object r5 = r0.ECw()
            if (r11 != 0) goto L_0x01f2
            if (r5 != r6) goto L_0x0204
        L_0x01f2:
            X.MJA r5 = new X.MJA
            r41 = r5
            r42 = r9
            r43 = r49
            r44 = r8
            r46 = r7
            r41.<init>(r42, r43, r44, r45, r46)
            r0.FLL(r5)
        L_0x0204:
            X.0sa r37 = X.C51965G9l.A0y(r4, r5, r3)
            r41 = 1769472(0x1b0000, float:2.479558E-39)
            r42 = 48
            r43 = 10112(0x2780, float:1.417E-41)
            r26 = r25
            r30 = r10
            r34 = r8
            r36 = r25
            r39 = r20
            r44 = r3
            r28 = r0
            X.I7P.A01(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)
            X.C286565Wx.A0L(r4, r3)
        L_0x0222:
            r7 = r16
            goto L_0x011b
        L_0x0226:
            r5 = r20
            if (r7 != r5) goto L_0x022e
            if (r51 != 0) goto L_0x0233
            goto L_0x0167
        L_0x022e:
            r5 = 2
            if (r7 != r5) goto L_0x0167
            if (r52 == 0) goto L_0x0167
        L_0x0233:
            r5 = -1126687249(0xffffffffbcd81def, float:-0.026381461)
            r0.ExS(r5)
            r6 = 1090519040(0x41000000, float:8.0)
            r5 = 1098907648(0x41800000, float:16.0)
            androidx.compose.ui.Modifier r7 = X.C287195Zj.A0B(r11, r10, r6, r10, r5)
            r5 = 2131952755(0x7f130473, float:1.9541962E38)
            java.lang.String r6 = X.C288035bG.A00(r0, r5)
            r5 = r19
            X.C54791HSy.A00(r0, r7, r6, r5, r3)
            X.C286565Wx.A0L(r4, r3)
            goto L_0x0222
        L_0x0251:
            r14 = 1098907648(0x41800000, float:16.0)
            goto L_0x015c
        L_0x0255:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x008b
            r1 = 727594755(0x2b5e3703, float:7.894659E-13)
            X.0fL.A00(r1)
            goto L_0x008b
        L_0x0263:
            r1 = r2
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56665I6u.A03(X.5Wy, java.lang.String, X.0sL, X.0sL, X.62P, int, boolean, boolean, boolean, boolean):void");
    }

    public static final void A05(C286575Wy r16, C62320sa r17, 0sL r18, AnonymousClass62P r19, int i, boolean z) {
        int i2;
        C62320sa r9 = r17;
        AnonymousClass62P r7 = r19;
        AnonymousClass7TF.A1B(r7, 0, r9);
        0sL r8 = r18;
        0qQ.A0B(r8, 3);
        C286575Wy r11 = r16;
        r11.ExV(-1773816214);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r11, r7) | i;
        } else {
            i2 = i3;
        }
        boolean z2 = z;
        if ((i & 48) == 0) {
            i2 |= G9t.A0Z(r11, z2);
        }
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r11, r9);
        }
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A0H(r11, r8);
        }
        if ((i2 & 1171) != 1170 || !r11.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-758398830, "com.instagram.aistudio.editor.ExampleDialogueSection (AiAdvancedSettingsScreen.kt:286)");
            }
            int i4 = i2 << 6;
            A04(r11, r9, 2131952753, 2131952752, (i4 & 7168) | 384 | (i4 & 57344), 0, true, z);
            int i5 = 0;
            for (Object next : r7) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    0sr.A1T();
                    throw AnonymousClass00P.createAndThrow();
                }
                N49 n49 = (N49) next;
                C285245Qk r3 = Modifier.A00;
                boolean A1T = C51968G9o.A1T(r11, n49, C51974G9v.A1a(r11, 10559053, i2), r11.AGs(i5));
                Object ECw = r11.ECw();
                if (A1T || ECw == AnonymousClass5XT.A00) {
                    ECw = GL8.A00(r11, r8, n49, i5, 3);
                }
                C51965G9l.A1X(r11, false);
                C52636GaA.A0J(r11, C287635aW.A05(r3, (C287625aV) null, (String) null, (C62320sa) ECw, true), C57124IPn.A00, n49.A00, n49.A01);
                i5 = i6;
            }
            if (0fL.A02()) {
                0fL.A00(-954454925);
            }
        } else {
            r11.Evl();
        }
        C286625Xd ASQ = r11.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J8U(r7, r9, r8, i3, 0, z2);
        }
    }

    public static final void A06(C286575Wy r33, C62320sa r34, 0sL r35, AnonymousClass62P r36, int i, boolean z) {
        int i2;
        C62320sa r9 = r34;
        0sL r4 = r35;
        AnonymousClass62P r3 = r36;
        DbZ.A0t(0, r3, r9, r4);
        C286575Wy r6 = r33;
        r6.ExV(-191825685);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r6, r3) | i;
        } else {
            i2 = i3;
        }
        boolean z2 = z;
        if ((i & 48) == 0) {
            i2 |= G9t.A0Z(r6, z2);
        }
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r6, r9);
        }
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A0H(r6, r4);
        }
        if ((i2 & 1171) != 1170 || !r6.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-860436226, "com.instagram.aistudio.editor.InstructionsSection (AiAdvancedSettingsScreen.kt:262)");
            }
            int i4 = i2 << 6;
            A04(r6, r9, 2131952664, 2131952665, (i4 & 7168) | 384 | (i4 & 57344), 0, true, z2);
            int i5 = 0;
            for (Object next : r3) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    0sr.A1T();
                    throw AnonymousClass00P.createAndThrow();
                }
                String str = (String) next;
                C285245Qk r13 = Modifier.A00;
                boolean A1U = C51968G9o.A1U(r6, str, C51973G9u.A1Q(r6, 1185292910, i2), r6.AGs(i5));
                Object ECw = r6.ECw();
                if (A1U || ECw == AnonymousClass5XT.A00) {
                    ECw = new TTQ(r4, str, i5, 0);
                    r6.FLL(ECw);
                }
                C51965G9l.A1X(r6, false);
                C52636GaA.A00(r6, C287635aW.A05(r13, (C287625aV) null, (String) null, (C62320sa) ECw, true), (Modifier) null, (AnonymousClass5RW) null, (AnonymousClass2DO) null, (C286025Tq) null, (C54611HKu) null, C57124IPn.A00, str, (String) null, (String) null, (Map) null, (C62320sa) null, 1, 1, 2, 0, 3504, 116476, 0, false);
                i5 = i6;
            }
            if (0fL.A02()) {
                0fL.A00(216109884);
            }
        } else {
            r6.Evl();
        }
        C286625Xd ASQ = r6.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J8U(r3, r9, r4, i3, 1, z2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0101  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A07(X.C286575Wy r22, X.0sL r23, X.AnonymousClass62P r24, int r25) {
        /*
            r9 = 0
            r5 = r23
            r4 = r24
            boolean r8 = X.AnonymousClass7TF.A1U(r9, r4, r5)
            r0 = 1845878354(0x6e05de52, float:1.0357569E28)
            r7 = r22
            r7.ExV(r0)
            r3 = r25
            r0 = r25 & 6
            if (r0 != 0) goto L_0x0136
            int r17 = X.C41848B3p.A01(r7, r4)
            r17 = r17 | r25
        L_0x001d:
            r0 = r25 & 48
            r6 = 32
            if (r0 != 0) goto L_0x0029
            int r0 = X.G9t.A0F(r7, r5)
            r17 = r17 | r0
        L_0x0029:
            r1 = r17 & 19
            r0 = 18
            if (r1 != r0) goto L_0x0043
            boolean r0 = r7.Bwn()
            if (r0 == 0) goto L_0x0043
            r7.Evl()
        L_0x0038:
            X.5Xd r1 = r7.ASQ()
            if (r1 == 0) goto L_0x0042
            r0 = 7
            X.JGL.A01(r1, r5, r4, r3, r0)
        L_0x0042:
            return
        L_0x0043:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0051
            r1 = -1705393421(0xffffffff9a59c2f3, float:-4.5032027E-23)
            java.lang.String r0 = "com.instagram.aistudio.editor.CapabilitiesSection (AiAdvancedSettingsScreen.kt:309)"
            X.0fL.A01(r1, r0)
        L_0x0051:
            r20 = 2131952667(0x7f13041b, float:1.9541783E38)
            r21 = 2131952666(0x7f13041a, float:1.9541781E38)
            r19 = 0
            r23 = 28
            r22 = r9
            r24 = r9
            r25 = r9
            r18 = r7
            A04(r18, r19, r20, r21, r22, r23, r24, r25)
            X.5Qk r2 = androidx.compose.ui.Modifier.A00
            X.5RD r1 = X.C51969G9p.A0Z(r7, r9)
            int r10 = X.C287425a7.A00(r7)
            r12 = r7
            X.5Wx r12 = (X.C286565Wx) r12
            X.5RM r0 = X.C286565Wx.A04(r12)
            androidx.compose.ui.Modifier r2 = X.C287435a8.A01(r7, r2)
            X.C51973G9u.A0y(r7, r12)
            X.C51971G9r.A12(r7, r1, r0)
            X.0sL r1 = X.C287485aD.A02
            boolean r0 = r12.A0K
            if (r0 != 0) goto L_0x008d
            boolean r0 = X.C51972G9s.A1Q(r7, r10)
            if (r0 != 0) goto L_0x0090
        L_0x008d:
            X.C51971G9r.A13(r7, r1, r10)
        L_0x0090:
            X.C51965G9l.A18(r7, r2)
            r0 = 1486757333(0x589e1dd5, float:1.39080772E15)
            java.util.Iterator r16 = X.C51968G9o.A17(r7, r4, r0)
        L_0x009a:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0128
            java.lang.Object r11 = r16.next()
            X.GSY r11 = (X.GSY) r11
            java.lang.String r10 = r11.A03
            r14 = 1
            r13 = 0
            if (r10 == 0) goto L_0x00b2
            int r0 = r10.length()
            if (r0 > 0) goto L_0x00b3
        L_0x00b2:
            r10 = r13
        L_0x00b3:
            r0 = 1486760086(0x589e2896, float:1.39117722E15)
            r7.ExS(r0)
            if (r10 == 0) goto L_0x011d
            java.lang.Object r1 = r11.A00
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r0 = -2091785763(0xffffffff8351e1dd, float:-6.167886E-37)
            r7.ExS(r0)
            if (r1 == 0) goto L_0x011a
            boolean r2 = r1.booleanValue()
            java.lang.Object r0 = r11.A01
            X.Kie r0 = (X.C62607Kie) r0
            if (r0 == 0) goto L_0x0126
            int r1 = r0.ordinal()
            if (r1 == r8) goto L_0x0122
            r0 = 7
            if (r1 != r0) goto L_0x0126
            r0 = 2131238766(0x7f081f6e, float:1.809382E38)
        L_0x00dd:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L_0x00e1:
            r0 = 1804900983(0x6b949a77, float:3.5930092E26)
            r7.ExS(r0)
            if (r1 == 0) goto L_0x00f1
            int r0 = r1.intValue()
            X.2DO r13 = X.C287975bA.A00(r7, r0, r9)
        L_0x00f1:
            X.C286565Wx.A0L(r12, r9)
            java.lang.String r1 = r11.A02
            r0 = -549706301(0xffffffffdf3c25c3, float:-1.3557457E19)
            boolean r15 = X.C51967G9n.A1Z(r7, r11, r0)
            r0 = r17 & 112(0x70, float:1.57E-43)
            if (r0 == r6) goto L_0x0102
            r14 = 0
        L_0x0102:
            r15 = r15 | r14
            java.lang.Object r14 = r7.ECw()
            if (r15 != 0) goto L_0x010d
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r14 != r0) goto L_0x0113
        L_0x010d:
            r0 = 9
            X.J6l r14 = X.C59103J6l.A00(r7, r11, r5, r0)
        L_0x0113:
            X.IPo r0 = X.C57125IPo.A00(r12, r14, r2)
            X.C52636GaA.A0O(r7, r13, r0, r10, r1)
        L_0x011a:
            X.C286565Wx.A0L(r12, r9)
        L_0x011d:
            X.C286565Wx.A0L(r12, r9)
            goto L_0x009a
        L_0x0122:
            r0 = 2131238628(0x7f081ee4, float:1.809354E38)
            goto L_0x00dd
        L_0x0126:
            r1 = 0
            goto L_0x00e1
        L_0x0128:
            boolean r0 = X.C51971G9r.A1S(r7, r12, r9)
            if (r0 == 0) goto L_0x0038
            r0 = 1982762765(0x762e8f0d, float:8.851182E32)
            X.0fL.A00(r0)
            goto L_0x0038
        L_0x0136:
            r17 = r3
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56665I6u.A07(X.5Wy, X.0sL, X.62P, int):void");
    }

    public static final void A04(C286575Wy r17, C62320sa r18, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        int i5;
        C62320sa r4 = r18;
        boolean z3 = z2;
        boolean z4 = z;
        C286575Wy r9 = r17;
        r9.ExV(1039540189);
        int i6 = i4;
        int i7 = i4 & 1;
        int i8 = i;
        int i9 = i3;
        if (i7 != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = G9t.A05(r9, i8) | i3;
        } else {
            i5 = i9;
        }
        int i10 = i2;
        if ((i6 & 2) != 0) {
            i5 |= 48;
        } else if ((i9 & 48) == 0) {
            i5 |= G9t.A06(r9, i10);
        }
        int i11 = i6 & 4;
        if (i11 != 0) {
            i5 |= 384;
        } else if ((i9 & 384) == 0) {
            i5 |= G9t.A0a(r9, z4);
        }
        int i12 = i6 & 8;
        if (i12 != 0) {
            i5 |= 3072;
        } else if ((i9 & 3072) == 0) {
            i5 |= G9t.A0b(r9, z3);
        }
        int i13 = i6 & 16;
        if (i13 != 0) {
            i5 |= 24576;
        } else if ((i9 & 24576) == 0) {
            i5 |= G9t.A0I(r9, r4);
        }
        if ((i5 & 9363) != 9362 || !r9.Bwn()) {
            z4 = C51966G9m.A1Q(i11, z4);
            z3 = C51966G9m.A1Q(i12, z3);
            if (i13 != 0) {
                r4 = C58266Ip9.A00;
            }
            if (0fL.A02()) {
                0fL.A01(-943078116, "com.instagram.aistudio.editor.SectionHeader (AiAdvancedSettingsScreen.kt:349)");
            }
            C285245Qk r172 = Modifier.A00;
            Modifier A0T = C51966G9m.A0T(r172);
            Modifier A0B = C287195Zj.A0B(JJP.A00(A0T, C287655aY.A00, 0), 16.0f, 14.0f, 16.0f, 14.0f);
            AnonymousClass5RD A0Z = C51969G9p.A0Z(r9, 0);
            int A00 = C287425a7.A00(r9);
            C286565Wx r3 = (C286565Wx) r9;
            AnonymousClass5RM A04 = C286565Wx.A04(r3);
            Modifier A01 = C287435a8.A01(r9, A0B);
            C62320sa r14 = C287485aD.A00;
            C51973G9u.A0z(r9, r3, r14);
            0sL r13 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r9, A0Z, A04, r13);
            0sL r12 = C287485aD.A02;
            if (r3.A0K || !C51972G9s.A1Q(r9, A00)) {
                C51971G9r.A13(r9, r12, A00);
            }
            0sL A1K = C51966G9m.A1K(r9, A01);
            AnonymousClass5RD A0K = G9w.A0K(C287275Zs.A04, r9);
            int A002 = C287425a7.A00(r9);
            AnonymousClass5RM A042 = C286565Wx.A04(r3);
            Modifier A012 = C287435a8.A01(r9, A0T);
            C51973G9u.A0z(r9, r3, r14);
            C287595aO.A00(r9, A0K, r13);
            if (C51965G9l.A1Y(r9, r3, A042, A0w) || !C51972G9s.A1Q(r9, A002)) {
                C51971G9r.A13(r9, r12, A002);
            }
            C287595aO.A00(r9, A012, A1K);
            AnonymousClass5ZZ.A0r(r9, C51965G9l.A0S(r9), C288035bG.A00(r9, i8), C51966G9m.A0H(r9));
            r9.ExS(-1882789897);
            if (z4) {
                boolean z5 = false;
                String A003 = C288035bG.A00(r9, 2131952258);
                long A0D = C51966G9m.A0D(r9);
                AnonymousClass5Z4 A0S = C51965G9l.A0S(r9);
                Modifier A004 = HRF.A00(r172, C51970G9q.A00(z3 ? 1 : 0));
                boolean A1a = C51974G9v.A1a(r9, -1882780672, i5);
                if ((57344 & i5) == 16384) {
                    z5 = true;
                }
                boolean z6 = z5 | A1a;
                Object ECw = r9.ECw();
                if (z6 || ECw == AnonymousClass5XT.A00) {
                    ECw = GA1.A00(r9, r4, 7, z3);
                }
                AnonymousClass5ZZ.A0Q(r9, C51969G9p.A0V(r3, A004, ECw), A0S, A003, A0D);
            }
            C286565Wx.A0L(r3, false);
            r9.ASN();
            C51975G9x.A16(r9, C288035bG.A00(r9, i10));
            if (C51967G9n.A1R(r9)) {
                0fL.A00(1148398734);
            }
        } else {
            r9.Evl();
        }
        C286625Xd ASQ = r9.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59149J8f(r4, i8, i10, i9, i6, z4, z3);
        }
    }

    public static final void A00(C286575Wy r5, int i) {
        r5.ExV(-798663606);
        if (i != 0 || !r5.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1708433150, "com.instagram.aistudio.editor.BackgroundSection (AiAdvancedSettingsScreen.kt:336)");
            }
            Modifier A0X = C51966G9m.A0X(C287205Zk.A08(C51969G9p.A0U(), 6.0f), C51966G9m.A0C(r5));
            AnonymousClass5RD A0Z = C51969G9p.A0Z(r5, 0);
            int A00 = C287425a7.A00(r5);
            C286565Wx r3 = (C286565Wx) r5;
            AnonymousClass5RM A04 = C286565Wx.A04(r3);
            Modifier A01 = C287435a8.A01(r5, A0X);
            C51973G9u.A0y(r5, r3);
            C51971G9r.A12(r5, A0Z, A04);
            0sL r1 = C287485aD.A02;
            if (r3.A0K || !C51972G9s.A1Q(r5, A00)) {
                C51971G9r.A13(r5, r1, A00);
            }
            C51965G9l.A18(r5, A01);
            if (C51967G9n.A1R(r5)) {
                0fL.A00(-1309587498);
            }
        } else {
            r5.Evl();
        }
        C286625Xd ASQ = r5.ASQ();
        if (ASQ != null) {
            JG9.A01(ASQ, i, 1);
        }
    }

    public static final void A01(C286575Wy r42, String str, String str2, C62320sa r45, C62320sa r46, 0sP r47, 0sL r48, 0sL r49, 0sL r50, 0sL r51, 0sL r52, AnonymousClass62P r53, AnonymousClass62P r54, AnonymousClass62P r55, AnonymousClass62P r56, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        int i3;
        int i4;
        AnonymousClass62P r34 = r53;
        0sP r39 = r47;
        int A02 = DbW.A02(1, r39, r34);
        AnonymousClass62P r15 = r54;
        0sL r37 = r49;
        0sL r38 = r48;
        C62320sa r41 = r45;
        0sL r2 = r38;
        C51974G9v.A0d(3, r2, r15, r41, r37);
        0sL r36 = r50;
        C62320sa r40 = r46;
        AnonymousClass62P r7 = r56;
        AnonymousClass62P r13 = r55;
        C51974G9v.A1Q(r13, r40, r36, r7);
        0sL r35 = r52;
        0sL r8 = r51;
        C51969G9p.A1R(r8, 11, r35);
        C286575Wy r6 = r42;
        r6.ExV(-1724542229);
        int i5 = i;
        if ((i & 6) == 0) {
            i3 = G9t.A0O(r6, str) | i;
        } else {
            i3 = i5;
        }
        int i6 = 32;
        if ((i & 48) == 0) {
            i3 |= G9t.A0F(r6, r39);
        }
        int i7 = 256;
        if ((i5 & 384) == 0) {
            i3 |= G9t.A0Q(r6, r34);
        }
        int i8 = i5 & 3072;
        int i9 = C249703kE.FLAG_MOVED;
        if (i8 == 0) {
            i3 |= G9t.A0H(r6, r2);
        }
        int i10 = 8192;
        if ((i5 & 24576) == 0) {
            i3 |= G9t.A0S(r6, r15);
        }
        if ((i & 196608) == 0) {
            i3 |= G9t.A0J(r6, r41);
        }
        if ((i & 1572864) == 0) {
            i3 |= G9t.A0K(r6, r37);
        }
        if ((i & 12582912) == 0) {
            i3 |= G9t.A0L(r6, r13);
        }
        if ((i & 100663296) == 0) {
            i3 |= G9t.A0M(r6, r40);
        }
        if ((i & 805306368) == 0) {
            i3 |= G9t.A0N(r6, r36);
        }
        int i11 = i2;
        if ((i2 & 6) == 0) {
            i4 = i2 | C51971G9r.A08(r6, r7);
        } else {
            i4 = i11;
        }
        if ((i2 & 48) == 0) {
            if (!r6.AGw(r8)) {
                i6 = 16;
            }
            i4 |= i6;
        }
        boolean z5 = z;
        if ((i11 & 384) == 0) {
            if (!r6.AGv(z5)) {
                i7 = 128;
            }
            i4 |= i7;
        }
        boolean z6 = z2;
        if ((i11 & 3072) == 0) {
            if (!r6.AGv(z6)) {
                i9 = 1024;
            }
            i4 |= i9;
        }
        boolean z7 = z3;
        if ((i11 & 24576) == 0) {
            if (r6.AGv(z7)) {
                i10 = Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
            }
            i4 |= i10;
        }
        boolean z8 = z4;
        if ((i2 & 196608) == 0) {
            i4 |= G9t.A0d(r6, z8);
        }
        if ((i2 & 1572864) == 0) {
            i4 |= G9t.A0K(r6, r35);
        }
        String str3 = str2;
        if ((i2 & 12582912) == 0) {
            i4 |= G9t.A0V(r6, str3);
        }
        if ((i3 & 306783379) == 306783378 && (4793491 & i4) == 4793490 && r6.Bwn()) {
            r6.Evl();
        } else {
            if (0fL.A02()) {
                0fL.A01(771356128, "com.instagram.aistudio.editor.AiAdvancedSettingsScreen (AiAdvancedSettingsScreen.kt:65)");
            }
            UserSession A0h = C51968G9o.A0h(r6);
            Object AJO = r6.AJO(AnonymousClass5YA.A0A);
            int size = r15.size();
            0Tu A0J = DbS.A0J(A0h, 0);
            boolean A1T = AnonymousClass7TF.A1T(size, DbS.A04(A0J, A0h, 36605550999115016L));
            int size2 = r13.size();
            0qQ.A0B(A0h, 0);
            boolean A1T2 = AnonymousClass7TF.A1T(size2, DbS.A04(A0J, A0h, 36605550999049479L));
            Object A0m = C51967G9n.A0m(r6, 1686176247);
            Object obj = AnonymousClass5XT.A00;
            if (A0m == obj) {
                A0m = C51967G9n.A0e(r6, LST.A03(A0h));
            }
            boolean A1a = AnonymousClass7TE.A1a(A0m);
            C286565Wx A0H = C51965G9l.A0H(r6, false);
            Modifier A00 = JJP.A00(I28.A02(r6, C51969G9p.A0U()), C287655aY.A00, 0);
            boolean A1Y = C51967G9n.A1Y(r6, AJO, 1686184113);
            Object ECw = r6.ECw();
            if (A1Y || ECw == obj) {
                ECw = new C66301MMk(AJO, A02);
                r6.FLL(ECw);
            }
            Modifier A0V = C51969G9p.A0V(A0H, A00, ECw);
            AnonymousClass5RD A0Z = C51969G9p.A0Z(r6, 0);
            int A002 = C287425a7.A00(r6);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A01 = C287435a8.A01(r6, A0V);
            C51973G9u.A0y(r6, A0H);
            C51971G9r.A12(r6, A0Z, A04);
            0sL r1 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r6, A002)) {
                C51971G9r.A13(r6, r1, A002);
            }
            C51965G9l.A18(r6, A01);
            int i12 = i4 >> 6;
            C286575Wy r18 = r6;
            String str4 = str;
            String str5 = str3;
            0sP r21 = r39;
            0sL r22 = r35;
            A02(r18, str4, str5, r21, r22, C51969G9p.A05((i3 & 14) | 384 | (i3 & 112) | ((i4 << 3) & 7168), 57344 & i12, i12), A1a, z5);
            A00(r6, 0);
            int i13 = i3 >> 6;
            String str6 = str3;
            0sL r20 = r38;
            0sL r212 = r35;
            AnonymousClass62P r222 = r34;
            A03(r18, str6, r20, r212, r222, C51974G9v.A00(i4, (i13 & 112) | (i13 & 14) | 384 | (i4 & 7168)), A1a, z6, z7, z8);
            A00(r6, 0);
            C286575Wy r23 = r6;
            C62320sa r24 = r41;
            0sL r25 = r37;
            AnonymousClass62P r26 = r15;
            A06(r23, r24, r25, r26, C51969G9p.A04(i3 >> 9, (i3 >> 12) & 14), A1T);
            A00(r6, 0);
            C286575Wy r242 = r6;
            C62320sa r252 = r40;
            0sL r262 = r36;
            AnonymousClass62P r27 = r13;
            A05(r242, r252, r262, r27, C51969G9p.A04(i3 >> 18, (i3 >> 21) & 14), A1T2);
            A00(r6, 0);
            A07(r6, r8, r7, C51965G9l.A01(i4));
            if (C51967G9n.A1R(r6)) {
                0fL.A00(1543229656);
            }
        }
        C286625Xd ASQ = r6.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JDS(str, str3, r41, r40, r39, r38, r37, r36, r8, r35, r34, r15, r13, r7, i5, i11, z5, z6, z7, z8);
        }
    }
}
