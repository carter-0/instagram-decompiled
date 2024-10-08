package X;

import com.instagram.api.schemas.AdFormatType;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.GEb  reason: case insensitive filesystem */
public final class C52081GEb extends C247303g7 {
    public final ClipsViewerSource A00;
    public final UserSession A01;
    public final C247293g6 A02;
    public final 1Av A03;
    public final User A04;
    public final C52133GGb A05;
    public final H2D A06;
    public final GDG A07;
    public final C52134GGc A08;
    public final C52136GGe A09;
    public final C52137GGf A0A;
    public final H2E A0B;
    public final C51979GAc A0C;
    public final boolean A0D;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v0, resolved type: X.GHn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v1, resolved type: X.IeN} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v2, resolved type: X.GHn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v55, resolved type: X.GHn} */
    /* JADX WARNING: type inference failed for: r31v2, types: [X.IeM] */
    /* JADX WARNING: type inference failed for: r30v2, types: [X.IeL] */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01d6, code lost:
        if (X.182.A06(X.0Tu.A05, r0, 36328444002385249L) == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x02af, code lost:
        if (X.182.A06(r5, r0, 36329126902710078L) == false) goto L_0x02b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x031a, code lost:
        if (X.182.A06(r5, r0, 36329126902710078L) == false) goto L_0x031d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0195, code lost:
        if (r5 == X.AnonymousClass05K.A00) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01a3, code lost:
        if (A02(r1, r0) != false) goto L_0x01a5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x02be  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x02d4  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0323  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0333  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x012b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x019d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C52091GEl A05(X.GEG r43, com.instagram.clips.intf.ClipsViewerConfig r44, X.C267324bN r45, X.C52058GDe r46, int r47, boolean r48) {
        /*
            r42 = this;
            r4 = 1
            r2 = r42
            r15 = r43
            r1 = r45
            X.GHh r16 = r2.A00(r15, r1)
            X.GDG r6 = r2.A07
            X.1Xj r5 = r1.A02
            r41 = r46
            r21 = r47
            if (r5 != 0) goto L_0x034e
            java.lang.String r5 = "ClipsLikeButtonUseCase"
            java.lang.String r3 = "ClipsItem has null media param"
            r0 = 0
            X.0kD.A07(r5, r3, r0)
            X.IeL r30 = X.C57656IeL.A00
        L_0x001f:
            X.GGe r0 = r2.A09
            if (r48 == 0) goto L_0x002f
            X.1Xj r5 = r1.A02
            if (r5 != 0) goto L_0x0337
            java.lang.String r5 = "ClipsSaveButtonUseCase"
            java.lang.String r3 = "ClipsItem has null media param"
            r0 = 0
            X.0kD.A07(r5, r3, r0)
        L_0x002f:
            X.IeN r32 = X.C57658IeN.A00
        L_0x0031:
            X.GGb r6 = r2.A05
            X.1Xj r5 = r1.A02
            if (r5 == 0) goto L_0x0333
            r0 = 0
            X.3de r3 = new X.3de
            r3.<init>(r5, r0)
            com.instagram.common.session.UserSession r0 = r6.A00
            boolean r22 = X.C245953dk.A00(r0, r3)
        L_0x0043:
            X.5o2 r3 = r1.A01
            java.lang.String r20 = r1.A0C()
            X.GEe r29 = new X.GEe
            r17 = r29
            r18 = r1
            r19 = r3
            r17.<init>(r18, r19, r20, r21, r22)
            X.1Xj r0 = r1.A02
            if (r0 != 0) goto L_0x0323
            X.IeM r31 = X.C57657IeM.A00
        L_0x005a:
            com.instagram.common.session.UserSession r0 = r2.A01
            X.1Xj r5 = r1.A02
            X.3gK r22 = X.C247293g6.A00(r0, r5)
            r10 = 4
            X.Jvl r17 = new X.Jvl
            r5 = r17
            r6 = r1
            r7 = r3
            r8 = r41
            r9 = r21
            r5.<init>(r6, r7, r8, r9, r10)
            r10 = 3
            X.Jvl r18 = new X.Jvl
            r5 = r18
            r5.<init>(r6, r7, r8, r9, r10)
            X.GHh r23 = r2.A00(r15, r1)
            r3 = r44
            boolean r14 = r3.A1q
            if (r14 != 0) goto L_0x0090
            boolean r5 = r3.A1b
            if (r5 != 0) goto L_0x0090
            X.1Xj r5 = r1.A02
            if (r5 == 0) goto L_0x02c2
            boolean r5 = r5.A4c()
            if (r5 != r4) goto L_0x02c2
        L_0x0090:
            X.GJC r13 = X.GJC.A00
        L_0x0092:
            X.1Xj r7 = r1.A02
            if (r7 == 0) goto L_0x02be
            int r6 = r7.A0v()
            if (r6 <= 0) goto L_0x02be
            boolean r5 = r3.A1c
            if (r5 != 0) goto L_0x02be
            boolean r5 = A02(r1, r0)
            if (r5 != 0) goto L_0x02be
            X.3Yk r5 = X.C243353Yk.A00
            boolean r5 = r5.A04(r0, r7)
            if (r5 != 0) goto L_0x00be
            boolean r5 = r1.CcK()
            if (r5 != 0) goto L_0x02b3
            X.4gy r5 = r1.A0H
            if (r5 == 0) goto L_0x028d
            boolean r5 = r5.AxT()
            if (r5 != r4) goto L_0x028d
        L_0x00be:
            X.JN2 r5 = r2.A01(r3, r7)
            X.GLW r11 = new X.GLW
            r11.<init>(r5)
        L_0x00c7:
            X.JN3 r11 = (X.JN3) r11
        L_0x00c9:
            boolean r5 = r1.CcK()
            if (r5 == 0) goto L_0x0284
            X.3OA r5 = r1.A06()
            X.1Xj r5 = r5.A0K
            boolean r5 = r5.A5n()
            if (r5 != 0) goto L_0x0280
            X.1Av r2 = r2.A03
            boolean r2 = X.C228342lQ.A07(r0, r2)
            if (r2 != 0) goto L_0x0280
            boolean r2 = A02(r1, r0)
            if (r2 != 0) goto L_0x0280
            X.0Tu r2 = X.0Tu.A05
            r5 = 36322358033721446(0x810afe00012866, double:3.033743706697173E-306)
        L_0x00f0:
            boolean r5 = X.182.A06(r2, r0, r5)
            if (r5 == 0) goto L_0x0280
            r5 = 36885307987198555(0x830afe0002025b, double:3.3897555240936115E-306)
            java.lang.String r2 = X.182.A04(r2, r0, r5)
            java.lang.Integer r5 = X.C52248GKp.A00(r2)
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            if (r5 != r2) goto L_0x027c
            r7 = 0
            java.lang.Object[] r5 = new java.lang.Object[r7]
            r2 = 2131964345(0x7f1331b9, float:1.956547E38)
            X.GKO r6 = new X.GKO
            r6.<init>(r5, r2)
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r5 = 2131964346(0x7f1331ba, float:1.9565471E38)
            X.GKO r2 = new X.GKO
            r2.<init>(r7, r5)
            X.Gqy r8 = new X.Gqy
            r8.<init>(r6, r2)
        L_0x0121:
            X.JN1 r8 = (X.JN1) r8
        L_0x0123:
            X.1Xj r2 = r1.A02
            r5 = r41
            X.3W1 r5 = r5.A0E
            if (r2 == 0) goto L_0x0278
            if (r5 == 0) goto L_0x0278
            X.GEk r12 = new X.GEk
            r12.<init>(r2, r5)
        L_0x0132:
            X.JN7 r12 = (X.JN7) r12
            if (r2 == 0) goto L_0x0275
            X.1Xy r2 = r2.A0C
            java.lang.Integer r2 = r2.BpM()
        L_0x013c:
            java.lang.Integer r10 = X.AnonymousClass05K.A01
            if (r2 == 0) goto L_0x0271
            X.0Tu r9 = X.0Tu.A05
            r6 = 36325063863120467(0x810d7400013253, double:3.0354548841046144E-306)
            boolean r6 = X.182.A06(r9, r0, r6)
            if (r6 == 0) goto L_0x0271
            boolean r6 = X.C55114HcN.A00(r0, r2, r10)
            if (r6 == 0) goto L_0x026d
            int r2 = r2.intValue()
            X.GIA r6 = new X.GIA
            r6.<init>(r2)
        L_0x015c:
            X.JN1 r6 = (X.JN1) r6
        L_0x015e:
            if (r14 != 0) goto L_0x016e
            boolean r2 = r3.A1d
            if (r2 != 0) goto L_0x016e
            X.4gy r2 = r1.A0H
            if (r2 == 0) goto L_0x01f8
            boolean r2 = r2.AxY()
            if (r2 != r4) goto L_0x01f8
        L_0x016e:
            X.GJC r2 = X.GJC.A00
        L_0x0170:
            X.JN1 r2 = (X.JN1) r2
        L_0x0172:
            r7 = r16
            boolean r7 = r7.A00
            if (r7 == 0) goto L_0x01f4
            X.GJ5 r9 = r15.A00
            X.GJ5 r7 = X.GJ5.OVERLAY_AD
            r34 = 2131165184(0x7f070000, float:1.7944578E38)
            if (r9 != r7) goto L_0x0183
            r34 = 2131165218(0x7f070022, float:1.7944647E38)
        L_0x0183:
            boolean r7 = r3.A1S
            r35 = r7 ^ 1
            boolean r7 = r1.CcK()
            if (r7 == 0) goto L_0x0197
            if (r5 == 0) goto L_0x01f2
            java.lang.Integer r5 = r5.A10
        L_0x0191:
            java.lang.Integer r7 = X.AnonymousClass05K.A00
            r36 = 1
            if (r5 != r7) goto L_0x0199
        L_0x0197:
            r36 = 0
        L_0x0199:
            boolean r5 = r3.A1c
            if (r5 != 0) goto L_0x01a5
            boolean r5 = A02(r1, r0)
            r37 = 1
            if (r5 == 0) goto L_0x01a7
        L_0x01a5:
            r37 = 0
        L_0x01a7:
            X.4gy r5 = r1.A0H
            r7 = 0
            if (r5 == 0) goto L_0x01b3
            boolean r5 = r5.AxV()
            if (r5 != r4) goto L_0x01b3
            r7 = 1
        L_0x01b3:
            r38 = r7 ^ 1
            boolean r39 = r1.CcK()
            com.instagram.clips.intf.ClipsViewerSource r3 = r3.A0J
            com.instagram.clips.intf.ClipsViewerSource r4 = com.instagram.clips.intf.ClipsViewerSource.CLIPS_TAB
            if (r3 == r4) goto L_0x01c3
            com.instagram.clips.intf.ClipsViewerSource r4 = com.instagram.clips.intf.ClipsViewerSource.FEED_TIMELINE
            if (r3 != r4) goto L_0x01d8
        L_0x01c3:
            boolean r3 = r1.CcK()
            if (r3 != 0) goto L_0x01d8
            X.0Tu r5 = X.0Tu.A05
            r3 = 36328444002385249(0x81108700013d61, double:3.037592497786391E-306)
            boolean r0 = X.182.A06(r5, r0, r3)
            r40 = 1
            if (r0 != 0) goto L_0x01da
        L_0x01d8:
            r40 = 0
        L_0x01da:
            X.GEl r16 = new X.GEl
            r24 = r13
            r25 = r8
            r26 = r6
            r27 = r2
            r28 = r11
            r33 = r12
            r19 = r15
            r20 = r1
            r21 = r41
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            return r16
        L_0x01f2:
            r5 = 0
            goto L_0x0191
        L_0x01f4:
            r34 = 2131165196(0x7f07000c, float:1.7944602E38)
            goto L_0x0183
        L_0x01f8:
            X.1Xj r2 = r1.A02
            if (r2 == 0) goto L_0x020e
            boolean r2 = r2.A5P()
            if (r2 != r4) goto L_0x020e
            X.1Xj r2 = r1.A02
            if (r2 == 0) goto L_0x020e
            boolean r2 = r2.A5Z()
            if (r2 != r4) goto L_0x020e
            goto L_0x016e
        L_0x020e:
            X.1Xj r2 = r1.A02
            if (r2 == 0) goto L_0x021a
            boolean r2 = r2.A5Z()
            if (r2 != r4) goto L_0x021a
            goto L_0x016e
        L_0x021a:
            boolean r2 = r1.CcK()
            r9 = 0
            if (r2 == 0) goto L_0x023d
            X.1Xj r2 = r1.A02
            if (r2 == 0) goto L_0x023d
            X.1Xy r2 = r2.A0C
            X.3lZ r2 = r2.getInjected()
            if (r2 == 0) goto L_0x023d
            java.lang.Boolean r7 = r2.AxE()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r9)
            boolean r2 = X.0qQ.A0K(r7, r2)
            if (r2 == 0) goto L_0x023d
            goto L_0x016e
        L_0x023d:
            boolean r2 = A02(r1, r0)
            if (r2 != 0) goto L_0x016e
            X.1Xj r2 = r1.A02
            if (r2 != 0) goto L_0x024b
            X.GLC r2 = X.GLC.A00
            goto L_0x0170
        L_0x024b:
            int r7 = r2.A11()
            if (r7 <= 0) goto L_0x026a
            boolean r7 = X.C243353Yk.A01(r0, r2)
            if (r7 != 0) goto L_0x026a
            boolean r7 = X.GL7.A01(r0)
            if (r7 != 0) goto L_0x026a
            int r7 = r2.A11()
            X.GIA r2 = new X.GIA
            r2.<init>(r7)
        L_0x0266:
            X.JN1 r2 = (X.JN1) r2
            goto L_0x0172
        L_0x026a:
            X.GLC r2 = X.GLC.A00
            goto L_0x0266
        L_0x026d:
            X.GLC r6 = X.GLC.A00
            goto L_0x015c
        L_0x0271:
            X.GJC r6 = X.GJC.A00
            goto L_0x015e
        L_0x0275:
            r2 = 0
            goto L_0x013c
        L_0x0278:
            X.IeO r12 = X.C57659IeO.A00
            goto L_0x0132
        L_0x027c:
            X.GLC r8 = X.GLC.A00
            goto L_0x0121
        L_0x0280:
            X.GJC r8 = X.GJC.A00
            goto L_0x0123
        L_0x0284:
            X.0Tu r2 = X.0Tu.A05
            r5 = 36322358033983592(0x810afe00052868, double:3.033743706862955E-306)
            goto L_0x00f0
        L_0x028d:
            com.instagram.user.model.User r8 = r2.A04
            com.instagram.user.model.User r5 = r1.A08(r0)
            boolean r5 = X.0qQ.A0K(r8, r5)
            if (r5 != 0) goto L_0x02b3
            X.0Tu r5 = X.0Tu.A05
            r8 = 36329126902906689(0x811126000c3f41, double:3.038024366825969E-306)
            boolean r8 = X.182.A06(r5, r0, r8)
            if (r8 != 0) goto L_0x00be
            r8 = 36329126902710078(0x81112600093f3e, double:3.0380243667016316E-306)
            boolean r5 = X.182.A06(r5, r0, r8)
            if (r5 == 0) goto L_0x02b3
            goto L_0x00be
        L_0x02b3:
            X.JN2 r5 = r2.A01(r3, r7)
            X.GJM r11 = new X.GJM
            r11.<init>(r5, r6)
            goto L_0x00c7
        L_0x02be:
            X.GNE r11 = X.GNE.A00
            goto L_0x00c9
        L_0x02c2:
            X.4gy r5 = r1.A0H
            if (r5 == 0) goto L_0x02ce
            boolean r6 = r5.AxQ()
            if (r6 != r4) goto L_0x02ce
            goto L_0x0090
        L_0x02ce:
            boolean r6 = A02(r1, r0)
            if (r6 != 0) goto L_0x0090
            X.1Xj r6 = r1.A02
            if (r6 == 0) goto L_0x02f2
            int r6 = r6.A0r()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            if (r7 == 0) goto L_0x02f2
            if (r6 <= 0) goto L_0x02f2
            boolean r7 = r1.CcK()
            if (r7 != 0) goto L_0x031d
            if (r5 == 0) goto L_0x02f8
            boolean r5 = r5.AxR()
            if (r5 != r4) goto L_0x02f8
        L_0x02f2:
            X.GLC r13 = X.GLC.A00
        L_0x02f4:
            X.JN1 r13 = (X.JN1) r13
            goto L_0x0092
        L_0x02f8:
            com.instagram.user.model.User r7 = r2.A04
            com.instagram.user.model.User r5 = r1.A08(r0)
            boolean r5 = X.0qQ.A0K(r7, r5)
            if (r5 != 0) goto L_0x031d
            X.0Tu r5 = X.0Tu.A05
            r7 = 36329126902972226(0x811126000d3f42, double:3.038024366867415E-306)
            boolean r7 = X.182.A06(r5, r0, r7)
            if (r7 != 0) goto L_0x02f2
            r7 = 36329126902710078(0x81112600093f3e, double:3.0380243667016316E-306)
            boolean r5 = X.182.A06(r5, r0, r7)
            if (r5 == 0) goto L_0x031d
            goto L_0x02f2
        L_0x031d:
            X.GIA r13 = new X.GIA
            r13.<init>(r6)
            goto L_0x02f4
        L_0x0323:
            X.GEf r31 = new X.GEf
            r5 = r31
            r6 = r1
            r7 = r3
            r8 = r41
            r9 = r0
            r10 = r21
            r5.<init>(r6, r7, r8, r9, r10)
            goto L_0x005a
        L_0x0333:
            r22 = 0
            goto L_0x0043
        L_0x0337:
            X.5o2 r3 = r1.A01
            X.2f5 r0 = r0.A00
            boolean r10 = r0.A0O(r5)
            X.GHn r32 = new X.GHn
            r5 = r32
            r6 = r1
            r7 = r3
            r8 = r41
            r9 = r21
            r5.<init>(r6, r7, r8, r9, r10)
            goto L_0x0031
        L_0x034e:
            X.5o2 r3 = r1.A01
            java.lang.Integer r11 = java.lang.Integer.valueOf(r21)
            X.5o2 r0 = X.C295365o2.AD_PREVIEW
            r12 = 0
            if (r3 == r0) goto L_0x035a
            r12 = 1
        L_0x035a:
            X.GDF r0 = r6.A08
            X.0q2 r0 = r0.A04
            boolean r13 = r0.A0N(r5)
            X.GEc r30 = new X.GEc
            r6 = r30
            r7 = r1
            r8 = r3
            r9 = r41
            r10 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52081GEb.A05(X.GEG, com.instagram.clips.intf.ClipsViewerConfig, X.4bN, X.GDe, int, boolean):X.GEl");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        if (r8.A00 == X.GJ5.QP) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
        if (X.182.A06(X.0Tu.A05, r7.A01, 36329805506953551L) == false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.C52165GHh A00(X.GEG r8, X.C267324bN r9) {
        /*
            r7 = this;
            X.5o2 r1 = r9.A01
            X.5o2 r0 = X.C295365o2.ORGANIC
            r6 = 1
            r5 = 0
            if (r1 != r0) goto L_0x0009
            r5 = 1
        L_0x0009:
            boolean r0 = r9.CcK()
            if (r0 == 0) goto L_0x001f
            com.instagram.common.session.UserSession r3 = r7.A01
            X.0Tu r2 = X.0Tu.A05
            r0 = 36329805506953551(0x8111c40000414f, double:3.038453518757724E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r4 = 1
            if (r0 != 0) goto L_0x0020
        L_0x001f:
            r4 = 0
        L_0x0020:
            if (r5 != 0) goto L_0x002b
            if (r4 != 0) goto L_0x002b
            X.GJ5 r1 = r8.A00
            X.GJ5 r0 = X.GJ5.QP
            r3 = 0
            if (r1 != r0) goto L_0x002c
        L_0x002b:
            r3 = 1
        L_0x002c:
            X.1Xj r2 = r9.A02
            if (r2 == 0) goto L_0x0083
            X.1Xy r0 = r2.A0C
            if (r4 == 0) goto L_0x0055
            com.instagram.user.model.User r0 = r0.CCd()
            if (r0 == 0) goto L_0x0081
            r0.Bh3()
        L_0x003d:
            if (r3 == 0) goto L_0x0083
            boolean r0 = r8.A0E
            if (r0 == 0) goto L_0x0083
            if (r6 == 0) goto L_0x0083
            X.1Xj r1 = r9.A02
            com.instagram.common.session.UserSession r0 = r7.A01
            boolean r0 = X.AnonymousClass3ZJ.A0D(r0, r1)
            if (r0 != 0) goto L_0x0083
            X.GI9 r0 = new X.GI9
            r0.<init>(r2)
            return r0
        L_0x0055:
            X.1sQ r0 = r0.getClipsMetadata()
            if (r0 == 0) goto L_0x0061
            X.46i r0 = X.C291335gz.A01(r0)
            if (r0 != 0) goto L_0x003d
        L_0x0061:
            X.1Xy r0 = r2.A0C
            X.1dn r0 = r0.getMusicMetadata()
            if (r0 == 0) goto L_0x0081
            com.instagram.api.schemas.MusicInfo r1 = r0.BUr()
            if (r1 == 0) goto L_0x0075
            X.46h r0 = new X.46h
            r0.<init>(r1)
            goto L_0x003d
        L_0x0075:
            com.instagram.api.schemas.OriginalSoundDataIntf r1 = r0.BZB()
            if (r1 == 0) goto L_0x0081
            X.5Bc r0 = new X.5Bc
            r0.<init>(r1)
            goto L_0x003d
        L_0x0081:
            r6 = 0
            goto L_0x003d
        L_0x0083:
            X.GLy r0 = X.C52282GLy.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52081GEb.A00(X.GEG, X.4bN):X.GHh");
    }

    private final JN2 A01(ClipsViewerConfig clipsViewerConfig, 1Xj r6) {
        JN2 jn2;
        int i;
        if (clipsViewerConfig.A1q || clipsViewerConfig.A1T) {
            jn2 = C57655IeK.A00;
        } else {
            boolean A4S = r6.A4S();
            UserSession userSession = this.A01;
            if (!C46342Dck.A02(userSession, r6)) {
                i = 2131969512;
                if (A4S) {
                    i = 2131976689;
                }
            } else if (A4S) {
                i = 2131976690;
            } else {
                i = 2131969515;
                if (182.A06(0Tu.A05, userSession, 36320854795232150L)) {
                    i = 2131969513;
                }
            }
            jn2 = new C52175GHr(r6, i);
        }
        return jn2;
    }

    public static final boolean A02(C267324bN r2, UserSession userSession) {
        if (AdFormatType.GRID != r2.A0E || 182.A06(0Tu.A05, userSession, 36321761034184393L)) {
            return false;
        }
        return true;
    }

    public /* synthetic */ C52081GEb(ClipsViewerSource clipsViewerSource, UserSession userSession, C247293g6 r6, C52133GGb gGb, H2D h2d, GDG gdg, C52134GGc gGc, C52136GGe gGe, C52137GGf gGf, H2E h2e, C51979GAc gAc, boolean z) {
        User A0j = DbT.A0j(userSession);
        1Av A002 = 1Au.A00(userSession);
        0qQ.A0B(clipsViewerSource, 3);
        AnonymousClass7TG.A1S(gGb, gdg);
        C51974G9v.A1Q(gGc, r6, gGe, gGf);
        DbW.A1P(h2d, 11, h2e);
        0qQ.A0B(A002, 14);
        this.A01 = userSession;
        this.A0C = gAc;
        this.A00 = clipsViewerSource;
        this.A0D = z;
        this.A05 = gGb;
        this.A07 = gdg;
        this.A08 = gGc;
        this.A02 = r6;
        this.A09 = gGe;
        this.A0A = gGf;
        this.A06 = h2d;
        this.A0B = h2e;
        this.A04 = A0j;
        this.A03 = A002;
    }
}
