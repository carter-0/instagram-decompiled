package X;

/* renamed from: X.4Ah  reason: invalid class name and case insensitive filesystem */
public abstract class C261624Ah {
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        if (r0 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
        if (r4.A4c.isEmpty() != false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0043, code lost:
        r1 = r4.A4c.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        if (r1.hasNext() == false) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0059, code lost:
        if (((X.1us) r1.next()).CUN() != false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0088, code lost:
        r0 = java.util.EnumSet.of(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0091, code lost:
        r0 = java.util.EnumSet.of(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009e, code lost:
        r0 = java.util.EnumSet.of(r3, r2, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a2, code lost:
        X.0qQ.A07(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a9, code lost:
        return r4.A15(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A00(X.AnonymousClass3Q2 r4, java.lang.Integer r5) {
        /*
            r0 = 0
            X.0qQ.A0B(r4, r0)
            int r0 = r5.intValue()
            r2 = 0
            switch(r0) {
                case 2: goto L_0x002a;
                case 3: goto L_0x0016;
                case 4: goto L_0x008d;
                case 5: goto L_0x0096;
                case 6: goto L_0x0086;
                case 7: goto L_0x0083;
                case 8: goto L_0x007e;
                case 9: goto L_0x0073;
                case 10: goto L_0x006e;
                case 11: goto L_0x006b;
                case 12: goto L_0x0062;
                case 13: goto L_0x0014;
                case 14: goto L_0x005f;
                case 15: goto L_0x005c;
                default: goto L_0x000c;
            }
        L_0x000c:
            java.lang.String r0 = r4.A3D
            if (r0 == 0) goto L_0x0015
            boolean r0 = r4.A5e
            if (r0 != 0) goto L_0x0015
        L_0x0014:
            r2 = 1
        L_0x0015:
            return r2
        L_0x0016:
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.HIGHLIGHTS
            java.util.EnumSet r0 = java.util.EnumSet.of(r0)
            X.0qQ.A07(r0)
            boolean r0 = r4.A15(r0)
            if (r0 == 0) goto L_0x0015
            boolean r0 = r4.A0n()
            goto L_0x0039
        L_0x002a:
            com.instagram.pendingmedia.model.constants.ShareType r1 = com.instagram.pendingmedia.model.constants.ShareType.REEL_SHARE
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.REEL_SHARE_AND_DIRECT_STORY_SHARE
            java.util.EnumSet r0 = java.util.EnumSet.of(r1, r0)
            X.0qQ.A07(r0)
            boolean r0 = r4.A15(r0)
        L_0x0039:
            if (r0 == 0) goto L_0x0015
            java.util.List r0 = r4.A4c
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0014
            java.util.List r0 = r4.A4c
            java.util.Iterator r1 = r0.iterator()
        L_0x0049:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0015
            java.lang.Object r0 = r1.next()
            X.1us r0 = (X.1us) r0
            boolean r0 = r0.CUN()
            if (r0 != 0) goto L_0x0049
            goto L_0x0014
        L_0x005c:
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.CLIPS_PANAVIDEO
            goto L_0x0088
        L_0x005f:
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.POST_LIVE_IGTV
            goto L_0x0088
        L_0x0062:
            com.instagram.pendingmedia.model.constants.ShareType r3 = com.instagram.pendingmedia.model.constants.ShareType.FOLLOWERS_SHARE
            com.instagram.pendingmedia.model.constants.ShareType r2 = com.instagram.pendingmedia.model.constants.ShareType.CLIPS
            com.instagram.pendingmedia.model.constants.ShareType r1 = com.instagram.pendingmedia.model.constants.ShareType.IGTV
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.POST_LIVE_IGTV
            goto L_0x009e
        L_0x006b:
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.MEDIA_KIT
            goto L_0x0088
        L_0x006e:
            com.instagram.pendingmedia.model.constants.ShareType r1 = com.instagram.pendingmedia.model.constants.ShareType.CLIPS
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.CLIPS_WITH_TEMPLATE
            goto L_0x0091
        L_0x0073:
            com.instagram.pendingmedia.model.constants.ShareType r2 = com.instagram.pendingmedia.model.constants.ShareType.FOLLOWERS_SHARE
            com.instagram.pendingmedia.model.constants.ShareType r1 = com.instagram.pendingmedia.model.constants.ShareType.IGTV
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.POST_LIVE_IGTV
            java.util.EnumSet r0 = java.util.EnumSet.of(r2, r1, r0)
            goto L_0x00a2
        L_0x007e:
            com.instagram.pendingmedia.model.constants.ShareType r1 = com.instagram.pendingmedia.model.constants.ShareType.IGTV
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.POST_LIVE_IGTV
            goto L_0x0091
        L_0x0083:
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.NAMETAG_BACKGROUND_IMAGE
            goto L_0x0088
        L_0x0086:
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.NAMETAG_SELFIE
        L_0x0088:
            java.util.EnumSet r0 = java.util.EnumSet.of(r0)
            goto L_0x00a2
        L_0x008d:
            com.instagram.pendingmedia.model.constants.ShareType r1 = com.instagram.pendingmedia.model.constants.ShareType.DIRECT_STORY_SHARE
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.REEL_SHARE_AND_DIRECT_STORY_SHARE
        L_0x0091:
            java.util.EnumSet r0 = java.util.EnumSet.of(r1, r0)
            goto L_0x00a2
        L_0x0096:
            com.instagram.pendingmedia.model.constants.ShareType r3 = com.instagram.pendingmedia.model.constants.ShareType.FOLLOWERS_SHARE
            com.instagram.pendingmedia.model.constants.ShareType r2 = com.instagram.pendingmedia.model.constants.ShareType.REEL_SHARE
            com.instagram.pendingmedia.model.constants.ShareType r1 = com.instagram.pendingmedia.model.constants.ShareType.DIRECT_STORY_SHARE
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.REEL_SHARE_AND_DIRECT_STORY_SHARE
        L_0x009e:
            java.util.EnumSet r0 = java.util.EnumSet.of(r3, r2, r1, r0)
        L_0x00a2:
            X.0qQ.A07(r0)
            boolean r2 = r4.A15(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C261624Ah.A00(X.3Q2, java.lang.Integer):boolean");
    }
}
