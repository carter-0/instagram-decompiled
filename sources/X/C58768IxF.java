package X;

/* renamed from: X.IxF  reason: case insensitive filesystem */
public final class C58768IxF extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58768IxF(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        super(1);
        this.A00 = i;
        this.A02 = obj;
        this.A04 = obj2;
        this.A03 = obj3;
        this.A01 = obj4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: X.JVb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v122, resolved type: X.JVb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v123, resolved type: X.JVb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v124, resolved type: java.lang.Float} */
    /* JADX WARNING: type inference failed for: r3v27, types: [java.util.AbstractList, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r7v58, types: [com.facebook.pando.TreeJNI] */
    /* JADX WARNING: type inference failed for: r1v152, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x09e7, code lost:
        X.11Z.A02(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x0a3d, code lost:
        r0 = r1.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x0a40, code lost:
        r0 = r1.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x0a43, code lost:
        r0 = r1.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x0a45, code lost:
        ((android.widget.CompoundButton) r0).setChecked(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x0ae5, code lost:
        r8 = new X.C55856Hod(r6, r0, (X.C49726F3q) r1.A01, r3, X.AnonymousClass05K.A00, r8, r7);
        r1 = X.C51966G9m.A0Q(r1.A03);
        r13 = X.C46626Di6.FLEXIBLE_SHEET;
        r15 = X.AnonymousClass05K.A0C;
        r12 = X.C46471DfZ.A0S;
        X.C49258Es1.A00(r1, new X.FA0(com.meta.foa.cds.CdsBottomSheetDimmingBehaviour.Default.A00, (com.meta.foa.cds.CdsBottomSheetTopSpan) null, X.C46471DfZ.A0O, (com.meta.foa.cds.CdsOpenScreenConfig$BottomSheetMargins) null, X.EX5.A04, X.C46471DfZ.A0R, r12, r13, (X.C55548HjU) null, r15, (java.lang.Integer) null, r4), X.C55360HgS.A00, r3, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:439:0x0cd6, code lost:
        r2 = (X.C369968vc) r1.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:455:0x0de0, code lost:
        if (r0 != null) goto L_0x0e07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:460:0x0e07, code lost:
        r0.start();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:0x0fa6, code lost:
        r2.A00(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:517:0x103e, code lost:
        if (r2 != null) goto L_0x1040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:555:0x11a7, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:525:0x1071  */
    /* JADX WARNING: Removed duplicated region for block: B:538:0x10d3  */
    /* JADX WARNING: Removed duplicated region for block: B:593:0x01a4 A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r36) {
        /*
            r35 = this;
            r1 = r35
            r0 = r36
            int r2 = r1.A00
            switch(r2) {
                case 0: goto L_0x030d;
                case 1: goto L_0x032a;
                case 2: goto L_0x0372;
                case 3: goto L_0x0399;
                case 4: goto L_0x042b;
                case 5: goto L_0x0470;
                case 6: goto L_0x0505;
                case 7: goto L_0x052c;
                case 8: goto L_0x05bc;
                case 9: goto L_0x0600;
                case 10: goto L_0x0600;
                case 11: goto L_0x068a;
                case 12: goto L_0x06e1;
                case 13: goto L_0x07bc;
                case 14: goto L_0x07cf;
                case 15: goto L_0x0802;
                case 16: goto L_0x0b1e;
                case 17: goto L_0x08fa;
                case 18: goto L_0x094e;
                case 19: goto L_0x003c;
                case 20: goto L_0x0231;
                case 21: goto L_0x097c;
                case 22: goto L_0x09af;
                case 23: goto L_0x09ce;
                case 24: goto L_0x09ec;
                case 25: goto L_0x0a0d;
                case 26: goto L_0x0a4c;
                case 27: goto L_0x0a82;
                case 28: goto L_0x0aaf;
                case 29: goto L_0x0aca;
                case 30: goto L_0x0c97;
                case 31: goto L_0x0cc8;
                case 32: goto L_0x0cff;
                case 33: goto L_0x0d85;
                case 34: goto L_0x0da4;
                case 35: goto L_0x0de3;
                case 36: goto L_0x0e0c;
                case 37: goto L_0x0e25;
                case 38: goto L_0x0e4e;
                case 39: goto L_0x0ef3;
                case 40: goto L_0x0f27;
                case 41: goto L_0x0d85;
                case 42: goto L_0x0f60;
                case 43: goto L_0x0f81;
                case 44: goto L_0x0009;
                case 45: goto L_0x0009;
                case 46: goto L_0x0009;
                case 47: goto L_0x0fab;
                case 48: goto L_0x111d;
                case 49: goto L_0x11ab;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.2W7 r0 = (X.AnonymousClass2W7) r0
            r2 = 0
            X.0qQ.A0B(r0, r2)
            java.lang.Object r2 = r1.A04
            X.GFJ r2 = (X.GFJ) r2
            java.lang.Object r4 = r1.A03
            X.3W1 r4 = (X.AnonymousClass3W1) r4
            X.4bN r2 = r2.A06
            java.lang.String r7 = X.C51966G9m.A1B(r2)
            boolean r8 = X.C51968G9o.A1V(r2)
            android.view.MotionEvent r2 = r0.A00
            X.0qQ.A06(r2)
            android.view.View r3 = r0.A01
            X.0qQ.A06(r3)
            java.lang.Object r6 = r1.A02
            X.GFx r6 = (X.C52129GFx) r6
            java.lang.Object r5 = r1.A01
            X.GG0 r5 = (X.GG0) r5
            boolean r0 = X.GFJ.A07(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L_0x003b:
            return r1
        L_0x003c:
            com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState r0 = (com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState) r0
            r3 = 0
            X.0qQ.A0B(r0, r3)
            java.lang.Object r4 = r1.A04
            X.U8u r4 = (X.C14784U8u) r4
            X.0Ud r2 = r4.A04
            r2.getValue()
            java.lang.Object r2 = r1.A01
            com.instagram.user.model.ProductCollection r2 = (com.instagram.user.model.ProductCollection) r2
            java.lang.Object r6 = r1.A02
            X.UKo r6 = (X.C15035UKo) r6
            java.lang.Object r5 = r1.A03
            java.util.List r5 = (java.util.List) r5
            if (r2 == 0) goto L_0x008f
            java.util.Map r7 = r0.A02
            java.lang.String r1 = r2.Aoi()
            boolean r1 = r7.containsKey(r1)
            if (r1 == 0) goto L_0x008f
            java.util.LinkedHashMap r6 = X.AnonymousClass7TE.A1H()
            java.util.Iterator r5 = X.AnonymousClass7TF.A0u(r7)
        L_0x006d:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x11cc
            java.util.Map$Entry r4 = X.AnonymousClass7TE.A1J(r5)
            java.lang.Object r1 = r4.getValue()
            com.instagram.user.model.ProductCollection r1 = (com.instagram.user.model.ProductCollection) r1
            java.lang.String r3 = r1.Aoi()
            java.lang.String r1 = r2.Aoi()
            boolean r1 = X.C51966G9m.A1a(r3, r1)
            if (r1 == 0) goto L_0x006d
            X.Dbb.A1V(r4, r6)
            goto L_0x006d
        L_0x008f:
            com.instagram.common.textwithentities.model.TextWithEntities r1 = r6.A04
            if (r1 == 0) goto L_0x0181
            java.lang.String r6 = r1.A02
            if (r6 == 0) goto L_0x0181
            r1 = 1
            X.0qQ.A0B(r2, r1)
            java.lang.String r13 = r2.Aoi()
            com.instagram.model.shopping.businessintegrity.ProductCollectionReviewStatus r12 = r2.Aor()
            com.instagram.api.schemas.ProductCollectionV2Type r11 = r2.Aou()
            com.instagram.model.shopping.productcollection.ProductCollectionCover r17 = r2.Arp()
            java.lang.String r9 = r2.getDescription()
            com.instagram.model.shopping.productcollection.ProductCollectionDropsMetadata r16 = r2.AzC()
            java.lang.String r14 = r2.BRr()
            r2.getSubtitle()
            java.lang.String r15 = r2.getTitle()
            java.util.List r24 = r2.CD6()
            r1 = 0
            X.1hu r8 = new X.1hu
            r8.<init>(r1)
            r10 = 6
            X.1E9 r7 = new X.1E9
            r7.<init>(r8, r10, r3)
            boolean r7 = r2 instanceof com.instagram.user.model.ImmutablePandoProductCollection
            if (r7 == 0) goto L_0x0140
            java.lang.String r7 = "collection_id"
            X.0eP r25 = X.AnonymousClass7TE.A1L(r7, r13)
            if (r12 == 0) goto L_0x013e
            java.lang.String r8 = r12.A00
        L_0x00dc:
            r7 = 4614(0x1206, float:6.466E-42)
            java.lang.String r7 = X.AnonymousClass000.A00(r7)
            X.0eP r26 = X.AnonymousClass7TE.A1L(r7, r8)
            if (r11 == 0) goto L_0x013c
            java.lang.String r8 = r11.A00
        L_0x00ea:
            java.lang.String r7 = "collection_type"
            X.0eP r27 = X.AnonymousClass7TE.A1L(r7, r8)
            if (r17 == 0) goto L_0x013a
            com.facebook.pando.TreeUpdaterJNI r8 = r17.FHC()
        L_0x00f6:
            java.lang.String r7 = "cover"
            X.0eP r28 = X.AnonymousClass7TE.A1L(r7, r8)
            java.lang.String r7 = "description"
            X.0eP r29 = X.AnonymousClass7TE.A1L(r7, r9)
            if (r16 == 0) goto L_0x0138
            com.facebook.pando.TreeUpdaterJNI r8 = r16.FHC()
        L_0x0108:
            r7 = 4729(0x1279, float:6.627E-42)
            java.lang.String r7 = X.AnonymousClass000.A00(r7)
            X.0eP r30 = X.AnonymousClass7TE.A1L(r7, r8)
            java.lang.String r7 = "merchant_id"
            X.0eP r31 = X.AnonymousClass7TE.A1L(r7, r14)
            java.lang.String r7 = "subtitle"
            X.0eP r32 = X.AnonymousClass7TE.A1L(r7, r6)
            java.lang.String r6 = "title"
            X.0eP r33 = X.AnonymousClass7TE.A1L(r6, r15)
            if (r24 == 0) goto L_0x016e
            java.util.ArrayList r1 = X.AnonymousClass7TF.A0p(r24)
            java.util.Iterator r6 = r24.iterator()
        L_0x012e:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x016e
            X.C41846B3n.A1T(r1, r6)
            goto L_0x012e
        L_0x0138:
            r8 = r1
            goto L_0x0108
        L_0x013a:
            r8 = r1
            goto L_0x00f6
        L_0x013c:
            r8 = r1
            goto L_0x00ea
        L_0x013e:
            r8 = r1
            goto L_0x00dc
        L_0x0140:
            r18 = 0
            X.1hu r8 = new X.1hu
            r8.<init>(r1)
            X.1E9 r7 = new X.1E9
            r7.<init>(r8, r10, r3)
            if (r17 == 0) goto L_0x0152
            com.instagram.model.shopping.productcollection.ProductCollectionCoverImpl r1 = r17.FFa()
        L_0x0152:
            if (r16 == 0) goto L_0x0158
            com.instagram.model.shopping.productcollection.ProductCollectionDropsMetadataImpl r18 = r16.FFb()
        L_0x0158:
            com.instagram.user.model.ProductCollectionImpl r7 = new com.instagram.user.model.ProductCollectionImpl
            r22 = r6
            r23 = r15
            r19 = r13
            r20 = r9
            r21 = r14
            r16 = r12
            r17 = r1
            r14 = r7
            r15 = r11
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            goto L_0x017c
        L_0x016e:
            java.lang.String r6 = "users"
            X.0eP r34 = X.AnonymousClass7TE.A1L(r6, r1)
            X.0eP[] r1 = new X.0eP[]{r25, r26, r27, r28, r29, r30, r31, r32, r33, r34}
            com.facebook.pando.TreeJNI r7 = X.C41847B3o.A0o(r2, r1)
        L_0x017c:
            com.instagram.user.model.ProductCollection r7 = (com.instagram.user.model.ProductCollection) r7
            if (r7 == 0) goto L_0x0181
            r2 = r7
        L_0x0181:
            java.util.Map r6 = r0.A02
            java.lang.String r1 = r2.Aoi()
            if (r1 != 0) goto L_0x018b
            java.lang.String r1 = ""
        L_0x018b:
            java.util.Map r7 = X.C51975G9x.A0p(r1, r2, r6)
            r8 = 0
            java.util.Map r6 = r0.A04
            java.util.Map r2 = r0.A03
            java.util.List r1 = r0.A01
            com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta r0 = r0.A00
            com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState r1 = com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState.A00(r0, r1, r6, r2, r7)
            r9 = 3
            r7 = 2
            if (r5 == 0) goto L_0x003b
            java.util.Iterator r13 = r5.iterator()
        L_0x01a4:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x003b
            java.lang.Object r2 = r13.next()
            X.JwH r2 = (X.C61079JwH) r2
            java.lang.Object r0 = r2.A00
            X.Khy r0 = (X.C62568Khy) r0
            if (r0 == 0) goto L_0x01a4
            int r5 = r0.ordinal()
            if (r5 == r3) goto L_0x0211
            r0 = 1
            if (r5 == r0) goto L_0x021e
            if (r5 == r7) goto L_0x0208
            if (r5 != r9) goto L_0x01a4
            java.lang.Object r0 = r2.A01
            if (r0 == 0) goto L_0x01a4
            boolean r0 = X.C64182LSo.A02(r8, r1)
        L_0x01cb:
            if (r0 == 0) goto L_0x01a4
        L_0x01cd:
            com.instagram.common.session.UserSession r12 = r4.A00
            X.W3U r11 = X.W3U.A00
            X.0xa r0 = X.W3U.A02(r12, r11)
            java.lang.String r10 = "tagging_feed_num_selected_collection_selection_limit_toast_count"
            int r0 = r0.getInt(r10, r3)
            if (r0 >= r7) goto L_0x01a4
            java.lang.String r6 = r2.A02
            if (r6 == 0) goto L_0x01a4
            X.6oS r5 = X.C318116oQ.A00(r4)
            r2 = 27
            X.MFV r0 = new X.MFV
            r0.<init>(r4, r6, r8, r2)
            X.AnonymousClass7TE.A1Z(r0, r5)
            X.0xa r0 = X.W3U.A02(r12, r11)
            int r5 = r0.getInt(r10, r3)
            X.0xa r0 = X.W3U.A02(r12, r11)
            X.0xY r2 = r0.AR4()
            int r0 = r5 + 1
            r2.E5Z(r10, r0)
            r2.apply()
            goto L_0x01a4
        L_0x0208:
            java.lang.Object r0 = r2.A01
            if (r0 == 0) goto L_0x01a4
            boolean r0 = X.C64182LSo.A03(r8, r1)
            goto L_0x01cb
        L_0x0211:
            java.lang.Object r0 = r2.A01
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x01a4
            int r5 = r0.intValue()
            java.util.Map r0 = r1.A04
            goto L_0x022a
        L_0x021e:
            java.lang.Object r0 = r2.A01
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x01a4
            int r5 = r0.intValue()
            java.util.Map r0 = r1.A02
        L_0x022a:
            int r0 = r0.size()
            if (r0 < r5) goto L_0x01a4
            goto L_0x01cd
        L_0x0231:
            com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState r0 = (com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState) r0
            r6 = 0
            X.0qQ.A0B(r0, r6)
            java.lang.Object r2 = r1.A04
            X.U8u r2 = (X.C14784U8u) r2
            X.0Ud r2 = r2.A04
            r2.getValue()
            java.lang.Object r5 = r1.A01
            X.UKo r5 = (X.C15035UKo) r5
            java.lang.Object r3 = r1.A02
            com.instagram.user.model.Product r3 = (com.instagram.user.model.Product) r3
            java.lang.Object r9 = r1.A03
            java.util.List r9 = (java.util.List) r9
            X.0sn r1 = X.0sn.A00
            X.JwC r4 = r5.A02
            r7 = 0
            if (r4 == 0) goto L_0x0297
            java.lang.Object r2 = r4.A00
            X.Jw2 r2 = (X.C61064Jw2) r2
            if (r2 == 0) goto L_0x0297
            java.lang.String r10 = r2.A02
        L_0x025b:
            if (r4 == 0) goto L_0x0295
            java.lang.Object r2 = r4.A00
            X.Jw2 r2 = (X.C61064Jw2) r2
            if (r2 == 0) goto L_0x0295
            java.lang.Object r8 = r2.A00
            com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta r8 = (com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta) r8
        L_0x0267:
            boolean r2 = X.C64032LJw.A01(r0, r3, r10)
            if (r2 == 0) goto L_0x0299
            java.util.Map r1 = r0.A04
            java.util.LinkedHashMap r6 = X.AnonymousClass7TE.A1H()
            java.util.Iterator r5 = X.AnonymousClass7TF.A0u(r1)
        L_0x0277:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x11d9
            java.util.Map$Entry r4 = X.AnonymousClass7TE.A1J(r5)
            java.lang.Object r1 = r4.getValue()
            com.instagram.user.model.Product r1 = (com.instagram.user.model.Product) r1
            java.lang.String r2 = r1.A0H
            java.lang.String r1 = r3.A0H
            boolean r1 = X.C51966G9m.A1a(r2, r1)
            if (r1 == 0) goto L_0x0277
            X.Dbb.A1V(r4, r6)
            goto L_0x0277
        L_0x0295:
            r8 = r7
            goto L_0x0267
        L_0x0297:
            r10 = r7
            goto L_0x025b
        L_0x0299:
            java.util.Map r2 = r0.A04
            java.lang.String r7 = r3.A0H
            java.util.Map r4 = X.C51975G9x.A0p(r7, r3, r2)
            java.util.Map r2 = r0.A03
            X.JwC r3 = r5.A02
            if (r3 == 0) goto L_0x02b5
            java.lang.Object r3 = r3.A00
            X.Jw2 r3 = (X.C61064Jw2) r3
            if (r3 == 0) goto L_0x02b5
            java.lang.Object r3 = r3.A00
            if (r3 == 0) goto L_0x02b5
            java.util.Map r2 = X.C51975G9x.A0p(r7, r3, r2)
        L_0x02b5:
            if (r10 == 0) goto L_0x02bd
            java.util.List r1 = r0.A01
            java.util.ArrayList r1 = X.00k.A0T(r10, r1)
        L_0x02bd:
            java.util.List r1 = (java.util.List) r1
            r7 = 3
            java.util.Map r0 = r0.A02
            com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState r1 = com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState.A00(r8, r1, r4, r2, r0)
            r8 = 2
            if (r9 == 0) goto L_0x003b
            java.util.Iterator r4 = r9.iterator()
        L_0x02cd:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x003b
            java.lang.Object r3 = r4.next()
            X.JwH r3 = (X.C61079JwH) r3
            java.lang.Object r0 = r3.A00
            X.Khy r0 = (X.C62568Khy) r0
            if (r0 == 0) goto L_0x02cd
            int r2 = r0.ordinal()
            if (r2 == r6) goto L_0x02fc
            r0 = 1
            if (r2 == r0) goto L_0x0303
            if (r2 == r8) goto L_0x02f4
            if (r2 != r7) goto L_0x02cd
            java.lang.Object r0 = r3.A01
            if (r0 == 0) goto L_0x02cd
            X.C64182LSo.A02(r5, r1)
            goto L_0x02cd
        L_0x02f4:
            java.lang.Object r0 = r3.A01
            if (r0 == 0) goto L_0x02cd
            X.C64182LSo.A03(r5, r1)
            goto L_0x02cd
        L_0x02fc:
            java.lang.Object r0 = r3.A01
            if (r0 == 0) goto L_0x02cd
            java.util.Map r0 = r1.A04
            goto L_0x0309
        L_0x0303:
            java.lang.Object r0 = r3.A01
            if (r0 == 0) goto L_0x02cd
            java.util.Map r0 = r1.A02
        L_0x0309:
            r0.size()
            goto L_0x02cd
        L_0x030d:
            android.content.Context r5 = X.C51968G9o.A0J(r0)
            java.lang.Object r0 = r1.A04
            X.GTH r0 = (X.GTH) r0
            com.instagram.common.session.UserSession r4 = r0.A00
            java.lang.Object r3 = r1.A01
            X.1Xj r3 = (X.1Xj) r3
            java.lang.Object r0 = r1.A02
            X.GTG r0 = (X.GTG) r0
            int r2 = r0.A00
            java.lang.Object r0 = r1.A03
            X.1Xl r0 = (X.1Xl) r0
            java.lang.String r1 = X.1sx.A04(r5, r4, r3, r0, r2)
            return r1
        L_0x032a:
            android.content.Context r4 = X.C51968G9o.A0J(r0)
            java.lang.Object r0 = r1.A04
            X.GTH r0 = (X.GTH) r0
            com.instagram.common.session.UserSession r3 = r0.A00
            java.lang.Object r0 = r1.A01
            X.1Xj r0 = (X.1Xj) r0
            com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf r0 = X.C231122qu.A00(r3, r0)
            if (r0 == 0) goto L_0x0361
            com.instagram.api.schemas.OnFeedMessagesIntf r0 = r0.BTY()
        L_0x0342:
            r2 = 2
            int r0 = X.AnonymousClass3ZO.A00(r0)
            if (r2 != r0) goto L_0x0363
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321786803136275(0x810a7900022713, double:3.03338245817495E-306)
            boolean r1 = X.182.A06(r2, r3, r0)
            r0 = 2131957204(0x7f1315d4, float:1.9550985E38)
            if (r1 == 0) goto L_0x035c
            r0 = 2131957205(0x7f1315d5, float:1.9550987E38)
        L_0x035c:
            java.lang.String r1 = X.C51967G9n.A0p(r4, r0)
            return r1
        L_0x0361:
            r0 = 0
            goto L_0x0342
        L_0x0363:
            java.lang.Object r2 = r1.A03
            X.1Xl r2 = (X.1Xl) r2
            java.lang.Object r0 = r1.A02
            X.GTG r0 = (X.GTG) r0
            int r0 = r0.A00
            java.lang.String r1 = X.1sx.A06(r4, r3, r2, r0)
            return r1
        L_0x0372:
            java.lang.Object r0 = r1.A04
            X.Jw9 r0 = (X.C61071Jw9) r0
            java.lang.Object r0 = r0.A00
            X.GTI r0 = (X.GTI) r0
            java.lang.Object r4 = r0.A0B
            X.0sK r4 = (X.0sK) r4
            java.lang.Object r0 = r1.A01
            X.GTD r0 = (X.GTD) r0
            com.instagram.common.ui.widget.imageview.IgImageView r3 = r0.A08
            java.lang.Object r0 = r1.A02
            X.0r1 r0 = (X.0r1) r0
            boolean r0 = r0.A00
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            java.lang.Object r0 = r1.A03
            X.0r1 r0 = (X.0r1) r0
            boolean r0 = r0.A00
            X.C51967G9n.A1N(r3, r2, r4, r0)
            goto L_0x11a5
        L_0x0399:
            java.lang.Object r0 = r1.A02
            X.3Zn r0 = (X.C243613Zn) r0
            X.0eM r0 = r0.A03
            java.lang.Object r2 = r0.getValue()
            X.A4D r2 = (X.A4D) r2
            java.lang.Object r0 = r1.A03
            X.3Za r0 = (X.C243503Za) r0
            X.9IZ r4 = r0.A03
            java.lang.Object r6 = r1.A01
            X.3W1 r6 = (X.AnonymousClass3W1) r6
            java.lang.Object r0 = r1.A04
            X.3Zf r0 = (X.C243553Zf) r0
            X.4DU r5 = r0.A01
            X.AnonymousClass7TG.A1N(r4, r6)
            r8 = 2
            X.0qQ.A0B(r5, r8)
            X.3ZZ r3 = r2.A00
            X.3Wa r0 = r3.A01
            X.32i r2 = r0.BD7()
            java.lang.Object r4 = r4.A03
            X.1Xj r4 = (X.1Xj) r4
            X.3WA r1 = X.AnonymousClass3WA.ADS_LWNF
            r0 = 0
            r2.DJB(r0, r4, r1, r6)
            com.instagram.common.session.UserSession r3 = r3.A00
            r7 = 1
            X.0wc r1 = X.C51967G9n.A0Z(r5, r3, r4, r8)
            r0 = 1075(0x433, float:1.506E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x03fc
            X.HON r1 = X.HON.X_OUT_CLICK
            java.lang.String r0 = "event_type"
            r2.A8M(r1, r0)
            java.lang.String r1 = r4.C9L()
            if (r1 != 0) goto L_0x03f4
            java.lang.String r1 = ""
        L_0x03f4:
            java.lang.String r0 = "ad_client_token"
            r2.AAJ(r0, r1)
            r2.Cgf()
        L_0x03fc:
            java.lang.String r2 = "hide_button"
            X.3sc r1 = X.C51967G9n.A0c(r3, r4, r5, r2)
            java.lang.String r0 = r4.C9L()
            r1.A7J = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r1.A1c = r0
            int r0 = r6.getPosition()
            r1.A09(r0)
            boolean r0 = X.C231122qu.A0R(r3, r4)
            r1.A8B = r0
            X.C51972G9s.A1A(r1)
            X.C233822wX.A0A(r3, r1, r4)
            X.C233822wX.A0D(r3, r1, r4, r2)
            int r0 = r6.A03
            X.C233822wX.A0E(r3, r1, r4, r5, r0)
            goto L_0x11a5
        L_0x042b:
            java.lang.Object r4 = r1.A02
            X.1Xj r4 = (X.1Xj) r4
            com.instagram.api.schemas.OriginalSoundDataIntf r0 = r4.A1J()
            boolean r0 = X.AnonymousClass7TF.A1V(r0)
            if (r0 == 0) goto L_0x045b
            X.1sP r0 = X.DA2.A00()
            X.5nz r2 = new X.5nz
            r2.<init>(r0)
            com.instagram.api.schemas.OriginalSoundDataIntf r0 = r4.A1J()
            r2.A09 = r0
            X.1sP r3 = r2.A00()
        L_0x044c:
            java.lang.Object r2 = r1.A01
            X.3Wa r2 = (X.C242813Wa) r2
            java.lang.Object r1 = r1.A03
            X.3W1 r1 = (X.AnonymousClass3W1) r1
            X.8ZN r0 = X.AnonymousClass8ZN.MUSIC_IN_FEED
            r2.D3b(r0, r3, r4, r1)
            goto L_0x11a5
        L_0x045b:
            X.3ZH r0 = r4.A1Y()
            com.instagram.api.schemas.MusicInfo r2 = X.C51976G9y.A0F(r0)
            java.lang.Object r0 = r1.A04
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.1E5 r0 = X.1E4.A00(r0)
            X.1sP r3 = X.HWN.A00(r0, r2)
            goto L_0x044c
        L_0x0470:
            X.6Gb r0 = (X.C305006Gb) r0
            r6 = 0
            X.0qQ.A0B(r0, r6)
            java.lang.Object r5 = r1.A04
            X.Jw8 r5 = (X.C61070Jw8) r5
            java.lang.Object r2 = r5.A02
            int r4 = X.AnonymousClass7TE.A0M(r2)
            r3 = 1
            r2 = 3
            r9 = 0
            if (r4 == r2) goto L_0x04a0
            if (r4 == r6) goto L_0x049d
            if (r4 == r3) goto L_0x049d
            r2 = 2
            if (r4 != r2) goto L_0x0500
            java.lang.Object r8 = r1.A01
            java.util.List r8 = (java.util.List) r8
            boolean r2 = r8.isEmpty()
            if (r2 == 0) goto L_0x04a3
            X.0sK r1 = X.C55420HhQ.A02
        L_0x0498:
            r0.Cf4(r9, r1)
            goto L_0x11a5
        L_0x049d:
            X.0sK r1 = X.C55420HhQ.A01
            goto L_0x0498
        L_0x04a0:
            X.0sK r1 = X.C55420HhQ.A00
            goto L_0x0498
        L_0x04a3:
            java.lang.String r2 = r5.A03
            int r2 = r2.length()
            if (r2 != 0) goto L_0x04dd
            java.lang.Object r3 = r1.A03
            java.util.List r3 = (java.util.List) r3
            boolean r2 = X.AnonymousClass7TE.A1b(r3)
            if (r2 == 0) goto L_0x04d7
            X.0sK r2 = X.C55420HhQ.A03
            r0.Cf4(r9, r2)
            java.lang.Object r7 = r1.A02
            java.util.Iterator r6 = r3.iterator()
        L_0x04c0:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x04d7
            java.lang.Object r5 = r6.next()
            r4 = -1429859044(0xffffffffaac6151c, float:-3.5186513E-13)
            r3 = 7
            X.JJS r2 = new X.JJS
            r2.<init>(r3, r7, r5)
            X.C51967G9n.A10(r0, r2, r4)
            goto L_0x04c0
        L_0x04d7:
            X.0sK r2 = X.C55420HhQ.A04
            r0.Cf4(r9, r2)
            goto L_0x04e2
        L_0x04dd:
            X.0sK r2 = X.C55420HhQ.A05
            r0.Cf4(r9, r2)
        L_0x04e2:
            java.lang.Object r6 = r1.A02
            java.util.Iterator r5 = r8.iterator()
        L_0x04e8:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x11a5
            java.lang.Object r4 = r5.next()
            r3 = -2103024942(0xffffffff82a662d2, float:-2.4448228E-37)
            r2 = 8
            X.JJS r1 = new X.JJS
            r1.<init>(r2, r6, r4)
            X.C51967G9n.A10(r0, r1, r3)
            goto L_0x04e8
        L_0x0500:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0505:
            X.6Gb r3 = X.C51968G9o.A0L(r0)
            java.lang.Object r7 = r1.A03
            X.GqI r7 = (X.C53547GqI) r7
            java.util.List r6 = r7.A04
            java.lang.Object r8 = r1.A04
            java.lang.Object r9 = r1.A02
            java.lang.Object r10 = r1.A01
            X.J3U r2 = X.J3U.A00
            int r1 = r6.size()
            r0 = 44
            X.J6S r0 = X.J6S.A00(r2, r6, r0)
            r5 = 3
            X.JJi r4 = new X.JJi
            r4.<init>(r5, r6, r7, r8, r9, r10)
            X.C51971G9r.A10(r3, r4, r0, r1)
            goto L_0x11a5
        L_0x052c:
            r2 = 0
            X.0qQ.A0B(r0, r2)
            java.lang.Object r5 = r1.A02
            java.util.List r5 = (java.util.List) r5
            java.util.HashSet r6 = X.AnonymousClass7TE.A1F()
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r5.iterator()
        L_0x0540:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0559
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.N4t r0 = (X.N4t) r0
            com.instagram.user.model.User r0 = r0.A02()
            java.lang.String r0 = r0.getId()
            X.C51971G9r.A1O(r0, r2, r6, r4)
            goto L_0x0540
        L_0x0559:
            java.lang.Object r10 = r1.A04
            X.NdD r10 = (X.C69028NdD) r10
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r8 = r4.iterator()
        L_0x0565:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0589
            java.lang.Object r7 = r8.next()
            r6 = r7
            X.N4t r6 = (X.N4t) r6
            com.instagram.common.session.UserSession r4 = r10.A02
            X.0Tu r0 = X.0Tu.A05
            r2 = 36321769626740476(0x810a75003726fc, double:3.033371595753083E-306)
            boolean r0 = X.182.A06(r0, r4, r2)
            if (r0 != 0) goto L_0x0585
            boolean r0 = r6.A0J
            if (r0 != 0) goto L_0x0565
        L_0x0585:
            r9.add(r7)
            goto L_0x0565
        L_0x0589:
            com.instagram.common.session.UserSession r3 = r10.A02
            r2 = 10
            X.PcS r0 = new X.PcS
            r0.<init>((java.lang.Object) r3, (int) r2)
            java.util.List r3 = X.00k.A0g(r9, r0)
            r2 = 36
            X.PcU r0 = new X.PcU
            r0.<init>(r2)
            java.util.List r4 = X.00k.A0g(r3, r0)
            r2 = 5
            X.Ijv r0 = new X.Ijv
            r0.<init>(r2)
            java.util.List r0 = X.00k.A0g(r5, r0)
            java.util.Set r3 = X.00k.A0k(r0)
            java.lang.Object r2 = r1.A01
            X.Gmr r2 = (X.C53367Gmr) r2
            java.lang.Object r0 = r1.A03
            X.O93 r0 = (X.O93) r0
            X.N8r r1 = X.C68280N8r.A00(r0, r2, r4, r3)
            return r1
        L_0x05bc:
            com.instagram.common.gallery.Medium r0 = (com.instagram.common.gallery.Medium) r0
            r2 = 0
            X.0qQ.A0B(r0, r2)
            long r6 = r0.A0D
            java.lang.Object r5 = r1.A03
            X.0rl r5 = (X.0rl) r5
            long r3 = r5.A00
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x05d0
            r5.A00 = r6
        L_0x05d0:
            java.lang.Object r5 = r1.A02
            X.0rl r5 = (X.0rl) r5
            long r3 = r5.A00
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x05dc
            r5.A00 = r6
        L_0x05dc:
            java.lang.Object r3 = r1.A01
            android.util.ArrayMap r3 = (android.util.ArrayMap) r3
            java.lang.String r2 = r0.A0V
            boolean r2 = r3.containsKey(r2)
            if (r2 != 0) goto L_0x11a5
            java.lang.String r2 = r0.A0V
            java.lang.Object r1 = r1.A04
            X.JY1 r1 = (X.JY1) r1
            android.content.Context r1 = r1.A01
            android.content.ContentResolver r1 = r1.getContentResolver()
            X.0qQ.A07(r1)
            double[] r0 = r0.A07(r1)
            r3.put(r2, r0)
            goto L_0x11a5
        L_0x0600:
            com.instagram.common.gallery.Medium r0 = (com.instagram.common.gallery.Medium) r0
            r2 = 0
            X.0qQ.A0B(r0, r2)
            java.lang.String r2 = r0.A0V
            if (r2 == 0) goto L_0x0610
            java.lang.String r2 = r0.A0Z
            if (r2 == 0) goto L_0x0610
            goto L_0x11a5
        L_0x0610:
            java.lang.Object r2 = r1.A02
            X.GVG r2 = (X.GVG) r2
            X.GmP r3 = r2.A00
            int r2 = r3.A03
            int r2 = r2 + 1
            r3.A03 = r2
            java.util.List r2 = X.AnonymousClass7TE.A1I(r0)
            X.KhF r3 = X.C63276KuL.A00(r2)
            X.KhF r2 = X.C62523KhF.A04
            java.lang.Object r6 = r1.A04
            X.LOB r6 = (X.LOB) r6
            if (r3 == r2) goto L_0x064d
            java.util.Map r1 = r6.A01
            java.lang.Object r1 = r1.get(r3)
            X.L6d r1 = (X.C63771L6d) r1
            if (r1 == 0) goto L_0x064a
            java.util.PriorityQueue r2 = r1.A00
            r2.add(r0)
            int r1 = r2.size()
        L_0x063f:
            int r0 = r6.A02
            if (r1 <= r0) goto L_0x11a5
            if (r2 == 0) goto L_0x11a5
            r2.remove()
            goto L_0x11a5
        L_0x064a:
            r2 = 0
            r1 = 0
            goto L_0x063f
        L_0x064d:
            java.util.List r1 = r6.A00
            java.util.Iterator r9 = r1.iterator()
        L_0x0653:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x11a5
            java.lang.Object r8 = r9.next()
            X.L6d r8 = (X.C63771L6d) r8
            long r4 = r0.A0D
            X.0eP r7 = r8.A02
            java.lang.Object r1 = r7.A00
            long r2 = X.AnonymousClass7TE.A0R(r1)
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x0653
            long r4 = r0.A0D
            java.lang.Object r1 = r7.A01
            long r2 = X.AnonymousClass7TE.A0R(r1)
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x0653
            java.util.PriorityQueue r3 = r8.A00
            r3.add(r0)
            int r2 = r3.size()
            int r1 = r6.A02
            if (r2 <= r1) goto L_0x0653
            r3.remove()
            goto L_0x0653
        L_0x068a:
            java.util.List r0 = (java.util.List) r0
            r2 = 0
            X.0qQ.A0B(r0, r2)
            java.lang.Object r3 = r1.A04
            X.SHP r3 = (X.SHP) r3
            java.lang.Object r5 = r1.A03
            java.lang.Object r7 = r1.A01
            X.0sP r7 = (X.0sP) r7
            r4 = 2131434095(0x7f0b1a6f, float:1.8489994E38)
            java.util.Iterator r2 = r0.iterator()
        L_0x06a1:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x06b9
            java.lang.Object r10 = r2.next()
            r1 = r10
            com.instagram.jobscheduler.bgfetch.IgBgFetchJob r1 = (com.instagram.jobscheduler.bgfetch.IgBgFetchJob) r1
            int r1 = r1.A00
            if (r1 != r4) goto L_0x06a1
        L_0x06b2:
            if (r10 != 0) goto L_0x06bb
            r7.invoke(r0)
            goto L_0x11a5
        L_0x06b9:
            r10 = 0
            goto L_0x06b2
        L_0x06bb:
            r12 = 7
            X.IxY r6 = new X.IxY
            r8 = r0
            r9 = r3
            r11 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12)
            boolean r0 = r5 instanceof X.C8816RAs
            if (r0 == 0) goto L_0x06dc
            com.instagram.casper.IgSignalsCasper r2 = r3.A00
            if (r2 == 0) goto L_0x06dc
            com.instagram.igsignals.predictors.dcp.IgSignalsDcpPredictor r0 = r2.A01
            if (r0 == 0) goto L_0x06dc
            r1 = 16
            X.MPB r0 = new X.MPB
            r0.<init>((int) r1, (java.lang.Object) r6, (java.lang.Object) r3)
            r2.A03(r0)
            goto L_0x11a5
        L_0x06dc:
            X.SHP.A00(r3, r6)
            goto L_0x11a5
        L_0x06e1:
            int r7 = X.AnonymousClass7TE.A0M(r0)
            java.lang.Object r6 = r1.A04
            com.instagram.newsfeed.fragment.NewsfeedFragment r6 = (com.instagram.newsfeed.fragment.NewsfeedFragment) r6
            java.lang.Object r5 = r1.A02
            java.util.List r5 = (java.util.List) r5
            java.lang.String r4 = X.AnonymousClass7TE.A19(r5, r7)
            X.0eM r8 = r6.A0A
            X.0lg r0 = X.DbT.A0X(r8)
            X.0wc r2 = X.AnonymousClass0kN.A01(r6, r0)
            r0 = 4887(0x1317, float:6.848E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r2, r0)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x0742
            java.lang.String r2 = "ig_af_pill_click"
            java.lang.String r0 = "event_name"
            r3.AAJ(r0, r2)
            java.util.List r2 = java.util.Collections.emptyList()
            r0 = 4683(0x124b, float:6.562E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.AAe(r0, r2)
            java.util.List r2 = java.util.Collections.emptyList()
            r0 = 4583(0x11e7, float:6.422E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.AAe(r0, r2)
            java.util.List r2 = java.util.Collections.emptyList()
            java.lang.String r0 = "filters"
            r3.AAe(r0, r2)
            java.lang.String r0 = "pills"
            r3.AAe(r0, r5)
            java.lang.String r0 = "clicked_pill"
            r3.AAJ(r0, r4)
            r3.Cgf()
        L_0x0742:
            com.instagram.newsfeed.fragment.NewsfeedFragment.A01(r6)
            int r0 = r6.A00
            if (r7 == r0) goto L_0x11a5
            r6.A00 = r7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            java.lang.Integer r0 = X.C51967G9n.A0k()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x07a7
            r0 = 5080(0x13d8, float:7.119E-42)
            java.lang.String r5 = X.AnonymousClass000.A00(r0)
        L_0x075f:
            java.lang.Object r4 = r1.A01
            X.0hq r4 = (X.0hq) r4
            androidx.fragment.app.Fragment r2 = r4.A0R(r5)
            java.lang.String r3 = "Required value was null."
            if (r2 == 0) goto L_0x0783
            X.0s1 r1 = new X.0s1
            r1.<init>(r4)
            X.Dcv r0 = r6.A05
            if (r0 == 0) goto L_0x07b2
            r1.A0M(r0)
            r1.A0N(r2)
        L_0x077a:
            r1.A00()
            X.Dcv r2 = (X.C46352Dcv) r2
            r6.A05 = r2
            goto L_0x11a5
        L_0x0783:
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r8)
            java.lang.Object r0 = r1.A03
            java.lang.Object r1 = X.C51966G9m.A19(r0, r7)
            com.instagram.newsfeed.model.PillsFilterCategory r1 = (com.instagram.newsfeed.model.PillsFilterCategory) r1
            r0 = 0
            X.Dcv r2 = X.C49014Enq.A00(r2, r1, r0)
            X.0s1 r1 = new X.0s1
            r1.<init>(r4)
            X.Dcv r0 = r6.A05
            if (r0 == 0) goto L_0x07b7
            r1.A0M(r0)
            r0 = 2131436965(0x7f0b25a5, float:1.8495815E38)
            r1.A0C(r2, r5, r0)
            goto L_0x077a
        L_0x07a7:
            r0 = 3627(0xe2b, float:5.083E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r5 = X.002.A0O(r0, r7)
            goto L_0x075f
        L_0x07b2:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        L_0x07b7:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        L_0x07bc:
            r2 = 0
            X.0qQ.A0B(r0, r2)
            java.lang.Object r4 = r1.A04
            X.0sJ r4 = (X.0sJ) r4
            java.lang.Object r3 = r1.A02
            java.lang.Object r2 = r1.A01
            java.lang.Object r1 = r1.A03
            r4.invoke(r3, r0, r2, r1)
            goto L_0x11a5
        L_0x07cf:
            X.Gln r0 = (X.C53301Gln) r0
            r3 = 0
            X.0qQ.A0B(r0, r3)
            java.lang.Object r2 = r1.A02
            X.5Oz r2 = (X.C284945Oz) r2
            X.C51967G9n.A16(r2, r3)
            int r2 = r0.A00
            if (r2 != r3) goto L_0x07ef
            java.lang.Object r2 = r1.A03
            X.0sP r2 = (X.0sP) r2
            java.lang.Object r0 = r1.A01
            X.Hns r0 = (X.C55812Hns) r0
            com.instagram.user.model.User r0 = r0.A02
            r2.invoke(r0)
            goto L_0x11a5
        L_0x07ef:
            r0 = 1
            if (r2 != r0) goto L_0x11a5
            java.lang.Object r2 = r1.A04
            X.0sL r2 = (X.0sL) r2
            java.lang.Object r1 = r1.A01
            X.Hns r1 = (X.C55812Hns) r1
            X.3WR r0 = r1.A03
            java.lang.String r0 = r0.A0G
            com.instagram.user.model.User r1 = r1.A02
            goto L_0x0e49
        L_0x0802:
            X.HPe r0 = (X.C54699HPe) r0
            X.HDA r2 = X.HDA.A00
            boolean r2 = X.0qQ.A0K(r0, r2)
            r3 = 8
            r7 = 0
            if (r2 == 0) goto L_0x081f
            java.lang.Object r0 = r1.A02
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r7)
            java.lang.Object r0 = r1.A03
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r3)
            goto L_0x11a5
        L_0x081f:
            boolean r2 = r0 instanceof X.HD9
            if (r2 == 0) goto L_0x08f5
            java.lang.Object r2 = r1.A02
            android.view.View r2 = (android.view.View) r2
            r2.setVisibility(r3)
            java.lang.Object r2 = r1.A03
            android.view.View r2 = (android.view.View) r2
            r2.setVisibility(r7)
            java.lang.Object r6 = r1.A01
            X.NKx r6 = (X.C68504NKx) r6
            java.lang.Object r3 = r1.A04
            X.E3x r3 = (X.C47473E3x) r3
            android.content.Context r8 = r3.requireContext()
            X.HD9 r0 = (X.HD9) r0
            java.util.List r2 = r0.A00
            X.0eM r0 = r3.A02
            java.lang.Object r1 = r0.getValue()
            r0 = 5
            X.FyG r9 = new X.FyG
            r9.<init>(r1, r0)
            r0 = 6
            X.FyG r5 = new X.FyG
            r5.<init>(r3, r0)
            r0 = 22
            X.FyD r4 = new X.FyD
            r4.<init>(r3, r0)
            r0 = 1
            X.0qQ.A0B(r2, r0)
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r2)
            java.util.Iterator r12 = r2.iterator()
        L_0x0866:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x08f0
            java.lang.Object r10 = r12.next()
            X.G55 r10 = (X.G55) r10
            boolean r0 = r10 instanceof X.Fg0
            if (r0 == 0) goto L_0x0882
            r0 = 2131952914(0x7f130512, float:1.9542284E38)
            X.DfA r1 = new X.DfA
            r1.<init>((int) r0)
        L_0x087e:
            r3.add(r1)
            goto L_0x0866
        L_0x0882:
            boolean r0 = r10 instanceof X.C50642Fg2
            if (r0 == 0) goto L_0x0898
            r11 = 2131952882(0x7f1304f2, float:1.954222E38)
            X.Fg2 r10 = (X.C50642Fg2) r10
            boolean r2 = r10.A00
            X.IEB r0 = new X.IEB
            r0.<init>(r9, r7)
            X.PR9 r1 = new X.PR9
            r1.<init>((android.widget.CompoundButton.OnCheckedChangeListener) r0, (int) r11, (boolean) r2)
            goto L_0x087e
        L_0x0898:
            boolean r0 = r10 instanceof X.C50641Fg1
            if (r0 == 0) goto L_0x08c4
            r0 = 2131952916(0x7f130514, float:1.9542288E38)
            java.lang.String r10 = X.AnonymousClass7TE.A16(r8, r0)
            r0 = 2131952883(0x7f1304f3, float:1.9542221E38)
            java.lang.String r0 = X.DbW.A0h(r8, r10, r0)
            android.text.SpannableStringBuilder r2 = X.DbS.A0C(r0)
            int r0 = X.2Yu.A0D(r8)
            int r1 = r8.getColor(r0)
            X.HFw r0 = new X.HFw
            r0.<init>(r4, r1, r7)
            X.AnonymousClass7AV.A05(r2, r0, r10)
            X.FGF r1 = new X.FGF
            r1.<init>((java.lang.CharSequence) r2)
            goto L_0x087e
        L_0x08c4:
            boolean r0 = r10 instanceof X.C50643Fg3
            if (r0 == 0) goto L_0x08da
            r0 = r10
            X.Fg3 r0 = (X.C50643Fg3) r0
            int r2 = r0.A00
            r1 = 16
            X.FPG r0 = new X.FPG
            r0.<init>((int) r1, (java.lang.Object) r5, (java.lang.Object) r10)
            X.Fmc r1 = new X.Fmc
            r1.<init>((android.content.Context) r8, (android.view.View.OnClickListener) r0, (int) r2)
            goto L_0x087e
        L_0x08da:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "unsupported settings item "
            r1.append(r0)
            java.lang.Class r0 = r10.getClass()
            java.lang.String r0 = X.AnonymousClass7TF.A0i(r0, r1)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x08f0:
            r6.setItems(r3)
            goto L_0x11a5
        L_0x08f5:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x08fa:
            X.N4R r0 = (X.N4R) r0
            r2 = 0
            X.0qQ.A0B(r0, r2)
            java.lang.Object r8 = r1.A04
            X.Odx r8 = (X.C71143Odx) r8
            java.lang.Object r7 = r1.A01
            com.facebook.msys.mci.AccountSession r7 = (com.facebook.msys.mci.AccountSession) r7
            java.lang.Object r6 = r1.A02
            com.facebook.rsys.crypto.gen.CryptoContextHolder r6 = (com.facebook.rsys.crypto.gen.CryptoContextHolder) r6
            java.lang.Object r9 = r1.A03
            X.0sP r9 = (X.0sP) r9
            com.facebook.msys.mci.AccountSession r1 = r8.A02
            boolean r1 = X.0qQ.A0K(r1, r7)
            if (r1 != 0) goto L_0x0949
            r1 = 1
            java.util.concurrent.CountDownLatch r10 = new java.util.concurrent.CountDownLatch
            r10.<init>(r1)
            java.lang.Object r5 = r0.A00
            X.OEP r5 = (X.OEP) r5
            X.Gy4 r4 = new X.Gy4
            r4.<init>(r10)
            com.facebook.rsys.callmanager.callclient.gen.CallManagerCallClient r3 = r5.A00
            com.instagram.rtc.rsys.proxies.IGRTCSignalingCoordinator r1 = r5.A02
            java.lang.String r2 = r1.getUserId()
            java.lang.String r1 = ""
            r3.unregisterUser(r2, r1, r4)
            r10.await()     // Catch:{ InterruptedException -> 0x0938 }
            goto L_0x0942
        L_0x0938:
            r4 = move-exception
            X.OWb r3 = X.C71004OWb.A00
            java.lang.String r2 = "RtcRsysInteractor"
            java.lang.String r1 = "Exception while unregistering user from RTC Call Manager"
            r3.A02(r2, r1, r4)
        L_0x0942:
            com.instagram.rtc.rsys.proxies.IGRTCCallManager r1 = r5.A01
            r1.registerUser(r6)
            r8.A02 = r7
        L_0x0949:
            r9.invoke(r0)
            goto L_0x11a5
        L_0x094e:
            int r3 = X.AnonymousClass7TE.A0M(r0)
            java.lang.Object r2 = r1.A04
            X.0eP r2 = (X.0eP) r2
            int r0 = X.C51970G9q.A0B(r2)
            if (r3 < r0) goto L_0x0969
            int r0 = X.C51969G9p.A0A(r2)
            if (r3 > r0) goto L_0x0969
            java.lang.Object r0 = r1.A02
        L_0x0964:
            X.DbS.A1U(r0)
            goto L_0x11a5
        L_0x0969:
            java.lang.Object r2 = r1.A03
            X.0eP r2 = (X.0eP) r2
            int r0 = X.C51970G9q.A0B(r2)
            if (r3 < r0) goto L_0x11a5
            int r0 = X.C51969G9p.A0A(r2)
            if (r3 > r0) goto L_0x11a5
            java.lang.Object r0 = r1.A01
            goto L_0x0964
        L_0x097c:
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r4 = r1.A02
            com.instagram.common.gallery.model.GalleryItem r4 = (com.instagram.common.gallery.model.GalleryItem) r4
            com.instagram.common.gallery.Medium r2 = r4.A00
            if (r2 == 0) goto L_0x098a
            com.instagram.common.gallery.metadata.MediaUploadMetadata r2 = r2.A0G
            r2.A03 = r0
        L_0x098a:
            java.lang.Object r2 = r1.A01
            X.0rm r2 = (X.0rm) r2
            r2.A00 = r0
            java.lang.Object r2 = r1.A04
            X.LQQ r2 = (X.LQQ) r2
            com.instagram.ui.widget.mediapicker.MediaPickerItemView r3 = r2.A00
            com.instagram.common.gallery.model.GalleryItem r2 = r3.A04
            boolean r2 = X.0qQ.A0K(r2, r4)
            if (r2 == 0) goto L_0x11a5
            java.lang.Object r1 = r1.A03
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            boolean r0 = X.C59737JVv.A06(r1, r0)
            if (r0 == 0) goto L_0x11a5
            X.JbN r0 = X.C59898JbN.GLASSES_CAPTURE
            r3.setTopLeftIcon(r0)
            goto L_0x11a5
        L_0x09af:
            boolean r6 = X.AnonymousClass7TE.A1a(r0)
            java.lang.Object r0 = r1.A01
            X.6Rx r0 = (X.C307896Rx) r0
            X.5ur r2 = new X.5ur
            r2.<init>(r0)
            java.lang.Object r3 = r1.A04
            X.4uI r3 = (X.C277014uI) r3
            java.lang.Object r5 = r1.A02
            X.Oaw r5 = (X.C71077Oaw) r5
            java.lang.Object r4 = r1.A03
            X.4uI r4 = (X.C277014uI) r4
            X.IjR r1 = new X.IjR
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x09e7
        L_0x09ce:
            boolean r6 = X.AnonymousClass7TE.A1a(r0)
            java.lang.Object r2 = r1.A01
            X.5ur r2 = (X.C299275ur) r2
            java.lang.Object r3 = r1.A04
            X.4uI r3 = (X.C277014uI) r3
            java.lang.Object r5 = r1.A02
            X.Oaw r5 = (X.C71077Oaw) r5
            java.lang.Object r4 = r1.A03
            X.4uI r4 = (X.C277014uI) r4
            X.IjS r1 = new X.IjS
            r1.<init>(r2, r3, r4, r5, r6)
        L_0x09e7:
            X.11Z.A02(r1)
            goto L_0x11a5
        L_0x09ec:
            X.Hme r0 = (X.C55743Hme) r0
            java.lang.Object r3 = r1.A02
            X.61u r3 = (X.C3021461u) r3
            boolean r2 = r0.A02
            r3.setPrimaryActionIsLoading(r2)
            java.lang.Object r0 = r0.A01
            X.Nk4 r0 = (X.C69364Nk4) r0
            int r2 = r0.ordinal()
            r4 = 1
            r0 = 0
            if (r2 == r0) goto L_0x0a40
            if (r2 == r4) goto L_0x0a43
            r0 = 2
            if (r2 == r0) goto L_0x0a3d
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0a0d:
            X.Hme r0 = (X.C55743Hme) r0
            java.lang.Object r3 = r1.A02
            X.61u r3 = (X.C3021461u) r3
            boolean r2 = r0.A02
            r3.setPrimaryActionIsLoading(r2)
            java.lang.Object r3 = r0.A01
            r0 = r3
            X.Uwv r0 = (X.C16548Uwv) r0
            int r2 = r0.ordinal()
            r4 = 1
            if (r2 == r4) goto L_0x0a40
            r0 = 2
            if (r2 == r0) goto L_0x0a43
            r0 = 0
            if (r2 == r0) goto L_0x0a3d
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            r0 = 486(0x1e6, float:6.81E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r3, r0, r1)
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0a3d:
            java.lang.Object r0 = r1.A03
            goto L_0x0a45
        L_0x0a40:
            java.lang.Object r0 = r1.A01
            goto L_0x0a45
        L_0x0a43:
            java.lang.Object r0 = r1.A04
        L_0x0a45:
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            r0.setChecked(r4)
            goto L_0x11a5
        L_0x0a4c:
            X.Hme r0 = (X.C55743Hme) r0
            java.lang.Object r3 = r1.A02
            X.61u r3 = (X.C3021461u) r3
            boolean r2 = r0.A02
            r3.setPrimaryActionIsLoading(r2)
            java.lang.Object r2 = r1.A01
            com.instagram.igds.components.textcell.IgdsListCell r2 = (com.instagram.igds.components.textcell.IgdsListCell) r2
            java.lang.Object r4 = r0.A01
            X.Nk0 r0 = X.C69360Nk0.EVERYONE
            r3 = 1
            boolean r0 = X.AnonymousClass7TF.A1W(r4, r0)
            r2.setChecked(r0)
            java.lang.Object r2 = r1.A04
            com.instagram.igds.components.textcell.IgdsListCell r2 = (com.instagram.igds.components.textcell.IgdsListCell) r2
            X.Nk0 r0 = X.C69360Nk0.PEOPLE_YOU_FOLLOW
            boolean r0 = X.AnonymousClass7TF.A1W(r4, r0)
            r2.setChecked(r0)
            java.lang.Object r1 = r1.A03
            com.instagram.igds.components.textcell.IgdsListCell r1 = (com.instagram.igds.components.textcell.IgdsListCell) r1
            X.Nk0 r0 = X.C69360Nk0.OFF
            if (r4 == r0) goto L_0x0a7d
            r3 = 0
        L_0x0a7d:
            r1.setChecked(r3)
            goto L_0x11a5
        L_0x0a82:
            java.lang.Object r2 = r1.A04
            java.lang.Object r0 = r1.A03
            com.meta.compose.component.swipeable.SwipeableState r0 = (com.meta.compose.component.swipeable.SwipeableState) r0
            X.5Oz r3 = r0.A07
            boolean r0 = X.C51969G9p.A1U(r3, r2)
            if (r0 != 0) goto L_0x0aa8
            java.lang.Object r2 = r1.A02
            X.0sP r2 = (X.0sP) r2
            java.lang.Object r0 = r3.getValue()
            r2.invoke(r0)
            java.lang.Object r1 = r1.A01
            X.5Oz r1 = (X.C284945Oz) r1
            boolean r0 = X.C51971G9r.A1W(r1)
            r0 = r0 ^ 1
            X.C51967G9n.A16(r1, r0)
        L_0x0aa8:
            r0 = 4
            X.Gc5 r1 = new X.Gc5
            r1.<init>(r0)
            return r1
        L_0x0aaf:
            com.meta.foa.accountswitcher.UserAccountInfo r0 = (com.meta.foa.accountswitcher.UserAccountInfo) r0
            r4 = 0
            X.0qQ.A0B(r0, r4)
            java.lang.Object r2 = r1.A04
            X.Gu2 r2 = (X.C53773Gu2) r2
            com.meta.foa.session.FoaUserSession r3 = r2.A00
            java.lang.String r8 = r2.A01
            java.lang.String r7 = r2.A02
            java.lang.Object r6 = r1.A02
            com.meta.foa.accountswitcher.UserAccountInfo r6 = (com.meta.foa.accountswitcher.UserAccountInfo) r6
            if (r6 != 0) goto L_0x0ae5
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0aca:
            com.meta.foa.accountswitcher.UserAccountInfo r0 = (com.meta.foa.accountswitcher.UserAccountInfo) r0
            r4 = 0
            X.0qQ.A0B(r0, r4)
            java.lang.Object r2 = r1.A04
            X.GtT r2 = (X.C53738GtT) r2
            com.meta.foa.session.FoaUserSession r3 = r2.A00
            java.lang.String r8 = r2.A01
            java.lang.String r7 = r2.A02
            java.lang.Object r6 = r1.A02
            com.meta.foa.accountswitcher.UserAccountInfo r6 = (com.meta.foa.accountswitcher.UserAccountInfo) r6
            if (r6 != 0) goto L_0x0ae5
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0ae5:
            java.lang.Object r5 = r1.A01
            X.F3q r5 = (X.C49726F3q) r5
            java.lang.Integer r13 = X.AnonymousClass05K.A00
            X.Hod r2 = new X.Hod
            r9 = r6
            r10 = r0
            r11 = r5
            r12 = r3
            r14 = r8
            r15 = r7
            r8 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object r0 = r1.A03
            android.content.Context r1 = X.C51966G9m.A0Q(r0)
            X.Di6 r13 = X.C46626Di6.FLEXIBLE_SHEET
            r7 = 0
            java.lang.Integer r15 = X.AnonymousClass05K.A0C
            X.Di7 r12 = X.C46471DfZ.A0S
            X.EX7 r8 = X.C46471DfZ.A0O
            X.EX6 r11 = X.C46471DfZ.A0R
            X.EX5 r10 = X.EX5.SAME_SIZE
            com.meta.foa.cds.CdsBottomSheetDimmingBehaviour$Default r6 = com.meta.foa.cds.CdsBottomSheetDimmingBehaviour.Default.A00
            X.FA0 r5 = new X.FA0
            r9 = r7
            r14 = r7
            r16 = r7
            r17 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.F3f r0 = X.C55360HgS.A00
            X.C49258Es1.A00(r1, r5, r0, r3, r2)
            goto L_0x11a5
        L_0x0b1e:
            X.HmV r0 = (X.C55734HmV) r0
            java.lang.Object r3 = r1.A04
            X.E5V r3 = (X.E5V) r3
            X.0qQ.A0A(r0)
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            boolean r2 = r0.A00
            if (r2 == 0) goto L_0x0b34
            X.EVo r2 = X.C48096EVo.Channels
            r5.add(r2)
        L_0x0b34:
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x0b3d
            X.EVo r0 = X.C48096EVo.Links
            r5.add(r0)
        L_0x0b3d:
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0b81
            java.lang.String r2 = "ProfileTabbedExplorerFragment"
            java.lang.String r0 = "Profile tabbed explorer was opened without any links or channels present."
            X.0wb.A03(r2, r0)
        L_0x0b4a:
            java.lang.Object r8 = r1.A03
            android.view.View r8 = (android.view.View) r8
            java.lang.Object r7 = r1.A02
            android.view.View r7 = (android.view.View) r7
            java.lang.Object r6 = r1.A01
            android.widget.TextView r6 = (android.widget.TextView) r6
            X.UsB r0 = r3.A01
            java.lang.String r5 = "adapter"
            if (r0 == 0) goto L_0x0c35
            java.util.List r0 = r0.A02
            int r4 = r0.size()
            r2 = 1
            r0 = 8
            r1 = 0
            if (r4 != r2) goto L_0x0c8a
            r8.setVisibility(r0)
            r7.setVisibility(r1)
            X.UsB r0 = r3.A01
            if (r0 == 0) goto L_0x0c35
            java.util.List r0 = r0.A02
            java.lang.Object r0 = r0.get(r1)
            X.EVo r0 = (X.C48096EVo) r0
            int r0 = r0.A00
            X.DbU.A1G(r6, r3, r0)
            goto L_0x11a5
        L_0x0b81:
            android.os.Bundle r2 = r3.requireArguments()
            r0 = 999(0x3e7, float:1.4E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = X.C320236s2.A01(r2, r0)
            X.EVo r6 = X.C48096EVo.valueOf(r0)
            X.0eM r0 = r3.A05
            java.lang.Object r0 = r0.getValue()
            X.Dkf r0 = (X.C46752Dkf) r0
            X.17i r2 = r0.A00
            java.lang.String r0 = r0.A01
            com.instagram.user.model.User r8 = r2.A02(r0)
            if (r8 == 0) goto L_0x0c76
            int r2 = r6.ordinal()
            r0 = 1
            if (r2 == r0) goto L_0x0c3d
            r0 = 0
            if (r2 != r0) goto L_0x0c92
            X.0eM r0 = r3.A03
            java.lang.Object r7 = r0.getValue()
            X.6ud r7 = (X.C321716ud) r7
            X.0wc r2 = r7.A01
            r0 = 307(0x133, float:4.3E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r2, r0)
            boolean r0 = r4.isSampled()
            if (r0 == 0) goto L_0x0c76
            X.C321716ud.A03(r7)
            X.Dbb.A1C(r4)
            r0 = 93
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = "source"
            X.Dba.A1B(r4, r0, r2)
            r0 = 3504(0xdb0, float:4.91E-42)
        L_0x0bdc:
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.DbS.A1I(r4, r0)
            java.lang.String r2 = r7.A02
            java.lang.String r0 = "actor_id"
            r4.AAJ(r0, r2)
            com.instagram.user.model.FollowStatus r2 = r8.B6o()
            java.lang.String r0 = r8.getId()
            java.lang.String r2 = X.C321716ud.A01(r7, r2, r0)
            r0 = 702(0x2be, float:9.84E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r4.AAJ(r0, r2)
            X.17M r2 = r8.A02
            java.lang.String r0 = r8.getId()
            java.lang.String r2 = X.C321716ud.A02(r7, r2, r0)
            r0 = 980(0x3d4, float:1.373E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r4.AAJ(r0, r2)
            java.lang.String r0 = r8.getId()
            java.lang.Long r2 = X.DbV.A0q(r0)
            r0 = 901(0x385, float:1.263E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r4.A9F(r0, r2)
            java.util.HashMap r2 = X.AnonymousClass7TE.A1E()
            java.lang.String r0 = "extra"
            r4.A9H(r0, r2)
            X.Dba.A18(r4)
            java.lang.String r2 = r7.A00
            if (r2 != 0) goto L_0x0c6c
            java.lang.String r5 = "sessionId"
        L_0x0c35:
            X.0qQ.A0F(r5)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0c3d:
            X.0eM r0 = r3.A03
            java.lang.Object r7 = r0.getValue()
            X.6ud r7 = (X.C321716ud) r7
            X.0wc r2 = r7.A01
            r0 = 307(0x133, float:4.3E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r2, r0)
            boolean r0 = r4.isSampled()
            if (r0 == 0) goto L_0x0c76
            X.C321716ud.A03(r7)
            X.Dbb.A1C(r4)
            r0 = 93
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = "source"
            X.Dba.A1B(r4, r0, r2)
            r0 = 544(0x220, float:7.62E-43)
            goto L_0x0bdc
        L_0x0c6c:
            java.lang.String r0 = X.AnonymousClass9NF.A01()
            r4.AAJ(r0, r2)
            r4.Cgf()
        L_0x0c76:
            int r2 = r5.indexOf(r6)
            r0 = -1
            if (r2 != r0) goto L_0x0c7e
            r2 = 0
        L_0x0c7e:
            X.UsB r0 = r3.A01
            if (r0 != 0) goto L_0x0c85
            java.lang.String r5 = "adapter"
            goto L_0x0c35
        L_0x0c85:
            r0.A00(r5, r2)
            goto L_0x0b4a
        L_0x0c8a:
            r8.setVisibility(r1)
            r7.setVisibility(r0)
            goto L_0x11a5
        L_0x0c92:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0c97:
            r2 = 0
            X.0qQ.A0B(r0, r2)
            java.lang.Object r3 = r1.A03
            r2 = 29
            X.Ivx r6 = X.C58688Ivx.A00(r3, r0, r2)
            java.lang.Object r3 = r1.A02
            r2 = 30
            X.Ivx r5 = X.C58688Ivx.A00(r3, r0, r2)
            java.lang.Object r3 = r1.A04
            r4 = 0
            if (r3 == 0) goto L_0x0cc6
            r2 = 31
            X.Ivx r3 = X.C58688Ivx.A00(r3, r0, r2)
        L_0x0cb6:
            java.lang.Object r2 = r1.A01
            if (r2 == 0) goto L_0x0cc0
            r1 = 32
            X.Ivx r4 = X.C58688Ivx.A00(r2, r0, r1)
        L_0x0cc0:
            X.Gvz r1 = new X.Gvz
            r1.<init>(r6, r5, r3, r4)
            return r1
        L_0x0cc6:
            r3 = r4
            goto L_0x0cb6
        L_0x0cc8:
            X.GO1 r0 = (X.GO1) r0
            r2 = 0
            X.0qQ.A0B(r0, r2)
            java.util.List r0 = r0.A00
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x11a5
            java.lang.Object r2 = r1.A02
            X.8vc r2 = (X.C369968vc) r2
            java.lang.Object r0 = r1.A01
            android.content.Context r0 = (android.content.Context) r0
            android.content.Context r0 = X.DbT.A05(r0)
            java.lang.Object r3 = r1.A04
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            java.lang.String r5 = X.C394639yR.A00(r0, r2, r3)
            if (r5 != 0) goto L_0x0cf4
            X.51R r0 = r2.A05
            if (r0 == 0) goto L_0x11a5
            java.lang.String r5 = r0.A0E
            if (r5 == 0) goto L_0x11a5
        L_0x0cf4:
            java.lang.String r4 = r2.A09
            long r7 = r2.A02
            r2 = 0
            r6 = r2
            X.AnonymousClass90V.A04(r2, r3, r4, r5, r6, r7)
            goto L_0x11a5
        L_0x0cff:
            X.2WE r0 = (X.2WE) r0
            r7 = 0
            X.0qQ.A0B(r0, r7)
            java.lang.Object r8 = r1.A03
            X.3bE r8 = (X.C244463bE) r8
            java.lang.Object r5 = r1.A04
            X.Gx4 r5 = (X.C53960Gx4) r5
            com.instagram.common.session.UserSession r6 = r5.A03
            X.0Tu r4 = X.0Tu.A05
            r2 = 36316937784988368(0x810610000112d0, double:3.030315919572785E-306)
            boolean r2 = X.182.A06(r4, r6, r2)
            r8.A00 = r2
            r2 = 1
            r0.A01 = r2
            java.lang.Object[] r3 = X.C51966G9m.A1b()
            r2 = 19
            X.JGB.A01(r0, r5, r3, r2)
            X.JQA r2 = r5.A02
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            r6 = 20
            X.JGB.A01(r0, r5, r2, r6)
            java.lang.Object r4 = r1.A01
            java.lang.Object[] r3 = new java.lang.Object[]{r4}
            X.JG0 r2 = new X.JG0
            r2.<init>(r6, r4, r5)
            r0.A02(r2, r3)
            X.IZD r2 = r5.A04
            java.lang.Object[] r3 = new java.lang.Object[]{r2}
            r2 = 21
            X.JGB.A01(r0, r5, r3, r2)
            X.6LP r6 = r5.A01
            X.6Q8 r4 = r5.A00
            java.lang.String r3 = r4.A02
            boolean r2 = r5.A0A
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.Object[] r3 = new java.lang.Object[]{r6, r3, r2}
            r2 = 22
            X.JGB.A01(r0, r5, r3, r2)
            java.lang.Object[] r3 = new java.lang.Object[]{r4}
            r2 = 23
            X.JGB.A01(r0, r5, r3, r2)
            java.lang.Object[] r4 = new java.lang.Object[r7]
            java.lang.Object r3 = r1.A02
            r2 = 30
            X.JJS r1 = new X.JJS
            r1.<init>(r2, r5, r3)
            r0.A03(r1, r4)
            boolean r1 = r5.A0B
            java.lang.Object[] r2 = X.C51968G9o.A1b(r1)
            r1 = 24
            X.JGB.A01(r0, r5, r2, r1)
            goto L_0x11a5
        L_0x0d85:
            java.lang.Object r0 = r1.A04
            X.3Zt r0 = (X.C243673Zt) r0
            X.C51973G9u.A18(r0)
            java.lang.Object r0 = r1.A03
            X.3Zt r0 = (X.C243673Zt) r0
            X.C51973G9u.A18(r0)
            java.lang.Object r0 = r1.A01
            X.3Zt r0 = (X.C243673Zt) r0
            X.C51973G9u.A18(r0)
            java.lang.Object r2 = r1.A02
            X.2V5 r2 = (X.2V5) r2
            java.lang.Float r3 = X.C51967G9n.A0g()
            goto L_0x0fa6
        L_0x0da4:
            java.lang.Object r3 = r1.A02
            X.2Wa r3 = (X.2Wa) r3
            boolean r0 = X.C51969G9p.A1V(r3)
            if (r0 != 0) goto L_0x0dd0
            java.lang.Object r0 = r1.A04
            X.Gvw r0 = (X.C53891Gvw) r0
            X.Hof r2 = r0.A02
            boolean r0 = r2 instanceof X.HK3
            if (r0 == 0) goto L_0x0dcd
            X.HK3 r2 = (X.HK3) r2
            X.JPm r4 = r2.A01
            java.lang.String r5 = r2.A06
            java.lang.String r6 = r2.A04
            X.1Xj r0 = r2.A00
            java.lang.String r7 = X.C51971G9r.A0s(r0)
            java.lang.String r8 = r2.A05
            java.lang.String r9 = r2.A02
            r4.DKw(r5, r6, r7, r8, r9)
        L_0x0dcd:
            r3.A00()
        L_0x0dd0:
            java.lang.Object r2 = r1.A01
            X.2V5 r2 = (X.2V5) r2
            r0 = 0
            X.C51967G9n.A19(r2, r0)
            java.lang.Object r0 = r1.A03
            java.lang.Object r0 = X.C51968G9o.A0y(r0)
            android.animation.Animator r0 = (android.animation.Animator) r0
            if (r0 == 0) goto L_0x11a5
            goto L_0x0e07
        L_0x0de3:
            java.lang.Object r0 = r1.A02
            X.2V5 r0 = (X.2V5) r0
            java.lang.Object r0 = r0.A00
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 == 0) goto L_0x0e03
            java.lang.Object r0 = r1.A04
            X.2V5 r0 = (X.2V5) r0
            java.lang.Float r2 = X.C51967G9n.A0h()
            r0.A00(r2)
            java.lang.Object r0 = r1.A01
            X.2V5 r0 = (X.2V5) r0
            r0.A00(r2)
            goto L_0x11a5
        L_0x0e03:
            java.lang.Object r0 = r1.A03
            android.animation.Animator r0 = (android.animation.Animator) r0
        L_0x0e07:
            r0.start()
            goto L_0x11a5
        L_0x0e0c:
            java.lang.Object r0 = r1.A04
            X.GIt r0 = (X.C52202GIt) r0
            X.JTJ r4 = r0.A04
            java.lang.Object r0 = r1.A01
            boolean r3 = X.C51972G9s.A1a(r0)
            java.lang.Object r2 = r1.A02
            X.4bN r2 = (X.C267324bN) r2
            java.lang.Object r0 = r1.A03
            X.GDe r0 = (X.C52058GDe) r0
            r4.CIC(r2, r0, r3)
            goto L_0x11a5
        L_0x0e25:
            X.2WA r4 = X.G9w.A0R(r0)
            java.lang.Object r0 = r1.A02
            X.4bN r0 = (X.C267324bN) r0
            boolean r0 = r0.CcK()
            if (r0 == 0) goto L_0x0e41
            android.view.View r3 = r4.A00
            if (r3 == 0) goto L_0x0e41
            java.lang.Object r0 = r1.A04
            X.GGs r0 = (X.C52150GGs) r0
            X.GCs r2 = r0.A09
            r0 = 0
            r2.A05(r3, r0, r0)
        L_0x0e41:
            java.lang.Object r2 = r1.A03
            X.0sL r2 = (X.0sL) r2
            java.lang.Object r0 = r1.A01
            android.view.View r1 = r4.A00
        L_0x0e49:
            r2.invoke(r0, r1)
            goto L_0x11a5
        L_0x0e4e:
            boolean r5 = X.AnonymousClass7TE.A1a(r0)
            java.lang.Object r0 = r1.A01
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r9 = r0.getValue()
            X.HDc r9 = (X.C54430HDc) r9
            java.lang.Object r0 = r1.A03
            X.Gmw r0 = (X.C53372Gmw) r0
            java.lang.String r10 = r0.A06
            java.lang.Object r7 = r1.A02
            if (r5 == 0) goto L_0x0ed5
            X.IuB r8 = X.C58578IuB.A00
            X.AnonymousClass7TG.A1T(r10, r7, r8)
            X.05G r4 = r9.A01
        L_0x0e6d:
            java.lang.Object r3 = r4.getValue()
            r0 = r3
            X.MfE r0 = (X.C66920MfE) r0
            int r0 = r0.A01
            int r2 = r0 + -1
            r0 = 0
            boolean r0 = X.C51975G9x.A1a(r3, r4, r2, r0)
            if (r0 == 0) goto L_0x0e6d
            X.4Cq r0 = r9.A01
            r11 = 0
            r12 = 5
        L_0x0e83:
            X.MFd r6 = new X.MFd
            r6.<init>(r7, r8, r9, r10, r11, r12)
            X.AnonymousClass7TE.A1Z(r6, r0)
            java.lang.Object r1 = r1.A04
            X.HJx r1 = (X.C54588HJx) r1
            X.2V5 r2 = r1.A03
            java.lang.Object r0 = r2.A00
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.ArrayList r3 = X.00k.A0U(r0)
            X.2V5 r4 = r1.A04
            int r0 = X.C51970G9q.A09(r4)
            java.lang.Object r0 = r3.get(r0)
            X.Gmw r0 = (X.C53372Gmw) r0
            r13 = r5 ^ 1
            java.lang.String r7 = r0.A06
            java.lang.Object r6 = r0.A04
            com.instagram.user.model.User r6 = (com.instagram.user.model.User) r6
            java.lang.Object r10 = r0.A03
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r11 = r0.A02
            java.util.List r11 = (java.util.List) r11
            int r12 = r0.A01
            java.lang.String r8 = r0.A05
            java.lang.String r9 = r0.A07
            X.C51974G9v.A1O(r7, r6, r10, r11)
            r0 = 6
            X.0qQ.A0B(r8, r0)
            X.Gmw r5 = new X.Gmw
            r5.<init>((com.instagram.user.model.User) r6, (java.lang.String) r7, (java.lang.String) r8, (java.lang.String) r9, (java.util.List) r10, (java.util.List) r11, (int) r12, (boolean) r13)
            int r0 = X.C51970G9q.A09(r4)
            r3.set(r0, r5)
            X.2V5 r0 = r1.A05
            r0.A00(r5)
            goto L_0x0fa6
        L_0x0ed5:
            X.IuA r8 = X.C58577IuA.A00
            X.AnonymousClass7TG.A1T(r10, r7, r8)
            X.05G r4 = r9.A01
        L_0x0edc:
            java.lang.Object r3 = r4.getValue()
            r0 = r3
            X.MfE r0 = (X.C66920MfE) r0
            int r0 = r0.A01
            int r2 = r0 + 1
            r0 = 1
            boolean r0 = X.C51975G9x.A1a(r3, r4, r2, r0)
            if (r0 == 0) goto L_0x0edc
            X.4Cq r0 = r9.A01
            r11 = 0
            r12 = 4
            goto L_0x0e83
        L_0x0ef3:
            java.lang.String r5 = X.C41847B3o.A1E(r0)
            java.lang.Object r0 = r1.A01
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r3 = r0.getValue()
            X.3pa r3 = (X.C252733pa) r3
            java.lang.Object r2 = r1.A03
            java.lang.Object r0 = r1.A04
            X.HJx r0 = (X.C54588HJx) r0
            X.4bN r0 = r0.A06
            X.1Xj r4 = r0.A02
            java.lang.Object r0 = r1.A02
            X.Gmw r0 = (X.C53372Gmw) r0
            java.lang.String r6 = r0.A06
            r0 = 3
            X.0qQ.A0B(r6, r0)
            if (r2 == 0) goto L_0x11a5
            if (r4 == 0) goto L_0x11a5
            X.4Cq r0 = r3.A01
            r7 = 0
            r8 = 4
            X.Pf9 r1 = new X.Pf9
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            X.AnonymousClass7TE.A1Z(r1, r0)
            goto L_0x11a5
        L_0x0f27:
            java.lang.Object r6 = r1.A04
            X.GHd r6 = (X.C52161GHd) r6
            X.Jvl r0 = r6.A01
            java.lang.Object r0 = r0.A01
            X.4bN r0 = (X.C267324bN) r0
            X.1Xj r3 = r0.A02
            if (r3 == 0) goto L_0x11a5
            r2 = 0
            X.3de r0 = new X.3de
            r0.<init>(r3, r2)
            com.instagram.common.session.UserSession r5 = r6.A04
            boolean r0 = X.C245953dk.A00(r5, r0)
            if (r0 == 0) goto L_0x11a5
            X.3fc r2 = r6.A05
            X.3fc r0 = X.C247003fc.SHARE_BUTTON
            if (r2 != r0) goto L_0x11a5
            java.lang.Object r4 = r1.A02
            X.2Wa r4 = (X.2Wa) r4
            java.lang.Object r3 = r1.A03
            android.animation.Animator r3 = (android.animation.Animator) r3
            r0 = 1
            X.IPv r2 = new X.IPv
            r2.<init>(r3, r4, r6, r0)
            java.lang.Object r0 = r1.A01
            android.os.Handler r0 = (android.os.Handler) r0
            X.C249213jJ.A02(r0, r5, r2)
            goto L_0x11a5
        L_0x0f60:
            X.2WE r2 = X.C51968G9o.A0f(r0)
            java.lang.Object r7 = r1.A03
            X.3bE r7 = (X.C244463bE) r7
            r0 = 1
            r7.A00 = r0
            java.lang.Object[] r0 = X.C51966G9m.A1b()
            java.lang.Object r6 = r1.A04
            java.lang.Object r8 = r1.A01
            java.lang.Object r5 = r1.A02
            r4 = 16
            X.JJT r3 = new X.JJT
            r3.<init>(r4, r5, r6, r7, r8)
            r2.A03(r3, r0)
            goto L_0x11a5
        L_0x0f81:
            java.lang.Object r0 = r1.A02
            X.3Zt r0 = (X.C243673Zt) r0
            X.C51973G9u.A18(r0)
            java.lang.Object r2 = r1.A01
            X.2V5 r2 = (X.2V5) r2
            java.lang.Object r1 = r1.A03
            X.3Y5 r1 = (X.AnonymousClass3Y5) r1
            r0 = 2131100677(0x7f060405, float:1.7813742E38)
            int r1 = X.C244013aV.A02(r1, r0)
            android.graphics.drawable.GradientDrawable$Orientation r0 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            X.JVb r3 = new X.JVb
            r3.<init>(r0)
            r0 = 1098907648(0x41800000, float:16.0)
            r3.setCornerRadius(r0)
            r3.setColor(r1)
        L_0x0fa6:
            r2.A00(r3)
            goto L_0x11a5
        L_0x0fab:
            java.lang.String r0 = (java.lang.String) r0
            r4 = 0
            X.0qQ.A0B(r0, r4)
            java.lang.Object r9 = r1.A03
            X.GrJ r9 = (X.C53604GrJ) r9
            X.62P r5 = r9.A08
            java.util.Iterator r3 = r5.iterator()
            r12 = 0
        L_0x0fbc:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x0fdf
            java.lang.Object r2 = r3.next()
            X.JwL r2 = (X.C61083JwL) r2
            java.lang.Object r2 = r2.A00
            java.lang.Object r2 = X.C51966G9m.A19(r2, r4)
            X.5vQ r2 = (X.C299575vQ) r2
            X.5vJ r2 = r2.Be5()
            java.lang.String r2 = r2.A03
            boolean r2 = X.0qQ.A0K(r2, r0)
            if (r2 != 0) goto L_0x0fe0
            int r12 = r12 + 1
            goto L_0x0fbc
        L_0x0fdf:
            r12 = -1
        L_0x0fe0:
            java.util.Iterator r5 = r5.iterator()
        L_0x0fe4:
            boolean r3 = r5.hasNext()
            r2 = 0
            if (r3 == 0) goto L_0x111a
            java.lang.Object r10 = r5.next()
            r3 = r10
            X.JwL r3 = (X.C61083JwL) r3
            java.lang.Object r3 = r3.A00
            java.lang.Object r3 = X.C51966G9m.A19(r3, r4)
            X.5vQ r3 = (X.C299575vQ) r3
            X.5vJ r3 = r3.Be5()
            java.lang.String r3 = r3.A03
            boolean r3 = X.0qQ.A0K(r3, r0)
            if (r3 == 0) goto L_0x0fe4
        L_0x1006:
            X.JwL r10 = (X.C61083JwL) r10
            java.lang.Object r3 = r1.A01
            android.app.Activity r3 = (android.app.Activity) r3
            java.lang.Object r7 = r1.A04
            com.instagram.common.session.UserSession r7 = (com.instagram.common.session.UserSession) r7
            java.lang.Object r8 = r1.A02
            X.0iw r8 = (X.AnonymousClass0iw) r8
            int r13 = r9.A01
            java.lang.String r6 = r9.A03
            java.lang.String r11 = r9.A05
            java.lang.String r5 = r9.A07
            java.lang.String r9 = r9.A04
            if (r10 == 0) goto L_0x1024
            java.lang.Object r2 = r10.A01
            X.4oX r2 = (X.C274544oX) r2
        L_0x1024:
            if (r2 == 0) goto L_0x1038
            X.4oV r1 = r2.BPy()
            if (r1 == 0) goto L_0x1038
            X.4oT r1 = r1.BHs()
            if (r1 == 0) goto L_0x1038
            java.lang.String r10 = r1.getUrl()
            if (r10 != 0) goto L_0x1040
        L_0x1038:
            java.lang.String r1 = "barcelona://media?id="
            java.lang.String r10 = X.002.A0R(r1, r0)
            if (r2 == 0) goto L_0x1117
        L_0x1040:
            X.4oV r1 = r2.BPy()
            if (r1 == 0) goto L_0x1117
            X.4oT r1 = r1.CBW()
            if (r1 == 0) goto L_0x1117
            java.lang.String r2 = r1.getUrl()
        L_0x1050:
            X.DbS.A1X(r3)
            androidx.fragment.app.FragmentActivity r3 = (androidx.fragment.app.FragmentActivity) r3
            java.lang.String r1 = "tiru"
            X.C49965FGy.A04(r3, r7, r10, r1, r2)
            X.AnonymousClass7TF.A1H(r7, r8)
            java.lang.String r14 = X.C51965G9l.A0u(r0)
            X.0wc r2 = X.AnonymousClass0kN.A01(r8, r7)
            java.lang.String r1 = "ig_threads_in_reels_unit_post_tap"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r2, r1)
            boolean r1 = r3.isSampled()
            if (r1 == 0) goto L_0x10b2
            X.0qQ.A0B(r14, r4)
            r10 = 10
            java.lang.Long r1 = X.00y.A0n(r10, r14)
            if (r1 == 0) goto L_0x10b2
            X.C51969G9p.A1A(r3, r8)
            X.C51965G9l.A1E(r3, r1)
            X.C51969G9p.A17(r3, r13)
            X.C51969G9p.A16(r3, r12)
            java.lang.String r1 = X.DbY.A0a()
            X.C51965G9l.A1K(r3, r1)
            if (r6 == 0) goto L_0x1114
            java.lang.Long r1 = X.00y.A0n(r10, r6)
            if (r1 == 0) goto L_0x1114
            long r1 = r1.longValue()
        L_0x109b:
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
            java.lang.String r1 = "netego_id"
            r3.A9F(r1, r2)
            if (r11 == 0) goto L_0x1112
            java.lang.Long r2 = X.00y.A0n(r10, r11)
        L_0x10aa:
            java.lang.String r1 = "quick_promotion_id"
            r3.A9F(r1, r2)
            r3.Cgf()
        L_0x10b2:
            X.C51972G9s.A1D(r5, r9)
            java.lang.String r3 = X.1Xv.A06(r0)
            X.0wc r1 = X.AnonymousClass0kN.A01(r8, r7)
            r0 = 762(0x2fa, float:1.068E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            r0 = 296(0x128, float:4.15E-43)
            X.1Ln r2 = X.C51965G9l.A0U(r1, r0)
            boolean r0 = X.DbT.A1Y(r2)
            if (r0 == 0) goto L_0x11a5
            java.lang.String r0 = "type"
            r2.A0R(r0, r9)
            java.lang.String r1 = r8.getModuleName()
            java.lang.String r0 = "container_module"
            r2.A0R(r0, r1)
            java.lang.String r1 = r8.getModuleName()
            java.lang.String r0 = "source_of_action"
            r2.A0R(r0, r1)
            java.lang.String r0 = r7.A06
            X.4Ny r0 = X.C263944Ny.A00(r0)
            java.lang.Long r1 = r0.A00
            java.lang.String r0 = "ig_userid"
            r2.A0Q(r0, r1)
            java.lang.String r0 = "netego_id"
            r2.A0R(r0, r6)
            java.lang.String r0 = "tracking_token"
            r2.A0R(r0, r5)
            java.lang.Long r1 = X.C51971G9r.A0n(r4, r3)
            java.lang.String r0 = "media_id"
            r2.A0Q(r0, r1)
            X.AnonymousClass7TF.A18(r2)
            r2.Cgf()
            goto L_0x11a5
        L_0x1112:
            r2 = 0
            goto L_0x10aa
        L_0x1114:
            r1 = 0
            goto L_0x109b
        L_0x1117:
            r2 = 0
            goto L_0x1050
        L_0x111a:
            r10 = r2
            goto L_0x1006
        L_0x111d:
            long r7 = java.lang.System.currentTimeMillis()
            java.lang.Object r6 = r1.A03
            X.0rD r6 = (X.0rD) r6
            double r2 = r6.A00
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x119a
            java.lang.Object r0 = r1.A04
            X.Gwu r0 = (X.C53950Gwu) r0
            com.instagram.common.session.UserSession r13 = r0.A01
            java.lang.Object r12 = r1.A01
            X.0xG r12 = (X.0xG) r12
            X.GrJ r0 = r0.A03
            int r11 = r0.A01
            java.lang.String r10 = r0.A03
            java.lang.String r9 = r0.A05
            double r4 = (double) r7
            double r4 = r4 - r2
            java.lang.Object r0 = r1.A02
            X.2Wa r0 = (X.2Wa) r0
            java.lang.Object r8 = r0.A03
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            r3 = 0
            X.AnonymousClass7TF.A1H(r13, r12)
            X.0wc r2 = X.AnonymousClass0kN.A01(r12, r13)
            java.lang.String r0 = "ig_threads_in_reels_unit_tray_vpvd_imp"
            X.0Aj r7 = X.AnonymousClass7TE.A0e(r2, r0)
            boolean r0 = r7.isSampled()
            if (r0 == 0) goto L_0x119a
            java.lang.String r0 = r12.getModuleName()
            X.DbS.A1O(r7, r0)
            X.C51969G9p.A17(r7, r11)
            X.C51969G9p.A16(r7, r3)
            java.lang.String r0 = X.DbY.A0a()
            X.C51965G9l.A1K(r7, r0)
            if (r10 == 0) goto L_0x11a8
            java.lang.Long r0 = X.AnonymousClass7TE.A10(r10)
            if (r0 == 0) goto L_0x11a8
            long r2 = r0.longValue()
        L_0x117d:
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r0 = "netego_id"
            r7.A9F(r0, r2)
            X.C51970G9q.A16(r7, r4)
            java.lang.String r0 = "is_sub_impression"
            r7.A7p(r0, r8)
            java.lang.Long r2 = X.DbZ.A0d(r9)
            java.lang.String r0 = "quick_promotion_id"
            r7.A9F(r0, r2)
            r7.Cgf()
        L_0x119a:
            r2 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r6.A00 = r2
            java.lang.Object r0 = r1.A02
            X.2Wa r0 = (X.2Wa) r0
            r0.A00()
        L_0x11a5:
            X.0gF r1 = X.C60340gF.A00
            return r1
        L_0x11a8:
            r2 = 0
            goto L_0x117d
        L_0x11ab:
            java.lang.Object r2 = r1.A04
            r0 = 6
            X.IHG r4 = new X.IHG
            r4.<init>(r2, r0)
            java.lang.Object r3 = r1.A02
            X.07Z r3 = (X.AnonymousClass07Z) r3
            X.07V r0 = r3.getLifecycle()
            r0.A09(r4)
            java.lang.Object r2 = r1.A03
            X.0sP r2 = (X.0sP) r2
            java.lang.Object r0 = r1.A01
            X.GZn r0 = (X.C52614GZn) r0
            X.Ga8 r1 = new X.Ga8
            r1.<init>(r4, r3, r0, r2)
            return r1
        L_0x11cc:
            java.util.Map r3 = r0.A04
            java.util.Map r2 = r0.A03
            java.util.List r1 = r0.A01
            com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta r0 = r0.A00
            com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState r1 = com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState.A00(r0, r1, r3, r2, r6)
            return r1
        L_0x11d9:
            java.util.Map r1 = r0.A03
            java.util.LinkedHashMap r5 = X.AnonymousClass7TE.A1H()
            java.util.Iterator r9 = X.AnonymousClass7TF.A0u(r1)
        L_0x11e3:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x11fd
            java.util.Map$Entry r4 = X.AnonymousClass7TE.A1J(r9)
            java.lang.Object r2 = r4.getKey()
            java.lang.String r1 = r3.A0H
            boolean r1 = X.C51966G9m.A1a(r2, r1)
            if (r1 == 0) goto L_0x11e3
            X.Dbb.A1V(r4, r5)
            goto L_0x11e3
        L_0x11fd:
            java.util.List r1 = r0.A01
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r1.iterator()
        L_0x1207:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x1219
            java.lang.Object r2 = r3.next()
            boolean r1 = X.0qQ.A0K(r2, r10)
            X.DbV.A1U(r2, r4, r1)
            goto L_0x1207
        L_0x1219:
            boolean r1 = r6.isEmpty()
            if (r1 != 0) goto L_0x1220
            r7 = r8
        L_0x1220:
            java.util.Map r0 = r0.A02
            com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState r1 = com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState.A00(r7, r4, r6, r5, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58768IxF.invoke(java.lang.Object):java.lang.Object");
    }
}
