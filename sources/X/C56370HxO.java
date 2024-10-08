package X;

/* renamed from: X.HxO  reason: case insensitive filesystem */
public abstract class C56370HxO {
    /* JADX WARNING: type inference failed for: r15v0, types: [X.07Z, androidx.fragment.app.Fragment, X.4DH] */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006b, code lost:
        if (r16.BUr() == null) goto L_0x006d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.AnonymousClass4DH r15, X.C67231sQ r16, X.AnonymousClass0iw r17, com.instagram.common.session.UserSession r18, X.1Xj r19, int r20) {
        /*
            r11 = r18
            java.lang.String r1 = r11.A06
            r12 = r19
            com.instagram.user.model.User r0 = r12.A2A(r11)
            r14 = 0
            java.lang.String r0 = X.C51968G9o.A15(r0)
            boolean r1 = X.0qQ.A0K(r1, r0)
            android.content.Context r10 = r15.requireContext()
            X.1sQ r0 = X.C51966G9m.A0n(r12)
            if (r1 == 0) goto L_0x00e2
            if (r0 == 0) goto L_0x0033
            java.lang.String r13 = r0.getMusicCanonicalId()
            if (r13 == 0) goto L_0x0033
            X.0xx r0 = X.DbW.A0E(r15)
            r15 = 16
            X.MH6 r9 = new X.MH6
            r9.<init>((java.lang.Object) r10, (java.lang.Object) r11, (java.lang.Object) r12, (java.lang.String) r13, (X.AnonymousClass4D7) r14, (int) r15)
            X.AnonymousClass7TE.A1Z(r9, r0)
        L_0x0033:
            if (r16 == 0) goto L_0x00df
            com.instagram.api.schemas.MusicInfo r1 = r16.BUr()
            if (r1 == 0) goto L_0x00d2
            X.46h r0 = new X.46h
            r0.<init>(r1)
        L_0x0040:
            X.46i r0 = (X.C2606046i) r0
            if (r0 == 0) goto L_0x00cf
            com.instagram.api.schemas.OriginalAudioSubtype r2 = r0.Ads()
        L_0x0048:
            com.instagram.api.schemas.OriginalAudioSubtype r1 = com.instagram.api.schemas.OriginalAudioSubtype.A04
            if (r2 != r1) goto L_0x00cd
            X.8ZN r5 = X.AnonymousClass8ZN.AUDIO_PAGE_MAY_INCLUDE
        L_0x004e:
            java.lang.String r4 = X.AnonymousClass7TG.A0j()
            if (r0 == 0) goto L_0x00c9
            java.lang.String r9 = r0.getAudioAssetId()
            java.lang.String r8 = r0.getArtistId()
            java.lang.String r7 = r0.BYx()
        L_0x0060:
            java.lang.String r3 = X.AnonymousClass7TG.A0j()
            if (r16 == 0) goto L_0x006d
            com.instagram.api.schemas.MusicInfo r0 = r16.BUr()
            r6 = 0
            if (r0 != 0) goto L_0x006e
        L_0x006d:
            r6 = 1
        L_0x006e:
            r10 = r17
            X.0wc r1 = X.AnonymousClass0kN.A01(r10, r11)
            java.lang.String r0 = "instagram_organic_audio_page_unpin_media"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x00bb
            X.DbW.A16(r2, r10)
            java.lang.Long r0 = X.C51972G9s.A0j(r9)
            X.C51965G9l.A1F(r2, r0)
            if (r6 == 0) goto L_0x00c6
            X.HOL r1 = X.HOL.ORIGINAL
        L_0x008e:
            java.lang.String r0 = "audio_type"
            r2.A8M(r1, r0)
            if (r8 != 0) goto L_0x00c1
            r1 = r14
        L_0x0096:
            java.lang.String r0 = "audio_owner_id"
            r2.AAE(r1, r0)
            X.C51971G9r.A16(r5, r2, r4)
            if (r8 != 0) goto L_0x00bc
            r1 = r14
        L_0x00a1:
            java.lang.String r0 = "media_author_id"
            r2.AAE(r1, r0)
            if (r7 == 0) goto L_0x00ac
            java.lang.Long r14 = X.AnonymousClass7TE.A10(r7)
        L_0x00ac:
            X.C51965G9l.A1E(r2, r14)
            r0 = r20
            long r0 = (long) r0
            X.C51970G9q.A19(r2, r0)
            X.C51965G9l.A1N(r2, r3)
            X.AnonymousClass7TH.A0V(r2)
        L_0x00bb:
            return
        L_0x00bc:
            X.4Ny r1 = X.C263944Ny.A00(r8)
            goto L_0x00a1
        L_0x00c1:
            X.4Ny r1 = X.C263944Ny.A00(r8)
            goto L_0x0096
        L_0x00c6:
            X.HOL r1 = X.HOL.SONG
            goto L_0x008e
        L_0x00c9:
            r9 = r14
            r8 = r14
            r7 = r14
            goto L_0x0060
        L_0x00cd:
            r5 = r14
            goto L_0x004e
        L_0x00cf:
            r2 = r14
            goto L_0x0048
        L_0x00d2:
            com.instagram.api.schemas.OriginalSoundDataIntf r1 = r16.BZB()
            if (r1 == 0) goto L_0x00df
            X.5Bc r0 = new X.5Bc
            r0.<init>(r1)
            goto L_0x0040
        L_0x00df:
            r0 = 0
            goto L_0x0040
        L_0x00e2:
            if (r0 == 0) goto L_0x0033
            java.lang.String r13 = r0.getMusicCanonicalId()
            if (r13 == 0) goto L_0x0033
            X.0xx r0 = X.DbW.A0E(r15)
            r15 = 17
            X.MH6 r9 = new X.MH6
            r9.<init>((java.lang.Object) r10, (java.lang.Object) r11, (java.lang.Object) r12, (java.lang.String) r13, (X.AnonymousClass4D7) r14, (int) r15)
            X.AnonymousClass7TE.A1Z(r9, r0)
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56370HxO.A01(X.4DH, X.1sQ, X.0iw, com.instagram.common.session.UserSession, X.1Xj, int):void");
    }

    /* JADX WARNING: type inference failed for: r16v0, types: [X.07Z, androidx.fragment.app.Fragment, X.4DH] */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
        if (r17.BUr() == null) goto L_0x005e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.AnonymousClass4DH r16, X.C67231sQ r17, X.AnonymousClass0iw r18, com.instagram.common.session.UserSession r19, X.1Xj r20, int r21) {
        /*
            android.content.Context r11 = r16.requireContext()
            r13 = r20
            X.1sQ r0 = X.C51966G9m.A0n(r13)
            r12 = r19
            if (r0 == 0) goto L_0x0023
            java.lang.String r14 = r0.getMusicCanonicalId()
            if (r14 == 0) goto L_0x0023
            X.0xx r0 = X.DbW.A0E(r16)
            r15 = 0
            r16 = 15
            X.MH6 r10 = new X.MH6
            r10.<init>((java.lang.Object) r11, (java.lang.Object) r12, (java.lang.Object) r13, (java.lang.String) r14, (X.AnonymousClass4D7) r15, (int) r16)
            X.AnonymousClass7TE.A1Z(r10, r0)
        L_0x0023:
            r4 = 0
            if (r17 == 0) goto L_0x00d0
            com.instagram.api.schemas.MusicInfo r0 = r17.BUr()
            if (r0 == 0) goto L_0x00c3
            X.46h r2 = new X.46h
            r2.<init>(r0)
        L_0x0031:
            X.46i r2 = (X.C2606046i) r2
            if (r2 == 0) goto L_0x00c0
            com.instagram.api.schemas.OriginalAudioSubtype r1 = r2.Ads()
        L_0x0039:
            com.instagram.api.schemas.OriginalAudioSubtype r0 = com.instagram.api.schemas.OriginalAudioSubtype.A04
            if (r1 != r0) goto L_0x00be
            X.8ZN r7 = X.AnonymousClass8ZN.AUDIO_PAGE_MAY_INCLUDE
        L_0x003f:
            java.lang.String r6 = X.AnonymousClass7TG.A0j()
            if (r2 == 0) goto L_0x00ba
            java.lang.String r10 = r2.getAudioAssetId()
            java.lang.String r9 = r2.getArtistId()
            java.lang.String r8 = r2.BYx()
        L_0x0051:
            java.lang.String r3 = X.AnonymousClass7TG.A0j()
            if (r17 == 0) goto L_0x005e
            com.instagram.api.schemas.MusicInfo r0 = r17.BUr()
            r5 = 0
            if (r0 != 0) goto L_0x005f
        L_0x005e:
            r5 = 1
        L_0x005f:
            r11 = r18
            X.0wc r1 = X.AnonymousClass0kN.A01(r11, r12)
            java.lang.String r0 = "instagram_organic_audio_page_pin_media"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x00ac
            X.DbW.A16(r2, r11)
            java.lang.Long r0 = X.C51972G9s.A0j(r10)
            X.C51965G9l.A1F(r2, r0)
            if (r5 == 0) goto L_0x00b7
            X.HOL r1 = X.HOL.ORIGINAL
        L_0x007f:
            java.lang.String r0 = "audio_type"
            r2.A8M(r1, r0)
            if (r9 != 0) goto L_0x00b2
            r1 = r4
        L_0x0087:
            java.lang.String r0 = "audio_owner_id"
            r2.AAE(r1, r0)
            X.C51971G9r.A16(r7, r2, r6)
            if (r9 != 0) goto L_0x00ad
            r1 = r4
        L_0x0092:
            java.lang.String r0 = "media_author_id"
            r2.AAE(r1, r0)
            if (r8 == 0) goto L_0x009d
            java.lang.Long r4 = X.AnonymousClass7TE.A10(r8)
        L_0x009d:
            X.C51965G9l.A1E(r2, r4)
            r0 = r21
            long r0 = (long) r0
            X.C51970G9q.A19(r2, r0)
            X.C51965G9l.A1N(r2, r3)
            X.AnonymousClass7TH.A0V(r2)
        L_0x00ac:
            return
        L_0x00ad:
            X.4Ny r1 = X.C263944Ny.A00(r9)
            goto L_0x0092
        L_0x00b2:
            X.4Ny r1 = X.C263944Ny.A00(r9)
            goto L_0x0087
        L_0x00b7:
            X.HOL r1 = X.HOL.SONG
            goto L_0x007f
        L_0x00ba:
            r10 = r4
            r9 = r4
            r8 = r4
            goto L_0x0051
        L_0x00be:
            r7 = r4
            goto L_0x003f
        L_0x00c0:
            r1 = r4
            goto L_0x0039
        L_0x00c3:
            com.instagram.api.schemas.OriginalSoundDataIntf r0 = r17.BZB()
            if (r0 == 0) goto L_0x00d0
            X.5Bc r2 = new X.5Bc
            r2.<init>(r0)
            goto L_0x0031
        L_0x00d0:
            r2 = 0
            goto L_0x0031
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56370HxO.A00(X.4DH, X.1sQ, X.0iw, com.instagram.common.session.UserSession, X.1Xj, int):void");
    }
}
