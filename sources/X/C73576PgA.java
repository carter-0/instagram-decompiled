package X;

/* renamed from: X.PgA  reason: case insensitive filesystem */
public final class C73576PgA extends 0Yk implements 0sJ {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C73576PgA(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            java.lang.Class<X.PA3> r3 = X.PA3.class
            r1 = 4
            switch(r9) {
                case 0: goto L_0x0013;
                case 1: goto L_0x0013;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.String r4 = "maybeShowUnsendMessageDialog"
            java.lang.String r5 = "maybeShowUnsendMessageDialog(Lcom/instagram/model/direct/threadkey/intf/UnifiedThreadKey;Lcom/instagram/direct/send/UnsendMessage;Landroid/view/View;Lcom/instagram/direct/messagethread/commondecorations/gesture/model/CommonViewModelFieldsForGestureDetection;Lkotlin/jvm/functions/Function0;)Z"
        L_0x000d:
            r6 = 0
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L_0x0013:
            java.lang.String r4 = "maybeShowAdminRemoveMessageDialog"
            java.lang.String r5 = "maybeShowAdminRemoveMessageDialog(Lcom/instagram/model/direct/threadkey/intf/UnifiedThreadKey;Lcom/instagram/direct/send/UnsendMessage;Landroid/view/View;Lcom/instagram/direct/messagethread/commondecorations/gesture/model/CommonViewModelFieldsForGestureDetection;Lkotlin/jvm/functions/Function0;)Z"
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73576PgA.<init>(java.lang.Object, int):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x012c, code lost:
        if (r2 != true) goto L_0x012e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r23, java.lang.Object r24, java.lang.Object r25, java.lang.Object r26) {
        /*
            r22 = this;
            r1 = r22
            r15 = r25
            r12 = r24
            r13 = r23
            int r0 = r1.A00
            X.3sy r13 = (X.C254743sy) r13
            X.Npq r12 = (X.C69668Npq) r12
            switch(r0) {
                case 0: goto L_0x01d0;
                case 1: goto L_0x01d0;
                default: goto L_0x0011;
            }
        L_0x0011:
            android.view.View r15 = (android.view.View) r15
            X.AnonymousClass7TG.A1N(r13, r12)
            java.lang.Object r11 = r1.receiver
            X.PA3 r11 = (X.PA3) r11
            X.OT9 r2 = r11.A03
            com.instagram.common.session.UserSession r10 = r11.A01
            java.lang.String r1 = r12.A00()
            java.lang.String r0 = "DirectUnsendMessageInteractor"
            r9 = 0
            X.3su r19 = X.OT9.A00(r2, r1, r0, r9)
            X.0xa r0 = X.AnonymousClass7TE.A0q(r10)
            java.lang.String r5 = "seen_direct_unseen_message_with_forwaring_dialog"
            boolean r0 = r0.getBoolean(r5, r9)
            r8 = 1
            if (r0 == 0) goto L_0x010d
            if (r19 == 0) goto L_0x0232
            r7 = 2
            boolean r0 = r12 instanceof X.C68965Nbs
            if (r0 == 0) goto L_0x0232
            X.2Dm r0 = X.1bJ.A00(r10)
            X.3U9 r3 = X.C66647MaG.A02(r0, r13)
            if (r3 == 0) goto L_0x0232
            int r2 = r3.C6a()
            boolean r1 = r3.isPending()
            boolean r0 = r3.Car()
            boolean r0 = X.AnonymousClass7BC.A00(r2, r8, r1, r0, r9)
            if (r0 == 0) goto L_0x0232
            boolean r0 = r3.Axj()
            if (r0 != 0) goto L_0x0232
            r6 = r12
            X.Nbs r6 = (X.C68965Nbs) r6
            X.3su r5 = r6.A00
            boolean r0 = X.AnonymousClass7BC.A01(r5)
            if (r0 == 0) goto L_0x0232
            boolean r0 = r5.A1T()
            if (r0 != 0) goto L_0x0232
            int r0 = r5.A01
            if (r0 > 0) goto L_0x0232
            X.4kA r1 = X.AnonymousClass4k9.A00(r10)
            X.0s0 r0 = r1.A0D
            X.0YZ[] r4 = X.AnonymousClass4kA.A0c
            r3 = 26
            int r0 = X.DbY.A03(r1, r0, r4, r3)
            if (r0 >= r7) goto L_0x0232
            X.7IS r2 = new X.7IS
            r2.<init>(r10)
            android.app.Activity r14 = r11.A00
            X.8ab r1 = X.DbS.A0X(r14)
            r0 = 2131959198(0x7f131d9e, float:1.955503E38)
            r1.A09(r0)
            r0 = 2131959197(0x7f131d9d, float:1.9555028E38)
            r1.A08(r0)
            r0 = 2131237570(0x7f081ac2, float:1.8091394E38)
            X.DbU.A16(r14, r1, r0)
            r0 = 2131975560(0x7f135d88, float:1.9588216E38)
            X.FJe r14 = new X.FJe
            r21 = r6
            r20 = r2
            r18 = r11
            r17 = r13
            r16 = r15
            r15 = r7
            r14.<init>((int) r15, (java.lang.Object) r16, (java.lang.Object) r17, (java.lang.Object) r18, (java.lang.Object) r19, (java.lang.Object) r20, (java.lang.Object) r21)
            r1.A0J(r14, r0)
            r7 = 2131960643(0x7f132343, float:1.955796E38)
            X.DE5 r6 = new X.DE5
            r6.<init>(r8, r12, r13, r11)
            X.8ae r0 = X.C358278ae.RED_BOLD
            r1.A0P(r6, r0, r7)
            r1.A0r(r8)
            X.DbT.A1V(r1)
            java.lang.String r5 = r5.A0h()
            X.0wc r1 = r2.A00
            r0 = 264(0x108, float:3.7E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x00fe
            java.lang.String r0 = "unsend_upsell_shown"
            X.DbS.A1J(r2, r0)
            X.2FW r0 = X.2FW.A1g
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "message_type"
            r2.AAJ(r0, r1)
            java.lang.String r0 = "message_id"
            r2.AAJ(r0, r5)
            X.C66581MXm.A1H(r2, r9)
            X.C67003Mgb.A02(r2, r13)
            r2.Cgf()
        L_0x00fe:
            X.4kA r1 = X.AnonymousClass4k9.A00(r10)
            X.0s0 r0 = r1.A0D
            X.DbZ.A1b(r1, r0, r4, r3)
        L_0x0107:
            r1 = 1
        L_0x0108:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L_0x010d:
            r7 = 2131960657(0x7f132351, float:1.9557989E38)
            android.app.Activity r6 = r11.A00
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131960656(0x7f132350, float:1.9557987E38)
            java.lang.String r1 = X.AnonymousClass7TF.A0d(r1, r0)
            X.0eK r0 = r11.A06
            X.7S7 r0 = X.C66582MXn.A0d(r0)
            X.3Te r0 = r0.BiC()
            if (r0 == 0) goto L_0x012e
            boolean r2 = r0.A0S
            r0 = 1
            if (r2 == r8) goto L_0x012f
        L_0x012e:
            r0 = 0
        L_0x012f:
            r4 = 2
            if (r0 == 0) goto L_0x0143
            boolean r0 = X.AnonymousClass7K4.A03(r10, r9)
            if (r0 == 0) goto L_0x0143
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131960655(0x7f13234f, float:1.9557985E38)
            java.lang.String r1 = r1.getString(r0)
        L_0x0143:
            boolean r0 = r12 instanceof X.C68964Nbr
            if (r0 != 0) goto L_0x018c
            r2 = r12
            X.Nbs r2 = (X.C68965Nbs) r2
            X.3su r0 = r2.A00
            X.1Xj r0 = r0.A0s
            if (r0 == 0) goto L_0x018c
            X.1Xy r0 = r0.A0C
            java.util.List r0 = r0.Br5()
            if (r0 == 0) goto L_0x018c
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x018c
            X.1iA r0 = r2.A02
            if (r0 != 0) goto L_0x01cb
            r0 = -1
        L_0x0163:
            java.lang.String r3 = "%s\n\n%s"
            if (r0 == r9) goto L_0x01be
            if (r0 != r8) goto L_0x018c
            r7 = 2131960668(0x7f13235c, float:1.9558011E38)
            java.lang.Object[] r2 = new java.lang.Object[r4]
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131960667(0x7f13235b, float:1.955801E38)
        L_0x0175:
            java.lang.String r0 = r1.getString(r0)
            r2[r9] = r0
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131960666(0x7f13235a, float:1.9558007E38)
            java.lang.String r0 = r1.getString(r0)
            r2[r8] = r0
            java.lang.String r1 = X.JTR.A14(r3, r2, r4)
        L_0x018c:
            X.8ab r2 = X.DbS.A0X(r6)
            r2.A09(r7)
            r2.A0q(r1)
            r1 = 2131960643(0x7f132343, float:1.955796E38)
            X.DE5 r0 = new X.DE5
            r0.<init>(r4, r12, r13, r11)
            r2.A0K(r0, r1)
            X.Ofz r0 = X.C71234Ofz.A00
            r2.A0C(r0)
            X.AnonymousClass7TH.A0a(r2, r8)
            X.0xa r0 = X.AnonymousClass7TE.A0q(r10)
            X.DbX.A1V(r0, r5, r8)
            X.0xY r1 = X.AnonymousClass7TF.A0N(r10)
            java.lang.String r0 = "seen_direct_unseen_message_dialog"
            r1.E5T(r0, r8)
            r1.apply()
            goto L_0x0107
        L_0x01be:
            r7 = 2131960659(0x7f132353, float:1.9557993E38)
            java.lang.Object[] r2 = new java.lang.Object[r4]
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131960658(0x7f132352, float:1.955799E38)
            goto L_0x0175
        L_0x01cb:
            int r0 = r0.ordinal()
            goto L_0x0163
        L_0x01d0:
            X.AnonymousClass7TG.A1N(r13, r12)
            java.lang.Object r7 = r1.receiver
            X.PA3 r7 = (X.PA3) r7
            com.instagram.common.session.UserSession r4 = r7.A01
            X.0xa r0 = X.AnonymousClass7TE.A0q(r4)
            java.lang.String r3 = "seen_direct_admin_remove_message_confirmation_dialog"
            r6 = 0
            boolean r0 = r0.getBoolean(r3, r6)
            if (r0 != 0) goto L_0x0232
            android.app.Activity r0 = r7.A00
            X.8ab r5 = X.DbS.A0X(r0)
            r0 = 2131958582(0x7f131b36, float:1.955378E38)
            r5.A09(r0)
            r0 = 2131958581(0x7f131b35, float:1.9553778E38)
            r5.A08(r0)
            r2 = 2131971974(0x7f134f86, float:1.9580942E38)
            r1 = 5
            X.Of3 r0 = new X.Of3
            r0.<init>(r1, r13, r7, r12)
            r5.A0K(r0, r2)
            X.Ofy r0 = X.C71233Ofy.A00
            r5.A0C(r0)
            r1 = 1
            X.AnonymousClass7TH.A0a(r5, r1)
            X.OyE r5 = r7.A05
            java.lang.String r9 = r12.A00()
            X.0qQ.A0B(r9, r6)
            java.lang.String r0 = "message_id"
            java.util.Map r10 = X.AnonymousClass7TF.A0w(r0, r9)
            java.lang.String r6 = "remove_message_confirmation"
            java.lang.String r7 = "tap"
            r0 = 3255(0xcb7, float:4.561E-42)
            java.lang.String r8 = X.C273654mx.A00(r0)
            X.C72194OyE.A00(r5, r6, r7, r8, r9, r10)
            X.0xa r0 = X.AnonymousClass7TE.A0q(r4)
            X.DbX.A1V(r0, r3, r1)
            goto L_0x0108
        L_0x0232:
            r1 = 0
            goto L_0x0108
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73576PgA.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
