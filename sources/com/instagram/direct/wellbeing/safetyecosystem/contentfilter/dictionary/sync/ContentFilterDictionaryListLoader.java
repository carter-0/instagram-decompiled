package com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.sync;

public final class ContentFilterDictionaryListLoader {
    /* JADX WARNING: type inference failed for: r5v1, types: [X.9JX, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: type inference failed for: r5v9 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(com.instagram.common.session.UserSession r24, java.util.List r25, java.util.List r26, X.AnonymousClass4D7 r27) {
        /*
            r23 = this;
            r3 = 35
            r4 = r27
            boolean r0 = X.AnonymousClass9JX.A00(r3, r4)
            r8 = r23
            if (r0 == 0) goto L_0x0121
            r5 = r4
            X.9JX r5 = (X.AnonymousClass9JX) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0121
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x001a:
            java.lang.Object r2 = r5.A02
            X.1Hj r4 = X.1Hj.A02
            int r1 = r5.A00
            r9 = 10
            r0 = 1
            if (r1 == 0) goto L_0x0070
            if (r1 != r0) goto L_0x0208
            X.0eS.A00(r2)
        L_0x002a:
            X.3Ii r2 = (X.C239803Ii) r2
            boolean r1 = r2 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x01f3
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r1 = r2.A00
            X.3JC r1 = (X.AnonymousClass3JC) r1
            java.lang.Object r4 = r1.A01
            X.3lr r4 = (X.C250663lr) r4
            if (r4 == 0) goto L_0x01ec
            java.lang.Class<X.5kw> r3 = X.C293545kw.class
            r6 = 0
            java.lang.String r2 = "ig_content_filter_dictionary_lookup_query(languages:$languages,service_ids:$service_ids)"
            r1 = -1474910763(0xffffffffa816a5d5, float:-8.362632E-15)
            com.google.common.collect.ImmutableList r2 = r4.getRequiredCompactedTreeListField(r6, r2, r3, r1)
            if (r2 == 0) goto L_0x01ec
            int r1 = X.0Yv.A1E(r2, r9)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r1)
            java.util.Iterator r4 = r2.iterator()
        L_0x0057:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0128
            java.lang.Object r3 = r4.next()
            X.3lr r3 = (X.C250663lr) r3
            java.lang.Class<X.5kx> r2 = X.C293555kx.class
            r1 = -822269277(0xffffffffcefd2aa3, float:-2.12371494E9)
            X.3lr r1 = r3.reinterpretRequired(r6, r2, r1)
            r5.add(r1)
            goto L_0x0057
        L_0x0070:
            X.0eS.A00(r2)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            X.0Tu r7 = X.0Tu.A06
            r1 = 36593400535516405(0x820181000b04f5, double:3.205152076232858E-306)
            r6 = r24
            long r1 = X.182.A01(r7, r6, r1)
            long r1 = r3.toMillis(r1)
            r10 = r25
            int r7 = X.0Yv.A1E(r10, r9)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r7)
            java.util.Iterator r10 = r10.iterator()
        L_0x0095:
            boolean r7 = r10.hasNext()
            if (r7 == 0) goto L_0x00ab
            java.lang.Object r7 = r10.next()
            X.92I r7 = (X.AnonymousClass92I) r7
            X.92J r7 = r7.A01
            java.lang.String r7 = r7.toString()
            r11.add(r7)
            goto L_0x0095
        L_0x00ab:
            com.google.common.collect.ImmutableList r10 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r11)
            r18 = 0
            X.2IS r11 = new X.2IS
            r11.<init>()
            X.2IS r13 = new X.2IS
            r13.<init>()
            java.lang.String r7 = "service_ids"
            r11.A05(r7, r10)
            r12 = 0
            if (r10 == 0) goto L_0x00c4
            r12 = 1
        L_0x00c4:
            com.google.common.collect.ImmutableList r10 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r26)
            java.lang.String r7 = "languages"
            r11.A05(r7, r10)
            r7 = 0
            if (r10 == 0) goto L_0x00d1
            r7 = 1
        L_0x00d1:
            X.17k.A0E(r12)
            X.17k.A0E(r7)
            X.2IY r7 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1vR r12 = X.AnonymousClass1vS.A00()
            java.util.Map r14 = r11.getParamsCopy()
            java.util.Map r15 = r13.getParamsCopy()
            java.lang.Class<X.5wZ> r16 = X.C300125wZ.class
            java.util.ArrayList r22 = new java.util.ArrayList
            r22.<init>()
            java.lang.String r13 = "IGContentFilterDictionaryLookupQuery"
            r17 = 0
            java.lang.String r21 = "ig_content_filter_dictionary_lookup_query"
            com.facebook.pando.PandoGraphQLRequest r11 = new com.facebook.pando.PandoGraphQLRequest
            r19 = r17
            r20 = r18
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            X.1vn r7 = X.1vm.A01(r6)
            X.1Ef r11 = r11.setMaxToleratedCacheAgeMs(r1)
            X.0Tu r10 = X.0Tu.A05
            r1 = 36593400537089276(0x820181002304fc, double:3.205152077227548E-306)
            long r1 = X.182.A01(r10, r6, r1)
            long r1 = r3.toMillis(r1)
            X.1Ef r1 = r11.setFreshCacheAgeMs(r1)
            r5.A01 = r8
            r5.A00 = r0
            java.lang.Object r2 = r7.A04(r1, r5)
            if (r2 != r4) goto L_0x002a
            return r4
        L_0x0121:
            X.9JX r5 = new X.9JX
            r5.<init>(r8, r4, r3)
            goto L_0x001a
        L_0x0128:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r11 = r5.iterator()
        L_0x0131:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x01ed
            java.lang.Object r4 = r11.next()
            X.3lr r4 = (X.C250663lr) r4
            r2 = 0
            java.lang.String r1 = "dictionary_id"
            java.lang.String r15 = r4.getOptionalStringField(r2, r1)
            java.lang.String r1 = "name"
            java.lang.String r16 = r4.getOptionalStringField(r0, r1)
            r2 = 2
            java.lang.String r1 = "language"
            java.lang.String r17 = r4.getOptionalStringField(r2, r1)
            X.5oj r3 = X.C295685oj.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r2 = 7
            java.lang.String r1 = "type"
            java.lang.Enum r8 = r4.getOptionalEnumField(r2, r1, r3)
            X.5ok r3 = X.C295695ok.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r2 = 6
            java.lang.String r1 = "pattern_matcher_strategy"
            java.lang.Enum r7 = r4.getOptionalEnumField(r2, r1, r3)
            r2 = 5
            java.lang.String r1 = "latest_version"
            java.lang.String r18 = r4.getOptionalStringField(r2, r1)
            if (r15 == 0) goto L_0x0131
            if (r16 == 0) goto L_0x0131
            if (r17 == 0) goto L_0x0131
            if (r8 == 0) goto L_0x0131
            if (r7 == 0) goto L_0x0131
            if (r18 == 0) goto L_0x0131
            r2 = 3
            java.lang.String r1 = "is_editable"
            boolean r20 = r4.getCoercedBooleanField(r2, r1)
            X.5ol[] r5 = X.C295705ol.A02
            int r3 = r5.length
            r2 = 0
        L_0x0181:
            if (r2 >= r3) goto L_0x018c
            r14 = r5[r2]
            X.5oj r1 = r14.A01
            if (r1 == r8) goto L_0x018e
            int r2 = r2 + 1
            goto L_0x0181
        L_0x018c:
            X.5ol r14 = X.C295705ol.A05
        L_0x018e:
            X.5om[] r5 = X.C295715om.A02
            int r3 = r5.length
            r2 = 0
        L_0x0192:
            if (r2 >= r3) goto L_0x019d
            r13 = r5[r2]
            X.5ok r1 = r13.A01
            if (r1 == r7) goto L_0x019f
            int r2 = r2 + 1
            goto L_0x0192
        L_0x019d:
            X.5om r13 = X.C295715om.A05
        L_0x019f:
            X.92J r3 = X.AnonymousClass92J.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r2 = 4
            java.lang.String r1 = "service_ids"
            com.google.common.collect.ImmutableList r2 = r4.getRequiredCompactedEnumListField(r2, r1, r3)
            X.0qQ.A07(r2)
            int r1 = X.0Yv.A1E(r2, r9)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r1)
            java.util.Iterator r10 = r2.iterator()
        L_0x01b8:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x01de
            java.lang.Object r8 = r10.next()
            X.0qQ.A0A(r8)
            r1 = 0
            X.0qQ.A0B(r8, r1)
            X.92I[] r5 = X.AnonymousClass92I.A02
            int r4 = r5.length
            r3 = 0
        L_0x01cd:
            if (r3 >= r4) goto L_0x01d8
            r2 = r5[r3]
            X.92J r1 = r2.A01
            if (r1 == r8) goto L_0x01da
            int r3 = r3 + 1
            goto L_0x01cd
        L_0x01d8:
            X.92I r2 = X.AnonymousClass92I.A06
        L_0x01da:
            r7.add(r2)
            goto L_0x01b8
        L_0x01de:
            X.5ky r12 = new X.5ky
            r19 = r7
            r21 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r6.add(r12)
            goto L_0x0131
        L_0x01ec:
            r6 = 0
        L_0x01ed:
            X.3Ih r4 = new X.3Ih
            r4.<init>(r6)
            return r4
        L_0x01f3:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0202
            X.A05 r0 = new X.A05
            r0.<init>()
            X.5sO r4 = new X.5sO
            r4.<init>(r0)
            return r4
        L_0x0202:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0208:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.sync.ContentFilterDictionaryListLoader.A00(com.instagram.common.session.UserSession, java.util.List, java.util.List, X.4D7):java.lang.Object");
    }
}
