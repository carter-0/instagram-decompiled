package X;

import com.instagram.android.R;
import com.instagram.api.schemas.MidCardClipsClickedAction;
import com.instagram.api.schemas.MidCardLayoutType;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Gvh  reason: case insensitive filesystem */
public final class C53876Gvh extends C251343mx {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final MidCardClipsClickedAction A04;
    public final JSG A05;
    public final AnonymousClass0iw A06;
    public final UserSession A07;
    public final C59619JQn A08;
    public final JRE A09;
    public final String A0A;
    public final List A0B;
    public final C62320sa A0C;
    public final C62320sa A0D;
    public final boolean A0E;
    public final int A0F;
    public final 2WX A0G;
    public final HashMap A0H;
    public final C62320sa A0I;
    public final AnonymousClass0Ud A0J;

    public C53876Gvh(2WX r4, MidCardClipsClickedAction midCardClipsClickedAction, JSG jsg, AnonymousClass0iw r7, UserSession userSession, C59619JQn jQn, JRE jre, String str, HashMap hashMap, List list, C62320sa r14, C62320sa r15, C62320sa r16, AnonymousClass0Ud r17, boolean z) {
        AnonymousClass7TG.A0w(1, userSession, r7, hashMap);
        C51969G9p.A1Q(jQn, 7, str);
        this.A07 = userSession;
        this.A09 = jre;
        this.A06 = r7;
        this.A0H = hashMap;
        this.A0J = r17;
        this.A0G = r4;
        this.A08 = jQn;
        this.A0E = z;
        this.A04 = midCardClipsClickedAction;
        this.A05 = jsg;
        this.A0C = r14;
        this.A0I = r15;
        this.A0D = r16;
        this.A0B = list;
        this.A0A = str;
        MidCardLayoutType BT0 = jre.BT0();
        this.A01 = BT0 == MidCardLayoutType.MEGA_CARD ? R.dimen.ab_test_media_thumbnail_preview_item_internal_padding : R.dimen.account_discovery_bottom_gap;
        MidCardLayoutType midCardLayoutType = MidCardLayoutType.GRID;
        this.A00 = BT0 == midCardLayoutType ? R.dimen.abc_button_padding_horizontal_material : R.dimen.account_discovery_bottom_gap;
        this.A02 = BT0 == midCardLayoutType ? R.dimen.abc_select_dialog_padding_start_material : R.dimen.abc_dropdownitem_icon_width;
        this.A03 = BT0 == midCardLayoutType ? R.dimen.account_discovery_bottom_gap : R.dimen.action_bar_item_spacing_right;
        this.A0F = BT0 == midCardLayoutType ? R.dimen.account_discovery_bottom_gap : R.dimen.ab_test_media_thumbnail_preview_item_internal_padding;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v30, resolved type: X.0sa} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v31, resolved type: X.0sa} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v33, resolved type: X.0sa} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v2, resolved type: X.Goj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v36, resolved type: X.0sa} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v37, resolved type: X.0sa} */
    /* JADX WARNING: type inference failed for: r4v18, types: [X.3mp] */
    /* JADX WARNING: type inference failed for: r5v35, types: [X.Goj] */
    /* JADX WARNING: type inference failed for: r4v33 */
    /* JADX WARNING: type inference failed for: r4v34 */
    /* JADX WARNING: type inference failed for: r14v11, types: [X.GuF] */
    /* JADX WARNING: type inference failed for: r14v12, types: [X.Guc] */
    /* JADX WARNING: type inference failed for: r14v13, types: [X.GuG] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0155  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C251263mp A0X(X.AnonymousClass3Y5 r43) {
        /*
            r42 = this;
            r2 = 0
            r7 = r43
            X.0qQ.A0B(r7, r2)
            r1 = r42
            X.2WX r0 = r1.A0G
            r41 = r0
            X.3XV r0 = X.2WX.A02
            X.2V1 r10 = r7.A05
            X.0qQ.A0B(r10, r2)
            r0 = 0
            X.2Ts r8 = new X.2Ts
            r8.<init>()
            X.2V4 r6 = r10.A0D
            X.3ai r5 = X.C244143ai.ALL
            r15 = 1
            if (r6 == 0) goto L_0x0305
            r8.A01(r5, r15)
            android.content.Context r4 = r10.A0C
            r3 = 2130970259(0x7f040693, float:1.7549223E38)
            int r3 = X.C51972G9s.A0A(r4, r7, r3)
            r8.A00(r5, r3)
            X.JRE r3 = r1.A09
            r25 = r3
            int r5 = r25.BJV()
            int r3 = r6.A03(r5)
            float[] r4 = r8.A00
            float r3 = (float) r3
            r6 = 4
            java.util.Arrays.fill(r4, r2, r6, r3)
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            r3 = 3
            X.2WX r9 = X.C51971G9r.A0Y(r0, r4, r8, r3)
            r8 = r41
            X.2WX r24 = r8.A00(r9)
            X.2Wb r23 = X.AnonymousClass7TG.A0S(r10)
            X.3Zi r22 = X.C243583Zi.FLEX_END
            X.2Wb r21 = X.G9t.A0w(r23)
            java.lang.String r30 = r25.getMediaId()
            com.instagram.common.typedurl.ImageUrl r29 = r25.BGK()
            java.util.HashMap r9 = r1.A0H
            int r34 = r25.Alh()
            java.lang.String r31 = r25.Anz()
            X.0iw r8 = r1.A06
            r28 = r8
            r8 = r21
            int r35 = X.C51972G9s.A0D(r8, r5)
            r10 = 2
            X.J6L r8 = new X.J6L
            r8.<init>(r1, r10)
            X.2WX r10 = X.C51972G9s.A0V(r0, r8)
            r8 = r41
            X.2WX r27 = r10.A00(r8)
            java.lang.String r32 = "Unknown"
            X.GxT r8 = new X.GxT
            r26 = r8
            r33 = r9
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35)
            r9 = r21
            r9.A00(r8)
            X.JNH r10 = r25.BZm()
            boolean r8 = r10 instanceof X.C57681Iek
            if (r8 == 0) goto L_0x0290
            r5 = r10
            X.Iek r5 = (X.C57681Iek) r5
            X.JNB r5 = r5.A00
            r20 = r5
            X.3b9 r12 = X.C244413b9.ABSOLUTE
            java.lang.Integer r11 = X.AnonymousClass05K.A0Y
            X.9JS r8 = X.C51965G9l.A0d(r11, r12, r3)
            r5 = 0
            X.2WX r13 = X.C51965G9l.A0X(r0, r8)
            java.lang.Integer r8 = X.AnonymousClass05K.A00
            r9 = 1120403456(0x42c80000, float:100.0)
            X.2WX r14 = X.C51974G9v.A0O(r13, r8, r4, r9, r2)
            r13 = 2131231402(0x7f0802aa, float:1.8078884E38)
            r4 = r21
            android.graphics.drawable.Drawable r4 = X.C244013aV.A0D(r4, r13)
            X.2WX r16 = X.C51971G9r.A0Y(r14, r8, r4, r6)
            X.2Wb r15 = X.C51973G9u.A0L(r21)
            X.0sa r6 = r1.A0D
            if (r6 == 0) goto L_0x0104
            X.JQn r4 = r1.A08
            r19 = r4
            com.instagram.common.session.UserSession r4 = r1.A07
            r18 = r4
            r4 = r25
            boolean r4 = r4 instanceof X.C53603GrI
            if (r4 == 0) goto L_0x028c
            r4 = r25
            X.GrI r4 = (X.C53603GrI) r4
            java.lang.Long r14 = r4.A07
            java.util.List r13 = r4.A09
            X.Goj r5 = r4.A04
        L_0x00e6:
            com.instagram.api.schemas.MidCardLayoutType r4 = r25.BT0()
            java.lang.String r4 = r4.A00
            r17 = r4
            java.lang.String r4 = r1.A0A
            r26 = r19
            r27 = r5
            r29 = r18
            r30 = r14
            r31 = r17
            r32 = r4
            r33 = r13
            r34 = r6
            X.0sa r5 = r26.BZo(r27, r28, r29, r30, r31, r32, r33, r34)
        L_0x0104:
            X.Gtq r13 = new X.Gtq
            r6 = r28
            r4 = r20
            r13.<init>(r6, r4, r5)
            r5 = r16
            r4 = r21
            X.C51971G9r.A1F(r13, r15, r4, r5)
        L_0x0114:
            X.9JQ r4 = X.C51965G9l.A0b(r8, r9, r2)
            X.2WX r13 = X.C51973G9u.A0T(r0, r4, r11, r12, r3)
            X.2Wb r11 = X.G9t.A0w(r21)
            boolean r3 = r10 instanceof X.C57682Iel
            if (r3 == 0) goto L_0x01e2
            X.Iel r10 = (X.C57682Iel) r10
            X.JNE r10 = r10.A00
            int r3 = r1.A01
            long r5 = X.C244013aV.A0C(r7, r3)
            int r3 = r1.A00
            long r3 = X.C244013aV.A0C(r7, r3)
            X.9JR r5 = X.C51967G9n.A0S(r2, r5)
            X.2WX r15 = X.C51974G9v.A0E(r0, r5, r2, r3)
            int r5 = r1.A02
            int r3 = r1.A03
            X.GuG r4 = new X.GuG
            r14 = r4
            r16 = r28
            r17 = r10
            r18 = r5
            r19 = r3
            r14.<init>(r15, r16, r17, r18, r19)
        L_0x014e:
            r11.A00(r4)
        L_0x0151:
            X.0sa r10 = r1.A0I
            if (r10 == 0) goto L_0x01c8
            int r3 = r1.A0F
            long r5 = X.C244013aV.A0C(r11, r3)
            long r3 = X.C244013aV.A03(r11)
            java.lang.Integer r12 = X.AnonymousClass05K.A04
            X.2WX r6 = X.AnonymousClass9JR.A00(r0, r12, r2, r5)
            java.lang.Integer r5 = X.AnonymousClass05K.A1I
            X.9JR r3 = X.C51965G9l.A0c(r5, r2, r3)
            X.2WX r4 = X.C51965G9l.A0X(r6, r3)
            X.2Wb r3 = X.G9t.A0w(r11)
            X.0Ud r12 = r1.A0J
            r37 = 2131231404(0x7f0802ac, float:1.8078888E38)
            X.2V1 r5 = r3.A00
            android.content.Context r5 = r5.A0C
            int r38 = X.2Yu.A0E(r5)
            int r39 = r25.AtW()
            X.2WX r34 = X.C51971G9r.A0X(r0, r8, r9, r2)
            X.JQn r9 = r1.A08
            com.instagram.common.session.UserSession r8 = r1.A07
            r0 = r25
            boolean r0 = r0 instanceof X.C53603GrI
            if (r0 == 0) goto L_0x01de
            r0 = r25
            X.GrI r0 = (X.C53603GrI) r0
            java.lang.Long r6 = r0.A07
            java.util.List r5 = r0.A09
            X.Goj r2 = r0.A03
        L_0x019c:
            com.instagram.api.schemas.MidCardLayoutType r0 = r25.BT0()
            java.lang.String r0 = r0.A00
            java.lang.String r1 = r1.A0A
            r25 = r9
            r26 = r2
            r27 = r28
            r28 = r8
            r29 = r6
            r30 = r0
            r31 = r1
            r32 = r5
            r33 = r10
            X.0sa r35 = r25.Aiq(r26, r27, r28, r29, r30, r31, r32, r33)
            r40 = 104(0x68, float:1.46E-43)
            X.GZ8 r0 = new X.GZ8
            r33 = r0
            r36 = r12
            r33.<init>(r34, r35, r36, r37, r38, r39, r40)
            X.C51971G9r.A1F(r0, r3, r11, r4)
        L_0x01c8:
            r0 = r21
            X.C51967G9n.A1F(r11, r0, r13)
            r3 = r23
            r2 = r41
            r1 = r22
            X.2Tl r2 = X.C243563Zg.A08(r0, r3, r2, r1)
            r0 = r24
            X.2Tl r0 = X.C51967G9n.A0N(r2, r3, r7, r0)
            return r0
        L_0x01de:
            r6 = 0
            r5 = 0
            r2 = 0
            goto L_0x019c
        L_0x01e2:
            boolean r3 = r10 instanceof X.C57684Ien
            if (r3 == 0) goto L_0x0216
            X.Ien r10 = (X.C57684Ien) r10
            X.JNC r12 = r10.A01
            int r3 = r1.A01
            long r5 = X.C244013aV.A0C(r7, r3)
            int r3 = r1.A00
            long r3 = X.C244013aV.A0C(r7, r3)
            X.9JR r5 = X.C51967G9n.A0S(r2, r5)
            X.2WX r15 = X.C51974G9v.A0E(r0, r5, r2, r3)
            int r6 = r1.A02
            int r5 = r1.A03
            com.instagram.api.schemas.MidCardOverlayType r3 = r10.A00
            X.Guc r4 = new X.Guc
            r14 = r4
            r16 = r3
            r17 = r28
            r18 = r12
            r19 = r6
            r20 = r5
            r14.<init>(r15, r16, r17, r18, r19, r20)
            goto L_0x014e
        L_0x0216:
            boolean r3 = r10 instanceof X.C57683Iem
            if (r3 == 0) goto L_0x0246
            X.Iem r10 = (X.C57683Iem) r10
            X.JND r10 = r10.A00
            int r3 = r1.A01
            long r5 = X.C244013aV.A0C(r7, r3)
            int r3 = r1.A00
            long r3 = X.C244013aV.A0C(r7, r3)
            X.9JR r5 = X.C51967G9n.A0S(r2, r5)
            X.2WX r15 = X.C51974G9v.A0E(r0, r5, r2, r3)
            int r5 = r1.A02
            int r3 = r1.A03
            X.GuF r4 = new X.GuF
            r14 = r4
            r16 = r28
            r17 = r10
            r18 = r5
            r19 = r3
            r14.<init>(r15, r16, r17, r18, r19)
            goto L_0x014e
        L_0x0246:
            boolean r3 = r10 instanceof X.C57678Ieh
            if (r3 == 0) goto L_0x0269
            X.Ieh r10 = (X.C57678Ieh) r10
            X.JN8 r10 = r10.A00
            int r3 = r1.A01
            long r5 = X.C244013aV.A0C(r7, r3)
            int r3 = r1.A00
            long r3 = X.C244013aV.A0C(r7, r3)
            X.9JR r5 = X.C51967G9n.A0S(r2, r5)
            X.2WX r3 = X.C51974G9v.A0E(r0, r5, r2, r3)
            X.GtG r4 = new X.GtG
            r4.<init>(r3, r10)
            goto L_0x014e
        L_0x0269:
            boolean r3 = r10 instanceof X.C57680Iej
            if (r3 == 0) goto L_0x0151
            X.Iej r10 = (X.C57680Iej) r10
            X.JNA r10 = r10.A00
            int r3 = r1.A01
            long r5 = X.C244013aV.A0C(r7, r3)
            int r3 = r1.A00
            long r3 = X.C244013aV.A0C(r7, r3)
            X.9JR r5 = X.C51967G9n.A0S(r2, r5)
            X.2WX r3 = X.C51974G9v.A0E(r0, r5, r2, r3)
            X.GtH r4 = new X.GtH
            r4.<init>(r3, r10)
            goto L_0x014e
        L_0x028c:
            r14 = 0
            r13 = 0
            goto L_0x00e6
        L_0x0290:
            X.3b9 r12 = X.C244413b9.ABSOLUTE
            java.lang.Integer r11 = X.AnonymousClass05K.A0Y
            X.2WX r6 = X.C51971G9r.A0Y(r0, r11, r12, r3)
            java.lang.Integer r8 = X.AnonymousClass05K.A00
            r9 = 1120403456(0x42c80000, float:100.0)
            X.2WX r20 = X.C51974G9v.A0O(r6, r8, r4, r9, r2)
            X.2Wb r6 = X.C51973G9u.A0L(r21)
            X.9JS r13 = X.C51965G9l.A0d(r11, r12, r3)
            X.2WX r14 = X.C51973G9u.A0S(r0, r13, r8, r9, r2)
            r13 = 1109131264(0x421c0000, float:39.0)
            X.2WX r19 = X.C51971G9r.A0X(r14, r4, r13, r2)
            X.2Wb r13 = X.G9t.A0w(r6)
            int r18 = X.C51972G9s.A0D(r13, r5)
            r14 = 1065353216(0x3f800000, float:1.0)
            X.2WX r5 = X.C51971G9r.A0X(r0, r4, r14, r15)
            X.2WX r17 = X.C51974G9v.A0O(r5, r4, r8, r9, r2)
            r4 = 2131100175(0x7f06020f, float:1.7812724E38)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r4 = 2131099781(0x7f060085, float:1.7811925E38)
            java.lang.Integer r16 = java.lang.Integer.valueOf(r4)
            r4 = 2131099787(0x7f06008b, float:1.7811937E38)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r4)
            r4 = 2131099791(0x7f06008f, float:1.7811945E38)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r4)
            r4 = r16
            java.lang.Integer[] r4 = new java.lang.Integer[]{r5, r4, r15, r14}
            java.util.List r4 = X.0sr.A1P(r4)
            X.GxG r14 = new X.GxG
            r15 = r18
            r5 = r17
            r14.<init>(r5, r4, r15, r2)
            r4 = r19
            X.C51971G9r.A1D(r14, r13, r6, r4)
            r5 = r20
            r4 = r21
            X.2Tl r5 = X.C243563Zg.A02(r6, r4, r5)
            r4.A00(r5)
            goto L_0x0114
        L_0x0305:
            java.lang.String r0 = "This builder has already been disposed / built!"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53876Gvh.A0X(X.3Y5):X.3mp");
    }
}
