package X;

/* renamed from: X.SdZ  reason: case insensitive filesystem */
public final class C11631SdZ implements AnonymousClass2gO {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    public C11631SdZ(int i, Object obj, boolean z) {
        this.A00 = i;
        this.A02 = z;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r15v1, types: [X.RwX, X.QgW] */
    /* JADX WARNING: type inference failed for: r8v5, types: [X.RwX, X.QgW] */
    /* JADX WARNING: type inference failed for: r0v73, types: [X.7kX, java.lang.Object, X.804] */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01a3, code lost:
        if (r3 != r22) goto L_0x01a5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onChanged(java.lang.Object r30) {
        /*
            r29 = this;
            r4 = r29
            r6 = r30
            int r0 = r4.A00
            if (r0 == 0) goto L_0x0023
            boolean r0 = X.AnonymousClass7TE.A1a(r6)
            if (r0 == 0) goto L_0x0022
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x0022
            java.lang.Object r2 = r4.A01
            X.Ab8 r2 = (X.C40375Ab8) r2
            X.7kW r1 = X.C339997kW.A04
            X.7kX r0 = new X.7kX
            r0.<init>()
            r0.A00 = r1
            r2.A01(r0)
        L_0x0022:
            return
        L_0x0023:
            X.SUj r6 = (X.SUj) r6
            r2 = 0
            X.0qQ.A0B(r6, r2)
            boolean r9 = r4.A02
            r8 = 1
            r12 = r9 ^ 1
            java.lang.Object r5 = r6.A01
            X.3lr r5 = (X.C250663lr) r5
            r15 = 0
            if (r5 == 0) goto L_0x0070
            java.lang.Class<X.QU5> r3 = X.QU5.class
            java.lang.String r1 = "xfb_business_payments_notification_hub(interface_type:$interface_type,view_name:$view_name)"
            r0 = 853919841(0x32e5c861, float:2.675023E-8)
            X.3lr r5 = r5.getOptionalTreeField(r2, r1, r3, r0)
            if (r5 == 0) goto L_0x0070
            java.lang.Class<X.QU4> r3 = X.QU4.class
            java.lang.String r1 = "notifications(fe_id:$fe_id,filter_notifications_for_subtypes:$subtypes_to_filter,session_id:$session_id)"
            r0 = 32023448(0x1e8a398, float:8.5458086E-38)
            com.google.common.collect.ImmutableList r0 = r5.getRequiredCompactedTreeListField(r2, r1, r3, r0)
            if (r0 == 0) goto L_0x0070
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r7 = r0.iterator()
        L_0x0059:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0071
            X.3lr r5 = X.C41845B3m.A0V(r7)
            java.lang.Class<X.QXT> r1 = X.QXT.class
            r0 = -476136082(0xffffffffe39ebd6e, float:-5.856471E21)
            X.3lr r0 = r5.reinterpretRequired(r2, r1, r0)
            r3.add(r0)
            goto L_0x0059
        L_0x0070:
            r3 = r15
        L_0x0071:
            boolean r0 = X.SUj.A0V(r6)
            if (r0 == 0) goto L_0x0103
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            if (r3 == 0) goto L_0x00b2
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r11 = r3.iterator()
        L_0x0085:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00b4
            java.lang.Object r10 = r11.next()
            X.QXT r10 = (X.QXT) r10
            X.RGh r5 = r10.A0E()
            X.RGh r0 = X.C8939RGh.PAYOUT_HOLD
            if (r5 != r0) goto L_0x00a5
            java.lang.String r0 = "notification_identifier"
            java.lang.String r0 = r10.getOptionalStringField(r8, r0)
            if (r0 == 0) goto L_0x00a5
            r1.add(r0)
        L_0x00a5:
            java.lang.String r0 = "notification_identifier"
            java.lang.String r0 = r10.getOptionalStringField(r8, r0)
            if (r0 == 0) goto L_0x0085
            r7.add(r0)
            goto L_0x0085
        L_0x00b2:
            X.0sn r7 = X.0sn.A00
        L_0x00b4:
            java.lang.Object r13 = r4.A01
            X.QDO r13 = (X.QDO) r13
            boolean r0 = X.AnonymousClass7TF.A1V(r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r13.A00 = r0
            java.lang.String r14 = "client_fetch_payouthub_success"
            java.lang.String r23 = "BSC_CLIENT_FETCH_NOTIFICATIONS"
            r16 = r15
            r17 = r15
            r18 = r15
            r19 = r15
            r20 = r15
            r21 = r15
            r22 = r15
            r24 = r15
            r25 = r7
            r26 = r1
            X.QDO.A00(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.String r5 = "fetch_success"
            X.AnonymousClass2E0.A02()
            r1 = 667758647(0x27cd3037, float:5.6951205E-15)
            X.0sm r0 = X.0Yt.A0E()
            X.SQ2.A00(r1, r2, r5, r0)
            if (r9 == 0) goto L_0x00ff
            java.util.List r0 = r13.A01
            boolean r0 = X.0qQ.A0K(r7, r0)
            if (r0 == 0) goto L_0x0100
            r13.A00 = r15
            r0 = 2
            X.AnonymousClass2E0.A02()
            X.SQ2.A02(r1, r2, r0)
        L_0x00ff:
            r8 = r12
        L_0x0100:
            r13.A01 = r7
            r12 = r8
        L_0x0103:
            boolean r0 = X.SUj.A0S(r6)
            if (r0 == 0) goto L_0x0152
            java.lang.Throwable r0 = r6.A02
            if (r0 == 0) goto L_0x0309
            java.lang.String r22 = r0.getMessage()
            java.lang.String r23 = X.2Og.A00(r0)
            java.lang.Class r0 = r0.getClass()
            if (r0 == 0) goto L_0x011f
            java.lang.String r15 = r0.getSimpleName()
        L_0x011f:
            java.lang.Object r6 = r4.A01
            X.QDO r6 = (X.QDO) r6
            r17 = 0
            java.lang.String r16 = "client_fetch_payouthub_fail"
            java.lang.String r25 = "BSC_CLIENT_FETCH_NOTIFICATIONS"
            r18 = r17
            r19 = r17
            r20 = r17
            r21 = r17
            r24 = r15
            r26 = r17
            r27 = r17
            r28 = r17
            r15 = r6
            X.QDO.A00(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            java.lang.String r5 = "fetch_fail"
            X.AnonymousClass2E0.A02()
            r1 = 667758647(0x27cd3037, float:5.6951205E-15)
            X.0sm r0 = X.0Yt.A0E()
            X.SQ2.A00(r1, r2, r5, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r6.A00 = r0
        L_0x0152:
            if (r12 == 0) goto L_0x0022
            java.lang.Object r5 = r4.A01
            X.QDO r5 = (X.QDO) r5
            X.2gB r0 = r5.A07
            r23 = r0
            X.C11426STk.A04()
            X.C11426STk.A04()
            if (r3 == 0) goto L_0x030f
            int r22 = X.Pxe.A0A(r3)
            java.lang.Integer r21 = java.lang.Integer.valueOf(r22)
            r20 = 10
            java.util.ArrayList r1 = X.AnonymousClass7TF.A0p(r3)
            java.util.Iterator r19 = r3.iterator()
            r3 = 0
        L_0x0177:
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L_0x0311
            java.lang.Object r9 = r19.next()
            int r18 = r3 + 1
            if (r3 >= 0) goto L_0x018d
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x018d:
            X.3lr r9 = (X.C250663lr) r9
            r10 = 1
            java.lang.String r0 = "notification_identifier"
            java.lang.String r6 = r9.getOptionalStringField(r10, r0)
            if (r6 != 0) goto L_0x019d
            java.lang.String r6 = X.C51972G9s.A0n()
        L_0x019d:
            if (r21 == 0) goto L_0x01a5
            r17 = 1
            r0 = r22
            if (r3 == r0) goto L_0x01a7
        L_0x01a5:
            r17 = 0
        L_0x01a7:
            java.lang.String r13 = "header_content"
            java.lang.String r0 = r9.A0A(r13)
            X.StR r11 = X.C12401StR.A01(r0)
            X.IwS r3 = new X.IwS
            r0 = r20
            r3.<init>(r9, r5, r6, r0)
            X.SR4 r4 = new X.SR4
            r4.<init>(r3)
            r16 = 34
            X.Qgk r7 = X.C8092Qgk.A00(r16)
            X.QgW r15 = new X.QgW
            r15.<init>()
            java.lang.Class<X.QU3> r12 = X.QU3.class
            r8 = 7
            java.lang.String r3 = "icon"
            r0 = 944074579(0x38456f53, float:4.707214E-5)
            X.3lr r8 = r9.getOptionalTreeField(r8, r3, r12, r0)
            if (r8 == 0) goto L_0x0306
            java.lang.Class<X.QU7> r3 = X.QU7.class
            r0 = -1597880601(0xffffffffa0c246e7, float:-3.2911798E-19)
            X.3lr r3 = r8.reinterpretRequired(r2, r3, r0)
            if (r3 == 0) goto L_0x0306
            java.lang.String r0 = "uri"
            java.lang.String r3 = r3.A0A(r0)
        L_0x01e8:
            r12 = 0
            X.Ssk r0 = new X.Ssk
            r0.<init>(r3, r12, r2, r10)
            r15.A02 = r0
            r0 = 23
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)
            r8 = 2131231338(0x7f08026a, float:1.8078754E38)
            r3 = 2131165237(0x7f070035, float:1.7944685E38)
            X.Ssl r0 = new X.Ssl
            r0.<init>(r12, r14, r8, r3)
            r15.A00 = r0
            X.QgY r8 = X.SIE.A02(r15, r7)
            java.lang.String r0 = r9.A0A(r13)
            if (r0 == 0) goto L_0x0227
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0227
            X.RH2 r0 = X.RH2.PRIMARY_TEXT
            X.SST.A02(r11, r8, r0)
            X.SRP r3 = X.SRP.A00()
            r3.A05 = r10
            r3.A01 = r11
            X.SO0 r0 = new X.SO0
            r0.<init>(r3)
            r8.A06 = r0
        L_0x0227:
            java.lang.String r0 = "body_content"
            java.lang.String r0 = r9.A0B(r0)
            X.StR r3 = X.C12401StR.A01(r0)
            X.RH2 r0 = X.RH2.A0Z
            X.SST.A03(r3, r8, r0)
            java.lang.Class<X.QU2> r13 = X.QU2.class
            r11 = 6
            java.lang.String r3 = "action"
            r0 = -720091827(0xffffffffd514454d, float:-1.01890853E13)
            X.3lr r0 = r9.getOptionalTreeField(r11, r3, r13, r0)
            if (r0 == 0) goto L_0x0272
            java.lang.String r0 = "button_content"
            java.lang.String r0 = r9.A0C(r0)
            X.StR r11 = X.C12401StR.A01(r0)
            X.RH2 r3 = X.RH2.A17
            X.SST r0 = new X.SST
            r0.<init>(r12, r11, r3)
            r8.A03 = r0
            r0 = r16
            X.SbM r0 = X.C11499SbM.A00(r9, r5, r0)
            r8.A00 = r0
            X.SRP r3 = X.SRP.A00()
            r3.A01 = r11
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r3.A02 = r0
            r3.A04 = r10
            X.SO0 r0 = new X.SO0
            r0.<init>(r3)
            r8.A05 = r0
        L_0x0272:
            X.C8086Qge.A00(r7, r8, r10)
            if (r17 != 0) goto L_0x02d5
            X.QgW r8 = new X.QgW
            r8.<init>()
            java.lang.Integer r13 = X.C66580MXl.A0q()
            r0 = 22
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            X.Ssm r0 = new X.Ssm
            r0.<init>(r13, r12, r11, r3)
            r8.A02 = r0
            X.Sb9 r0 = new X.Sb9
            r0.<init>(r9, r5, r6, r10)
            r8.A00 = r0
            X.SRP r9 = X.SRP.A00()
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r9.A02 = r0
            r9.A04 = r10
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r0 = 2131956166(0x7f1311c6, float:1.954888E38)
            X.SRP.A01(r9, r3, r0)
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r0 = 2131956203(0x7f1311eb, float:1.9548955E38)
            X.StQ r0 = X.C12400StQ.A00(r3, r0)
            r9.A00 = r0
            r0 = 2131437129(0x7f0b2649, float:1.8496148E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9.A03 = r0
            X.SO0.A00(r9, r8)
            r0 = 2131431934(0x7f0b11fe, float:1.8485611E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.A02 = r0
            X.Qga r0 = new X.Qga
            r0.<init>(r8)
            r7.A06 = r0
        L_0x02d5:
            r3 = 21
            X.TVy r0 = new X.TVy
            r0.<init>(r4, r3)
            r7.A04 = r0
            X.Qgq r4 = new X.Qgq
            r4.<init>(r7)
            X.Qgj r3 = new X.Qgj
            r3.<init>()
            X.0qQ.A0B(r4, r2)
            java.util.List r0 = r3.A00
            r0.add(r4)
            X.C11426STk.A05()
            r3.A03 = r6
            r0 = 2131437127(0x7f0b2647, float:1.8496144E38)
            r3.A00 = r0
            X.Qgo r0 = new X.Qgo
            r0.<init>(r3)
            r1.add(r0)
            r3 = r18
            goto L_0x0177
        L_0x0306:
            r3 = 0
            goto L_0x01e8
        L_0x0309:
            r22 = r15
            r23 = r15
            goto L_0x011f
        L_0x030f:
            X.0sn r1 = X.0sn.A00
        L_0x0311:
            r0 = r23
            r0.A0B(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11631SdZ.onChanged(java.lang.Object):void");
    }
}
