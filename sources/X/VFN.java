package X;

public abstract class VFN {
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0081, code lost:
        if (r3.CUG() != r10) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x010d, code lost:
        r0 = "threadFbid";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x016f, code lost:
        if (r3.CUG() != r10) goto L_0x0171;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.content.Context r29, com.instagram.common.session.UserSession r30, java.util.List r31, java.util.List r32) {
        /*
            r1 = 0
            r15 = r29
            r11 = r30
            boolean r10 = X.AnonymousClass7TF.A1U(r1, r15, r11)
            X.2Dm r19 = X.1bJ.A00(r11)
            X.1vn r9 = X.1vm.A01(r11)
            java.lang.String r18 = "GROUP"
            java.lang.String r17 = "ONE_ON_ONE"
            r0 = 94
            java.lang.String r8 = X.AnonymousClass000.A00(r0)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r10)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            if (r31 == 0) goto L_0x0111
            java.util.Iterator r16 = r31.iterator()
        L_0x0029:
            boolean r3 = r16.hasNext()
            if (r3 == 0) goto L_0x0111
            java.lang.Object r14 = r16.next()
            X.ViK r14 = (X.C17929ViK) r14
            java.lang.String r13 = r14.A02
            if (r13 == 0) goto L_0x0029
            int r3 = r13.length()
            if (r3 == 0) goto L_0x0029
            X.0K0 r5 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r7 = 0
            java.lang.String r4 = r14.A05
            if (r4 == 0) goto L_0x010d
            java.lang.String r3 = "thread_fbid"
            X.0Df r12 = X.C41845B3m.A03(r5, r4, r3)
            java.lang.String r4 = X.C61120lW.A04(r15)
            r3 = 250(0xfa, float:3.5E-43)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            X.0Df.A00(r12, r4, r3)
            java.lang.String r4 = X.0qv.A00(r15)
            r5 = 9
            r3 = 14
            java.lang.String r3 = X.Dbm.A02(r1, r5, r3)
            X.0Df.A00(r12, r4, r3)
            java.lang.String r3 = "app_id"
            X.0Df.A00(r12, r8, r3)
            java.lang.String r4 = r14.A05
            if (r4 == 0) goto L_0x010d
            r3 = r19
            X.2Dr r3 = (X.2Dr) r3
            X.3U9 r3 = X.2Dr.A04(r3, r7, r4)
            if (r3 == 0) goto L_0x0083
            boolean r3 = r3.CUG()
            r4 = r18
            if (r3 == r10) goto L_0x0085
        L_0x0083:
            r4 = r17
        L_0x0085:
            r3 = 380(0x17c, float:5.32E-43)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            X.0Df.A00(r12, r4, r3)
            long r5 = java.lang.System.currentTimeMillis()
            double r3 = (double) r5
            java.lang.Double r4 = java.lang.Double.valueOf(r3)
            java.lang.String r3 = "clienttime"
            X.0Df.A00(r12, r4, r3)
            java.lang.String r4 = r14.A06
            if (r4 == 0) goto L_0x01f8
            java.lang.String r3 = "publisher_igid"
            X.0Df.A00(r12, r4, r3)
            java.lang.String r4 = r11.A06
            java.lang.String r3 = "recipient_igid"
            X.0Df.A00(r12, r4, r3)
            boolean r3 = r14.A08
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            java.lang.String r3 = "client_shows_thread_copresence"
            X.0Df.A00(r12, r4, r3)
            java.lang.String r3 = "is_thread_copresence_update"
            X.0Df.A00(r12, r2, r3)
            boolean r3 = r14.A07
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            java.lang.String r3 = "client_shows_reels_together_copresence"
            X.0Df.A00(r12, r4, r3)
            java.lang.String r3 = "is_reels_together_update"
            X.0Df.A00(r12, r0, r3)
            java.lang.String r3 = "mutation_id"
            X.0Df.A00(r12, r13, r3)
            java.lang.String r4 = r14.A04
            java.lang.String r3 = "real_time_update_id"
            X.2IS r5 = X.JTQ.A0D(r12, r4, r3)
            X.2IS r4 = new X.2IS
            r4.<init>()
            java.lang.String r3 = "request"
            X.1vR r21 = X.C41847B3o.A04(r12, r5, r3)
            java.util.Map r23 = r5.getParamsCopy()
            java.util.Map r24 = r4.getParamsCopy()
            java.lang.Class<X.Bqb> r25 = X.C43011Bqb.class
            java.util.ArrayList r31 = new java.util.ArrayList
            r31.<init>()
            java.lang.String r22 = "IgCoPresenceAccuracyQuery"
            java.lang.String r30 = "ig_co_presence_accuracy"
            com.facebook.pando.PandoGraphQLRequest r3 = new com.facebook.pando.PandoGraphQLRequest
            r20 = r3
            r26 = r1
            r27 = r7
            r28 = r1
            r29 = r7
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            X.WI0 r4 = X.WI0.A00
            r9.A01(r7, r4, r3)
            goto L_0x0029
        L_0x010d:
            java.lang.String r0 = "threadFbid"
            goto L_0x01fa
        L_0x0111:
            if (r32 == 0) goto L_0x0202
            java.util.Iterator r16 = r32.iterator()
        L_0x0117:
            boolean r3 = r16.hasNext()
            if (r3 == 0) goto L_0x0202
            java.lang.Object r14 = r16.next()
            X.ViJ r14 = (X.C17928ViJ) r14
            java.lang.String r13 = r14.A03
            if (r13 == 0) goto L_0x0117
            int r3 = r13.length()
            if (r3 == 0) goto L_0x0117
            X.0K0 r5 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r7 = 0
            java.lang.String r4 = r14.A06
            if (r4 == 0) goto L_0x01f5
            java.lang.String r3 = "thread_fbid"
            X.0Df r12 = X.C41845B3m.A03(r5, r4, r3)
            java.lang.String r4 = X.C61120lW.A04(r15)
            r3 = 250(0xfa, float:3.5E-43)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            X.0Df.A00(r12, r4, r3)
            java.lang.String r5 = X.0qv.A00(r15)
            r4 = 9
            r3 = 14
            java.lang.String r3 = X.Dbm.A02(r1, r4, r3)
            X.0Df.A00(r12, r5, r3)
            java.lang.String r3 = "app_id"
            X.0Df.A00(r12, r8, r3)
            java.lang.String r4 = r14.A06
            if (r4 == 0) goto L_0x01f5
            r3 = r19
            X.2Dr r3 = (X.2Dr) r3
            X.3U9 r3 = X.2Dr.A04(r3, r7, r4)
            if (r3 == 0) goto L_0x0171
            boolean r3 = r3.CUG()
            r4 = r18
            if (r3 == r10) goto L_0x0173
        L_0x0171:
            r4 = r17
        L_0x0173:
            r3 = 380(0x17c, float:5.32E-43)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            X.0Df.A00(r12, r4, r3)
            long r5 = java.lang.System.currentTimeMillis()
            double r3 = (double) r5
            java.lang.Double r4 = java.lang.Double.valueOf(r3)
            java.lang.String r3 = "clienttime"
            X.0Df.A00(r12, r4, r3)
            java.lang.String r4 = r14.A07
            if (r4 == 0) goto L_0x01f8
            java.lang.String r3 = "publisher_igid"
            X.0Df.A00(r12, r4, r3)
            java.lang.String r4 = r11.A06
            java.lang.String r3 = "recipient_igid"
            X.0Df.A00(r12, r4, r3)
            java.lang.String r3 = "client_shows_thread_copresence"
            X.0Df.A00(r12, r0, r3)
            java.lang.String r3 = "is_thread_copresence_update"
            X.0Df.A00(r12, r0, r3)
            boolean r3 = r14.A08
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            java.lang.String r3 = "client_shows_reels_together_copresence"
            X.0Df.A00(r12, r4, r3)
            java.lang.String r3 = "is_reels_together_update"
            X.0Df.A00(r12, r2, r3)
            java.lang.String r3 = "mutation_id"
            X.0Df.A00(r12, r13, r3)
            java.lang.String r4 = r14.A05
            java.lang.String r3 = "real_time_update_id"
            X.2IS r5 = X.JTQ.A0D(r12, r4, r3)
            X.2IS r4 = new X.2IS
            r4.<init>()
            java.lang.String r3 = "request"
            X.1vR r21 = X.C41847B3o.A04(r12, r5, r3)
            java.util.Map r23 = r5.getParamsCopy()
            java.util.Map r24 = r4.getParamsCopy()
            java.lang.Class<X.Bqb> r25 = X.C43011Bqb.class
            java.util.ArrayList r31 = new java.util.ArrayList
            r31.<init>()
            java.lang.String r22 = "IgCoPresenceAccuracyQuery"
            java.lang.String r30 = "ig_co_presence_accuracy"
            com.facebook.pando.PandoGraphQLRequest r3 = new com.facebook.pando.PandoGraphQLRequest
            r20 = r3
            r26 = r1
            r27 = r7
            r28 = r1
            r29 = r7
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            X.WI1 r4 = X.WI1.A00
            r9.A01(r7, r4, r3)
            goto L_0x0117
        L_0x01f5:
            java.lang.String r0 = "surfaceId"
            goto L_0x01fa
        L_0x01f8:
            java.lang.String r0 = "userId"
        L_0x01fa:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0202:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VFN.A00(android.content.Context, com.instagram.common.session.UserSession, java.util.List, java.util.List):void");
    }
}
