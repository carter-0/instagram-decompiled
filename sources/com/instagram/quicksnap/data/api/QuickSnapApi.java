package com.instagram.quicksnap.data.api;

import X.0qQ;
import X.1vm;
import X.1vn;
import X.C359058bw;
import com.instagram.common.session.UserSession;

public final class QuickSnapApi {
    public final UserSession A00;
    public final 1vn A01;
    public final C359058bw A02;

    public QuickSnapApi(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = 1vm.A01(userSession);
        this.A02 = new C359058bw(userSession);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.ME6, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.lang.String r17, java.lang.String r18, X.AnonymousClass4D7 r19) {
        /*
            r16 = this;
            r4 = 46
            r5 = r19
            boolean r0 = X.ME6.A02(r4, r5)
            r6 = r16
            if (r0 == 0) goto L_0x00a2
            r2 = r5
            X.ME6 r2 = (X.ME6) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x00a2
            int r3 = r3 - r1
            r2.A00 = r3
        L_0x001a:
            java.lang.Object r1 = r2.A01
            X.1Hj r3 = X.1Hj.A02
            int r0 = r2.A00
            r10 = 1
            if (r0 == 0) goto L_0x004a
            if (r0 != r10) goto L_0x00bb
            X.0eS.A00(r1)
        L_0x0028:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0040
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            X.3Ih r1 = new X.3Ih
            r1.<init>(r0)
        L_0x0037:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00ab
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            return r0
        L_0x0040:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0037
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x004a:
            X.0eS.A00(r1)
            X.1vn r1 = r6.A01
            r11 = 0
            X.2IS r7 = new X.2IS
            r7.<init>()
            X.2IS r6 = new X.2IS
            r6.<init>()
            X.0K0 r4 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r0 = "media_id"
            X.0Df r5 = r4.A02()
            r4 = r17
            X.0Df.A00(r5, r4, r0)
            java.lang.String r0 = "emoji_reaction_unicode"
            r4 = r18
            X.0Df.A00(r5, r4, r0)
            java.lang.String r4 = "input"
            X.2IV r0 = r7.A00
            X.0Df r0 = r0.A02()
            r0.A0E(r5, r4)
            X.2IY r0 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1vR r5 = X.AnonymousClass1vS.A00()
            java.util.Map r7 = r7.getParamsCopy()
            java.util.Map r8 = r6.getParamsCopy()
            java.lang.Class<X.C2a> r9 = X.C43600C2a.class
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.lang.String r6 = "IGQuickSnapSendEmojiReactionMutation"
            r12 = 0
            java.lang.String r14 = "xdt_send_quick_snap_emoji_reaction"
            com.facebook.pando.PandoGraphQLRequest r4 = new com.facebook.pando.PandoGraphQLRequest
            r13 = r11
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r2.A00 = r10
            java.lang.Object r1 = r1.A04(r4, r2)
            if (r1 != r3) goto L_0x0028
            return r3
        L_0x00a2:
            r0 = 42
            X.ME6 r2 = new X.ME6
            r2.<init>(r6, r5, r4, r0)
            goto L_0x001a
        L_0x00ab:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00b5
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x00b5:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x00bb:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.quicksnap.data.api.QuickSnapApi.A00(java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.ME6, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(java.lang.String r8, X.AnonymousClass4D7 r9) {
        /*
            r7 = this;
            r3 = 44
            boolean r0 = X.ME6.A02(r3, r9)
            if (r0 == 0) goto L_0x0089
            r4 = r9
            X.ME6 r4 = (X.ME6) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0089
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A01
            X.1Hj r6 = X.1Hj.A02
            int r0 = r4.A00
            r5 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0056
            if (r0 != r3) goto L_0x0091
            X.0eS.A00(r1)
        L_0x0025:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x004c
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            X.3Ih r1 = new X.3Ih
            r1.<init>(r0)
        L_0x0034:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0047
            X.3Ih r1 = (X.C239793Ih) r1
            if (r1 == 0) goto L_0x0047
            java.lang.Object r0 = r1.A00
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != r3) goto L_0x0047
            r5 = 1
        L_0x0047:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            return r0
        L_0x004c:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0034
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        L_0x0056:
            X.0eS.A00(r1)
            com.instagram.common.session.UserSession r1 = r7.A00
            r0 = -2
            X.1NY r2 = new X.1NY
            r2.<init>(r1, r0)
            r2.A04()
            java.lang.Object[] r1 = new java.lang.Object[]{r8}
            java.lang.String r0 = "media/%s/soft_delete/"
            r2.A0K(r0, r1)
            java.lang.String r0 = "media_id"
            r2.A9m(r0, r8)
            java.lang.Class<X.1XP> r1 = X.1XP.class
            java.lang.Class<X.1XY> r0 = X.1XY.class
            r2.A0Q(r1, r0)
            X.1OC r1 = r2.A0M()
            r4.A00 = r3
            r0 = 1961489254(0x74e9f366, float:1.4828392E32)
            java.lang.Object r1 = r1.A00(r0, r4)
            if (r1 != r6) goto L_0x0025
            return r6
        L_0x0089:
            r0 = 42
            X.ME6 r4 = new X.ME6
            r4.<init>(r7, r9, r3, r0)
            goto L_0x0016
        L_0x0091:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.quicksnap.data.api.QuickSnapApi.A01(java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDq, X.4D7] */
    /* JADX WARNING: type inference failed for: r16v1, types: [X.F0l] */
    /* JADX WARNING: type inference failed for: r4v14 */
    /* JADX WARNING: type inference failed for: r4v15 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0263  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x026d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(java.lang.String r27, X.AnonymousClass4D7 r28) {
        /*
            r26 = this;
            r3 = 29
            r6 = r28
            boolean r0 = X.C66138MDq.A02(r3, r6)
            r5 = r26
            if (r0 == 0) goto L_0x014f
            r4 = r6
            X.MDq r4 = (X.C66138MDq) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x014f
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x001a:
            java.lang.Object r6 = r4.A02
            X.1Hj r3 = X.1Hj.A02
            int r1 = r4.A00
            r0 = 1
            if (r1 == 0) goto L_0x00f9
            if (r1 != r0) goto L_0x021c
            java.lang.Object r2 = r4.A01
            com.instagram.quicksnap.data.api.QuickSnapApi r2 = (com.instagram.quicksnap.data.api.QuickSnapApi) r2
            X.0eS.A00(r6)
        L_0x002c:
            X.3Ii r6 = (X.C239803Ii) r6
            boolean r1 = r6 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x0212
            X.3Ih r6 = (X.C239793Ih) r6
            java.lang.Object r1 = r6.A00
            X.3JC r1 = (X.AnonymousClass3JC) r1
            X.8bw r5 = r2.A02
            java.lang.Object r4 = r1.A01
            X.3lr r4 = (X.C250663lr) r4
            r15 = 0
            if (r4 == 0) goto L_0x025a
            java.lang.Class<X.9fB> r3 = X.C383199fB.class
            r11 = 0
            java.lang.String r2 = "xdt_get_quick_snap_item(request:$request)"
            r1 = -2057845054(0xffffffff8557c6c2, float:-1.01457575E-35)
            X.3lr r4 = r4.getRequiredTreeField(r11, r2, r3, r1)
            if (r4 == 0) goto L_0x025a
            java.lang.Class<X.9fA> r3 = X.C383189fA.class
            java.lang.String r2 = "media"
            r1 = -2110544364(0xffffffff8233a614, float:-1.3198505E-37)
            X.3lr r3 = r4.getOptionalTreeField(r11, r2, r3, r1)
            if (r3 == 0) goto L_0x025a
            java.lang.Class<X.9fO> r2 = X.C383319fO.class
            r1 = -334836849(0xffffffffec0acb8f, float:-6.711722E26)
            X.3lr r12 = r3.reinterpretRequired(r11, r2, r1)
            if (r12 == 0) goto L_0x025a
            X.1E6 r13 = r5.A00
            java.util.concurrent.atomic.AtomicBoolean r1 = X.1Xj.A0i
            java.lang.Class<com.instagram.feed.media.ImmutablePandoMediaDict> r1 = com.instagram.feed.media.ImmutablePandoMediaDict.class
            com.facebook.pando.TreeJNI r3 = r12.reinterpret(r1)
            com.instagram.feed.media.ImmutablePandoMediaDict r3 = (com.instagram.feed.media.ImmutablePandoMediaDict) r3
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            X.1E9 r1 = new X.1E9
            r1.<init>(r13, r2, r11)
            X.1Xj r17 = X.1Xv.A00(r1, r3)
            X.0qQ.A07(r17)
            java.lang.String r1 = "strong_id__"
            java.lang.String r1 = r12.getRequiredStringField(r11, r1)
            X.0qQ.A07(r1)
            r10 = 2
            java.lang.String r1 = "taken_at"
            long r23 = r12.getCoercedTimeField(r10, r1)
            java.lang.String r1 = "audience"
            java.lang.String r2 = r12.A0A(r1)
            if (r2 == 0) goto L_0x00f7
            java.util.Map r1 = X.AnonymousClass3QO.A01
            java.lang.Object r14 = r1.get(r2)
            X.3QO r14 = (X.AnonymousClass3QO) r14
        L_0x00a4:
            java.lang.Class<X.9fN> r9 = X.AnonymousClass9fN.class
            r8 = 4
            java.lang.String r7 = "quick_snap_info"
            r6 = 638424030(0x260d93de, float:4.91196E-16)
            X.3lr r4 = r12.getOptionalTreeField(r8, r7, r9, r6)
            if (r4 == 0) goto L_0x01bf
            java.lang.Class<X.9fL> r3 = X.C383299fL.class
            java.lang.String r2 = "emoji_reactions"
            r1 = 1177610312(0x4630e848, float:11322.07)
            com.google.common.collect.ImmutableList r1 = r4.getRequiredCompactedTreeListField(r10, r2, r3, r1)
            if (r1 == 0) goto L_0x01bf
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r16 = r1.iterator()
        L_0x00c8:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x0156
            java.lang.Object r2 = r16.next()
            X.3lr r2 = (X.C250663lr) r2
            X.0eM r1 = r5.A01
            java.lang.Object r3 = r1.getValue()
            X.17i r3 = (X.17i) r3
            java.lang.String r1 = "reactor_id"
            java.lang.String r1 = r2.getRequiredStringField(r0, r1)
            com.instagram.user.model.User r3 = r3.A02(r1)
            if (r3 == 0) goto L_0x00c8
            java.lang.String r1 = "unicode"
            java.lang.String r2 = r2.getRequiredStringField(r11, r1)
            X.0eP r1 = new X.0eP
            r1.<init>(r3, r2)
            r4.add(r1)
            goto L_0x00c8
        L_0x00f7:
            r14 = r15
            goto L_0x00a4
        L_0x00f9:
            X.0eS.A00(r6)
            X.1vn r2 = r5.A01
            r13 = 0
            X.2IS r9 = new X.2IS
            r9.<init>()
            X.2IS r8 = new X.2IS
            r8.<init>()
            X.0K0 r6 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r1 = "media_id"
            X.0Df r7 = r6.A02()
            r6 = r27
            X.0Df.A00(r7, r6, r1)
            java.lang.String r6 = "request"
            X.2IV r1 = r9.A00
            X.0Df r1 = r1.A02()
            r1.A0E(r7, r6)
            X.2IY r1 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1vR r7 = X.AnonymousClass1vS.A00()
            java.util.Map r9 = r9.getParamsCopy()
            java.util.Map r10 = r8.getParamsCopy()
            java.lang.Class<X.9fC> r11 = X.C383209fC.class
            java.util.ArrayList r17 = new java.util.ArrayList
            r17.<init>()
            java.lang.String r8 = "IGQuickSnapGetSingleItemQuery"
            r12 = 0
            java.lang.String r16 = "xdt_get_quick_snap_item"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r4.A01 = r5
            r4.A00 = r0
            java.lang.Object r6 = r2.A04(r6, r4)
            if (r6 == r3) goto L_0x0267
            r2 = r5
            goto L_0x002c
        L_0x014f:
            X.MDq r4 = new X.MDq
            r4.<init>(r5, r6, r3)
            goto L_0x001a
        L_0x0156:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.util.Iterator r5 = r4.iterator()
        L_0x015f:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0182
            java.lang.Object r4 = r5.next()
            r1 = r4
            X.0eP r1 = (X.0eP) r1
            java.lang.Object r3 = r1.A00
            java.lang.Object r1 = r2.get(r3)
            if (r1 != 0) goto L_0x017c
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.put(r3, r1)
        L_0x017c:
            java.util.List r1 = (java.util.List) r1
            r1.add(r4)
            goto L_0x015f
        L_0x0182:
            int r1 = r2.size()
            int r1 = X.0se.A0L(r1)
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>(r1)
            java.util.Set r1 = r2.entrySet()
            java.util.Iterator r3 = r1.iterator()
        L_0x0197:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x01c3
            java.lang.Object r1 = r3.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = X.00k.A0J(r1)
            X.0eP r1 = (X.0eP) r1
            if (r1 == 0) goto L_0x01b9
            java.lang.Object r1 = r1.A01
            if (r1 != 0) goto L_0x01bb
        L_0x01b9:
            java.lang.String r1 = ""
        L_0x01bb:
            r5.put(r2, r1)
            goto L_0x0197
        L_0x01bf:
            X.0sm r5 = X.0Yt.A0E()
        L_0x01c3:
            X.3lr r4 = r12.getOptionalTreeField(r8, r7, r9, r6)
            if (r4 == 0) goto L_0x0224
            java.lang.Class<X.9fK> r3 = X.C383289fK.class
            java.lang.String r2 = "audience_members"
            r1 = 1839386184(0x6da2ce48, float:6.298244E27)
            com.google.common.collect.ImmutableList r1 = r4.getRequiredCompactedTreeListField(r0, r2, r3, r1)
            if (r1 == 0) goto L_0x0224
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r16 = r1.iterator()
        L_0x01df:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x0226
            java.lang.Object r3 = r16.next()
            X.3lr r3 = (X.C250663lr) r3
            java.lang.Class<X.C2d> r2 = X.C43603C2d.class
            r1 = 1552225453(0x5c8514ad, float:2.99671241E17)
            X.3lr r2 = r3.reinterpretRequired(r11, r2, r1)
            android.os.Parcelable$Creator r1 = com.instagram.user.model.User.CREATOR
            java.lang.Class<com.instagram.user.model.ImmutablePandoUserDict> r1 = com.instagram.user.model.ImmutablePandoUserDict.class
            com.facebook.pando.TreeJNI r3 = r2.reinterpret(r1)
            com.instagram.user.model.ImmutablePandoUserDict r3 = (com.instagram.user.model.ImmutablePandoUserDict) r3
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            X.1E9 r1 = new X.1E9
            r1.<init>(r13, r2, r11)
            com.instagram.user.model.User r1 = X.1aC.A01(r1, r3)
            if (r1 == 0) goto L_0x01df
            r4.add(r1)
            goto L_0x01df
        L_0x0212:
            boolean r0 = r6 instanceof X.C297815sO
            if (r0 != 0) goto L_0x025f
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x021c:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0224:
            X.0sn r4 = X.0sn.A00
        L_0x0226:
            X.3lr r6 = r12.getOptionalTreeField(r8, r7, r9, r6)
            if (r6 == 0) goto L_0x0268
            java.lang.Class<X.9fM> r3 = X.C383309fM.class
            java.lang.String r2 = "friend_list"
            r1 = 1533619714(0x5b692e02, float:6.5634256E16)
            X.3lr r2 = r6.getOptionalTreeField(r11, r2, r3, r1)
            if (r2 == 0) goto L_0x0268
            java.lang.String r1 = "is_list_named"
            boolean r25 = r2.getRequiredBooleanField(r10, r1)
            java.lang.String r1 = "name"
            java.lang.String r19 = r2.getRequiredStringField(r11, r1)
            java.lang.String r1 = "icon"
            java.lang.String r15 = r2.getOptionalStringField(r0, r1)
        L_0x024b:
            X.F0l r16 = new X.F0l
            r18 = r14
            r20 = r15
            r21 = r4
            r22 = r5
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r25)
            r15 = r16
        L_0x025a:
            X.3Ih r6 = new X.3Ih
            r6.<init>(r15)
        L_0x025f:
            boolean r0 = r6 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x026d
            X.3Ih r6 = (X.C239793Ih) r6
            java.lang.Object r3 = r6.A00
        L_0x0267:
            return r3
        L_0x0268:
            r25 = 0
            r19 = r15
            goto L_0x024b
        L_0x026d:
            boolean r0 = r6 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0273
            r3 = 0
            return r3
        L_0x0273:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.quicksnap.data.api.QuickSnapApi.A02(java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.ME6, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(java.lang.String r17, X.AnonymousClass4D7 r18) {
        /*
            r16 = this;
            r4 = 45
            r5 = r18
            boolean r0 = X.ME6.A02(r4, r5)
            r6 = r16
            if (r0 == 0) goto L_0x009b
            r2 = r5
            X.ME6 r2 = (X.ME6) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x009b
            int r3 = r3 - r1
            r2.A00 = r3
        L_0x001a:
            java.lang.Object r1 = r2.A01
            X.1Hj r3 = X.1Hj.A02
            int r0 = r2.A00
            r10 = 1
            if (r0 == 0) goto L_0x004a
            if (r0 != r10) goto L_0x00b4
            X.0eS.A00(r1)
        L_0x0028:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0040
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            X.3Ih r1 = new X.3Ih
            r1.<init>(r0)
        L_0x0037:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00a4
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            return r0
        L_0x0040:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0037
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x004a:
            X.0eS.A00(r1)
            X.1vn r1 = r6.A01
            r11 = 0
            X.2IS r7 = new X.2IS
            r7.<init>()
            X.2IS r6 = new X.2IS
            r6.<init>()
            X.0K0 r4 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r0 = "target_user_id"
            X.0Df r5 = r4.A02()
            r4 = r17
            X.0Df.A00(r5, r4, r0)
            java.lang.String r4 = "input"
            X.2IV r0 = r7.A00
            X.0Df r0 = r0.A02()
            r0.A0E(r5, r4)
            X.2IY r0 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1vR r5 = X.AnonymousClass1vS.A00()
            java.util.Map r7 = r7.getParamsCopy()
            java.util.Map r8 = r6.getParamsCopy()
            java.lang.Class<X.C2W> r9 = X.C2W.class
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.lang.String r6 = "IGQuickSnapMuteUserMutation"
            r12 = 0
            java.lang.String r14 = "xdt_mute_quick_snap_user"
            com.facebook.pando.PandoGraphQLRequest r4 = new com.facebook.pando.PandoGraphQLRequest
            r13 = r11
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r2.A00 = r10
            java.lang.Object r1 = r1.A04(r4, r2)
            if (r1 != r3) goto L_0x0028
            return r3
        L_0x009b:
            r0 = 42
            X.ME6 r2 = new X.ME6
            r2.<init>(r6, r5, r4, r0)
            goto L_0x001a
        L_0x00a4:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00ae
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x00ae:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x00b4:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.quicksnap.data.api.QuickSnapApi.A03(java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.MDq, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(java.util.List r20, X.AnonymousClass4D7 r21) {
        /*
            r19 = this;
            r5 = 31
            r6 = r21
            boolean r0 = X.C66138MDq.A02(r5, r6)
            r4 = r19
            if (r0 == 0) goto L_0x00df
            r3 = r6
            X.MDq r3 = (X.C66138MDq) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00df
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x001a:
            java.lang.Object r5 = r3.A02
            X.1Hj r2 = X.1Hj.A02
            int r0 = r3.A00
            r13 = 1
            if (r0 == 0) goto L_0x0090
            if (r0 != r13) goto L_0x012a
            java.lang.Object r1 = r3.A01
            com.instagram.quicksnap.data.api.QuickSnapApi r1 = (com.instagram.quicksnap.data.api.QuickSnapApi) r1
            X.0eS.A00(r5)
        L_0x002c:
            X.3Ii r5 = (X.C239803Ii) r5
            boolean r0 = r5 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0120
            X.3Ih r5 = (X.C239793Ih) r5
            java.lang.Object r0 = r5.A00
            X.3JC r0 = (X.AnonymousClass3JC) r0
            X.8bw r7 = r1.A02
            java.lang.Object r4 = r0.A01
            X.3lr r4 = (X.C250663lr) r4
            X.0sn r0 = X.0sn.A00
            X.8c1 r3 = new X.8c1
            r3.<init>(r0, r0)
            if (r4 == 0) goto L_0x0137
            java.lang.Class<X.9fR> r2 = X.C383349fR.class
            r6 = 0
            java.lang.String r1 = "xdt_mark_quick_snap_seen(request:$input)"
            r0 = -95521172(0xfffffffffa4e766c, float:-2.6800376E35)
            X.3lr r4 = r4.getRequiredTreeField(r6, r1, r2, r0)
            if (r4 == 0) goto L_0x0137
            java.lang.Class<X.9fP> r2 = X.C383329fP.class
            java.lang.String r1 = "items_ordered_by_time"
            r0 = -1132068079(0xffffffffbc860311, float:-0.016358884)
            com.google.common.collect.ImmutableList r0 = r4.getRequiredCompactedTreeListField(r6, r1, r2, r0)
            X.0qQ.A07(r0)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r3 = r0.iterator()
        L_0x006c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00e6
            java.lang.Object r2 = r3.next()
            X.3lr r2 = (X.C250663lr) r2
            java.lang.Class<X.9fJ> r1 = X.C383279fJ.class
            r0 = 132122786(0x7e008a2, float:3.3708848E-34)
            X.3lr r0 = r2.reinterpretRequired(r6, r1, r0)
            X.9fJ r0 = (X.C383279fJ) r0
            X.0qQ.A07(r0)
            X.GnY r0 = X.C359058bw.A00(r7, r0)
            if (r0 == 0) goto L_0x006c
            r5.add(r0)
            goto L_0x006c
        L_0x0090:
            X.0eS.A00(r5)
            X.1vn r1 = r4.A01
            r14 = 0
            X.2IS r7 = new X.2IS
            r7.<init>()
            X.2IS r6 = new X.2IS
            r6.<init>()
            X.2IV r5 = new X.2IV
            r5.<init>()
            java.lang.String r0 = "media_ids"
            r8 = r20
            r5.A05(r0, r8)
            java.lang.String r0 = "input"
            r7.A00(r5, r0)
            X.2IY r0 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1vR r8 = X.AnonymousClass1vS.A00()
            java.util.Map r10 = r7.getParamsCopy()
            java.util.Map r11 = r6.getParamsCopy()
            java.lang.Class<X.9fS> r12 = X.C383359fS.class
            java.util.ArrayList r18 = new java.util.ArrayList
            r18.<init>()
            java.lang.String r9 = "IGQuickSnapUpdateSeenStateMutation"
            r15 = 0
            java.lang.String r17 = "xdt_mark_quick_snap_seen"
            com.facebook.pando.PandoGraphQLRequest r7 = new com.facebook.pando.PandoGraphQLRequest
            r16 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r3.A01 = r4
            r3.A00 = r13
            java.lang.Object r5 = r1.A04(r7, r3)
            if (r5 == r2) goto L_0x0144
            r1 = r4
            goto L_0x002c
        L_0x00df:
            X.MDq r3 = new X.MDq
            r3.<init>(r4, r6, r5)
            goto L_0x001a
        L_0x00e6:
            java.lang.Class<X.9fQ> r2 = X.C383339fQ.class
            java.lang.String r1 = "side_peek_preview_medias"
            r0 = -464634224(0xffffffffe44e3e90, float:-1.521815E22)
            com.google.common.collect.ImmutableList r0 = r4.getRequiredCompactedTreeListField(r13, r1, r2, r0)
            X.0qQ.A07(r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r0.iterator()
        L_0x00fd:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0132
            java.lang.Object r2 = r3.next()
            X.3lr r2 = (X.C250663lr) r2
            java.lang.Class<X.9fp> r1 = X.C383589fp.class
            r0 = -1310297315(0xffffffffb1e6731d, float:-6.706968E-9)
            X.3lr r1 = r2.reinterpretRequired(r6, r1, r0)
            X.9fp r1 = (X.C383589fp) r1
            X.1E6 r0 = r7.A00
            X.1Xj r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x00fd
            r4.add(r0)
            goto L_0x00fd
        L_0x0120:
            boolean r0 = r5 instanceof X.C297815sO
            if (r0 != 0) goto L_0x013c
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x012a:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0132:
            X.8c1 r3 = new X.8c1
            r3.<init>(r5, r4)
        L_0x0137:
            X.3Ih r5 = new X.3Ih
            r5.<init>(r3)
        L_0x013c:
            boolean r0 = r5 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0145
            X.3Ih r5 = (X.C239793Ih) r5
            java.lang.Object r2 = r5.A00
        L_0x0144:
            return r2
        L_0x0145:
            boolean r0 = r5 instanceof X.C297815sO
            if (r0 == 0) goto L_0x014b
            r2 = 0
            return r2
        L_0x014b:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.quicksnap.data.api.QuickSnapApi.A04(java.util.List, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDq, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A05(X.AnonymousClass4D7 r22) {
        /*
            r21 = this;
            r3 = 28
            r6 = r22
            boolean r0 = X.C66138MDq.A02(r3, r6)
            r5 = r21
            if (r0 == 0) goto L_0x0160
            r4 = r6
            X.MDq r4 = (X.C66138MDq) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0160
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x001a:
            java.lang.Object r3 = r4.A02
            X.1Hj r1 = X.1Hj.A02
            int r2 = r4.A00
            r0 = 1
            if (r2 == 0) goto L_0x0121
            if (r2 != r0) goto L_0x017e
            java.lang.Object r2 = r4.A01
            com.instagram.quicksnap.data.api.QuickSnapApi r2 = (com.instagram.quicksnap.data.api.QuickSnapApi) r2
            X.0eS.A00(r3)
        L_0x002c:
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r1 = r3 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x0174
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r1 = r3.A00
            X.3JC r1 = (X.AnonymousClass3JC) r1
            X.8bw r6 = r2.A02
            java.lang.Object r5 = r1.A01
            X.3lr r5 = (X.C250663lr) r5
            if (r5 == 0) goto L_0x0167
            java.lang.Class<X.9f4> r3 = X.C383129f4.class
            r4 = 0
            java.lang.String r2 = "xdt_get_quick_snap_history"
            r1 = -1845701656(0xffffffff91fcd3e8, float:-3.9889187E-28)
            X.3lr r5 = r5.getRequiredTreeField(r4, r2, r3, r1)
            if (r5 == 0) goto L_0x0167
            java.lang.Class<X.9f3> r3 = X.C383119f3.class
            java.lang.String r2 = "medias"
            r1 = 67031374(0x3fed14e, float:1.4976832E-36)
            com.google.common.collect.ImmutableList r1 = r5.getOptionalCompactedTreeListField(r4, r2, r3, r1)
            if (r1 == 0) goto L_0x0167
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r12 = r1.iterator()
        L_0x0064:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x0186
            java.lang.Object r9 = r12.next()
            X.3lr r9 = (X.C250663lr) r9
            java.lang.Class<X.9fG> r8 = X.C383249fG.class
            r5 = -1525870565(0xffffffffa50d101b, float:-1.2235257E-16)
            X.3lr r2 = r9.reinterpretRequired(r4, r8, r5)
            java.lang.String r1 = "pk"
            java.lang.String r17 = r2.getRequiredStringField(r0, r1)
            X.0qQ.A07(r17)
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            X.3lr r2 = r9.reinterpretRequired(r4, r8, r5)
            java.lang.String r1 = "taken_at"
            long r1 = r2.getCoercedTimeField(r4, r1)
            long r19 = r7.toMillis(r1)
            X.3lr r11 = r9.reinterpretRequired(r4, r8, r5)
            java.lang.Class<X.9fF> r10 = X.C383239fF.class
            r7 = 4
            java.lang.String r2 = "quick_snap_info"
            r1 = -1335794383(0xffffffffb0616531, float:-8.1998325E-10)
            X.3lr r10 = r11.getOptionalTreeField(r7, r2, r10, r1)
            if (r10 == 0) goto L_0x00e4
            java.lang.Class<X.9fE> r7 = X.C383229fE.class
            java.lang.String r2 = "emoji_reaction_counts"
            r1 = 133883136(0x7fae500, float:3.7750413E-34)
            com.google.common.collect.ImmutableList r2 = r10.getRequiredCompactedTreeListField(r4, r2, r7, r1)
            if (r2 == 0) goto L_0x00e4
            r1 = 10
            int r1 = X.0Yv.A1E(r2, r1)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r1)
            java.util.Iterator r11 = r2.iterator()
        L_0x00c0:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x00e6
            java.lang.Object r2 = r11.next()
            X.3lr r2 = (X.C250663lr) r2
            java.lang.String r1 = "emoji_reaction_unicode"
            java.lang.String r10 = r2.getRequiredStringField(r4, r1)
            X.0qQ.A07(r10)
            java.lang.String r1 = "count"
            int r2 = r2.getRequiredIntField(r0, r1)
            X.Ewp r1 = new X.Ewp
            r1.<init>(r10, r2)
            r7.add(r1)
            goto L_0x00c0
        L_0x00e4:
            X.0sn r7 = X.0sn.A00
        L_0x00e6:
            r14 = 0
            X.3lr r9 = r9.reinterpretRequired(r4, r8, r5)
            java.lang.Class<X.9fD> r8 = X.C383219fD.class
            r5 = 3
            java.lang.String r2 = "image_versions2"
            r1 = 1017666516(0x3ca85bd4, float:0.0205516)
            X.3lr r5 = r9.getOptionalTreeField(r5, r2, r8, r1)
            if (r5 == 0) goto L_0x011f
            java.lang.Class<X.C2U> r2 = X.C2U.class
            r1 = -2013388913(0xffffffff87fe1f8f, float:-3.823622E-34)
            X.3lr r5 = r5.reinterpretRequired(r4, r2, r1)
            if (r5 == 0) goto L_0x011f
            X.1E6 r2 = r6.A00
            java.lang.Class<com.instagram.model.mediasize.ImmutablePandoImageInfo> r1 = com.instagram.model.mediasize.ImmutablePandoImageInfo.class
            com.facebook.pando.TreeJNI r15 = r5.reinterpret(r1)
            com.instagram.model.mediasize.ImmutablePandoImageInfo r15 = (com.instagram.model.mediasize.ImmutablePandoImageInfo) r15
            X.0qQ.A0B(r2, r0)
        L_0x0111:
            java.lang.Integer r16 = X.AnonymousClass05K.A0C
            X.L9x r13 = new X.L9x
            r18 = r7
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r3.add(r13)
            goto L_0x0064
        L_0x011f:
            r15 = 0
            goto L_0x0111
        L_0x0121:
            X.0eS.A00(r3)
            X.1vn r3 = r5.A01
            r14 = 0
            X.2IS r7 = new X.2IS
            r7.<init>()
            X.2IS r6 = new X.2IS
            r6.<init>()
            X.2IY r2 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1vR r8 = X.AnonymousClass1vS.A00()
            java.util.Map r10 = r7.getParamsCopy()
            java.util.Map r11 = r6.getParamsCopy()
            java.lang.Class<X.9f5> r12 = X.C383139f5.class
            java.util.ArrayList r18 = new java.util.ArrayList
            r18.<init>()
            java.lang.String r9 = "IGQuickSnapGetHistoryQuery"
            r13 = 0
            java.lang.String r17 = "xdt_get_quick_snap_history"
            com.facebook.pando.PandoGraphQLRequest r7 = new com.facebook.pando.PandoGraphQLRequest
            r15 = r13
            r16 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r4.A01 = r5
            r4.A00 = r0
            java.lang.Object r3 = r3.A04(r7, r4)
            if (r3 == r1) goto L_0x01a0
            r2 = r5
            goto L_0x002c
        L_0x0160:
            X.MDq r4 = new X.MDq
            r4.<init>(r5, r6, r3)
            goto L_0x001a
        L_0x0167:
            r1 = 0
            r3 = 0
            r4 = 7
            r6 = 16
            X.JwF r0 = new X.JwF
            r2 = r1
            r5 = r1
            r0.<init>((java.util.List) r1, (java.lang.String) r2, (boolean) r3, (int) r4, (kotlin.jvm.internal.DefaultConstructorMarker) r5, (int) r6)
            goto L_0x0193
        L_0x0174:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0198
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x017e:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0186:
            r7 = 0
            r9 = 6
            r11 = 16
            X.JwF r0 = new X.JwF
            r5 = r0
            r6 = r3
            r8 = r4
            r10 = r7
            r5.<init>((java.util.List) r6, (java.lang.String) r7, (boolean) r8, (int) r9, (kotlin.jvm.internal.DefaultConstructorMarker) r10, (int) r11)
        L_0x0193:
            X.3Ih r3 = new X.3Ih
            r3.<init>(r0)
        L_0x0198:
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x01a1
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r1 = r3.A00
        L_0x01a0:
            return r1
        L_0x01a1:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 == 0) goto L_0x01b2
            r2 = 0
            r4 = 0
            r5 = 7
            r7 = 16
            X.JwF r1 = new X.JwF
            r3 = r2
            r6 = r2
            r1.<init>((java.util.List) r2, (java.lang.String) r3, (boolean) r4, (int) r5, (kotlin.jvm.internal.DefaultConstructorMarker) r6, (int) r7)
            return r1
        L_0x01b2:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.quicksnap.data.api.QuickSnapApi.A05(X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDq, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A06(X.AnonymousClass4D7 r20) {
        /*
            r19 = this;
            r3 = 30
            r6 = r20
            boolean r0 = X.C66138MDq.A02(r3, r6)
            r5 = r19
            if (r0 == 0) goto L_0x00cf
            r4 = r6
            X.MDq r4 = (X.C66138MDq) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00cf
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x001a:
            java.lang.Object r6 = r4.A02
            X.1Hj r2 = X.1Hj.A02
            int r0 = r4.A00
            r3 = 1
            if (r0 == 0) goto L_0x0090
            if (r0 != r3) goto L_0x011a
            java.lang.Object r1 = r4.A01
            com.instagram.quicksnap.data.api.QuickSnapApi r1 = (com.instagram.quicksnap.data.api.QuickSnapApi) r1
            X.0eS.A00(r6)
        L_0x002c:
            X.3Ii r6 = (X.C239803Ii) r6
            boolean r0 = r6 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0110
            X.3Ih r6 = (X.C239793Ih) r6
            java.lang.Object r0 = r6.A00
            X.3JC r0 = (X.AnonymousClass3JC) r0
            X.8bw r7 = r1.A02
            java.lang.Object r4 = r0.A01
            X.3lr r4 = (X.C250663lr) r4
            X.0sn r0 = X.0sn.A00
            X.8c1 r9 = new X.8c1
            r9.<init>(r0, r0)
            if (r4 == 0) goto L_0x0127
            java.lang.Class<X.9f8> r2 = X.C383169f8.class
            r6 = 0
            java.lang.String r1 = "xdt_get_quick_snaps"
            r0 = 2050677452(0x7a3adacc, float:2.4255124E35)
            X.3lr r8 = r4.getRequiredTreeField(r6, r1, r2, r0)
            if (r8 == 0) goto L_0x0127
            java.lang.Class<X.9f6> r2 = X.C383149f6.class
            java.lang.String r1 = "items_ordered_by_time"
            r0 = -1044658324(0xffffffffc1bbc76c, float:-23.472374)
            com.google.common.collect.ImmutableList r0 = r8.getRequiredCompactedTreeListField(r6, r1, r2, r0)
            X.0qQ.A07(r0)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r0.iterator()
        L_0x006c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00d6
            java.lang.Object r2 = r4.next()
            X.3lr r2 = (X.C250663lr) r2
            java.lang.Class<X.9fJ> r1 = X.C383279fJ.class
            r0 = 132122786(0x7e008a2, float:3.3708848E-34)
            X.3lr r0 = r2.reinterpretRequired(r6, r1, r0)
            X.9fJ r0 = (X.C383279fJ) r0
            X.0qQ.A07(r0)
            X.GnY r0 = X.C359058bw.A00(r7, r0)
            if (r0 == 0) goto L_0x006c
            r5.add(r0)
            goto L_0x006c
        L_0x0090:
            X.0eS.A00(r6)
            X.1vn r1 = r5.A01
            r14 = 0
            X.2IS r7 = new X.2IS
            r7.<init>()
            X.2IS r6 = new X.2IS
            r6.<init>()
            X.2IY r0 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1vR r8 = X.AnonymousClass1vS.A00()
            java.util.Map r10 = r7.getParamsCopy()
            java.util.Map r11 = r6.getParamsCopy()
            java.lang.Class<X.9f9> r12 = X.C383179f9.class
            java.util.ArrayList r18 = new java.util.ArrayList
            r18.<init>()
            java.lang.String r9 = "IGQuickSnapGetQuickSnapsQuery"
            r13 = 0
            java.lang.String r17 = "xdt_get_quick_snaps"
            com.facebook.pando.PandoGraphQLRequest r7 = new com.facebook.pando.PandoGraphQLRequest
            r15 = r13
            r16 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r4.A01 = r5
            r4.A00 = r3
            java.lang.Object r6 = r1.A04(r7, r4)
            if (r6 == r2) goto L_0x0134
            r1 = r5
            goto L_0x002c
        L_0x00cf:
            X.MDq r4 = new X.MDq
            r4.<init>(r5, r6, r3)
            goto L_0x001a
        L_0x00d6:
            java.lang.Class<X.9f7> r2 = X.C383159f7.class
            java.lang.String r1 = "side_peek_preview_medias"
            r0 = 1593822307(0x5effcc63, float:9.2161081E18)
            com.google.common.collect.ImmutableList r0 = r8.getRequiredCompactedTreeListField(r3, r1, r2, r0)
            X.0qQ.A07(r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r0.iterator()
        L_0x00ed:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0122
            java.lang.Object r2 = r3.next()
            X.3lr r2 = (X.C250663lr) r2
            java.lang.Class<X.9fp> r1 = X.C383589fp.class
            r0 = -1310297315(0xffffffffb1e6731d, float:-6.706968E-9)
            X.3lr r1 = r2.reinterpretRequired(r6, r1, r0)
            X.9fp r1 = (X.C383589fp) r1
            X.1E6 r0 = r7.A00
            X.1Xj r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x00ed
            r4.add(r0)
            goto L_0x00ed
        L_0x0110:
            boolean r0 = r6 instanceof X.C297815sO
            if (r0 != 0) goto L_0x012c
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x011a:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0122:
            X.8c1 r9 = new X.8c1
            r9.<init>(r5, r4)
        L_0x0127:
            X.3Ih r6 = new X.3Ih
            r6.<init>(r9)
        L_0x012c:
            boolean r0 = r6 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0135
            X.3Ih r6 = (X.C239793Ih) r6
            java.lang.Object r2 = r6.A00
        L_0x0134:
            return r2
        L_0x0135:
            boolean r0 = r6 instanceof X.C297815sO
            if (r0 == 0) goto L_0x013b
            r2 = 0
            return r2
        L_0x013b:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.quicksnap.data.api.QuickSnapApi.A06(X.4D7):java.lang.Object");
    }
}
