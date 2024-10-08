package com.instagram.opal.impl.data;

import X.0qQ;
import X.17h;
import X.17i;
import X.C267554bk;
import X.C62520KhB;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class OpalRepoUtil {
    public static final OpalRepoUtil A00 = new Object();

    public final void A03(UserSession userSession, OpalProfileData opalProfileData) {
        C267554bk r3;
        0qQ.A0B(userSession, 1);
        if (opalProfileData.A01 == C62520KhB.Loaded) {
            boolean z = opalProfileData.A0A;
            r3 = new C267554bk(opalProfileData.A00, opalProfileData.A02, "", opalProfileData.A04, opalProfileData.A06, z, false, false);
        } else {
            r3 = null;
        }
        String str = opalProfileData.A05;
        0qQ.A0B(str, 1);
        17i A002 = 17h.A00(userSession);
        User A02 = A002.A02(str);
        if (A02 != null) {
            A02.A03.Eef(r3);
            A002.A03(A02);
        }
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.MDq, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(android.content.Context r8, com.instagram.common.session.UserSession r9, com.instagram.opal.impl.data.OpalRepoUtil r10, java.lang.String r11, X.AnonymousClass4D7 r12) {
        /*
            r4 = 17
            boolean r0 = X.C66138MDq.A02(r4, r12)
            if (r0 == 0) goto L_0x006a
            r2 = r12
            X.MDq r2 = (X.C66138MDq) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x006a
            int r3 = r3 - r1
            r2.A00 = r3
        L_0x0016:
            java.lang.Object r0 = r2.A02
            X.1Hj r7 = X.1Hj.A02
            int r1 = r2.A00
            r6 = 1
            if (r1 == 0) goto L_0x0030
            if (r1 != r6) goto L_0x0075
            java.lang.Object r5 = r2.A01
            X.0eS.A00(r0)
        L_0x0026:
            boolean r1 = r0 instanceof X.C239793Ih
            if (r1 != 0) goto L_0x002f
            boolean r0 = r0 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0070
            r5 = 0
        L_0x002f:
            return r5
        L_0x0030:
            X.0eS.A00(r0)
            int r0 = r11.length()
            if (r0 != 0) goto L_0x003c
            java.lang.String r5 = ""
            return r5
        L_0x003c:
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r5 = java.lang.String.valueOf(r0)
            android.net.Uri r1 = X.JTQ.A09(r11)
            android.content.Context r0 = X.DbT.A05(r8)
            r2.A01 = r5
            r2.A00 = r6
            r4 = 72627069(0x454337d, float:2.4944122E-36)
            r3 = 0
            X.1IW r2 = X.JTS.A0s(r2)
            X.5g0 r1 = X.C49736F4b.A01(r0, r1, r9, r5, r6)
            r0 = 3
            X.KH1.A01(r1, r2, r0)
            X.1ES.A06(r1, r4, r3)
            java.lang.Object r0 = r2.A0E()
            if (r0 != r7) goto L_0x0026
            return r7
        L_0x006a:
            X.MDq r2 = new X.MDq
            r2.<init>(r10, r12, r4)
            goto L_0x0016
        L_0x0070:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0075:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.opal.impl.data.OpalRepoUtil.A00(android.content.Context, com.instagram.common.session.UserSession, com.instagram.opal.impl.data.OpalRepoUtil, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.4D7, X.ME1] */
    /* JADX WARNING: type inference failed for: r6v10 */
    /* JADX WARNING: type inference failed for: r6v11 */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x019b, code lost:
        if (r12 != r5) goto L_0x003e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01b6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(android.content.Context r26, com.instagram.common.session.UserSession r27, X.1vn r28, com.instagram.opal.impl.data.OpalProfileData r29, X.AnonymousClass4D7 r30) {
        /*
            r25 = this;
            r4 = r28
            r0 = r29
            r1 = r27
            r7 = 11
            r8 = r30
            boolean r2 = X.ME1.A02(r7, r8)
            r10 = r25
            if (r2 == 0) goto L_0x01d1
            r6 = r8
            X.ME1 r6 = (X.ME1) r6
            int r5 = r6.A00
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r5 & r3
            if (r2 == 0) goto L_0x01d1
            int r5 = r5 - r3
            r6.A00 = r5
        L_0x0020:
            java.lang.Object r12 = r6.A06
            X.1Hj r5 = X.1Hj.A02
            int r2 = r6.A00
            r3 = 2
            r8 = 1
            r7 = 0
            if (r2 == 0) goto L_0x013b
            if (r2 == r8) goto L_0x0123
            if (r2 != r3) goto L_0x01d9
            java.lang.Object r1 = r6.A03
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.Object r0 = r6.A02
            com.instagram.opal.impl.data.OpalProfileData r0 = (com.instagram.opal.impl.data.OpalProfileData) r0
            java.lang.Object r2 = r6.A01
            com.instagram.opal.impl.data.OpalRepoUtil r2 = (com.instagram.opal.impl.data.OpalRepoUtil) r2
            X.0eS.A00(r12)
        L_0x003e:
            X.3Ii r12 = (X.C239803Ii) r12
            boolean r4 = r12 instanceof X.C239793Ih
            if (r4 == 0) goto L_0x01d8
            X.3lr r9 = X.C41846B3n.A0R(r12)
            if (r9 == 0) goto L_0x0120
            java.lang.Class<com.instagram.opal.impl.graphql.UpdateOpalMutationResponseImpl$XdtUpdateOpal> r6 = com.instagram.opal.impl.graphql.UpdateOpalMutationResponseImpl.XdtUpdateOpal.class
            X.3sh r4 = X.C250663lr.Companion
            r5 = 935844365(0x37c7da0d, float:2.3824186E-5)
            r4 = 1949(0x79d, float:2.731E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r4)
            X.3lr r10 = r9.A05(r6, r4, r5)
            java.lang.String r4 = "null cannot be cast to non-null type com.instagram.opal.impl.graphql.UpdateOpalMutationResponseImpl.XdtUpdateOpal"
            X.0qQ.A0C(r10, r4)
            if (r10 == 0) goto L_0x0120
            X.EWx r6 = X.C48131EWx.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r5 = 0
            java.lang.String r4 = "status"
            java.lang.Enum r5 = r10.getRequiredEnumField(r5, r4, r6)
            X.0qQ.A07(r5)
        L_0x006e:
            X.EWx r4 = X.C48131EWx.SUCCESS
            if (r5 != r4) goto L_0x01d8
            if (r9 == 0) goto L_0x01d8
            java.lang.Class<com.instagram.opal.impl.graphql.UpdateOpalMutationResponseImpl$XdtUpdateOpal> r6 = com.instagram.opal.impl.graphql.UpdateOpalMutationResponseImpl.XdtUpdateOpal.class
            X.3sh r4 = X.C250663lr.Companion
            r5 = 935844365(0x37c7da0d, float:2.3824186E-5)
            r4 = 1949(0x79d, float:2.731E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r4)
            X.3lr r9 = r9.A05(r6, r4, r5)
            java.lang.String r4 = "null cannot be cast to non-null type com.instagram.opal.impl.graphql.UpdateOpalMutationResponseImpl.XdtUpdateOpal"
            X.0qQ.A0C(r9, r4)
            if (r9 == 0) goto L_0x01d8
            java.lang.Class<com.instagram.opal.impl.graphql.UpdateOpalMutationResponseImpl$XdtUpdateOpal$Opal> r6 = com.instagram.opal.impl.graphql.UpdateOpalMutationResponseImpl.XdtUpdateOpal.Opal.class
            r5 = 1857650734(0x6eb9802e, float:2.8704843E28)
            java.lang.String r4 = "opal"
            X.3lr r9 = r9.getRequiredTreeField(r3, r4, r6, r5)
            java.lang.String r4 = "null cannot be cast to non-null type com.instagram.opal.impl.graphql.UpdateOpalMutationResponseImpl.XdtUpdateOpal.Opal"
            X.0qQ.A0C(r9, r4)
            if (r9 == 0) goto L_0x01d8
            X.17i r4 = X.17h.A00(r1)
            java.lang.String r13 = r0.A05
            com.instagram.user.model.User r4 = r4.A02(r13)
            java.lang.String r12 = ""
            if (r4 == 0) goto L_0x0109
            java.lang.String r14 = r4.getUsername()
        L_0x00b0:
            java.lang.Class<com.instagram.opal.impl.graphql.UpdateOpalMutationResponseImpl$XdtUpdateOpal$Opal$OpalInfo> r10 = com.instagram.opal.impl.graphql.UpdateOpalMutationResponseImpl.XdtUpdateOpal.Opal.OpalInfo.class
            r6 = -480358044(0xffffffffe35e5164, float:-4.101042E21)
            java.lang.String r5 = "opal_info"
            X.3lr r11 = r9.A03(r10, r5, r6)
            if (r11 == 0) goto L_0x00c5
            java.lang.String r4 = "name"
            java.lang.String r15 = r11.A07(r4)
            if (r15 != 0) goto L_0x00c6
        L_0x00c5:
            r15 = r12
        L_0x00c6:
            X.3lr r11 = r9.A03(r10, r5, r6)
            if (r11 == 0) goto L_0x00d8
            r4 = 40
            java.lang.String r4 = X.AnonymousClass000.A00(r4)
            java.lang.String r16 = r11.getOptionalStringField(r3, r4)
            if (r16 != 0) goto L_0x00da
        L_0x00d8:
            r16 = r12
        L_0x00da:
            X.3lr r4 = r9.A03(r10, r5, r6)
            if (r4 == 0) goto L_0x00e8
            java.lang.String r3 = "bio"
            java.lang.String r18 = r4.getOptionalStringField(r8, r3)
            if (r18 != 0) goto L_0x00ea
        L_0x00e8:
            r18 = r12
        L_0x00ea:
            X.KhB r12 = X.C62520KhB.Loaded
            int r4 = r0.A00
            java.util.List r3 = r0.A08
            boolean r0 = r0.A0A
            r22 = 0
            com.instagram.opal.impl.data.OpalProfileData r11 = new com.instagram.opal.impl.data.OpalProfileData
            r20 = r4
            r21 = r8
            r23 = r22
            r24 = r0
            r17 = r7
            r19 = r3
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r2.A03(r1, r11)
            return r11
        L_0x0109:
            java.lang.Class<com.instagram.opal.impl.graphql.UpdateOpalMutationResponseImpl$XdtUpdateOpal$Opal$OpalInfo> r6 = com.instagram.opal.impl.graphql.UpdateOpalMutationResponseImpl.XdtUpdateOpal.Opal.OpalInfo.class
            r5 = -480358044(0xffffffffe35e5164, float:-4.101042E21)
            java.lang.String r4 = "opal_info"
            X.3lr r5 = r9.A03(r6, r4, r5)
            if (r5 == 0) goto L_0x011e
            java.lang.String r4 = "name"
            java.lang.String r14 = r5.A07(r4)
            if (r14 != 0) goto L_0x00b0
        L_0x011e:
            r14 = r12
            goto L_0x00b0
        L_0x0120:
            r5 = r7
            goto L_0x006e
        L_0x0123:
            java.lang.Object r11 = r6.A05
            X.2IV r11 = (X.2IV) r11
            java.lang.Object r4 = r6.A04
            X.1vn r4 = (X.1vn) r4
            java.lang.Object r1 = r6.A03
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.Object r0 = r6.A02
            com.instagram.opal.impl.data.OpalProfileData r0 = (com.instagram.opal.impl.data.OpalProfileData) r0
            java.lang.Object r2 = r6.A01
            com.instagram.opal.impl.data.OpalRepoUtil r2 = (com.instagram.opal.impl.data.OpalRepoUtil) r2
            X.0eS.A00(r12)
            goto L_0x01b2
        L_0x013b:
            X.0eS.A00(r12)
            X.2IV r11 = new X.2IV
            r11.<init>()
            java.lang.String r9 = r0.A02
            java.lang.String r2 = "bio"
            r11.A09(r9, r2)
            java.lang.String r9 = r0.A04
            java.lang.String r2 = "name"
            r11.A09(r9, r2)
            boolean r2 = r0.A0C
            if (r2 == 0) goto L_0x019e
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r8)
            r2 = 163(0xa3, float:2.28E-43)
            java.lang.String r2 = X.C273654mx.A00(r2)
            r11.A08(r2, r9)
        L_0x0162:
            r2 = r10
        L_0x0163:
            X.2IS r12 = X.C41845B3m.A04()
            X.2IS r10 = X.C41845B3m.A04()
            r18 = 0
            java.lang.String r9 = "input"
            X.1vR r11 = X.JTP.A0L(r11, r12, r9)
            java.util.Map r13 = r12.getParamsCopy()
            java.util.Map r14 = r10.getParamsCopy()
            java.lang.Class<com.instagram.opal.impl.graphql.UpdateOpalMutationResponseImpl> r15 = com.instagram.opal.impl.graphql.UpdateOpalMutationResponseImpl.class
            java.util.ArrayList r21 = X.AnonymousClass7TE.A1C()
            java.lang.String r12 = "UpdateOpalMutation"
            java.lang.String r20 = "xdt_update_opal"
            com.facebook.pando.PandoGraphQLRequest r10 = new com.facebook.pando.PandoGraphQLRequest
            r16 = r8
            r17 = r7
            r19 = r7
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.ME1.A00(r2, r0, r1, r7, r6)
            r6.A05 = r7
            r6.A00 = r3
            java.lang.Object r12 = r4.A04(r10, r6)
            if (r12 != r5) goto L_0x003e
        L_0x019d:
            return r5
        L_0x019e:
            java.lang.String r2 = r0.A03
            if (r2 == 0) goto L_0x0162
            X.ME1.A00(r10, r0, r1, r4, r6)
            r6.A05 = r11
            r6.A00 = r8
            r9 = r26
            java.lang.Object r12 = A00(r9, r1, r10, r2, r6)
            if (r12 == r5) goto L_0x019d
            r2 = r10
        L_0x01b2:
            java.lang.String r12 = (java.lang.String) r12
            if (r12 != 0) goto L_0x01b7
            return r7
        L_0x01b7:
            int r9 = r12.length()
            if (r9 <= 0) goto L_0x01c3
            java.lang.String r9 = "profile_picture_upload_id"
            r11.A09(r12, r9)
            goto L_0x0163
        L_0x01c3:
            java.lang.Boolean r10 = X.AnonymousClass7TE.A0u()
            r9 = 163(0xa3, float:2.28E-43)
            java.lang.String r9 = X.C273654mx.A00(r9)
            r11.A08(r9, r10)
            goto L_0x0163
        L_0x01d1:
            X.ME1 r6 = new X.ME1
            r6.<init>(r10, r8, r7)
            goto L_0x0020
        L_0x01d8:
            return r7
        L_0x01d9:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.opal.impl.data.OpalRepoUtil.A01(android.content.Context, com.instagram.common.session.UserSession, X.1vn, com.instagram.opal.impl.data.OpalProfileData, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.MDz, X.4D7] */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0194 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(com.instagram.common.session.UserSession r27, X.1vn r28, java.lang.String r29, X.AnonymousClass4D7 r30) {
        /*
            r26 = this;
            r11 = r29
            r2 = r27
            r6 = 8
            r7 = r30
            boolean r0 = X.C66147MDz.A02(r6, r7)
            r3 = r26
            if (r0 == 0) goto L_0x016d
            r1 = r7
            X.MDz r1 = (X.C66147MDz) r1
            int r5 = r1.A00
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r5 & r4
            if (r0 == 0) goto L_0x016d
            int r5 = r5 - r4
            r1.A00 = r5
        L_0x001e:
            java.lang.Object r5 = r1.A04
            X.1Hj r9 = X.1Hj.A02
            int r4 = r1.A00
            r0 = 1
            if (r4 == 0) goto L_0x011a
            if (r4 != r0) goto L_0x01c0
            java.lang.Object r2 = r1.A03
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.Object r11 = r1.A02
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r1 = r1.A01
            com.instagram.opal.impl.data.OpalRepoUtil r1 = (com.instagram.opal.impl.data.OpalRepoUtil) r1
            X.0eS.A00(r5)
        L_0x0038:
            X.3Ii r5 = (X.C239803Ii) r5
            X.17i r3 = X.17h.A00(r2)
            com.instagram.user.model.User r6 = r3.A02(r11)
            boolean r3 = r5 instanceof X.C239793Ih
            java.lang.String r13 = ""
            if (r3 == 0) goto L_0x0194
            X.3lr r8 = X.C41846B3n.A0R(r5)
            if (r8 == 0) goto L_0x0174
            java.lang.Class<com.instagram.opal.impl.graphql.GetOpalQueryResponseImpl$XdtOpal> r7 = com.instagram.opal.impl.graphql.GetOpalQueryResponseImpl.XdtOpal.class
            X.3sh r3 = X.C250663lr.Companion
            r5 = 973923119(0x3a0ce32f, float:5.374429E-4)
            r4 = 0
            java.lang.String r3 = "xdt_opal(input:$input)"
            X.3lr r7 = r8.getRequiredTreeField(r4, r3, r7, r5)
            java.lang.String r3 = "null cannot be cast to non-null type com.instagram.opal.impl.graphql.GetOpalQueryResponseImpl.XdtOpal"
            X.0qQ.A0C(r7, r3)
            com.instagram.opal.impl.graphql.GetOpalQueryResponseImpl$XdtOpal r7 = (com.instagram.opal.impl.graphql.GetOpalQueryResponseImpl.XdtOpal) r7
            if (r7 == 0) goto L_0x0174
            com.instagram.opal.impl.graphql.GetOpalQueryResponseImpl$XdtOpal$OpalInfo r3 = r7.A0E()
            if (r3 == 0) goto L_0x0174
            if (r6 == 0) goto L_0x0109
            java.lang.String r15 = r6.getUsername()
        L_0x0071:
            com.instagram.opal.impl.graphql.GetOpalQueryResponseImpl$XdtOpal$OpalInfo r5 = r7.A0E()
            if (r5 == 0) goto L_0x007f
            java.lang.String r3 = "name"
            java.lang.String r16 = r5.getOptionalStringField(r4, r3)
            if (r16 != 0) goto L_0x0081
        L_0x007f:
            r16 = r13
        L_0x0081:
            com.instagram.opal.impl.graphql.GetOpalQueryResponseImpl$XdtOpal$OpalInfo r5 = r7.A0E()
            if (r5 == 0) goto L_0x0093
            r3 = 40
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            java.lang.String r17 = r5.A09(r3)
            if (r17 != 0) goto L_0x0095
        L_0x0093:
            r17 = r13
        L_0x0095:
            com.instagram.opal.impl.graphql.GetOpalQueryResponseImpl$XdtOpal$OpalInfo r5 = r7.A0E()
            if (r5 == 0) goto L_0x00a3
            java.lang.String r3 = "bio"
            java.lang.String r19 = r5.getOptionalStringField(r0, r3)
            if (r19 != 0) goto L_0x00a5
        L_0x00a3:
            r19 = r13
        L_0x00a5:
            X.KhB r13 = X.C62520KhB.Loaded
            r5 = 2
            java.lang.String r3 = "selected_audience_count"
            int r21 = r7.getRequiredIntField(r5, r3)
            java.lang.Class<com.instagram.opal.impl.graphql.GetOpalQueryResponseImpl$XdtOpal$Audience> r8 = com.instagram.opal.impl.graphql.GetOpalQueryResponseImpl.XdtOpal.Audience.class
            r6 = -1543286222(0xffffffffa4035232, float:-2.847572E-17)
            r5 = 3
            r3 = 516(0x204, float:7.23E-43)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            X.3lr r8 = r7.getOptionalTreeField(r5, r3, r8, r6)
            if (r8 == 0) goto L_0x01c5
            java.lang.Class<com.instagram.opal.impl.graphql.GetOpalQueryResponseImpl$XdtOpal$Audience$Edges> r6 = com.instagram.opal.impl.graphql.GetOpalQueryResponseImpl.XdtOpal.Audience.Edges.class
            r5 = -5723451(0xffffffffffa8aac5, float:NaN)
            java.lang.String r3 = "edges"
            com.google.common.collect.ImmutableList r3 = r8.A06(r6, r3, r5)
            if (r3 == 0) goto L_0x01c5
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r10 = r3.iterator()
        L_0x00d5:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L_0x01c7
            X.3lr r9 = X.C41845B3m.A0V(r10)
            java.lang.Class<com.instagram.opal.impl.graphql.GetOpalQueryResponseImpl$XdtOpal$Audience$Edges$Node> r8 = com.instagram.opal.impl.graphql.GetOpalQueryResponseImpl.XdtOpal.Audience.Edges.Node.class
            r6 = -712504337(0xffffffffd5880bef, float:-1.86981045E13)
            java.lang.String r3 = "node"
            X.3lr r8 = r9.getRequiredTreeField(r4, r3, r8, r6)
            java.lang.String r3 = "null cannot be cast to non-null type com.instagram.opal.impl.graphql.GetOpalQueryResponseImpl.XdtOpal.Audience.Edges.Node"
            X.0qQ.A0C(r8, r3)
            java.lang.String r3 = "strong_id__"
            java.lang.String r6 = r8.getOptionalStringField(r4, r3)
            java.lang.String r3 = X.Dbj.A03()
            java.lang.String r3 = r8.A08(r3)
            if (r6 == 0) goto L_0x00d5
            if (r3 == 0) goto L_0x00d5
            com.instagram.opal.impl.data.OpalAudienceSelectorRepository$OpalAudience r3 = X.JTT.A0c(r8, r6, r3, r0)
            r5.add(r3)
            goto L_0x00d5
        L_0x0109:
            com.instagram.opal.impl.graphql.GetOpalQueryResponseImpl$XdtOpal$OpalInfo r5 = r7.A0E()
            if (r5 == 0) goto L_0x0117
            java.lang.String r3 = "name"
            java.lang.String r15 = r5.getOptionalStringField(r4, r3)
            if (r15 != 0) goto L_0x0071
        L_0x0117:
            r15 = r13
            goto L_0x0071
        L_0x011a:
            X.0eS.A00(r5)
            X.0K0 r5 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r19 = 0
            java.lang.String r4 = "user_id"
            X.0Df r5 = X.C41845B3m.A03(r5, r11, r4)
            X.2IS r7 = X.C41845B3m.A04()
            X.2IS r6 = X.C41845B3m.A04()
            java.lang.String r4 = "input"
            X.DbW.A18(r5, r7, r4)
            r4 = 4
            java.lang.Integer r5 = X.JTO.A0w(r4)
            java.lang.String r4 = "audience_count"
            r7.A03(r4, r5)
            X.1vR r13 = X.C41845B3m.A05()
            java.util.Map r15 = r7.getParamsCopy()
            java.util.Map r16 = r6.getParamsCopy()
            java.lang.Class<com.instagram.opal.impl.graphql.GetOpalQueryResponseImpl> r17 = com.instagram.opal.impl.graphql.GetOpalQueryResponseImpl.class
            java.util.ArrayList r23 = X.AnonymousClass7TE.A1C()
            java.lang.String r14 = "GetOpalQuery"
            r18 = 0
            java.lang.String r22 = "xdt_opal"
            com.facebook.pando.PandoGraphQLRequest r12 = new com.facebook.pando.PandoGraphQLRequest
            r20 = r18
            r21 = r19
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            X.C66147MDz.A00(r3, r11, r2, r1, r0)
            r4 = r28
            java.lang.Object r5 = r4.A04(r12, r1)
            if (r5 == r9) goto L_0x01e5
            r1 = r3
            goto L_0x0038
        L_0x016d:
            X.MDz r1 = new X.MDz
            r1.<init>(r3, r7, r6)
            goto L_0x001e
        L_0x0174:
            X.KhB r10 = X.C62520KhB.Error
            if (r6 == 0) goto L_0x0192
            java.lang.String r12 = r6.getUsername()
        L_0x017c:
            r15 = 0
            r18 = 0
            X.0sn r17 = X.0sn.A00
            com.instagram.opal.impl.data.OpalProfileData r9 = new com.instagram.opal.impl.data.OpalProfileData
            r14 = r13
            r16 = r13
            r19 = r18
            r20 = r18
            r21 = r18
            r22 = r18
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            goto L_0x01e2
        L_0x0192:
            r12 = r13
            goto L_0x017c
        L_0x0194:
            if (r6 == 0) goto L_0x01be
            X.4Cl r1 = r6.A03
            X.4bl r1 = r1.BYD()
            if (r1 == 0) goto L_0x01be
        L_0x019e:
            X.KhB r10 = X.C62520KhB.Error
            if (r6 == 0) goto L_0x01bc
            java.lang.String r12 = r6.getUsername()
        L_0x01a6:
            r15 = 0
            r18 = 0
            X.0sn r17 = X.0sn.A00
            com.instagram.opal.impl.data.OpalProfileData r9 = new com.instagram.opal.impl.data.OpalProfileData
            r14 = r13
            r16 = r13
            r19 = r0
            r20 = r18
            r21 = r18
            r22 = r18
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r9
        L_0x01bc:
            r12 = r13
            goto L_0x01a6
        L_0x01be:
            r0 = 0
            goto L_0x019e
        L_0x01c0:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x01c5:
            X.0sn r5 = X.0sn.A00
        L_0x01c7:
            r3 = 3448(0xd78, float:4.832E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            boolean r25 = r7.getCoercedBooleanField(r0, r3)
            r18 = 0
            com.instagram.opal.impl.data.OpalProfileData r9 = new com.instagram.opal.impl.data.OpalProfileData
            r12 = r9
            r14 = r11
            r20 = r5
            r22 = r0
            r23 = r4
            r24 = r4
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
        L_0x01e2:
            r1.A03(r2, r9)
        L_0x01e5:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.opal.impl.data.OpalRepoUtil.A02(com.instagram.common.session.UserSession, X.1vn, java.lang.String, X.4D7):java.lang.Object");
    }
}
