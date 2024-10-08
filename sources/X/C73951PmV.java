package X;

/* renamed from: X.PmV  reason: case insensitive filesystem */
public final class C73951PmV extends 0Yg implements 0sP {
    public final /* synthetic */ C71133OdW A00;
    public final /* synthetic */ C71087ObS A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ int[] A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73951PmV(C71133OdW odW, C71087ObS obS, int[] iArr, boolean z, boolean z2) {
        super(1);
        this.A00 = odW;
        this.A04 = iArr;
        this.A02 = z;
        this.A01 = obS;
        this.A03 = z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01e2, code lost:
        if (r7 == X.C69404Nki.BACKUP_CREATED) goto L_0x01e4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r31) {
        /*
            r30 = this;
            r7 = r31
            X.ONR r7 = (X.ONR) r7
            r4 = r30
            X.OdW r3 = r4.A00
            int[] r2 = r4.A04
            if (r7 != 0) goto L_0x002c
            java.lang.String r0 = "FETCH_BACKUP_STATUS_GRAPHQL_REQUEST_FAIL"
            X.C71133OdW.A04(r3, r0, r2)
            java.lang.String r1 = "backup_state"
            java.lang.String r0 = "FETCH_BACKUP_STATUS_ERROR"
            X.C71133OdW.A03(r3, r1, r0, r2)
            boolean r1 = r4.A02
            java.lang.String r0 = "EMPTY_GRAPHQL_RESPONSE"
            X.C71133OdW.A05(r3, r0, r2, r1)
            X.ObS r1 = r4.A01
            X.NnJ r0 = new X.NnJ
            r0.<init>()
        L_0x0026:
            X.N0J.A01(r1, r0)
        L_0x0029:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x002c:
            java.lang.String r0 = "FETCH_BACKUP_STATUS_GRAPHQL_REQUEST_SUCCESS"
            X.C71133OdW.A04(r3, r0, r2)
            X.BTG r11 = r7.A01
            r1 = 1
            if (r11 == 0) goto L_0x0280
            r5 = 0
            java.lang.String r0 = "is_eligible_for_encrypted_backups"
            boolean r0 = r11.getCoercedBooleanField(r5, r0)
            if (r0 != r1) goto L_0x0280
            boolean r0 = r4.A03
            r29 = r0
            X.ObS r8 = X.C71087ObS.A00()
            X.BTE r0 = r7.A00
            r20 = 0
            if (r0 == 0) goto L_0x0097
            java.lang.String r6 = "strong_id__"
            java.lang.String r6 = r0.getOptionalStringField(r5, r6)
            if (r6 == 0) goto L_0x0097
            java.lang.Long r19 = X.AnonymousClass7TE.A10(r6)
        L_0x0059:
            java.lang.Class<X.BTF> r10 = X.BTF.class
            java.lang.String r9 = "eb_third_party_ids(platforms:[\"ANDROID\",\"GOOGLE_DRIVE\",\"GOOGLE_ONE_AUTO_BACKUP\"])"
            r6 = 1546113609(0x5c27d249, float:1.88950128E17)
            com.google.common.collect.ImmutableList r6 = r11.getRequiredCompactedTreeListField(r1, r9, r10, r6)
            if (r6 != 0) goto L_0x0068
            X.0sn r6 = X.0sn.A00
        L_0x0068:
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r13 = r6.iterator()
        L_0x0070:
            boolean r6 = r13.hasNext()
            if (r6 == 0) goto L_0x009a
            X.3lr r10 = X.C41845B3m.A0V(r13)
            r6 = 0
            if (r10 == 0) goto L_0x0095
            X.Nkh r12 = X.C69403Nkh.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r9 = "platform"
            java.lang.Enum r9 = r10.getOptionalEnumField(r5, r9, r12)
        L_0x0085:
            java.lang.String r9 = java.lang.String.valueOf(r9)
            if (r10 == 0) goto L_0x0091
            java.lang.String r6 = "third_party_id"
            java.lang.String r6 = r10.getOptionalStringField(r1, r6)
        L_0x0091:
            X.AnonymousClass7TF.A1I(r9, r6, r11)
            goto L_0x0070
        L_0x0095:
            r9 = r6
            goto L_0x0085
        L_0x0097:
            r19 = r20
            goto L_0x0059
        L_0x009a:
            java.util.Map r18 = X.0Yt.A08(r11)
            if (r0 == 0) goto L_0x0177
            java.lang.Class<X.UPP> r11 = X.UPP.class
            r10 = 5
            java.lang.String r9 = "virtual_devices"
            r6 = -310726884(0xffffffffed7aaf1c, float:-4.8489342E27)
            com.google.common.collect.ImmutableList r6 = r0.getRequiredCompactedTreeListField(r10, r9, r11, r6)
            if (r6 == 0) goto L_0x0177
        L_0x00ae:
            r15 = 10
            java.util.ArrayList r13 = X.AnonymousClass7TF.A0p(r6)
            java.util.Iterator r17 = r6.iterator()
        L_0x00b8:
            boolean r6 = r17.hasNext()
            if (r6 == 0) goto L_0x017b
            X.3lr r6 = X.C41845B3m.A0V(r17)
            r14 = 8
            java.lang.String r10 = "virtual_device_id"
            r16 = 0
            if (r6 == 0) goto L_0x0173
            java.lang.String r9 = "client_generated_id"
            java.lang.String r9 = r6.getOptionalStringField(r1, r9)
        L_0x00d0:
            X.0eP r21 = X.AnonymousClass7TE.A1L(r10, r9)
            java.lang.String r12 = "virtual_device_type"
            if (r6 == 0) goto L_0x016f
            X.Nkq r11 = X.C69411Nkq.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r10 = 2
            java.lang.String r9 = "device_type"
            java.lang.Enum r9 = r6.getOptionalEnumField(r10, r9, r11)
        L_0x00e1:
            java.lang.String r9 = java.lang.String.valueOf(r9)
            X.0eP r22 = X.AnonymousClass7TE.A1L(r12, r9)
            r9 = 75
            java.lang.String r10 = X.AnonymousClass000.A00(r9)
            if (r6 == 0) goto L_0x016c
            r9 = 4
            long r11 = r6.getCoercedTimeField(r9, r10)
            java.lang.Long r9 = java.lang.Long.valueOf(r11)
        L_0x00fa:
            java.lang.String r9 = java.lang.String.valueOf(r9)
            X.0eP r23 = X.AnonymousClass7TE.A1L(r10, r9)
            r9 = 3
            java.lang.String r10 = "device_created_on"
            if (r6 == 0) goto L_0x0169
            java.lang.String r9 = r6.getOptionalStringField(r9, r10)
        L_0x010b:
            X.0eP r24 = X.AnonymousClass7TE.A1L(r10, r9)
            java.lang.String r9 = "cloud_service_account"
            if (r6 == 0) goto L_0x0166
            java.lang.String r10 = r6.A0C(r9)
        L_0x0117:
            X.0eP r25 = X.AnonymousClass7TE.A1L(r9, r10)
            java.lang.String r9 = "hsm_pin_normalization_status"
            if (r6 == 0) goto L_0x0163
            X.NkV r11 = X.C69391NkV.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r10 = 6
            java.lang.Enum r10 = r6.getOptionalEnumField(r10, r9, r11)
        L_0x0126:
            java.lang.String r10 = java.lang.String.valueOf(r10)
            X.0eP r26 = X.AnonymousClass7TE.A1L(r9, r10)
            java.lang.String r9 = "migration_status"
            if (r6 == 0) goto L_0x0160
            X.Nkd r11 = X.C69399Nkd.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r10 = 7
            java.lang.Enum r10 = r6.getOptionalEnumField(r10, r9, r11)
        L_0x0139:
            java.lang.String r10 = java.lang.String.valueOf(r10)
            X.0eP r27 = X.AnonymousClass7TE.A1L(r9, r10)
            java.lang.String r9 = "security_question_type"
            if (r6 == 0) goto L_0x014b
            X.Nkr r10 = X.C69412Nkr.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.Enum r16 = r6.getOptionalEnumField(r14, r9, r10)
        L_0x014b:
            java.lang.String r6 = java.lang.String.valueOf(r16)
            X.0eP r28 = X.AnonymousClass7TE.A1L(r9, r6)
            X.0eP[] r6 = new X.0eP[]{r21, r22, r23, r24, r25, r26, r27, r28}
            java.util.LinkedHashMap r6 = X.0Yt.A06(r6)
            r13.add(r6)
            goto L_0x00b8
        L_0x0160:
            r10 = r20
            goto L_0x0139
        L_0x0163:
            r10 = r20
            goto L_0x0126
        L_0x0166:
            r10 = r20
            goto L_0x0117
        L_0x0169:
            r9 = r20
            goto L_0x010b
        L_0x016c:
            r9 = r20
            goto L_0x00fa
        L_0x016f:
            r9 = r20
            goto L_0x00e1
        L_0x0173:
            r9 = r20
            goto L_0x00d0
        L_0x0177:
            X.0sn r6 = X.0sn.A00
            goto L_0x00ae
        L_0x017b:
            if (r0 == 0) goto L_0x01cb
            java.lang.Class<X.BTD> r11 = X.BTD.class
            r10 = 6
            java.lang.String r9 = "devices"
            r6 = -579547703(0xffffffffdd74cdc9, float:-1.10249852E18)
            X.3lr r11 = r0.getOptionalTreeField(r10, r9, r11, r6)
            if (r11 == 0) goto L_0x01cb
            java.lang.Class<X.BTC> r10 = X.BTC.class
            java.lang.String r9 = "edges"
            r6 = -1882817700(0xffffffff8fc67b5c, float:-1.9571824E-29)
            com.google.common.collect.ImmutableList r6 = r11.getRequiredCompactedTreeListField(r5, r9, r10, r6)
            if (r6 == 0) goto L_0x01cb
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r14 = r6.iterator()
        L_0x01a0:
            boolean r6 = r14.hasNext()
            if (r6 == 0) goto L_0x01cd
            X.3lr r12 = X.C41845B3m.A0V(r14)
            if (r12 == 0) goto L_0x01a0
            java.lang.Class<X.BTB> r10 = X.BTB.class
            java.lang.String r9 = "node"
            r6 = -303982686(0xffffffffede197a2, float:-8.72718E27)
            X.3lr r9 = r12.getOptionalTreeField(r5, r9, r10, r6)
            if (r9 == 0) goto L_0x01a0
            java.lang.String r6 = "strong_id__"
            java.lang.String r6 = r9.getOptionalStringField(r5, r6)
            if (r6 == 0) goto L_0x01a0
            java.lang.Long r6 = X.DbV.A0q(r6)
            if (r6 == 0) goto L_0x01a0
            r11.add(r6)
            goto L_0x01a0
        L_0x01cb:
            X.0sn r11 = X.0sn.A00
        L_0x01cd:
            if (r0 != 0) goto L_0x0265
            X.BTH r9 = r7.A02
            if (r9 == 0) goto L_0x0261
            X.Nki r7 = X.C69404Nki.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r6 = "onboarding_decision"
            java.lang.Enum r7 = r9.getOptionalEnumField(r5, r6, r7)
        L_0x01db:
            X.Nki r5 = X.C69404Nki.STORE_ON_DEVICE_ONLY
            if (r7 == r5) goto L_0x01e4
            X.Nki r5 = X.C69404Nki.BACKUP_CREATED
            r6 = 0
            if (r7 != r5) goto L_0x01e5
        L_0x01e4:
            r6 = 1
        L_0x01e5:
            r25 = 0
        L_0x01e7:
            X.OFl r7 = r3.A00
            r7.A04 = r6
            r7.A01 = r13
            r7.A00 = r11
            r5 = r18
            r7.A02 = r5
            if (r0 == 0) goto L_0x01fb
            r9 = 4
            java.lang.String r5 = "is_android_auto_restore_opted_out"
            r0.getCoercedBooleanField(r9, r5)
        L_0x01fb:
            if (r19 != 0) goto L_0x023f
            X.Njg r9 = X.C69341Njg.NO_BACKUPS_PRESENT
            java.lang.String r5 = r9.name()
            java.lang.String r0 = "backup_state"
            X.C71133OdW.A03(r3, r0, r5, r2)
            r7.A03 = r1
            r8.A05(r9)
        L_0x020d:
            X.NAX r7 = r3.A02
            X.OpS r0 = X.C71708OpS.A00
            X.68L r5 = X.C66581MXm.A0I(r7)
            com.facebook.msys.mca.MailboxFutureImpl r1 = X.C66581MXm.A0J(r5, r0)
            X.OpK r0 = new X.OpK
            r21 = r13
            r22 = r11
            r23 = r18
            r24 = r6
            r26 = r29
            r17 = r7
            r18 = r1
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            X.C66582MXn.A1E(r5, r0, r1)
            boolean r5 = r4.A02
            X.ObS r1 = r4.A01
            X.OmH r0 = new X.OmH
            r0.<init>(r3, r1, r2, r5)
            r8.A04(r0)
            goto L_0x0029
        L_0x023f:
            java.lang.String r0 = "FETCH_BACKUP_STATUS_READ_CLIENT_STATE_START"
            X.C71133OdW.A04(r3, r0, r2)
            X.NAX r9 = r3.A02
            X.OoW r0 = new X.OoW
            r0.<init>(r1, r3, r2, r8)
            X.68L r7 = X.C66581MXm.A0I(r9)
            com.facebook.msys.mca.MailboxFutureImpl r5 = X.C66581MXm.A0J(r7, r0)
            r1 = 9
            X.OoW r0 = new X.OoW
            r0.<init>(r1, r5, r11, r9)
            X.C66582MXn.A1E(r7, r0, r5)
            X.0qQ.A0A(r5)
            goto L_0x020d
        L_0x0261:
            r7 = r20
            goto L_0x01db
        L_0x0265:
            java.lang.String r5 = "is_user_opted_out"
            boolean r6 = r0.getCoercedBooleanField(r1, r5)
            r7 = 2
            java.lang.String r5 = "has_otc_eligible_devices(family_device_id:$family_device_id)"
            boolean r25 = r0.getCoercedBooleanField(r7, r5)
            java.lang.String r5 = "encryption_management_delegator_id"
            java.lang.String r5 = r0.A0A(r5)
            if (r5 == 0) goto L_0x01e7
            java.lang.Long r20 = X.00y.A0n(r15, r5)
            goto L_0x01e7
        L_0x0280:
            boolean r1 = r4.A02
            java.lang.String r0 = "USER_NOT_ALLOWED"
            X.C71133OdW.A05(r3, r0, r2, r1)
            X.ObS r1 = r4.A01
            com.encryptedbackups.statemanager.model.UserNotAllowedException r0 = new com.encryptedbackups.statemanager.model.UserNotAllowedException
            r0.<init>()
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73951PmV.invoke(java.lang.Object):java.lang.Object");
    }
}
