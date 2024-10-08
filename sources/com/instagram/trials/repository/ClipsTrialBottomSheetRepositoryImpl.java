package com.instagram.trials.repository;

import com.instagram.common.session.UserSession;

public final class ClipsTrialBottomSheetRepositoryImpl {
    public final UserSession A00;

    /* JADX WARNING: type inference failed for: r1v1, types: [X.MDu, X.4D7] */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: type inference failed for: r1v13 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(com.instagram.api.schemas.MediaTrialGraduationStrategy r16, java.lang.String r17, X.AnonymousClass4D7 r18) {
        /*
            r15 = this;
            r4 = 4
            r5 = r18
            boolean r0 = X.C66142MDu.A02(r4, r5)
            if (r0 == 0) goto L_0x00e6
            r1 = r5
            X.MDu r1 = (X.C66142MDu) r1
            int r3 = r1.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L_0x00e6
            int r3 = r3 - r2
            r1.A00 = r3
        L_0x0017:
            java.lang.Object r3 = r1.A01
            X.1Hj r2 = X.1Hj.A02
            int r0 = r1.A00
            r9 = 1
            if (r0 == 0) goto L_0x0099
            if (r0 != r9) goto L_0x00f4
            X.0eS.A00(r3)
        L_0x0025:
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0090
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r0 = r3.A00
            X.3JC r0 = (X.AnonymousClass3JC) r0
            boolean r4 = r0.isOk()
            java.lang.Object r3 = r0.A01
            X.3lr r3 = (X.C250663lr) r3
            if (r3 == 0) goto L_0x008e
            java.lang.Class<X.C5L> r2 = X.C5L.class
            java.lang.String r1 = "xdt_update_trial_graduation_strategy(graduation_strategy:$strategy,media_id:$media_id)"
            r0 = 709312053(0x2a473e35, float:1.7696333E-13)
            X.3lr r2 = r3.A05(r2, r1, r0)
            if (r2 == 0) goto L_0x008e
            java.lang.Class<X.C5O> r1 = X.C5O.class
            r0 = 1643126146(0x61f01d82, float:5.536681E20)
            X.3lr r3 = r2.A01(r1, r0)
            if (r3 == 0) goto L_0x008e
            java.lang.Class<X.C5N> r2 = X.C5N.class
            java.lang.String r1 = "clips_trial"
            r0 = -490438940(0xffffffffe2c47ee4, float:-1.8123526E21)
            X.3lr r3 = r3.getOptionalTreeField(r9, r1, r2, r0)
            if (r3 == 0) goto L_0x008e
            X.EWw r2 = X.C48130EWw.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r1 = 2
            java.lang.String r0 = "status"
            java.lang.Enum r1 = r3.getRequiredEnumField(r1, r0, r2)
        L_0x0069:
            X.EWw r0 = X.C48130EWw.GRADUATED
            if (r1 == r0) goto L_0x006e
            r9 = 0
        L_0x006e:
            r1 = 17
            X.Jvg r0 = new X.Jvg
            r0.<init>((boolean) r4, (boolean) r9, (int) r1)
            X.3Ih r3 = X.C41845B3m.A0d(r0)
        L_0x0079:
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x008d
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00ef
            X.5sO r3 = (X.C297815sO) r3
            java.lang.Object r0 = r3.A00
            java.lang.String r0 = r0.toString()
            X.5sO r3 = X.C41845B3m.A0c(r0)
        L_0x008d:
            return r3
        L_0x008e:
            r1 = 0
            goto L_0x0069
        L_0x0090:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0079
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0099:
            X.0eS.A00(r3)
            r10 = 0
            X.2IS r6 = X.C41845B3m.A04()
            X.2IS r5 = X.C41845B3m.A04()
            java.lang.String r0 = "media_id"
            r3 = r17
            boolean r4 = X.C41848B3p.A1Z(r6, r0, r3)
            r0 = r16
            java.lang.String r3 = r0.A00
            java.lang.String r0 = "strategy"
            boolean r0 = X.C41848B3p.A1Z(r6, r0, r3)
            X.17k.A0E(r4)
            X.1vR r4 = X.C41845B3m.A06(r0)
            java.util.Map r6 = r6.getParamsCopy()
            java.util.Map r7 = r5.getParamsCopy()
            java.lang.Class<X.C5M> r8 = X.C5M.class
            java.util.ArrayList r14 = X.AnonymousClass7TE.A1C()
            java.lang.String r5 = "IgCreatorsUpdateTrialGraduationStrategyMutation"
            r11 = 0
            java.lang.String r13 = "xdt_update_trial_graduation_strategy"
            com.facebook.pando.PandoGraphQLRequest r3 = new com.facebook.pando.PandoGraphQLRequest
            r12 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            com.instagram.common.session.UserSession r0 = r15.A00
            X.1vn r0 = X.1vm.A01(r0)
            r1.A00 = r9
            java.lang.Object r3 = r0.A04(r3, r1)
            if (r3 != r2) goto L_0x0025
            return r2
        L_0x00e6:
            r0 = 42
            X.MDu r1 = new X.MDu
            r1.<init>(r15, r5, r4, r0)
            goto L_0x0017
        L_0x00ef:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00f4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.trials.repository.ClipsTrialBottomSheetRepositoryImpl.A00(com.instagram.api.schemas.MediaTrialGraduationStrategy, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.MDu, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(java.lang.String r20, java.lang.String r21, X.AnonymousClass4D7 r22) {
        /*
            r19 = this;
            r5 = 2
            r6 = r22
            boolean r0 = X.C66142MDu.A02(r5, r6)
            r4 = r19
            if (r0 == 0) goto L_0x010f
            r2 = r6
            X.MDu r2 = (X.C66142MDu) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x010f
            int r3 = r3 - r1
            r2.A00 = r3
        L_0x0019:
            java.lang.Object r5 = r2.A01
            X.1Hj r3 = X.1Hj.A02
            int r0 = r2.A00
            r1 = 1
            if (r0 == 0) goto L_0x00c4
            if (r0 != r1) goto L_0x011d
            X.0eS.A00(r5)
        L_0x0027:
            X.3Ii r5 = (X.C239803Ii) r5
            boolean r0 = r5 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00bb
            X.3lr r5 = X.C41846B3n.A0R(r5)
            r2 = 0
            if (r5 == 0) goto L_0x00b8
            java.lang.Class<X.BoW> r4 = X.BoW.class
            java.lang.String r3 = "xfb_instagram_post_by_igid(query_params:{\"id\":$media_id})"
            r0 = -346143960(0xffffffffeb5e4328, float:-2.6869867E26)
            X.3lr r5 = r5.A03(r4, r3, r0)
            if (r5 == 0) goto L_0x00b8
            java.lang.Class<X.BoV> r4 = X.BoV.class
            java.lang.String r3 = "media_trial"
            r0 = -1498364154(0xffffffffa6b0c706, float:-1.2266399E-15)
            X.3lr r5 = r5.A03(r4, r3, r0)
            if (r5 == 0) goto L_0x00b8
            java.lang.Class<X.BoS> r4 = X.BoS.class
            java.lang.String r3 = "if_viewer_can_see_pre_reveal_view"
            r0 = 281572206(0x10c8736e, float:7.906394E-29)
            X.3lr r6 = r5.A03(r4, r3, r0)
            java.lang.Class<X.BoU> r4 = X.BoU.class
            java.lang.String r3 = "if_viewer_can_see_results_view"
            r0 = -910761318(0xffffffffc9b6e29a, float:-1498195.2)
            X.3lr r5 = r5.getOptionalTreeField(r1, r3, r4, r0)
            if (r6 == 0) goto L_0x009e
            java.lang.Class<X.BoR> r3 = X.BoR.class
            r2 = 0
            java.lang.String r1 = "pre_reveal_tip"
            r0 = 1318521177(0x4e970959, float:1.26698611E9)
            X.3lr r0 = r6.getOptionalTreeField(r2, r1, r3, r0)
            if (r0 == 0) goto L_0x00b8
            java.lang.String r1 = X.C41845B3m.A0l(r0, r2)
            if (r1 == 0) goto L_0x00b8
            boolean r0 = X.00l.A0W(r1)
            if (r0 != 0) goto L_0x00b8
            X.CTP r0 = new X.CTP
            r0.<init>(r1)
        L_0x0085:
            X.3Ih r5 = X.C41845B3m.A0d(r0)
        L_0x0089:
            boolean r0 = r5 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x009d
            boolean r0 = r5 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0118
            X.5sO r5 = (X.C297815sO) r5
            java.lang.Object r0 = r5.A00
            java.lang.String r0 = r0.toString()
            X.5sO r5 = X.C41845B3m.A0c(r0)
        L_0x009d:
            return r5
        L_0x009e:
            if (r5 == 0) goto L_0x00b8
            java.lang.Class<X.BoT> r4 = X.BoT.class
            r3 = 0
            java.lang.String r1 = "tip(session_id:$session_id)"
            r0 = 913542605(0x36738dcd, float:3.629236E-6)
            X.3lr r0 = r5.getOptionalTreeField(r3, r1, r4, r0)
            if (r0 == 0) goto L_0x00b2
            java.lang.String r2 = X.C41845B3m.A0l(r0, r3)
        L_0x00b2:
            X.CTO r0 = new X.CTO
            r0.<init>(r2)
            goto L_0x0085
        L_0x00b8:
            X.KaI r0 = X.C62110KaI.A00
            goto L_0x0085
        L_0x00bb:
            boolean r0 = r5 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0089
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00c4:
            X.0eS.A00(r5)
            r14 = 0
            X.2IS r7 = X.C41845B3m.A04()
            X.2IS r6 = X.C41845B3m.A04()
            java.lang.String r0 = "media_id"
            r5 = r20
            boolean r5 = X.C41848B3p.A1Z(r7, r0, r5)
            java.lang.String r0 = X.Dbe.A00()
            r8 = r21
            r7.A04(r0, r8)
            X.1vR r8 = X.C41845B3m.A06(r5)
            java.util.Map r10 = r7.getParamsCopy()
            java.util.Map r11 = r6.getParamsCopy()
            java.lang.Class<X.BoX> r12 = X.BoX.class
            java.util.ArrayList r18 = X.AnonymousClass7TE.A1C()
            java.lang.String r9 = "IGCreatorActivationTrialTipQuery"
            r13 = 0
            java.lang.String r17 = "xfb_instagram_post_by_igid"
            com.facebook.pando.PandoGraphQLRequest r7 = new com.facebook.pando.PandoGraphQLRequest
            r15 = r13
            r16 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            com.instagram.common.session.UserSession r0 = r4.A00
            X.1vn r0 = X.1vm.A01(r0)
            r2.A00 = r1
            java.lang.Object r5 = r0.A04(r7, r2)
            if (r5 != r3) goto L_0x0027
            return r3
        L_0x010f:
            r0 = 42
            X.MDu r2 = new X.MDu
            r2.<init>(r4, r6, r5, r0)
            goto L_0x0019
        L_0x0118:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x011d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.trials.repository.ClipsTrialBottomSheetRepositoryImpl.A01(java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.MDu, X.4D7] */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(java.lang.String r19, java.lang.String r20, X.AnonymousClass4D7 r21) {
        /*
            r18 = this;
            r5 = 3
            r6 = r21
            boolean r0 = X.C66142MDu.A02(r5, r6)
            r3 = r18
            if (r0 == 0) goto L_0x00d5
            r1 = r6
            X.MDu r1 = (X.C66142MDu) r1
            int r4 = r1.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r2
            if (r0 == 0) goto L_0x00d5
            int r4 = r4 - r2
            r1.A00 = r4
        L_0x0019:
            java.lang.Object r4 = r1.A01
            X.1Hj r2 = X.1Hj.A02
            int r0 = r1.A00
            r12 = 1
            if (r0 == 0) goto L_0x008e
            if (r0 != r12) goto L_0x00e3
            X.0eS.A00(r4)
        L_0x0027:
            X.3Ii r4 = (X.C239803Ii) r4
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0085
            X.3lr r3 = X.C41846B3n.A0R(r4)
            if (r3 == 0) goto L_0x0083
            java.lang.Class<X.C5J> r2 = X.C5J.class
            java.lang.String r1 = "xdt_graduate_trial_media_v2(entry_point:$entry_point,media_id:$media_id)"
            r0 = -1721440550(0xffffffff9964e6da, float:-1.1833944E-23)
            X.3lr r2 = r3.A05(r2, r1, r0)
            if (r2 == 0) goto L_0x0083
            java.lang.Class<X.C5O> r1 = X.C5O.class
            r0 = 1643126146(0x61f01d82, float:5.536681E20)
            X.3lr r3 = r2.A01(r1, r0)
            if (r3 == 0) goto L_0x0083
            java.lang.Class<X.C5N> r2 = X.C5N.class
            java.lang.String r1 = "clips_trial"
            r0 = -490438940(0xffffffffe2c47ee4, float:-1.8123526E21)
            X.3lr r3 = r3.getOptionalTreeField(r12, r1, r2, r0)
            if (r3 == 0) goto L_0x0083
            X.EWw r2 = X.C48130EWw.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r1 = 2
            java.lang.String r0 = "status"
            java.lang.Enum r1 = r3.getRequiredEnumField(r1, r0, r2)
        L_0x0061:
            X.EWw r0 = X.C48130EWw.GRADUATED
            if (r1 == r0) goto L_0x0066
            r12 = 0
        L_0x0066:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)
            X.3Ih r4 = X.C41845B3m.A0d(r0)
        L_0x006e:
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0082
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00de
            X.5sO r4 = (X.C297815sO) r4
            java.lang.Object r0 = r4.A00
            java.lang.String r0 = r0.toString()
            X.5sO r4 = X.C41845B3m.A0c(r0)
        L_0x0082:
            return r4
        L_0x0083:
            r1 = 0
            goto L_0x0061
        L_0x0085:
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 != 0) goto L_0x006e
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x008e:
            X.0eS.A00(r4)
            r13 = 0
            X.2IS r6 = X.C41845B3m.A04()
            X.2IS r5 = X.C41845B3m.A04()
            java.lang.String r0 = "media_id"
            r4 = r19
            boolean r4 = X.C41848B3p.A1Z(r6, r0, r4)
            java.lang.String r0 = "entry_point"
            r7 = r20
            r6.A04(r0, r7)
            X.1vR r7 = X.C41845B3m.A06(r4)
            java.util.Map r9 = r6.getParamsCopy()
            java.util.Map r10 = r5.getParamsCopy()
            java.lang.Class<X.C5K> r11 = X.C5K.class
            java.util.ArrayList r17 = X.AnonymousClass7TE.A1C()
            java.lang.String r8 = "IgCreatorsTrialsGraduateTrialMutation"
            r14 = 0
            java.lang.String r16 = "xdt_graduate_trial_media_v2"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            com.instagram.common.session.UserSession r0 = r3.A00
            X.1vn r0 = X.1vm.A01(r0)
            r1.A00 = r12
            java.lang.Object r4 = r0.A04(r6, r1)
            if (r4 != r2) goto L_0x0027
            return r2
        L_0x00d5:
            r0 = 42
            X.MDu r1 = new X.MDu
            r1.<init>(r3, r6, r5, r0)
            goto L_0x0019
        L_0x00de:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00e3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.trials.repository.ClipsTrialBottomSheetRepositoryImpl.A02(java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.MDu, X.4D7] */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(java.lang.String r18, X.AnonymousClass4D7 r19) {
        /*
            r17 = this;
            r5 = 5
            r6 = r19
            boolean r0 = X.C66142MDu.A02(r5, r6)
            r3 = r17
            if (r0 == 0) goto L_0x00c0
            r1 = r6
            X.MDu r1 = (X.C66142MDu) r1
            int r4 = r1.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r2
            if (r0 == 0) goto L_0x00c0
            int r4 = r4 - r2
            r1.A00 = r4
        L_0x0019:
            java.lang.Object r4 = r1.A01
            X.1Hj r2 = X.1Hj.A02
            int r0 = r1.A00
            r11 = 1
            if (r0 == 0) goto L_0x0080
            if (r0 != r11) goto L_0x00ce
            X.0eS.A00(r4)
        L_0x0027:
            X.3Ii r4 = (X.C239803Ii) r4
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0077
            X.3lr r3 = X.C41846B3n.A0R(r4)
            if (r3 == 0) goto L_0x0075
            java.lang.Class<X.C5H> r2 = X.C5H.class
            java.lang.String r1 = "xdt_reveal_trial_media(media_id:$media_id)"
            r0 = 1487699125(0x58ac7cb5, float:1.5172129E15)
            X.3lr r2 = r3.A05(r2, r1, r0)
            if (r2 == 0) goto L_0x0075
            java.lang.Class<X.C5O> r1 = X.C5O.class
            r0 = 1643126146(0x61f01d82, float:5.536681E20)
            X.3lr r3 = r2.A01(r1, r0)
            if (r3 == 0) goto L_0x0075
            java.lang.Class<X.C5N> r2 = X.C5N.class
            java.lang.String r1 = "clips_trial"
            r0 = -490438940(0xffffffffe2c47ee4, float:-1.8123526E21)
            X.3lr r0 = r3.getOptionalTreeField(r11, r1, r2, r0)
            if (r0 == 0) goto L_0x0075
        L_0x0058:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            X.3Ih r4 = X.C41845B3m.A0d(r0)
        L_0x0060:
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0074
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00c9
            X.5sO r4 = (X.C297815sO) r4
            java.lang.Object r0 = r4.A00
            java.lang.String r0 = r0.toString()
            X.5sO r4 = X.C41845B3m.A0c(r0)
        L_0x0074:
            return r4
        L_0x0075:
            r11 = 0
            goto L_0x0058
        L_0x0077:
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0060
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0080:
            X.0eS.A00(r4)
            r12 = 0
            X.2IS r5 = X.C41845B3m.A04()
            X.2IS r4 = X.C41845B3m.A04()
            java.lang.String r0 = "media_id"
            r6 = r18
            boolean r0 = X.C41848B3p.A1Z(r5, r0, r6)
            X.1vR r6 = X.C41845B3m.A06(r0)
            java.util.Map r8 = r5.getParamsCopy()
            java.util.Map r9 = r4.getParamsCopy()
            java.lang.Class<X.C5I> r10 = X.C5I.class
            java.util.ArrayList r16 = X.AnonymousClass7TE.A1C()
            java.lang.String r7 = "IgCreatorsTrialRevealStatusMutation"
            r13 = 0
            java.lang.String r15 = "xdt_reveal_trial_media"
            com.facebook.pando.PandoGraphQLRequest r5 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            com.instagram.common.session.UserSession r0 = r3.A00
            X.1vn r0 = X.1vm.A01(r0)
            r1.A00 = r11
            java.lang.Object r4 = r0.A04(r5, r1)
            if (r4 != r2) goto L_0x0027
            return r2
        L_0x00c0:
            r0 = 42
            X.MDu r1 = new X.MDu
            r1.<init>(r3, r6, r5, r0)
            goto L_0x0019
        L_0x00c9:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00ce:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.trials.repository.ClipsTrialBottomSheetRepositoryImpl.A03(java.lang.String, X.4D7):java.lang.Object");
    }

    public ClipsTrialBottomSheetRepositoryImpl(UserSession userSession) {
        this.A00 = userSession;
    }
}
