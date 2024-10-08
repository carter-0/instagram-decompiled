package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GwE  reason: case insensitive filesystem */
public final class C53908GwE extends C251343mx {
    public final 2WX A00;
    public final JPD A01;
    public final C267324bN A02;
    public final C52058GDe A03;
    public final UserSession A04;
    public final AnonymousClass4DU A05;
    public final JTB A06;
    public final boolean A07;

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x016e, code lost:
        if (r1 == false) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0210, code lost:
        if (r6.A29 == false) goto L_0x0170;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C251263mp A0X(X.AnonymousClass3Y5 r33) {
        /*
            r32 = this;
            r2 = 0
            r3 = r33
            X.0qQ.A0B(r3, r2)
            r9 = r32
            X.GDe r0 = r9.A03
            X.3W1 r6 = r0.A0E
            if (r6 == 0) goto L_0x02b5
            X.4bN r5 = r9.A02
            X.1Xj r0 = r5.A02
            r22 = 0
            if (r0 == 0) goto L_0x00cf
            boolean r0 = r0.CeS()
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r0)
        L_0x001e:
            com.instagram.common.session.UserSession r8 = r9.A04
            X.0Tu r7 = X.DbS.A0J(r8, r2)
            r0 = 36323169782475723(0x810bbb00002bcb, double:3.034257059878028E-306)
            boolean r10 = X.182.A06(r7, r8, r0)
            r0 = 36323169782737870(0x810bbb00042bce, double:3.0342570600438105E-306)
            boolean r21 = X.182.A06(r7, r8, r0)
            X.1Xj r0 = r5.A02
            boolean r0 = X.C52453GTf.A00(r0)
            r4 = 1
            if (r0 == 0) goto L_0x00cb
            if (r10 != 0) goto L_0x0047
            boolean r0 = X.AnonymousClass7TF.A1Y(r12, r4)
            if (r0 != 0) goto L_0x00cb
        L_0x0047:
            r20 = 1
        L_0x0049:
            X.Iut r0 = X.C58622Iut.A00
            X.2Wa r10 = X.C243643Zq.A00(r3, r0)
            X.Ius r0 = X.C58621Ius.A00
            X.2Wa r29 = X.C243643Zq.A00(r3, r0)
            X.Iur r0 = X.C58620Iur.A00
            X.3Zt r28 = X.C243633Zp.A00(r3, r0)
            r0 = 2131165230(0x7f07002e, float:1.7944671E38)
            r19 = 2131165230(0x7f07002e, float:1.7944671E38)
            long r0 = X.C244013aV.A0C(r3, r0)
            X.Ine r11 = new X.Ine
            r11.<init>(r0, r4)
            X.2Wa r18 = X.C243643Zq.A00(r3, r11)
            if (r20 == 0) goto L_0x009c
            X.1Xj r0 = r5.A02
            boolean r0 = X.C52453GTf.A00(r0)
            if (r0 == 0) goto L_0x009c
            boolean r0 = X.AnonymousClass7TF.A1Y(r12, r4)
            if (r0 == 0) goto L_0x008a
            if (r21 != 0) goto L_0x008a
            boolean r0 = r6.A2B
            if (r0 != 0) goto L_0x009c
        L_0x0084:
            X.3XA r3 = new X.3XA
            r3.<init>()
            return r3
        L_0x008a:
            X.3W8 r0 = r6.A3R
            java.lang.Object r0 = r0.A00
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 != 0) goto L_0x009c
            boolean r0 = r6.A1q
            if (r0 != 0) goto L_0x009c
            boolean r0 = r6.A29
            if (r0 == 0) goto L_0x0084
        L_0x009c:
            X.1Xj r0 = r5.A02
            if (r0 == 0) goto L_0x02a2
            X.1Xy r0 = r0.A0C
            java.util.List r0 = r0.Aok()
            if (r0 == 0) goto L_0x02a2
            java.util.ArrayList r15 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r13 = r0.iterator()
        L_0x00b0:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x00d3
            java.lang.Object r11 = r13.next()
            r0 = r11
            X.1Xj r0 = (X.1Xj) r0
            X.1Xy r0 = r0.A0C
            com.instagram.api.schemas.CollectionMediaRole r1 = r0.Aom()
            com.instagram.api.schemas.CollectionMediaRole r0 = com.instagram.api.schemas.CollectionMediaRole.THUMBNAIL_MEDIA
            if (r1 != r0) goto L_0x00b0
            r15.add(r11)
            goto L_0x00b0
        L_0x00cb:
            r20 = 0
            goto L_0x0049
        L_0x00cf:
            r12 = r22
            goto L_0x001e
        L_0x00d3:
            boolean r0 = r15.isEmpty()
            if (r0 != 0) goto L_0x02a2
            int r0 = r15.size()
            r14 = 3
            boolean r17 = X.C51970G9q.A1W(r0, r14)
            r0 = 300(0x12c, float:4.2E-43)
            X.4Ex r13 = new X.4Ex
            r13.<init>(r0)
            if (r17 == 0) goto L_0x0214
            r0 = 36604644759376972(0x820bbb0003144c, double:3.2122629686791356E-306)
            int r11 = X.DbS.A04(r7, r8, r0)
            if (r11 == 0) goto L_0x0214
            int r0 = X.DbS.A04(r7, r8, r0)
            long r25 = X.C51965G9l.A07(r0)
        L_0x00fe:
            r0 = 42
            X.IwE r16 = X.C58705IwE.A01(r10, r0)
            r0 = r18
            java.lang.Object r0 = r0.A03
            X.2Wd r0 = (X.2Wd) r0
            long r0 = r0.A00
            r30 = r0
            float r11 = X.C51969G9p.A02(r3, r0)
            X.3Zd r10 = X.C243533Zd.GLOBAL
            java.lang.String r8 = "collection_ads_pe_key"
            X.4Ey r7 = X.C51973G9u.A0a(r10, r8)
            r0 = 1065353216(0x3f800000, float:1.0)
            r7.A02(r0)
            X.3du r0 = X.C246033ds.A05
            r7.A03(r0)
            float r1 = -r11
            X.4F6 r0 = new X.4F6
            r0.<init>(r1)
            r7.A04(r0)
            X.4F6 r0 = new X.4F6
            r0.<init>(r11)
            r7.A05(r0)
            X.3du r0 = X.C246033ds.A01
            r7.A03(r0)
            X.4F6 r0 = new X.4F6
            r0.<init>(r1)
            r7.A04(r0)
            X.4F6 r0 = new X.4F6
            r0.<init>(r11)
            r7.A05(r0)
            X.IIs r1 = new X.IIs
            r0 = r16
            r1.<init>(r0)
            r7.A05 = r1
            r7.A02 = r13
            X.AnonymousClass4F7.A00(r3, r7)
            if (r20 == 0) goto L_0x0170
            X.1Xj r0 = r5.A02
            boolean r0 = X.C52453GTf.A00(r0)
            r1 = 1
            if (r0 == 0) goto L_0x016d
            boolean r0 = X.AnonymousClass7TF.A1Y(r12, r4)
            if (r0 == 0) goto L_0x0200
            if (r21 != 0) goto L_0x0200
            boolean r1 = r6.A2B
        L_0x016d:
            r0 = 1
            if (r1 != 0) goto L_0x0171
        L_0x0170:
            r0 = 0
        L_0x0171:
            java.lang.Object[] r1 = X.C51968G9o.A1b(r0)
            r24 = 2
            X.Io9 r0 = new X.Io9
            r23 = r0
            r27 = r18
            r23.<init>(r24, r25, r27, r28, r29)
            X.C243773a4.A00(r3, r0, r1)
            r6 = 1120403456(0x42c80000, float:100.0)
            if (r17 == 0) goto L_0x023f
            X.2V1 r11 = r3.A05
            android.content.Context r0 = r11.A0C
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165213(0x7f07001d, float:1.7944637E38)
            int r7 = r1.getDimensionPixelSize(r0)
            X.Gxj r0 = new X.Gxj
            r0.<init>()
            X.GrT r5 = new X.GrT
            r5.<init>(r11, r0)
            X.3XV r0 = X.2WX.A02
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            r0 = r22
            X.2WX r0 = X.C51971G9r.A0X(r0, r1, r6, r2)
            X.2WX r1 = X.C51971G9r.A0V(r11, r0, r10, r8)
            X.2WX r0 = r9.A00
            X.2WX r8 = r1.A00(r0)
            X.2Wb r6 = X.AnonymousClass7TG.A0S(r11)
            java.util.Iterator r13 = r15.iterator()
            r11 = 0
        L_0x01bd:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x021d
            java.lang.Object r10 = r13.next()
            int r12 = r11 + 1
            if (r11 >= 0) goto L_0x01d3
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x01d3:
            X.1Xj r10 = (X.1Xj) r10
            boolean r0 = X.C51969G9p.A1V(r29)
            if (r0 == 0) goto L_0x01f9
            r24 = r30
        L_0x01dd:
            java.lang.String r0 = "subtitle_component_key_"
            java.lang.String r1 = X.002.A0O(r0, r11)
            r20 = r9
            r21 = r6
            r22 = r10
            r23 = r11
            r26 = r4
            X.3mp r0 = r20.A00(r21, r22, r23, r24, r26)
            X.AnonymousClass56V.A01(r0, r1)
            r6.A00(r0)
            r11 = r12
            goto L_0x01bd
        L_0x01f9:
            r0 = r19
            long r24 = X.C244013aV.A0C(r6, r0)
            goto L_0x01dd
        L_0x0200:
            X.3W8 r0 = r6.A3R
            java.lang.Object r0 = r0.A00
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 != 0) goto L_0x016d
            boolean r0 = r6.A1q
            if (r0 != 0) goto L_0x016d
            boolean r0 = r6.A29
            if (r0 == 0) goto L_0x0170
            goto L_0x016d
        L_0x0214:
            r0 = 2131165229(0x7f07002d, float:1.794467E38)
            long r25 = X.C244013aV.A0C(r3, r0)
            goto L_0x00fe
        L_0x021d:
            X.2Tp r0 = X.C243563Zg.A0B(r6, r3, r8)
            X.Gxj r3 = r5.A01
            X.3mp r0 = r0.A0E()
            r3.A01 = r0
            java.util.BitSet r1 = r5.A02
            r1.set(r2)
            r3.A04 = r2
            r3.A02 = r2
            r3.A03 = r4
            r3.A00 = r7
            java.lang.String[] r0 = r5.A03
            X.C244113af.A00(r1, r0, r4)
            r5.A02()
            return r3
        L_0x023f:
            X.3Zi r5 = X.C243583Zi.SPACE_BETWEEN
            X.3XV r0 = X.2WX.A02
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            r0 = r22
            X.2WX r6 = X.C51971G9r.A0X(r0, r1, r6, r2)
            r0 = 2131165213(0x7f07001d, float:1.7944637E38)
            long r0 = X.C244013aV.A0C(r3, r0)
            java.lang.Integer r4 = X.AnonymousClass05K.A1F
            X.2WX r1 = X.AnonymousClass9JR.A00(r6, r4, r2, r0)
            X.2WX r0 = r9.A00
            X.2WX r7 = r1.A00(r0)
            X.2Wb r6 = X.C51972G9s.A0Q(r3)
            int r0 = r15.size()
            if (r0 <= r14) goto L_0x0269
            r0 = 3
        L_0x0269:
            X.2HY r0 = X.C229632nm.A0C(r2, r0)
            java.util.Iterator r8 = r0.iterator()
        L_0x0271:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x029d
            r0 = r8
            X.0sh r0 = (X.0sh) r0
            int r4 = r0.A00()
            java.lang.Object r1 = r15.get(r4)
            X.1Xj r1 = (X.1Xj) r1
            r0 = 2131165229(0x7f07002d, float:1.794467E38)
            long r20 = X.C244013aV.A0C(r6, r0)
            r16 = r9
            r17 = r6
            r18 = r1
            r19 = r4
            r22 = r2
            X.3mp r0 = r16.A00(r17, r18, r19, r20, r22)
            r6.A00(r0)
            goto L_0x0271
        L_0x029d:
            X.2Tp r3 = X.C243563Zg.A0J(r6, r3, r7, r5)
            return r3
        L_0x02a2:
            X.2Wb r0 = X.C51972G9s.A0Q(r3)
            java.util.List r0 = r0.A01
            X.2Tp r3 = new X.2Tp
            r4 = r22
            r5 = r4
            r6 = r4
            r7 = r4
            r8 = r0
            r9 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r3
        L_0x02b5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53908GwE.A0X(X.3Y5):X.3mp");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x00cf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.C251263mp A00(X.C70832Wc r33, X.1Xj r34, int r35, long r36, boolean r38) {
        /*
            r32 = this;
            r7 = r33
            r0 = r36
            int r2 = X.C51969G9p.A09(r7, r0)
            r13 = r34
            com.instagram.model.mediasize.ExtendedImageUrl r19 = r13.A1m(r2)
            if (r19 != 0) goto L_0x0016
            X.3XA r15 = new X.3XA
            r15.<init>()
            return r15
        L_0x0016:
            r6 = 0
            X.3XV r2 = X.2WX.A02
            r8 = r32
            r12 = r35
            if (r35 <= 0) goto L_0x00e4
            r2 = 2131165196(0x7f07000c, float:1.7944602E38)
        L_0x0022:
            long r4 = X.C244013aV.A0C(r7, r2)
        L_0x0026:
            java.lang.Integer r2 = X.AnonymousClass05K.A07
            r3 = 0
            X.2WX r10 = X.AnonymousClass9JR.A00(r6, r2, r3, r4)
            r5 = 1065353216(0x3f800000, float:1.0)
            r31 = r38
            if (r38 == 0) goto L_0x00cf
            r9 = 0
            java.lang.Integer r11 = X.AnonymousClass05K.A01
            r2 = 1
            X.9JQ r4 = X.C51965G9l.A0b(r11, r5, r2)
            X.2WX r9 = X.C51974G9v.A0C(r6, r4, r9)
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            X.2WX r9 = X.AnonymousClass9JR.A00(r9, r4, r3, r0)
            X.2WX r9 = X.AnonymousClass9JR.A00(r9, r11, r3, r0)
        L_0x0049:
            X.4DU r11 = r8.A05
            r0 = 4620693217682128896(0x4020000000000000, double:8.0)
            int r0 = X.C51972G9s.A0E(r7, r0)
            float r14 = (float) r0
            android.widget.ImageView$ScaleType r16 = android.widget.ImageView.ScaleType.CENTER_CROP
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r21 = X.C51972G9s.A0E(r7, r0)
            X.2WX r1 = r10.A00(r9)
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            X.2WX r10 = X.C51971G9r.A0X(r6, r0, r5, r2)
            java.lang.String r0 = "clips_collection_ads_item_component"
            java.lang.String r9 = X.002.A0O(r0, r12)
            java.lang.Integer r5 = X.AnonymousClass05K.A0D
            r0 = 4
            X.2WX r5 = X.C51971G9r.A0Y(r10, r5, r9, r0)
            X.3aa r0 = X.C244063aa.MEDIA_THUMBNAIL
            X.2WX r23 = X.C51973G9u.A0N(r0, r5)
            X.4bN r9 = r8.A02
            com.instagram.common.session.UserSession r5 = r8.A04
            X.3Ds r22 = X.C238863Ds.COLLECTION_PRODUCT_TILE
            X.ILA r0 = new X.ILA
            r0.<init>(r13)
            r24 = r0
            r25 = r9
            r26 = r5
            r27 = r11
            r28 = r6
            r29 = r3
            r30 = r3
            X.2WX r9 = X.GFM.A00(r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r0 = 2131956278(0x7f131236, float:1.9549107E38)
            X.2WX r7 = X.C51973G9u.A0U(r9, r7, r0)
            X.IxB r0 = new X.IxB
            r27 = r13
            r28 = r8
            r29 = r12
            r26 = r0
            r26.<init>(r27, r28, r29, r30, r31)
            X.2WX r4 = X.C51971G9r.A0Z(r7, r4, r0, r6)
            X.3Ds r3 = X.C238863Ds.GENERIC_CALL_TO_ACTION_BUTTON
            X.IxB r0 = new X.IxB
            r30 = r2
            r26 = r0
            r26.<init>(r27, r28, r29, r30, r31)
            X.2WX r0 = X.GFM.A03(r3, r4, r5, r11, r0)
            X.2WX r17 = r1.A00(r0)
            r22 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            X.GxS r15 = new X.GxS
            r24 = r2
            r20 = r14
            r23 = r2
            r18 = r11
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return r15
        L_0x00cf:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r2 = 1
            X.9JQ r0 = X.C51965G9l.A0b(r0, r5, r2)
            X.2WX r1 = X.C51974G9v.A0C(r6, r0, r5)
            r0 = 1120403456(0x42c80000, float:100.0)
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            X.2WX r9 = X.C51971G9r.A0X(r1, r4, r0, r3)
            goto L_0x0049
        L_0x00e4:
            boolean r2 = r8.A07
            if (r2 == 0) goto L_0x00ec
            r2 = 2131165184(0x7f070000, float:1.7944578E38)
            goto L_0x0022
        L_0x00ec:
            long r4 = X.C51969G9p.A0D()
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53908GwE.A00(X.2Wc, X.1Xj, int, long, boolean):X.3mp");
    }

    public C53908GwE(2WX r2, JPD jpd, C267324bN r4, C52058GDe gDe, UserSession userSession, AnonymousClass4DU r7, JTB jtb, boolean z) {
        C51974G9v.A1P(userSession, r4, gDe, r7);
        0qQ.A0B(jtb, 6);
        this.A04 = userSession;
        this.A02 = r4;
        this.A03 = gDe;
        this.A05 = r7;
        this.A01 = jpd;
        this.A06 = jtb;
        this.A07 = z;
        this.A00 = r2;
    }
}
