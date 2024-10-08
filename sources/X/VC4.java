package X;

public abstract class VC4 {
    /* JADX WARNING: type inference failed for: r7v5, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r7v6, types: [com.facebook.pando.TreeJNI] */
    /* JADX WARNING: type inference failed for: r0v67, types: [com.facebook.pando.TreeJNI] */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0075, code lost:
        if (r2 != 6) goto L_0x0077;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x034c  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x02b3  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A00(android.app.Activity r35, android.content.Context r36, X.XSH r37, com.instagram.common.session.UserSession r38, X.1Xj r39, X.C17519VYx r40, java.lang.Integer r41, java.lang.String r42, java.lang.String r43, java.lang.String r44) {
        /*
            r10 = r38
            r9 = r39
            com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf r8 = X.C231122qu.A00(r10, r9)
            boolean r1 = X.AnonymousClass3ZN.A01(r8, r10)
            r0 = 0
            r13 = 1
            if (r1 == 0) goto L_0x01b1
            X.7Pr r0 = new X.7Pr
            r0.<init>(r10)
            r0.A1O = r13
            X.7Pu r21 = r0.A00()
            r20 = 0
            if (r8 == 0) goto L_0x03a0
            X.Vcf r7 = r8.AKD()
            com.instagram.api.schemas.OnFeedMessagesIntf r0 = r8.BTY()
        L_0x0027:
            r1 = 2
            int r0 = X.AnonymousClass3ZO.A00(r0)
            if (r1 != r0) goto L_0x0079
            if (r8 == 0) goto L_0x0079
            com.instagram.api.schemas.OnFeedMessagesIntf r0 = r8.BTY()
            if (r0 == 0) goto L_0x0079
            if (r7 == 0) goto L_0x0079
            r5 = 3
            r4 = 6
            X.1Xy r1 = r9.A0C
            X.3lZ r1 = r1.getInjected()
            if (r1 == 0) goto L_0x0077
            X.3xm r6 = r1.Atd()
            if (r6 == 0) goto L_0x0077
            boolean r1 = X.0oI.A0G(r36)
            if (r1 != 0) goto L_0x0077
            java.lang.Integer r2 = r6.B3r()
            java.util.Map r1 = X.C16590Uxk.A01
            java.lang.Object r3 = r1.get(r2)
            X.Uxk r3 = (X.C16590Uxk) r3
            if (r3 != 0) goto L_0x005e
            X.Uxk r3 = X.C16590Uxk.UNDEFINED
        L_0x005e:
            java.lang.String r6 = r6.AYS()
            X.Vbw r1 = r0.AKI()
            r11 = 0
            if (r6 == 0) goto L_0x02a0
            int r2 = r6.length()
            if (r2 == 0) goto L_0x02a0
            int r2 = r3.ordinal()
            if (r2 == r5) goto L_0x021f
            if (r2 == r4) goto L_0x02a0
        L_0x0077:
            r7.A00 = r0
        L_0x0079:
            boolean r0 = X.C247643gg.A05(r10, r9)
            if (r0 == 0) goto L_0x0219
            com.instagram.user.model.User r1 = X.C247643gg.A00(r10, r9)
        L_0x0083:
            if (r1 == 0) goto L_0x0215
            boolean r0 = r1.A2Q()
            if (r0 != r13) goto L_0x020f
            java.lang.String r11 = X.C231122qu.A0G(r10, r9)
        L_0x008f:
            com.instagram.common.typedurl.ImageUrl r20 = r1.Bh3()
        L_0x0093:
            if (r7 == 0) goto L_0x014f
            com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf r5 = r7.A0C
            boolean r0 = r5 instanceof com.instagram.api.schemas.ImmutablePandoIGCTMessagingAdsInfoDict
            if (r0 == 0) goto L_0x01bb
            com.facebook.pando.TreeUpdaterJNI r0 = com.facebook.pando.TreeUpdaterJNI.$redex_init_class
            java.lang.String r2 = r7.A08
            java.lang.String r1 = "igAdvertiserId"
            X.0eP r19 = new X.0eP
            r0 = r19
            r0.<init>(r1, r2)
            java.lang.Boolean r2 = r7.A04
            java.lang.String r1 = "isActive"
            X.0eP r18 = new X.0eP
            r0 = r18
            r0.<init>(r1, r2)
            java.lang.Boolean r2 = r7.A05
            java.lang.String r1 = "isEligibleForOnFeedMessages"
            X.0eP r17 = new X.0eP
            r0 = r17
            r0.<init>(r1, r2)
            com.instagram.api.schemas.OnFeedMessagesIntf r0 = r7.A00
            r14 = 0
            if (r0 == 0) goto L_0x01b8
            com.facebook.pando.TreeUpdaterJNI r2 = r0.FHC()
        L_0x00c7:
            java.lang.String r1 = "model"
            X.0eP r16 = new X.0eP
            r0 = r16
            r0.<init>(r1, r2)
            java.lang.String r1 = r7.A09
            java.lang.String r0 = "pageID"
            X.0eP r15 = new X.0eP
            r15.<init>(r0, r1)
            com.instagram.api.schemas.PrivacyDisclosureInfo r0 = r7.A01
            if (r0 == 0) goto L_0x01b5
            com.facebook.pando.TreeUpdaterJNI r1 = r0.FHC()
        L_0x00e1:
            java.lang.String r0 = "privacyDisclosureInfo"
            X.0eP r13 = new X.0eP
            r13.<init>(r0, r1)
            java.lang.String r1 = r7.A0A
            java.lang.String r0 = "responsivenessText"
            X.0eP r12 = new X.0eP
            r12.<init>(r0, r1)
            java.lang.String r1 = r7.A0B
            java.lang.String r0 = "secondaryCTASubtitle"
            X.0eP r6 = new X.0eP
            r6.<init>(r0, r1)
            java.lang.Boolean r1 = r7.A06
            java.lang.String r0 = "shouldNavigateToThread"
            X.0eP r4 = new X.0eP
            r4.<init>(r0, r1)
            java.lang.Boolean r1 = r7.A07
            java.lang.String r0 = "shouldTreatLinkStickerAsCTA"
            X.0eP r3 = new X.0eP
            r3.<init>(r0, r1)
            com.instagram.api.schemas.SocialProofInfo r0 = r7.A02
            if (r0 == 0) goto L_0x01b2
            com.facebook.pando.TreeUpdaterJNI r1 = r0.FHC()
        L_0x0114:
            java.lang.String r0 = "socialProofInfo"
            X.0eP r2 = new X.0eP
            r2.<init>(r0, r1)
            com.instagram.api.schemas.WhatsAppAttributionInfo r0 = r7.A03
            if (r0 == 0) goto L_0x0123
            com.facebook.pando.TreeUpdaterJNI r14 = r0.FHC()
        L_0x0123:
            java.lang.String r1 = "whatsaAppAttributionInfo"
            X.0eP r0 = new X.0eP
            r0.<init>(r1, r14)
            r23 = r18
            r24 = r17
            r25 = r16
            r26 = r15
            r27 = r13
            r28 = r12
            r29 = r6
            r30 = r4
            r31 = r3
            r32 = r2
            r33 = r0
            r22 = r19
            X.0eP[] r0 = new X.0eP[]{r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33}
            com.facebook.pando.TreeJNI r7 = X.C41847B3o.A0o(r5, r0)
        L_0x014a:
            android.os.Parcelable r7 = (android.os.Parcelable) r7
            if (r7 == 0) goto L_0x014f
            r8 = r7
        L_0x014f:
            java.lang.String r4 = X.C231122qu.A07(r10, r9)
            java.lang.String r3 = r9.getId()
            android.os.Bundle r2 = X.DbY.A09(r10)
            java.lang.String r0 = "click_to_messaging_ads_info"
            r2.putParcelable(r0, r8)
            java.lang.String r0 = "page_handle"
            r2.putString(r0, r11)
            java.lang.String r1 = "page_profile_pic_url"
            r0 = r20
            r2.putParcelable(r1, r0)
            java.lang.String r0 = "ad_id"
            r2.putString(r0, r4)
            java.lang.String r0 = "media_id"
            r2.putString(r0, r3)
            java.lang.String r0 = "reel_id"
            r1 = r43
            r2.putString(r0, r1)
            java.lang.String r0 = "reel_item_id"
            r1 = r44
            r2.putString(r0, r1)
            int r1 = X.DbX.A02(r41)
            java.lang.String r0 = "carousel_index"
            r2.putInt(r0, r1)
            r1 = r42
            if (r42 == 0) goto L_0x0196
            java.lang.String r0 = "direct_entry_point"
            r2.putString(r0, r1)
        L_0x0196:
            java.lang.String r0 = "on_feed_messaging_surface"
            r1 = r37
            r2.putSerializable(r0, r1)
            X.UbJ r1 = new X.UbJ
            r1.<init>()
            r1.setArguments(r2)
            r0 = r40
            r1.A07 = r0
            r2 = r35
            r0 = r21
            r0.A02(r2, r1)
            r0 = 1
        L_0x01b1:
            return r0
        L_0x01b2:
            r1 = r14
            goto L_0x0114
        L_0x01b5:
            r1 = r14
            goto L_0x00e1
        L_0x01b8:
            r2 = r14
            goto L_0x00c7
        L_0x01bb:
            java.lang.String r13 = r7.A08
            java.lang.Boolean r6 = r7.A04
            java.lang.Boolean r5 = r7.A05
            com.instagram.api.schemas.OnFeedMessagesIntf r0 = r7.A00
            r26 = 0
            if (r0 == 0) goto L_0x020c
            com.instagram.api.schemas.OnFeedMessages r23 = r0.F70()
        L_0x01cb:
            java.lang.String r4 = r7.A09
            com.instagram.api.schemas.PrivacyDisclosureInfo r0 = r7.A01
            if (r0 == 0) goto L_0x0209
            com.instagram.api.schemas.PrivacyDisclosureInfoImpl r24 = r0.F7i()
        L_0x01d5:
            java.lang.String r3 = r7.A0A
            java.lang.String r2 = r7.A0B
            java.lang.Boolean r1 = r7.A06
            java.lang.Boolean r0 = r7.A07
            com.instagram.api.schemas.SocialProofInfo r12 = r7.A02
            if (r12 == 0) goto L_0x0206
            com.instagram.api.schemas.SocialProofInfoImpl r25 = r12.F9D()
        L_0x01e5:
            com.instagram.api.schemas.WhatsAppAttributionInfo r7 = r7.A03
            if (r7 == 0) goto L_0x01ed
            com.instagram.api.schemas.WhatsAppAttributionInfoImpl r26 = r7.FDR()
        L_0x01ed:
            com.instagram.api.schemas.IGCTMessagingAdsInfoDict r7 = new com.instagram.api.schemas.IGCTMessagingAdsInfoDict
            r27 = r6
            r28 = r5
            r29 = r1
            r30 = r0
            r31 = r13
            r32 = r4
            r33 = r3
            r34 = r2
            r22 = r7
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            goto L_0x014a
        L_0x0206:
            r25 = r26
            goto L_0x01e5
        L_0x0209:
            r24 = r26
            goto L_0x01d5
        L_0x020c:
            r23 = r26
            goto L_0x01cb
        L_0x020f:
            java.lang.String r11 = r1.getUsername()
            goto L_0x008f
        L_0x0215:
            r11 = r20
            goto L_0x0093
        L_0x0219:
            com.instagram.user.model.User r1 = r9.A2A(r10)
            goto L_0x0083
        L_0x021f:
            java.util.List r0 = r0.BE6()
            if (r0 == 0) goto L_0x0298
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r0)
        L_0x022a:
            int r0 = r5.size()
            if (r11 >= r0) goto L_0x02a5
            android.net.Uri r0 = X.0cp.A03(r6)
            android.net.Uri$Builder r3 = r0.buildUpon()
            java.lang.Object r0 = r5.get(r11)
            com.instagram.api.schemas.IceBreakerMessageIntf r0 = (com.instagram.api.schemas.IceBreakerMessageIntf) r0
            java.lang.String r2 = r0.getMessage()
            r0 = 3770(0xeba, float:5.283E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.net.Uri$Builder r0 = r3.appendQueryParameter(r0, r2)
            android.net.Uri r0 = r0.build()
            java.lang.String r3 = X.DbT.A10(r0)
            java.lang.Object r0 = r5.get(r11)
            com.instagram.api.schemas.IceBreakerMessageIntf r0 = (com.instagram.api.schemas.IceBreakerMessageIntf) r0
            X.VXh r2 = r0.AKF()
            r2.A00 = r3
            com.instagram.api.schemas.IceBreakerMessageIntf r12 = r2.A03
            boolean r0 = r12 instanceof com.instagram.api.schemas.ImmutablePandoIceBreakerMessage
            if (r0 == 0) goto L_0x028c
            com.facebook.pando.TreeUpdaterJNI r0 = com.facebook.pando.TreeUpdaterJNI.$redex_init_class
            java.lang.String r3 = r2.A00
            java.lang.String r0 = "actionUrl"
            X.0eP r4 = new X.0eP
            r4.<init>(r0, r3)
            java.lang.String r14 = r2.A01
            java.lang.String r0 = "message"
            X.0eP r3 = new X.0eP
            r3.<init>(r0, r14)
            java.lang.String r2 = r2.A02
            java.lang.String r0 = "messageKey"
            X.0eP[] r0 = X.Pxg.A1b(r0, r2, r4, r3)
            com.facebook.pando.TreeJNI r0 = X.C41847B3o.A0o(r12, r0)
        L_0x0286:
            r5.set(r11, r0)
            int r11 = r11 + 1
            goto L_0x022a
        L_0x028c:
            java.lang.String r4 = r2.A00
            java.lang.String r3 = r2.A01
            java.lang.String r2 = r2.A02
            com.instagram.api.schemas.IceBreakerMessage r0 = new com.instagram.api.schemas.IceBreakerMessage
            r0.<init>(r4, r3, r2)
            goto L_0x0286
        L_0x0298:
            java.util.List r5 = java.util.Collections.emptyList()
            X.0qQ.A07(r5)
            goto L_0x022a
        L_0x02a0:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
            goto L_0x02ad
        L_0x02a5:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r13)
            r1.A02 = r6
            r1.A07 = r5
        L_0x02ad:
            com.instagram.api.schemas.OnFeedMessagesIntf r6 = r1.A08
            boolean r0 = r6 instanceof com.instagram.api.schemas.ImmutablePandoOnFeedMessages
            if (r0 == 0) goto L_0x034c
            java.lang.String r2 = "destinationType"
            X.0eP r16 = new X.0eP
            r0 = r16
            r0.<init>(r2, r12)
            java.lang.String r2 = r1.A02
            java.lang.String r0 = "genericUrl"
            X.0eP r14 = new X.0eP
            r14.<init>(r0, r2)
            java.lang.String r2 = r1.A03
            java.lang.String r0 = "greetingText"
            X.0eP r12 = new X.0eP
            r12.<init>(r0, r2)
            java.lang.String r2 = r1.A04
            java.lang.String r0 = "headerText"
            X.0eP r11 = new X.0eP
            r11.<init>(r0, r2)
            java.lang.String r2 = r1.A05
            r0 = 3269(0xcc5, float:4.581E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0eP r5 = new X.0eP
            r5.<init>(r0, r2)
            java.lang.String r2 = r1.A06
            java.lang.String r0 = "icebreakerDisclaimerTextFAQsSticker"
            X.0eP r4 = new X.0eP
            r4.<init>(r0, r2)
            java.util.List r0 = r1.A07
            r15 = 0
            if (r0 == 0) goto L_0x0311
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r0.iterator()
        L_0x02fb:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0312
            java.lang.Object r0 = r3.next()
            com.instagram.api.schemas.IceBreakerMessageIntf r0 = (com.instagram.api.schemas.IceBreakerMessageIntf) r0
            if (r0 == 0) goto L_0x02fb
            com.facebook.pando.TreeUpdaterJNI r0 = r0.FHC()
            r2.add(r0)
            goto L_0x02fb
        L_0x0311:
            r2 = r15
        L_0x0312:
            java.lang.String r0 = "icebreakerMessages"
            X.0eP r3 = new X.0eP
            r3.<init>(r0, r2)
            com.instagram.api.schemas.GreetingAttachmentIntf r0 = r1.A00
            if (r0 == 0) goto L_0x0321
            com.facebook.pando.TreeUpdaterJNI r15 = r0.FHC()
        L_0x0321:
            java.lang.String r0 = "imageAttachment"
            X.0eP r2 = new X.0eP
            r2.<init>(r0, r15)
            java.lang.Boolean r15 = r1.A01
            java.lang.String r1 = "shouldSendAttachment"
            X.0eP r0 = new X.0eP
            r0.<init>(r1, r15)
            r23 = r14
            r24 = r12
            r25 = r11
            r26 = r5
            r27 = r4
            r28 = r3
            r29 = r2
            r30 = r0
            r22 = r16
            X.0eP[] r0 = new X.0eP[]{r22, r23, r24, r25, r26, r27, r28, r29, r30}
            com.facebook.pando.TreeJNI r0 = X.C41847B3o.A0o(r6, r0)
            goto L_0x0399
        L_0x034c:
            java.lang.String r11 = r1.A02
            java.lang.String r6 = r1.A03
            java.lang.String r5 = r1.A04
            java.lang.String r4 = r1.A05
            java.lang.String r3 = r1.A06
            java.util.List r0 = r1.A07
            if (r0 == 0) goto L_0x0376
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r14 = r0.iterator()
        L_0x0362:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0378
            java.lang.Object r0 = r14.next()
            com.instagram.api.schemas.IceBreakerMessageIntf r0 = (com.instagram.api.schemas.IceBreakerMessageIntf) r0
            com.instagram.api.schemas.IceBreakerMessage r0 = r0.F58()
            r2.add(r0)
            goto L_0x0362
        L_0x0376:
            r2 = r20
        L_0x0378:
            com.instagram.api.schemas.GreetingAttachmentIntf r0 = r1.A00
            if (r0 == 0) goto L_0x039d
            com.instagram.api.schemas.GreetingAttachment r23 = r0.F3T()
        L_0x0380:
            java.lang.Boolean r1 = r1.A01
            com.instagram.api.schemas.OnFeedMessages r0 = new com.instagram.api.schemas.OnFeedMessages
            r24 = r1
            r25 = r12
            r26 = r11
            r27 = r6
            r28 = r5
            r29 = r4
            r30 = r3
            r31 = r2
            r22 = r0
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31)
        L_0x0399:
            com.instagram.api.schemas.OnFeedMessagesIntf r0 = (com.instagram.api.schemas.OnFeedMessagesIntf) r0
            goto L_0x0077
        L_0x039d:
            r23 = r20
            goto L_0x0380
        L_0x03a0:
            r7 = r20
            r0 = r7
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VC4.A00(android.app.Activity, android.content.Context, X.XSH, com.instagram.common.session.UserSession, X.1Xj, X.VYx, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String):boolean");
    }
}
