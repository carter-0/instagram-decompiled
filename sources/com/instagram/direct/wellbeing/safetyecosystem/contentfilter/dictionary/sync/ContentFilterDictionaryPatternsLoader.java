package com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.sync;

public final class ContentFilterDictionaryPatternsLoader {
    /* JADX WARNING: type inference failed for: r5v1, types: [X.9JX, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(com.instagram.common.session.UserSession r12, java.lang.String r13, java.lang.String r14, X.AnonymousClass4D7 r15, int r16) {
        /*
            r11 = this;
            r3 = 36
            boolean r0 = X.AnonymousClass9JX.A00(r3, r15)
            if (r0 == 0) goto L_0x0117
            r5 = r15
            X.9JX r5 = (X.AnonymousClass9JX) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0117
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A02
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r6 = 1
            if (r0 == 0) goto L_0x00d7
            if (r0 != r6) goto L_0x013f
            X.0eS.A00(r1)
        L_0x0024:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x012a
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            X.3JC r0 = (X.AnonymousClass3JC) r0
            java.lang.Object r2 = r0.A01
            X.3FZ r2 = (X.AnonymousClass3FZ) r2
            if (r2 == 0) goto L_0x0134
            java.lang.Class<X.9bZ> r1 = X.C381329bZ.class
            java.lang.String r0 = "ig_content_filter_dictionary_get_query"
            X.3FZ r2 = r2.A00(r1, r0)
            if (r2 == 0) goto L_0x0134
            java.lang.String r4 = "dictionary_id"
            java.lang.String r0 = r2.A05(r4)
            if (r0 == 0) goto L_0x0134
            java.lang.String r3 = "latest_version"
            java.lang.String r0 = r2.A05(r3)
            if (r0 == 0) goto L_0x0134
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.lang.Class<X.9bY> r1 = X.C381319bY.class
            java.lang.String r0 = "blocked_pattern"
            X.3FZ r1 = r2.A00(r1, r0)
            if (r1 == 0) goto L_0x008e
            java.lang.String r0 = "added"
            com.google.common.collect.ImmutableList r0 = r1.A01(r0)
            X.0qQ.A07(r0)
            java.util.List r0 = X.00k.A0X(r0)
            r6.addAll(r0)
            java.lang.String r0 = "removed"
            com.google.common.collect.ImmutableList r0 = r1.A01(r0)
            X.0qQ.A07(r0)
            java.util.List r0 = X.00k.A0X(r0)
            r7.addAll(r0)
        L_0x008e:
            java.lang.Class<X.9bX> r1 = X.C381309bX.class
            java.lang.String r0 = "allowed_pattern"
            X.3FZ r1 = r2.A00(r1, r0)
            if (r1 == 0) goto L_0x00b8
            java.lang.String r0 = "added"
            com.google.common.collect.ImmutableList r0 = r1.A01(r0)
            X.0qQ.A07(r0)
            java.util.List r0 = X.00k.A0X(r0)
            r8.addAll(r0)
            java.lang.String r0 = "removed"
            com.google.common.collect.ImmutableList r0 = r1.A01(r0)
            X.0qQ.A07(r0)
            java.util.List r0 = X.00k.A0X(r0)
            r9.addAll(r0)
        L_0x00b8:
            java.lang.String r4 = r2.A05(r4)
            java.lang.String r1 = "Required value was null."
            if (r4 == 0) goto L_0x0124
            java.lang.String r5 = r2.A05(r3)
            if (r5 == 0) goto L_0x011e
            java.lang.String r0 = "pattern_diff"
            boolean r10 = r2.A06(r0)
            X.9cF r3 = new X.9cF
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            X.3Ih r4 = new X.3Ih
            r4.<init>(r3)
            return r4
        L_0x00d7:
            X.0eS.A00(r1)
            X.2IS r7 = new X.2IS
            r7.<init>()
            java.lang.String r0 = "dictionary_id"
            r7.A04(r0, r13)
            r1 = 0
            if (r13 == 0) goto L_0x00e8
            r1 = 1
        L_0x00e8:
            r0 = 2969(0xb99, float:4.16E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7.A04(r0, r14)
            X.17k.A0E(r1)
            java.lang.Class<X.9ba> r3 = X.C381339ba.class
            java.lang.String r0 = "IGContentFilterDictionaryGetQuery"
            r2 = 0
            X.3Fa r1 = new X.3Fa
            r1.<init>(r7, r3, r0, r2)
            X.3Fb r0 = X.C46479Dfi.A01(r12)
            r0.A08(r1)
            X.1OC r1 = r0.A06()
            r5.A01 = r11
            r5.A00 = r6
            r0 = 3
            r3 = r16
            java.lang.Object r1 = r1.A02(r5, r3, r0, r2)
            if (r1 != r4) goto L_0x0024
            return r4
        L_0x0117:
            X.9JX r5 = new X.9JX
            r5.<init>(r11, r15, r3)
            goto L_0x0016
        L_0x011e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0124:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x012a:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0134
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0134:
            X.A05 r0 = new X.A05
            r0.<init>()
            X.5sO r4 = new X.5sO
            r4.<init>(r0)
            return r4
        L_0x013f:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.sync.ContentFilterDictionaryPatternsLoader.A00(com.instagram.common.session.UserSession, java.lang.String, java.lang.String, X.4D7, int):java.lang.Object");
    }
}
