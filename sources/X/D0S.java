package X;

public abstract class D0S {
    /* JADX WARNING: type inference failed for: r7v11, types: [java.lang.Object, com.instagram.direct.model.thread.CreatorBroadcastThreadInfo] */
    /* JADX WARNING: type inference failed for: r11v8, types: [java.lang.Object, com.instagram.direct.model.thread.CreatorSubscriberThreadInfo] */
    /* JADX WARNING: type inference failed for: r2v9, types: [java.lang.Object, X.5gH] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00b9 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C290995gL A00(X.C43270BvW r51) {
        /*
            java.lang.Class<X.BvV> r2 = X.C43269BvV.class
            r0 = 153(0x99, float:2.14E-43)
            java.lang.String r1 = X.C273654mx.A00(r0)
            r0 = 846393017(0x3272eeb9, float:1.4140533E-8)
            r3 = r51
            X.3lr r6 = r3.A03(r2, r1, r0)
            X.5gL r5 = new X.5gL
            r5.<init>()
            if (r6 == 0) goto L_0x00ce
            java.lang.Class<X.BvU> r3 = X.C43268BvU.class
            r2 = 4
            java.lang.String r1 = "ranking"
            r0 = -1332763921(0xffffffffb08fa2ef, float:-1.0450928E-9)
            com.google.common.collect.ImmutableList r0 = r6.getRequiredCompactedTreeListField(r2, r1, r3, r0)
            if (r0 == 0) goto L_0x00ce
            r9 = 10
            java.util.ArrayList r8 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r14 = r0.iterator()
        L_0x0030:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x00d3
            X.3lr r3 = X.C41845B3m.A0V(r14)
            X.0qQ.A0A(r3)
            X.5gF r7 = new X.5gF
            r7.<init>()
            r1 = 3
            java.lang.String r0 = "expiration_ms"
            int r0 = r3.getCoercedIntField(r1, r0)
            long r0 = (long) r0
            r7.A00 = r0
            r0 = 3264(0xcc0, float:4.574E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r7.A03 = r0
            java.lang.String r0 = "ranking_request_id"
            java.lang.String r0 = r3.A09(r0)
            r7.A02 = r0
            java.lang.Class<X.BvT> r2 = X.C43267BvT.class
            r10 = 1
            java.lang.String r1 = "score_map"
            r0 = 1304401510(0x4dbf9666, float:4.01788096E8)
            com.google.common.collect.ImmutableList r1 = X.C41845B3m.A0X(r3, r2, r1, r10, r0)
            int r0 = X.0Yv.A1E(r1, r9)
            int r0 = X.AnonymousClass7TG.A01(r0)
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>(r0)
            java.util.Iterator r13 = r1.iterator()
        L_0x0079:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x00c2
            X.3lr r11 = X.C41845B3m.A0V(r13)
            java.lang.String r0 = "id"
            java.lang.String r3 = r11.A07(r0)
            if (r3 != 0) goto L_0x008d
            java.lang.String r3 = ""
        L_0x008d:
            X.5gH r2 = new X.5gH
            r2.<init>()
            X.NkL r12 = X.C69381NkL.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r1 = 2
            java.lang.String r0 = "entity_type"
            java.lang.Enum r0 = r11.getOptionalEnumField(r1, r0, r12)
            X.NkL r0 = (X.C69381NkL) r0
            if (r0 == 0) goto L_0x00c0
            int r0 = r0.ordinal()
            if (r0 == r10) goto L_0x00bd
            if (r0 != r1) goto L_0x00c0
            java.lang.String r0 = "user"
        L_0x00a9:
            r2.A01 = r0
            java.lang.String r1 = "score"
            boolean r0 = r11.hasFieldValue(r1)
            if (r0 == 0) goto L_0x00b9
            double r0 = r11.getCoercedDoubleField(r10, r1)
            r2.A00 = r0
        L_0x00b9:
            r4.put(r3, r2)
            goto L_0x0079
        L_0x00bd:
            java.lang.String r0 = "thread"
            goto L_0x00a9
        L_0x00c0:
            r0 = 0
            goto L_0x00a9
        L_0x00c2:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r4)
            r7.A04 = r0
            r8.add(r7)
            goto L_0x0030
        L_0x00ce:
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            goto L_0x00d7
        L_0x00d3:
            java.util.ArrayList r0 = X.00k.A0U(r8)
        L_0x00d7:
            r5.A03 = r0
            r4 = 0
            if (r6 == 0) goto L_0x0149
            r1 = 0
            java.lang.String r0 = "has_next_page"
            java.lang.Boolean r0 = X.C41846B3n.A0d(r6, r0, r1)
        L_0x00e3:
            r5.A01 = r0
            if (r6 == 0) goto L_0x0147
            java.lang.String r0 = "page_max_id"
            java.lang.String r0 = r6.A08(r0)
        L_0x00ed:
            r5.A02 = r0
            if (r6 == 0) goto L_0x036c
            java.lang.Class<X.BvS> r3 = X.C43266BvS.class
            r2 = 5
            java.lang.String r1 = "entities"
            r0 = 756804999(0x2d1bed87, float:8.863472E-12)
            X.3lr r7 = r6.getOptionalTreeField(r2, r1, r3, r0)
            if (r7 == 0) goto L_0x036c
            X.5l3 r10 = new X.5l3
            r10.<init>()
            java.lang.Class<X.BvR> r2 = X.C43265BvR.class
            r3 = 0
            java.lang.String r1 = "user"
            r0 = 1616878459(0x605f9b7b, float:6.445043E19)
            com.google.common.collect.ImmutableList r0 = X.C41845B3m.A0X(r7, r2, r1, r3, r0)
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r11 = r0.iterator()
        L_0x0118:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x014b
            X.3lr r8 = X.C41845B3m.A0V(r11)
            java.lang.Class<X.Bv0> r2 = X.C43238Bv0.class
            r1 = -2093603978(0xffffffff83362376, float:-5.35257E-37)
            X.3lr r0 = r8.reinterpretRequired(r3, r2, r1)
            X.Bv0 r0 = (X.C43238Bv0) r0
            X.0qQ.A07(r0)
            com.instagram.user.model.User r6 = A01(r0)
            X.3lr r2 = r8.reinterpretRequired(r3, r2, r1)
            r1 = 18
            java.lang.String r0 = "media_viewable"
            boolean r0 = r2.getCoercedBooleanField(r1, r0)
            r6.A13(r0)
            r9.add(r6)
            goto L_0x0118
        L_0x0147:
            r0 = r4
            goto L_0x00ed
        L_0x0149:
            r0 = r4
            goto L_0x00e3
        L_0x014b:
            r10.A01 = r9
            java.lang.Class<X.BvQ> r6 = X.C43264BvQ.class
            r2 = 1
            java.lang.String r1 = "thread"
            r0 = 200846557(0xbf8acdd, float:9.578622E-32)
            com.google.common.collect.ImmutableList r0 = X.C41845B3m.A0X(r7, r6, r1, r2, r0)
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r23 = r0.iterator()
        L_0x0161:
            boolean r0 = r23.hasNext()
            if (r0 == 0) goto L_0x0369
            X.3lr r2 = X.C41845B3m.A0V(r23)
            X.5gD r1 = new X.5gD
            r1.<init>()
            java.lang.String r0 = "thread_id"
            java.lang.String r0 = X.C41846B3n.A0i(r2, r0, r3)
            r1.A09 = r0
            java.lang.Class<X.BvP> r8 = X.C43263BvP.class
            r0 = 1
            java.lang.String r7 = "users"
            r6 = 506111863(0x1e2aa777, float:9.034356E-21)
            com.google.common.collect.ImmutableList r6 = X.C41845B3m.A0X(r2, r8, r7, r0, r6)
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r22 = r6.iterator()
        L_0x018c:
            boolean r6 = r22.hasNext()
            if (r6 == 0) goto L_0x025e
            X.3lr r13 = X.C41845B3m.A0V(r22)
            java.lang.Class<X.Bv0> r12 = X.C43238Bv0.class
            r11 = -2093603978(0xffffffff83362376, float:-5.35257E-37)
            X.3lr r6 = r13.reinterpretRequired(r3, r12, r11)
            X.Bv0 r6 = (X.C43238Bv0) r6
            X.0qQ.A07(r6)
            com.instagram.user.model.User r7 = A01(r6)
            X.3lr r14 = r13.reinterpretRequired(r3, r12, r11)
            java.lang.Class<X.Buz> r13 = X.C43237Buz.class
            r12 = 10
            java.lang.String r11 = "friendship_status"
            r6 = -370213967(0xffffffffe9eefbb1, float:-3.6114116E25)
            X.3lr r13 = r14.getOptionalTreeField(r12, r11, r13, r6)
            if (r13 == 0) goto L_0x025c
            java.lang.String r6 = "following"
            boolean r21 = r13.getCoercedBooleanField(r3, r6)
            java.lang.String r6 = "followed_by"
            boolean r20 = r13.getCoercedBooleanField(r0, r6)
            r11 = 2
            java.lang.String r6 = "blocking"
            boolean r19 = r13.getCoercedBooleanField(r11, r6)
            r11 = 3
            java.lang.String r6 = "muting"
            boolean r18 = r13.getCoercedBooleanField(r11, r6)
            r11 = 4
            java.lang.String r6 = "is_private"
            boolean r17 = r13.getCoercedBooleanField(r11, r6)
            r11 = 5
            java.lang.String r6 = "incoming_request"
            boolean r16 = r13.getCoercedBooleanField(r11, r6)
            r11 = 6
            java.lang.String r6 = "outgoing_request"
            boolean r15 = r13.getCoercedBooleanField(r11, r6)
            r11 = 7
            java.lang.String r6 = "is_bestie"
            boolean r14 = r13.getCoercedBooleanField(r11, r6)
            r11 = 8
            java.lang.String r6 = "is_restricted"
            boolean r12 = r13.getCoercedBooleanField(r11, r6)
            r11 = 9
            java.lang.String r6 = "is_feed_favorite"
            boolean r6 = r13.getCoercedBooleanField(r11, r6)
            java.lang.Boolean r25 = java.lang.Boolean.valueOf(r19)
            java.lang.Boolean r26 = java.lang.Boolean.valueOf(r20)
            java.lang.Boolean r27 = java.lang.Boolean.valueOf(r21)
            java.lang.Boolean r28 = java.lang.Boolean.valueOf(r16)
            java.lang.Boolean r30 = java.lang.Boolean.valueOf(r14)
            java.lang.Boolean r34 = java.lang.Boolean.valueOf(r6)
            java.lang.Boolean r42 = java.lang.Boolean.valueOf(r17)
            java.lang.Boolean r43 = java.lang.Boolean.valueOf(r12)
            java.lang.Boolean r46 = java.lang.Boolean.valueOf(r18)
            java.lang.Boolean r47 = java.lang.Boolean.valueOf(r15)
            com.instagram.user.model.FriendshipStatusImpl r6 = new com.instagram.user.model.FriendshipStatusImpl
            r24 = r6
            r29 = r4
            r31 = r4
            r32 = r4
            r33 = r4
            r35 = r4
            r36 = r4
            r37 = r4
            r38 = r4
            r39 = r4
            r40 = r4
            r41 = r4
            r44 = r4
            r45 = r4
            r48 = r4
            r49 = r4
            r50 = r4
            r51 = r4
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51)
        L_0x0252:
            X.4Cl r11 = r7.A03
            r11.EXD(r6)
            r8.add(r7)
            goto L_0x018c
        L_0x025c:
            r6 = 0
            goto L_0x0252
        L_0x025e:
            r1.A0B = r8
            r7 = 2
            java.lang.String r6 = "canonical"
            boolean r6 = r2.getCoercedBooleanField(r7, r6)
            r1.A0C = r6
            r7 = 3
            java.lang.String r6 = "named"
            boolean r6 = r2.getCoercedBooleanField(r7, r6)
            r1.A0F = r6
            r6 = 1890(0x762, float:2.648E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r6)
            java.lang.String r6 = r2.A0B(r6)
            r1.A0A = r6
            r7 = 5
            java.lang.String r6 = "pending"
            boolean r6 = r2.getCoercedBooleanField(r7, r6)
            r1.A0G = r6
            r7 = 6
            java.lang.String r6 = "thread_type"
            java.lang.String r6 = r2.getOptionalStringField(r7, r6)
            r1.A07 = r6
            r7 = 7
            java.lang.String r6 = "viewer_id"
            java.lang.String r6 = r2.getOptionalStringField(r7, r6)
            r1.A08 = r6
            r7 = 8
            java.lang.String r6 = "media_viewable"
            boolean r6 = r2.getCoercedBooleanField(r7, r6)
            r1.A0E = r6
            java.lang.Class<X.BvO> r11 = X.C43262BvO.class
            r8 = 9
            r6 = 642(0x282, float:9.0E-43)
            java.lang.String r7 = X.C273654mx.A00(r6)
            r6 = -85954242(0xfffffffffae0713e, float:-5.8268566E35)
            X.3lr r13 = r2.getOptionalTreeField(r8, r7, r11, r6)
            r7 = 0
            if (r13 == 0) goto L_0x0367
            com.instagram.direct.model.thread.CreatorSubscriberThreadInfo r11 = new com.instagram.direct.model.thread.CreatorSubscriberThreadInfo
            r11.<init>()
            java.lang.String r6 = "ig_creator_igid"
            java.lang.String r6 = r13.getOptionalStringField(r3, r6)
            r11.A02 = r6
            java.lang.String r6 = "ig_creator_profile_picture_url"
            java.lang.String r12 = r13.getOptionalStringField(r0, r6)
            r6 = 0
            if (r12 == 0) goto L_0x0364
            com.instagram.common.typedurl.SimpleImageUrl r8 = new com.instagram.common.typedurl.SimpleImageUrl
            r8.<init>(r12)
        L_0x02d2:
            r11.A00 = r8
            r8 = 875(0x36b, float:1.226E-42)
            java.lang.String r8 = X.C273654mx.A00(r8)
            java.lang.String r8 = r13.A09(r8)
            if (r8 == 0) goto L_0x02e6
            r6 = 10
            java.lang.Long r6 = X.00y.A0n(r6, r8)
        L_0x02e6:
            r11.A01 = r6
        L_0x02e8:
            r1.A04 = r11
            java.lang.Class<X.BvN> r12 = X.C43261BvN.class
            r11 = 10
            r6 = 2951(0xb87, float:4.135E-42)
            java.lang.String r8 = X.AnonymousClass000.A00(r6)
            r6 = 1065085469(0x3f7bea1d, float:0.98404104)
            X.3lr r8 = r2.getOptionalTreeField(r11, r8, r12, r6)
            if (r8 == 0) goto L_0x0335
            r11 = 0
            com.instagram.direct.model.thread.CreatorBroadcastThreadInfo r7 = new com.instagram.direct.model.thread.CreatorBroadcastThreadInfo
            r7.<init>()
            r7.A03 = r4
            r7.A02 = r4
            r7.A07 = r3
            r7.A00 = r3
            r7.A05 = r4
            r7.A08 = r3
            r7.A01 = r3
            r7.A04 = r4
            r7.A06 = r4
            java.lang.String r6 = "audience_type"
            int r0 = r8.getCoercedIntField(r0, r6)
            r7.A00 = r0
            java.lang.String r0 = "ig_creator_profile_picture_url"
            java.lang.String r0 = r8.getOptionalStringField(r3, r0)
            if (r0 == 0) goto L_0x032a
            com.instagram.common.typedurl.SimpleImageUrl r11 = new com.instagram.common.typedurl.SimpleImageUrl
            r11.<init>(r0)
        L_0x032a:
            r7.A02 = r11
            r6 = 2
            java.lang.String r0 = "is_added_to_inbox"
            boolean r0 = r8.getCoercedBooleanField(r6, r0)
            r7.A07 = r0
        L_0x0335:
            r1.A03 = r7
            r6 = 11
            java.lang.String r0 = "context_line"
            java.lang.String r0 = r2.getOptionalStringField(r6, r0)
            r1.A06 = r0
            r6 = 12
            java.lang.String r0 = "is_following_chat_creator"
            boolean r0 = r2.getCoercedBooleanField(r6, r0)
            r1.A0D = r0
            r6 = 13
            java.lang.String r0 = "thread_subtype"
            int r0 = r2.getCoercedIntField(r6, r0)
            r1.A01 = r0
            r6 = 14
            java.lang.String r0 = "share_sheet_section"
            int r0 = r2.getCoercedIntField(r6, r0)
            r1.A00 = r0
            r9.add(r1)
            goto L_0x0161
        L_0x0364:
            r8 = r4
            goto L_0x02d2
        L_0x0367:
            r11 = r4
            goto L_0x02e8
        L_0x0369:
            r10.A00 = r9
            r4 = r10
        L_0x036c:
            r5.A00 = r4
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D0S.A00(X.BvW):X.5gL");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0059, code lost:
        if (r4.getCoercedIntField(7, "is_facebook_friend") == 0) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.instagram.user.model.User A01(X.C43238Bv0 r4) {
        /*
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR
            java.lang.String r0 = "pk"
            java.lang.String r1 = r4.A07(r0)
            java.lang.String r0 = X.Dbg.A01()
            java.lang.String r0 = r4.A08(r0)
            com.instagram.user.model.User r2 = new com.instagram.user.model.User
            r2.<init>(r1, r0)
            java.lang.String r0 = "full_name"
            java.lang.String r0 = r4.A09(r0)
            r2.A0t(r0)
            r0 = 3
            boolean r0 = X.C41847B3o.A1b(r4, r0)
            r2.A1F(r0)
            r1 = 4
            java.lang.String r0 = "is_private"
            boolean r0 = r4.getCoercedBooleanField(r1, r0)
            if (r0 == 0) goto L_0x00ef
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
        L_0x0031:
            r2.A0q(r0)
            java.lang.String r0 = "profile_pic_url"
            java.lang.String r0 = r4.A0C(r0)
            r2.A0u(r0)
            r1 = 6
            r0 = 664(0x298, float:9.3E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            int r0 = r4.getCoercedIntField(r1, r0)
            r2.A0c(r0)
            java.lang.String r1 = "is_facebook_friend"
            boolean r0 = r4.hasFieldValue(r1)
            if (r0 == 0) goto L_0x005b
            r0 = 7
            int r1 = r4.getCoercedIntField(r0, r1)
            r0 = 1
            if (r1 != 0) goto L_0x005c
        L_0x005b:
            r0 = 0
        L_0x005c:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            X.4Cl r0 = r2.A03
            r0.EVt(r1)
            java.lang.String r0 = "interop_messaging_user_fbid"
            java.lang.String r1 = r4.A0D(r0)
            if (r1 == 0) goto L_0x00ed
            r0 = 10
            java.lang.Long r0 = X.00y.A0n(r0, r1)
        L_0x0073:
            r2.A0s(r0)
            r1 = 9
            java.lang.String r0 = "context_line"
            java.lang.String r1 = r4.getOptionalStringField(r1, r0)
            X.4Cl r0 = r2.A03
            r0.ESo(r1)
            r1 = 11
            r0 = 675(0x2a3, float:9.46E-43)
            java.lang.String r3 = X.AnonymousClass000.A00(r0)
            java.lang.Boolean r1 = X.C41846B3n.A0d(r4, r3, r1)
            X.4Cl r0 = r2.A03
            r0.EXk(r1)
            r1 = 12
            r0 = 667(0x29b, float:9.35E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.Boolean r1 = X.C41846B3n.A0d(r4, r0, r1)
            X.4Cl r0 = r2.A03
            r0.EOt(r1)
            r1 = 13
            java.lang.String r0 = "account_type"
            int r0 = r4.getCoercedIntField(r1, r0)
            X.16V r0 = X.16U.A00(r0)
            r2.A0o(r0)
            r1 = 14
            java.lang.String r0 = "is_business"
            java.lang.Boolean r1 = X.C41846B3n.A0d(r4, r0, r1)
            X.4Cl r0 = r2.A03
            r0.EQB(r1)
            r1 = 15
            java.lang.String r0 = "wa_addressable"
            java.lang.Boolean r1 = X.C41846B3n.A0d(r4, r0, r1)
            if (r1 == 0) goto L_0x00d0
            X.4Cl r0 = r2.A03
            r0.Eqs(r1)
        L_0x00d0:
            r1 = 16
            java.lang.String r0 = "wa_eligibility"
            int r0 = r4.getCoercedIntField(r1, r0)
            X.4Cl r1 = r2.A03
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.Eqt(r0)
            r0 = 11
            java.lang.Boolean r1 = X.C41846B3n.A0d(r4, r3, r0)
            X.4Cl r0 = r2.A03
            r0.EXk(r1)
            return r2
        L_0x00ed:
            r0 = 0
            goto L_0x0073
        L_0x00ef:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x0031
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D0S.A01(X.Bv0):com.instagram.user.model.User");
    }
}
