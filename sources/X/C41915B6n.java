package X;

/* renamed from: X.B6n  reason: case insensitive filesystem */
public abstract class C41915B6n {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v235, resolved type: com.instagram.api.schemas.AdFormatType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v245, resolved type: com.instagram.api.schemas.DynamicProductAdDisplayOption} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v269, resolved type: com.instagram.api.schemas.BrandedContentAdsPaidPartnershipLabelRemovalOption} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.XET parseFromJson(X.16F r128) {
        /*
            r0 = 0
            r2 = r128
            X.0qQ.A0B(r2, r0)
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            X.16L r0 = X.16L.A0D     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            r30 = 0
            if (r1 == r0) goto L_0x0014
            r2.A0z()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            return r30
        L_0x0014:
            r26 = r30
            r92 = r30
            r93 = r30
            r66 = r30
            r94 = r30
            r44 = r30
            r95 = r30
            r32 = r30
            r96 = r30
            r33 = r30
            r23 = r30
            r97 = r30
            r34 = r30
            r18 = r30
            r91 = r30
            r36 = r30
            r98 = r30
            r99 = r30
            r38 = r30
            r70 = r30
            r22 = r30
            r25 = r30
            r41 = r30
            r42 = r30
            r37 = r30
            r39 = r30
            r47 = r30
            r71 = r30
            r100 = r30
            r72 = r30
            r101 = r30
            r86 = r30
            r24 = r30
            r17 = r30
            r73 = r30
            r74 = r30
            r102 = r30
            r103 = r30
            r16 = r30
            r45 = r30
            r64 = r30
            r104 = r30
            r21 = r30
            r46 = r30
            r48 = r30
            r105 = r30
            r50 = r30
            r51 = r30
            r53 = r30
            r106 = r30
            r67 = r30
            r20 = r30
            r75 = r30
            r76 = r30
            r77 = r30
            r78 = r30
            r79 = r30
            r80 = r30
            r81 = r30
            r82 = r30
            r83 = r30
            r84 = r30
            r87 = r30
            r19 = r30
            r107 = r30
            r54 = r30
            r49 = r30
            r108 = r30
            r109 = r30
            r59 = r30
            r110 = r30
            r88 = r30
            r40 = r30
            r111 = r30
            r61 = r30
            r55 = r30
            r112 = r30
            r113 = r30
            r56 = r30
            r114 = r30
            r115 = r30
            r58 = r30
            r57 = r30
            r116 = r30
            r117 = r30
            r68 = r30
            r69 = r30
            r85 = r30
            r27 = r30
            r60 = r30
            r65 = r30
            r62 = r30
            r89 = r30
            r52 = r30
            r118 = r30
            r63 = r30
            r90 = r30
        L_0x00d6:
            X.16L r10 = r2.A1J()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            X.16L r1 = X.16L.A09     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            java.lang.String r28 = "tracking_token"
            java.lang.String r29 = "show_ad_choices"
            java.lang.String r15 = "link_hint_text"
            java.lang.String r14 = "label"
            java.lang.String r13 = "items"
            java.lang.String r12 = "is_demo"
            java.lang.String r11 = "ios_links"
            java.lang.String r9 = "hide_reasons_v2"
            java.lang.String r8 = "hide_flow_type"
            java.lang.String r7 = "cookies"
            java.lang.String r6 = "android_links"
            java.lang.String r5 = "ad_title"
            java.lang.String r4 = "ad_id"
            java.lang.String r3 = "ad_action"
            java.lang.String r0 = "AdMediaItemImpl"
            if (r10 == r1) goto L_0x0914
            java.lang.String r1 = r2.A0q()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            r2.A1J()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            java.lang.String r0 = "actor_id"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x011d
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 != r0) goto L_0x0117
            r92 = 0
            goto L_0x090f
        L_0x0117:
            java.lang.String r92 = r2.A1P()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x011d:
            boolean r0 = r3.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x012f
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 != r0) goto L_0x090b
            r93 = 0
            goto L_0x090f
        L_0x012f:
            java.lang.String r0 = "ad_disclaimer_info"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x013d
            X.3xY r66 = X.C45679D1e.parseFromJson(r2)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x013d:
            boolean r0 = r4.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x0155
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 != r0) goto L_0x014f
            r94 = 0
            goto L_0x090f
        L_0x014f:
            java.lang.String r94 = r2.A1P()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x0155:
            java.lang.String r0 = "ad_tag"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x0163
            X.3xa r44 = X.C2605846g.parseFromJson(r2)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x0163:
            boolean r0 = r5.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x017b
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 != r0) goto L_0x0175
            r95 = 0
            goto L_0x090f
        L_0x0175:
            java.lang.String r95 = r2.A1P()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x017b:
            java.lang.String r0 = "ads_shopping_info"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x0189
            X.3xc r32 = X.C45504Cxe.parseFromJson(r2)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x0189:
            java.lang.String r0 = "adtaxon_i18n_top1_l7_prediction"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x01a3
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 != r0) goto L_0x019d
            r96 = 0
            goto L_0x090f
        L_0x019d:
            java.lang.String r96 = r2.A1P()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x01a3:
            java.lang.String r0 = "afi_info"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x01b1
            X.3l1 r33 = X.C250163l0.parseFromJson(r2)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x01b1:
            boolean r0 = r6.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x01dc
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 != r0) goto L_0x01d8
            java.util.ArrayList r23 = new java.util.ArrayList     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            r23.<init>()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
        L_0x01c4:
            X.16L r1 = r2.A1J()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 == r0) goto L_0x090f
            com.instagram.model.androidlink.AndroidLinkImpl r1 = X.C250113kv.parseFromJson(r2)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 == 0) goto L_0x01c4
            r0 = r23
            r0.add(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x01c4
        L_0x01d8:
            r23 = 0
            goto L_0x090f
        L_0x01dc:
            java.lang.String r0 = "app_id"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x01f6
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 != r0) goto L_0x01f0
            r97 = 0
            goto L_0x090f
        L_0x01f0:
            java.lang.String r97 = r2.A1P()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x01f6:
            java.lang.String r0 = "appstore_metadata"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x0204
            com.instagram.api.schemas.AppstoreMetadataDictImpl r34 = X.AnonymousClass41U.parseFromJson(r2)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x0204:
            java.lang.String r0 = "bca_ppl_removal_option"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x022c
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 != r0) goto L_0x0216
            r0 = 0
            goto L_0x021a
        L_0x0216:
            java.lang.String r0 = r2.A1P()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
        L_0x021a:
            java.util.Map r1 = com.instagram.api.schemas.BrandedContentAdsPaidPartnershipLabelRemovalOption.A01     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            java.lang.Object r18 = r1.get(r0)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            r0 = r18
            com.instagram.api.schemas.BrandedContentAdsPaidPartnershipLabelRemovalOption r0 = (com.instagram.api.schemas.BrandedContentAdsPaidPartnershipLabelRemovalOption) r0     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            r18 = r0
            if (r0 != 0) goto L_0x090f
            com.instagram.api.schemas.BrandedContentAdsPaidPartnershipLabelRemovalOption r18 = com.instagram.api.schemas.BrandedContentAdsPaidPartnershipLabelRemovalOption.UNRECOGNIZED     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x022c:
            java.lang.String r0 = "brs_threshold"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x023e
            long r0 = r2.A0y()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            java.lang.Long r91 = java.lang.Long.valueOf(r0)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x023e:
            java.lang.String r0 = "buyer_incentive_feed"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x024c
            X.BE0 r36 = X.CVF.parseFromJson(r2)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x024c:
            java.lang.String r0 = "campaign_id"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x0266
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 != r0) goto L_0x0260
            r98 = 0
            goto L_0x090f
        L_0x0260:
            java.lang.String r98 = r2.A1P()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x0266:
            java.lang.String r0 = "carousel_parent_id"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x0280
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 != r0) goto L_0x027a
            r99 = 0
            goto L_0x090f
        L_0x027a:
            java.lang.String r99 = r2.A1P()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x0280:
            java.lang.String r0 = "carousel_rendering_configuration"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x028e
            X.493 r38 = X.CVR.parseFromJson(r2)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x028e:
            java.lang.String r0 = "client_gap_rules"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x029c
            X.2vo r70 = X.C250043ko.parseFromJson(r2)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x029c:
            boolean r0 = r7.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x02cf
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 != r0) goto L_0x02cb
            java.util.ArrayList r22 = new java.util.ArrayList     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            r22.<init>()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
        L_0x02af:
            X.16L r1 = r2.A1J()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 == r0) goto L_0x090f
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 == r0) goto L_0x02af
            java.lang.String r1 = r2.A1P()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 == 0) goto L_0x02af
            r0 = r22
            r0.add(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x02af
        L_0x02cb:
            r22 = 0
            goto L_0x090f
        L_0x02cf:
            java.lang.String r0 = "cop_render_output"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x02fc
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 != r0) goto L_0x02f8
            java.util.ArrayList r25 = new java.util.ArrayList     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            r25.<init>()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
        L_0x02e4:
            X.16L r1 = r2.A1J()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 == r0) goto L_0x090f
            X.3kq r1 = X.C250053kp.parseFromJson(r2)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 == 0) goto L_0x02e4
            r0 = r25
            r0.add(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x02e4
        L_0x02f8:
            r25 = 0
            goto L_0x090f
        L_0x02fc:
            java.lang.String r0 = "creative_transformations"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x030a
            X.3xg r41 = X.C300535xM.parseFromJson(r2)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x030a:
            java.lang.String r0 = "creative_transformations_v2"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x0318
            X.3xi r42 = X.C300545xN.parseFromJson(r2)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x0318:
            java.lang.String r0 = "cta_info"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x0326
            X.3xk r37 = X.C45517Cxr.parseFromJson(r2)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x0326:
            java.lang.String r0 = "ctj_ads_info"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x0334
            X.3l7 r39 = X.C250223l6.parseFromJson(r2)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x0334:
            java.lang.String r0 = "ctmessaging_ads_info"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x0342
            com.instagram.api.schemas.IGCTMessagingAdsInfoDict r47 = X.AnonymousClass548.parseFromJson(r2)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x0342:
            java.lang.String r0 = "direct_share"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x0354
            boolean r0 = r2.A0d()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            java.lang.Boolean r71 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x0354:
            java.lang.String r0 = "display_domain"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x036e
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 != r0) goto L_0x0368
            r100 = 0
            goto L_0x090f
        L_0x0368:
            java.lang.String r100 = r2.A1P()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x036e:
            java.lang.String r0 = "display_fb_page_name"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x0380
            boolean r0 = r2.A0d()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            java.lang.Boolean r72 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x0380:
            java.lang.String r0 = "dominant_color"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x039a
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 != r0) goto L_0x0394
            r101 = 0
            goto L_0x090f
        L_0x0394:
            java.lang.String r101 = r2.A1P()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x039a:
            java.lang.String r0 = "dr_ad_type"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x03ac
            int r0 = r2.A1D()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            java.lang.Integer r86 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x03ac:
            java.lang.String r0 = "dynamic_ads_links"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x03d9
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 != r0) goto L_0x03d5
            java.util.ArrayList r24 = new java.util.ArrayList     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            r24.<init>()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
        L_0x03c1:
            X.16L r1 = r2.A1J()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 == r0) goto L_0x090f
            X.BEd r1 = X.C45541CyF.parseFromJson(r2)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 == 0) goto L_0x03c1
            r0 = r24
            r0.add(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x03c1
        L_0x03d5:
            r24 = 0
            goto L_0x090f
        L_0x03d9:
            java.lang.String r0 = "dynamic_product_ad_display_option"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x0401
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 != r0) goto L_0x03eb
            r0 = 0
            goto L_0x03ef
        L_0x03eb:
            java.lang.String r0 = r2.A1P()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
        L_0x03ef:
            java.util.Map r1 = com.instagram.api.schemas.DynamicProductAdDisplayOption.A01     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            java.lang.Object r17 = r1.get(r0)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            r0 = r17
            com.instagram.api.schemas.DynamicProductAdDisplayOption r0 = (com.instagram.api.schemas.DynamicProductAdDisplayOption) r0     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            r17 = r0
            if (r0 != 0) goto L_0x090f
            com.instagram.api.schemas.DynamicProductAdDisplayOption r17 = com.instagram.api.schemas.DynamicProductAdDisplayOption.UNRECOGNIZED     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x0401:
            java.lang.String r0 = "enable_ads_follow_button"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x0413
            boolean r0 = r2.A0d()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            java.lang.Boolean r73 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x0413:
            java.lang.String r0 = "enable_reels_end_scene"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x0425
            boolean r0 = r2.A0d()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            java.lang.Boolean r74 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x0425:
            java.lang.String r0 = "fb_app_id"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x043f
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 != r0) goto L_0x0439
            r102 = 0
            goto L_0x090f
        L_0x0439:
            java.lang.String r102 = r2.A1P()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x043f:
            java.lang.String r0 = "fb_page_url"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x0459
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 != r0) goto L_0x0453
            r103 = 0
            goto L_0x090f
        L_0x0453:
            java.lang.String r103 = r2.A1P()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x0459:
            java.lang.String r0 = "format_type"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x0481
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 != r0) goto L_0x046b
            r0 = 0
            goto L_0x046f
        L_0x046b:
            java.lang.String r0 = r2.A1P()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
        L_0x046f:
            java.util.Map r1 = com.instagram.api.schemas.AdFormatType.A01     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            java.lang.Object r16 = r1.get(r0)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            r0 = r16
            com.instagram.api.schemas.AdFormatType r0 = (com.instagram.api.schemas.AdFormatType) r0     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            r16 = r0
            if (r0 != 0) goto L_0x090f
            com.instagram.api.schemas.AdFormatType r16 = com.instagram.api.schemas.AdFormatType.UNRECOGNIZED     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x0481:
            java.lang.String r0 = "gesture_to_action_info"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x048f
            X.3xp r45 = X.C41941B7s.parseFromJson(r2)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x048f:
            java.lang.String r0 = "headline"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x049d
            X.1bK r64 = X.AnonymousClass1Zw.parseFromJson(r2)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x049d:
            boolean r0 = r8.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x04ad
            int r0 = r2.A1D()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            java.lang.Integer r30 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x04ad:
            java.lang.String r0 = "hide_label"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x04c7
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 != r0) goto L_0x04c1
            r104 = 0
            goto L_0x090f
        L_0x04c1:
            java.lang.String r104 = r2.A1P()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x04c7:
            boolean r0 = r9.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x04f2
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 != r0) goto L_0x04ee
            java.util.ArrayList r21 = new java.util.ArrayList     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            r21.<init>()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
        L_0x04da:
            X.16L r1 = r2.A1J()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 == r0) goto L_0x090f
            X.3lA r1 = X.C250253l9.parseFromJson(r2)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 == 0) goto L_0x04da
            r0 = r21
            r0.add(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x04da
        L_0x04ee:
            r21 = 0
            goto L_0x090f
        L_0x04f2:
            java.lang.String r0 = "house_ad_context"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x0500
            X.BF2 r46 = X.CYY.parseFromJson(r2)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x0500:
            java.lang.String r0 = "iab_post_click_data"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x050e
            X.3lJ r48 = X.C250343lI.parseFromJson(r2)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x050e:
            java.lang.String r0 = "iaw_wca_exclusion_targeting_rule_oc"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x0528
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 != r0) goto L_0x0522
            r105 = 0
            goto L_0x090f
        L_0x0522:
            java.lang.String r105 = r2.A1P()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x0528:
            java.lang.String r0 = "ig_oops_survey_info"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x0536
            X.BFA r50 = X.CZD.parseFromJson(r2)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x0536:
            java.lang.String r0 = "ig_rf_survey_info"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x0544
            com.instagram.api.schemas.IGRFSurveyInfoDictImpl r51 = X.CZN.parseFromJson(r2)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x0544:
            java.lang.String r0 = "ig_transparency_and_control_disclaimer_data"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x0552
            X.5CY r53 = X.AnonymousClass5CU.parseFromJson(r2)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x0552:
            java.lang.String r0 = "interaction_timestamp"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x056c
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 != r0) goto L_0x0566
            r106 = 0
            goto L_0x090f
        L_0x0566:
            java.lang.String r106 = r2.A1P()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x056c:
            java.lang.String r0 = "invalidation_rules"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x057a
            X.3I1 r67 = X.C250373lL.parseFromJson(r2)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x057a:
            boolean r0 = r11.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x05a5
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 != r0) goto L_0x05a1
            java.util.ArrayList r20 = new java.util.ArrayList     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            r20.<init>()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
        L_0x058d:
            X.16L r1 = r2.A1J()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 == r0) goto L_0x090f
            X.BDq r1 = X.C44057CUa.parseFromJson(r2)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 == 0) goto L_0x058d
            r0 = r20
            r0.add(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x058d
        L_0x05a1:
            r20 = 0
            goto L_0x090f
        L_0x05a5:
            java.lang.String r0 = "is_app_mae_ad_exclusion_eligible"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x05b7
            boolean r0 = r2.A0d()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            java.lang.Boolean r75 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x05b7:
            java.lang.String r0 = "is_conversions_ad_with_upcoming_event"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x05c9
            boolean r0 = r2.A0d()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            java.lang.Boolean r76 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x05c9:
            java.lang.String r0 = "is_delayed_skip_ad"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x05db
            boolean r0 = r2.A0d()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            java.lang.Boolean r77 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x05db:
            boolean r0 = r12.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x05eb
            boolean r0 = r2.A0d()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            java.lang.Boolean r26 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x05eb:
            java.lang.String r0 = "is_ig_events_excluded_ad"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x05fd
            boolean r0 = r2.A0d()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            java.lang.Boolean r78 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x05fd:
            java.lang.String r0 = "is_luxury_vertical_ad"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x060f
            boolean r0 = r2.A0d()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            java.lang.Boolean r79 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x060f:
            java.lang.String r0 = "is_multi_ads_eligible"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x0621
            boolean r0 = r2.A0d()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            java.lang.Boolean r80 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x0621:
            java.lang.String r0 = "is_pharma_and_sensitive_vertical_ad"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x0633
            boolean r0 = r2.A0d()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            java.lang.Boolean r81 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x0633:
            java.lang.String r0 = "is_pharma_vertical_ad"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x0645
            boolean r0 = r2.A0d()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            java.lang.Boolean r82 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x0645:
            java.lang.String r0 = "is_rev_share"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x0657
            boolean r0 = r2.A0d()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            java.lang.Boolean r83 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x0657:
            java.lang.String r0 = "is_sensitive_vertical_ad"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x0669
            boolean r0 = r2.A0d()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            java.lang.Boolean r84 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x0669:
            java.lang.String r0 = "item_type"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x067b
            int r0 = r2.A1D()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            java.lang.Integer r87 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x067b:
            boolean r0 = r13.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x06a6
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 != r0) goto L_0x06a2
            java.util.ArrayList r19 = new java.util.ArrayList     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            r19.<init>()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
        L_0x068e:
            X.16L r1 = r2.A1J()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 == r0) goto L_0x090f
            X.1Xj r1 = X.1Xj.A00(r2)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 == 0) goto L_0x068e
            r0 = r19
            r0.add(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x068e
        L_0x06a2:
            r19 = 0
            goto L_0x090f
        L_0x06a6:
            boolean r0 = r14.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x06be
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 != r0) goto L_0x06b8
            r107 = 0
            goto L_0x090f
        L_0x06b8:
            java.lang.String r107 = r2.A1P()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x06be:
            java.lang.String r0 = "lead_gen_multi_ads_data"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x06cc
            X.BFd r54 = X.C44224Cal.parseFromJson(r2)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x06cc:
            java.lang.String r0 = "lead_gen_preclick_data"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x06da
            X.4zJ r49 = X.C279764zH.parseFromJson(r2)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x06da:
            boolean r0 = r15.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x06f2
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 != r0) goto L_0x06ec
            r108 = 0
            goto L_0x090f
        L_0x06ec:
            java.lang.String r108 = r2.A1P()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x06f2:
            java.lang.String r0 = "link_text"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x070c
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 != r0) goto L_0x0706
            r109 = 0
            goto L_0x090f
        L_0x0706:
            java.lang.String r109 = r2.A1P()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x070c:
            java.lang.String r0 = "media_background"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x071a
            X.3xy r59 = X.C271234iU.parseFromJson(r2)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x071a:
            java.lang.String r0 = "media_id"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x0734
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 != r0) goto L_0x072e
            r110 = 0
            goto L_0x090f
        L_0x072e:
            java.lang.String r110 = r2.A1P()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x0734:
            java.lang.String r0 = "media_type"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x0746
            int r0 = r2.A1D()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            java.lang.Integer r88 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x0746:
            java.lang.String r0 = "multi_ads_data"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x0754
            X.BEA r40 = X.C44088CVf.parseFromJson(r2)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x0754:
            java.lang.String r0 = "multi_ads_media_tap_destination"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x076e
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 != r0) goto L_0x0768
            r111 = 0
            goto L_0x090f
        L_0x0768:
            java.lang.String r111 = r2.A1P()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x076e:
            java.lang.String r0 = "music_info"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x077c
            X.3y3 r61 = X.C45627Czd.parseFromJson(r2)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x077c:
            java.lang.String r0 = "on_impressions_control"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x078a
            X.3y5 r55 = X.C278574x8.parseFromJson(r2)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x078a:
            java.lang.String r0 = "original_dominant_color"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x07a4
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 != r0) goto L_0x079e
            r112 = 0
            goto L_0x090f
        L_0x079e:
            java.lang.String r112 = r2.A1P()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x07a4:
            java.lang.String r0 = "overlay_ad_host_media_id"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x07be
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 != r0) goto L_0x07b8
            r113 = 0
            goto L_0x090f
        L_0x07b8:
            java.lang.String r113 = r2.A1P()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x07be:
            java.lang.String r0 = "overlay_ads_format"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x07cc
            X.4gF r56 = X.CbG.parseFromJson(r2)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x07cc:
            java.lang.String r0 = "overlay_subtitle"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x07e6
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 != r0) goto L_0x07e0
            r114 = 0
            goto L_0x090f
        L_0x07e0:
            java.lang.String r114 = r2.A1P()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x07e6:
            java.lang.String r0 = "page_id"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x0800
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 != r0) goto L_0x07fa
            r115 = 0
            goto L_0x090f
        L_0x07fa:
            java.lang.String r115 = r2.A1P()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x0800:
            java.lang.String r0 = "pcm"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x080e
            X.BFu r58 = X.C44251Cbm.parseFromJson(r2)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x080e:
            java.lang.String r0 = "political_context"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x081c
            X.5Ca r57 = X.AnonymousClass5CZ.parseFromJson(r2)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x081c:
            java.lang.String r0 = "primary_media_id"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x0836
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 != r0) goto L_0x0830
            r116 = 0
            goto L_0x090f
        L_0x0830:
            java.lang.String r116 = r2.A1P()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x0836:
            java.lang.String r0 = "primary_media_pk"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x0850
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 != r0) goto L_0x084a
            r117 = 0
            goto L_0x090f
        L_0x084a:
            java.lang.String r117 = r2.A1P()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x0850:
            java.lang.String r0 = "reels_mid_scene_info"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x085e
            X.3y9 r68 = X.C56349Hx0.parseFromJson(r2)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x085e:
            java.lang.String r0 = "reels_multi_ads_info"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x086c
            X.3yB r69 = X.C45094CqC.parseFromJson(r2)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x086c:
            java.lang.String r0 = "should_fetch_preview_comments"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x087e
            boolean r0 = r2.A0d()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            java.lang.Boolean r85 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x087e:
            r0 = r29
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x0890
            boolean r0 = r2.A0d()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            java.lang.Boolean r27 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x0890:
            java.lang.String r0 = "sponsored_ad_disclaimer"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x089d
            X.3yE r60 = X.C255133td.parseFromJson(r2)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x089d:
            java.lang.String r0 = "testimonial_data"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x08aa
            X.1bK r65 = X.AnonymousClass1Zw.parseFromJson(r2)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x08aa:
            java.lang.String r0 = "testimonial_data_v2"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x08b7
            com.instagram.api.schemas.TestimonialDictImpl r62 = X.C44514CgA.parseFromJson(r2)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x08b7:
            java.lang.String r0 = "testimonial_variant"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x08c8
            int r0 = r2.A1D()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            java.lang.Integer r89 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x08c8:
            java.lang.String r0 = "text_overlay"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x08d5
            X.BFC r52 = X.CZP.parseFromJson(r2)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x08d5:
            r0 = r28
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x08ed
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 != r0) goto L_0x08e8
            r118 = 0
            goto L_0x090f
        L_0x08e8:
            java.lang.String r118 = r2.A1P()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x08ed:
            java.lang.String r0 = "urp_card_transformation"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x08fa
            X.3yI r63 = X.D0H.parseFromJson(r2)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x08fa:
            java.lang.String r0 = "view_state_item_type"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r0 == 0) goto L_0x090f
            int r0 = r2.A1D()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            java.lang.Integer r90 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x090f
        L_0x090b:
            java.lang.String r93 = r2.A1P()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
        L_0x090f:
            r2.A0z()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x00d6
        L_0x0914:
            if (r93 != 0) goto L_0x091f
            boolean r1 = r2 instanceof X.0c9     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 == 0) goto L_0x091f
            X.AnonymousClass7TF.A1L(r3, r2, r0)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x09a5
        L_0x091f:
            if (r94 != 0) goto L_0x0922
            goto L_0x099e
        L_0x0922:
            if (r95 != 0) goto L_0x092c
            boolean r1 = r2 instanceof X.0c9     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 == 0) goto L_0x092c
            X.AnonymousClass7TF.A1L(r5, r2, r0)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x09a5
        L_0x092c:
            if (r23 != 0) goto L_0x0936
            boolean r1 = r2 instanceof X.0c9     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 == 0) goto L_0x0936
            X.AnonymousClass7TF.A1L(r6, r2, r0)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x09a5
        L_0x0936:
            if (r22 != 0) goto L_0x0940
            boolean r1 = r2 instanceof X.0c9     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 == 0) goto L_0x0940
            X.AnonymousClass7TF.A1L(r7, r2, r0)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x09a5
        L_0x0940:
            if (r30 != 0) goto L_0x094a
            boolean r1 = r2 instanceof X.0c9     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 == 0) goto L_0x094a
            X.AnonymousClass7TF.A1L(r8, r2, r0)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x09a5
        L_0x094a:
            if (r21 != 0) goto L_0x0954
            boolean r1 = r2 instanceof X.0c9     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 == 0) goto L_0x0954
            X.AnonymousClass7TF.A1L(r9, r2, r0)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x09a5
        L_0x0954:
            if (r20 != 0) goto L_0x095e
            boolean r1 = r2 instanceof X.0c9     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 == 0) goto L_0x095e
            X.AnonymousClass7TF.A1L(r11, r2, r0)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x09a5
        L_0x095e:
            if (r26 != 0) goto L_0x0968
            boolean r1 = r2 instanceof X.0c9     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 == 0) goto L_0x0968
            X.AnonymousClass7TF.A1L(r12, r2, r0)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x09a5
        L_0x0968:
            if (r19 != 0) goto L_0x0972
            boolean r1 = r2 instanceof X.0c9     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 == 0) goto L_0x0972
            X.AnonymousClass7TF.A1L(r13, r2, r0)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x09a5
        L_0x0972:
            if (r107 != 0) goto L_0x097c
            boolean r1 = r2 instanceof X.0c9     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 == 0) goto L_0x097c
            X.AnonymousClass7TF.A1L(r14, r2, r0)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x09a5
        L_0x097c:
            if (r108 != 0) goto L_0x0986
            boolean r1 = r2 instanceof X.0c9     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 == 0) goto L_0x0986
            X.AnonymousClass7TF.A1L(r15, r2, r0)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x09a5
        L_0x0986:
            if (r27 != 0) goto L_0x0992
            boolean r1 = r2 instanceof X.0c9     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 == 0) goto L_0x0992
            r1 = r29
            X.AnonymousClass7TF.A1L(r1, r2, r0)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x09a5
        L_0x0992:
            if (r118 != 0) goto L_0x09aa
            boolean r1 = r2 instanceof X.0c9     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 == 0) goto L_0x09aa
            r1 = r28
            X.AnonymousClass7TF.A1L(r1, r2, r0)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            goto L_0x09a5
        L_0x099e:
            boolean r1 = r2 instanceof X.0c9     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            if (r1 == 0) goto L_0x0922
            X.AnonymousClass7TF.A1L(r4, r2, r0)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
        L_0x09a5:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            throw r0     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
        L_0x09aa:
            int r126 = r30.intValue()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            boolean r127 = r26.booleanValue()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            boolean r128 = r27.booleanValue()     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            X.XET r30 = new X.XET     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            r31 = r16
            r35 = r18
            r43 = r17
            r119 = r23
            r120 = r22
            r121 = r25
            r122 = r24
            r123 = r21
            r124 = r20
            r125 = r19
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108, r109, r110, r111, r112, r113, r114, r115, r116, r117, r118, r119, r120, r121, r122, r123, r124, r125, r126, r127, r128)     // Catch:{ IOException -> 0x09d6, Exception -> 0x09d0 }
            return r30
        L_0x09d0:
            r0 = move-exception
            X.1Pf r0 = X.AnonymousClass7TE.A0j(r0)
            throw r0
        L_0x09d6:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41915B6n.parseFromJson(X.16F):X.XET");
    }
}
