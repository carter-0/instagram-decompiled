package com.instagram.nme.contextualpromo;

import X.0qQ;
import X.1vn;

public final class ContextualPromoApi {
    public final int A00;
    public final 1vn A01;

    public ContextualPromoApi(1vn r2, int i) {
        0qQ.A0B(r2, 1);
        this.A01 = r2;
        this.A00 = i;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.MDq, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004f, code lost:
        if (r2.getCoercedBooleanField(0, com.instagram.realtimeclient.RealtimeConstants.SEND_SUCCESS) != false) goto L_0x0051;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C48125EWr r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, X.AnonymousClass4D7 r23) {
        /*
            r18 = this;
            r5 = 9
            r6 = r23
            boolean r1 = X.C66138MDq.A02(r5, r6)
            r0 = r18
            if (r1 == 0) goto L_0x00bd
            r2 = r6
            X.MDq r2 = (X.C66138MDq) r2
            int r4 = r2.A00
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r3
            if (r1 == 0) goto L_0x00bd
            int r4 = r4 - r3
            r2.A00 = r4
        L_0x001a:
            java.lang.Object r4 = r2.A02
            X.1Hj r1 = X.1Hj.A02
            int r3 = r2.A00
            r13 = 0
            r12 = 1
            if (r3 == 0) goto L_0x0061
            if (r3 != r12) goto L_0x00c4
            X.0eS.A00(r4)
        L_0x0029:
            X.3Ii r4 = (X.C239803Ii) r4
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0056
            X.3lr r4 = X.C41846B3n.A0R(r4)
            if (r4 == 0) goto L_0x005f
            java.lang.Class<X.Bxk> r2 = X.C43408Bxk.class
            r3 = 0
            java.lang.String r1 = "ig_nme_benefit_contextual_promo_interaction_log_mutation(input:$input)"
            r0 = -1667822682(0xffffffff9c970ba6, float:-9.995353E-22)
            X.3lr r2 = r4.getOptionalTreeField(r3, r1, r2, r0)
            if (r2 == 0) goto L_0x005f
            java.lang.String r1 = "success"
            boolean r0 = r2.hasFieldValue(r1)
            if (r0 == 0) goto L_0x005f
            boolean r0 = r2.getCoercedBooleanField(r3, r1)
            if (r0 == 0) goto L_0x005f
        L_0x0051:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)
            return r0
        L_0x0056:
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 != 0) goto L_0x005f
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x005f:
            r12 = 0
            goto L_0x0051
        L_0x0061:
            X.0eS.A00(r4)
            X.0K0 r5 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r4 = "event"
            r3 = r21
            X.0Df r7 = X.C41845B3m.A03(r5, r3, r4)
            java.lang.String r4 = "promo_id"
            r5 = r20
            X.0Df.A00(r7, r5, r4)
            java.lang.String r4 = "viewed_profile_id"
            r5 = r22
            X.0Df.A00(r7, r5, r4)
            if (r19 == 0) goto L_0x00bb
            java.lang.String r5 = r19.toString()
        L_0x0082:
            java.lang.String r4 = "entry_flow"
            X.0Df.A00(r7, r5, r4)
            X.2IS r6 = X.C41845B3m.A04()
            X.2IS r5 = X.C41845B3m.A04()
            java.lang.String r4 = "input"
            X.1vR r7 = X.C41847B3o.A04(r7, r6, r4)
            java.util.Map r9 = r6.getParamsCopy()
            java.util.Map r10 = r5.getParamsCopy()
            java.lang.Class<X.Bxl> r11 = X.C43409Bxl.class
            java.util.ArrayList r17 = X.AnonymousClass7TE.A1C()
            java.lang.String r8 = "IGNMEBenefitContextualPromoInteractionLogMutation"
            r14 = 0
            java.lang.String r16 = "ig_nme_benefit_contextual_promo_interaction_log_mutation"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.1vn r0 = r0.A01
            r2.A01 = r3
            r2.A00 = r12
            java.lang.Object r4 = r0.A04(r6, r2)
            if (r4 != r1) goto L_0x0029
            return r1
        L_0x00bb:
            r5 = r13
            goto L_0x0082
        L_0x00bd:
            X.MDq r2 = new X.MDq
            r2.<init>(r0, r6, r5)
            goto L_0x001a
        L_0x00c4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.nme.contextualpromo.ContextualPromoApi.A00(X.EWr, java.lang.String, java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDq, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(java.lang.String r21, java.lang.String r22, java.lang.String r23, X.AnonymousClass4D7 r24) {
        /*
            r20 = this;
            r2 = r21
            r6 = 8
            r7 = r24
            boolean r1 = X.C66138MDq.A02(r6, r7)
            r0 = r20
            if (r1 == 0) goto L_0x009f
            r5 = r7
            X.MDq r5 = (X.C66138MDq) r5
            int r4 = r5.A00
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r3
            if (r1 == 0) goto L_0x009f
            int r4 = r4 - r3
            r5.A00 = r4
        L_0x001c:
            java.lang.Object r7 = r5.A02
            X.1Hj r1 = X.1Hj.A02
            int r6 = r5.A00
            r4 = 1
            java.lang.String r3 = "ContextualPromoApi"
            if (r6 == 0) goto L_0x0049
            if (r6 != r4) goto L_0x00c3
            java.lang.Object r2 = r5.A01
            java.lang.String r2 = (java.lang.String) r2
            X.0eS.A00(r7)
        L_0x0030:
            X.3Ii r7 = (X.C239803Ii) r7
            boolean r0 = r7 instanceof X.C239793Ih
            r1 = 0
            if (r0 == 0) goto L_0x00a6
            X.3lr r3 = X.C41846B3n.A0R(r7)
            if (r3 == 0) goto L_0x0048
            java.lang.Class<X.C8K> r2 = X.C8K.class
            java.lang.String r1 = "ig_nme_benefit_contextual_promo_ui_configs_query(input:$input)"
            r0 = 457405051(0x1b43727b, float:1.6167013E-22)
            com.google.common.collect.ImmutableList r1 = r3.A06(r2, r1, r0)
        L_0x0048:
            return r1
        L_0x0049:
            X.0eS.A00(r7)
            X.0K0 r7 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r15 = 0
            java.lang.String r6 = "surface"
            X.0Df r9 = X.C41845B3m.A03(r7, r2, r6)
            java.lang.String r6 = "viewed_profile_id"
            r7 = r22
            X.0Df.A00(r9, r7, r6)
            java.lang.String r6 = "entry_flow"
            r7 = r23
            X.0Df.A00(r9, r7, r6)
            X.2IS r8 = X.C41845B3m.A04()
            X.2IS r7 = X.C41845B3m.A04()
            java.lang.String r6 = "input"
            X.1vR r9 = X.C41847B3o.A04(r9, r8, r6)
            java.util.Map r11 = r8.getParamsCopy()
            java.util.Map r12 = r7.getParamsCopy()
            java.lang.Class<X.Bxj> r13 = X.C43407Bxj.class
            java.util.ArrayList r19 = X.AnonymousClass7TE.A1C()
            java.lang.String r10 = "IGNMEBenefitContextualPromoConfigsQuery"
            r14 = 0
            java.lang.String r18 = "ig_nme_benefit_contextual_promo_ui_configs_query"
            com.facebook.pando.PandoGraphQLRequest r8 = new com.facebook.pando.PandoGraphQLRequest
            r16 = r14
            r17 = r15
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            int r6 = r0.A00
            r8.setNetworkTimeoutSeconds(r6)
            X.1vn r0 = r0.A01
            r5.A01 = r2
            r5.A00 = r4
            java.lang.Object r7 = r0.A04(r8, r5)
            if (r7 != r1) goto L_0x0030
            return r1
        L_0x009f:
            X.MDq r5 = new X.MDq
            r5.<init>(r0, r7, r6)
            goto L_0x001c
        L_0x00a6:
            boolean r0 = r7 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00be
            X.5sO r7 = (X.C297815sO) r7
            java.lang.Object r0 = r7.A00
            X.4dm r0 = (X.C268654dm) r0
            java.lang.Throwable r4 = r0.A01()
            java.lang.String r0 = "Failed to fetch promo configs for "
            java.lang.String r0 = X.002.A0R(r0, r2)
            X.0KC.A0I(r3, r0, r4)
            return r1
        L_0x00be:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00c3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.nme.contextualpromo.ContextualPromoApi.A01(java.lang.String, java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }
}
