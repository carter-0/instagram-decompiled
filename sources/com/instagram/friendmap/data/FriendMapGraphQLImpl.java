package com.instagram.friendmap.data;

import X.1vm;
import X.1vn;
import com.instagram.common.session.UserSession;

public final class FriendMapGraphQLImpl {
    public final 1vn A00;
    public final UserSession A01;

    /* JADX WARNING: type inference failed for: r3v1, types: [X.MDo, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C68150N2q r18, X.AnonymousClass4D7 r19) {
        /*
            r17 = this;
            r4 = 35
            r5 = r19
            boolean r0 = X.C66136MDo.A01(r4, r5)
            r6 = r17
            if (r0 == 0) goto L_0x00d8
            r3 = r5
            X.MDo r3 = (X.C66136MDo) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00d8
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x001a:
            java.lang.Object r1 = r3.A01
            X.1Hj r2 = X.1Hj.A02
            int r0 = r3.A00
            r11 = 1
            if (r0 == 0) goto L_0x0061
            if (r0 != r11) goto L_0x00e1
            X.0eS.A00(r1)
        L_0x0028:
            boolean r0 = r1 instanceof X.C239793Ih
            r2 = 0
            if (r0 == 0) goto L_0x0060
            X.3Ih r1 = (X.C239793Ih) r1
            if (r1 == 0) goto L_0x0060
            java.lang.Object r0 = r1.A00
            X.3JC r0 = (X.AnonymousClass3JC) r0
            if (r0 == 0) goto L_0x0060
            java.lang.Object r5 = r0.A01
            X.3lr r5 = (X.C250663lr) r5
            if (r5 == 0) goto L_0x0060
            java.lang.Class<X.BlV> r3 = X.BlV.class
            r4 = 0
            r0 = 4227(0x1083, float:5.923E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 1989217049(0x76910b19, float:1.4709143E33)
            X.3lr r3 = r5.getRequiredTreeField(r4, r1, r3, r0)
            if (r3 == 0) goto L_0x0060
            java.lang.Class<X.Blb> r1 = X.C42881Blb.class
            r0 = -1976689303(0xffffffff8a2e1d69, float:-8.383327E-33)
            X.3lr r0 = r3.reinterpretRequired(r4, r1, r0)
            X.Blb r0 = (X.C42881Blb) r0
            if (r0 == 0) goto L_0x0060
            X.N2q r2 = X.C71130OdT.A01(r0)
        L_0x0060:
            return r2
        L_0x0061:
            X.0eS.A00(r1)
            X.1vn r4 = r6.A00
            r12 = 0
            X.2IS r5 = new X.2IS
            r5.<init>()
            X.2IS r9 = new X.2IS
            r9.<init>()
            X.0K0 r6 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r8 = r18
            double r0 = r8.A00
            java.lang.Double r7 = new java.lang.Double
            r7.<init>(r0)
            java.lang.String r0 = "latitude"
            X.0Df r6 = r6.A02()
            X.0Df.A00(r6, r7, r0)
            double r0 = r8.A01
            java.lang.Double r7 = new java.lang.Double
            r7.<init>(r0)
            java.lang.String r0 = "longitude"
            X.0Df.A00(r6, r7, r0)
            java.lang.String r1 = r8.A04
            java.lang.String r0 = "name"
            X.0Df.A00(r6, r1, r0)
            int r0 = r8.A02
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            java.lang.String r0 = "radius"
            X.0Df.A00(r6, r1, r0)
            java.lang.String r1 = "data"
            X.2IV r0 = r5.A00
            X.0Df r0 = r0.A02()
            r0.A0E(r6, r1)
            X.2IY r0 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1vR r6 = X.AnonymousClass1vS.A00()
            java.util.Map r8 = r5.getParamsCopy()
            java.util.Map r9 = r9.getParamsCopy()
            java.lang.Class<X.BlW> r10 = X.BlW.class
            java.util.ArrayList r16 = new java.util.ArrayList
            r16.<init>()
            java.lang.String r7 = "CreateFriendMapHiddenLocationMutation"
            r13 = 0
            java.lang.String r15 = "xdt_create_friend_map_hidden_location"
            com.facebook.pando.PandoGraphQLRequest r5 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r3.A00 = r11
            java.lang.Object r1 = r4.A04(r5, r3)
            if (r1 != r2) goto L_0x0028
            return r2
        L_0x00d8:
            r0 = 42
            X.MDo r3 = new X.MDo
            r3.<init>(r6, r5, r4, r0)
            goto L_0x001a
        L_0x00e1:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.friendmap.data.FriendMapGraphQLImpl.A00(X.N2q, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.MDo, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.C68150N2q r18, X.AnonymousClass4D7 r19) {
        /*
            r17 = this;
            r4 = 40
            r5 = r19
            boolean r0 = X.C66136MDo.A01(r4, r5)
            r6 = r17
            if (r0 == 0) goto L_0x00df
            r3 = r5
            X.MDo r3 = (X.C66136MDo) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00df
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x001a:
            java.lang.Object r1 = r3.A01
            X.1Hj r2 = X.1Hj.A02
            int r0 = r3.A00
            r11 = 1
            r12 = 0
            if (r0 == 0) goto L_0x0060
            if (r0 != r11) goto L_0x00e8
            X.0eS.A00(r1)
        L_0x0029:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x005f
            X.3Ih r1 = (X.C239793Ih) r1
            if (r1 == 0) goto L_0x005f
            java.lang.Object r0 = r1.A00
            X.3JC r0 = (X.AnonymousClass3JC) r0
            if (r0 == 0) goto L_0x005f
            java.lang.Object r3 = r0.A01
            X.3lr r3 = (X.C250663lr) r3
            if (r3 == 0) goto L_0x005f
            java.lang.Class<X.BmH> r2 = X.BmH.class
            r0 = 4249(0x1099, float:5.954E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 320763991(0x131e7857, float:2.0001736E-27)
            X.3lr r2 = r3.A05(r2, r1, r0)
            if (r2 == 0) goto L_0x005f
            java.lang.Class<X.Blb> r1 = X.C42881Blb.class
            r0 = -1976689303(0xffffffff8a2e1d69, float:-8.383327E-33)
            X.3lr r0 = r2.A01(r1, r0)
            X.Blb r0 = (X.C42881Blb) r0
            if (r0 == 0) goto L_0x005f
            X.N2q r12 = X.C71130OdT.A01(r0)
        L_0x005f:
            return r12
        L_0x0060:
            X.0eS.A00(r1)
            r8 = r18
            java.lang.String r1 = r8.A03
            if (r1 == 0) goto L_0x005f
            X.1vn r4 = r6.A00
            X.2IS r5 = new X.2IS
            r5.<init>()
            X.2IS r9 = new X.2IS
            r9.<init>()
            java.lang.String r0 = "location_id"
            r5.A04(r0, r1)
            X.0K0 r6 = com.facebook.graphql.calls.GraphQlCallInput.A02
            double r0 = r8.A00
            java.lang.Double r7 = new java.lang.Double
            r7.<init>(r0)
            java.lang.String r0 = "latitude"
            X.0Df r6 = r6.A02()
            X.0Df.A00(r6, r7, r0)
            double r0 = r8.A01
            java.lang.Double r7 = new java.lang.Double
            r7.<init>(r0)
            java.lang.String r0 = "longitude"
            X.0Df.A00(r6, r7, r0)
            java.lang.String r1 = r8.A04
            java.lang.String r0 = "name"
            X.0Df.A00(r6, r1, r0)
            int r0 = r8.A02
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            java.lang.String r0 = "radius"
            X.0Df.A00(r6, r1, r0)
            java.lang.String r1 = "data"
            X.2IV r0 = r5.A00
            X.0Df r0 = r0.A02()
            r0.A0E(r6, r1)
            X.2IY r0 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1vR r6 = X.AnonymousClass1vS.A00()
            java.util.Map r8 = r5.getParamsCopy()
            java.util.Map r9 = r9.getParamsCopy()
            java.lang.Class<X.BmI> r10 = X.BmI.class
            java.util.ArrayList r16 = new java.util.ArrayList
            r16.<init>()
            java.lang.String r7 = "UpdateFriendMapHiddenLocationMutation"
            r13 = 0
            java.lang.String r15 = "xdt_update_friend_map_hidden_location"
            com.facebook.pando.PandoGraphQLRequest r5 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r3.A00 = r11
            java.lang.Object r1 = r4.A04(r5, r3)
            if (r1 != r2) goto L_0x0029
            return r2
        L_0x00df:
            r0 = 42
            X.MDo r3 = new X.MDo
            r3.<init>(r6, r5, r4, r0)
            goto L_0x001a
        L_0x00e8:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.friendmap.data.FriendMapGraphQLImpl.A01(X.N2q, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.4D7, X.MDp] */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.AnonymousClass4A6 r18, X.AnonymousClass4D7 r19, boolean r20) {
        /*
            r17 = this;
            r5 = 17
            r6 = r19
            boolean r0 = X.C66137MDp.A02(r5, r6)
            r4 = r17
            if (r0 == 0) goto L_0x00c0
            r3 = r6
            X.MDp r3 = (X.C66137MDp) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00c0
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x001a:
            java.lang.Object r1 = r3.A02
            X.1Hj r2 = X.1Hj.A02
            int r0 = r3.A00
            r12 = 0
            r11 = 1
            if (r0 == 0) goto L_0x0066
            if (r0 != r11) goto L_0x00c7
            java.lang.Object r4 = r3.A01
            com.instagram.friendmap.data.FriendMapGraphQLImpl r4 = (com.instagram.friendmap.data.FriendMapGraphQLImpl) r4
            X.0eS.A00(r1)
        L_0x002d:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0065
            X.3Ih r1 = (X.C239793Ih) r1
            if (r1 == 0) goto L_0x0065
            java.lang.Object r0 = r1.A00
            X.3JC r0 = (X.AnonymousClass3JC) r0
            if (r0 == 0) goto L_0x0065
            java.lang.Object r3 = r0.A01
            X.3lr r3 = (X.C250663lr) r3
            if (r3 == 0) goto L_0x0065
            java.lang.Class<X.BmJ> r2 = X.BmJ.class
            r0 = 4250(0x109a, float:5.956E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 1499152273(0x595b3f91, float:3.85705699E15)
            X.3lr r2 = r3.A05(r2, r1, r0)
            if (r2 == 0) goto L_0x0065
            java.lang.Class<X.Blw> r1 = X.C42902Blw.class
            r0 = -1620690398(0xffffffff9f663a22, float:-4.875248E-20)
            X.3lr r1 = r2.A01(r1, r0)
            X.Blw r1 = (X.C42902Blw) r1
            if (r1 == 0) goto L_0x0065
            com.instagram.common.session.UserSession r0 = r4.A01
            X.4A6 r12 = X.C71130OdT.A05(r0, r1)
        L_0x0065:
            return r12
        L_0x0066:
            X.0eS.A00(r1)
            X.1vn r1 = r4.A00
            X.2IS r8 = new X.2IS
            r8.<init>()
            X.2IS r9 = new X.2IS
            r9.<init>()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r20)
            java.lang.String r0 = "update_seen_time"
            r8.A02(r0, r5)
            r7 = 0
            if (r5 == 0) goto L_0x0082
            r7 = 1
        L_0x0082:
            r0 = r18
            X.4A5 r6 = r0.A04
            java.lang.String r5 = r6.A00
            X.4A5 r0 = X.AnonymousClass4A5.UNSET
            if (r6 != r0) goto L_0x008d
            r5 = r12
        L_0x008d:
            java.lang.String r0 = "audience"
            r8.A04(r0, r5)
            X.17k.A0E(r7)
            X.2IY r0 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1vR r6 = X.AnonymousClass1vS.A00()
            java.util.Map r8 = r8.getParamsCopy()
            java.util.Map r9 = r9.getParamsCopy()
            java.lang.Class<X.BmK> r10 = X.BmK.class
            java.util.ArrayList r16 = new java.util.ArrayList
            r16.<init>()
            java.lang.String r7 = "UpdateFriendMapSettingsMutation"
            r13 = 0
            java.lang.String r15 = "xdt_update_friend_map_settings"
            com.facebook.pando.PandoGraphQLRequest r5 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r3.A01 = r4
            r3.A00 = r11
            java.lang.Object r1 = r1.A04(r5, r3)
            if (r1 != r2) goto L_0x002d
            return r2
        L_0x00c0:
            X.MDp r3 = new X.MDp
            r3.<init>(r4, r6, r5)
            goto L_0x001a
        L_0x00c7:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.friendmap.data.FriendMapGraphQLImpl.A02(X.4A6, X.4D7, boolean):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.MDo, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(X.AnonymousClass4A5 r20, java.util.Set r21, java.util.Set r22, X.AnonymousClass4D7 r23) {
        /*
            r19 = this;
            r4 = 39
            r5 = r23
            boolean r0 = X.C66136MDo.A01(r4, r5)
            r6 = r19
            if (r0 == 0) goto L_0x00ba
            r2 = r5
            X.MDo r2 = (X.C66136MDo) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x00ba
            int r3 = r3 - r1
            r2.A00 = r3
        L_0x001a:
            java.lang.Object r1 = r2.A01
            X.1Hj r3 = X.1Hj.A02
            int r0 = r2.A00
            r13 = 1
            if (r0 == 0) goto L_0x005b
            if (r0 != r13) goto L_0x00c3
            X.0eS.A00(r1)
        L_0x0028:
            boolean r0 = r1 instanceof X.C239793Ih
            r3 = 0
            if (r0 == 0) goto L_0x005a
            X.3Ih r1 = (X.C239793Ih) r1
            if (r1 == 0) goto L_0x005a
            java.lang.Object r0 = r1.A00
            X.3JC r0 = (X.AnonymousClass3JC) r0
            if (r0 == 0) goto L_0x005a
            java.lang.Object r5 = r0.A01
            X.3lr r5 = (X.C250663lr) r5
            if (r5 == 0) goto L_0x005a
            java.lang.Class<X.BlX> r4 = X.BlX.class
            r2 = 0
            r0 = 4251(0x109b, float:5.957E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 1010177151(0x3c36147f, float:0.011113285)
            X.3lr r1 = r5.getRequiredTreeField(r2, r1, r4, r0)
            if (r1 == 0) goto L_0x005a
            java.lang.String r0 = "num_users"
            int r0 = r1.getRequiredIntField(r2, r0)
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r0)
        L_0x005a:
            return r3
        L_0x005b:
            X.0eS.A00(r1)
            X.1vn r1 = r6.A00
            r14 = 0
            X.2IS r6 = new X.2IS
            r6.<init>()
            X.2IS r7 = new X.2IS
            r7.<init>()
            X.2IV r5 = new X.2IV
            r5.<init>()
            r0 = r20
            java.lang.String r4 = r0.A00
            java.lang.String r0 = "list_type"
            r5.A09(r4, r0)
            java.util.List r4 = X.00k.A0a(r21)
            java.lang.String r0 = "add_user_ids"
            r5.A05(r0, r4)
            java.util.List r4 = X.00k.A0a(r22)
            java.lang.String r0 = "remove_user_ids"
            r5.A05(r0, r4)
            java.lang.String r0 = "data"
            r6.A00(r5, r0)
            X.2IY r0 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1vR r8 = X.AnonymousClass1vS.A00()
            java.util.Map r10 = r6.getParamsCopy()
            java.util.Map r11 = r7.getParamsCopy()
            java.lang.Class<X.BlY> r12 = X.BlY.class
            java.util.ArrayList r18 = new java.util.ArrayList
            r18.<init>()
            java.lang.String r9 = "CreateOrUpdateAudienceListMutation"
            r15 = 0
            java.lang.String r17 = "xdt_update_presence_audience_list_members"
            com.facebook.pando.PandoGraphQLRequest r7 = new com.facebook.pando.PandoGraphQLRequest
            r16 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r2.A00 = r13
            java.lang.Object r1 = r1.A04(r7, r2)
            if (r1 != r3) goto L_0x0028
            return r3
        L_0x00ba:
            r0 = 42
            X.MDo r2 = new X.MDo
            r2.<init>(r6, r5, r4, r0)
            goto L_0x001a
        L_0x00c3:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.friendmap.data.FriendMapGraphQLImpl.A03(X.4A5, java.util.Set, java.util.Set, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.4D7, X.MDp] */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(X.AnonymousClass4A5 r22, X.AnonymousClass4D7 r23) {
        /*
            r21 = this;
            r3 = 16
            r6 = r23
            boolean r0 = X.C66137MDp.A02(r3, r6)
            r5 = r21
            if (r0 == 0) goto L_0x0105
            r4 = r6
            X.MDp r4 = (X.C66137MDp) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0105
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x001a:
            java.lang.Object r3 = r4.A02
            X.1Hj r1 = X.1Hj.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x00aa
            if (r0 != r2) goto L_0x016a
            java.lang.Object r7 = r4.A01
            com.instagram.friendmap.data.FriendMapGraphQLImpl r7 = (com.instagram.friendmap.data.FriendMapGraphQLImpl) r7
            X.0eS.A00(r3)
        L_0x002c:
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0172
            X.3Ih r3 = (X.C239793Ih) r3
            if (r3 == 0) goto L_0x0172
            java.lang.Object r0 = r3.A00
            X.3JC r0 = (X.AnonymousClass3JC) r0
            if (r0 == 0) goto L_0x0172
            java.lang.Object r4 = r0.A01
            X.3lr r4 = (X.C250663lr) r4
            if (r4 == 0) goto L_0x0172
            java.lang.Class<X.BmB> r3 = X.BmB.class
            r6 = 0
            r0 = 4235(0x108b, float:5.934E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 1939573676(0x739b8bac, float:2.4647183E31)
            X.3lr r8 = r4.getRequiredTreeField(r6, r1, r3, r0)
            if (r8 == 0) goto L_0x0172
            java.lang.Class<X.Bm9> r3 = X.Bm9.class
            r0 = 3921(0xf51, float:5.494E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = -1215831785(0xffffffffb787e117, float:-1.619807E-5)
            com.google.common.collect.ImmutableList r1 = r8.getRequiredCompactedTreeListField(r6, r1, r3, r0)
            X.0qQ.A07(r1)
            r4 = 10
            int r0 = X.0Yv.A1E(r1, r4)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r0)
            java.util.Iterator r10 = r1.iterator()
        L_0x0073:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x010c
            java.lang.Object r3 = r10.next()
            X.3lr r3 = (X.C250663lr) r3
            java.lang.Class<X.BlU> r1 = X.BlU.class
            r0 = 246733201(0xeb4d991, float:4.4582935E-30)
            X.3lr r1 = r3.reinterpretRequired(r6, r1, r0)
            com.instagram.common.session.UserSession r0 = r7.A01
            X.1E5 r9 = X.1E4.A00(r0)
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR
            java.lang.Class<com.instagram.user.model.ImmutablePandoUserDict> r0 = com.instagram.user.model.ImmutablePandoUserDict.class
            com.facebook.pando.TreeJNI r3 = r1.reinterpret(r0)
            com.instagram.user.model.ImmutablePandoUserDict r3 = (com.instagram.user.model.ImmutablePandoUserDict) r3
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            X.1E9 r0 = new X.1E9
            r0.<init>(r9, r1, r6)
            com.instagram.user.model.User r0 = X.1aC.A01(r0, r3)
            r5.add(r0)
            goto L_0x0073
        L_0x00aa:
            X.0eS.A00(r3)
            X.1vn r3 = r5.A00
            r16 = 0
            X.2IS r8 = new X.2IS
            r8.<init>()
            X.2IS r9 = new X.2IS
            r9.<init>()
            X.0K0 r7 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r0 = r22
            java.lang.String r6 = r0.A00
            java.lang.String r0 = "list_type"
            X.0Df r7 = r7.A02()
            X.0Df.A00(r7, r6, r0)
            java.lang.String r6 = "data"
            X.2IV r0 = r8.A00
            X.0Df r0 = r0.A02()
            r0.A0E(r7, r6)
            X.2IY r0 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1vR r10 = X.AnonymousClass1vS.A00()
            java.util.Map r12 = r8.getParamsCopy()
            java.util.Map r13 = r9.getParamsCopy()
            java.lang.Class<X.BmC> r14 = X.BmC.class
            java.util.ArrayList r20 = new java.util.ArrayList
            r20.<init>()
            java.lang.String r11 = "GetAudienceList"
            r15 = 0
            java.lang.String r19 = "xdt_get_presence_audience_list_members"
            com.facebook.pando.PandoGraphQLRequest r9 = new com.facebook.pando.PandoGraphQLRequest
            r17 = r15
            r18 = r16
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r4.A01 = r5
            r4.A00 = r2
            java.lang.Object r3 = r3.A04(r9, r4)
            if (r3 == r1) goto L_0x0179
            r7 = r5
            goto L_0x002c
        L_0x0105:
            X.MDp r4 = new X.MDp
            r4.<init>(r5, r6, r3)
            goto L_0x001a
        L_0x010c:
            java.lang.Class<X.BmA> r3 = X.BmA.class
            r0 = 4071(0xfe7, float:5.705E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = -114956554(0xfffffffff925e6f6, float:-5.383834E34)
            com.google.common.collect.ImmutableList r1 = r8.getRequiredCompactedTreeListField(r2, r1, r3, r0)
            X.0qQ.A07(r1)
            int r0 = X.0Yv.A1E(r1, r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
            java.util.Iterator r8 = r1.iterator()
        L_0x012b:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0162
            java.lang.Object r2 = r8.next()
            X.3lr r2 = (X.C250663lr) r2
            java.lang.Class<X.BlU> r1 = X.BlU.class
            r0 = 246733201(0xeb4d991, float:4.4582935E-30)
            X.3lr r1 = r2.reinterpretRequired(r6, r1, r0)
            com.instagram.common.session.UserSession r0 = r7.A01
            X.1E5 r3 = X.1E4.A00(r0)
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR
            java.lang.Class<com.instagram.user.model.ImmutablePandoUserDict> r0 = com.instagram.user.model.ImmutablePandoUserDict.class
            com.facebook.pando.TreeJNI r2 = r1.reinterpret(r0)
            com.instagram.user.model.ImmutablePandoUserDict r2 = (com.instagram.user.model.ImmutablePandoUserDict) r2
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            X.1E9 r0 = new X.1E9
            r0.<init>(r3, r1, r6)
            com.instagram.user.model.User r0 = X.1aC.A01(r0, r2)
            r4.add(r0)
            goto L_0x012b
        L_0x0162:
            r0 = 31
            X.N4R r1 = new X.N4R
            r1.<init>((java.util.List) r5, (java.util.List) r4, (int) r0)
            return r1
        L_0x016a:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0172:
            r0 = 31
            X.N4R r1 = new X.N4R
            r1.<init>((int) r0)
        L_0x0179:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.friendmap.data.FriendMapGraphQLImpl.A04(X.4A5, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDo, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A05(java.lang.String r10, java.lang.String r11, X.AnonymousClass4D7 r12) {
        /*
            r9 = this;
            r3 = 37
            boolean r0 = X.C66136MDo.A01(r3, r12)
            if (r0 == 0) goto L_0x00bb
            r5 = r12
            X.MDo r5 = (X.C66136MDo) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00bb
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A01
            X.1Hj r7 = X.1Hj.A02
            int r0 = r5.A00
            r6 = 1
            if (r0 == 0) goto L_0x0049
            if (r0 != r6) goto L_0x00c4
            X.0eS.A00(r1)
        L_0x0024:
            boolean r0 = r1 instanceof X.C239793Ih
            r7 = 0
            if (r0 == 0) goto L_0x0048
            X.3Ih r1 = (X.C239793Ih) r1
            if (r1 == 0) goto L_0x0048
            java.lang.Object r0 = r1.A00
            X.3JC r0 = (X.AnonymousClass3JC) r0
            if (r0 == 0) goto L_0x0048
            java.lang.Object r0 = r0.A01
            X.C8O r0 = (X.C8O) r0
            if (r0 == 0) goto L_0x0048
            X.C5h r2 = r0.A0E()
            if (r2 == 0) goto L_0x0048
            java.lang.Class<X.C5q> r1 = X.C43694C5q.class
            r0 = 840623695(0x321ae64f, float:9.016346E-9)
            X.3lr r7 = r2.A01(r1, r0)
        L_0x0048:
            return r7
        L_0x0049:
            X.0eS.A00(r1)
            X.1vn r4 = r9.A00
            X.2IS r8 = new X.2IS
            r8.<init>()
            X.2IS r3 = new X.2IS
            r3.<init>()
            if (r10 != 0) goto L_0x005c
            java.lang.String r10 = ""
        L_0x005c:
            java.lang.String r0 = "query"
            r8.A04(r0, r10)
            java.lang.String r1 = "friend_map"
            r0 = 41
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r8.A04(r0, r1)
            r0 = 651(0x28b, float:9.12E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r8.A01(r0)
            r0 = 658(0x292, float:9.22E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r8.A01(r0)
            r0 = 1327(0x52f, float:1.86E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r8.A01(r0)
            X.0K0 r2 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r0 = 50
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            java.lang.String r0 = "limit"
            X.0Df r2 = r2.A02()
            X.0Df.A00(r2, r1, r0)
            java.lang.String r0 = "next_max_id"
            X.0Df.A00(r2, r11, r0)
            java.lang.String r1 = "request_data"
            X.2IV r0 = r8.A00
            X.0Df r0 = r0.A02()
            r0.A0E(r2, r1)
            java.lang.String r0 = "max_id"
            r8.A04(r0, r11)
            com.facebook.pando.PandoGraphQLRequest r0 = X.C50173FSf.A00(r8, r3, r6, r6)
            r5.A00 = r6
            java.lang.Object r1 = r4.A04(r0, r5)
            if (r1 != r7) goto L_0x0024
            return r7
        L_0x00bb:
            r0 = 42
            X.MDo r5 = new X.MDo
            r5.<init>(r9, r12, r3, r0)
            goto L_0x0016
        L_0x00c4:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.friendmap.data.FriendMapGraphQLImpl.A05(java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.MDo, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A06(java.lang.String r18, X.AnonymousClass4D7 r19) {
        /*
            r17 = this;
            r4 = 36
            r5 = r19
            boolean r0 = X.C66136MDo.A01(r4, r5)
            r6 = r17
            if (r0 == 0) goto L_0x0076
            r2 = r5
            X.MDo r2 = (X.C66136MDo) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x0076
            int r3 = r3 - r1
            r2.A00 = r3
        L_0x001a:
            java.lang.Object r1 = r2.A01
            X.1Hj r3 = X.1Hj.A02
            int r0 = r2.A00
            r11 = 1
            if (r0 == 0) goto L_0x002f
            if (r0 != r11) goto L_0x007e
            X.0eS.A00(r1)
        L_0x0028:
            boolean r0 = r1 instanceof X.C239793Ih
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x002f:
            X.0eS.A00(r1)
            X.1vn r1 = r6.A00
            r12 = 0
            X.2IS r5 = new X.2IS
            r5.<init>()
            X.2IS r4 = new X.2IS
            r4.<init>()
            java.lang.String r0 = "location_id"
            r6 = r18
            r5.A04(r0, r6)
            r0 = 0
            if (r18 == 0) goto L_0x004a
            r0 = 1
        L_0x004a:
            X.17k.A0E(r0)
            X.2IY r0 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1vR r6 = X.AnonymousClass1vS.A00()
            java.util.Map r8 = r5.getParamsCopy()
            java.util.Map r9 = r4.getParamsCopy()
            java.lang.Class<X.Bla> r10 = X.C42880Bla.class
            java.util.ArrayList r16 = new java.util.ArrayList
            r16.<init>()
            java.lang.String r7 = "DeleteFriendMapHiddenLocationMutation"
            r13 = 0
            java.lang.String r15 = "xdt_delete_friend_map_hidden_location"
            com.facebook.pando.PandoGraphQLRequest r5 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r2.A00 = r11
            java.lang.Object r1 = r1.A04(r5, r2)
            if (r1 != r3) goto L_0x0028
            return r3
        L_0x0076:
            r0 = 42
            X.MDo r2 = new X.MDo
            r2.<init>(r6, r5, r4, r0)
            goto L_0x001a
        L_0x007e:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.friendmap.data.FriendMapGraphQLImpl.A06(java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.MDo, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A07(java.util.List r19, X.AnonymousClass4D7 r20) {
        /*
            r18 = this;
            r4 = 38
            r5 = r20
            boolean r0 = X.C66136MDo.A01(r4, r5)
            r6 = r18
            if (r0 == 0) goto L_0x0079
            r2 = r5
            X.MDo r2 = (X.C66136MDo) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x0079
            int r3 = r3 - r1
            r2.A00 = r3
        L_0x001a:
            java.lang.Object r1 = r2.A01
            X.1Hj r3 = X.1Hj.A02
            int r0 = r2.A00
            r12 = 1
            if (r0 == 0) goto L_0x002f
            if (r0 != r12) goto L_0x0081
            X.0eS.A00(r1)
        L_0x0028:
            boolean r0 = r1 instanceof X.C239793Ih
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x002f:
            X.0eS.A00(r1)
            X.1vn r1 = r6.A00
            r13 = 0
            X.2IS r6 = new X.2IS
            r6.<init>()
            X.2IS r5 = new X.2IS
            r5.<init>()
            X.2IV r4 = new X.2IV
            r4.<init>()
            java.lang.String r0 = "presence_ids"
            r7 = r19
            r4.A05(r0, r7)
            java.lang.String r0 = "data"
            r6.A00(r4, r0)
            X.2IY r0 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1vR r7 = X.AnonymousClass1vS.A00()
            java.util.Map r9 = r6.getParamsCopy()
            java.util.Map r10 = r5.getParamsCopy()
            java.lang.Class<X.BmG> r11 = X.BmG.class
            java.util.ArrayList r17 = new java.util.ArrayList
            r17.<init>()
            java.lang.String r8 = "UnlockPresencesMutation"
            r14 = 0
            java.lang.String r16 = "xdt_unlock_presences"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r2.A00 = r12
            java.lang.Object r1 = r1.A04(r6, r2)
            if (r1 != r3) goto L_0x0028
            return r3
        L_0x0079:
            r0 = 42
            X.MDo r2 = new X.MDo
            r2.<init>(r6, r5, r4, r0)
            goto L_0x001a
        L_0x0081:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.friendmap.data.FriendMapGraphQLImpl.A07(java.util.List, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.9JT, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A08(X.AnonymousClass4D7 r19) {
        /*
            r18 = this;
            r4 = 23
            r5 = r19
            boolean r0 = X.AnonymousClass9JT.A00(r4, r5)
            r6 = r18
            if (r0 == 0) goto L_0x0095
            r3 = r5
            X.9JT r3 = (X.AnonymousClass9JT) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0095
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x001a:
            java.lang.Object r1 = r3.A01
            X.1Hj r4 = X.1Hj.A02
            int r0 = r3.A00
            r2 = 1
            if (r0 == 0) goto L_0x004a
            if (r0 != r2) goto L_0x009e
            X.0eS.A00(r1)
        L_0x0028:
            boolean r0 = r1 instanceof X.C239793Ih
            r4 = 0
            if (r0 == 0) goto L_0x0049
            X.3Ih r1 = (X.C239793Ih) r1
            if (r1 == 0) goto L_0x0049
            java.lang.Object r0 = r1.A00
            X.3JC r0 = (X.AnonymousClass3JC) r0
            if (r0 == 0) goto L_0x0049
            java.lang.Object r5 = r0.A01
            X.3lr r5 = (X.C250663lr) r5
            if (r5 == 0) goto L_0x0049
            java.lang.Class<X.Bm7> r3 = X.Bm7.class
            r2 = 0
            java.lang.String r1 = "xdt_get_all_presence_points(data:$data)"
            r0 = -1043750081(0xffffffffc1c9a33f, float:-25.20471)
            X.3lr r4 = r5.getRequiredTreeField(r2, r1, r3, r0)
        L_0x0049:
            return r4
        L_0x004a:
            X.0eS.A00(r1)
            X.1vn r1 = r6.A00
            r13 = 0
            X.2IS r9 = new X.2IS
            r9.<init>()
            X.2IS r8 = new X.2IS
            r8.<init>()
            X.0K0 r7 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r6 = "data"
            X.2IV r0 = r9.A00
            X.0Df r5 = r0.A02()
            X.0Df r0 = r7.A02()
            r5.A0E(r0, r6)
            X.2IY r0 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1vR r7 = X.AnonymousClass1vS.A00()
            java.util.Map r9 = r9.getParamsCopy()
            java.util.Map r10 = r8.getParamsCopy()
            java.lang.Class<X.Bm8> r11 = X.Bm8.class
            java.util.ArrayList r17 = new java.util.ArrayList
            r17.<init>()
            java.lang.String r8 = "GetAllPresencePoints"
            r12 = 0
            java.lang.String r16 = "xdt_get_all_presence_points"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r3.A00 = r2
            java.lang.Object r1 = r1.A04(r6, r3)
            if (r1 != r4) goto L_0x0028
            return r4
        L_0x0095:
            r0 = 42
            X.9JT r3 = new X.9JT
            r3.<init>(r6, r5, r4, r0)
            goto L_0x001a
        L_0x009e:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.friendmap.data.FriendMapGraphQLImpl.A08(X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.9JX, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(X.AnonymousClass4D7 r20) {
        /*
            r19 = this;
            r3 = 41
            r6 = r20
            boolean r0 = X.AnonymousClass9JX.A00(r3, r6)
            r5 = r19
            if (r0 == 0) goto L_0x00a7
            r4 = r6
            X.9JX r4 = (X.AnonymousClass9JX) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00a7
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x001a:
            java.lang.Object r2 = r4.A02
            X.1Hj r0 = X.1Hj.A02
            int r1 = r4.A00
            r3 = 1
            if (r1 == 0) goto L_0x0066
            if (r1 != r3) goto L_0x00bf
            java.lang.Object r5 = r4.A01
            com.instagram.friendmap.data.FriendMapGraphQLImpl r5 = (com.instagram.friendmap.data.FriendMapGraphQLImpl) r5
            X.0eS.A00(r2)
        L_0x002c:
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00ae
            X.3Ih r2 = (X.C239793Ih) r2
            if (r2 == 0) goto L_0x00ae
            java.lang.Object r0 = r2.A00
            X.3JC r0 = (X.AnonymousClass3JC) r0
            if (r0 == 0) goto L_0x00ae
            java.lang.Object r4 = r0.A01
            X.3lr r4 = (X.C250663lr) r4
            if (r4 == 0) goto L_0x00ae
            java.lang.Class<X.BmD> r2 = X.BmD.class
            r3 = 0
            r0 = 1942(0x796, float:2.721E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 586611601(0x22f6fb91, float:6.694479E-18)
            X.3lr r2 = r4.getOptionalTreeField(r3, r1, r2, r0)
            if (r2 == 0) goto L_0x00ae
            java.lang.Class<X.Blw> r1 = X.C42902Blw.class
            r0 = -1620690398(0xffffffff9f663a22, float:-4.875248E-20)
            X.3lr r1 = r2.reinterpretRequired(r3, r1, r0)
            X.Blw r1 = (X.C42902Blw) r1
            if (r1 == 0) goto L_0x00ae
            com.instagram.common.session.UserSession r0 = r5.A01
            X.4A6 r0 = X.C71130OdT.A05(r0, r1)
            return r0
        L_0x0066:
            X.0eS.A00(r2)
            X.1vn r2 = r5.A00
            r14 = 0
            X.2IS r7 = new X.2IS
            r7.<init>()
            X.2IS r6 = new X.2IS
            r6.<init>()
            X.2IY r1 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1vR r8 = X.AnonymousClass1vS.A00()
            java.util.Map r10 = r7.getParamsCopy()
            java.util.Map r11 = r6.getParamsCopy()
            java.lang.Class<X.BmE> r12 = X.BmE.class
            java.util.ArrayList r18 = new java.util.ArrayList
            r18.<init>()
            java.lang.String r9 = "GetFriendMapSettingsQuery"
            r13 = 0
            r1 = 1942(0x796, float:2.721E-42)
            java.lang.String r17 = X.AnonymousClass000.A00(r1)
            com.facebook.pando.PandoGraphQLRequest r7 = new com.facebook.pando.PandoGraphQLRequest
            r15 = r13
            r16 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r4.A01 = r5
            r4.A00 = r3
            java.lang.Object r2 = r2.A04(r7, r4)
            if (r2 != r0) goto L_0x002c
            return r0
        L_0x00a7:
            X.9JX r4 = new X.9JX
            r4.<init>(r5, r6, r3)
            goto L_0x001a
        L_0x00ae:
            X.4A5 r1 = X.AnonymousClass4A5.UNSET
            r7 = 0
            r4 = 0
            X.0sn r2 = X.0sn.A00
            X.4A6 r0 = new X.4A6
            r3 = r2
            r5 = r4
            r6 = r4
            r9 = r4
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9)
            return r0
        L_0x00bf:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.friendmap.data.FriendMapGraphQLImpl.A09(X.4D7):java.lang.Object");
    }

    public FriendMapGraphQLImpl(UserSession userSession) {
        this.A01 = userSession;
        this.A00 = 1vm.A01(userSession);
    }
}
