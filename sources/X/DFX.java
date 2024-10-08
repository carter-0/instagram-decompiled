package X;

public final class DFX implements AnonymousClass2Kv {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public DFX(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A00 = i;
        this.A03 = obj3;
        this.A01 = obj2;
        this.A02 = obj;
        this.A04 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01a3, code lost:
        if (r26 != null) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01a7, code lost:
        if (r26 != null) goto L_0x0156;
     */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0180  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(X.AnonymousClass3JD r26) {
        /*
            r25 = this;
            r3 = r25
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x0111;
                case 1: goto L_0x00f9;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r2 = r3.A03
            X.Hrd r2 = (X.C56031Hrd) r2
            java.lang.Object r5 = r3.A02
            X.0sa r5 = (X.C62320sa) r5
            java.lang.Object r10 = r3.A01
            X.0sP r10 = (X.0sP) r10
            java.lang.String r6 = r3.A04
            r8 = 0
            if (r26 == 0) goto L_0x00f5
            X.3lr r4 = X.C41845B3m.A0U(r26)
            if (r4 == 0) goto L_0x00f5
            java.lang.Class<com.instagram.schools.management.data.StartValidationMutationResponseImpl$XdtStartValidation> r3 = com.instagram.schools.management.data.StartValidationMutationResponseImpl.XdtStartValidation.class
            X.3sh r0 = X.C250663lr.Companion
            r1 = -865944271(0xffffffffcc62bd31, float:-5.9438276E7)
            r7 = 0
            java.lang.String r0 = "xdt_start_validation(input:$input)"
            X.3lr r4 = r4.getRequiredTreeField(r7, r0, r3, r1)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.schools.management.data.StartValidationMutationResponseImpl.XdtStartValidation"
            X.0qQ.A0C(r4, r0)
            if (r4 == 0) goto L_0x00f5
            X.HNJ r1 = X.HNJ.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r14 = 2
            java.lang.String r0 = "error"
            java.lang.Enum r0 = r4.getOptionalEnumField(r14, r0, r1)
            if (r0 == 0) goto L_0x0044
            if (r0 == r1) goto L_0x0044
        L_0x0040:
            r10.invoke(r0)
            return
        L_0x0044:
            java.lang.Class<com.instagram.schools.management.data.StartValidationMutationResponseImpl$XdtStartValidation$Schools> r3 = com.instagram.schools.management.data.StartValidationMutationResponseImpl.XdtStartValidation.Schools.class
            r1 = -140705577(0xfffffffff79d00d7, float:-6.36881E33)
            r11 = 1
            java.lang.String r0 = "schools"
            com.google.common.collect.ImmutableList r1 = r4.getOptionalCompactedTreeListField(r11, r0, r3, r1)
            if (r1 == 0) goto L_0x009a
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r16 = r1.iterator()
        L_0x005a:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x009c
            X.3lr r3 = X.C41845B3m.A0V(r16)
            java.lang.String r1 = "name"
            java.lang.String r13 = r3.getOptionalStringField(r11, r1)
            java.lang.String r1 = "id"
            java.lang.String r12 = r3.getOptionalStringField(r7, r1)
            java.lang.String r1 = "city"
            java.lang.String r15 = r3.getOptionalStringField(r14, r1)
            java.lang.String r1 = "state"
            java.lang.String r9 = r3.A0B(r1)
            java.lang.String r1 = "county"
            java.lang.String r1 = r3.A0A(r1)
            if (r13 == 0) goto L_0x005a
            if (r12 == 0) goto L_0x005a
            if (r15 == 0) goto L_0x005a
            if (r9 == 0) goto L_0x005a
            if (r1 == 0) goto L_0x005a
            com.instagram.schools.management.data.SchoolAddress r3 = new com.instagram.schools.management.data.SchoolAddress
            r3.<init>(r15, r9, r1)
            com.instagram.schools.management.data.SchoolInfo r1 = new com.instagram.schools.management.data.SchoolInfo
            r1.<init>(r3, r13, r12)
            r0.add(r1)
            goto L_0x005a
        L_0x009a:
            X.0sn r0 = X.0sn.A00
        L_0x009c:
            com.google.common.collect.ImmutableList r9 = X.O2U.A00(r0)
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x00f5
            int r0 = r9.size()
            if (r0 != r11) goto L_0x00ea
            java.lang.Object r0 = X.00k.A0O(r9, r7)
            com.instagram.schools.management.data.SchoolInfo r0 = (com.instagram.schools.management.data.SchoolInfo) r0
            if (r0 == 0) goto L_0x00b6
            java.lang.String r8 = r0.A01
        L_0x00b6:
            X.05G r3 = r2.A01
        L_0x00b8:
            java.lang.Object r2 = r3.getValue()
            r1 = r2
            X.GnQ r1 = (X.C53393GnQ) r1
            java.lang.String r0 = "affiliation_id"
            java.lang.String r18 = r4.getOptionalStringField(r7, r0)
            r10 = 0
            r23 = 130908(0x1ff5c, float:1.83441E-40)
            r11 = r10
            r12 = r10
            r13 = r10
            r14 = r10
            r15 = r1
            r16 = r10
            r17 = r10
            r19 = r6
            r20 = r8
            r21 = r10
            r22 = r10
            r24 = r7
            X.GnQ r0 = X.C53393GnQ.A00(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            boolean r0 = r3.AIY(r2, r0)
            if (r0 == 0) goto L_0x00b8
            r5.invoke()
            return
        L_0x00ea:
            X.05G r0 = r2.A01
            java.lang.Object r0 = r0.getValue()
            X.GnQ r0 = (X.C53393GnQ) r0
            java.lang.String r8 = r0.A0C
            goto L_0x00b6
        L_0x00f5:
            X.HNJ r0 = X.HNJ.UNKNOWN
            goto L_0x0040
        L_0x00f9:
            X.FGz r1 = X.C49966FGz.A00
            java.lang.Object r4 = r3.A03
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            r0 = 1
            r1.A07(r4, r0)
            java.lang.Object r2 = r3.A01
            X.0iw r2 = (X.AnonymousClass0iw) r2
            java.lang.Object r1 = r3.A02
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r0 = r3.A04
            X.C49966FGz.A03(r1, r2, r4, r0)
            return
        L_0x0111:
            java.lang.Object r8 = r3.A03
            X.ONg r8 = (X.C70834ONg) r8
            X.5D7 r0 = r8.A00
            r6 = 1
            r0.A03(r6)
            r9 = 0
            if (r26 == 0) goto L_0x01a2
            X.3lr r4 = X.C41845B3m.A0U(r26)
            if (r4 == 0) goto L_0x01a2
            java.lang.Class<X.BiD> r2 = X.C42777BiD.class
            java.lang.String r1 = "xfb_genai_write_with_ai_query(params:$params)"
            r0 = 801253326(0x2fc227ce, float:3.5316677E-10)
            X.3lr r4 = r4.A03(r2, r1, r0)
            if (r4 == 0) goto L_0x01a2
            java.lang.Class<X.BiC> r2 = X.C42776BiC.class
            java.lang.String r1 = "response_metadata"
            r0 = -619555393(0xffffffffdb1255bf, float:-4.1189625E16)
            X.3lr r4 = r4.A04(r2, r1, r0)
        L_0x013c:
            X.3lr r7 = X.C41845B3m.A0U(r26)
            if (r7 == 0) goto L_0x01a6
            java.lang.Class<X.BiD> r5 = X.C42777BiD.class
            r2 = 0
            java.lang.String r1 = "xfb_genai_write_with_ai_query(params:$params)"
            r0 = 801253326(0x2fc227ce, float:3.5316677E-10)
            X.3lr r1 = r7.getOptionalTreeField(r2, r1, r5, r0)
            if (r1 == 0) goto L_0x01a6
            java.lang.String r0 = "content"
            com.google.common.collect.ImmutableList r7 = r1.getRequiredCompactedStringListField(r2, r0)
        L_0x0156:
            X.3lr r5 = X.C41845B3m.A0U(r26)
            if (r5 == 0) goto L_0x01aa
            java.lang.Class<X.BiD> r2 = X.C42777BiD.class
            java.lang.String r1 = "xfb_genai_write_with_ai_query(params:$params)"
            r0 = 801253326(0x2fc227ce, float:3.5316677E-10)
            X.3lr r5 = r5.A03(r2, r1, r0)
            if (r5 == 0) goto L_0x01aa
            java.lang.Class<X.BiC> r2 = X.C42776BiC.class
            java.lang.String r1 = "response_metadata"
            r0 = -619555393(0xffffffffdb1255bf, float:-4.1189625E16)
            X.3lr r1 = r5.A04(r2, r1, r0)
            if (r1 == 0) goto L_0x01aa
            java.lang.String r0 = "response_id"
            java.lang.String r10 = r1.getOptionalStringField(r6, r0)
        L_0x017c:
            java.lang.String r11 = r3.A04
            if (r4 == 0) goto L_0x018d
            java.lang.Class<X.BiB> r2 = X.C42775BiB.class
            java.lang.String r1 = "error"
            r0 = 1053867320(0x3ed0bd38, float:0.40769362)
            X.3lr r9 = r4.A04(r2, r1, r0)
            X.BiB r9 = (X.C42775BiB) r9
        L_0x018d:
            java.lang.Object r12 = r3.A02
            X.0sa r12 = (X.C62320sa) r12
            java.lang.Object r13 = r3.A01
            X.0sP r13 = (X.0sP) r13
            android.os.Handler r0 = X.AnonymousClass7TF.A0D()
            X.Pc4 r6 = new X.Pc4
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r0.post(r6)
            return
        L_0x01a2:
            r4 = r9
            if (r26 == 0) goto L_0x01a6
            goto L_0x013c
        L_0x01a6:
            r7 = r9
            if (r26 == 0) goto L_0x01aa
            goto L_0x0156
        L_0x01aa:
            r10 = r9
            goto L_0x017c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DFX.invoke(X.3JD):void");
    }
}
