package X;

/* renamed from: X.NLy  reason: case insensitive filesystem */
public final class C68527NLy extends 1P0 {
    public final /* synthetic */ 1kM A00;
    public final /* synthetic */ C66161kJ A01;

    public C68527NLy(1kM r1, C66161kJ r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [X.1qK, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0041, code lost:
        if (r12 != 61) goto L_0x0043;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01e4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r26) {
        /*
            r25 = this;
            r1 = r26
            r0 = 1461574572(0x571ddbac, float:1.73566809E14)
            int r9 = X.AnonymousClass0fD.A03(r0)
            X.NHV r1 = (X.NHV) r1
            r0 = 830247900(0x317c93dc, float:3.6754875E-9)
            int r4 = X.AnonymousClass7TG.A0D(r1, r0)
            r7 = r25
            X.1kJ r0 = r7.A01
            int r2 = r0.A00
            com.instagram.direct.prompts.DirectPromptTypes r3 = X.AnonymousClass79B.A00(r2)
            X.1kM r2 = r7.A00
            X.0eM r5 = r2.A04
            java.lang.Object r13 = r5.getValue()
            X.7IQ r13 = (X.AnonymousClass7IQ) r13
            com.instagram.model.direct.DirectThreadKey r5 = r0.C6K()
            java.lang.String r6 = r5.A00
            com.instagram.model.direct.DirectThreadKey r5 = r0.C6K()
            java.lang.String r5 = r5.A01
            int r12 = r0.A03
            int r11 = r0.A02
            r8 = 4
            r10 = 28
            if (r12 == r10) goto L_0x01bd
            r10 = 29
            if (r12 == r10) goto L_0x01a4
            r5 = 61
            if (r12 == r5) goto L_0x01bd
        L_0x0043:
            com.instagram.direct.prompts.DirectPromptTypes r5 = com.instagram.direct.prompts.DirectPromptTypes.DAILY_PROMPT
            java.lang.String r13 = "Required value was null."
            if (r3 != r5) goto L_0x00a5
            int r6 = r0.A03
            r5 = 29
            if (r6 != r5) goto L_0x00a5
            com.instagram.common.session.UserSession r10 = r2.A00
            X.78u r6 = X.C3269578u.A00
            java.lang.Class<X.78v> r5 = X.C3269678v.class
            java.lang.Object r11 = r10.A01(r5, r6)
            X.78v r11 = (X.C3269678v) r11
            com.instagram.model.direct.DirectThreadKey r5 = r0.C6K()
            java.lang.String r10 = r5.A00
            if (r10 == 0) goto L_0x01e4
            java.lang.String r6 = r1.A01
            if (r6 == 0) goto L_0x01da
            java.util.Map r5 = r11.A00
            r5.put(r10, r6)
            X.0eM r5 = r2.A03
            java.lang.Object r14 = r5.getValue()
            X.MfP r14 = (X.C66930MfP) r14
            com.instagram.model.direct.DirectThreadKey r5 = r0.C6K()
            java.lang.String r15 = r5.A00
            com.instagram.model.direct.DirectThreadKey r5 = r0.C6K()
            java.lang.String r6 = r5.A01
            int r5 = r0.A02
            java.lang.String r11 = r0.A07()
            java.lang.String r12 = r1.A01
            if (r12 == 0) goto L_0x01da
            java.lang.String r10 = "daily_prompt_text"
            X.0eP r11 = X.AnonymousClass7TE.A1L(r10, r11)
            java.lang.String r10 = "prompt_id"
            java.util.LinkedHashMap r21 = X.DbY.A0p(r10, r12, r11)
            java.lang.String r17 = "daily_prompt_start_successful"
            java.lang.String r18 = "impression"
            java.lang.String r19 = "send_button"
            java.lang.String r20 = "daily_prompt_null_creation_sheet"
            r22 = r5
            r16 = r6
            X.C66930MfP.A02(r14, r15, r16, r17, r18, r19, r20, r21, r22)
        L_0x00a5:
            com.instagram.direct.prompts.DirectPromptTypes r5 = com.instagram.direct.prompts.DirectPromptTypes.CHALLENGES
            if (r3 != r5) goto L_0x017a
            int r5 = r0.A03
            r3 = 29
            if (r5 != r3) goto L_0x017a
            com.instagram.common.session.UserSession r6 = r2.A00
            X.Pk9 r5 = X.C73810Pk9.A00
            java.lang.Class<X.Oxt> r3 = X.C72184Oxt.class
            java.lang.Object r10 = r6.A01(r3, r5)
            X.Oxt r10 = (X.C72184Oxt) r10
            com.instagram.model.direct.DirectThreadKey r3 = r0.C6K()
            java.lang.String r6 = r3.A00
            if (r6 == 0) goto L_0x01d2
            java.lang.String r5 = r1.A01
            if (r5 == 0) goto L_0x01da
            java.util.Map r3 = r10.A00
            r3.put(r6, r5)
            X.0eM r3 = r2.A02
            X.OyR r16 = X.C66580MXl.A0T(r3)
            com.instagram.model.direct.DirectThreadKey r3 = r0.C6K()
            java.lang.String r13 = r3.A00
            com.instagram.model.direct.DirectThreadKey r3 = r0.C6K()
            java.lang.String r3 = r3.A01
            int r12 = r0.A02
            java.lang.String r11 = r0.A07()
            X.ULw r5 = r0.A04
            r15 = 0
            if (r5 == 0) goto L_0x01a1
            int r10 = r5.A01
        L_0x00eb:
            kotlin.enums.EnumEntries r5 = X.C69373NkD.A04
            java.util.Iterator r14 = r5.iterator()
        L_0x00f1:
            boolean r5 = r14.hasNext()
            if (r5 == 0) goto L_0x019e
            java.lang.Object r6 = r14.next()
            r5 = r6
            X.NkD r5 = (X.C69373NkD) r5
            int r5 = r5.A02
            if (r5 != r10) goto L_0x00f1
        L_0x0102:
            X.NkD r6 = (X.C69373NkD) r6
            if (r6 != 0) goto L_0x0108
            X.NkD r6 = X.C69373NkD.SHOUTOUT
        L_0x0108:
            java.lang.String r10 = r6.A03
            if (r10 != 0) goto L_0x0116
            X.ULw r5 = r0.A04
            if (r5 == 0) goto L_0x0114
            java.lang.String r10 = r5.A03
            if (r10 != 0) goto L_0x0116
        L_0x0114:
            java.lang.String r10 = ""
        L_0x0116:
            X.ULw r5 = r0.A04
            if (r5 == 0) goto L_0x0125
            java.lang.String r0 = r5.A03
            if (r0 == 0) goto L_0x0125
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0125
            r15 = 1
        L_0x0125:
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.SECONDS
            if (r5 == 0) goto L_0x019b
            int r0 = r5.A00
            long r5 = (long) r0
        L_0x012c:
            long r5 = r14.toDays(r5)
            int r0 = (int) r5
            java.lang.String r5 = r1.A01
            if (r5 == 0) goto L_0x01da
            X.0qQ.A0B(r10, r8)
            java.lang.Integer r17 = java.lang.Integer.valueOf(r12)
            java.lang.String r6 = "challenge_prompt"
            X.0eP r8 = X.AnonymousClass7TE.A1L(r6, r11)
            java.lang.String r6 = "selected_prize"
            X.0eP r10 = X.AnonymousClass7TE.A1L(r6, r10)
            if (r15 == 0) goto L_0x0198
            java.lang.String r11 = "True"
        L_0x014c:
            java.lang.String r6 = "custom_prize"
            X.0eP r6 = X.AnonymousClass7TE.A1L(r6, r11)
            java.lang.String r11 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "selected_duration_days"
            X.0eP r11 = X.AnonymousClass7TE.A1L(r0, r11)
            java.lang.String r0 = "challenge_id"
            X.0eP r0 = X.AnonymousClass7TE.A1L(r0, r5)
            X.0eP[] r0 = new X.0eP[]{r8, r10, r6, r11, r0}
            java.util.LinkedHashMap r24 = X.0Yt.A06(r0)
            java.lang.String r20 = "challenge_start_successful"
            java.lang.String r21 = "impression"
            java.lang.String r22 = "challenge_start"
            java.lang.String r23 = "thread_view"
            r15 = 0
            r18 = r13
            r19 = r3
            X.C72202OyR.A03(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
        L_0x017a:
            com.instagram.common.session.UserSession r0 = r2.A00
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r0)
            X.78m r0 = new X.78m
            r0.<init>()
            r2.A00(r0)
            X.C68527NLy.super.onSuccess(r1)
            r0 = 1501155576(0x5979d0f8, float:4.39481455E15)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 397384501(0x17af9b35, float:1.134829E-24)
            X.AnonymousClass0fD.A0A(r0, r9)
            return
        L_0x0198:
            java.lang.String r11 = "False"
            goto L_0x014c
        L_0x019b:
            r5 = 0
            goto L_0x012c
        L_0x019e:
            r6 = 0
            goto L_0x0102
        L_0x01a1:
            r10 = 0
            goto L_0x00eb
        L_0x01a4:
            X.OyG r10 = X.C66583MXo.A0Q(r13)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.util.Map r17 = X.C66584MXp.A0g(r3)
            java.lang.String r14 = "direct_question_tab_send_success"
            java.lang.String r15 = "impression"
            java.lang.String r16 = "prompt"
            r12 = r6
            r13 = r5
            X.C72195OyG.A00(r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0043
        L_0x01bd:
            X.OyH r12 = X.C66583MXo.A0R(r13)
            X.EZp r10 = X.C48147EZp.PROMPT
            X.EZo r11 = X.C48146EZo.THREAD_VIEW
            java.util.Map r15 = X.C66584MXp.A0g(r3)
            java.lang.String r13 = "direct_question_tab_send_success"
            java.lang.String r14 = "impression"
            X.C72196OyH.A00(r10, r11, r12, r13, r14, r15)
            goto L_0x0043
        L_0x01d2:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r13)
            r0 = 179115244(0xaad14ec, float:1.6667164E-32)
            goto L_0x01eb
        L_0x01da:
            java.lang.String r0 = "collectionId"
            X.0qQ.A0F(r0)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x01e4:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r13)
            r0 = 263739855(0xfb859cf, float:1.8178394E-29)
        L_0x01eb:
            X.AnonymousClass0fD.A0A(r0, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68527NLy.onSuccess(java.lang.Object):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0033, code lost:
        if (r6 != 61) goto L_0x0035;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0074  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFail(X.C268654dm r15) {
        /*
            r14 = this;
            r0 = -102558783(0xfffffffff9e313c1, float:-1.4738151E35)
            int r3 = X.AnonymousClass7TG.A0D(r15, r0)
            X.1kJ r0 = r14.A01
            int r1 = r0.A00
            com.instagram.direct.prompts.DirectPromptTypes r2 = X.AnonymousClass79B.A00(r1)
            X.1kM r1 = r14.A00
            X.0eM r4 = r1.A04
            java.lang.Object r7 = r4.getValue()
            X.7IQ r7 = (X.AnonymousClass7IQ) r7
            com.instagram.model.direct.DirectThreadKey r4 = r0.C6K()
            java.lang.String r8 = r4.A00
            com.instagram.model.direct.DirectThreadKey r4 = r0.C6K()
            java.lang.String r9 = r4.A01
            int r6 = r0.A03
            int r5 = r0.A02
            r4 = 28
            if (r6 == r4) goto L_0x00db
            r4 = 29
            if (r6 == r4) goto L_0x00c4
            r4 = 61
            if (r6 == r4) goto L_0x00db
        L_0x0035:
            com.instagram.direct.prompts.DirectPromptTypes r4 = com.instagram.direct.prompts.DirectPromptTypes.DAILY_PROMPT
            if (r2 != r4) goto L_0x0074
            int r5 = r0.A03
            r4 = 29
            if (r5 != r4) goto L_0x0074
            X.0eM r1 = r1.A03
            java.lang.Object r4 = r1.getValue()
            X.MfP r4 = (X.C66930MfP) r4
            com.instagram.model.direct.DirectThreadKey r1 = r0.C6K()
            java.lang.String r5 = r1.A00
            com.instagram.model.direct.DirectThreadKey r1 = r0.C6K()
            java.lang.String r6 = r1.A01
            int r12 = r0.A02
            java.lang.String r1 = r0.A07()
            java.lang.String r0 = "daily_prompt_text"
            java.util.Map r11 = X.AnonymousClass7TF.A0w(r0, r1)
            java.lang.String r7 = "daily_prompt_start_failure"
            java.lang.String r8 = "impression"
            java.lang.String r9 = "send_button"
            java.lang.String r10 = "daily_prompt_null_creation_sheet"
            X.C66930MfP.A02(r4, r5, r6, r7, r8, r9, r10, r11, r12)
        L_0x006a:
            X.C68527NLy.super.onFail(r15)
            r0 = -617038546(0xffffffffdb38bd2e, float:-5.1999401E16)
            X.AnonymousClass0fD.A0A(r0, r3)
            return
        L_0x0074:
            com.instagram.direct.prompts.DirectPromptTypes r4 = com.instagram.direct.prompts.DirectPromptTypes.CHALLENGES
            if (r2 != r4) goto L_0x006a
            int r4 = r0.A03
            r2 = 29
            if (r4 != r2) goto L_0x006a
            X.0eM r2 = r1.A02
            X.OyR r5 = X.C66580MXl.A0T(r2)
            com.instagram.model.direct.DirectThreadKey r2 = r0.C6K()
            java.lang.String r7 = r2.A00
            com.instagram.model.direct.DirectThreadKey r2 = r0.C6K()
            java.lang.String r8 = r2.A01
            int r0 = r0.A02
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            java.lang.String r9 = "challenge_start_failure"
            java.lang.String r10 = "impression"
            java.lang.String r11 = "challenge_start"
            java.lang.String r12 = "challenge_null_creation_sheet"
            r4 = 0
            r13 = r4
            X.C72202OyR.A03(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            com.instagram.common.session.UserSession r0 = r1.A00
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r0)
            java.lang.Object r0 = r15.A00()
            X.1XR r0 = (X.1XR) r0
            if (r0 == 0) goto L_0x00c2
            int r0 = r0.getStatusCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L_0x00b9:
            X.AY2 r0 = new X.AY2
            r0.<init>(r1)
            r2.A00(r0)
            goto L_0x006a
        L_0x00c2:
            r1 = 0
            goto L_0x00b9
        L_0x00c4:
            X.OyG r6 = X.C66583MXo.A0Q(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            java.util.Map r13 = X.C66584MXp.A0g(r2)
            java.lang.String r10 = "direct_question_tab_send_error"
            java.lang.String r11 = "impression"
            java.lang.String r12 = "prompt"
            X.C72195OyG.A00(r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0035
        L_0x00db:
            X.OyH r6 = X.C66583MXo.A0R(r7)
            X.EZp r4 = X.C48147EZp.PROMPT
            X.EZo r5 = X.C48146EZo.THREAD_VIEW
            java.util.Map r9 = X.C66584MXp.A0g(r2)
            java.lang.String r7 = "direct_question_tab_send_error"
            java.lang.String r8 = "impression"
            X.C72196OyH.A00(r4, r5, r6, r7, r8, r9)
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68527NLy.onFail(X.4dm):void");
    }
}
