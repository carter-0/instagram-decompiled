package X;

/* renamed from: X.Haj  reason: case insensitive filesystem */
public abstract class C55012Haj {
    /* JADX WARNING: Removed duplicated region for block: B:62:0x010f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.content.Context r61, com.instagram.common.session.UserSession r62, X.C55632Hkr r63, X.1Xj r64, X.AnonymousClass4DU r65, X.AnonymousClass3W1 r66, X.AnonymousClass3VF r67, java.lang.String r68, boolean r69) {
        /*
            r8 = r68
            java.lang.String r13 = "media"
            r10 = 0
            r5 = 1
            r0 = 7
            r6 = r63
            X.0qQ.A0B(r6, r0)
            r2 = r66
            if (r69 == 0) goto L_0x0015
            boolean r0 = r2.A20
            if (r0 != 0) goto L_0x0015
        L_0x0014:
            return
        L_0x0015:
            r0 = r64
            boolean r3 = r0.A6J()
            r1 = r62
            if (r3 == 0) goto L_0x0029
            X.0Tu r7 = X.0Tu.A05
            r3 = 36325970101482929(0x810e47000535b1, double:3.0360279928941644E-306)
            X.182.A06(r7, r1, r3)
        L_0x0029:
            boolean r4 = r2.A20
            java.lang.String r18 = "Required value was null."
            r3 = r65
            r9 = r67
            if (r4 == 0) goto L_0x0064
            r2.A0k(r10)
            X.3VD r4 = r9.A04
            if (r4 == 0) goto L_0x0043
            boolean r2 = X.C243193Xt.A06(r1, r0)
            if (r2 == 0) goto L_0x0043
            r4.A00()
        L_0x0043:
            X.3V9 r4 = r9.A01
            if (r4 == 0) goto L_0x042b
            X.3VA r2 = X.C243193Xt.A01(r3, r1, r0)
            X.3eZ r1 = X.C246413eY.A00(r1)
            boolean r0 = r1.A02(r3, r0, r0)
            if (r0 == 0) goto L_0x0014
            X.0qQ.A0B(r2, r5)
            r4.A0C()
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r4.A0G(r0)
            r4.A0B()
            return
        L_0x0064:
            boolean r4 = X.C243193Xt.A07(r1, r0)
            if (r4 == 0) goto L_0x03d6
            boolean r4 = r0.A5f()
            if (r4 != 0) goto L_0x03d6
            r2.A0k(r5)
            X.3VD r11 = r9.A04
            r4 = 0
            if (r11 == 0) goto L_0x021b
            boolean r7 = X.C243193Xt.A06(r1, r0)
            if (r7 == 0) goto L_0x021b
            X.3fg r7 = new X.3fg
            r7.<init>(r1)
            X.3fk r7 = r7.A00(r0, r2)
            r11.A02(r1, r7, r5)
            java.util.ArrayList r17 = r0.A3E()
            boolean r7 = X.C51968G9o.A1W(r1, r0)
            if (r7 == 0) goto L_0x0200
            java.util.ArrayList r16 = X.AnonymousClass595.A02(r0)
        L_0x0098:
            boolean r7 = X.C51968G9o.A1W(r1, r0)
            if (r7 == 0) goto L_0x01fa
            boolean r7 = X.AnonymousClass595.A03(r0)
        L_0x00a2:
            if (r7 == 0) goto L_0x0233
            X.Hqb r12 = X.C17073VGv.A00(r1)
            com.instagram.common.session.UserSession r11 = r12.A03
            boolean r7 = X.2R8.A02(r11, r0)
            if (r7 != 0) goto L_0x00d0
            boolean r7 = X.C51968G9o.A1W(r11, r0)
            if (r7 == 0) goto L_0x01f4
            boolean r7 = X.AnonymousClass595.A03(r0)
        L_0x00ba:
            if (r7 == 0) goto L_0x00d0
            java.util.ArrayList r7 = r0.A3K(r5)
            if (r7 == 0) goto L_0x01d8
            java.lang.Object r7 = r7.get(r10)
            com.instagram.user.model.Product r7 = (com.instagram.user.model.Product) r7
            if (r7 == 0) goto L_0x01d8
            boolean r7 = r7.A04()
            if (r7 != 0) goto L_0x01d8
        L_0x00d0:
            boolean r6 = X.C51968G9o.A1W(r1, r0)
            if (r6 == 0) goto L_0x0220
            if (r16 == 0) goto L_0x0206
            X.0Tu r11 = X.0Tu.A06
            r6 = 36312187552007121(0x8101be000e03d1, double:3.027311853107791E-306)
            boolean r6 = X.182.A06(r11, r1, r6)
            if (r6 == 0) goto L_0x0206
            int r6 = r16.size()
            long r11 = (long) r6
            X.0Tu r14 = X.0Tu.A05
            r6 = 36598245258366088(0x8205e900070c88, double:3.2082158984711303E-306)
            long r14 = X.182.A01(r14, r1, r6)
            int r6 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r6 > 0) goto L_0x0206
            if (r68 != 0) goto L_0x0103
            java.lang.String r6 = r2.A1W
            if (r6 != 0) goto L_0x0105
            java.lang.String r8 = X.C228022kf.A00(r4)
        L_0x0103:
            r2.A1W = r8
        L_0x0105:
            java.util.Iterator r14 = r16.iterator()
        L_0x0109:
            boolean r6 = r14.hasNext()
            if (r6 == 0) goto L_0x0206
            java.lang.Object r6 = r14.next()
            com.instagram.model.shopping.ProductTag r6 = (com.instagram.model.shopping.ProductTag) r6
            if (r6 == 0) goto L_0x0109
            com.instagram.user.model.ProductDetailsProductItemDictIntf r6 = r6.A02
            com.instagram.user.model.Product r7 = X.C14502TxO.A00(r6)
            X.1Xj r6 = r0.A1e(r1)
            com.instagram.user.model.User r12 = r6.A2A(r1)
            java.lang.String r29 = X.C231122qu.A07(r1, r0)
            r30 = 0
            if (r29 == 0) goto L_0x01d4
            java.lang.String r31 = X.C231122qu.A0F(r1, r0)
            java.lang.String r30 = r0.getId()
        L_0x0135:
            r32 = 0
            r21 = 0
            java.lang.String r43 = "Shop"
            java.lang.Long r28 = X.C51971G9r.A0m()
            java.lang.String r42 = r6.getId()
            java.lang.String r11 = r2.A1W
            java.lang.String r44 = "tags"
            java.lang.String r45 = r3.getModuleName()
            r45.getClass()
            int r8 = r0.A15(r1)
            java.lang.Integer r27 = java.lang.Integer.valueOf(r8)
            org.json.JSONObject r54 = X.C278474ww.A04(r1)
            boolean r57 = r6.CcK()
            if (r12 == 0) goto L_0x0164
            java.lang.String r32 = r12.getId()
        L_0x0164:
            boolean r8 = r6.A5j()
            if (r8 != 0) goto L_0x0170
            int r8 = r2.A03
            com.instagram.model.shopping.productfeed.ProductTileMedia r21 = X.C55150Hcy.A00(r6, r7, r8)
        L_0x0170:
            X.3kF r6 = X.C249713kF.A00
            r6.A0T()
            X.C18266Vog.A01(r7, r4, r4, r4)
            r55 = -1
            r20 = r4
            r22 = r4
            r23 = r4
            r24 = r7
            r25 = r4
            r26 = r4
            r33 = r4
            r34 = r4
            r35 = r4
            r36 = r4
            r37 = r4
            r38 = r4
            r39 = r4
            r40 = r4
            r41 = r4
            r46 = r4
            r47 = r4
            r48 = r4
            r49 = r4
            r50 = r4
            r51 = r11
            r52 = r4
            r53 = r4
            r56 = r10
            r58 = r10
            r59 = r10
            r60 = r5
            r19 = r4
            android.os.Bundle r7 = X.C18266Vog.A00(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60)
            r6 = 5116(0x13fc, float:7.169E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r6)
            android.os.Parcelable r6 = r7.getParcelable(r6)
            r6.getClass()
            com.instagram.shopping.intf.ProductDetailsPageArguments r6 = (com.instagram.shopping.intf.ProductDetailsPageArguments) r6
            r19 = r7
            r21 = r1
            r22 = r6
            r24 = r10
            r25 = r10
            X.W39.A02(r19, r20, r21, r22, r23, r24, r25)
            goto L_0x0109
        L_0x01d4:
            r31 = r4
            goto L_0x0135
        L_0x01d8:
            r12.A01 = r2
            X.2xU r7 = r12.A00
            if (r7 == 0) goto L_0x01e1
            r2.A0M(r7, r4, r10)
        L_0x01e1:
            r12.A02 = r10
            r11 = 2
            X.GPh r7 = new X.GPh
            r7.<init>(r11, r0, r12, r6)
            r12.A00 = r7
            X.3W1 r6 = r12.A01
            if (r6 == 0) goto L_0x00d0
            r6.A0L(r7, r4, r10)
            goto L_0x00d0
        L_0x01f4:
            boolean r7 = r0.A4u()
            goto L_0x00ba
        L_0x01fa:
            boolean r7 = r0.A4u()
            goto L_0x00a2
        L_0x0200:
            java.util.ArrayList r16 = r0.A3G()
            goto L_0x0098
        L_0x0206:
            java.lang.String r7 = "media_show_tags"
            java.lang.String r6 = "instagram_ad_"
            java.lang.String r6 = X.002.A0R(r6, r7)
            X.3sc r6 = X.C51965G9l.A0n(r3, r6)
            r6.A0G(r1, r0)
            r6.A5C = r13
            X.C18694Vws.A00(r1, r6, r0, r3)
            goto L_0x0233
        L_0x021b:
            r17 = r4
            r16 = r4
            goto L_0x0233
        L_0x0220:
            if (r16 == 0) goto L_0x022c
            X.0Tu r10 = X.0Tu.A06
            r6 = 36312187552007121(0x8101be000e03d1, double:3.027311853107791E-306)
            X.182.A06(r10, r1, r6)
        L_0x022c:
            if (r68 != 0) goto L_0x0230
            java.lang.String r8 = r2.A1W
        L_0x0230:
            X.W3r.A09(r1, r0, r3, r8)
        L_0x0233:
            boolean r6 = r2.A20
            if (r6 == 0) goto L_0x0249
            java.util.ArrayList r7 = X.C243193Xt.A04(r1, r0, r2)
            boolean r6 = r7 instanceof java.util.Collection
            if (r6 == 0) goto L_0x0379
            boolean r6 = r7.isEmpty()
            if (r6 == 0) goto L_0x0379
        L_0x0245:
            if (r17 != 0) goto L_0x0299
            if (r16 != 0) goto L_0x0299
        L_0x0249:
            X.3V9 r6 = r9.A01
            if (r6 == 0) goto L_0x0430
            X.3VA r7 = X.C243193Xt.A01(r3, r1, r0)
            X.3eZ r4 = X.C246413eY.A00(r1)
            boolean r3 = r4.A02(r3, r0, r0)
            if (r3 == 0) goto L_0x028e
            X.0qQ.A0B(r7, r5)
            r6.A0C()
            boolean r3 = X.C243193Xt.A08(r1, r0, r7)
            if (r3 != 0) goto L_0x0296
            X.3VA r3 = X.AnonymousClass3VA.UPCOMING_EVENT
            if (r7 != r3) goto L_0x0281
            boolean r3 = r0.A6T(r1)
            if (r3 == 0) goto L_0x0281
            com.instagram.user.model.UpcomingEvent r1 = r0.A27(r1)
            if (r1 == 0) goto L_0x0281
            long r3 = java.lang.System.currentTimeMillis()
            boolean r1 = X.C18810W3l.A0D(r1, r3)
            if (r1 != 0) goto L_0x0296
        L_0x0281:
            int r1 = r2.A03
            boolean r0 = X.1sx.A0Q(r0, r1)
            if (r0 != 0) goto L_0x0296
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
        L_0x028b:
            r6.A0G(r0)
        L_0x028e:
            X.3VC r0 = r9.A00
            if (r0 == 0) goto L_0x0014
            X.AnonymousClass4H2.A00(r2, r0, r5)
            return
        L_0x0296:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x028b
        L_0x0299:
            X.0xE r14 = new X.0xE
            r14.<init>()
            X.0xE r13 = new X.0xE
            r13.<init>()
            X.0xE r8 = new X.0xE
            r8.<init>()
            if (r17 == 0) goto L_0x02ce
            java.util.Iterator r7 = r17.iterator()
        L_0x02ae:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L_0x02ce
            java.lang.Object r6 = r7.next()
            com.instagram.model.people.PeopleTag r6 = (com.instagram.model.people.PeopleTag) r6
            java.lang.String r4 = r6.getId()
            r14.A04(r4)
            com.instagram.model.people.PeopleTag$UserInfo r4 = r6.A00
            java.lang.String r4 = r4.A04
            r13.A04(r4)
            java.lang.String r4 = "user"
            r8.A04(r4)
            goto L_0x02ae
        L_0x02ce:
            if (r16 == 0) goto L_0x02f4
            java.util.Iterator r7 = r16.iterator()
        L_0x02d4:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L_0x02f4
            java.lang.Object r6 = r7.next()
            com.instagram.tagging.model.Tag r6 = (com.instagram.tagging.model.Tag) r6
            java.lang.String r4 = r6.getId()
            r14.A04(r4)
            java.lang.String r4 = r6.A04()
            r13.A04(r4)
            java.lang.String r4 = "product"
            r8.A04(r4)
            goto L_0x02d4
        L_0x02f4:
            java.lang.String r11 = r0.A2s()
            java.lang.String r6 = r0.getId()
            if (r11 != 0) goto L_0x032e
            if (r6 == 0) goto L_0x0435
            X.1iA r10 = r0.BR7()
            java.lang.String r4 = "instagram_media_tagged_items_summary"
            X.0xI r7 = X.0xI.A00(r3, r4)
            java.lang.String r4 = "entity_id_list"
            r7.A06(r14, r4)
            java.lang.String r4 = "entity_name_list"
            r7.A06(r13, r4)
            java.lang.String r4 = "entity_type_list"
            r7.A06(r8, r4)
            java.lang.String r4 = "m_pk"
            r7.A0C(r4, r6)
            java.lang.String r6 = "m_t"
            int r4 = r10.A00
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7.A08(r4, r6)
        L_0x0329:
            X.DbU.A1R(r7, r1)
            goto L_0x0249
        L_0x032e:
            if (r6 == 0) goto L_0x043a
            X.1iA r4 = r0.BR7()
            int r10 = r4.A00
            int r12 = r0.A15(r1)
            java.lang.String r4 = "instagram_media_tagged_items_summary"
            X.0xI r7 = X.0xI.A00(r3, r4)
            java.lang.String r4 = "entity_id_list"
            r7.A06(r14, r4)
            java.lang.String r4 = "entity_name_list"
            r7.A06(r13, r4)
            java.lang.String r4 = "entity_type_list"
            r7.A06(r8, r4)
            X.1iA r8 = X.1iA.A09
            java.lang.String r4 = "m_pk"
            r7.A0C(r4, r6)
            java.lang.String r6 = "m_t"
            int r4 = r8.A00
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7.A08(r4, r6)
            java.lang.String r4 = "carousel_media_id"
            r7.A0C(r4, r11)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)
            java.lang.String r4 = "carousel_m_t"
            r7.A08(r6, r4)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r12)
            java.lang.String r4 = "carousel_index"
            r7.A08(r6, r4)
            goto L_0x0329
        L_0x0379:
            java.util.Iterator r7 = r7.iterator()
        L_0x037d:
            boolean r6 = r7.hasNext()
            if (r6 == 0) goto L_0x0245
            java.lang.Object r6 = r7.next()
            boolean r6 = r6 instanceof com.instagram.model.barcelonashare.BarcelonaTag
            if (r6 == 0) goto L_0x037d
            java.lang.String r11 = X.C51973G9u.A0j(r1, r0)
            if (r61 == 0) goto L_0x0444
            boolean r10 = X.0oI.A0A(r61)
            r6 = 3125(0xc35, float:4.379E-42)
            java.lang.String r8 = X.AnonymousClass000.A00(r6)
            X.0wc r7 = X.AnonymousClass0kN.A01(r3, r1)
            java.lang.String r6 = "instagram_organic_feed_p92_media_tap"
            X.0Aj r7 = X.AnonymousClass7TE.A0e(r7, r6)
            java.lang.String r6 = r0.A2n()
            if (r6 == 0) goto L_0x043f
            X.G9t.A1J(r7, r6)
            X.DbY.A1C(r7)
            X.DbW.A15(r7, r3)
            r6 = 764(0x2fc, float:1.07E-42)
            java.lang.String r6 = X.C273654mx.A00(r6)
            r7.AAJ(r6, r8)
            if (r11 == 0) goto L_0x03c3
            java.lang.Long r4 = X.AnonymousClass7TE.A10(r11)
        L_0x03c3:
            java.lang.String r6 = "target_user_id"
            r7.A9F(r6, r4)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r10)
            java.lang.String r4 = "is_barcelona_installed"
            r7.A7p(r4, r6)
            r7.Cgf()
            goto L_0x0245
        L_0x03d6:
            X.3V9 r4 = r9.A01
            if (r4 == 0) goto L_0x0449
            X.3VA r6 = X.C243193Xt.A01(r3, r1, r0)
            X.3VA r8 = X.C243193Xt.A01(r3, r1, r0)
            X.3eZ r7 = X.C246413eY.A00(r1)
            boolean r3 = r7.A02(r3, r0, r0)
            if (r3 == 0) goto L_0x0014
            X.0qQ.A0B(r8, r5)
            boolean r3 = X.C243193Xt.A08(r1, r0, r6)
            if (r3 != 0) goto L_0x0014
            X.0qQ.A0B(r6, r5)
            X.3VA r3 = X.AnonymousClass3VA.UPCOMING_EVENT
            if (r6 != r3) goto L_0x0412
            boolean r3 = r0.A6T(r1)
            if (r3 == 0) goto L_0x0412
            com.instagram.user.model.UpcomingEvent r3 = r0.A27(r1)
            if (r3 == 0) goto L_0x0412
            long r0 = java.lang.System.currentTimeMillis()
            boolean r0 = X.C18810W3l.A0D(r3, r0)
            if (r0 != 0) goto L_0x0014
        L_0x0412:
            r4.A0C()
            int r1 = r2.A03
            int r0 = r6.ordinal()
            X.47M r0 = r2.A07(r1, r0)
            java.lang.Integer r1 = r0.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x0427
            java.lang.Integer r0 = X.AnonymousClass05K.A01
        L_0x0427:
            r4.A0G(r0)
            return
        L_0x042b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r18)
            throw r0
        L_0x0430:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r18)
            throw r0
        L_0x0435:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r18)
            throw r0
        L_0x043a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r18)
            throw r0
        L_0x043f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r18)
            throw r0
        L_0x0444:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r18)
            throw r0
        L_0x0449:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r18)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55012Haj.A00(android.content.Context, com.instagram.common.session.UserSession, X.Hkr, X.1Xj, X.4DU, X.3W1, X.3VF, java.lang.String, boolean):void");
    }
}
