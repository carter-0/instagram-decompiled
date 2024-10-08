package com.instagram.direct.reactions.tabbedreaction.repository;

import X.0qQ;
import com.instagram.common.session.UserSession;

public final class DirectTabbedEmojiReactionRepository {
    public final UserSession A00;
    public final String A01;

    public DirectTabbedEmojiReactionRepository(UserSession userSession, String str) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = str;
    }

    /* JADX WARNING: type inference failed for: r11v1, types: [X.MED, X.4D7] */
    /* JADX WARNING: type inference failed for: r11v4 */
    /* JADX WARNING: type inference failed for: r11v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, X.AnonymousClass4D7 r17) {
        /*
            r12 = this;
            r10 = r15
            r3 = 38
            r4 = r17
            boolean r0 = X.MED.A04(r3, r4)
            r6 = r12
            if (r0 == 0) goto L_0x0086
            r11 = r4
            X.MED r11 = (X.MED) r11
            int r2 = r11.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0086
            int r2 = r2 - r1
            r11.A00 = r2
        L_0x001a:
            java.lang.Object r1 = r11.A04
            X.1Hj r5 = X.1Hj.A02
            int r0 = r11.A00
            r4 = 1
            if (r0 == 0) goto L_0x0066
            if (r0 != r4) goto L_0x00c5
            java.lang.Object r3 = r11.A03
            X.0rm r3 = (X.0rm) r3
            java.lang.Object r10 = r11.A02
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r6 = r11.A01
            com.instagram.direct.reactions.tabbedreaction.repository.DirectTabbedEmojiReactionRepository r6 = (com.instagram.direct.reactions.tabbedreaction.repository.DirectTabbedEmojiReactionRepository) r6
            X.0eS.A00(r1)
        L_0x0034:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x008c
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r5 = r1.A00
            X.371 r5 = (X.AnonymousClass371) r5
            java.lang.Object r0 = r5.FH3()
            X.JtO r0 = (X.C60904JtO) r0
            java.util.List r0 = r0.A01
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r0.iterator()
        L_0x0050:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0095
            java.lang.Object r1 = r2.next()
            X.JwJ r1 = (X.C61081JwJ) r1
            com.instagram.common.session.UserSession r0 = r6.A00
            com.instagram.direct.messagethread.reactions.model.ReactionViewModel r0 = X.C61081JwJ.A00(r1, r0)
            r4.add(r0)
            goto L_0x0050
        L_0x0066:
            X.0eS.A00(r1)
            X.0rm r3 = X.C51965G9l.A11()
            X.0sn r2 = X.0sn.A00
            X.KRF r1 = X.KRF.A00
            X.JwH r0 = new X.JwH
            r0.<init>((X.C62811Kmn) r1, (java.lang.String) r15, (java.util.List) r2)
            r3.A00 = r0
            X.MED.A00(r12, r15, r3, r11, r4)
            r7 = r13
            r8 = r14
            r9 = r16
            java.lang.Object r1 = A00(r6, r7, r8, r9, r10, r11)
            if (r1 != r5) goto L_0x0034
            return r5
        L_0x0086:
            X.MED r11 = new X.MED
            r11.<init>(r12, r4, r3)
            goto L_0x001a
        L_0x008c:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x00aa
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0095:
            java.lang.Object r0 = r5.FH3()
            X.JtO r0 = (X.C60904JtO) r0
            java.lang.String r2 = r0.A00
            X.KRD r1 = X.KRD.A00
            X.JwH r0 = new X.JwH
            r0.<init>((X.C62811Kmn) r1, (java.lang.String) r2, (java.util.List) r4)
            r3.A00 = r0
            X.3Ih r1 = X.C51967G9n.A0d()
        L_0x00aa:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x00bd
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00c0
            X.0sn r2 = X.0sn.A00
            X.KRE r1 = X.KRE.A00
            X.JwH r0 = new X.JwH
            r0.<init>((X.C62811Kmn) r1, (java.lang.String) r10, (java.util.List) r2)
            r3.A00 = r0
        L_0x00bd:
            java.lang.Object r0 = r3.A00
            return r0
        L_0x00c0:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00c5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.reactions.tabbedreaction.repository.DirectTabbedEmojiReactionRepository.A01(java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.ME7, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.direct.reactions.tabbedreaction.repository.DirectTabbedEmojiReactionRepository r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, X.AnonymousClass4D7 r11) {
        /*
            r4 = 26
            boolean r0 = X.ME7.A02(r4, r11)
            if (r0 == 0) goto L_0x0080
            r2 = r11
            X.ME7 r2 = (X.ME7) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x0080
            int r3 = r3 - r1
            r2.A00 = r3
        L_0x0016:
            java.lang.Object r0 = r2.A01
            X.1Hj r3 = X.1Hj.A02
            int r1 = r2.A00
            r4 = 1
            if (r1 == 0) goto L_0x0032
            if (r1 != r4) goto L_0x008d
            X.0eS.A00(r0)
        L_0x0024:
            r3 = r0
            boolean r1 = r0 instanceof X.C239793Ih
            if (r1 != 0) goto L_0x0031
            boolean r0 = r0 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0088
            X.5sO r3 = X.DbU.A0f()
        L_0x0031:
            return r3
        L_0x0032:
            X.0eS.A00(r0)
            com.instagram.common.session.UserSession r0 = r6.A00
            java.lang.String r6 = r6.A01
            X.AnonymousClass7TF.A1B(r7, r4, r8)
            X.1NY r5 = X.DbU.A0M(r0)
            r5.A05()
            r5.A02()
            java.lang.Object[] r1 = new java.lang.Object[]{r7, r8}
            java.lang.String r0 = "api/v1/direct_v2/threads/%s/items/%s/batched_reactions_detail/"
            X.DbU.A1P(r5, r0, r1)
            java.lang.Class<X.CDg> r1 = X.C43788CDg.class
            java.lang.Class<X.Cxj> r0 = X.C45509Cxj.class
            r5.A0Q(r1, r0)
            if (r6 == 0) goto L_0x005d
            java.lang.String r0 = "client_context"
            r5.A9m(r0, r6)
        L_0x005d:
            if (r10 == 0) goto L_0x0064
            java.lang.String r0 = "cursor"
            r5.A9m(r0, r10)
        L_0x0064:
            if (r9 == 0) goto L_0x006b
            java.lang.String r0 = "emoji"
            r5.A9m(r0, r9)
        L_0x006b:
            X.1OC r1 = r5.A0M()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.BatchedReactionsDetailResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.BatchedReactionsDetailResponse>>"
            X.0qQ.A0C(r1, r0)
            r2.A00 = r4
            r0 = 1515227636(0x5a5089f4, float:1.46746191E16)
            java.lang.Object r0 = r1.A00(r0, r2)
            if (r0 != r3) goto L_0x0024
            return r3
        L_0x0080:
            r0 = 42
            X.ME7 r2 = new X.ME7
            r2.<init>(r6, r11, r4, r0)
            goto L_0x0016
        L_0x0088:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x008d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.reactions.tabbedreaction.repository.DirectTabbedEmojiReactionRepository.A00(com.instagram.direct.reactions.tabbedreaction.repository.DirectTabbedEmojiReactionRepository, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }
}
