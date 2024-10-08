package com.instagram.barcelona.weblink;

import X.0bY;
import X.1Q7;
import X.C63596Kzj;
import com.instagram.common.session.UserSession;

public final class WebLinkUseCase {
    public final C63596Kzj A00 = new C63596Kzj();
    public final UserSession A01;
    public final 0bY A02 = new 1Q7("IgSecureUriParser").A00;

    /* JADX WARNING: type inference failed for: r10v1, types: [X.MDJ, X.4D7] */
    /* JADX WARNING: type inference failed for: r10v6 */
    /* JADX WARNING: type inference failed for: r10v7 */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0133, code lost:
        if (X.182.A06(r2, r5, 36322400983525517L) == false) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0144, code lost:
        if (X.182.A06(r2, r5, 36322400983525517L) == false) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0155, code lost:
        if (X.182.A06(r2, r5, 36322400983459980L) == false) goto L_0x0157;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(android.content.Context r23, X.2EG r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, X.AnonymousClass4D7 r28, long r29) {
        /*
            r22 = this;
            r5 = r28
            r6 = r25
            r9 = r27
            r7 = r26
            r8 = r24
            r3 = r29
            boolean r0 = r5 instanceof X.MDJ
            r11 = r22
            if (r0 == 0) goto L_0x01e2
            r10 = r5
            X.MDJ r10 = (X.MDJ) r10
            int r2 = r10.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x01e2
            int r2 = r2 - r1
            r10.A00 = r2
        L_0x0020:
            java.lang.Object r14 = r10.A07
            X.1Hj r5 = X.1Hj.A02
            int r0 = r10.A00
            r2 = 2
            r13 = 1
            if (r0 == 0) goto L_0x007c
            if (r0 == r13) goto L_0x0061
            if (r0 != r2) goto L_0x01e9
            long r3 = r10.A01
            java.lang.Object r8 = r10.A04
            X.2EG r8 = (X.2EG) r8
            java.lang.Object r7 = r10.A03
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r1 = r10.A02
            com.instagram.barcelona.weblink.WebLinkUseCase r1 = (com.instagram.barcelona.weblink.WebLinkUseCase) r1
            X.0eS.A00(r14)
        L_0x003f:
            X.3Ii r14 = (X.C239803Ii) r14
            boolean r0 = r14 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0184
            X.Kzj r1 = r1.A00
            X.3Ih r14 = (X.C239793Ih) r14
            java.lang.Object r9 = r14.A00
            java.lang.String r9 = (java.lang.String) r9
        L_0x004d:
            X.Jxv r14 = new X.Jxv
            r15 = r8
            r16 = r9
            r17 = r7
            r18 = r3
            r14.<init>(r15, r16, r17, r18)
        L_0x0059:
            X.5Oz r0 = r1.A00
            r0.Epw(r14)
        L_0x005e:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0061:
            long r3 = r10.A01
            java.lang.Object r9 = r10.A06
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r10.A05
            X.2EG r8 = (X.2EG) r8
            java.lang.Object r7 = r10.A04
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r10.A03
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r12 = r10.A02
            com.instagram.barcelona.weblink.WebLinkUseCase r12 = (com.instagram.barcelona.weblink.WebLinkUseCase) r12
            X.0eS.A00(r14)
            goto L_0x00fc
        L_0x007c:
            X.0eS.A00(r14)
            int r0 = r6.length()
            if (r0 == 0) goto L_0x01d3
            X.0bY r0 = r11.A02
            android.net.Uri r0 = X.0cp.A01(r0, r6)
            if (r0 == 0) goto L_0x01d3
            java.lang.String r1 = "android.intent.action.VIEW"
            android.content.Intent r12 = new android.content.Intent
            r12.<init>(r1, r0)
            r1 = 65536(0x10000, float:9.18355E-41)
            android.content.Intent r15 = r12.setFlags(r1)
            X.0qQ.A07(r15)
            r1 = r23
            int r12 = X.0oI.A00(r1, r15)
            if (r12 == 0) goto L_0x01ca
            if (r12 == r13) goto L_0x01b6
            if (r12 == r2) goto L_0x00c7
            r0 = 3
            X.Kzj r1 = r11.A00
            if (r12 != r0) goto L_0x01b9
            r0 = 74
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r15.setPackage(r0)
            X.Jxw r14 = new X.Jxw
            r16 = r8
            r17 = r6
            r18 = r7
            r19 = r2
            r20 = r3
            r14.<init>(r15, r16, r17, r18, r19, r20)
            goto L_0x0059
        L_0x00c7:
            com.instagram.common.session.UserSession r12 = r11.A01
            X.0Tu r14 = X.0Tu.A05
            r0 = 36322400983328906(0x810b080000288a, double:3.033770868201875E-306)
            boolean r0 = X.182.A06(r14, r12, r0)
            java.lang.String r14 = "text_post_app"
            if (r0 == 0) goto L_0x018e
            java.lang.Class<com.instagram.barcelona.weblink.data.FetchLinkMetadataCache> r2 = com.instagram.barcelona.weblink.data.FetchLinkMetadataCache.class
            r1 = 33
            X.IwG r0 = new X.IwG
            r0.<init>((java.lang.Object) r12, (int) r1)
            java.lang.Object r0 = r12.A01(r2, r0)
            com.instagram.barcelona.weblink.data.FetchLinkMetadataCache r0 = (com.instagram.barcelona.weblink.data.FetchLinkMetadataCache) r0
            r10.A02 = r11
            r10.A03 = r6
            r10.A04 = r7
            r10.A05 = r8
            r10.A06 = r9
            r10.A01 = r3
            r10.A00 = r13
            java.lang.Object r14 = r0.A00(r6, r14, r10)
            if (r14 == r5) goto L_0x01f8
            r12 = r11
        L_0x00fc:
            X.3Ii r14 = (X.C239803Ii) r14
            boolean r0 = r14 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x017d
            X.3Ih r14 = (X.C239793Ih) r14
            java.lang.Object r11 = r14.A00
            X.JV7 r11 = (X.JV7) r11
            java.lang.Object r10 = r11.A00
            com.instagram.api.schemas.IntegrityInterstitialType r10 = (com.instagram.api.schemas.IntegrityInterstitialType) r10
            java.lang.String r13 = r11.A02
            if (r10 == 0) goto L_0x0174
            com.instagram.common.session.UserSession r5 = r12.A01
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322400983394443(0x810b080001288b, double:3.033770868243321E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x0174
            com.instagram.api.schemas.IntegrityInterstitialType r0 = com.instagram.api.schemas.IntegrityInterstitialType.WARN_USER
            boolean r16 = X.AnonymousClass7TF.A1W(r10, r0)
            com.instagram.api.schemas.IntegrityInterstitialType r0 = com.instagram.api.schemas.IntegrityInterstitialType.COHORT_BLOCK_CA
            if (r10 != r0) goto L_0x0135
            r0 = 36322400983525517(0x810b080003288d, double:3.0337708683262125E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            r15 = 1
            if (r0 != 0) goto L_0x0136
        L_0x0135:
            r15 = 0
        L_0x0136:
            com.instagram.api.schemas.IntegrityInterstitialType r0 = com.instagram.api.schemas.IntegrityInterstitialType.COHORT_BLOCK
            if (r10 != r0) goto L_0x0146
            r0 = 36322400983525517(0x810b080003288d, double:3.0337708683262125E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            r14 = 1
            if (r0 != 0) goto L_0x0147
        L_0x0146:
            r14 = 0
        L_0x0147:
            com.instagram.api.schemas.IntegrityInterstitialType r0 = com.instagram.api.schemas.IntegrityInterstitialType.BLOCK_ACCESS
            if (r10 != r0) goto L_0x0157
            r0 = 36322400983459980(0x810b080002288c, double:3.033770868284767E-306)
            boolean r1 = X.182.A06(r2, r5, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0158
        L_0x0157:
            r0 = 0
        L_0x0158:
            if (r16 != 0) goto L_0x0160
            if (r14 != 0) goto L_0x0160
            if (r0 != 0) goto L_0x0160
            if (r15 == 0) goto L_0x0174
        L_0x0160:
            X.Kzj r1 = r12.A00
            X.GpO r14 = new X.GpO
            r15 = r10
            r16 = r8
            r17 = r6
            r18 = r7
            r19 = r13
            r20 = r3
            r14.<init>(r15, r16, r17, r18, r19, r20)
            goto L_0x0059
        L_0x0174:
            java.lang.String r0 = r11.A01
            X.Kzj r1 = r12.A00
            if (r9 != 0) goto L_0x004d
            r9 = r0
            goto L_0x004d
        L_0x017d:
            boolean r0 = r14 instanceof X.C297815sO
            if (r0 == 0) goto L_0x01f3
            X.Kzj r1 = r12.A00
            goto L_0x018a
        L_0x0184:
            boolean r0 = r14 instanceof X.C297815sO
            if (r0 == 0) goto L_0x01ee
            X.Kzj r1 = r1.A00
        L_0x018a:
            X.LdF r14 = X.C64513LdF.A00
            goto L_0x0059
        L_0x018e:
            if (r27 != 0) goto L_0x01b2
            java.lang.Class<com.instagram.inappbrowser.helper.BrowserLinkshimUrlCache> r9 = com.instagram.inappbrowser.helper.BrowserLinkshimUrlCache.class
            r1 = 33
            X.MMi r0 = new X.MMi
            r0.<init>(r12, r1)
            java.lang.Object r0 = r12.A01(r9, r0)
            com.instagram.inappbrowser.helper.BrowserLinkshimUrlCache r0 = (com.instagram.inappbrowser.helper.BrowserLinkshimUrlCache) r0
            r10.A02 = r11
            r10.A03 = r7
            r10.A04 = r8
            r10.A01 = r3
            r10.A00 = r2
            java.lang.Object r14 = r0.A00(r6, r14, r10)
            if (r14 == r5) goto L_0x01f8
            r1 = r11
            goto L_0x003f
        L_0x01b2:
            X.Kzj r1 = r11.A00
            goto L_0x004d
        L_0x01b6:
            X.Kzj r1 = r11.A00
            r13 = 0
        L_0x01b9:
            X.Jxw r14 = new X.Jxw
            r20 = r3
            r18 = r7
            r19 = r13
            r17 = r6
            r16 = r8
            r14.<init>(r15, r16, r17, r18, r19, r20)
            goto L_0x0059
        L_0x01ca:
            X.Kzj r1 = r11.A00
            X.Jxu r14 = new X.Jxu
            r14.<init>(r0)
            goto L_0x0059
        L_0x01d3:
            X.Kzj r2 = r11.A00
            X.LdF r1 = X.C64513LdF.A00
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.5Oz r0 = r2.A00
            r0.Epw(r1)
            goto L_0x005e
        L_0x01e2:
            X.MDJ r10 = new X.MDJ
            r10.<init>(r11, r5)
            goto L_0x0020
        L_0x01e9:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x01ee:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x01f3:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x01f8:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.barcelona.weblink.WebLinkUseCase.A00(android.content.Context, X.2EG, java.lang.String, java.lang.String, java.lang.String, X.4D7, long):java.lang.Object");
    }

    public WebLinkUseCase(UserSession userSession) {
        this.A01 = userSession;
    }
}
