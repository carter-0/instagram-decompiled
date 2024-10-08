package X;

/* renamed from: X.U8c  reason: case insensitive filesystem */
public abstract class C14766U8c extends 2YL {
    public final C249513ju A00;
    public final AnonymousClass0r6 A01;
    public final 05G A02 = C51970G9q.A10(false);

    /* JADX WARNING: type inference failed for: r0v46, types: [java.lang.Object, com.instagram.leadads.model.LeadAdsDisclaimerResponse] */
    /* JADX WARNING: type inference failed for: r0v49, types: [java.lang.Object, com.instagram.leadads.model.LeadAdsInputFieldResponse] */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        if (r7 != null) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        if (r0 == null) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
        r0 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        X.DbY.A19(r8, new X.C20592WvV(r8, (X.AnonymousClass4D7) null, 37), r3.A03(r6, r1, r4, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0046, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(java.util.List r22, java.util.List r23, java.lang.String r24) {
        /*
            r21 = this;
            r2 = r21
            r1 = r22
            boolean r0 = r2 instanceof X.C16042UnV
            r6 = r24
            if (r0 == 0) goto L_0x0047
            r8 = r2
            X.UnV r8 = (X.C16042UnV) r8
            r0 = 1
            X.0qQ.A0B(r6, r0)
            com.instagram.leadgen.organic.model.LeadGenConsumerFormData r7 = r8.A02
            r5 = 0
            if (r7 == 0) goto L_0x0022
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r0 = r7.A00
            if (r0 == 0) goto L_0x0022
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            java.util.ArrayList r1 = X.00k.A0S(r1, r0)
        L_0x0022:
            java.lang.String r4 = X.W3L.A03(r1)
            X.Vki r3 = r8.A01
            java.lang.String r2 = ""
            if (r7 == 0) goto L_0x0030
            java.lang.String r1 = r7.A06
            if (r1 != 0) goto L_0x0033
        L_0x0030:
            r1 = r2
            if (r7 == 0) goto L_0x0037
        L_0x0033:
            java.lang.String r0 = r7.A08
            if (r0 != 0) goto L_0x0038
        L_0x0037:
            r0 = r2
        L_0x0038:
            X.MCA r2 = r3.A03(r6, r1, r4, r0)
            r1 = 37
            X.WvV r0 = new X.WvV
            r0.<init>(r8, r5, r1)
            X.DbY.A19(r8, r0, r2)
            return
        L_0x0047:
            r5 = r2
            X.UnW r5 = (X.C16043UnW) r5
            r0 = 1
            X.0qQ.A0B(r6, r0)
            X.6rJ r9 = r5.A00
            java.lang.String r0 = "single_multiple_choice_question"
            java.lang.Object r0 = r9.A00(r0)
            if (r0 == 0) goto L_0x0060
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            java.util.ArrayList r1 = X.00k.A0S(r1, r0)
        L_0x0060:
            java.util.ArrayList r4 = X.AnonymousClass7TF.A0p(r1)
            java.util.Iterator r11 = r1.iterator()
        L_0x0068:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0098
            java.lang.Object r1 = r11.next()
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r1 = (com.instagram.leadgen.core.model.LeadGenFormBaseQuestion) r1
            X.Uxp r0 = r1.A03
            X.UzC r10 = r0.A00
            java.lang.String r8 = r1.A0A
            java.lang.String r7 = r1.A09
            java.lang.String r3 = r1.A00
            java.lang.String r2 = "\n"
            java.lang.String r1 = " "
            r0 = 0
            java.lang.String r1 = X.00p.A0g(r3, r2, r1, r0)
            com.instagram.leadads.model.LeadAdsInputFieldResponse r0 = new com.instagram.leadads.model.LeadAdsInputFieldResponse
            r0.<init>()
            r0.A00 = r10
            r0.A03 = r8
            r0.A02 = r7
            r0.A01 = r1
            r4.add(r0)
            goto L_0x0068
        L_0x0098:
            r3 = 0
            if (r23 == 0) goto L_0x00c0
            java.util.ArrayList r7 = X.AnonymousClass7TF.A0p(r23)
            java.util.Iterator r8 = r23.iterator()
        L_0x00a3:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00c1
            java.lang.Object r0 = r8.next()
            X.Jvk r0 = (X.C61046Jvk) r0
            java.lang.String r2 = r0.A00
            boolean r1 = r0.A01
            com.instagram.leadads.model.LeadAdsDisclaimerResponse r0 = new com.instagram.leadads.model.LeadAdsDisclaimerResponse
            r0.<init>()
            r0.A00 = r2
            r0.A01 = r1
            r7.add(r0)
            goto L_0x00a3
        L_0x00c0:
            r7 = r3
        L_0x00c1:
            java.lang.String r0 = "igUserId"
            java.lang.Object r2 = r9.A00(r0)
            java.lang.String r2 = (java.lang.String) r2
            java.security.SecureRandom r0 = new java.security.SecureRandom
            r0.<init>()
            int r0 = r0.nextInt()
            int r19 = java.lang.Math.abs(r0)
            X.WYW r8 = r5.A01
            java.lang.String r10 = r8.A05
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            java.lang.String r0 = java.lang.String.valueOf(r19)
            java.lang.String r1 = "submission_session_id"
            r9.putString(r1, r0)
            java.lang.String r11 = "lead_form_api"
            java.lang.String r12 = "submit_lead_form"
            java.lang.String r13 = "impression"
            r8.Cgq(r9, r10, r11, r12, r13)
            com.instagram.leadads.repository.LeadFormRepository r0 = r5.A02
            r20 = r0
            java.lang.String r13 = r5.A03
            java.lang.String r12 = r5.A06
            java.lang.String r8 = r5.A04
            java.lang.String r9 = r5.A05
            X.2EG r0 = X.2EG.A3N
            boolean r9 = X.Dba.A1X(r0, r9)
            r11 = 0
            X.AnonymousClass7TF.A1B(r13, r11, r12)
            r14 = 0
            r10 = 0
            java.lang.String r18 = X.AnonymousClass7TG.A0j()
            java.lang.String r16 = "0"
            if (r8 == 0) goto L_0x0118
            int r0 = r8.length()
            if (r0 == 0) goto L_0x0118
            r14 = r8
        L_0x0118:
            if (r9 == 0) goto L_0x011c
            java.lang.String r10 = "IG_RECON"
        L_0x011c:
            java.lang.Integer r17 = java.lang.Integer.valueOf(r19)
            java.util.concurrent.ConcurrentMap r0 = X.C18709Vye.A00
            java.io.StringWriter r9 = new java.io.StringWriter     // Catch:{ IOException -> 0x01dc }
            r9.<init>()     // Catch:{ IOException -> 0x01dc }
            X.17W r8 = X.AnonymousClass7TF.A0K(r9)     // Catch:{ IOException -> 0x01dc }
            java.lang.String r0 = "input"
            r8.A0q(r0)     // Catch:{ IOException -> 0x01dc }
            r8.A0c()     // Catch:{ IOException -> 0x01dc }
            java.lang.String r15 = "client_mutation_id"
            r0 = r18
            r8.A0R(r15, r0)     // Catch:{ IOException -> 0x01dc }
            java.lang.String r15 = "actor_id"
            r0 = r16
            r8.A0R(r15, r0)     // Catch:{ IOException -> 0x01dc }
            if (r7 == 0) goto L_0x0175
            java.lang.String r0 = "disclaimer_responses"
            java.util.Iterator r16 = X.C41845B3m.A0s(r8, r0, r7)     // Catch:{ IOException -> 0x01dc }
        L_0x0149:
            boolean r0 = r16.hasNext()     // Catch:{ IOException -> 0x01dc }
            if (r0 == 0) goto L_0x0172
            java.lang.Object r15 = r16.next()     // Catch:{ IOException -> 0x01dc }
            com.instagram.leadads.model.LeadAdsDisclaimerResponse r15 = (com.instagram.leadads.model.LeadAdsDisclaimerResponse) r15     // Catch:{ IOException -> 0x01dc }
            if (r15 == 0) goto L_0x0149
            r8.A0c()     // Catch:{ IOException -> 0x01dc }
            java.lang.String r7 = r15.A00     // Catch:{ IOException -> 0x01dc }
            if (r7 == 0) goto L_0x0163
            java.lang.String r0 = "checkbox_key"
            r8.A0R(r0, r7)     // Catch:{ IOException -> 0x01dc }
        L_0x0163:
            boolean r7 = r15.A01     // Catch:{ IOException -> 0x01dc }
            r0 = 3421(0xd5d, float:4.794E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x01dc }
            r8.A0S(r0, r7)     // Catch:{ IOException -> 0x01dc }
            r8.A0Z()     // Catch:{ IOException -> 0x01dc }
            goto L_0x0149
        L_0x0172:
            r8.A0Y()     // Catch:{ IOException -> 0x01dc }
        L_0x0175:
            if (r14 == 0) goto L_0x0180
            r0 = 4732(0x127c, float:6.631E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x01dc }
            r8.A0R(r0, r14)     // Catch:{ IOException -> 0x01dc }
        L_0x0180:
            if (r10 == 0) goto L_0x0187
            java.lang.String r0 = "lead_gen_info_source"
            r8.A0R(r0, r10)     // Catch:{ IOException -> 0x01dc }
        L_0x0187:
            if (r17 == 0) goto L_0x018e
            r0 = r19
            r8.A0P(r1, r0)     // Catch:{ IOException -> 0x01dc }
        L_0x018e:
            java.lang.String r0 = "ad_id"
            r8.A0R(r0, r13)     // Catch:{ IOException -> 0x01dc }
            java.lang.String r0 = "lead_gen_data_id"
            r8.A0R(r0, r6)     // Catch:{ IOException -> 0x01dc }
            java.lang.String r0 = "ad_impression_client_token"
            r8.A0R(r0, r12)     // Catch:{ IOException -> 0x01dc }
            if (r2 == 0) goto L_0x01a4
            java.lang.String r0 = "submitted_to_ig_user_id"
            r8.A0R(r0, r2)     // Catch:{ IOException -> 0x01dc }
        L_0x01a4:
            java.lang.String r0 = "fields_data"
            java.util.Iterator r4 = X.C41845B3m.A0s(r8, r0, r4)     // Catch:{ IOException -> 0x01dc }
        L_0x01aa:
            boolean r0 = r4.hasNext()     // Catch:{ IOException -> 0x01dc }
            if (r0 == 0) goto L_0x01d1
            java.lang.Object r2 = r4.next()     // Catch:{ IOException -> 0x01dc }
            com.instagram.leadads.model.LeadAdsInputFieldResponse r2 = (com.instagram.leadads.model.LeadAdsInputFieldResponse) r2     // Catch:{ IOException -> 0x01dc }
            if (r2 == 0) goto L_0x01aa
            r8.A0c()     // Catch:{ IOException -> 0x01dc }
            java.lang.String r1 = r2.A02     // Catch:{ IOException -> 0x01dc }
            if (r1 == 0) goto L_0x01c4
            java.lang.String r0 = "field_key"
            r8.A0R(r0, r1)     // Catch:{ IOException -> 0x01dc }
        L_0x01c4:
            java.lang.String r1 = r2.A01     // Catch:{ IOException -> 0x01dc }
            if (r1 == 0) goto L_0x01cd
            java.lang.String r0 = "values"
            r8.A0R(r0, r1)     // Catch:{ IOException -> 0x01dc }
        L_0x01cd:
            r8.A0Z()     // Catch:{ IOException -> 0x01dc }
            goto L_0x01aa
        L_0x01d1:
            r8.A0Y()     // Catch:{ IOException -> 0x01dc }
            r8.A0Z()     // Catch:{ IOException -> 0x01dc }
            java.lang.String r4 = X.AnonymousClass7TG.A0k(r8, r9)     // Catch:{ IOException -> 0x01dc }
            goto L_0x01e4
        L_0x01dc:
            r1 = move-exception
            java.lang.String r0 = "Failed to serialize query param for lead form submission"
            X.0wb.A07(r0, r1)
            java.lang.String r4 = ""
        L_0x01e4:
            java.lang.Class<X.D1K> r1 = X.D1K.class
            java.lang.String r0 = "LeadGenDeepLinkUserInfoCreateMutation"
            X.UmO r2 = new X.UmO
            r2.<init>(r1, r0, r4, r11)
            r0 = r20
            com.instagram.common.session.UserSession r0 = r0.A00
            X.3Fb r1 = X.C46479Dfi.A01(r0)
            r1.A09(r2)
            java.lang.String r0 = "lead_gen_policy"
            r1.A08 = r0
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.1OC r1 = r1.A07(r0)
            r0 = 477322560(0x1c735d40, float:8.052248E-22)
            X.032 r2 = r1.A03(r0)
            r1 = 21
            X.MFy r0 = new X.MFy
            r0.<init>(r1, r3)
            X.MC0 r2 = X.JUM.A00(r0, r2)
            r1 = 22
            X.MFy r0 = new X.MFy
            r0.<init>(r1, r3)
            X.MCA r2 = X.JUM.A01(r0, r2)
            r1 = 8
            X.WvV r0 = new X.WvV
            r0.<init>(r5, r3, r1)
            X.DbY.A19(r5, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14766U8c.A00(java.util.List, java.util.List, java.lang.String):void");
    }

    public C14766U8c() {
        1HR A0f = C13990Tnq.A0f();
        this.A00 = A0f;
        this.A01 = 0u9.A04(A0f);
    }
}
