package X;

import android.content.Context;

/* renamed from: X.ImJ  reason: case insensitive filesystem */
public final class C58097ImJ extends AnonymousClass1Ek implements 0sL {
    public Object A00;
    public final int A01 = 1;
    public final long A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58097ImJ(Context context, AnonymousClass07Z r3, C53033GhO ghO, AnonymousClass4D7 r5, 0sP r6, long j, boolean z) {
        super(2, r5);
        this.A06 = ghO;
        this.A03 = context;
        this.A02 = j;
        this.A04 = r3;
        this.A05 = r6;
        this.A07 = z;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.4D7, X.ImJ] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r15) {
        int i = this.A01;
        AnonymousClass4D7 r8 = r15;
        C53033GhO ghO = (C53033GhO) this.A06;
        if (i != 0) {
            C58097ImJ imJ = new C58097ImJ((Context) this.A03, (AnonymousClass07Z) this.A04, ghO, r8, (0sP) this.A05, this.A02, this.A07);
            imJ.A00 = obj;
            return imJ;
        }
        Context context = (Context) this.A03;
        long j = this.A02;
        return new C58097ImJ(context, (AnonymousClass07Z) this.A04, (C56122HtA) this.A00, ghO, r8, (0sP) this.A05, j, this.A07);
    }

    /* JADX WARNING: type inference failed for: r4v4, types: [X.Icq] */
    /* JADX WARNING: type inference failed for: r4v8, types: [X.Ict] */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01b5, code lost:
        if (r6.length() == 0) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0309, code lost:
        if (r5 == null) goto L_0x0165;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x030d, code lost:
        if (r6 != null) goto L_0x015a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ed, code lost:
        if (r14 != null) goto L_0x00e2;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0118 A[SYNTHETIC, Splitter:B:61:0x0118] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r33) {
        /*
            r32 = this;
            r2 = r32
            int r0 = r2.A01
            if (r0 == 0) goto L_0x003d
            X.0eS.A00(r33)
            java.lang.Object r3 = r2.A00
            X.4Cq r3 = (X.C262224Cq) r3
            java.lang.Object r8 = r2.A06
            X.GhO r8 = (X.C53033GhO) r8
            com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession r7 = r8.A00
            if (r7 == 0) goto L_0x003a
            r9 = 0
            java.lang.Object r5 = r2.A03
            android.content.Context r5 = (android.content.Context) r5
            long r11 = r2.A02
            java.lang.Object r6 = r2.A04
            X.07Z r6 = (X.AnonymousClass07Z) r6
            java.lang.Object r10 = r2.A05
            X.0sP r10 = (X.0sP) r10
            boolean r13 = r2.A07
            com.meta.metaai.components.voice.viewmodel.MetaAiVoiceSessionViewModel$startVoiceSession$4$1$1 r4 = new com.meta.metaai.components.voice.viewmodel.MetaAiVoiceSessionViewModel$startVoiceSession$4$1$1
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r13)
            X.19B r2 = X.19B.A00
            X.1Eo.A05(r2, r4, r3)
            r1 = 34
            X.MGC r0 = new X.MGC
            r0.<init>((java.lang.Object) r7, (java.lang.Object) r8, (X.AnonymousClass4D7) r9, (int) r1)
            X.1Eo.A05(r2, r0, r3)
        L_0x003a:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x003d:
            X.0eS.A00(r33)
            java.lang.Object r13 = r2.A06
            X.GhO r13 = (X.C53033GhO) r13
            java.lang.Object r11 = r2.A00
            X.HtA r11 = (X.C56122HtA) r11
            java.lang.Object r12 = r2.A03
            android.content.Context r12 = (android.content.Context) r12
            long r0 = r2.A02
            r30 = r0
            java.lang.Object r10 = r2.A04
            X.07Z r10 = (X.AnonymousClass07Z) r10
            java.lang.Object r9 = r2.A05
            X.0sP r9 = (X.0sP) r9
            boolean r0 = r2.A07
            r29 = r0
            X.PrD r8 = r11.A00
            com.facebook.rsys.metaaivoicestate.gen.MetaAiVoiceState r14 = r11.A01
            if (r14 == 0) goto L_0x00bb
            com.facebook.rsys.metaaivoicestate.gen.MetaAiUserContent r0 = r14.userContent
            if (r0 == 0) goto L_0x00bb
            com.facebook.rsys.metaaivoicestate.gen.MetaAiCaption r0 = r0.caption
            if (r0 == 0) goto L_0x00bb
            java.lang.String r0 = r0.text
            if (r0 == 0) goto L_0x00bb
            X.05G r7 = r13.A0A
        L_0x0070:
            java.lang.Object r6 = r7.getValue()
            r0 = r6
            X.I4Z r0 = (X.I4Z) r0
            java.lang.String r1 = r0.A05
            r21 = r1
            java.lang.String r1 = r0.A06
            r22 = r1
            java.lang.CharSequence r1 = r0.A03
            r19 = r1
            X.HMJ r1 = r0.A01
            r18 = r1
            r23 = 0
            boolean r1 = r0.A0A
            r17 = r1
            boolean r1 = r0.A08
            r16 = r1
            boolean r15 = r0.A07
            boolean r5 = r0.A0B
            android.net.Uri r4 = r0.A00
            java.lang.Integer r3 = r0.A04
            X.JMQ r2 = r0.A02
            boolean r1 = r0.A09
            X.I4Z r0 = new X.I4Z
            r24 = r17
            r25 = r16
            r26 = r15
            r27 = r5
            r28 = r1
            r17 = r18
            r18 = r2
            r20 = r3
            r15 = r0
            r16 = r4
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            boolean r0 = r7.AIY(r6, r0)
            if (r0 == 0) goto L_0x0070
        L_0x00bb:
            boolean r0 = r8 instanceof X.C71754OqG
            if (r0 != 0) goto L_0x0115
            boolean r0 = r8 instanceof X.C71755OqH
            if (r0 != 0) goto L_0x0115
            boolean r0 = r8 instanceof X.N4y
            if (r0 == 0) goto L_0x00f2
            X.HMJ r7 = X.HMJ.ENDED
        L_0x00c9:
            r3 = 0
            if (r14 == 0) goto L_0x00f0
            com.facebook.rsys.metaaivoicestate.gen.MetaAiUserContent r0 = r14.userContent
            if (r0 == 0) goto L_0x00f0
            com.facebook.rsys.metaaivoicestate.gen.MetaAiCaption r0 = r0.caption
            if (r0 == 0) goto L_0x00f0
            java.lang.String r6 = r0.text
        L_0x00d6:
            if (r14 == 0) goto L_0x00ec
            com.facebook.rsys.metaaivoicestate.gen.MetaAiBotContent r0 = r14.botContent
            if (r0 == 0) goto L_0x00ec
            com.facebook.rsys.metaaivoicestate.gen.MetaAiCaption r0 = r0.caption
            if (r0 == 0) goto L_0x00ec
            java.lang.String r5 = r0.text
        L_0x00e2:
            com.facebook.rsys.metaaivoicestate.gen.MetaAiBotContent r0 = r14.botContent
            if (r0 == 0) goto L_0x00e8
            java.lang.String r3 = r0.llmResponseContents
        L_0x00e8:
            r1 = 0
            if (r3 == 0) goto L_0x0139
            goto L_0x0118
        L_0x00ec:
            r5 = r3
            if (r14 == 0) goto L_0x00e8
            goto L_0x00e2
        L_0x00f0:
            r6 = r3
            goto L_0x00d6
        L_0x00f2:
            boolean r0 = r8 instanceof X.C71753OqF
            if (r0 == 0) goto L_0x031b
            if (r14 == 0) goto L_0x0112
            int r2 = r14.state
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0 = 1
            if (r1 == 0) goto L_0x0112
            if (r2 != r0) goto L_0x0106
            X.HMJ r7 = X.HMJ.LISTENING
            goto L_0x00c9
        L_0x0106:
            r0 = 2
            if (r2 != r0) goto L_0x010c
            X.HMJ r7 = X.HMJ.THINKING
            goto L_0x00c9
        L_0x010c:
            r0 = 3
            if (r2 != r0) goto L_0x0112
            X.HMJ r7 = X.HMJ.RESPONDING
            goto L_0x00c9
        L_0x0112:
            X.HMJ r7 = X.HMJ.AMBIENT
            goto L_0x00c9
        L_0x0115:
            X.HMJ r7 = X.HMJ.CONNECTING
            goto L_0x00c9
        L_0x0118:
            com.google.gson.Gson r2 = new com.google.gson.Gson     // Catch:{ Exception -> 0x0127 }
            r2.<init>()     // Catch:{ Exception -> 0x0127 }
            java.lang.Class<com.facebook.rp.platform.metaai.rsys.voicestate.LLMResponse> r0 = com.facebook.rp.platform.metaai.rsys.voicestate.LLMResponse.class
            java.lang.Object r0 = r2.A08(r3, r0)     // Catch:{ Exception -> 0x0127 }
            com.facebook.rp.platform.metaai.rsys.voicestate.LLMResponse r0 = (com.facebook.rp.platform.metaai.rsys.voicestate.LLMResponse) r0     // Catch:{ Exception -> 0x0127 }
            r1 = r0
            goto L_0x0139
        L_0x0127:
            r0 = move-exception
            X.OWb r3 = X.C71004OWb.A00
            java.lang.String r2 = "Failed to parse LLMResponse: "
            java.lang.String r0 = r0.getMessage()
            java.lang.String r2 = X.002.A0R(r2, r0)
            java.lang.String r0 = "LLMResponse"
            r3.A00(r0, r2)
        L_0x0139:
            X.HMJ r14 = X.HMJ.RESPONDING
            if (r7 != r14) goto L_0x0148
            if (r6 != 0) goto L_0x0143
            if (r5 != 0) goto L_0x0143
            if (r1 == 0) goto L_0x0148
        L_0x0143:
            X.0sa r0 = r13.A04
            r0.invoke()
        L_0x0148:
            X.05G r0 = r13.A0A
            r28 = r0
            java.lang.Object r0 = r28.getValue()
            X.I4Z r0 = (X.I4Z) r0
            java.lang.String r0 = r0.A06
            if (r7 != r14) goto L_0x030d
            if (r5 == 0) goto L_0x030d
            r0 = 0
        L_0x0159:
            r6 = r0
        L_0x015a:
            java.lang.Object r0 = r28.getValue()
            X.I4Z r0 = (X.I4Z) r0
            java.lang.String r0 = r0.A05
            if (r6 == 0) goto L_0x0309
            r0 = 0
        L_0x0165:
            r5 = r0
        L_0x0166:
            if (r6 == 0) goto L_0x0303
            r1 = 0
        L_0x0169:
            r13.A01 = r1
            r4 = 0
            if (r1 == 0) goto L_0x018a
            com.facebook.rp.platform.metaai.rsys.voicestate.GenAIViewModels r1 = r1.genAIViewModels
            if (r1 == 0) goto L_0x018a
            com.facebook.rp.platform.metaai.rsys.voicestate.ImagineViewModel r0 = r1.imagineViewModel
            if (r0 == 0) goto L_0x024f
            com.facebook.rp.platform.metaai.rsys.voicestate.ImagineRawData[] r3 = r0.imagineRawData
            if (r3 == 0) goto L_0x024f
            r2 = 0
            int r0 = r3.length
            if (r0 != 0) goto L_0x024b
            r0 = 0
        L_0x017f:
            if (r0 == 0) goto L_0x024f
            java.lang.String r0 = r0.uri
            if (r0 == 0) goto L_0x024f
            X.Ict r4 = new X.Ict
            r4.<init>(r0)
        L_0x018a:
            if (r4 == 0) goto L_0x0191
            X.0sa r0 = r13.A04
            r0.invoke()
        L_0x0191:
            boolean r0 = r4 instanceof X.C57566Ict
            if (r0 != 0) goto L_0x0247
            boolean r0 = r4 instanceof X.C57563Icq
            if (r0 != 0) goto L_0x0247
            java.lang.Integer r2 = X.AnonymousClass05K.A01
        L_0x019b:
            java.lang.Object r0 = r28.getValue()
            X.I4Z r0 = (X.I4Z) r0
            java.lang.CharSequence r15 = r0.A03
            java.lang.Object r0 = r28.getValue()
            X.I4Z r0 = (X.I4Z) r0
            boolean r3 = r0.A0C
            boolean r1 = r11.A03
            if (r6 == 0) goto L_0x01b7
            int r0 = r6.length()
            r16 = 0
            if (r0 != 0) goto L_0x01b9
        L_0x01b7:
            r16 = 1
        L_0x01b9:
            r0 = 0
            if (r16 == 0) goto L_0x0213
            if (r3 != 0) goto L_0x0213
            X.HMJ r3 = X.HMJ.AMBIENT
            if (r7 == r3) goto L_0x01c6
            X.HMJ r3 = X.HMJ.LISTENING
            if (r7 != r3) goto L_0x0213
        L_0x01c6:
            r0 = 2131966411(0x7f1339cb, float:1.956966E38)
            if (r1 == 0) goto L_0x01ce
            r0 = 2131966410(0x7f1339ca, float:1.9569657E38)
        L_0x01ce:
            java.lang.String r0 = r12.getString(r0)
        L_0x01d2:
            java.lang.Object r13 = r28.getValue()
            r3 = r13
            X.I4Z r3 = (X.I4Z) r3
            r23 = r1 ^ 1
            boolean r8 = r11.A02
            r24 = r8 ^ 1
            boolean r14 = r3.A0C
            boolean r12 = r3.A07
            boolean r10 = r3.A0B
            android.net.Uri r9 = r3.A00
            boolean r8 = r3.A09
            r3 = 10
            X.0qQ.A0B(r2, r3)
            X.I4Z r3 = new X.I4Z
            r20 = r5
            r21 = r6
            r22 = r14
            r25 = r12
            r26 = r10
            r27 = r8
            r14 = r3
            r15 = r9
            r16 = r7
            r17 = r4
            r18 = r0
            r19 = r2
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r8 = r28
            boolean r3 = r8.AIY(r13, r3)
            if (r3 == 0) goto L_0x01d2
            goto L_0x003a
        L_0x0213:
            if (r6 == 0) goto L_0x0223
            int r3 = r6.length()
            if (r3 == 0) goto L_0x0223
            X.HMJ r3 = X.HMJ.AMBIENT
            if (r7 == r3) goto L_0x01d2
            X.HMJ r3 = X.HMJ.LISTENING
            if (r7 == r3) goto L_0x01d2
        L_0x0223:
            if (r7 == r14) goto L_0x01d2
            X.HMJ r3 = X.HMJ.THINKING
            if (r7 == r3) goto L_0x01d2
            boolean r3 = r8 instanceof X.N4y
            if (r3 == 0) goto L_0x0245
            X.4Co r3 = r13.A02
            if (r3 == 0) goto L_0x0234
            r3.AG7(r0)
        L_0x0234:
            r13.A02 = r0
            r14 = r12
            r15 = r10
            r16 = r13
            r17 = r9
            r18 = r30
            r20 = r29
            android.text.SpannableString r0 = X.C53033GhO.A00(r14, r15, r16, r17, r18, r20)
            goto L_0x01d2
        L_0x0245:
            r0 = r15
            goto L_0x01d2
        L_0x0247:
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            goto L_0x019b
        L_0x024b:
            r0 = r3[r2]
            goto L_0x017f
        L_0x024f:
            com.facebook.rp.platform.metaai.rsys.voicestate.ReelsViewModel r0 = r1.reelsViewModel
            if (r0 == 0) goto L_0x02c8
            com.facebook.rp.platform.metaai.rsys.voicestate.ReelsData[] r0 = r0.reelsData
            if (r0 == 0) goto L_0x02c8
            java.util.List r1 = X.03t.A0J(r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x018a
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r15 = r1.iterator()
        L_0x0269:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x028f
            java.lang.Object r2 = r15.next()
            r4 = r2
            com.facebook.rp.platform.metaai.rsys.voicestate.ReelsData r4 = (com.facebook.rp.platform.metaai.rsys.voicestate.ReelsData) r4
            java.lang.String r0 = r4.thumbnailUrl
            r1 = 1
            if (r0 == 0) goto L_0x0269
            boolean r0 = X.C51966G9m.A1X(r0)
            if (r0 != r1) goto L_0x0269
            java.lang.String r0 = r4.reelsUrl
            if (r0 == 0) goto L_0x0269
            boolean r0 = X.C51966G9m.A1X(r0)
            if (r0 != r1) goto L_0x0269
            r3.add(r2)
            goto L_0x0269
        L_0x028f:
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r3)
            java.util.Iterator r16 = r3.iterator()
        L_0x0297:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x02ba
            java.lang.Object r1 = r16.next()
            com.facebook.rp.platform.metaai.rsys.voicestate.ReelsData r1 = (com.facebook.rp.platform.metaai.rsys.voicestate.ReelsData) r1
            java.lang.String r15 = r1.reelsUrl
            java.lang.String r0 = "Required value was null."
            if (r15 == 0) goto L_0x0316
            java.lang.String r4 = r1.thumbnailUrl
            if (r4 == 0) goto L_0x0311
            java.lang.String r3 = r1.author
            java.lang.String r1 = r1.profilePictureUrl
            X.Icr r0 = new X.Icr
            r0.<init>(r15, r4, r3, r1)
            r2.add(r0)
            goto L_0x0297
        L_0x02ba:
            r1 = 19
            X.In7 r0 = new X.In7
            r0.<init>(r13, r1)
            X.Icq r4 = new X.Icq
            r4.<init>(r0, r2)
            goto L_0x018a
        L_0x02c8:
            com.facebook.rp.platform.metaai.rsys.voicestate.SearchViewModel r0 = r1.searchViewModel
            if (r0 == 0) goto L_0x018a
            java.lang.String r15 = r0.searchEngineIconUrl
            java.lang.String r3 = r0.searchQuery
            java.lang.String r2 = r0.attributionLink
            if (r15 == 0) goto L_0x018a
            if (r3 == 0) goto L_0x018a
            if (r2 == 0) goto L_0x018a
            java.lang.String r0 = r0.sourceUrl
            r16 = r0
            boolean r23 = X.AnonymousClass7TF.A1V(r16)
            r0 = 20
            X.In7 r1 = new X.In7
            r1.<init>(r13, r0)
            r4 = 21
            X.In7 r0 = new X.In7
            r0.<init>(r13, r4)
            X.Ics r4 = new X.Ics
            r19 = r2
            r20 = r16
            r21 = r1
            r22 = r0
            r16 = r4
            r17 = r15
            r18 = r3
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            goto L_0x018a
        L_0x0303:
            if (r1 != 0) goto L_0x0169
            com.facebook.rp.platform.metaai.rsys.voicestate.LLMResponse r1 = r13.A01
            goto L_0x0169
        L_0x0309:
            if (r5 != 0) goto L_0x0166
            goto L_0x0165
        L_0x030d:
            if (r6 != 0) goto L_0x015a
            goto L_0x0159
        L_0x0311:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0316:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x031b:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58097ImJ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C58097ImJ) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58097ImJ(Context context, AnonymousClass07Z r3, C56122HtA htA, C53033GhO ghO, AnonymousClass4D7 r6, 0sP r7, long j, boolean z) {
        super(2, r6);
        this.A06 = ghO;
        this.A00 = htA;
        this.A03 = context;
        this.A02 = j;
        this.A04 = r3;
        this.A05 = r7;
        this.A07 = z;
    }
}
