package com.instagram.creator.agent.suggestedreplies.repository;

import X.0qQ;
import X.1vm;
import X.1vn;
import X.AnonymousClass43D;
import X.C252733pa;
import com.instagram.common.session.UserSession;

public final class CreatorAgentSuggestedRepliesRepository extends C252733pa {
    public final 1vn A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreatorAgentSuggestedRepliesRepository(UserSession userSession) {
        super("AISuggestedReplies", AnonymousClass43D.A00(1216442747));
        0qQ.A0B(userSession, 1);
        this.A00 = 1vm.A01(userSession);
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDh, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(com.instagram.creator.agent.suggestedreplies.constants.SuggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext r20, java.lang.String r21, X.AnonymousClass4D7 r22, boolean r23) {
        /*
            r19 = this;
            r2 = r21
            r5 = 14
            r7 = r22
            boolean r0 = X.C66129MDh.A01(r5, r7)
            r6 = r19
            if (r0 == 0) goto L_0x00cb
            r4 = r7
            X.MDh r4 = (X.C66129MDh) r4
            int r3 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x00cb
            int r3 = r3 - r1
            r4.A00 = r3
        L_0x001c:
            java.lang.Object r1 = r4.A02
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r5 = 1
            if (r0 == 0) goto L_0x0062
            if (r0 != r5) goto L_0x00e0
            java.lang.Object r2 = r4.A01
            java.lang.String r2 = (java.lang.String) r2
            X.0eS.A00(r1)
        L_0x002e:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00d2
            X.3lr r5 = X.C41846B3n.A0R(r1)
            if (r5 == 0) goto L_0x0054
            java.lang.Class<X.BgV> r4 = X.C42672BgV.class
            r3 = 0
            r0 = 4279(0x10b7, float:5.996E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 2019449811(0x785e5bd3, float:1.803988E34)
            X.3lr r1 = r5.getOptionalTreeField(r3, r1, r4, r0)
            if (r1 == 0) goto L_0x0054
            java.lang.String r0 = "messages"
            com.google.common.collect.ImmutableList r3 = r1.getRequiredCompactedStringListField(r3, r0)
            if (r3 != 0) goto L_0x0056
        L_0x0054:
            X.0sn r3 = X.0sn.A00
        L_0x0056:
            r1 = 32
            X.JwJ r0 = new X.JwJ
            r0.<init>((java.util.List) r3, (int) r1, (java.lang.String) r2)
            X.3Ih r3 = X.C41845B3m.A0d(r0)
            return r3
        L_0x0062:
            X.0eS.A00(r1)
            if (r23 == 0) goto L_0x00c7
            r0 = 0
        L_0x0069:
            r14 = 0
            X.2IS r10 = X.C41845B3m.A04()
            X.2IS r9 = X.C41845B3m.A04()
            java.lang.String r7 = "threadID"
            boolean r11 = X.C41848B3p.A1Z(r10, r7, r2)
            r12 = r20
            java.lang.String r8 = r12.A02
            java.lang.String r7 = "srSessionId"
            r9.A04(r7, r8)
            java.lang.String r8 = r12.A03
            java.lang.String r7 = "threadSessionId"
            r9.A04(r7, r8)
            java.lang.String r8 = r12.A01
            java.lang.String r7 = "srRequestId"
            r9.A04(r7, r8)
            X.1vR r8 = X.C41845B3m.A06(r11)
            java.util.Map r10 = r10.getParamsCopy()
            java.util.Map r11 = r9.getParamsCopy()
            java.lang.Class<X.BgW> r12 = X.C42673BgW.class
            java.util.ArrayList r18 = X.AnonymousClass7TE.A1C()
            java.lang.String r9 = "IGDirectCreatorAgentSuggestedReplies"
            r13 = 0
            java.lang.String r17 = "xig_ig_suggested_replies_query"
            com.facebook.pando.PandoGraphQLRequest r7 = new com.facebook.pando.PandoGraphQLRequest
            r15 = r13
            r16 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.1Ef r7 = r7.setMaxToleratedCacheAgeMs(r0)
            X.1Ef r0 = r7.setFreshCacheAgeMs(r0)
            X.1Ef r1 = r0.setEnsureCacheWrite(r5)
            X.1vn r0 = r6.A00
            r4.A01 = r2
            r4.A00 = r5
            java.lang.Object r1 = r0.A04(r1, r4)
            if (r1 != r3) goto L_0x002e
            return r3
        L_0x00c7:
            r0 = 10800000(0xa4cb80, double:5.335909E-317)
            goto L_0x0069
        L_0x00cb:
            X.MDh r4 = new X.MDh
            r4.<init>(r6, r7, r5)
            goto L_0x001c
        L_0x00d2:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00db
            X.5sO r3 = X.JTU.A0R(r1)
            return r3
        L_0x00db:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00e0:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.suggestedreplies.repository.CreatorAgentSuggestedRepliesRepository.A00(com.instagram.creator.agent.suggestedreplies.constants.SuggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext, java.lang.String, X.4D7, boolean):java.lang.Object");
    }
}
