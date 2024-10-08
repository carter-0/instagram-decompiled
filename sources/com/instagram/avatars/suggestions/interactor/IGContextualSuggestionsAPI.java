package com.instagram.avatars.suggestions.interactor;

import X.1vm;
import X.1vn;
import com.instagram.common.session.UserSession;

public final class IGContextualSuggestionsAPI {
    public final long A00;
    public final UserSession A01;
    public final 1vn A02;

    /* JADX WARNING: type inference failed for: r4v1, types: [X.ME4, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C317846nw r19, X.C317866ny r20, java.lang.Integer r21, java.lang.String r22, java.util.List r23, X.AnonymousClass4D7 r24, boolean r25, boolean r26) {
        /*
            r18 = this;
            r12 = 0
            r3 = 33
            r6 = r24
            boolean r0 = X.ME4.A03(r3, r6)
            r5 = r18
            if (r0 == 0) goto L_0x00d8
            r4 = r6
            X.ME4 r4 = (X.ME4) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00d8
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x001b:
            java.lang.Object r1 = r4.A01
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x0042
            if (r0 != r2) goto L_0x00de
            X.0eS.A00(r1)
        L_0x0029:
            r3 = r1
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0039
            java.lang.Object r0 = X.JTQ.A0Y(r3)
            X.3Ih r3 = X.C41845B3m.A0d(r0)
        L_0x0038:
            return r3
        L_0x0039:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0038
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0042:
            X.0eS.A00(r1)
            X.6nx r1 = X.C317846nw.A01
            com.instagram.common.session.UserSession r0 = r5.A01
            r13 = 0
            r6 = r19
            r8 = r20
            java.lang.String r6 = r1.A00(r6, r8, r0, r12)
            X.2IV r7 = new X.2IV
            r7.<init>()
            java.lang.String r0 = "intents"
            r1 = r23
            r7.A05(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r12)
            java.lang.String r0 = "is_armadillo"
            r7.A08(r0, r1)
            java.lang.String r0 = "default_sticker_pack"
            r7.A09(r6, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r25)
            java.lang.String r0 = "only_hints"
            r7.A08(r0, r1)
            java.lang.String r1 = r8.A00
            java.lang.String r0 = "surface"
            r7.A09(r1, r0)
            java.lang.String r1 = X.DbX.A0t(r21)
            java.lang.String r0 = "lexicon_version"
            r7.A09(r1, r0)
            X.2IS r6 = X.C41845B3m.A04()
            X.2IS r1 = X.C41845B3m.A04()
            r8 = r22
            X.0qQ.A0B(r8, r12)
            java.lang.String r0 = "avatar_config_hash"
            r6.A04(r0, r8)
            java.lang.String r0 = "query_params"
            X.1vR r7 = X.JTP.A0L(r7, r6, r0)
            java.util.Map r9 = r6.getParamsCopy()
            java.util.Map r10 = r1.getParamsCopy()
            java.lang.Class<com.instagram.avatars.suggestions.graphql.IGContextualSuggestionsQueryResponseImpl> r11 = com.instagram.avatars.suggestions.graphql.IGContextualSuggestionsQueryResponseImpl.class
            java.util.ArrayList r17 = X.AnonymousClass7TE.A1C()
            java.lang.String r8 = "IGContextualSuggestionsQuery"
            java.lang.String r16 = "xig_contextual_suggestions_data"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            if (r26 == 0) goto L_0x00cb
            r0 = 0
            r6.setMaxToleratedCacheAgeMs(r0)
            r6.setEnsureCacheWrite(r2)
        L_0x00c0:
            X.1vn r0 = r5.A02
            r4.A00 = r2
            java.lang.Object r1 = r0.A04(r6, r4)
            if (r1 != r3) goto L_0x0029
            return r3
        L_0x00cb:
            long r0 = r5.A00
            r6.setFreshCacheAgeMs(r0)
            X.1Ef r0 = r6.setMaxToleratedCacheAgeMs(r0)
            X.0qQ.A0A(r0)
            goto L_0x00c0
        L_0x00d8:
            X.ME4 r4 = X.ME4.A00(r5, r6, r3)
            goto L_0x001b
        L_0x00de:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.avatars.suggestions.interactor.IGContextualSuggestionsAPI.A00(X.6nw, X.6ny, java.lang.Integer, java.lang.String, java.util.List, X.4D7, boolean, boolean):java.lang.Object");
    }

    public IGContextualSuggestionsAPI(UserSession userSession, long j) {
        this.A01 = userSession;
        this.A00 = j;
        this.A02 = 1vm.A01(userSession);
    }
}
