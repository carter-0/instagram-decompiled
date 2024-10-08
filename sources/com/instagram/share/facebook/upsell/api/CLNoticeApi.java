package com.instagram.share.facebook.upsell.api;

public final class CLNoticeApi {
    public static final CLNoticeApi A00 = new Object();

    /* JADX WARNING: type inference failed for: r4v1, types: [X.4D7, X.9JW] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(com.instagram.common.session.UserSession r6, com.instagram.share.facebook.cxpnotice.noticestate.internal.CXPNoticeStateRepository r7, X.C367198qL r8, X.AnonymousClass4D7 r9) {
        /*
            r5 = this;
            r3 = 2
            boolean r0 = X.AnonymousClass9JW.A00(r3, r9)
            if (r0 == 0) goto L_0x0060
            r4 = r9
            X.9JW r4 = (X.AnonymousClass9JW) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0060
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0015:
            java.lang.Object r3 = r4.A02
            X.1Hj r2 = X.1Hj.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x004e
            if (r0 != r1) goto L_0x0066
            java.lang.Object r8 = r4.A01
            X.8qL r8 = (X.C367198qL) r8
            X.0eS.A00(r3)
        L_0x0027:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r0 = r3.booleanValue()
            if (r0 == 0) goto L_0x0043
            java.lang.String r2 = "notice_states_synced"
            boolean r0 = r8.A00
            if (r0 != 0) goto L_0x0046
            java.lang.String r1 = "CLNoticePerformanceLogger"
            java.lang.String r0 = "Marker not started."
            X.0KC.A0D(r1, r0)
        L_0x003c:
            r1 = 1
            java.lang.String r0 = "is_notice_state_synced"
            r8.A00(r0, r1)
        L_0x0043:
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x0046:
            X.02m r1 = r8.A02
            int r0 = r8.A01
            r1.markerPoint(r0, r2)
            goto L_0x003c
        L_0x004e:
            X.0eS.A00(r3)
            java.util.LinkedHashMap r0 = X.C369438ul.A00(r6)
            r4.A01 = r8
            r4.A00 = r1
            java.lang.Object r3 = r7.A02(r0, r4)
            if (r3 != r2) goto L_0x0027
            return r2
        L_0x0060:
            X.9JW r4 = new X.9JW
            r4.<init>(r5, r9, r3)
            goto L_0x0015
        L_0x0066:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.share.facebook.upsell.api.CLNoticeApi.A02(com.instagram.common.session.UserSession, com.instagram.share.facebook.cxpnotice.noticestate.internal.CXPNoticeStateRepository, X.8qL, X.4D7):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v0, resolved type: X.818} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v1, resolved type: X.818} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v83, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v2, resolved type: X.818} */
    /* JADX WARNING: type inference failed for: r8v1, types: [X.9Jk, X.4D7] */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: type inference failed for: r8v6 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0258, code lost:
        if (r5.equals(r0) == false) goto L_0x017d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0262, code lost:
        if (r5.equals("BOTTOMSHEET_AUDIENCE_CHANGE_FEED") != false) goto L_0x018e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass818 r33, X.C368278sM r34, X.AnonymousClass819 r35, com.instagram.common.session.UserSession r36, java.lang.String r37, X.AnonymousClass4D7 r38) {
        /*
            r32 = this;
            r31 = r33
            r12 = r35
            r7 = 1
            r3 = r38
            boolean r0 = r3 instanceof X.C376809Jk
            if (r0 == 0) goto L_0x0266
            r8 = r3
            X.9Jk r8 = (X.C376809Jk) r8
            int r0 = r8.A08
            if (r0 != r7) goto L_0x0266
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0266
            int r2 = r2 - r1
            r8.A00 = r2
        L_0x001d:
            java.lang.Object r1 = r8.A07
            X.1Hj r10 = X.1Hj.A02
            int r0 = r8.A00
            r11 = 3
            java.lang.String r17 = " + "
            if (r0 == 0) goto L_0x00f7
            if (r0 != r7) goto L_0x0275
            java.lang.Object r6 = r8.A06
            com.instagram.share.facebook.cxpnotice.noticestate.internal.CXPNoticeStateRepository r6 = (com.instagram.share.facebook.cxpnotice.noticestate.internal.CXPNoticeStateRepository) r6
            java.lang.Object r5 = r8.A05
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r8.A04
            X.8qL r4 = (X.C367198qL) r4
            java.lang.Object r3 = r8.A03
            java.lang.Object r12 = r8.A02
            java.lang.Object r0 = r8.A01
            r31 = r0
            X.0eS.A00(r1)
        L_0x0041:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            java.lang.String r8 = "VIEW"
            if (r0 == 0) goto L_0x00ed
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            X.3JC r0 = (X.AnonymousClass3JC) r0
            java.lang.Object r10 = r0.A01
            X.3lr r10 = (X.C250663lr) r10
            if (r10 == 0) goto L_0x0068
            java.lang.Class<X.9fg> r9 = X.C383499fg.class
            r2 = 0
            java.lang.String r1 = "xcxp_record_notice_interaction(params:$params)"
            r0 = -2067968109(0xffffffff84bd4f93, float:-4.4506764E-36)
            X.3lr r1 = r10.getOptionalTreeField(r2, r1, r9, r0)
            if (r1 == 0) goto L_0x0068
            java.lang.String r0 = "strong_id__"
            r1.getOptionalStringField(r2, r0)
        L_0x0068:
            boolean r0 = X.0qQ.A0K(r3, r8)
            if (r0 == 0) goto L_0x0095
            X.2DQ r10 = X.2DQ.A00(r5)
            X.0qQ.A07(r10)
            X.2CO r9 = r6.A02
            X.9I7 r0 = r6.A00(r10)
            int r5 = r0.A01
            int r2 = r0.A00
            int r1 = r0.A03
            r23 = 0
            X.9I7 r0 = new X.9I7
            r18 = r0
            r19 = r7
            r20 = r2
            r21 = r5
            r22 = r1
            r18.<init>(r19, r20, r21, r22, r23)
            r9.A01(r0, r10)
        L_0x0095:
            r0 = 2
            r4.A03(r0)
            X.0gF r0 = X.C60340gF.A00
            X.3Ih r1 = new X.3Ih
            r1.<init>(r0)
        L_0x00a0:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x00ea
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x026f
            X.5sO r1 = (X.C297815sO) r1
            java.lang.Object r7 = r1.A00
            java.lang.String r5 = "CLNoticeApi"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r0 = r31
            r1.append(r0)
            r0 = r17
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = ": syncing user interaction state failed."
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.Object[] r0 = new java.lang.Object[]{r7}
            X.0KC.A0O(r5, r1, r0)
            r4.A03(r11)
            boolean r0 = X.0qQ.A0K(r3, r8)
            if (r0 == 0) goto L_0x00ea
            X.2CO r0 = r6.A02
            X.0xa r0 = r0.A01
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "has_synced_notice_states"
            r1.E5T(r0, r2)
            r1.apply()
        L_0x00ea:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x00ed:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x00a0
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x00f7:
            X.0eS.A00(r1)
            r9 = 0
            r0 = r34
            X.0qQ.A0B(r0, r9)
            int r1 = r0.ordinal()
            r0 = 5
            if (r1 == r0) goto L_0x0151
            if (r1 == r9) goto L_0x014e
            if (r1 != r7) goto L_0x00ea
            java.lang.String r3 = "DECLINE"
        L_0x010d:
            r1 = 479862200(0x1c9a1db8, float:1.0198547E-21)
            X.8qL r4 = new X.8qL
            r30 = r36
            r0 = r30
            r4.<init>(r0, r1)
            java.lang.String r15 = r31.toString()
            java.lang.String r14 = r12.toString()
            r2 = 0
            r4.A02(r15, r14, r2)
            java.lang.String r13 = X.C368298sO.A00(r31)
            java.lang.String r5 = X.C368298sO.A01(r12)
            java.lang.String r1 = "failure_reason"
            if (r13 != 0) goto L_0x013a
            java.lang.String r0 = "unmapped_entrypoint"
        L_0x0133:
            r4.A01(r1, r0)
            r4.A03(r11)
            goto L_0x00ea
        L_0x013a:
            if (r5 != 0) goto L_0x0154
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "unmapped_variant:"
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            goto L_0x0133
        L_0x014e:
            java.lang.String r3 = "ACCEPT"
            goto L_0x010d
        L_0x0151:
            java.lang.String r3 = "VIEW"
            goto L_0x010d
        L_0x0154:
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            com.instagram.share.facebook.cxpnotice.noticestate.internal.CXPNoticeStateRepository r6 = new com.instagram.share.facebook.cxpnotice.noticestate.internal.CXPNoticeStateRepository
            r6.<init>(r0, r1)
            r4.A02(r15, r14, r2)
            r0 = r31
            r8.A01 = r0
            r8.A02 = r12
            r8.A03 = r3
            r8.A04 = r4
            r8.A05 = r5
            r8.A06 = r6
            r8.A00 = r7
            java.lang.String r0 = "VIEW"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x018e
            int r0 = r5.hashCode()
            switch(r0) {
                case -2037814824: goto L_0x020a;
                case -1836128910: goto L_0x020d;
                case -1827850811: goto L_0x0210;
                case -1632733975: goto L_0x0213;
                case -1352519263: goto L_0x0216;
                case -1084956662: goto L_0x0219;
                case -1053210090: goto L_0x021c;
                case -288342487: goto L_0x021f;
                case -25541339: goto L_0x0222;
                case 23379721: goto L_0x0225;
                case 54284686: goto L_0x0228;
                case 219030524: goto L_0x022b;
                case 233187120: goto L_0x022e;
                case 413296693: goto L_0x0231;
                case 563777044: goto L_0x0234;
                case 702352076: goto L_0x0237;
                case 838947110: goto L_0x023a;
                case 1195626621: goto L_0x025c;
                case 1263784880: goto L_0x023d;
                case 1356947248: goto L_0x0240;
                case 1360476717: goto L_0x0243;
                case 1769937066: goto L_0x0246;
                case 1841480547: goto L_0x0249;
                case 1909673198: goto L_0x024c;
                case 2012071995: goto L_0x024f;
                case 2021136435: goto L_0x0252;
                default: goto L_0x017d;
            }
        L_0x017d:
            X.8qa r1 = X.C367328qZ.A00(r30)
            r0 = 3336(0xd08, float:4.675E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = X.002.A0R(r0, r5)
            r1.A01(r0)
        L_0x018e:
            X.0K0 r16 = com.facebook.graphql.calls.GraphQlCallInput.A02
            long r0 = java.lang.System.currentTimeMillis()
            r14 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r14
            int r14 = (int) r0
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r14)
            java.lang.String r0 = "interaction_time"
            X.0Df r14 = r16.A02()
            X.0Df.A00(r14, r1, r0)
            r0 = 341(0x155, float:4.78E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.0Df.A00(r14, r3, r0)
            java.lang.String r0 = "entrypoint"
            X.0Df.A00(r14, r13, r0)
            java.lang.String r0 = "variant"
            X.0Df.A00(r14, r5, r0)
            r1 = r37
            if (r37 == 0) goto L_0x01c2
            java.lang.String r0 = "client_session_id"
            X.0Df.A00(r14, r1, r0)
        L_0x01c2:
            X.2IS r1 = new X.2IS
            r1.<init>()
            X.2IS r15 = new X.2IS
            r15.<init>()
            java.lang.String r13 = "params"
            X.2IV r0 = r1.A00
            X.0Df r0 = r0.A02()
            r0.A0E(r14, r13)
            X.2IY r0 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1vR r19 = X.AnonymousClass1vS.A00()
            java.util.Map r21 = r1.getParamsCopy()
            java.util.Map r22 = r15.getParamsCopy()
            java.lang.Class<X.9fh> r23 = X.C383509fh.class
            java.util.ArrayList r29 = new java.util.ArrayList
            r29.<init>()
            java.lang.String r20 = "RecordCXPNoticeInteractionMutation"
            java.lang.String r28 = "xcxp_record_notice_interaction"
            com.facebook.pando.PandoGraphQLRequest r0 = new com.facebook.pando.PandoGraphQLRequest
            r24 = r7
            r25 = r2
            r26 = r9
            r27 = r2
            r18 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            X.1vn r1 = X.1vm.A01(r30)
            java.lang.Object r1 = r1.A04(r0, r8)
            if (r1 != r10) goto L_0x0041
            return r10
        L_0x020a:
            java.lang.String r0 = "ROWSHARE_SINGLE_STORY"
            goto L_0x0254
        L_0x020d:
            java.lang.String r0 = "TOOLTIP_PAGE_SHARE_FEED"
            goto L_0x0254
        L_0x0210:
            java.lang.String r0 = "DIALOG_AUTO_OFF_ONE_TIME_SHARE_ON_STORY"
            goto L_0x0254
        L_0x0213:
            java.lang.String r0 = "TOOLTIP_AUTOSHARE_FEED"
            goto L_0x0254
        L_0x0216:
            java.lang.String r0 = "TOOLTIP_SHORTCUT_DESTINATION_PICKER_NOT_SHARING_STORIES"
            goto L_0x0254
        L_0x0219:
            java.lang.String r0 = "TOOLTIP_SHARE_LATER_REELS"
            goto L_0x0254
        L_0x021c:
            java.lang.String r0 = "TOOLTIP_CURRENTLY_SHARING_FEED"
            goto L_0x0254
        L_0x021f:
            java.lang.String r0 = "DIALOG_SINGLE_CCP_REEL"
            goto L_0x0254
        L_0x0222:
            java.lang.String r0 = "BOTTOMSHEET_XAR_SHARE_LATER_REELS"
            goto L_0x0254
        L_0x0225:
            java.lang.String r0 = "TOOLTIP_NUX_STORIES"
            goto L_0x0254
        L_0x0228:
            java.lang.String r0 = "TOOLTIP_SHARE_SHEET_CCP_REELS"
            goto L_0x0254
        L_0x022b:
            java.lang.String r0 = "BOTTOMSHEET_DUAL_DESTPICKER_STORIES"
            goto L_0x0254
        L_0x022e:
            java.lang.String r0 = "DIALOG_SINGLE_XAR_REEL"
            goto L_0x0254
        L_0x0231:
            java.lang.String r0 = "DIALOG_STORY_SHARE_SHEET_ACCOUNT_LINKING"
            goto L_0x0254
        L_0x0234:
            java.lang.String r0 = "ACTIONSHEET_SINGLE_SHARE_STORY"
            goto L_0x0254
        L_0x0237:
            java.lang.String r0 = "BOTTOMSHEET_CCP_SHARE_LATER_REELS"
            goto L_0x0254
        L_0x023a:
            java.lang.String r0 = "ROWSHARE_SINGLE_CCP_REEL"
            goto L_0x0254
        L_0x023d:
            java.lang.String r0 = "ROWSHARE_AUTO_SETTING_STORY"
            goto L_0x0254
        L_0x0240:
            java.lang.String r0 = "TOOLTIP_SHORTCUT_DESTINATION_PICKER_STORIES"
            goto L_0x0254
        L_0x0243:
            java.lang.String r0 = "ROWSHARE_SINGLE_XAR_REEL"
            goto L_0x0254
        L_0x0246:
            java.lang.String r0 = "DIALOG_3_OPTION_TURN_OFF_STORY"
            goto L_0x0254
        L_0x0249:
            java.lang.String r0 = "ROWSHARE_AUTO_SETTING_FEED"
            goto L_0x0254
        L_0x024c:
            java.lang.String r0 = "DIALOG_3_OPTION_STORY"
            goto L_0x0254
        L_0x024f:
            java.lang.String r0 = "ROWSHARE_SINGLE_FEED"
            goto L_0x0254
        L_0x0252:
            java.lang.String r0 = "DIALOG_AUTO_ON_ONE_TIME_SHARE_OFF_STORY"
        L_0x0254:
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x018e
            goto L_0x017d
        L_0x025c:
            java.lang.String r0 = "BOTTOMSHEET_AUDIENCE_CHANGE_FEED"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x017d
            goto L_0x018e
        L_0x0266:
            X.9Jk r8 = new X.9Jk
            r0 = r32
            r8.<init>(r0, r3, r7)
            goto L_0x001d
        L_0x026f:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0275:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.share.facebook.upsell.api.CLNoticeApi.A00(X.818, X.8sM, X.819, com.instagram.common.session.UserSession, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.8qW, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v1, types: [X.0rm, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v0, types: [X.0rm, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02d8  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02e1  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0324 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0249  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.2IV r31, X.AnonymousClass9ID r32, com.google.common.collect.ImmutableList r33, com.instagram.common.session.UserSession r34, com.instagram.share.facebook.cxpnotice.noticestate.internal.CXPNoticeStateRepository r35, X.C367198qL r36, X.AnonymousClass4D7 r37, boolean r38, boolean r39) {
        /*
            r30 = this;
            r13 = r31
            r14 = r39
            r8 = r37
            r2 = r33
            r10 = r34
            r3 = r36
            r4 = r32
            r9 = r38
            boolean r0 = r8 instanceof X.C367298qW
            r5 = r30
            if (r0 == 0) goto L_0x0325
            r6 = r8
            X.8qW r6 = (X.C367298qW) r6
            int r7 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r7 & r1
            if (r0 == 0) goto L_0x0325
            int r7 = r7 - r1
            r6.A00 = r7
        L_0x0024:
            java.lang.Object r1 = r6.A09
            X.1Hj r11 = X.1Hj.A02
            int r0 = r6.A00
            java.lang.String r17 = "result_source"
            r12 = 2
            r8 = 1
            if (r0 == 0) goto L_0x01d3
            if (r0 == r8) goto L_0x01f1
            if (r0 != r12) goto L_0x0332
            boolean r9 = r6.A07
            java.lang.Object r7 = r6.A05
            X.0rm r7 = (X.0rm) r7
            java.lang.Object r5 = r6.A04
            X.0rm r5 = (X.0rm) r5
            java.lang.Object r4 = r6.A03
            X.9ID r4 = (X.AnonymousClass9ID) r4
            java.lang.Object r3 = r6.A02
            X.8qL r3 = (X.C367198qL) r3
            java.lang.Object r2 = r6.A01
            com.google.common.collect.ImmutableList r2 = (com.google.common.collect.ImmutableList) r2
            X.0eS.A00(r1)
        L_0x004d:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            java.lang.String r6 = "failure_reason"
            if (r0 == 0) goto L_0x01c9
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r11 = r1.A00
            X.3JC r11 = (X.AnonymousClass3JC) r11
            boolean r0 = r11.mFromDiskCache
            if (r0 == 0) goto L_0x01c5
            java.lang.String r1 = "from_disk"
        L_0x0061:
            r0 = r17
            r3.A01(r0, r1)
            java.lang.String r10 = "response_received"
            boolean r0 = r3.A00
            if (r0 != 0) goto L_0x01bc
            java.lang.String r1 = "CLNoticePerformanceLogger"
            java.lang.String r0 = "Marker not started."
            X.0KC.A0D(r1, r0)
        L_0x0073:
            java.lang.Object r11 = r11.A01
            X.3lr r11 = (X.C250663lr) r11
            if (r11 == 0) goto L_0x01b1
            java.lang.Class<X.8sU> r10 = X.C368358sU.class
            r12 = 0
            java.lang.String r1 = "xcxp_fetch_notice_user"
            r0 = -917113733(0xffffffffc955f47b, float:-876359.7)
            X.3lr r11 = r11.getOptionalTreeField(r12, r1, r10, r0)
            if (r11 == 0) goto L_0x01b1
            java.lang.Class<X.8sV> r10 = X.C368368sV.class
            java.lang.String r1 = "notice_eligibility(entrypoints:$entrypoints,metadata:$metadata)"
            r0 = 1158401541(0x450bce05, float:2236.8762)
            com.google.common.collect.ImmutableList r11 = r11.getRequiredCompactedTreeListField(r12, r1, r10, r0)
            if (r11 == 0) goto L_0x01b1
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L_0x00cd
            java.lang.String r1 = "CLNoticeApi"
            java.lang.String r0 = "The server's response is empty array."
            X.0KC.A0C(r1, r0)
            java.lang.String r0 = "empty_server_response"
        L_0x00a3:
            r3.A01(r6, r0)
        L_0x00a6:
            X.0gF r0 = X.C60340gF.A00
            X.3Ih r1 = new X.3Ih
            r1.<init>(r0)
        L_0x00ad:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x00ca
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x032c
            X.5sO r1 = (X.C297815sO) r1
            java.lang.Object r0 = r1.A00
            java.lang.String r1 = r0.toString()
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.String r0 = "error_returned:"
            java.lang.String r0 = X.002.A0R(r0, r1)
            r3.A01(r6, r0)
        L_0x00ca:
            java.lang.Object r0 = r7.A00
            return r0
        L_0x00cd:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r15 = r2.iterator()
        L_0x00d6:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0111
            java.lang.Object r10 = r15.next()
            boolean r0 = r11 instanceof java.util.Collection
            if (r0 == 0) goto L_0x00ee
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L_0x00ee
        L_0x00ea:
            r14.add(r10)
            goto L_0x00d6
        L_0x00ee:
            java.util.Iterator r13 = r11.iterator()
        L_0x00f2:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x00ea
            java.lang.Object r12 = r13.next()
            X.3lr r12 = (X.C250663lr) r12
            X.8sW r1 = X.C368378sW.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "entrypoint"
            java.lang.Enum r0 = r12.getOptionalEnumField(r8, r0, r1)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r0 = X.0qQ.A0K(r0, r10)
            if (r0 == 0) goto L_0x00f2
            goto L_0x00d6
        L_0x0111:
            boolean r0 = r14.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0132
            java.lang.String r13 = "CLNoticeApi"
            java.lang.String r12 = "The server's response does not include the requested entrypoints: "
            r10 = 0
            java.lang.String r1 = ", "
            java.lang.String r0 = ""
            java.lang.String r0 = X.00k.A0P(r1, r0, r0, r14, r10)
            java.lang.String r0 = X.002.A0R(r12, r0)
            X.0KC.A0C(r13, r0)
            java.lang.String r0 = "missing_entrypoint_server_response"
            r3.A01(r6, r0)
        L_0x0132:
            if (r9 == 0) goto L_0x0168
            java.lang.Object r10 = r5.A00
            if (r10 == 0) goto L_0x0168
            X.8qa r10 = (X.C367338qa) r10
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x0142
            r10.A01 = r4
        L_0x0142:
            java.util.Iterator r12 = r11.iterator()
        L_0x0146:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x019e
            java.lang.Object r11 = r12.next()
            X.3lr r11 = (X.C250663lr) r11
            X.8rr r9 = r10.A04
            X.8sW r1 = X.C368378sW.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "entrypoint"
            java.lang.Enum r0 = r11.getOptionalEnumField(r8, r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            X.8rq r9 = (X.C367958rq) r9
            X.8rQ r0 = r9.A00
            r0.put(r1, r11)
            goto L_0x0146
        L_0x0168:
            r0 = 10
            int r0 = X.0Yv.A1E(r11, r0)
            int r1 = X.0se.A0L(r0)
            r0 = 16
            if (r1 >= r0) goto L_0x0178
            r1 = 16
        L_0x0178:
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>(r1)
            java.util.Iterator r5 = r11.iterator()
        L_0x0181:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x01ad
            java.lang.Object r4 = r5.next()
            r2 = r4
            X.3lr r2 = (X.C250663lr) r2
            X.8sW r1 = X.C368378sW.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "entrypoint"
            java.lang.Enum r0 = r2.getOptionalEnumField(r8, r0, r1)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r9.put(r0, r4)
            goto L_0x0181
        L_0x019e:
            java.lang.String r0 = "none"
            r10.A02 = r0
            r0 = 0
            r10.A00 = r0
            java.lang.Object r0 = r5.A00
            X.8qa r0 = (X.C367338qa) r0
            com.google.common.collect.RegularImmutableMap r9 = r0.A00(r4, r2)
        L_0x01ad:
            r7.A00 = r9
            goto L_0x00a6
        L_0x01b1:
            java.lang.String r1 = "CLNoticeApi"
            java.lang.String r0 = "The server's response is null."
            X.0KC.A0C(r1, r0)
            java.lang.String r0 = "null_server_response"
            goto L_0x00a3
        L_0x01bc:
            X.02m r1 = r3.A02
            int r0 = r3.A01
            r1.markerPoint(r0, r10)
            goto L_0x0073
        L_0x01c5:
            java.lang.String r1 = "from_network"
            goto L_0x0061
        L_0x01c9:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x00ad
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x01d3:
            X.0eS.A00(r1)
            r6.A01 = r5
            r6.A02 = r10
            r6.A03 = r2
            r6.A04 = r13
            r6.A05 = r3
            r6.A06 = r4
            r6.A07 = r9
            r6.A08 = r14
            r6.A00 = r8
            r0 = r35
            java.lang.Object r0 = r5.A02(r10, r0, r3, r6)
            if (r0 != r11) goto L_0x020c
            return r11
        L_0x01f1:
            boolean r14 = r6.A08
            boolean r9 = r6.A07
            java.lang.Object r4 = r6.A06
            X.9ID r4 = (X.AnonymousClass9ID) r4
            java.lang.Object r3 = r6.A05
            X.8qL r3 = (X.C367198qL) r3
            java.lang.Object r13 = r6.A04
            com.facebook.graphql.calls.GraphQlCallInput r13 = (com.facebook.graphql.calls.GraphQlCallInput) r13
            java.lang.Object r2 = r6.A03
            com.google.common.collect.ImmutableList r2 = (com.google.common.collect.ImmutableList) r2
            java.lang.Object r10 = r6.A02
            com.instagram.common.session.UserSession r10 = (com.instagram.common.session.UserSession) r10
            X.0eS.A00(r1)
        L_0x020c:
            X.0rm r5 = new X.0rm
            r5.<init>()
            java.lang.String r1 = java.lang.String.valueOf(r9)
            java.lang.String r0 = "prefetch_enabled"
            r3.A01(r0, r1)
            if (r9 == 0) goto L_0x0294
            X.8qa r7 = X.C367328qZ.A00(r10)
            r5.A00 = r7
            r15 = 0
            X.0qQ.A0B(r2, r15)
            java.lang.Object r0 = r7.A01
            boolean r0 = X.0qQ.A0K(r0, r4)
            if (r0 != 0) goto L_0x0233
            java.lang.String r0 = "state_snapshot_mismatch"
            r7.A01(r0)
        L_0x0233:
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0259
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0259
        L_0x023d:
            r1 = 0
            java.lang.String r0 = "none"
            X.9Iy r7 = new X.9Iy
            r7.<init>((java.lang.Long) r1, (java.lang.String) r0, (boolean) r8)
        L_0x0245:
            boolean r0 = r7.A03
            if (r0 == 0) goto L_0x0279
            java.lang.String r1 = "from_memory"
            r0 = r17
            r3.A01(r0, r1)
            java.lang.Object r0 = r5.A00
            X.8qa r0 = (X.C367338qa) r0
            com.google.common.collect.RegularImmutableMap r0 = r0.A00(r4, r2)
            return r0
        L_0x0259:
            java.util.Iterator r16 = r2.iterator()
        L_0x025d:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x023d
            java.lang.Object r1 = r16.next()
            X.8rr r0 = r7.A04
            java.lang.Object r0 = r0.BEh(r1)
            if (r0 != 0) goto L_0x025d
            java.lang.String r1 = r7.A02
            java.lang.Long r0 = r7.A00
            X.9Iy r7 = new X.9Iy
            r7.<init>((java.lang.Long) r0, (java.lang.String) r1, (boolean) r15)
            goto L_0x0245
        L_0x0279:
            java.lang.String r1 = r7.A02
            java.lang.String r0 = "last_cache_event"
            r3.A01(r0, r1)
            java.lang.Object r0 = r7.A01
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0294
            long r15 = r0.longValue()
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r15
            java.lang.String r7 = "last_cache_event_time_ms"
            r3.A00(r7, r0)
        L_0x0294:
            X.0rm r7 = new X.0rm
            r7.<init>()
            X.0sm r0 = X.0Yt.A0E()
            r7.A00 = r0
            if (r14 == 0) goto L_0x02b5
            java.lang.Object r14 = r5.A00
            X.8qa r14 = (X.C367338qa) r14
            if (r14 == 0) goto L_0x02b5
            java.lang.String r0 = "prefetch_start"
            r14.A02 = r0
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r14.A00 = r0
        L_0x02b5:
            r6.A01 = r2
            r6.A02 = r3
            r6.A03 = r4
            r6.A04 = r5
            r6.A05 = r7
            r0 = 0
            r6.A06 = r0
            r6.A07 = r9
            r6.A00 = r12
            X.2IS r12 = new X.2IS
            r12.<init>()
            X.2IS r15 = new X.2IS
            r15.<init>()
            java.lang.String r1 = "entrypoints"
            r12.A05(r1, r2)
            r14 = 0
            if (r2 == 0) goto L_0x02d9
            r14 = 1
        L_0x02d9:
            java.lang.String r1 = "metadata"
            r12.A00(r13, r1)
            r1 = 0
            if (r13 == 0) goto L_0x02e2
            r1 = 1
        L_0x02e2:
            X.17k.A0E(r14)
            X.17k.A0E(r1)
            X.2IY r1 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1vR r19 = X.AnonymousClass1vS.A00()
            java.util.Map r21 = r12.getParamsCopy()
            java.util.Map r22 = r15.getParamsCopy()
            java.lang.Class<X.8qb> r23 = X.C367348qb.class
            java.util.ArrayList r29 = new java.util.ArrayList
            r29.<init>()
            java.lang.String r20 = "FetchCXPNoticesQuery"
            r24 = 0
            java.lang.String r28 = "xcxp_fetch_notice_user"
            com.facebook.pando.PandoGraphQLRequest r12 = new com.facebook.pando.PandoGraphQLRequest
            r25 = r0
            r26 = r24
            r27 = r0
            r18 = r12
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r0 = 0
            X.1Ef r12 = r12.setFreshCacheAgeMs(r0)
            X.1Ef r1 = r12.setMaxToleratedCacheAgeMs(r0)
            X.1vn r0 = X.1vm.A01(r10)
            java.lang.Object r1 = r0.A04(r1, r6)
            if (r1 != r11) goto L_0x004d
            return r11
        L_0x0325:
            X.8qW r6 = new X.8qW
            r6.<init>(r5, r8)
            goto L_0x0024
        L_0x032c:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0332:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.share.facebook.upsell.api.CLNoticeApi.A01(X.2IV, X.9ID, com.google.common.collect.ImmutableList, com.instagram.common.session.UserSession, com.instagram.share.facebook.cxpnotice.noticestate.internal.CXPNoticeStateRepository, X.8qL, X.4D7, boolean, boolean):java.lang.Object");
    }
}
