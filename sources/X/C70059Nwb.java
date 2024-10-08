package X;

/* renamed from: X.Nwb  reason: case insensitive filesystem */
public abstract class C70059Nwb {
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        if (r5.width_ == -1) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(com.instagram.common.session.UserSession r24, com.instagram.direct.armadilloexpress.transportpayload.Link r25, X.C254703su r26, java.lang.Long r27, java.lang.String r28) {
        /*
            r23 = 0
            r2 = r24
            r1 = r25
            X.AnonymousClass7TG.A1O(r2, r1)
            int r0 = r1.bitField0_
            r0 = r0 & 2
            r3 = r26
            if (r0 == 0) goto L_0x0050
            com.instagram.direct.armadilloexpress.transportpayload.LinkContext r6 = r1.linkContext_
            if (r6 != 0) goto L_0x0019
            com.instagram.direct.armadilloexpress.transportpayload.LinkContext r6 = com.instagram.direct.armadilloexpress.transportpayload.LinkContext.DEFAULT_INSTANCE
            if (r6 == 0) goto L_0x0050
        L_0x0019:
            com.instagram.direct.armadilloexpress.transportpayload.ImageUrl r0 = r6.linkImageUrl_
            if (r0 != 0) goto L_0x001f
            com.instagram.direct.armadilloexpress.transportpayload.ImageUrl r0 = com.instagram.direct.armadilloexpress.transportpayload.ImageUrl.DEFAULT_INSTANCE
        L_0x001f:
            java.lang.String r0 = r0.url_
            int r0 = X.C66580MXl.A06(r0)
            if (r0 != 0) goto L_0x0036
            com.instagram.direct.armadilloexpress.transportpayload.ImageUrl r5 = r6.linkImageUrl_
            if (r5 != 0) goto L_0x002d
            com.instagram.direct.armadilloexpress.transportpayload.ImageUrl r5 = com.instagram.direct.armadilloexpress.transportpayload.ImageUrl.DEFAULT_INSTANCE
        L_0x002d:
            int r0 = r5.height_
            r4 = -1
            if (r0 != r4) goto L_0x0036
            int r0 = r5.width_
            if (r0 == r4) goto L_0x0050
        L_0x0036:
            int r4 = r6.bitField0_
            r0 = r4 & 1
            if (r0 != 0) goto L_0x0062
            r0 = r4 & 32
            if (r0 != 0) goto L_0x0062
            r0 = r4 & 8
            if (r0 != 0) goto L_0x0062
            r0 = r4 & 2
            if (r0 != 0) goto L_0x0062
            r0 = r4 & 64
            if (r0 != 0) goto L_0x0062
            r0 = r4 & 4
            if (r0 == 0) goto L_0x0062
        L_0x0050:
            java.lang.String r2 = r1.text_
            X.9Iu r0 = new X.9Iu
            r0.<init>(r2)
            X.2FW r1 = X.2FW.A17
            X.9Iu r0 = new X.9Iu
            r0.<init>(r2)
            r3.A17(r1, r0)
            return
        L_0x0062:
            java.lang.String r9 = r3.A0f()
            r0 = 0
            r8 = r28
            if (r28 == 0) goto L_0x0126
            if (r9 == 0) goto L_0x0126
            long r10 = r3.C7c()
            boolean r12 = r3.A1d()
            X.N2l r6 = new X.N2l
            r7 = r27
            r6.<init>(r7, r8, r9, r10, r12)
        L_0x007c:
            com.instagram.direct.armadilloexpress.transportpayload.LinkContext r7 = r1.linkContext_
            if (r7 != 0) goto L_0x0082
            com.instagram.direct.armadilloexpress.transportpayload.LinkContext r7 = com.instagram.direct.armadilloexpress.transportpayload.LinkContext.DEFAULT_INSTANCE
        L_0x0082:
            X.0qQ.A07(r7)
            int r5 = r7.bitField0_
            r4 = r5 & 32
            if (r4 == 0) goto L_0x0108
            com.instagram.direct.armadilloexpress.transportpayload.Thumbnail r8 = r7.linkPreviewThumbnail_
            if (r8 != 0) goto L_0x0091
            com.instagram.direct.armadilloexpress.transportpayload.Thumbnail r8 = com.instagram.direct.armadilloexpress.transportpayload.Thumbnail.DEFAULT_INSTANCE
        L_0x0091:
            X.0qQ.A07(r8)
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r4 = r8.mediaTransport_
            if (r4 != 0) goto L_0x009a
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r4 = com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport.DEFAULT_INSTANCE
        L_0x009a:
            X.0qQ.A07(r4)
            android.net.Uri r4 = X.C66834MdS.A00(r6, r4, r0)
            java.lang.String r6 = X.DbT.A10(r4)
            int r5 = r8.width_
            int r4 = r8.height_
            com.instagram.model.mediasize.ExtendedImageUrl r12 = new com.instagram.model.mediasize.ExtendedImageUrl
            r12.<init>(r6, r5, r4)
        L_0x00ae:
            X.TnY r5 = r7.linkMusicPreviewCountriesAllowed_
            android.content.Context r4 = X.C60960kU.A00
            X.0qQ.A07(r4)
            com.instagram.phonenumber.model.CountryCodeData r4 = X.C3270479e.A00(r4)
            java.lang.String r4 = r4.A00
            boolean r4 = r5.contains(r4)
            if (r4 == 0) goto L_0x00c3
            java.lang.String r0 = r7.linkMusicPreviewUrl_
        L_0x00c3:
            java.lang.String r10 = r7.linkPreviewTitle_
            java.lang.String r9 = r7.linkSummary_
            java.lang.String r8 = r7.linkUrl_
            java.lang.String r7 = r7.linkPreviewBody_
            X.0Tu r6 = X.0Tu.A05
            r4 = 2342165852579768858(0x20810b6f00112a1a, double:4.067996813472926E-152)
            java.lang.Boolean r13 = X.AnonymousClass7TF.A0R(r6, r2, r4)
            r11 = 0
            r14 = r11
            r15 = r11
            r16 = r11
            r22 = r11
            r24 = r23
            r25 = r23
            r21 = r8
            r20 = r0
            r19 = r7
            r18 = r9
            r17 = r10
            X.3tC r4 = X.C71152OeO.A06(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.String r0 = r1.text_
            int r0 = X.C66580MXl.A06(r0)
            if (r0 <= 0) goto L_0x00fe
            X.2FW r2 = X.2FW.A1g
            java.lang.String r0 = r1.text_
            r3.A18(r2, r0)
        L_0x00fe:
            java.util.List r1 = X.AnonymousClass7TE.A1I(r4)
            X.2FW r0 = X.2FW.A1s
            r3.A17(r0, r1)
            return
        L_0x0108:
            r4 = r5 & 1
            if (r4 == 0) goto L_0x0124
            com.instagram.direct.armadilloexpress.transportpayload.ImageUrl r4 = r7.linkImageUrl_
            if (r4 != 0) goto L_0x0112
            com.instagram.direct.armadilloexpress.transportpayload.ImageUrl r4 = com.instagram.direct.armadilloexpress.transportpayload.ImageUrl.DEFAULT_INSTANCE
        L_0x0112:
            X.0qQ.A07(r4)
            java.lang.String r6 = r4.url_
            X.0qQ.A07(r6)
            int r5 = r4.width_
            int r4 = r4.height_
            com.instagram.model.mediasize.ExtendedImageUrl r12 = new com.instagram.model.mediasize.ExtendedImageUrl
            r12.<init>(r6, r5, r4)
            goto L_0x00ae
        L_0x0124:
            r12 = r0
            goto L_0x00ae
        L_0x0126:
            r6 = r0
            goto L_0x007c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70059Nwb.A00(com.instagram.common.session.UserSession, com.instagram.direct.armadilloexpress.transportpayload.Link, X.3su, java.lang.Long, java.lang.String):void");
    }
}
