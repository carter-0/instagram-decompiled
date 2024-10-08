package com.instagram.direct.reactions.repository;

import X.AnonymousClass7TG;
import X.C64830Liq;
import com.instagram.common.session.UserSession;

public final class DirectEmojiReactionsListRepository extends C64830Liq {
    public final UserSession A00;
    public final String A01;
    public final String A02;
    public final String A03;

    /* JADX WARNING: type inference failed for: r4v1, types: [X.ME7, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.direct.reactions.repository.DirectEmojiReactionsListRepository r9, X.AnonymousClass4D7 r10) {
        /*
            r3 = 25
            boolean r0 = X.ME7.A02(r3, r10)
            if (r0 == 0) goto L_0x0082
            r4 = r10
            X.ME7 r4 = (X.ME7) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0082
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r4.A01
            X.1Hj r5 = X.1Hj.A02
            int r1 = r4.A00
            r6 = 1
            if (r1 == 0) goto L_0x0032
            if (r1 != r6) goto L_0x008f
            X.0eS.A00(r0)
        L_0x0024:
            r5 = r0
            boolean r1 = r0 instanceof X.C239793Ih
            if (r1 != 0) goto L_0x0031
            boolean r0 = r0 instanceof X.C297815sO
            if (r0 == 0) goto L_0x008a
            X.5sO r5 = X.DbU.A0f()
        L_0x0031:
            return r5
        L_0x0032:
            X.0eS.A00(r0)
            com.instagram.common.session.UserSession r2 = r9.A00
            java.lang.String r8 = r9.A03
            java.lang.String r1 = r9.A02
            java.lang.String r7 = r9.A01
            X.0Ud r0 = r9.A03
            java.lang.Object r3 = r0.getValue()
            java.lang.String r3 = (java.lang.String) r3
            X.1NY r2 = X.DbU.A0M(r2)
            r2.A05()
            r2.A02()
            java.lang.Object[] r1 = new java.lang.Object[]{r8, r1}
            java.lang.String r0 = "api/v1/direct_v2/threads/%s/items/%s/batched_reactions_detail/"
            X.DbU.A1P(r2, r0, r1)
            java.lang.Class<X.CDg> r1 = X.C43788CDg.class
            java.lang.Class<X.Cxj> r0 = X.C45509Cxj.class
            r2.A0Q(r1, r0)
            if (r7 == 0) goto L_0x0066
            java.lang.String r0 = "client_context"
            r2.A9m(r0, r7)
        L_0x0066:
            if (r3 == 0) goto L_0x006d
            java.lang.String r0 = "cursor"
            r2.A9m(r0, r3)
        L_0x006d:
            X.1OC r1 = r2.A0M()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.BatchedReactionsDetailResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.BatchedReactionsDetailResponse>>"
            X.0qQ.A0C(r1, r0)
            r4.A00 = r6
            r0 = 1515227636(0x5a5089f4, float:1.46746191E16)
            java.lang.Object r0 = r1.A00(r0, r4)
            if (r0 != r5) goto L_0x0024
            return r5
        L_0x0082:
            r0 = 42
            X.ME7 r4 = new X.ME7
            r4.<init>(r9, r10, r3, r0)
            goto L_0x0016
        L_0x008a:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x008f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.reactions.repository.DirectEmojiReactionsListRepository.A00(com.instagram.direct.reactions.repository.DirectEmojiReactionsListRepository, X.4D7):java.lang.Object");
    }

    public DirectEmojiReactionsListRepository(UserSession userSession, String str, String str2, String str3) {
        AnonymousClass7TG.A1U(userSession, str, str2);
        this.A00 = userSession;
        this.A03 = str;
        this.A02 = str2;
        this.A01 = str3;
    }
}
