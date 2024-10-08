package com.facebook.avatar.expresso.odr.assetdownloader.ig;

import X.0nV;
import X.AnonymousClass12T;
import X.JTP;

public final class IgODRAssetDownloader {
    public static final IgODRAssetDownloader A00 = new Object();
    public static final 0nV A01 = JTP.A0V(AnonymousClass12T.A00, 637710289);

    /* JADX WARNING: type inference failed for: r10v1, types: [X.ME0, X.4D7] */
    /* JADX WARNING: type inference failed for: r10v4 */
    /* JADX WARNING: type inference failed for: r10v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        if (X.AnonymousClass7TE.A1a(r1) == false) goto L_0x003a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bc A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl r15, com.facebook.avatar.expresso.graphql.asset.ODRAssetRepository r16, java.util.Map r17, X.AnonymousClass4D7 r18, X.C262094Cc r19) {
        /*
            r14 = this;
            r11 = r19
            r3 = 5
            r4 = r18
            boolean r0 = X.ME0.A02(r3, r4)
            if (r0 == 0) goto L_0x00fb
            r10 = r4
            X.ME0 r10 = (X.ME0) r10
            int r2 = r10.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00fb
            int r2 = r2 - r1
            r10.A00 = r2
        L_0x0019:
            java.lang.Object r1 = r10.A05
            X.1Hj r9 = X.1Hj.A02
            int r0 = r10.A00
            java.lang.String r13 = "Required value was null."
            r12 = 0
            r8 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            if (r0 == 0) goto L_0x003f
            if (r0 == r4) goto L_0x0060
            if (r0 == r3) goto L_0x009b
            if (r0 == r2) goto L_0x00bd
            if (r0 != r8) goto L_0x0102
            X.0eS.A00(r1)
        L_0x0033:
            boolean r0 = X.AnonymousClass7TE.A1a(r1)
            if (r0 == 0) goto L_0x003a
        L_0x0039:
            r12 = 1
        L_0x003a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)
            return r0
        L_0x003f:
            X.0eS.A00(r1)
            X.Kfr r0 = X.C62441Kfr.USER_SESSION
            r1 = r17
            java.lang.Object r5 = r1.get(r0)
            X.DbS.A1Z(r5)
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            r10.A01 = r15
            r10.A02 = r11
            r10.A03 = r5
            r10.A00 = r4
            r0 = r16
            java.lang.Object r1 = r0.A00(r10)
            if (r1 != r9) goto L_0x006f
            return r9
        L_0x0060:
            java.lang.Object r5 = r10.A03
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.Object r11 = r10.A02
            X.4Cc r11 = (X.C262094Cc) r11
            java.lang.Object r15 = r10.A01
            com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl r15 = (com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl) r15
            X.0eS.A00(r1)
        L_0x006f:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x003a
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0111
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r1 = r1.A00
            java.util.AbstractMap r1 = (java.util.AbstractMap) r1
            X.Kfz r0 = X.C62449Kfz.USER_MODEL_URL
            java.lang.String r6 = X.DbS.A0r(r0, r1)
            X.Kfz r0 = X.C62449Kfz.RENDER_CONFIG_HASH
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L_0x010c
            java.lang.String r0 = (java.lang.String) r0
            X.ME0.A00(r15, r11, r5, r6, r10)
            r10.A00 = r3
            java.lang.Object r1 = com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl.A01(r15, r0, r10)
            if (r1 != r9) goto L_0x00ae
            return r9
        L_0x009b:
            java.lang.Object r6 = r10.A04
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r10.A03
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.Object r11 = r10.A02
            X.4Cc r11 = (X.C262094Cc) r11
            java.lang.Object r15 = r10.A01
            com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl r15 = (com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl) r15
            X.0eS.A00(r1)
        L_0x00ae:
            r7 = r1
            java.io.File r7 = (java.io.File) r7
            X.ME0.A00(r11, r5, r6, r7, r10)
            r10.A00 = r2
            java.lang.Object r0 = com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl.A00(r15, r7, r10)
            if (r0 != r9) goto L_0x00d0
            return r9
        L_0x00bd:
            java.lang.Object r7 = r10.A04
            java.io.File r7 = (java.io.File) r7
            java.lang.Object r6 = r10.A03
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r10.A02
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.Object r11 = r10.A01
            X.4Cc r11 = (X.C262094Cc) r11
            X.0eS.A00(r1)
        L_0x00d0:
            boolean r0 = r7.exists()
            if (r0 == 0) goto L_0x00e2
            long r3 = r7.length()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e2
            goto L_0x0039
        L_0x00e2:
            com.facebook.avatar.expresso.odr.network.ODRNetworkDownloader r1 = new com.facebook.avatar.expresso.odr.network.ODRNetworkDownloader
            r1.<init>(r11)
            if (r6 == 0) goto L_0x0107
            r0 = 0
            r10.A01 = r0
            r10.A02 = r0
            r10.A03 = r0
            r10.A04 = r0
            r10.A00 = r8
            java.lang.Object r1 = r1.A00(r5, r7, r6, r10)
            if (r1 != r9) goto L_0x0033
            return r9
        L_0x00fb:
            X.ME0 r10 = new X.ME0
            r10.<init>(r14, r4, r3)
            goto L_0x0019
        L_0x0102:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0107:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r13)
            throw r0
        L_0x010c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r13)
            throw r0
        L_0x0111:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.expresso.odr.assetdownloader.ig.IgODRAssetDownloader.A00(com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl, com.facebook.avatar.expresso.graphql.asset.ODRAssetRepository, java.util.Map, X.4D7, X.4Cc):java.lang.Object");
    }
}
