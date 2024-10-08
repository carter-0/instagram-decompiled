package X;

/* renamed from: X.9z8  reason: invalid class name */
public abstract class AnonymousClass9z8 {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ef, code lost:
        r2.A01 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f1, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f2, code lost:
        X.0wb.A03("DirectCameraReplyUtil", X.002.A0R("Missing reel items for: ", r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f9, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x012c, code lost:
        if (r4 != null) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x012e, code lost:
        r2.A00 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0130, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x017b, code lost:
        if (r1 != null) goto L_0x0148;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C39719A6k A00(com.instagram.common.session.UserSession r6, com.instagram.common.typedurl.ImageUrl r7, X.C254743sy r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, int r12) {
        /*
            r5 = 0
            X.A6k r2 = new X.A6k
            r2.<init>()
            int r0 = r9.hashCode()
            r1 = -1
            switch(r0) {
                case -845287334: goto L_0x006a;
                case -655359495: goto L_0x005c;
                case 365507017: goto L_0x0052;
                case 1457737947: goto L_0x0044;
                case 1760847965: goto L_0x003a;
                case 1900079364: goto L_0x002c;
                case 1945547306: goto L_0x0022;
                default: goto L_0x000e;
            }
        L_0x000e:
            java.lang.String r4 = "Missing reel items for: "
            java.lang.String r3 = "DirectCameraReplyUtil"
            switch(r1) {
                case 0: goto L_0x00c2;
                case 1: goto L_0x00fa;
                case 2: goto L_0x00fa;
                case 3: goto L_0x00fa;
                case 4: goto L_0x009a;
                case 5: goto L_0x0078;
                case 6: goto L_0x009a;
                default: goto L_0x0015;
            }
        L_0x0015:
            java.lang.String r1 = "ReplyType "
            java.lang.String r0 = " not supported"
            java.lang.String r0 = X.002.A0g(r1, r9, r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x0022:
            java.lang.String r0 = "story_remix_reply"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x000e
            r1 = 6
            goto L_0x000e
        L_0x002c:
            r0 = 3159(0xc57, float:4.427E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x000e
            r1 = 5
            goto L_0x000e
        L_0x003a:
            java.lang.String r0 = "story_selfie_reply"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x000e
            r1 = 4
            goto L_0x000e
        L_0x0044:
            r0 = 3121(0xc31, float:4.373E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x000e
            r1 = 3
            goto L_0x000e
        L_0x0052:
            java.lang.String r0 = "expiring_media_message"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x000e
            r1 = 2
            goto L_0x000e
        L_0x005c:
            r0 = 3015(0xbc7, float:4.225E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x000e
            r1 = 1
            goto L_0x000e
        L_0x006a:
            r0 = 1850(0x73a, float:2.592E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x000e
            r1 = 0
            goto L_0x000e
        L_0x0078:
            if (r8 == 0) goto L_0x0130
            X.2Dm r1 = X.1bJ.A00(r6)
            com.instagram.model.direct.DirectThreadKey r0 = X.C66647MaG.A03(r8)
            X.3su r0 = r1.BRz(r0, r10)
            if (r0 == 0) goto L_0x0130
            java.lang.Object r0 = r0.A1T
            X.JwG r0 = (X.C61078JwG) r0
            if (r0 == 0) goto L_0x0130
            java.lang.Object r0 = r0.A00
            com.instagram.user.model.ProductDetailsProductItemDict r0 = (com.instagram.user.model.ProductDetailsProductItemDict) r0
            com.instagram.user.model.Product r0 = X.C14502TxO.A00(r0)
            com.instagram.model.mediasize.ImageInfo r4 = r0.A07
            goto L_0x012e
        L_0x009a:
            if (r11 == 0) goto L_0x0130
            com.instagram.reels.store.ReelStore r0 = X.1OP.A05(r6)
            com.instagram.model.reels.Reel r1 = r0.A0M(r11)
            if (r1 == 0) goto L_0x00f2
            X.3uh r0 = r1.A0A(r6, r12)
            if (r0 == 0) goto L_0x00f2
            X.3uh r0 = r1.A0A(r6, r12)
            X.1Xj r0 = r0.A0b
            if (r0 == 0) goto L_0x00f2
            X.3uh r0 = r1.A0A(r6, r12)
            X.1Xj r1 = r0.A0b
            r0 = 1
            r2.A02 = r0
            java.lang.String r0 = r1.getId()
            goto L_0x00ef
        L_0x00c2:
            if (r11 == 0) goto L_0x0130
            com.instagram.reels.store.ReelStore r0 = X.1OP.A05(r6)
            com.instagram.model.reels.Reel r1 = r0.A0M(r11)
            if (r1 == 0) goto L_0x00f2
            X.3uh r0 = r1.A0A(r6, r12)
            if (r0 == 0) goto L_0x00f2
            X.3uh r0 = r1.A0A(r6, r12)
            X.1Xj r0 = r0.A0b
            if (r0 == 0) goto L_0x00f2
            X.3uh r0 = r1.A0A(r6, r12)
            X.1Xj r1 = r0.A0b
            com.instagram.model.mediasize.ImageInfo r0 = r1.A1p()
            r2.A00 = r0
            r0 = 0
            r2.A02 = r0
            java.lang.String r0 = r1.A30()
        L_0x00ef:
            r2.A01 = r0
            return r2
        L_0x00f2:
            java.lang.String r0 = X.002.A0R(r4, r9)
            X.0wb.A03(r3, r0)
            return r2
        L_0x00fa:
            if (r10 == 0) goto L_0x0130
            X.2Dm r1 = X.1bJ.A00(r6)
            com.instagram.model.direct.DirectThreadKey r0 = X.C66647MaG.A03(r8)
            X.3su r3 = r1.BRz(r0, r10)
            if (r3 == 0) goto L_0x0130
            X.2FW r1 = r3.A10
            X.2FW r0 = X.2FW.A0q
            if (r1 != r0) goto L_0x0131
            X.4ik r0 = r3.A0e
            if (r0 == 0) goto L_0x0116
            X.4iq r5 = r0.A04
        L_0x0116:
            r0 = 1
            r2.A03 = r0
            java.lang.String r1 = r3.A0j()
            java.lang.String r0 = "replayable"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0128
            r0 = 0
            r2.A02 = r0
        L_0x0128:
            if (r5 == 0) goto L_0x0130
            com.instagram.model.mediasize.ImageInfo r4 = r5.A06
        L_0x012c:
            if (r4 == 0) goto L_0x0130
        L_0x012e:
            r2.A00 = r4
        L_0x0130:
            return r2
        L_0x0131:
            X.2FW r0 = X.2FW.A1y
            if (r1 == r0) goto L_0x0139
            X.2FW r0 = X.2FW.A0p
            if (r1 != r0) goto L_0x014d
        L_0x0139:
            X.4ik r0 = r3.A0Q()
            if (r0 == 0) goto L_0x014d
            X.4ik r0 = r3.A0Q()
            X.1Xj r1 = r0.A05
            r1.getClass()
        L_0x0148:
            com.instagram.model.mediasize.ImageInfo r4 = r1.A1p()
            goto L_0x012c
        L_0x014d:
            boolean r0 = r3.A1a()
            if (r0 == 0) goto L_0x0173
            if (r7 == 0) goto L_0x0130
            java.lang.String r4 = r7.getUrl()
            int r3 = r7.getWidth()
            int r1 = r7.getHeight()
            com.instagram.model.mediasize.ExtendedImageUrl r0 = new com.instagram.model.mediasize.ExtendedImageUrl
            r0.<init>(r4, r3, r1)
            java.util.List r8 = X.AnonymousClass7TE.A1I(r0)
            com.instagram.model.mediasize.ImageInfoImpl r4 = new com.instagram.model.mediasize.ImageInfoImpl
            r6 = r5
            r7 = r5
            r9 = r5
            r4.<init>(r5, r6, r7, r8, r9)
            goto L_0x012e
        L_0x0173:
            java.lang.Object r1 = r3.A1T
            boolean r0 = r1 instanceof X.1Xj
            if (r0 == 0) goto L_0x017e
            X.1Xj r1 = (X.1Xj) r1
        L_0x017b:
            if (r1 == 0) goto L_0x0130
            goto L_0x0148
        L_0x017e:
            X.1Xj r1 = r3.A0T()
            goto L_0x017b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9z8.A00(com.instagram.common.session.UserSession, com.instagram.common.typedurl.ImageUrl, X.3sy, java.lang.String, java.lang.String, java.lang.String, int):X.A6k");
    }
}
