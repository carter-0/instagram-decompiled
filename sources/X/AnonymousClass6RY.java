package X;

import java.util.concurrent.Executor;

/* renamed from: X.6RY  reason: invalid class name */
public final class AnonymousClass6RY implements AnonymousClass6RZ {
    public static final Executor A01 = new C307676Ra();
    public final C276594ta A00;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0187, code lost:
        r16.setPublishMode(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x018c, code lost:
        if (r1 != X.RF7.STALE) goto L_0x0149;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x018e, code lost:
        r16.setPerformOptimisticMerge(true);
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C45273Ctc EpY(X.C307786Rm r29, X.C307896Rx r30, X.C307446Qd r31, X.C276504tR r32, X.C229652no r33) {
        /*
            r28 = this;
            r15 = r28
            r1 = r32
            X.4ta r0 = r15.A00
            java.lang.Object r7 = r0.A00()
            com.facebook.pando.IPandoGraphQLService r7 = (com.facebook.pando.IPandoGraphQLService) r7
            X.4tQ r1 = (X.C276494tQ) r1
            java.util.Map r8 = r1.A02
            java.lang.String r0 = "data"
            java.lang.Object r6 = r8.get(r0)
            java.lang.String r6 = (java.lang.String) r6
            r10 = 0
            if (r6 != 0) goto L_0x0021
            X.Ctc r1 = new X.Ctc
            r1.<init>(r10, r10)
            return r1
        L_0x0021:
            java.lang.String r5 = r1.A00
            X.FSi r4 = new X.FSi
            r0 = r31
            r4.<init>(r0, r5)
            X.2IY r0 = com.facebook.pando.PandoGraphQLRequest.Companion
            java.lang.String r2 = "query_name"
            java.lang.Object r1 = X.C69683Nq5.A00(r2, r8)
            if (r1 != 0) goto L_0x006a
            java.lang.String r1 = ""
        L_0x0036:
            java.lang.String r0 = "doc_id"
            java.lang.Object r0 = X.C69683Nq5.A00(r0, r8)
            if (r0 != 0) goto L_0x0065
            java.lang.String r0 = ""
        L_0x0040:
            X.DGE r14 = new X.DGE
            r14.<init>(r1, r0)
            java.lang.Object r9 = X.C69683Nq5.A00(r2, r8)
            if (r9 != 0) goto L_0x0062
            java.lang.String r9 = ""
        L_0x004d:
            java.lang.String r0 = "variables"
            java.lang.Object r0 = r8.get(r0)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L_0x0084
            java.lang.String r0 = "variables_expr"
            java.lang.Object r2 = r8.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x0080
            goto L_0x006d
        L_0x0062:
            java.lang.String r9 = (java.lang.String) r9
            goto L_0x004d
        L_0x0065:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L_0x0040
        L_0x006a:
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x0036
        L_0x006d:
            r0 = -1
            com.instagram.common.lispy.lang.BloksScript r1 = new com.instagram.common.lispy.lang.BloksScript     // Catch:{ 6QV -> 0x0080 }
            r1.<init>(r10, r2, r10, r0)     // Catch:{ 6QV -> 0x0080 }
            X.6Tm r0 = X.AnonymousClass6Tm.A01     // Catch:{ 6QV -> 0x0080 }
            r2 = r30
            java.lang.Object r0 = X.AnonymousClass6Tn.A00(r2, r0, r1)     // Catch:{ 6QV -> 0x0080 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ 6QV -> 0x0080 }
            if (r0 == 0) goto L_0x0080
            goto L_0x0084
        L_0x0080:
            java.util.Map r0 = java.util.Collections.emptyMap()
        L_0x0084:
            java.util.Map r20 = java.util.Collections.emptyMap()
            java.lang.Class<com.facebook.pando.TreeJNI> r21 = com.facebook.pando.TreeJNI.class
            java.lang.String r3 = "metadata"
            java.lang.Object r1 = r8.get(r3)
            r12 = 0
            if (r1 == 0) goto L_0x0195
            java.lang.Object r2 = r8.get(r3)
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r1 = "live_query"
            boolean r11 = r2.containsKey(r1)
            if (r11 == 0) goto L_0x0195
            java.lang.Object r13 = r2.get(r1)
            java.util.Map r13 = (java.util.Map) r13
            java.lang.String r1 = "config_id"
            boolean r2 = r13.containsKey(r1)
            if (r2 == 0) goto L_0x00b5
            java.lang.Object r12 = r13.get(r1)
            java.lang.String r12 = (java.lang.String) r12
        L_0x00b5:
            java.lang.String r2 = "digest"
            boolean r11 = r13.containsKey(r2)
            java.lang.String r1 = ""
            if (r11 == 0) goto L_0x0192
            java.lang.Object r11 = r13.get(r2)
            java.lang.String r11 = (java.lang.String) r11
        L_0x00c5:
            java.lang.String r2 = "priming_token"
            boolean r16 = r13.containsKey(r2)
            if (r16 == 0) goto L_0x00d3
            java.lang.Object r1 = r13.get(r2)
            java.lang.String r1 = (java.lang.String) r1
        L_0x00d3:
            com.facebook.pando.PandoRealtimeInfoJNI r23 = com.facebook.pando.PandoRealtimeInfoJNI.forLiveQuery(r12, r11, r1)
        L_0x00d7:
            java.util.List r27 = java.util.Collections.emptyList()
            r22 = 0
            com.facebook.pando.PandoGraphQLRequest r2 = new com.facebook.pando.PandoGraphQLRequest
            r24 = r22
            r25 = r10
            r26 = r10
            r19 = r0
            r18 = r9
            r17 = r14
            r16 = r2
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            java.lang.String r0 = "cache_config"
            java.lang.Object r11 = X.C69683Nq5.A00(r0, r8)
            java.util.Map r11 = (java.util.Map) r11
            if (r11 == 0) goto L_0x0120
            java.lang.String r0 = "fresh_cache_ttl_secs"
            java.lang.Object r0 = r11.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            r9 = 1000(0x3e8, double:4.94E-321)
            if (r0 == 0) goto L_0x010e
            long r0 = r0.longValue()
            long r0 = r0 * r9
            r2.setFreshCacheAgeMs(r0)
        L_0x010e:
            java.lang.String r0 = "cache_ttl_secs"
            java.lang.Object r0 = r11.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0120
            long r0 = r0.longValue()
            long r0 = r0 * r9
            r2.setMaxToleratedCacheAgeMs(r0)
        L_0x0120:
            r9 = 1
            r2.setManuallyManageActiveFieldUpdates(r9)
            boolean r0 = r8.containsKey(r3)
            if (r0 == 0) goto L_0x0149
            java.lang.Object r3 = r8.get(r3)
            java.util.Map r3 = (java.util.Map) r3
            r0 = 1730(0x6c2, float:2.424E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x0149
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r0 = r1.hashCode()
            switch(r0) {
                case -74056953: goto L_0x017d;
                case 79219577: goto L_0x0172;
                case 1925346054: goto L_0x0167;
                default: goto L_0x0149;
            }
        L_0x0149:
            java.util.concurrent.Executor r0 = A01
            com.facebook.pando.IPandoGraphQLService$Result r8 = r7.initiate(r6, r2, r4, r0)
            com.facebook.pando.IPandoGraphQLService$Token r0 = r8.cancelToken
            X.Whq r6 = new X.Whq
            r6.<init>(r0)
            X.6Qd r3 = X.C307476Qg.A02(r29)
            X.WPm r2 = new X.WPm
            r2.<init>(r15, r5)
            boolean r0 = r3.A0N
            if (r0 != 0) goto L_0x01a1
            java.util.List r1 = r3.A0E
            monitor-enter(r1)
            goto L_0x0199
        L_0x0167:
            java.lang.String r0 = "ACTIVE"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0149
            X.RF7 r1 = X.RF7.ACTIVE
            goto L_0x0187
        L_0x0172:
            java.lang.String r0 = "STALE"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0149
            X.RF7 r1 = X.RF7.STALE
            goto L_0x0187
        L_0x017d:
            java.lang.String r0 = "PASSIVE"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0149
            X.RF7 r1 = X.RF7.PASSIVE
        L_0x0187:
            r2.setPublishMode(r1)
            X.RF7 r0 = X.RF7.STALE
            if (r1 != r0) goto L_0x0149
            r2.setPerformOptimisticMerge(r9)
            goto L_0x0149
        L_0x0192:
            r11 = r1
            goto L_0x00c5
        L_0x0195:
            r23 = r10
            goto L_0x00d7
        L_0x0199:
            r1.add(r2)     // Catch:{ all -> 0x019e }
            monitor-exit(r1)     // Catch:{ all -> 0x019e }
            goto L_0x01a1
        L_0x019e:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x019e }
            throw r0
        L_0x01a1:
            X.WPn r9 = new X.WPn
            r10 = r4
            r11 = r15
            r12 = r7
            r13 = r6
            r14 = r5
            r9.<init>(r10, r11, r12, r13, r14)
            boolean r0 = r3.A0N
            if (r0 != 0) goto L_0x01ba
            java.util.List r1 = r3.A0F
            monitor-enter(r1)
            r1.add(r9)     // Catch:{ all -> 0x01b7 }
            monitor-exit(r1)     // Catch:{ all -> 0x01b7 }
            goto L_0x01ba
        L_0x01b7:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01b7 }
            throw r0
        L_0x01ba:
            java.lang.Object r0 = r8.tree
            X.Ctc r1 = new X.Ctc
            r1.<init>(r6, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6RY.EpY(X.6Rm, X.6Rx, X.6Qd, X.4tR, X.2no):X.Ctc");
    }

    public AnonymousClass6RY(C276594ta r1) {
        this.A00 = r1;
    }
}
