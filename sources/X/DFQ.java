package X;

public final class DFQ implements AnonymousClass2Kv {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public DFQ(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:208:0x04a7, code lost:
        if (r1.getCoercedBooleanField(0, com.instagram.realtimeclient.RealtimeConstants.SEND_SUCCESS) == true) goto L_0x05be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x04e8, code lost:
        r1.A07(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x04eb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x058f, code lost:
        if (r1 != null) goto L_0x0591;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0591, code lost:
        ((X.0sP) r2.A02).invoke(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0598, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x059a, code lost:
        if (r6 != null) goto L_0x0575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x05bc, code lost:
        if (X.AnonymousClass7TF.A1Y(r1, true) != false) goto L_0x05be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x05be, code lost:
        r0 = r2.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x05c0, code lost:
        ((X.C62320sa) r0).invoke();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x05c5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x05c6, code lost:
        r0 = r2.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x07fa, code lost:
        r1.invoke(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x07fd, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0473  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x04d9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(X.AnonymousClass3JD r31) {
        /*
            r30 = this;
            r2 = r30
            int r0 = r2.A00
            r5 = r31
            switch(r0) {
                case 0: goto L_0x0221;
                case 1: goto L_0x0139;
                case 2: goto L_0x05cb;
                case 3: goto L_0x0523;
                case 4: goto L_0x055a;
                case 5: goto L_0x059d;
                case 6: goto L_0x0517;
                case 7: goto L_0x04ee;
                case 8: goto L_0x0097;
                case 9: goto L_0x0483;
                case 10: goto L_0x04ab;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r4 = r2.A02
            com.instagram.schools.management.data.SchoolSettingsRepository r4 = (com.instagram.schools.management.data.SchoolSettingsRepository) r4
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            com.instagram.schools.management.data.SchoolSettingsRepository.A01(r4, r0)
            if (r31 == 0) goto L_0x0095
            X.3lr r7 = X.C41845B3m.A0U(r5)
            if (r7 == 0) goto L_0x0095
            java.lang.Class<com.instagram.schools.management.data.UpdateBadgeNameResponseImpl$XdtUpdateBadgeName> r6 = com.instagram.schools.management.data.UpdateBadgeNameResponseImpl.XdtUpdateBadgeName.class
            X.3sh r0 = X.C250663lr.Companion
            r1 = 384275345(0x16e79391, float:3.741319E-25)
            r3 = 0
            java.lang.String r0 = "xdt_update_badge_name(input:$input)"
            X.3lr r1 = r7.getRequiredTreeField(r3, r0, r6, r1)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.schools.management.data.UpdateBadgeNameResponseImpl.XdtUpdateBadgeName"
            X.0qQ.A0C(r1, r0)
            if (r1 == 0) goto L_0x0095
            java.lang.String r0 = "success"
            boolean r0 = r1.getRequiredBooleanField(r3, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x0039:
            r6 = 1
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r6)
            if (r0 == 0) goto L_0x0473
            java.lang.Object r0 = r2.A01
            X.0sa r0 = (X.C62320sa) r0
            r0.invoke()
            if (r31 == 0) goto L_0x0094
            X.3lr r3 = X.C41845B3m.A0U(r5)
            if (r3 == 0) goto L_0x0094
            java.lang.Class<com.instagram.schools.management.data.UpdateBadgeNameResponseImpl$XdtUpdateBadgeName> r2 = com.instagram.schools.management.data.UpdateBadgeNameResponseImpl.XdtUpdateBadgeName.class
            X.3sh r0 = X.C250663lr.Companion
            r1 = 384275345(0x16e79391, float:3.741319E-25)
            java.lang.String r0 = "xdt_update_badge_name(input:$input)"
            X.3lr r3 = r3.A05(r2, r0, r1)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.schools.management.data.UpdateBadgeNameResponseImpl.XdtUpdateBadgeName"
            X.0qQ.A0C(r3, r0)
            if (r3 == 0) goto L_0x0094
            java.lang.Class<com.instagram.schools.management.data.UpdateBadgeNameResponseImpl$XdtUpdateBadgeName$User> r2 = com.instagram.schools.management.data.UpdateBadgeNameResponseImpl.XdtUpdateBadgeName.User.class
            r1 = -1624490405(0xffffffff9f2c3e5b, float:-3.6473996E-20)
            java.lang.String r0 = "user"
            X.3lr r3 = r3.getOptionalTreeField(r6, r0, r2, r1)
            if (r3 == 0) goto L_0x0094
            java.lang.Class<com.instagram.schools.management.data.UpdateBadgeNameResponseImpl$XdtUpdateBadgeName$User$ShowSchoolsBadge> r2 = com.instagram.schools.management.data.UpdateBadgeNameResponseImpl.XdtUpdateBadgeName.User.ShowSchoolsBadge.class
            r1 = 364802321(0x15be7111, float:7.6918776E-26)
            java.lang.String r0 = "show_schools_badge"
            X.3lr r3 = r3.A03(r2, r0, r1)
            if (r3 == 0) goto L_0x0094
            r1 = 2
            java.lang.String r0 = "graduation_year"
            int r2 = r3.getRequiredIntField(r1, r0)
            r1 = 0
            java.lang.String r0 = "school_name"
            java.lang.String r1 = X.C41847B3o.A1A(r3, r0, r1)
            java.lang.String r0 = "school_name_abbreviation"
            java.lang.String r0 = r3.getOptionalStringField(r6, r0)
            com.instagram.schools.management.data.SchoolSettingsRepository.A02(r4, r1, r0, r2)
        L_0x0094:
            return
        L_0x0095:
            r0 = 0
            goto L_0x0039
        L_0x0097:
            java.lang.Object r0 = r2.A01
            X.0sa r0 = (X.C62320sa) r0
            r0.invoke()
            r12 = 1
            if (r31 == 0) goto L_0x07fe
            java.lang.Object r3 = r5.Bny()
            com.instagram.schools.management.data.CheckOTPCodeResponseImpl r3 = (com.instagram.schools.management.data.CheckOTPCodeResponseImpl) r3
            if (r3 == 0) goto L_0x07fe
            com.instagram.schools.management.data.CheckOTPCodeResponseImpl$XdtCheckOtpCode r0 = r3.A0E()
            if (r0 == 0) goto L_0x07fe
            java.lang.String r1 = "is_valid"
            boolean r0 = r0.hasFieldValue(r1)
            if (r0 != r12) goto L_0x07fe
            com.instagram.schools.management.data.CheckOTPCodeResponseImpl$XdtCheckOtpCode r0 = r3.A0E()
            if (r0 == 0) goto L_0x07fe
            boolean r0 = r0.getCoercedBooleanField(r12, r1)
            if (r0 != r12) goto L_0x07fe
            java.lang.Object r4 = r2.A02
            X.Hrd r4 = (X.C56031Hrd) r4
            X.05G r2 = r4.A01
        L_0x00c9:
            java.lang.Object r1 = r2.getValue()
            r6 = r1
            X.GnQ r6 = (X.C53393GnQ) r6
            r7 = 0
            r5 = 0
            r11 = 130047(0x1fbff, float:1.82235E-40)
            r8 = r7
            r9 = r7
            r10 = r7
            X.GnQ r0 = X.C53393GnQ.A00((com.google.common.collect.ImmutableList) null, (com.google.common.collect.ImmutableList) null, (com.google.common.collect.ImmutableList) null, (X.HM5) null, (X.HM6) null, (X.C54635HLs) null, r6, r7, r8, (java.lang.String) null, r9, r10, (java.lang.String) null, (java.lang.String) null, r11, r12)
            boolean r0 = r2.AIY(r1, r0)
            if (r0 == 0) goto L_0x00c9
            com.instagram.schools.management.data.CheckOTPCodeResponseImpl$XdtCheckOtpCode r6 = r3.A0E()
            if (r6 == 0) goto L_0x0094
            java.lang.Class<com.instagram.schools.management.data.CheckOTPCodeResponseImpl$XdtCheckOtpCode$User> r3 = com.instagram.schools.management.data.CheckOTPCodeResponseImpl.XdtCheckOtpCode.User.class
            r2 = -292801757(0xffffffffee8c3323, float:-2.169486E28)
            r1 = 3
            java.lang.String r0 = "user"
            X.3lr r3 = r6.getOptionalTreeField(r1, r0, r3, r2)
            if (r3 == 0) goto L_0x0094
            java.lang.Class<com.instagram.schools.management.data.CheckOTPCodeResponseImpl$XdtCheckOtpCode$User$ShowSchoolsBadge> r2 = com.instagram.schools.management.data.CheckOTPCodeResponseImpl.XdtCheckOtpCode.User.ShowSchoolsBadge.class
            r1 = -996463979(0xffffffffc49b2a95, float:-1241.3307)
            java.lang.String r0 = "show_schools_badge"
            X.3lr r2 = r3.getOptionalTreeField(r5, r0, r2, r1)
            if (r2 == 0) goto L_0x0094
            java.lang.String r0 = "graduation_year"
            int r3 = r2.getRequiredIntField(r5, r0)
            java.lang.String r0 = "school_name"
            java.lang.String r1 = X.C41847B3o.A1A(r2, r0, r12)
            java.lang.String r0 = "school_name_abbreviation"
            java.lang.String r0 = r2.A09(r0)
            X.0qQ.A0B(r1, r12)
            X.5uD r2 = new X.5uD
            r2.<init>(r3, r1, r0)
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r1 = r4.A00
            com.instagram.user.model.User r0 = r0.A01(r1)
            X.4Cl r0 = r0.A03
            r0.El7(r2)
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r1)
            java.lang.String r1 = r1.A06
            X.INe r0 = new X.INe
            r0.<init>(r1)
            r2.A00(r0)
            return
        L_0x0139:
            if (r31 == 0) goto L_0x0094
            java.lang.Object r3 = r5.Bny()
            X.3FZ r3 = (X.AnonymousClass3FZ) r3
            if (r3 == 0) goto L_0x0094
            java.lang.Class<X.B9e> r1 = X.C41978B9e.class
            java.lang.String r0 = "user"
            X.3FZ r3 = r3.A00(r1, r0)
            if (r3 == 0) goto L_0x0094
            java.lang.Class<X.B9d> r1 = X.C41977B9d.class
            r0 = 1149(0x47d, float:1.61E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.3FZ r3 = r3.A00(r1, r0)
            if (r3 == 0) goto L_0x0094
            java.lang.Class<X.B9c> r1 = X.C41976B9c.class
            java.lang.String r0 = "medias"
            X.3FZ r7 = r3.A00(r1, r0)
            if (r7 == 0) goto L_0x0094
            r9 = 0
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.lang.Class<X.B9a> r1 = X.C41974B9a.class
            java.lang.String r0 = "edges"
            com.google.common.collect.ImmutableList r0 = r7.A02(r0, r1)
            X.3kO r13 = r0.iterator()
            X.0qQ.A07(r13)
        L_0x0179:
            boolean r1 = r13.hasNext()
            r0 = 0
            if (r1 == 0) goto L_0x0837
            java.lang.Object r4 = r13.next()
            X.3FZ r4 = (X.AnonymousClass3FZ) r4
            java.lang.Class<X.B9Z> r3 = X.B9Z.class
            java.lang.String r1 = "node"
            X.3FZ r10 = r4.A00(r3, r1)
            r5 = 0
            if (r10 == 0) goto L_0x0179
            java.lang.String r1 = "instagram_media_id"
            java.lang.String r18 = r10.A05(r1)
            java.lang.Class<X.B9V> r3 = X.B9V.class
            java.lang.String r1 = "image"
            X.3FZ r3 = r10.A00(r3, r1)
            if (r3 == 0) goto L_0x01a7
            java.lang.String r1 = "uri"
            java.lang.String r5 = r3.A05(r1)
        L_0x01a7:
            X.Uye r3 = X.C16642Uye.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r1 = 309(0x135, float:4.33E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            java.lang.Enum r12 = r10.A04(r1, r3)
            r3 = 0
            if (r18 == 0) goto L_0x0179
            if (r5 == 0) goto L_0x0179
            if (r12 == 0) goto L_0x0179
            java.lang.Class<X.B9Y> r8 = X.B9Y.class
            r1 = 1465(0x5b9, float:2.053E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.3FZ r11 = r10.A00(r8, r1)
            if (r11 == 0) goto L_0x01f3
            java.lang.Class<X.B9X> r8 = X.B9X.class
            java.lang.String r1 = "metric_single_value_query"
            X.3FZ r11 = r11.A00(r8, r1)
            if (r11 == 0) goto L_0x01f3
            java.lang.Class<X.B9W> r8 = X.B9W.class
            java.lang.String r1 = "results"
            com.google.common.collect.ImmutableList r8 = r11.A02(r1, r8)
            if (r8 == 0) goto L_0x01f3
            boolean r1 = r8.isEmpty()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x01f3
            java.lang.Object r1 = r8.get(r9)
            X.3FZ r1 = (X.AnonymousClass3FZ) r1
            java.lang.String r3 = "total_value"
            org.json.JSONObject r1 = r1.A00
            double r3 = r1.optDouble(r3)
        L_0x01f3:
            com.instagram.common.typedurl.SimpleImageUrl r8 = new com.instagram.common.typedurl.SimpleImageUrl
            r8.<init>(r5)
            java.lang.String r1 = r12.toString()
            X.0qQ.A07(r1)
            X.UwY r15 = X.C16528UwY.valueOf(r1)
            java.lang.Class<X.B9U> r5 = X.B9U.class
            java.lang.String r1 = "ad_media"
            X.3FZ r1 = r10.A00(r5, r1)
            if (r1 == 0) goto L_0x020e
            r0 = 1
        L_0x020e:
            int r1 = (int) r3
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r0)
            X.L8o r14 = new X.L8o
            r19 = r1
            r16 = r8
            r14.<init>(r15, r16, r17, r18, r19)
            r6.add(r14)
            goto L_0x0179
        L_0x0221:
            X.05G r7 = X.C63563KzC.A02
            X.3lr r3 = X.C41845B3m.A0U(r5)
            r4 = 0
            if (r3 == 0) goto L_0x03ff
            java.lang.Class<X.BwU> r5 = X.C43330BwU.class
            java.lang.String r1 = "viewer"
            r0 = 1082977980(0x408ceebc, float:4.4041424)
            X.3lr r6 = r3.getOptionalTreeField(r4, r1, r5, r0)
            if (r6 == 0) goto L_0x03ff
            java.lang.Class<X.BwT> r5 = X.C43329BwT.class
            java.lang.String r1 = "gen_ai_persona_user"
            r0 = 590630344(0x23344dc8, float:9.77429E-18)
            X.3lr r6 = r6.getOptionalTreeField(r4, r1, r5, r0)
            if (r6 == 0) goto L_0x03ff
            java.lang.Class<X.BwS> r5 = X.C43328BwS.class
            java.lang.String r1 = "creation_templates"
            r0 = -1746398189(0xffffffff97e81413, float:-1.4997716E-24)
            X.3lr r6 = r6.getOptionalTreeField(r4, r1, r5, r0)
            if (r6 == 0) goto L_0x03ff
            java.lang.Class<X.C8D> r5 = X.C8D.class
            java.lang.String r1 = "edges"
            r0 = -11404062(0xffffffffff51fce2, float:-2.791217E38)
            X.Cvn r0 = r6.getRequiredCompactedPaginableListEdgesField(r4, r1, r5, r0)
            if (r0 == 0) goto L_0x03ff
            com.google.common.collect.ImmutableList r0 = r0.A00
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r12 = r0.iterator()
        L_0x0268:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x02f2
            java.lang.Object r8 = r12.next()
            r9 = r8
            X.C8D r9 = (X.C8D) r9
            X.BwR r0 = r9.A0E()
            if (r0 == 0) goto L_0x0268
            java.lang.String r5 = "strong_id__"
            java.lang.String r0 = r0.getOptionalStringField(r4, r5)
            if (r0 == 0) goto L_0x0268
            X.BwR r1 = r9.A0E()
            if (r1 == 0) goto L_0x0268
            java.lang.String r0 = "topic"
            java.lang.String r0 = r1.A08(r0)
            if (r0 == 0) goto L_0x0268
            X.BwR r11 = r9.A0E()
            if (r11 == 0) goto L_0x0268
            java.lang.Class<X.BwQ> r10 = X.C43326BwQ.class
            r9 = 3
            r0 = 143(0x8f, float:2.0E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 1460497239(0x570d6b57, float:1.55492161E14)
            X.3lr r10 = r11.getOptionalTreeField(r9, r1, r10, r0)
            if (r10 == 0) goto L_0x0268
            java.lang.Class<X.BwP> r9 = X.C43325BwP.class
            java.lang.String r1 = "nodes"
            r0 = -864349087(0xffffffffcc7b1461, float:-6.5819012E7)
            com.google.common.collect.ImmutableList r1 = r10.getRequiredCompactedTreeListField(r4, r1, r9, r0)
            if (r1 == 0) goto L_0x0268
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x02c1
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x02c1
            goto L_0x0268
        L_0x02c1:
            java.util.Iterator r9 = r1.iterator()
        L_0x02c5:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0268
            X.3lr r1 = X.C41845B3m.A0V(r9)
            java.lang.String r0 = r1.getOptionalStringField(r4, r5)
            if (r0 == 0) goto L_0x02c5
            java.lang.String r0 = "description"
            java.lang.String r0 = r1.A0A(r0)
            if (r0 == 0) goto L_0x02c5
            java.lang.String r0 = "image_url"
            java.lang.String r0 = r1.A09(r0)
            if (r0 == 0) goto L_0x02c5
            java.lang.String r0 = "tagline"
            java.lang.String r0 = r1.A0B(r0)
            if (r0 == 0) goto L_0x02c5
            r6.add(r8)
            goto L_0x0268
        L_0x02f2:
            java.util.ArrayList r9 = X.AnonymousClass7TF.A0p(r6)
            java.util.Iterator r14 = r6.iterator()
        L_0x02fa:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0401
            java.lang.Object r11 = r14.next()
            X.C8D r11 = (X.C8D) r11
            if (r11 == 0) goto L_0x03fc
            X.BwR r1 = r11.A0E()
            if (r1 == 0) goto L_0x03fc
            java.lang.String r0 = "strong_id__"
            java.lang.String r8 = r1.getOptionalStringField(r4, r0)
        L_0x0314:
            java.lang.String r13 = "Required value was null."
            if (r8 == 0) goto L_0x0885
            if (r11 == 0) goto L_0x0880
            X.BwR r1 = r11.A0E()
            if (r1 == 0) goto L_0x0880
            java.lang.String r0 = "topic"
            java.lang.String r6 = r1.A08(r0)
            if (r6 == 0) goto L_0x0880
            X.BwR r5 = r11.A0E()
            if (r5 == 0) goto L_0x03f8
            r1 = 2
            r0 = 710(0x2c6, float:9.95E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            com.google.common.collect.ImmutableList r10 = r5.getRequiredCompactedStringListField(r1, r0)
            if (r10 == 0) goto L_0x03f8
            java.lang.String r5 = ", "
            r1 = 0
            java.lang.String r0 = ""
            java.lang.String r5 = X.00k.A0P(r5, r0, r0, r10, r1)
        L_0x0344:
            X.BwR r12 = r11.A0E()
            if (r12 == 0) goto L_0x03ec
            java.lang.Class<X.BwQ> r11 = X.C43326BwQ.class
            r10 = 3
            r0 = 143(0x8f, float:2.0E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 1460497239(0x570d6b57, float:1.55492161E14)
            X.3lr r11 = r12.getOptionalTreeField(r10, r1, r11, r0)
            if (r11 == 0) goto L_0x03ec
            java.lang.Class<X.BwP> r10 = X.C43325BwP.class
            java.lang.String r1 = "nodes"
            r0 = -864349087(0xffffffffcc7b1461, float:-6.5819012E7)
            com.google.common.collect.ImmutableList r0 = r11.getRequiredCompactedTreeListField(r4, r1, r10, r0)
            if (r0 == 0) goto L_0x03ec
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r12 = r0.iterator()
        L_0x0371:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x03a2
            java.lang.Object r1 = r12.next()
            r11 = r1
            X.3lr r11 = (X.C250663lr) r11
            java.lang.String r0 = "strong_id__"
            java.lang.String r0 = r11.getOptionalStringField(r4, r0)
            if (r0 == 0) goto L_0x0371
            java.lang.String r0 = "description"
            java.lang.String r0 = r11.A0A(r0)
            if (r0 == 0) goto L_0x0371
            java.lang.String r0 = "image_url"
            java.lang.String r0 = r11.A09(r0)
            if (r0 == 0) goto L_0x0371
            java.lang.String r0 = "tagline"
            java.lang.String r0 = r11.A0B(r0)
            if (r0 == 0) goto L_0x0371
            r10.add(r1)
            goto L_0x0371
        L_0x03a2:
            java.util.ArrayList r1 = X.AnonymousClass7TF.A0p(r10)
            java.util.Iterator r11 = r10.iterator()
        L_0x03aa:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x03ee
            X.3lr r10 = X.C41845B3m.A0V(r11)
            java.lang.String r0 = "strong_id__"
            java.lang.String r17 = r10.getOptionalStringField(r4, r0)
            if (r17 == 0) goto L_0x087b
            java.lang.String r0 = "name"
            java.lang.String r18 = r10.A08(r0)
            if (r18 == 0) goto L_0x0876
            java.lang.String r0 = "description"
            java.lang.String r19 = r10.A0A(r0)
            if (r19 == 0) goto L_0x0871
            java.lang.String r0 = "tagline"
            java.lang.String r20 = r10.A0B(r0)
            if (r20 == 0) goto L_0x086c
            java.lang.String r0 = "image_url"
            java.lang.String r10 = r10.A09(r0)
            if (r10 == 0) goto L_0x0867
            com.instagram.common.typedurl.SimpleImageUrl r0 = new com.instagram.common.typedurl.SimpleImageUrl
            r0.<init>(r10)
            X.QP8 r15 = new X.QP8
            r16 = r0
            r15.<init>((com.instagram.common.typedurl.ImageUrl) r16, (java.lang.String) r17, (java.lang.String) r18, (java.lang.String) r19, (java.lang.String) r20)
            r1.add(r15)
            goto L_0x03aa
        L_0x03ec:
            X.0sn r1 = X.0sn.A00
        L_0x03ee:
            X.JwB r0 = new X.JwB
            r0.<init>((java.lang.String) r8, (java.lang.String) r6, (java.lang.String) r5, (java.util.List) r1)
            r9.add(r0)
            goto L_0x02fa
        L_0x03f8:
            java.lang.String r5 = ""
            goto L_0x0344
        L_0x03fc:
            r8 = 0
            goto L_0x0314
        L_0x03ff:
            X.0sn r9 = X.0sn.A00
        L_0x0401:
            r7.Epw(r9)
            X.05G r1 = X.C63563KzC.A01
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r1.Epw(r0)
            java.lang.Object r0 = r7.getValue()
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
            r0 = 30
            if (r1 > r0) goto L_0x0094
            java.lang.Object r5 = r2.A01
            X.1vn r5 = (X.1vn) r5
            java.lang.Object r6 = r2.A02
            X.0lg r6 = (X.0lg) r6
            if (r3 == 0) goto L_0x0471
            java.lang.Class<X.BwU> r2 = X.C43330BwU.class
            java.lang.String r1 = "viewer"
            r0 = 1082977980(0x408ceebc, float:4.4041424)
            X.3lr r3 = r3.getOptionalTreeField(r4, r1, r2, r0)
            if (r3 == 0) goto L_0x0471
            java.lang.Class<X.BwT> r2 = X.C43329BwT.class
            java.lang.String r1 = "gen_ai_persona_user"
            r0 = 590630344(0x23344dc8, float:9.77429E-18)
            X.3lr r3 = r3.getOptionalTreeField(r4, r1, r2, r0)
            if (r3 == 0) goto L_0x0471
            java.lang.Class<X.BwS> r2 = X.C43328BwS.class
            java.lang.String r1 = "creation_templates"
            r0 = -1746398189(0xffffffff97e81413, float:-1.4997716E-24)
            X.3lr r3 = r3.getOptionalTreeField(r4, r1, r2, r0)
            if (r3 == 0) goto L_0x0471
            java.lang.Class<X.C8D> r2 = X.C8D.class
            java.lang.String r1 = "edges"
            r0 = -11404062(0xffffffffff51fce2, float:-2.791217E38)
            X.Cvn r4 = r3.getRequiredCompactedPaginableListEdgesField(r4, r1, r2, r0)
        L_0x0457:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36605551000818957(0x820c8e0036150d, double:3.212836079416188E-306)
            long r2 = X.182.A01(r2, r6, r0)
            int r1 = (int) r2
            if (r4 == 0) goto L_0x0094
            boolean r0 = r4.A04
            if (r0 == 0) goto L_0x0094
            boolean r0 = r4.A05
            if (r0 != 0) goto L_0x0094
            X.C44756CkS.A00(r4, r5, r1)
            return
        L_0x0471:
            r4 = 0
            goto L_0x0457
        L_0x0473:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            com.instagram.schools.management.data.SchoolSettingsRepository.A01(r4, r0)
            X.0eM r0 = r4.A02
            java.lang.Object r1 = r0.getValue()
            X.INA r1 = (X.INA) r1
            java.lang.String r0 = "failed to update school banner name"
            goto L_0x04e8
        L_0x0483:
            r6 = 1
            if (r31 == 0) goto L_0x05c6
            X.3lr r5 = X.C41845B3m.A0U(r5)
            if (r5 == 0) goto L_0x05c6
            java.lang.Class<com.instagram.schools.management.data.SendOtpMutationResponseImpl$XdtSendOtpEmail> r4 = com.instagram.schools.management.data.SendOtpMutationResponseImpl.XdtSendOtpEmail.class
            X.3sh r0 = X.C250663lr.Companion
            r1 = -1770356819(0xffffffff967a7fad, float:-2.0235127E-25)
            r3 = 0
            java.lang.String r0 = "xdt_send_otp_email(input:$input)"
            X.3lr r1 = r5.getRequiredTreeField(r3, r0, r4, r1)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.schools.management.data.SendOtpMutationResponseImpl.XdtSendOtpEmail"
            X.0qQ.A0C(r1, r0)
            if (r1 == 0) goto L_0x05c6
            java.lang.String r0 = "success"
            boolean r0 = r1.getCoercedBooleanField(r3, r0)
            if (r0 != r6) goto L_0x05c6
            goto L_0x05be
        L_0x04ab:
            java.lang.Object r6 = r2.A02
            com.instagram.schools.management.data.SchoolSettingsRepository r6 = (com.instagram.schools.management.data.SchoolSettingsRepository) r6
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            com.instagram.schools.management.data.SchoolSettingsRepository.A01(r6, r0)
            if (r31 == 0) goto L_0x04ec
            X.3lr r4 = X.C41845B3m.A0U(r5)
            if (r4 == 0) goto L_0x04ec
            java.lang.Class<com.instagram.schools.management.data.UpdateSchoolBadgeVisibilityResponseImpl$XdtUpdateSchoolBadgeVisibility> r3 = com.instagram.schools.management.data.UpdateSchoolBadgeVisibilityResponseImpl.XdtUpdateSchoolBadgeVisibility.class
            X.3sh r0 = X.C250663lr.Companion
            r1 = -1729480436(0xffffffff98ea390c, float:-6.0545185E-24)
            java.lang.String r0 = "xdt_update_school_badge_visibility(input:$input)"
            X.3lr r3 = r4.A03(r3, r0, r1)
            if (r3 == 0) goto L_0x04ec
            r1 = 0
            java.lang.String r0 = "success"
            java.lang.Boolean r1 = X.C41846B3n.A0d(r3, r0, r1)
        L_0x04d2:
            r0 = 1
            boolean r0 = X.AnonymousClass7TF.A1Y(r1, r0)
            if (r0 != 0) goto L_0x05c6
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            com.instagram.schools.management.data.SchoolSettingsRepository.A01(r6, r0)
            X.0eM r0 = r6.A02
            java.lang.Object r1 = r0.getValue()
            X.INA r1 = (X.INA) r1
            java.lang.String r0 = "failed to update school banner visibility"
        L_0x04e8:
            r1.A07(r0)
            return
        L_0x04ec:
            r1 = 0
            goto L_0x04d2
        L_0x04ee:
            java.lang.Object r3 = r2.A01
            X.59w r3 = (X.C2818659w) r3
            java.lang.Object r2 = r2.A02
            X.2Kw r2 = (X.2Kw) r2
            if (r31 == 0) goto L_0x050c
            java.lang.Object r1 = r5.Bny()
            if (r1 == 0) goto L_0x050c
            X.2hV r0 = X.Cs7.A02
            java.lang.Object r0 = r0.apply(r1)
            X.S21 r0 = X.C11097S9y.A00(r0)
            r3.A02(r0)
            return
        L_0x050c:
            java.lang.String r1 = "GraphQLResult is null."
            X.DIN r0 = new X.DIN
            r0.<init>(r1)
            r2.invoke(r0)
            return
        L_0x0517:
            java.lang.Object r1 = r2.A01
            X.Mai r1 = (X.C66675Mai) r1
            java.lang.Object r0 = r2.A02
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            r1.A00(r5, r0)
            return
        L_0x0523:
            if (r31 == 0) goto L_0x0552
            X.3lr r4 = X.C41845B3m.A0U(r5)
            if (r4 == 0) goto L_0x0552
            java.lang.Class<X.BhS> r3 = X.C42731BhS.class
            java.lang.String r1 = "viewer"
            r0 = 1945955525(0x73fcecc5, float:4.0077547E31)
            X.3lr r4 = r4.A03(r3, r1, r0)
            if (r4 == 0) goto L_0x0552
            java.lang.Class<X.BhR> r3 = X.C42730BhR.class
            java.lang.String r1 = "user"
            r0 = 1036943063(0x3dce7ed7, float:0.100827865)
            X.3lr r4 = r4.A03(r3, r1, r0)
            if (r4 == 0) goto L_0x0552
            java.lang.Class<X.BhQ> r3 = X.C42729BhQ.class
            java.lang.String r1 = "eb_primary_device"
            r0 = -1097705388(0xffffffffbe925854, float:-0.28583014)
            X.3lr r1 = r4.A03(r3, r1, r0)
            if (r1 != 0) goto L_0x0591
        L_0x0552:
            java.lang.Object r1 = r2.A01
            X.0sP r1 = (X.0sP) r1
            java.lang.String r0 = "Graphql ebPrimaryDevice returns null"
            goto L_0x07fa
        L_0x055a:
            X.3lr r6 = X.C41845B3m.A0U(r5)
            r1 = 0
            if (r6 == 0) goto L_0x0599
            java.lang.Class<X.Bh9> r5 = X.C42712Bh9.class
            r4 = 0
            java.lang.String r3 = "create_ig_business_custom_folder(data:$data)"
            r0 = -858704897(0xffffffffccd133ff, float:-1.0968268E8)
            X.3lr r3 = r6.getOptionalTreeField(r4, r3, r5, r0)
            if (r3 == 0) goto L_0x0599
            java.lang.String r0 = "success"
            java.lang.Boolean r5 = X.C41846B3n.A0d(r3, r0, r4)
        L_0x0575:
            java.lang.Class<X.Bh9> r4 = X.C42712Bh9.class
            java.lang.String r3 = "create_ig_business_custom_folder(data:$data)"
            r0 = -858704897(0xffffffffccd133ff, float:-1.0968268E8)
            X.3lr r3 = r6.A03(r4, r3, r0)
            if (r3 == 0) goto L_0x0588
            java.lang.String r0 = "folder_id"
            java.lang.String r1 = r3.A08(r0)
        L_0x0588:
            r0 = 1
            boolean r0 = X.AnonymousClass7TF.A1Y(r5, r0)
            if (r0 == 0) goto L_0x05c6
            if (r1 == 0) goto L_0x05c6
        L_0x0591:
            java.lang.Object r0 = r2.A02
            X.0sP r0 = (X.0sP) r0
            r0.invoke(r1)
            return
        L_0x0599:
            r5 = r1
            if (r6 == 0) goto L_0x0588
            goto L_0x0575
        L_0x059d:
            X.3lr r5 = X.C41845B3m.A0U(r5)
            if (r5 == 0) goto L_0x05c9
            java.lang.Class<X.BhB> r4 = X.C42714BhB.class
            r3 = 0
            java.lang.String r1 = "delete_ig_business_custom_folder(data:$data)"
            r0 = 1359566932(0x51095854, float:3.6868276E10)
            X.3lr r1 = r5.getOptionalTreeField(r3, r1, r4, r0)
            if (r1 == 0) goto L_0x05c9
            java.lang.String r0 = "success"
            java.lang.Boolean r1 = X.C41846B3n.A0d(r1, r0, r3)
        L_0x05b7:
            r0 = 1
            boolean r0 = X.AnonymousClass7TF.A1Y(r1, r0)
            if (r0 == 0) goto L_0x05c6
        L_0x05be:
            java.lang.Object r0 = r2.A02
        L_0x05c0:
            X.0sa r0 = (X.C62320sa) r0
            r0.invoke()
            return
        L_0x05c6:
            java.lang.Object r0 = r2.A01
            goto L_0x05c0
        L_0x05c9:
            r1 = 0
            goto L_0x05b7
        L_0x05cb:
            if (r31 == 0) goto L_0x07ec
            X.3lr r4 = X.C41845B3m.A0U(r5)
            if (r4 == 0) goto L_0x07ec
            java.lang.Class<X.Btg> r3 = X.C43156Btg.class
            r0 = 1964(0x7ac, float:2.752E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = -244623539(0xfffffffff16b574d, float:-1.1653523E30)
            X.3lr r8 = r4.A03(r3, r1, r0)
            if (r8 == 0) goto L_0x07ec
            java.lang.Object r6 = r2.A02
            X.Ezd r6 = (X.C49620Ezd) r6
            X.0eM r0 = r6.A02
            java.lang.Object r1 = r0.getValue()
            X.4Yx r1 = (X.C266444Yx) r1
            java.lang.String r14 = "all_category_id"
            r9 = 34
            X.JwJ r0 = new X.JwJ
            r0.<init>((X.C266444Yx) r1, (java.lang.String) r14, (int) r9)
            java.util.List r7 = X.AnonymousClass7TE.A1I(r0)
            java.lang.Class<X.Btf> r2 = X.C43155Btf.class
            java.lang.String r1 = "categories"
            r0 = -341150599(0xffffffffebaa7479, float:-4.1213483E26)
            X.3lr r3 = r8.A03(r2, r1, r0)
            if (r3 == 0) goto L_0x0617
            java.lang.Class<X.Bte> r2 = X.C43154Bte.class
            java.lang.String r1 = "nodes"
            r0 = 967081376(0x39a47da0, float:3.1374115E-4)
            com.google.common.collect.ImmutableList r1 = r3.A06(r2, r1, r0)
            if (r1 != 0) goto L_0x0619
        L_0x0617:
            X.0sn r1 = X.0sn.A00
        L_0x0619:
            r5 = 1
            X.DIA r0 = new X.DIA
            r0.<init>(r5)
            java.util.List r0 = X.00k.A0g(r1, r0)
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r0.iterator()
        L_0x062b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0653
            X.3lr r1 = X.C41845B3m.A0V(r3)
            java.lang.String r0 = "category_key"
            java.lang.String r2 = r1.A07(r0)
            java.lang.String r0 = "name"
            java.lang.String r0 = r1.A08(r0)
            if (r2 == 0) goto L_0x062b
            if (r0 == 0) goto L_0x062b
            X.GKw r1 = new X.GKw
            r1.<init>(r0)
            X.JwJ r0 = new X.JwJ
            r0.<init>((X.C266444Yx) r1, (java.lang.String) r2, (int) r9)
            r4.add(r0)
            goto L_0x062b
        L_0x0653:
            java.util.ArrayList r4 = X.00k.A0S(r4, r7)
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            r0 = 10
            int r0 = X.0Yv.A1E(r4, r0)
            int r0 = X.AnonymousClass7TG.A01(r0)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>(r0)
            java.util.Iterator r7 = r4.iterator()
        L_0x066e:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0684
            java.lang.Object r0 = r7.next()
            X.JwJ r0 = (X.C61081JwJ) r0
            java.lang.String r1 = r0.A01
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r2.put(r1, r0)
            goto L_0x066e
        L_0x0684:
            java.lang.Class<X.Btd> r7 = X.C43153Btd.class
            java.lang.String r1 = "bots"
            r0 = -1075835732(0xffffffffbfe00cac, float:-1.7503867)
            X.3lr r8 = r8.A02(r7, r1, r0)
            if (r8 == 0) goto L_0x069e
            java.lang.Class<X.Btc> r7 = X.C43152Btc.class
            java.lang.String r1 = "nodes"
            r0 = 975943218(0x3a2bb632, float:6.5502815E-4)
            com.google.common.collect.ImmutableList r0 = r8.A06(r7, r1, r0)
            if (r0 != 0) goto L_0x06a0
        L_0x069e:
            X.0sn r0 = X.0sn.A00
        L_0x06a0:
            r1 = 0
            java.util.Iterator r18 = r0.iterator()
        L_0x06a5:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x07bd
            java.lang.Object r7 = r18.next()
            int r17 = r1 + 1
            if (r1 >= 0) goto L_0x06bb
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x06bb:
            X.3lr r7 = (X.C250663lr) r7
            java.lang.String r0 = "id"
            java.lang.String r21 = r7.A07(r0)
            if (r21 == 0) goto L_0x07ae
            java.lang.String r0 = "primary_color_hex"
            java.lang.String r11 = r7.A0C(r0)
            if (r11 != 0) goto L_0x06cf
            java.lang.String r11 = "#808080"
        L_0x06cf:
            java.lang.Class<X.Btb> r10 = X.C43151Btb.class
            r9 = 7
            java.lang.String r8 = "profile_picture"
            r0 = 114846930(0x6d86cd2, float:8.1410067E-35)
            X.3lr r8 = r7.getOptionalTreeField(r9, r8, r10, r0)
            if (r8 == 0) goto L_0x07a5
            java.lang.String r0 = "uri"
            java.lang.String r10 = r8.A07(r0)
            if (r10 == 0) goto L_0x07a5
            java.lang.String r0 = "width"
            int r9 = r8.A00(r0)
            java.lang.String r0 = "height"
            int r8 = r8.getCoercedIntField(r5, r0)
            com.instagram.common.typedurl.SimpleImageUrl r0 = new com.instagram.common.typedurl.SimpleImageUrl
            r0.<init>(r10, r9, r8)
        L_0x06f6:
            java.lang.String r8 = "name"
            java.lang.String r22 = r7.A08(r8)
            java.lang.String r10 = "Required value was null."
            if (r22 == 0) goto L_0x07b8
            java.lang.String r8 = "thread_id"
            java.lang.String r23 = r7.A09(r8)
            java.lang.String r8 = "description"
            java.lang.String r24 = r7.A0A(r8)
            if (r24 != 0) goto L_0x0710
            java.lang.String r24 = ""
        L_0x0710:
            r9 = 6
            r8 = 1812(0x714, float:2.539E-42)
            java.lang.String r8 = X.AnonymousClass000.A00(r8)
            java.lang.String r25 = r7.getOptionalStringField(r9, r8)
            int r28 = android.graphics.Color.parseColor(r11)
            double r8 = (double) r1
            double r11 = -r8
            r8 = 8
            java.lang.String r1 = "has_embodiment"
            boolean r29 = r7.getCoercedBooleanField(r8, r1)
            X.BBO r1 = new X.BBO
            r20 = r0
            r26 = r11
            r19 = r1
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r28, r29)
            r3.add(r1)
            java.lang.Object r0 = r2.get(r14)
            if (r0 == 0) goto L_0x07b2
            java.util.List r0 = (java.util.List) r0
            r0.add(r1)
            java.lang.Class<X.Bta> r9 = X.C43150Bta.class
            r12 = 4
            java.lang.String r8 = "bot_categories"
            r0 = 641944067(0x26434a03, float:6.775452E-16)
            com.google.common.collect.ImmutableList r0 = X.C41845B3m.A0X(r7, r9, r8, r12, r0)
            java.util.Iterator r16 = r0.iterator()
        L_0x0752:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x07ae
            X.3lr r7 = X.C41845B3m.A0V(r16)
            java.lang.String r0 = "category_key"
            java.lang.String r0 = r7.A08(r0)
            java.lang.Object r13 = r2.get(r0)
            java.util.List r13 = (java.util.List) r13
            if (r13 == 0) goto L_0x0752
            r11 = 0
            java.lang.String r0 = "rank"
            double r26 = r7.getCoercedDoubleField(r11, r0)
            java.lang.String r10 = r1.A04
            com.instagram.common.typedurl.ImageUrl r9 = r1.A02
            java.lang.String r8 = r1.A05
            java.lang.String r0 = r1.A07
            r23 = r0
            java.lang.String r7 = r1.A03
            java.lang.String r0 = r1.A06
            r25 = r0
            int r0 = r1.A01
            r28 = r0
            boolean r15 = r1.A08
            X.0qQ.A0B(r10, r11)
            X.AnonymousClass7TF.A1B(r9, r5, r8)
            X.0qQ.A0B(r7, r12)
            X.BBO r0 = new X.BBO
            r19 = r0
            r20 = r9
            r21 = r10
            r22 = r8
            r24 = r7
            r29 = r15
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r28, r29)
            r13.add(r0)
            goto L_0x0752
        L_0x07a5:
            java.lang.String r8 = ""
            com.instagram.common.typedurl.SimpleImageUrl r0 = new com.instagram.common.typedurl.SimpleImageUrl
            r0.<init>(r8)
            goto L_0x06f6
        L_0x07ae:
            r1 = r17
            goto L_0x06a5
        L_0x07b2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r10)
            throw r0
        L_0x07b8:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r10)
            throw r0
        L_0x07bd:
            java.util.Collection r0 = r2.values()
            java.util.Iterator r8 = r0.iterator()
        L_0x07c5:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x07e1
            java.lang.Object r7 = r8.next()
            java.util.List r7 = (java.util.List) r7
            int r0 = r7.size()
            if (r0 <= r5) goto L_0x07c5
            r1 = 2
            X.DIA r0 = new X.DIA
            r0.<init>(r1)
            X.01V.A1D(r7, r0)
            goto L_0x07c5
        L_0x07e1:
            X.05G r1 = r6.A03
            X.JwM r0 = new X.JwM
            r0.<init>((java.util.List) r3, (java.util.List) r4, (java.util.Map) r2)
            r1.Epw(r0)
            return
        L_0x07ec:
            java.lang.Object r1 = r2.A01
            X.0sP r1 = (X.0sP) r1
            r0 = 460(0x1cc, float:6.45E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)
        L_0x07fa:
            r1.invoke(r0)
            return
        L_0x07fe:
            java.lang.Object r4 = r2.A02
            X.Hrd r4 = (X.C56031Hrd) r4
            if (r31 == 0) goto L_0x081f
            java.lang.Object r0 = r5.Bny()
            com.instagram.schools.management.data.CheckOTPCodeResponseImpl r0 = (com.instagram.schools.management.data.CheckOTPCodeResponseImpl) r0
            if (r0 == 0) goto L_0x081f
            com.instagram.schools.management.data.CheckOTPCodeResponseImpl$XdtCheckOtpCode r3 = r0.A0E()
            if (r3 == 0) goto L_0x081f
            X.HNJ r2 = X.HNJ.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r1 = 2
            java.lang.String r0 = "error"
            java.lang.Enum r0 = r3.getOptionalEnumField(r1, r0, r2)
            X.HNJ r0 = (X.HNJ) r0
            if (r0 != 0) goto L_0x0821
        L_0x081f:
            X.HNJ r0 = X.HNJ.UNKNOWN
        L_0x0821:
            int r1 = r0.ordinal()
            r0 = 2
            if (r1 == r0) goto L_0x0834
            r0 = 6
            if (r1 == r0) goto L_0x0831
            X.HM5 r0 = X.HM5.OTHER_ERROR
        L_0x082d:
            r4.A00(r0)
            return
        L_0x0831:
            X.HM5 r0 = X.HM5.INVALID
            goto L_0x082d
        L_0x0834:
            X.HM5 r0 = X.HM5.EXPIRED
            goto L_0x082d
        L_0x0837:
            java.lang.Class<X.B9b> r5 = X.C41975B9b.class
            java.lang.String r4 = "page_info"
            X.3FZ r3 = r7.A00(r5, r4)
            if (r3 == 0) goto L_0x0849
            java.lang.String r1 = "end_cursor"
            java.lang.String r3 = r3.A05(r1)
            if (r3 != 0) goto L_0x084b
        L_0x0849:
            java.lang.String r3 = ""
        L_0x084b:
            X.3FZ r1 = r7.A00(r5, r4)
            if (r1 == 0) goto L_0x0857
            java.lang.String r0 = "has_next_page"
            boolean r0 = r1.A06(r0)
        L_0x0857:
            X.LD0 r1 = new X.LD0
            r1.<init>(r3, r6, r0)
            java.lang.Object r0 = r2.A01
            X.DQt r0 = (X.C46215DQt) r0
            X.C45891D9u.A01(r0, r1)
            X.C45891D9u.A00(r0)
            return
        L_0x0867:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r13)
            throw r0
        L_0x086c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r13)
            throw r0
        L_0x0871:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r13)
            throw r0
        L_0x0876:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r13)
            throw r0
        L_0x087b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r13)
            throw r0
        L_0x0880:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r13)
            throw r0
        L_0x0885:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DFQ.invoke(X.3JD):void");
    }
}
