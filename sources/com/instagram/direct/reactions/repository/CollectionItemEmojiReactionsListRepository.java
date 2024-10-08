package com.instagram.direct.reactions.repository;

import X.C51974G9v;
import X.C64830Liq;
import com.instagram.common.session.UserSession;

public final class CollectionItemEmojiReactionsListRepository extends C64830Liq {
    public final UserSession A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    /* JADX WARNING: type inference failed for: r2v1, types: [X.ME7, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.direct.reactions.repository.CollectionItemEmojiReactionsListRepository r9, X.AnonymousClass4D7 r10, int r11) {
        /*
            r4 = 24
            boolean r0 = X.ME7.A02(r4, r10)
            if (r0 == 0) goto L_0x0087
            r2 = r10
            X.ME7 r2 = (X.ME7) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x0087
            int r3 = r3 - r1
            r2.A00 = r3
        L_0x0016:
            java.lang.Object r0 = r2.A01
            X.1Hj r3 = X.1Hj.A02
            int r1 = r2.A00
            r4 = 1
            if (r1 == 0) goto L_0x0032
            if (r1 != r4) goto L_0x0094
            X.0eS.A00(r0)
        L_0x0024:
            r3 = r0
            boolean r1 = r0 instanceof X.C239793Ih
            if (r1 != 0) goto L_0x0031
            boolean r0 = r0 instanceof X.C297815sO
            if (r0 == 0) goto L_0x008f
            X.5sO r3 = X.DbU.A0f()
        L_0x0031:
            return r3
        L_0x0032:
            X.0eS.A00(r0)
            com.instagram.common.session.UserSession r1 = r9.A00
            java.lang.String r8 = r9.A02
            java.lang.String r7 = r9.A03
            X.0Ud r0 = r9.A03
            java.lang.String r6 = X.JTO.A11(r0)
            X.1NY r5 = X.AnonymousClass7TG.A0b(r1)
            r5.A02()
            java.lang.String r0 = "api/v1/direct_v2/collection_item/get_reaction_details/"
            r5.A0A(r0)
            java.lang.Class<X.CDi> r1 = X.C43790CDi.class
            java.lang.Class<X.Cxz> r0 = X.C45525Cxz.class
            r5.A0Q(r1, r0)
            java.lang.String r0 = "batch_size"
            r5.A0C(r0, r11)
            r0 = 1184(0x4a0, float:1.659E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r5.A9m(r0, r8)
            r0 = 72
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r5.A9m(r0, r7)
            if (r6 == 0) goto L_0x0072
            java.lang.String r0 = "cursor"
            r5.A9m(r0, r6)
        L_0x0072:
            X.1OC r1 = r5.A0M()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.CollectionItemReactionDetailsResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.CollectionItemReactionDetailsResponse>>"
            X.0qQ.A0C(r1, r0)
            r2.A00 = r4
            r0 = 2008445766(0x77b67346, float:7.401063E33)
            java.lang.Object r0 = r1.A00(r0, r2)
            if (r0 != r3) goto L_0x0024
            return r3
        L_0x0087:
            r0 = 42
            X.ME7 r2 = new X.ME7
            r2.<init>(r9, r10, r4, r0)
            goto L_0x0016
        L_0x008f:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0094:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.reactions.repository.CollectionItemEmojiReactionsListRepository.A00(com.instagram.direct.reactions.repository.CollectionItemEmojiReactionsListRepository, X.4D7, int):java.lang.Object");
    }

    public CollectionItemEmojiReactionsListRepository(UserSession userSession, String str, String str2, String str3, String str4) {
        C51974G9v.A1P(userSession, str, str2, str3);
        this.A00 = userSession;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A01 = str4;
    }
}
