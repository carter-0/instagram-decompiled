package X;

/* renamed from: X.7KW  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7KW extends 03J implements 0sL {
    public AnonymousClass7KW(Object obj) {
        super(2, obj, AnonymousClass7KU.class, "buildOverflowMenu", "buildOverflowMenu(Landroid/content/Context;Z)Lcom/instagram/igds/components/contextmenu/IgdsContextMenu;", 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x021f, code lost:
        if (r16 == null) goto L_0x0221;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r31, java.lang.Object r32) {
        /*
            r30 = this;
            r0 = r32
            r1 = r31
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r9 = r0.booleanValue()
            r8 = 0
            X.0qQ.A0B(r1, r8)
            r0 = r30
            java.lang.Object r0 = r0.receiver
            X.7KU r0 = (X.AnonymousClass7KU) r0
            X.7Jt r3 = r0.A02
            java.util.List r2 = r0.A05
            if (r3 == 0) goto L_0x0020
            java.util.ArrayList r2 = X.00k.A0T(r3, r2)
        L_0x0020:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r7 = r2.iterator()
        L_0x0029:
            boolean r2 = r7.hasNext()
            r6 = 1
            if (r2 == 0) goto L_0x0069
            java.lang.Object r5 = r7.next()
            r10 = r5
            X.7Jt r10 = (X.C329667Jt) r10
            X.0sa r2 = r0.A06
            java.lang.Object r11 = r2.invoke()
            X.7Rr r11 = (X.C331617Rr) r11
            X.3t2 r13 = r0.A04
            X.0sa r2 = r0.A08
            java.lang.Object r2 = r2.invoke()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r15 = r2.booleanValue()
            X.0sa r2 = r0.A09
            java.lang.Object r12 = r2.invoke()
            X.2FW r12 = (X.2FW) r12
            X.0sa r14 = r0.A07
            r16 = r8
            boolean r2 = r10.A03(r11, r12, r13, r14, r15, r16)
            if (r2 == 0) goto L_0x0029
            X.7JU r3 = r10.A03
            X.7JU r2 = X.AnonymousClass7JU.OVERFLOW
            if (r3 != r2) goto L_0x0029
            r4.add(r5)
            goto L_0x0029
        L_0x0069:
            r2 = 10
            int r3 = X.0Yv.A1E(r4, r2)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r3)
            java.util.Iterator r11 = r4.iterator()
        L_0x0078:
            boolean r3 = r11.hasNext()
            if (r3 == 0) goto L_0x00a3
            java.lang.Object r15 = r11.next()
            X.7Jt r15 = (X.C329667Jt) r15
            int r7 = r15.A02
            int r5 = r15.A01
            X.7JT r14 = r15.A04
            int r4 = r15.A00
            java.lang.String r3 = r14.A00
            X.7JU r13 = r15.A03
            X.Drb r12 = new X.Drb
            r16 = r15
            r18 = r7
            r19 = r5
            r20 = r4
            r17 = r3
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            r10.add(r12)
            goto L_0x0078
        L_0x00a3:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r13 = r10.iterator()
        L_0x00ac:
            boolean r3 = r13.hasNext()
            if (r3 == 0) goto L_0x0117
            java.lang.Object r10 = r13.next()
            r3 = r10
            X.Drb r3 = (X.C47160Drb) r3
            X.7Jt r7 = r3.A03
            boolean r3 = r7 instanceof X.C329727Jz
            if (r3 == 0) goto L_0x00cd
            X.7Jz r7 = (X.C329727Jz) r7
            X.0sa r3 = r7.A02
        L_0x00c3:
            java.lang.Object r3 = r3.invoke()
            if (r3 == 0) goto L_0x00ac
        L_0x00c9:
            r5.add(r10)
            goto L_0x00ac
        L_0x00cd:
            boolean r3 = r7 instanceof X.AnonymousClass7K5
            if (r3 == 0) goto L_0x00fc
            X.7K5 r7 = (X.AnonymousClass7K5) r7
            X.0sa r3 = r7.A02
            java.lang.Object r11 = r3.invoke()
            X.2Er r11 = (X.2Er) r11
            if (r11 == 0) goto L_0x00f9
            int r4 = r11.C6a()
            r3 = 28
            if (r4 == r3) goto L_0x00ed
            int r4 = r11.C6a()
            r3 = 61
            if (r4 != r3) goto L_0x00f9
        L_0x00ed:
            com.instagram.common.session.UserSession r12 = r7.A00
            X.0Tu r11 = X.0Tu.A05
            r3 = 36330965148124004(0x8112d200004364, double:3.0391868805034186E-306)
            X.182.A06(r11, r12, r3)
        L_0x00f9:
            X.0sa r3 = r7.A01
            goto L_0x00c3
        L_0x00fc:
            boolean r3 = r7 instanceof X.AnonymousClass7KC
            if (r3 == 0) goto L_0x0105
            X.7KC r7 = (X.AnonymousClass7KC) r7
            X.0sa r3 = r7.A03
            goto L_0x00c3
        L_0x0105:
            boolean r3 = r7 instanceof X.AnonymousClass7K3
            if (r3 == 0) goto L_0x010e
            X.7K3 r7 = (X.AnonymousClass7K3) r7
            X.0sa r3 = r7.A01
            goto L_0x00c3
        L_0x010e:
            boolean r3 = r7 instanceof X.AnonymousClass7K2
            if (r3 == 0) goto L_0x00c9
            X.7K2 r7 = (X.AnonymousClass7K2) r7
            X.0sa r3 = r7.A01
            goto L_0x00c3
        L_0x0117:
            int r3 = X.0Yv.A1E(r5, r2)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r3)
            java.util.Iterator r12 = r5.iterator()
        L_0x0124:
            boolean r3 = r12.hasNext()
            if (r3 == 0) goto L_0x0171
            java.lang.Object r4 = r12.next()
            X.Drb r4 = (X.C47160Drb) r4
            X.7IM r11 = r0.A03
            X.7JT r10 = r4.A02
            X.7JU r3 = X.AnonymousClass7JU.OVERFLOW
            r11.A00(r3, r10, r6)
            int r3 = r4.A01
            java.lang.String r19 = r1.getString(r3)
            X.0qQ.A07(r19)
            r14 = 0
            int r3 = r4.A00
            android.graphics.drawable.Drawable r15 = r1.getDrawable(r3)
            X.FcQ r3 = new X.FcQ
            r3.<init>(r4)
            X.8rI r13 = new X.8rI
            r16 = r14
            r18 = r14
            r20 = r8
            r21 = r8
            r22 = r8
            r23 = r8
            r24 = r8
            r25 = r8
            r26 = r6
            r27 = r8
            r28 = r8
            r29 = r8
            r17 = r3
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r7.add(r13)
            goto L_0x0124
        L_0x0171:
            java.util.Iterator r13 = r5.iterator()
        L_0x0175:
            boolean r3 = r13.hasNext()
            if (r3 == 0) goto L_0x0257
            java.lang.Object r3 = r13.next()
            X.Drb r3 = (X.C47160Drb) r3
            X.7Jt r12 = r3.A03
            boolean r3 = r12 instanceof X.AnonymousClass7K1
            if (r3 == 0) goto L_0x0193
            X.7K1 r12 = (X.AnonymousClass7K1) r12
            com.instagram.common.session.UserSession r8 = r12.A01
            java.lang.String r4 = r12.A02
            X.KkW r3 = X.C62670KkW.FILE_ENTRYPOINT_IMPRESSION
            X.O01.A00(r3, r8, r4)
            goto L_0x0175
        L_0x0193:
            boolean r3 = r12 instanceof X.AnonymousClass7KC
            if (r3 == 0) goto L_0x01ba
            X.7KC r12 = (X.AnonymousClass7KC) r12
            com.instagram.common.session.UserSession r4 = r12.A02
            X.0iw r3 = r12.A01
            X.0wc r8 = X.AnonymousClass0kN.A01(r3, r4)
            java.lang.String r4 = "shops_product_picker_waterfall"
            X.0kJ r3 = r8.A00
            X.0Aj r11 = r8.A00(r3, r4)
            boolean r3 = r11.isSampled()
            if (r3 == 0) goto L_0x0175
            java.lang.String r4 = "shops_product_picker_entrypoint_seen"
            java.lang.String r3 = "action"
            r11.AAJ(r3, r4)
        L_0x01b6:
            r11.Cgf()
            goto L_0x0175
        L_0x01ba:
            boolean r3 = r12 instanceof X.AnonymousClass7KB
            if (r3 == 0) goto L_0x01ff
            X.7KB r12 = (X.AnonymousClass7KB) r12
            X.0sa r3 = r12.A03
            java.lang.Object r8 = r3.invoke()
            X.2Er r8 = (X.2Er) r8
            com.instagram.common.session.UserSession r4 = r12.A02
            X.0iw r3 = r12.A01
            X.0wc r11 = X.AnonymousClass0kN.A01(r3, r4)
            java.lang.String r10 = r4.A06
            if (r8 == 0) goto L_0x01fd
            java.lang.String r8 = r8.BZP()
        L_0x01d8:
            java.lang.String r4 = "biig_order_management_composer_entrypoint_impression"
            X.0kJ r3 = r11.A00
            X.0Aj r11 = r11.A00(r3, r4)
            boolean r3 = r11.isSampled()
            if (r3 == 0) goto L_0x0175
            java.lang.Long r4 = X.00y.A0n(r2, r10)
            java.lang.String r3 = "business_igid"
            r11.A9F(r3, r4)
            if (r8 == 0) goto L_0x01fb
            java.lang.Long r4 = X.00y.A0n(r2, r8)
        L_0x01f5:
            java.lang.String r3 = "consumer_igid"
            r11.A9F(r3, r4)
            goto L_0x01b6
        L_0x01fb:
            r4 = 0
            goto L_0x01f5
        L_0x01fd:
            r8 = 0
            goto L_0x01d8
        L_0x01ff:
            boolean r3 = r12 instanceof X.AnonymousClass7KT
            if (r3 == 0) goto L_0x022f
            X.7KT r12 = (X.AnonymousClass7KT) r12
            X.0sa r3 = r12.A03
            java.lang.Object r4 = r3.invoke()
            X.2Er r4 = (X.2Er) r4
            X.7I3 r14 = r12.A01
            com.instagram.common.session.UserSession r3 = r12.A00
            java.lang.String r15 = X.C3262475z.A00(r3)
            if (r4 == 0) goto L_0x022c
            boolean r19 = r4.CUG()
            java.lang.String r16 = r4.C6C()
            if (r16 != 0) goto L_0x0223
        L_0x0221:
            java.lang.String r16 = ""
        L_0x0223:
            r17 = r6
            r18 = r6
            r14.A0E(r15, r16, r17, r18, r19)
            goto L_0x0175
        L_0x022c:
            r19 = 0
            goto L_0x0221
        L_0x022f:
            boolean r3 = r12 instanceof X.AnonymousClass7K6
            if (r3 == 0) goto L_0x0175
            X.7K6 r12 = (X.AnonymousClass7K6) r12
            X.0sa r3 = r12.A08
            java.lang.Object r11 = r3.invoke()
            X.2Er r11 = (X.2Er) r11
            com.instagram.common.session.UserSession r10 = r12.A04
            X.0Tu r8 = X.0Tu.A05
            r3 = 36322048796010411(0x810ab6000027ab, double:3.033548143523514E-306)
            X.182.A06(r8, r10, r3)
            X.0sa r3 = r12.A07
            java.lang.Object r4 = r3.invoke()
            X.7IV r4 = (X.AnonymousClass7IV) r4
            r3 = 0
            r4.A01(r11, r3)
            goto L_0x0175
        L_0x0257:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r3 = r5.iterator()
        L_0x0260:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x0274
            java.lang.Object r2 = r3.next()
            X.Drb r2 = (X.C47160Drb) r2
            java.lang.String r2 = r2.A05
            if (r2 == 0) goto L_0x0260
            r6.add(r2)
            goto L_0x0260
        L_0x0274:
            com.instagram.model.direct.DirectThreadKey r2 = r0.A01()
            if (r2 == 0) goto L_0x02b8
            java.util.List r5 = r2.A02
            if (r5 == 0) goto L_0x02b8
            java.lang.String r8 = r2.A00
            if (r8 == 0) goto L_0x02b8
            com.instagram.common.session.UserSession r3 = r0.A01
            X.0iw r2 = r0.A00
            X.0wc r4 = X.AnonymousClass0kN.A01(r2, r3)
            java.lang.String r3 = "direct_composer_business_tools"
            X.0kJ r2 = r4.A00
            X.0Aj r4 = r4.A00(r2, r3)
            boolean r2 = r4.isSampled()
            if (r2 == 0) goto L_0x02b8
            java.lang.String r3 = "impression"
            java.lang.String r2 = "action"
            r4.AAJ(r2, r3)
            java.lang.String r2 = "thread_id"
            r4.AAJ(r2, r8)
            java.lang.String r2 = "recipient_ids"
            r4.AAe(r2, r5)
            java.lang.String r3 = "business_tools_icon"
            java.lang.String r2 = "entry_point"
            r4.AAJ(r2, r3)
            java.lang.String r2 = "business_tools_enabled"
            r4.AAe(r2, r6)
            r4.Cgf()
        L_0x02b8:
            com.instagram.common.session.UserSession r3 = r0.A01
            r2 = 0
            X.8Ov r0 = new X.8Ov
            r0.<init>(r1, r3, r2, r9)
            r0.A02(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7KW.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
