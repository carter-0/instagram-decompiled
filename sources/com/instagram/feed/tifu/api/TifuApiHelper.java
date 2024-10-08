package com.instagram.feed.tifu.api;

import X.0qQ;
import X.1Au;
import X.1Av;
import com.instagram.common.session.UserSession;

public final class TifuApiHelper {
    public final UserSession A00;
    public final 1Av A01;

    public TifuApiHelper(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = 1Au.A00(userSession);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.MDo, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.lang.String r18, X.AnonymousClass4D7 r19, int r20, int r21) {
        /*
            r17 = this;
            r4 = 30
            r5 = r19
            boolean r0 = X.C66136MDo.A01(r4, r5)
            r6 = r17
            if (r0 == 0) goto L_0x00d0
            r2 = r5
            X.MDo r2 = (X.C66136MDo) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x00d0
            int r3 = r3 - r1
            r2.A00 = r3
        L_0x001a:
            java.lang.Object r4 = r2.A01
            X.1Hj r3 = X.1Hj.A02
            int r0 = r2.A00
            r11 = 1
            if (r0 == 0) goto L_0x005f
            if (r0 != r11) goto L_0x00d9
            X.0eS.A00(r4)
        L_0x0028:
            X.3Ii r4 = (X.C239803Ii) r4
            boolean r0 = r4 instanceof X.C239793Ih
            r1 = 0
            if (r0 == 0) goto L_0x0055
            X.3Ih r4 = (X.C239793Ih) r4
            java.lang.Object r0 = r4.A00
            X.3JC r0 = (X.AnonymousClass3JC) r0
            if (r0 == 0) goto L_0x0050
            java.lang.Object r4 = r0.A01
            X.3lr r4 = (X.C250663lr) r4
            if (r4 == 0) goto L_0x0050
            java.lang.Class<X.Bsz> r3 = X.C43113Bsz.class
            java.lang.String r2 = "xdt_ig_tifu_like(input_data:{\"container_module\":$container_module,\"interaction_source\":$interaction_source,\"media_id\":$media_id,\"netego_id\":$netego_id,\"quick_promotion_id\":$quick_promotion_id})"
            r0 = -1763044118(0xffffffff96ea14ea, float:-3.7817938E-25)
            X.3lr r2 = r4.getRequiredTreeField(r1, r2, r3, r0)
            if (r2 == 0) goto L_0x0050
            java.lang.String r0 = "success"
            boolean r1 = r2.getCoercedBooleanField(r1, r0)
        L_0x0050:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            return r3
        L_0x0055:
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0050
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x005f:
            X.0eS.A00(r4)
            r12 = 0
            X.2IS r4 = new X.2IS
            r4.<init>()
            X.2IS r7 = new X.2IS
            r7.<init>()
            java.lang.String r0 = "media_id"
            r1 = r18
            r4.A04(r0, r1)
            r5 = 0
            if (r18 == 0) goto L_0x0078
            r5 = 1
        L_0x0078:
            java.lang.String r1 = "ig_threads_in_feed_unit"
            java.lang.String r0 = "container_module"
            r4.A04(r0, r1)
            java.lang.String r1 = "TIFU_A"
            java.lang.String r0 = "interaction_source"
            r4.A04(r0, r1)
            java.lang.Integer r1 = new java.lang.Integer
            r0 = r20
            r1.<init>(r0)
            java.lang.String r0 = "quick_promotion_id"
            r4.A03(r0, r1)
            java.lang.Integer r1 = new java.lang.Integer
            r0 = r21
            r1.<init>(r0)
            java.lang.String r0 = "netego_id"
            r4.A03(r0, r1)
            com.instagram.common.session.UserSession r1 = r6.A00
            r2.A00 = r11
            X.17k.A0E(r5)
            X.2IY r0 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1vR r6 = X.AnonymousClass1vS.A00()
            java.util.Map r8 = r4.getParamsCopy()
            java.util.Map r9 = r7.getParamsCopy()
            java.lang.Class<X.Bt0> r10 = X.C43114Bt0.class
            java.util.ArrayList r16 = new java.util.ArrayList
            r16.<init>()
            java.lang.String r7 = "TifuLikeMutation"
            r13 = 0
            java.lang.String r15 = "xdt_ig_tifu_like"
            com.facebook.pando.PandoGraphQLRequest r5 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.1vn r0 = X.1vm.A01(r1)
            java.lang.Object r4 = r0.A04(r5, r2)
            if (r4 != r3) goto L_0x0028
            return r3
        L_0x00d0:
            r0 = 42
            X.MDo r2 = new X.MDo
            r2.<init>(r6, r5, r4, r0)
            goto L_0x001a
        L_0x00d9:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.feed.tifu.api.TifuApiHelper.A00(java.lang.String, X.4D7, int, int):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.MDo, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(java.lang.String r18, X.AnonymousClass4D7 r19, int r20, int r21) {
        /*
            r17 = this;
            r4 = 31
            r5 = r19
            boolean r0 = X.C66136MDo.A01(r4, r5)
            r6 = r17
            if (r0 == 0) goto L_0x00d0
            r2 = r5
            X.MDo r2 = (X.C66136MDo) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x00d0
            int r3 = r3 - r1
            r2.A00 = r3
        L_0x001a:
            java.lang.Object r4 = r2.A01
            X.1Hj r3 = X.1Hj.A02
            int r0 = r2.A00
            r11 = 1
            if (r0 == 0) goto L_0x005f
            if (r0 != r11) goto L_0x00d9
            X.0eS.A00(r4)
        L_0x0028:
            X.3Ii r4 = (X.C239803Ii) r4
            boolean r0 = r4 instanceof X.C239793Ih
            r1 = 0
            if (r0 == 0) goto L_0x0055
            X.3Ih r4 = (X.C239793Ih) r4
            java.lang.Object r0 = r4.A00
            X.3JC r0 = (X.AnonymousClass3JC) r0
            if (r0 == 0) goto L_0x0050
            java.lang.Object r4 = r0.A01
            X.3lr r4 = (X.C250663lr) r4
            if (r4 == 0) goto L_0x0050
            java.lang.Class<X.Bt4> r3 = X.C43118Bt4.class
            java.lang.String r2 = "xdt_ig_tifu_unlike(input_data:{\"container_module\":$container_module,\"interaction_source\":$interaction_source,\"media_id\":$media_id,\"netego_id\":$netego_id,\"quick_promotion_id\":$quick_promotion_id})"
            r0 = 1339976241(0x4fde6a31, float:7.4630026E9)
            X.3lr r2 = r4.getRequiredTreeField(r1, r2, r3, r0)
            if (r2 == 0) goto L_0x0050
            java.lang.String r0 = "success"
            boolean r1 = r2.getCoercedBooleanField(r1, r0)
        L_0x0050:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            return r3
        L_0x0055:
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0050
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x005f:
            X.0eS.A00(r4)
            r12 = 0
            X.2IS r4 = new X.2IS
            r4.<init>()
            X.2IS r7 = new X.2IS
            r7.<init>()
            java.lang.String r0 = "media_id"
            r1 = r18
            r4.A04(r0, r1)
            r5 = 0
            if (r18 == 0) goto L_0x0078
            r5 = 1
        L_0x0078:
            java.lang.String r1 = "ig_threads_in_feed_unit"
            java.lang.String r0 = "container_module"
            r4.A04(r0, r1)
            java.lang.String r1 = "TIFU_A"
            java.lang.String r0 = "interaction_source"
            r4.A04(r0, r1)
            java.lang.Integer r1 = new java.lang.Integer
            r0 = r20
            r1.<init>(r0)
            java.lang.String r0 = "quick_promotion_id"
            r4.A03(r0, r1)
            java.lang.Integer r1 = new java.lang.Integer
            r0 = r21
            r1.<init>(r0)
            java.lang.String r0 = "netego_id"
            r4.A03(r0, r1)
            com.instagram.common.session.UserSession r1 = r6.A00
            r2.A00 = r11
            X.17k.A0E(r5)
            X.2IY r0 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1vR r6 = X.AnonymousClass1vS.A00()
            java.util.Map r8 = r4.getParamsCopy()
            java.util.Map r9 = r7.getParamsCopy()
            java.lang.Class<X.Bt5> r10 = X.C43119Bt5.class
            java.util.ArrayList r16 = new java.util.ArrayList
            r16.<init>()
            java.lang.String r7 = "TifuUnlikeMutation"
            r13 = 0
            java.lang.String r15 = "xdt_ig_tifu_unlike"
            com.facebook.pando.PandoGraphQLRequest r5 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.1vn r0 = X.1vm.A01(r1)
            java.lang.Object r4 = r0.A04(r5, r2)
            if (r4 != r3) goto L_0x0028
            return r3
        L_0x00d0:
            r0 = 42
            X.MDo r2 = new X.MDo
            r2.<init>(r6, r5, r4, r0)
            goto L_0x001a
        L_0x00d9:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.feed.tifu.api.TifuApiHelper.A01(java.lang.String, X.4D7, int, int):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.MDo, X.4D7] */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(java.lang.String r18, X.AnonymousClass4D7 r19, boolean r20) {
        /*
            r17 = this;
            r4 = 32
            r5 = r19
            boolean r0 = X.C66136MDo.A01(r4, r5)
            r6 = r17
            if (r0 == 0) goto L_0x0086
            r1 = r5
            X.MDo r1 = (X.C66136MDo) r1
            int r3 = r1.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L_0x0086
            int r3 = r3 - r2
            r1.A00 = r3
        L_0x001a:
            java.lang.Object r0 = r1.A01
            X.1Hj r2 = X.1Hj.A02
            int r3 = r1.A00
            r11 = 1
            if (r3 == 0) goto L_0x002f
            if (r3 != r11) goto L_0x008e
            X.0eS.A00(r0)
        L_0x0028:
            boolean r0 = r0 instanceof X.C239793Ih
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x002f:
            X.0eS.A00(r0)
            r12 = 0
            X.2IS r5 = new X.2IS
            r5.<init>()
            X.2IS r4 = new X.2IS
            r4.<init>()
            if (r20 == 0) goto L_0x0083
            java.lang.String r3 = "WRITE"
        L_0x0041:
            java.lang.String r0 = "not_interested_operation"
            r5.A04(r0, r3)
            java.lang.String r0 = "media_id"
            r3 = r18
            r5.A04(r0, r3)
            r0 = 0
            if (r18 == 0) goto L_0x0051
            r0 = 1
        L_0x0051:
            com.instagram.common.session.UserSession r3 = r6.A00
            r1.A00 = r11
            X.17k.A0E(r0)
            X.2IY r0 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1vR r6 = X.AnonymousClass1vS.A00()
            java.util.Map r8 = r5.getParamsCopy()
            java.util.Map r9 = r4.getParamsCopy()
            java.lang.Class<X.Bt3> r10 = X.C43117Bt3.class
            java.util.ArrayList r16 = new java.util.ArrayList
            r16.<init>()
            java.lang.String r7 = "TifuNotInterestedMutation"
            r13 = 0
            java.lang.String r15 = "xdt_likes_ig_threads_set_not_interested"
            com.facebook.pando.PandoGraphQLRequest r5 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.1vn r0 = X.1vm.A01(r3)
            java.lang.Object r0 = r0.A04(r5, r1)
            if (r0 != r2) goto L_0x0028
            return r2
        L_0x0083:
            java.lang.String r3 = "UNDO"
            goto L_0x0041
        L_0x0086:
            r0 = 42
            X.MDo r1 = new X.MDo
            r1.<init>(r6, r5, r4, r0)
            goto L_0x001a
        L_0x008e:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.feed.tifu.api.TifuApiHelper.A02(java.lang.String, X.4D7, boolean):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.9JX, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0059, code lost:
        r13 = r2.getCoercedBooleanField(0, "ig_has_accepted_tifu_a_likes");
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(X.AnonymousClass4D7 r20) {
        /*
            r19 = this;
            r5 = 40
            r6 = r20
            boolean r0 = X.AnonymousClass9JX.A00(r5, r6)
            r4 = r19
            if (r0 == 0) goto L_0x00dc
            r3 = r6
            X.9JX r3 = (X.AnonymousClass9JX) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00dc
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x001a:
            java.lang.Object r6 = r3.A02
            X.1Hj r2 = X.1Hj.A02
            int r0 = r3.A00
            r13 = 0
            r1 = 1
            if (r0 == 0) goto L_0x0081
            if (r0 != r1) goto L_0x00e3
            java.lang.Object r5 = r3.A01
            com.instagram.feed.tifu.api.TifuApiHelper r5 = (com.instagram.feed.tifu.api.TifuApiHelper) r5
            X.0eS.A00(r6)
        L_0x002d:
            X.3Ii r6 = (X.C239803Ii) r6
            boolean r0 = r6 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0077
            X.3Ih r6 = (X.C239793Ih) r6
            java.lang.Object r0 = r6.A00
            X.3JC r0 = (X.AnonymousClass3JC) r0
            java.lang.Object r4 = r0.A01
            X.3lr r4 = (X.C250663lr) r4
            if (r4 == 0) goto L_0x0072
            java.lang.Class<X.Bsu> r3 = X.C43108Bsu.class
            java.lang.String r2 = "xdt_viewer"
            r0 = -1070172177(0xffffffffc03677ef, float:-2.8510702)
            X.3lr r4 = r4.getRequiredTreeField(r13, r2, r3, r0)
            if (r4 == 0) goto L_0x0072
            java.lang.Class<X.Bst> r3 = X.C43107Bst.class
            java.lang.String r2 = "user"
            r0 = 46594087(0x2c6f827, float:2.9235918E-37)
            X.3lr r2 = r4.getOptionalTreeField(r13, r2, r3, r0)
            if (r2 == 0) goto L_0x0072
            java.lang.String r0 = "ig_has_accepted_tifu_a_likes"
            boolean r13 = r2.getCoercedBooleanField(r13, r0)
            if (r13 == 0) goto L_0x0072
            X.1Av r4 = r5.A01
            X.0s0 r3 = r4.A1f
            X.0YZ[] r2 = X.1Av.A8a
            r0 = 21
            r2 = r2[r0]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r3.Epx(r4, r0, r2)
        L_0x0072:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r13)
            return r0
        L_0x0077:
            boolean r0 = r6 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0072
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0081:
            X.0eS.A00(r6)
            X.1Av r7 = r4.A01
            X.0s0 r6 = r7.A1f
            X.0YZ[] r5 = X.1Av.A8a
            r0 = 21
            r0 = r5[r0]
            java.lang.Object r0 = r6.CDM(r7, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x009c
            r13 = 1
            goto L_0x0072
        L_0x009c:
            r14 = 0
            X.2IS r7 = new X.2IS
            r7.<init>()
            X.2IS r6 = new X.2IS
            r6.<init>()
            com.instagram.common.session.UserSession r5 = r4.A00
            r3.A01 = r4
            r3.A00 = r1
            X.2IY r0 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1vR r8 = X.AnonymousClass1vS.A00()
            java.util.Map r10 = r7.getParamsCopy()
            java.util.Map r11 = r6.getParamsCopy()
            java.lang.Class<X.Bsv> r12 = X.C43109Bsv.class
            java.util.ArrayList r18 = new java.util.ArrayList
            r18.<init>()
            java.lang.String r9 = "TifuALikesHasAcceptedNuxQuery"
            java.lang.String r17 = "xdt_viewer"
            com.facebook.pando.PandoGraphQLRequest r7 = new com.facebook.pando.PandoGraphQLRequest
            r15 = r13
            r16 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.1vn r0 = X.1vm.A01(r5)
            java.lang.Object r6 = r0.A04(r7, r3)
            if (r6 != r2) goto L_0x00d9
            return r2
        L_0x00d9:
            r5 = r4
            goto L_0x002d
        L_0x00dc:
            X.9JX r3 = new X.9JX
            r3.<init>(r4, r6, r5)
            goto L_0x001a
        L_0x00e3:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.feed.tifu.api.TifuApiHelper.A03(X.4D7):java.lang.Object");
    }
}
