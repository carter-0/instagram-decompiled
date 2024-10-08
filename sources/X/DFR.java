package X;

import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

public final /* synthetic */ class DFR implements AnonymousClass2Kv {
    public final /* synthetic */ X5P A00;
    public final /* synthetic */ ReelDashboardFragment A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ DFR(X5P x5p, ReelDashboardFragment reelDashboardFragment, String str) {
        this.A01 = reelDashboardFragment;
        this.A00 = x5p;
        this.A02 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00e8, code lost:
        if (r2.getCoercedBooleanField(0, "has_next_page") == false) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x019e, code lost:
        if (r11.getCoercedBooleanField(2, "is_verified") == false) goto L_0x01a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01c0, code lost:
        if (r11.getCoercedBooleanField(4, "has_interop_enabled") == false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01da, code lost:
        if (r11.getCoercedBooleanField(5, "is_blocked_by_viewer") == false) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01ee, code lost:
        if (r11.getCoercedBooleanField(7, "is_viewer_story_hidden_from_user") == false) goto L_0x01f0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(X.AnonymousClass3JD r36) {
        /*
            r35 = this;
            r1 = r35
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment r0 = r1.A01
            r34 = r0
            X.X5P r0 = r1.A00
            r28 = r0
            java.lang.String r0 = r1.A02
            r33 = r0
            if (r36 == 0) goto L_0x0292
            java.lang.Object r4 = r36.Bny()
            if (r4 == 0) goto L_0x0292
            X.3lr r4 = (X.C250663lr) r4
            java.lang.Class<com.instagram.reels.api.FetchXPSFBStoryCardViewersQueryResponseImpl$XcxpFetchStory> r3 = com.instagram.reels.api.FetchXPSFBStoryCardViewersQueryResponseImpl.XcxpFetchStory.class
            X.3sh r0 = X.C250663lr.Companion
            r2 = -1568071472(0xffffffffa28920d0, float:-3.7168666E-18)
            r10 = 0
            java.lang.String r1 = "xcxp_fetch_story(content_destinations:[\"FB\"],content_source:\"IG\",id:$id)"
            com.google.common.collect.ImmutableList r0 = r4.getRequiredCompactedTreeListField(r10, r1, r3, r2)
            if (r0 == 0) goto L_0x0292
            com.google.common.collect.ImmutableList r0 = r4.getRequiredCompactedTreeListField(r10, r1, r3, r2)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0292
            com.google.common.collect.ImmutableList r0 = r4.getRequiredCompactedTreeListField(r10, r1, r3, r2)
            java.lang.Object r7 = r0.get(r10)
            X.3lr r7 = (X.C250663lr) r7
            if (r7 == 0) goto L_0x0292
            java.lang.Class<com.instagram.reels.api.FetchXPSFBStoryCardViewersQueryResponseImpl$XcxpFetchStory$InlineXFBXPSStoryCardCXPWrapper> r6 = com.instagram.reels.api.FetchXPSFBStoryCardViewersQueryResponseImpl.XcxpFetchStory.InlineXFBXPSStoryCardCXPWrapper.class
            r5 = -1351886448(0xffffffffaf6bd990, float:-2.1450419E-10)
            java.lang.String r4 = "XFBXPSStoryCardCXPWrapper"
            X.3lr r0 = r7.reinterpretIfFulfillsType(r10, r4, r6, r5)
            if (r0 == 0) goto L_0x0292
            X.3lr r1 = r7.reinterpretIfFulfillsType(r10, r4, r6, r5)
            java.lang.Class<com.instagram.reels.api.FetchXPSFBStoryCardViewersQueryResponseImpl$XcxpFetchStory$InlineXFBXPSStoryCardCXPWrapper$FbStory> r3 = com.instagram.reels.api.FetchXPSFBStoryCardViewersQueryResponseImpl.XcxpFetchStory.InlineXFBXPSStoryCardCXPWrapper.FbStory.class
            r0 = 276374327(0x10792337, float:4.913372E-29)
            java.lang.String r2 = "story_card"
            X.3lr r0 = r1.getOptionalTreeField(r10, r2, r3, r0)
            if (r0 == 0) goto L_0x0292
            X.3lr r1 = r7.reinterpretIfFulfillsType(r10, r4, r6, r5)
            r0 = 276374327(0x10792337, float:4.913372E-29)
            X.3lr r7 = r1.getOptionalTreeField(r10, r2, r3, r0)
            com.instagram.reels.api.FetchXPSFBStoryCardViewersQueryResponseImpl$XcxpFetchStory$InlineXFBXPSStoryCardCXPWrapper$FbStory r7 = (com.instagram.reels.api.FetchXPSFBStoryCardViewersQueryResponseImpl.XcxpFetchStory.InlineXFBXPSStoryCardCXPWrapper.FbStory) r7
            com.instagram.reels.api.FBStoryFeedbackFragmentImpl r0 = r7.A0E()
            com.instagram.reels.api.FBStoryFeedbackFragmentImpl$EdgeStoryMediaViewers r0 = r0.A0E()
            if (r0 == 0) goto L_0x0292
            com.instagram.reels.api.FBStoryFeedbackFragmentImpl r0 = r7.A0E()
            com.instagram.reels.api.FBStoryFeedbackFragmentImpl$EdgeStoryMediaViewers r0 = r0.A0E()
            if (r0 == 0) goto L_0x0292
            com.instagram.reels.api.FBStoryFeedbackFragmentImpl r0 = r7.A0E()
            com.instagram.reels.api.FBStoryFeedbackFragmentImpl$EdgeStoryMediaViewers r1 = r0.A0E()
            java.lang.Class<com.instagram.reels.api.FBStoryFeedbackFragmentImpl$EdgeStoryMediaViewers$Edges> r8 = com.instagram.reels.api.FBStoryFeedbackFragmentImpl.EdgeStoryMediaViewers.Edges.class
            r0 = -1542550260(0xffffffffa40e8d0c, float:-3.0910813E-17)
            java.lang.String r3 = "edges"
            com.google.common.collect.ImmutableList r0 = r1.getRequiredCompactedTreeListField(r10, r3, r8, r0)
            if (r0 == 0) goto L_0x0292
            com.instagram.reels.api.FBStoryFeedbackFragmentImpl r0 = r7.A0E()
            com.instagram.reels.api.FBStoryFeedbackFragmentImpl$EdgeStoryMediaViewers r0 = r0.A0E()
            java.lang.Class<com.instagram.reels.api.FBStoryFeedbackFragmentImpl$EdgeStoryMediaViewers$PageInfo> r6 = com.instagram.reels.api.FBStoryFeedbackFragmentImpl.EdgeStoryMediaViewers.PageInfo.class
            r5 = -867972959(0xffffffffcc43c8a1, float:-5.1323524E7)
            r12 = 1
            java.lang.String r2 = "page_info"
            X.3lr r0 = r0.getOptionalTreeField(r12, r2, r6, r5)
            if (r0 == 0) goto L_0x0292
            com.instagram.reels.api.FBStoryFeedbackFragmentImpl r0 = r7.A0E()
            com.instagram.reels.api.FBStoryFeedbackFragmentImpl$EdgeStoryMediaViewers r0 = r0.A0E()
            X.3lr r0 = r0.getOptionalTreeField(r12, r2, r6, r5)
            java.lang.String r4 = "end_cursor"
            java.lang.String r0 = r0.A0A(r4)
            if (r0 == 0) goto L_0x0292
            com.instagram.reels.api.FBStoryFeedbackFragmentImpl r0 = r7.A0E()
            com.instagram.reels.api.FBStoryFeedbackFragmentImpl$EdgeStoryMediaViewers r1 = r0.A0E()
            r0 = -1542550260(0xffffffffa40e8d0c, float:-3.0910813E-17)
            com.google.common.collect.ImmutableList r3 = r1.getRequiredCompactedTreeListField(r10, r3, r8, r0)
            com.instagram.reels.api.FBStoryFeedbackFragmentImpl r0 = r7.A0E()
            com.instagram.reels.api.FBStoryFeedbackFragmentImpl$EdgeStoryMediaViewers r0 = r0.A0E()
            X.3lr r2 = r0.getOptionalTreeField(r12, r2, r6, r5)
            java.lang.String r27 = r2.A0A(r4)
            java.lang.String r1 = "has_next_page"
            boolean r0 = r2.hasFieldValue(r1)
            if (r0 == 0) goto L_0x00ea
            boolean r1 = r2.getCoercedBooleanField(r10, r1)
            r0 = 1
            if (r1 != 0) goto L_0x00eb
        L_0x00ea:
            r0 = 0
        L_0x00eb:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00f7
            r27 = 0
        L_0x00f7:
            java.util.ArrayList r18 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r17 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r16 = r3.iterator()
        L_0x0103:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0274
            X.3lr r13 = X.C41845B3m.A0V(r16)
            java.lang.Class<com.instagram.reels.api.FBStoryFeedbackFragmentImpl$EdgeStoryMediaViewers$Edges$Node> r3 = com.instagram.reels.api.FBStoryFeedbackFragmentImpl.EdgeStoryMediaViewers.Edges.Node.class
            r2 = 921598298(0x36ee795a, float:7.10708E-6)
            r14 = 2
            java.lang.String r1 = "node"
            X.3lr r0 = r13.getOptionalTreeField(r14, r1, r3, r2)
            if (r0 == 0) goto L_0x0103
            X.3lr r2 = r13.getOptionalTreeField(r14, r1, r3, r2)
            java.lang.Class<com.instagram.reels.api.FBStoryViewerFragmentImpl> r1 = com.instagram.reels.api.FBStoryViewerFragmentImpl.class
            r0 = -47832053(0xfffffffffd26240b, float:-1.3802437E37)
            X.3lr r11 = r2.reinterpretRequired(r10, r1, r0)
            com.instagram.reels.api.FBStoryViewerFragmentImpl r11 = (com.instagram.reels.api.FBStoryViewerFragmentImpl) r11
            com.instagram.reels.api.FBStoryViewerFragmentImpl$ProfilePhoto r0 = r11.A0E()
            if (r0 == 0) goto L_0x0103
            com.instagram.reels.api.FBStoryViewerFragmentImpl$ProfilePhoto r0 = r11.A0E()
            java.lang.Class<com.instagram.reels.api.FBStoryViewerFragmentImpl$ProfilePhoto$InlineXFBXPSProfilePhoto> r9 = com.instagram.reels.api.FBStoryViewerFragmentImpl.ProfilePhoto.InlineXFBXPSProfilePhoto.class
            r8 = -497406717(0xffffffffe25a2d03, float:-1.0061584E21)
            java.lang.String r7 = "XFBXPSProfilePhoto"
            X.3lr r0 = r0.reinterpretIfFulfillsType(r10, r7, r9, r8)
            if (r0 == 0) goto L_0x0103
            java.lang.Class<com.instagram.reels.api.FBStoryFeedbackFragmentImpl$EdgeStoryMediaViewers$Edges$EmojiReactions> r6 = com.instagram.reels.api.FBStoryFeedbackFragmentImpl.EdgeStoryMediaViewers.Edges.EmojiReactions.class
            r5 = -1242013829(0xffffffffb5f85f7b, float:-1.8505228E-6)
            java.lang.String r4 = "emoji_reactions"
            com.google.common.collect.ImmutableList r0 = r13.getOptionalCompactedTreeListField(r10, r4, r6, r5)
            if (r0 == 0) goto L_0x0103
            java.lang.String r3 = "strong_id__"
            java.lang.String r0 = r11.getOptionalStringField(r10, r3)
            if (r0 == 0) goto L_0x0103
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR
            java.lang.String r15 = r11.getOptionalStringField(r10, r3)
            java.lang.String r2 = "name"
            java.lang.String r0 = r11.getOptionalStringField(r12, r2)
            com.instagram.user.model.User r1 = new com.instagram.user.model.User
            r1.<init>(r15, r0)
            com.instagram.reels.api.FBStoryViewerFragmentImpl$ProfilePhoto r0 = r11.A0E()
            X.3lr r0 = r0.reinterpretIfFulfillsType(r10, r7, r9, r8)
            java.lang.String r15 = r0.getOptionalStringField(r10, r3)
            X.4Cl r0 = r1.A03
            r0.EhC(r15)
            com.instagram.reels.api.FBStoryViewerFragmentImpl$ProfilePhoto r0 = r11.A0E()
            X.3lr r7 = r0.reinterpretIfFulfillsType(r10, r7, r9, r8)
            java.lang.String r0 = "url"
            java.lang.String r0 = r7.getOptionalStringField(r12, r0)
            r1.A0u(r0)
            java.lang.String r0 = r11.getOptionalStringField(r12, r2)
            r1.A0t(r0)
            java.lang.String r2 = "is_verified"
            boolean r0 = r11.hasFieldValue(r2)
            r7 = 0
            if (r0 == 0) goto L_0x01a0
            boolean r2 = r11.getCoercedBooleanField(r14, r2)
            r0 = 1
            if (r2 != 0) goto L_0x01a1
        L_0x01a0:
            r0 = 0
        L_0x01a1:
            r1.A1F(r0)
            r1.A0c(r12)
            java.lang.String r0 = r11.getOptionalStringField(r10, r3)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r1.A0s(r0)
            java.lang.String r2 = "has_interop_enabled"
            boolean r0 = r11.hasFieldValue(r2)
            if (r0 == 0) goto L_0x01c2
            r0 = 4
            boolean r2 = r11.getCoercedBooleanField(r0, r2)
            r0 = 1
            if (r2 != 0) goto L_0x01c3
        L_0x01c2:
            r0 = 0
        L_0x01c3:
            X.4Cl r2 = r1.A03
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.EYR(r0)
            java.lang.String r2 = "is_blocked_by_viewer"
            boolean r0 = r11.hasFieldValue(r2)
            if (r0 == 0) goto L_0x01dc
            r0 = 5
            boolean r2 = r11.getCoercedBooleanField(r0, r2)
            r0 = 1
            if (r2 != 0) goto L_0x01dd
        L_0x01dc:
            r0 = 0
        L_0x01dd:
            r1.A0y(r0)
            java.lang.String r2 = "is_viewer_story_hidden_from_user"
            boolean r0 = r11.hasFieldValue(r2)
            if (r0 == 0) goto L_0x01f0
            r0 = 7
            boolean r2 = r11.getCoercedBooleanField(r0, r2)
            r0 = 1
            if (r2 != 0) goto L_0x01f1
        L_0x01f0:
            r0 = 0
        L_0x01f1:
            r1.A0z(r0)
            java.lang.String r2 = "is_friends_with_viewer"
            boolean r0 = r11.hasFieldValue(r2)
            if (r0 == 0) goto L_0x0204
            r0 = 6
            boolean r0 = r11.getCoercedBooleanField(r0, r2)
            if (r0 == 0) goto L_0x0204
            r7 = 1
        L_0x0204:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r7)
            X.4Cl r0 = r1.A03
            r0.EVt(r2)
            r0 = r34
            com.instagram.common.session.UserSession r0 = r0.A06
            X.17i r0 = X.17h.A00(r0)
            X.0qQ.A0B(r1, r10)
            r0.A01(r1, r12, r10)
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            r21 = 0
            com.google.common.collect.ImmutableList r0 = r13.getOptionalCompactedTreeListField(r10, r4, r6, r5)
            X.3kO r6 = r0.iterator()
            r5 = r21
        L_0x022b:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0255
            X.3lr r4 = X.C41845B3m.A0V(r6)
            java.lang.String r2 = "reaction"
            java.lang.String r0 = r4.getOptionalStringField(r12, r2)
            if (r0 == 0) goto L_0x022b
            java.lang.String r0 = r4.getOptionalStringField(r12, r2)
            r3 = 25
            X.BBV r5 = new X.BBV
            r5.<init>(r0, r3)
            java.lang.String r2 = r4.getOptionalStringField(r12, r2)
            X.BBV r0 = new X.BBV
            r0.<init>(r2, r3)
            r7.add(r0)
            goto L_0x022b
        L_0x0255:
            java.lang.String r24 = ""
            X.9J5 r2 = new X.9J5
            r19 = r2
            r20 = r5
            r22 = r1
            r23 = r21
            r25 = r7
            r26 = r10
            r19.<init>(r20, r21, r22, r23, r24, r25, r26)
            r0 = r18
            r0.add(r1)
            r0 = r17
            r0.add(r2)
            goto L_0x0103
        L_0x0274:
            r29 = 0
            java.lang.Boolean r26 = java.lang.Boolean.valueOf(r10)
            r25 = r28
            r28 = r18
            r30 = r17
            r31 = r10
            r32 = r10
            r25.DEw(r26, r27, r28, r29, r30, r31, r32)
            r0 = r34
            X.TzX r1 = r0.mListAdapter
            if (r1 == 0) goto L_0x0292
            r0 = r33
            r1.A0A(r0, r10)
        L_0x0292:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DFR.invoke(X.3JD):void");
    }
}
