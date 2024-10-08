package X;

/* renamed from: X.8vr  reason: invalid class name and case insensitive filesystem */
public abstract class C370118vr {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r0v3, types: [com.instagram.reels.fragment.model.ReelMoreOptionsModel, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.instagram.reels.fragment.model.ReelMoreOptionsModel parseFromJson(X.16F r4) {
        /*
            r0 = 0
            X.0qQ.A0B(r4, r0)
            com.instagram.reels.fragment.model.ReelMoreOptionsModel r0 = new com.instagram.reels.fragment.model.ReelMoreOptionsModel     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            r0.<init>()     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            X.16L r1 = X.16L.A0D     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            if (r2 == r1) goto L_0x0016
            r4.A0z()     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            goto L_0x0191
        L_0x0016:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            X.16L r1 = X.16L.A09     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            if (r2 == r1) goto L_0x0192
            java.lang.String r2 = r4.A0q()     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            r4.A1J()     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            java.lang.String r1 = "more_option_type"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            if (r1 == 0) goto L_0x0047
            int r1 = r4.A1D()     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            java.util.Map r1 = X.AnonymousClass8CA.A01     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            X.8CA r1 = (X.AnonymousClass8CA) r1     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            if (r1 != 0) goto L_0x0041
            X.8CA r1 = X.AnonymousClass8CA.NONE     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
        L_0x0041:
            r0.A09 = r1     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
        L_0x0043:
            r4.A0z()     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            goto L_0x0016
        L_0x0047:
            java.lang.String r1 = "web_link_url"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            r3 = 0
            if (r1 == 0) goto L_0x005f
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            if (r2 == r1) goto L_0x005c
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
        L_0x005c:
            r0.A0C = r3     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            goto L_0x0043
        L_0x005f:
            java.lang.String r1 = "igtv_media_id"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            if (r1 == 0) goto L_0x0076
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            if (r2 == r1) goto L_0x0073
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
        L_0x0073:
            r0.A0B = r3     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            goto L_0x0043
        L_0x0076:
            java.lang.String r1 = "ar_effect_id"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            if (r1 == 0) goto L_0x008d
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            if (r2 == r1) goto L_0x008a
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
        L_0x008a:
            r0.A0A = r3     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            goto L_0x0043
        L_0x008d:
            java.lang.String r1 = "profile_shop_link"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            if (r1 == 0) goto L_0x009c
            com.instagram.model.shopping.reels.ProfileShopLink r1 = X.C45689D1o.parseFromJson(r4)     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            r0.A06 = r1     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            goto L_0x0043
        L_0x009c:
            java.lang.String r1 = "instagram_shop_link"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            if (r1 == 0) goto L_0x00ab
            com.instagram.model.shopping.reels.InstagramShopLink r1 = X.A0X.parseFromJson(r4)     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            r0.A03 = r1     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            goto L_0x0043
        L_0x00ab:
            java.lang.String r1 = "incentive_product_collection_link"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            if (r1 == 0) goto L_0x00ba
            com.instagram.model.shopping.reels.ProductCollectionLink r1 = X.C45686D1l.parseFromJson(r4)     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            r0.A04 = r1     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            goto L_0x0043
        L_0x00ba:
            java.lang.String r1 = "product_collection_link"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            if (r1 == 0) goto L_0x00ca
            com.instagram.model.shopping.reels.ProductCollectionLink r1 = X.C45686D1l.parseFromJson(r4)     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            r0.A05 = r1     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            goto L_0x0043
        L_0x00ca:
            java.lang.String r1 = "product_link"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            if (r1 == 0) goto L_0x00da
            com.instagram.model.shopping.reels.ReelProductLink r1 = X.C44941Cnb.parseFromJson(r4)     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            r0.A08 = r1     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            goto L_0x0043
        L_0x00da:
            java.lang.String r1 = "products_link"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            if (r1 == 0) goto L_0x00ea
            com.instagram.model.shopping.reels.ReelMultiProductLink r1 = X.C45690D1p.parseFromJson(r4)     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            r0.A07 = r1     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            goto L_0x0043
        L_0x00ea:
            java.lang.String r1 = "media_gating_info"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            if (r1 == 0) goto L_0x00fa
            com.instagram.api.schemas.BrandedContentGatingInfo r1 = X.C45512Cxm.parseFromJson(r4)     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            r0.A00 = r1     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            goto L_0x0043
        L_0x00fa:
            java.lang.String r1 = "branded_content_tags"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            if (r1 == 0) goto L_0x0125
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            if (r2 != r1) goto L_0x0121
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            r3.<init>()     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
        L_0x010f:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            if (r2 == r1) goto L_0x0121
            com.instagram.pendingmedia.model.BrandedContentTag r1 = X.LJX.parseFromJson(r4)     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            if (r1 == 0) goto L_0x010f
            r3.add(r1)     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            goto L_0x010f
        L_0x0121:
            r0.A0D = r3     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            goto L_0x0043
        L_0x0125:
            java.lang.String r1 = "branded_content_project_metadata"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            if (r1 == 0) goto L_0x0135
            com.instagram.api.schemas.BrandedContentProjectMetadata r1 = X.LGt.parseFromJson(r4)     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            r0.A01 = r1     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            goto L_0x0043
        L_0x0135:
            java.lang.String r1 = "is_paid_partnership_label"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            if (r1 == 0) goto L_0x0145
            boolean r1 = r4.A0d()     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            r0.A0H = r1     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            goto L_0x0043
        L_0x0145:
            java.lang.String r1 = "create_pa_boost_post_access_token"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            if (r1 == 0) goto L_0x0155
            boolean r1 = r4.A0d()     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            r0.A0E = r1     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            goto L_0x0043
        L_0x0155:
            java.lang.String r1 = "is_ads_mode"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            if (r1 == 0) goto L_0x0165
            boolean r1 = r4.A0d()     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            r0.A0G = r1     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            goto L_0x0043
        L_0x0165:
            java.lang.String r1 = "has_ads_mode_changed"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            if (r1 == 0) goto L_0x0175
            boolean r1 = r4.A0d()     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            r0.A0F = r1     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            goto L_0x0043
        L_0x0175:
            java.lang.String r1 = "gen_ai_detection_method"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            if (r1 == 0) goto L_0x0043
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            if (r2 == r1) goto L_0x0189
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
        L_0x0189:
            com.instagram.api.schemas.MediaGenAIDetectionMethod r1 = X.C252913pu.A00(r3)     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            r0.A02 = r1     // Catch:{ IOException -> 0x019a, Exception -> 0x0193 }
            goto L_0x0043
        L_0x0191:
            r0 = 0
        L_0x0192:
            return r0
        L_0x0193:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x019a:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C370118vr.parseFromJson(X.16F):com.instagram.reels.fragment.model.ReelMoreOptionsModel");
    }
}
