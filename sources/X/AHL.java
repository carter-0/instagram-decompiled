package X;

public abstract class AHL {
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass9X8 A02(com.instagram.common.gallery.Medium r17, com.instagram.common.session.UserSession r18, X.1Xj r19, int r20, int r21, boolean r22) {
        /*
            r3 = 1
            r2 = 13
            com.instagram.model.mediatype.ProductType r0 = r19.A1v()
            if (r0 == 0) goto L_0x0044
            int r1 = r0.ordinal()
            if (r1 == r2) goto L_0x0041
            r0 = 9
            if (r1 != r0) goto L_0x0044
            X.9sQ r8 = X.C391149sQ.STORY_MENTION_RESHARE
        L_0x0015:
            r10 = 0
            r11 = 0
            X.9Hy r5 = new X.9Hy
            r5.<init>((float) r11)
            r16 = 0
            X.9sL r9 = X.C391099sL.NOT_CLIPS
            r14 = -1
            r15 = -2147483648(0xffffffff80000000, float:-0.0)
            X.9X8 r4 = new X.9X8
            r6 = r17
            r7 = r18
            r12 = r20
            r13 = r21
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r4.A07 = r3
            if (r22 == 0) goto L_0x0040
            float r1 = (float) r12
            r0 = 1025758986(0x3d23d70a, float:0.04)
            float r1 = r1 * r0
            X.9Hy r0 = new X.9Hy
            r0.<init>((float) r1)
            r4.A03 = r0
        L_0x0040:
            return r4
        L_0x0041:
            X.9sQ r8 = X.C391149sQ.REEL_TO_STORY_STICKER
            goto L_0x0015
        L_0x0044:
            X.9sQ r8 = X.C391149sQ.FEED_TO_STORY_STICKER
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AHL.A02(com.instagram.common.gallery.Medium, com.instagram.common.session.UserSession, X.1Xj, int, int, boolean):X.9X8");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0047, code lost:
        if (r1.ordinal() != 2) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0055, code lost:
        if (r15.CeS() == false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002a, code lost:
        if ((!X.C18810W3l.A05(r1)) != true) goto L_0x002c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c7 A[LOOP:0: B:33:0x00c3->B:35:0x00c7, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C317876nz A03(android.content.Context r12, com.instagram.common.session.UserSession r13, X.1Xj r14, X.1Xj r15, int r16, boolean r17) {
        /*
            r2 = 1
            com.instagram.model.mediatype.ProductType r1 = r15.A1v()
            com.instagram.model.mediatype.ProductType r0 = com.instagram.model.mediatype.ProductType.IGTV
            boolean r8 = X.AnonymousClass7TF.A1W(r1, r0)
            com.instagram.model.mediatype.ProductType r1 = r15.A1v()
            com.instagram.model.mediatype.ProductType r0 = com.instagram.model.mediatype.ProductType.CLIPS
            boolean r3 = X.AnonymousClass7TF.A1W(r1, r0)
            X.6nz r0 = X.C317876nz.A0a
            java.lang.String r0 = r14.A30()
            if (r0 == 0) goto L_0x00d4
            com.instagram.user.model.UpcomingEvent r1 = r14.A27(r13)
            if (r1 == 0) goto L_0x002c
            boolean r1 = X.C18810W3l.A05(r1)
            r1 = r1 ^ 1
            r7 = 1
            if (r1 == r2) goto L_0x002d
        L_0x002c:
            r7 = 0
        L_0x002d:
            com.instagram.model.mediasize.ExtendedImageUrl r9 = r15.A1n(r12)
            int r6 = r15.A0y()
            int r4 = r15.A0x()
            com.instagram.model.mediatype.ProductType r1 = r15.A1v()
            if (r1 == 0) goto L_0x0049
            int r2 = r1.ordinal()
            r1 = 2
            r14 = 1059816735(0x3f2b851f, float:0.67)
            if (r2 == r1) goto L_0x004c
        L_0x0049:
            r14 = 1061997773(0x3f4ccccd, float:0.8)
        L_0x004c:
            if (r8 != 0) goto L_0x0057
            if (r3 != 0) goto L_0x0057
            boolean r1 = r15.CeS()
            r5 = 1
            if (r1 != 0) goto L_0x0058
        L_0x0057:
            r5 = 0
        L_0x0058:
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            if (r8 == 0) goto L_0x0087
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()
            java.lang.String r1 = "story-igtv-metadata-sticker-"
        L_0x0064:
            r3.append(r1)
            java.lang.String r10 = X.AnonymousClass7TF.A0l(r0, r3)
            float r12 = (float) r6
            float r13 = (float) r4
            r11 = r10
            X.6o8 r1 = X.C317966o8.A00(r9, r10, r11, r12, r13, r14)
            r2.add(r1)
        L_0x0075:
            r1 = 1572(0x624, float:2.203E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            java.lang.String r3 = X.002.A0R(r1, r0)
            X.6oG r1 = X.C318046oG.MEDIA
            X.6nz r0 = new X.6nz
            r0.<init>(r1, r3, r2)
            return r0
        L_0x0087:
            if (r3 == 0) goto L_0x0090
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()
            java.lang.String r1 = "story-reels-metadata-sticker-"
            goto L_0x0064
        L_0x0090:
            java.lang.String r1 = "media_simple_"
            java.lang.String r10 = X.002.A0R(r1, r0)
            float r12 = (float) r6
            float r13 = (float) r4
            r11 = r10
            X.6o8 r4 = X.C317966o8.A00(r9, r10, r11, r12, r13, r14)
            java.lang.String r1 = "media_post_"
            java.lang.String r10 = X.002.A0R(r1, r0)
            r11 = r10
            X.6o8 r3 = X.C317966o8.A00(r9, r10, r11, r12, r13, r14)
            if (r7 == 0) goto L_0x00b8
            java.lang.String r1 = "media_event_"
            java.lang.String r10 = X.002.A0R(r1, r0)
            r11 = r10
            X.6o8 r1 = X.C317966o8.A00(r9, r10, r11, r12, r13, r14)
            r2.add(r1)
        L_0x00b8:
            if (r5 != 0) goto L_0x00bf
            if (r17 == 0) goto L_0x00cd
            r2.add(r3)
        L_0x00bf:
            r2.add(r4)
        L_0x00c2:
            r1 = 0
        L_0x00c3:
            r4 = r16
            if (r1 >= r4) goto L_0x0075
            r2.add(r3)
            int r1 = r1 + 1
            goto L_0x00c3
        L_0x00cd:
            r2.add(r4)
            r2.add(r3)
            goto L_0x00c2
        L_0x00d4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AHL.A03(android.content.Context, com.instagram.common.session.UserSession, X.1Xj, X.1Xj, int, boolean):X.6nz");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r49v3, types: [X.8vJ] */
    /* JADX WARNING: type inference failed for: r26v5, types: [X.9lx] */
    /* JADX WARNING: type inference failed for: r3v26 */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00b6, code lost:
        if (r63 == null) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x01de, code lost:
        if (r20 != false) goto L_0x01e0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x027b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C347017w8 A00(android.content.Context r62, android.graphics.drawable.Drawable r63, com.instagram.common.session.UserSession r64, X.C3498682d r65, X.1Xj r66, X.1Xj r67, java.lang.Integer r68, java.lang.String r69, int r70, int r71, int r72, int r73, boolean r74, boolean r75) {
        /*
            r41 = r70
            r4 = 0
            r24 = 1
            r5 = r64
            r6 = r66
            com.instagram.user.model.UpcomingEvent r60 = r6.A27(r5)
            r1 = r62
            if (r60 == 0) goto L_0x037f
            java.lang.String r11 = r60.getId()
            java.lang.String r37 = r60.getTitle()
            long r2 = X.C18810W3l.A02(r60)
            java.lang.String r38 = X.C14240TsN.A02(r1, r5, r2)
            android.content.res.Resources r2 = r1.getResources()
            r0 = 2131976020(0x7f135f54, float:1.9589149E38)
            java.lang.String r39 = r2.getString(r0)
        L_0x002c:
            boolean r0 = r6.A5D()
            r64 = r67
            if (r0 == 0) goto L_0x0379
            long r9 = r64.A1B()
        L_0x0038:
            com.instagram.user.model.User r8 = r6.A2A(r5)
            java.lang.String r13 = "Required value was null."
            if (r8 == 0) goto L_0x03e2
            boolean r48 = r6.A4b()
            X.1Xy r0 = r6.A0C
            com.instagram.user.model.User r0 = r0.B9t()
            r2 = r69
            if (r48 == 0) goto L_0x034e
            java.util.List r0 = r6.A3l(r5)
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1D(r0)
            int r3 = r0.size()
            r0 = r24
            java.lang.String r32 = X.AnonymousClass4i2.A01(r1, r7, r3, r4, r0)
            X.0Pk r0 = X.0Pl.A0n
            X.0Pl r0 = r0.A00(r1, r5)
            android.graphics.drawable.Drawable r52 = r0.A07(r1, r6, r2)
            r33 = 0
        L_0x006c:
            java.lang.String r29 = r6.A30()
            if (r29 == 0) goto L_0x03dd
            java.lang.String r30 = r64.A30()
            if (r30 == 0) goto L_0x03d8
            java.lang.String r31 = r8.getId()
            com.instagram.common.typedurl.ImageUrl r27 = r8.Bh3()
            boolean r46 = r6.A4u()
            boolean r47 = r64.A4u()
            boolean r49 = r8.A1j()
            X.1Xy r0 = r6.A0C
            java.lang.String r34 = r0.getTitle()
            long r2 = r6.A1B()
            java.lang.String r35 = X.1G0.A02(r2)
            java.lang.Long r28 = java.lang.Long.valueOf(r9)
            java.lang.String r36 = java.lang.String.valueOf(r11)
            com.instagram.model.mediatype.ProductType r2 = r6.A1v()
            com.instagram.model.mediatype.ProductType r0 = com.instagram.model.mediatype.ProductType.FEED_CAROUSEL
            r25 = r63
            if (r2 == r0) goto L_0x00b4
            com.instagram.model.mediatype.ProductType r2 = r6.A1v()
            com.instagram.model.mediatype.ProductType r0 = com.instagram.model.mediatype.ProductType.FEED
            if (r2 != r0) goto L_0x00b8
        L_0x00b4:
            r50 = 1
            if (r63 != 0) goto L_0x00ba
        L_0x00b8:
            r50 = 0
        L_0x00ba:
            boolean r51 = r6.A5D()
            X.1Xy r0 = r6.A0C
            X.1bS r0 = r0.B8b()
            if (r0 == 0) goto L_0x034b
            com.instagram.model.fundraiser.FundraiserCampaignTypeEnum r0 = r0.B8e()
        L_0x00ca:
            com.instagram.model.fundraiser.FundraiserCampaignTypeEnum r2 = com.instagram.model.fundraiser.FundraiserCampaignTypeEnum.IG_STANDALONE_FOR_CHARITY
            if (r0 != r2) goto L_0x0347
            java.lang.String r40 = r6.A2w()
        L_0x00d2:
            r0 = 10
            float r0 = X.0nA.A04(r1, r0)
            int r43 = X.AnonymousClass1GB.A01(r0)
            r0 = 8
            float r0 = X.0nA.A04(r1, r0)
            int r44 = X.AnonymousClass1GB.A01(r0)
            X.UkT r0 = new X.UkT
            r42 = r71
            r45 = r4
            r26 = r0
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51)
            r12 = r75
            r11 = r73
            r7 = r1
            r8 = r5
            r9 = r6
            r10 = r64
            X.6nz r9 = A03(r7, r8, r9, r10, r11, r12)
            int r2 = r0.A01
            int r2 = r2 * 2
            int r41 = r70 - r2
            android.content.res.Resources r8 = r1.getResources()
            X.3gp r2 = r6.A1T()
            if (r2 == 0) goto L_0x0344
            X.3pr r3 = r2.A06
        L_0x0110:
            X.3pr r2 = X.C252883pr.Success
            if (r3 != r2) goto L_0x0340
            com.instagram.model.mediatype.ProductType r3 = r6.A1v()
            com.instagram.model.mediatype.ProductType r2 = com.instagram.model.mediatype.ProductType.IGTV
            if (r3 == r2) goto L_0x0340
            r2 = 2131100285(0x7f06027d, float:1.7812947E38)
            int r12 = r1.getColor(r2)
            r2 = 2131099817(0x7f0600a9, float:1.7811998E38)
            int r2 = r1.getColor(r2)
            r3 = 2131100285(0x7f06027d, float:1.7812947E38)
            int r10 = r1.getColor(r3)
            r3 = 2131100272(0x7f060270, float:1.781292E38)
            int r11 = r1.getColor(r3)
            android.text.TextPaint r3 = new android.text.TextPaint
            r7 = r24
            r3.<init>(r7)
            android.util.DisplayMetrics r7 = r8.getDisplayMetrics()
            float r7 = r7.density
            r3.density = r7
            r3.linkColor = r2
            r7 = 2131165216(0x7f070020, float:1.7944643E38)
            float r7 = r8.getDimension(r7)
            r3.setTextSize(r7)
            r3.setColor(r10)
            android.text.Layout$Alignment r29 = android.text.Layout.Alignment.ALIGN_NORMAL
            r31 = 0
            r7 = 2131165200(0x7f070010, float:1.794461E38)
            float r32 = X.AnonymousClass7TE.A01(r8, r7)
            r33 = 1065353216(0x3f800000, float:1.0)
            X.0rN r28 = new X.0rN
            r30 = r3
            r34 = r41
            r35 = r4
            r28.<init>(r29, r30, r31, r32, r33, r34, r35)
            X.3gp r29 = r6.A1T()
            if (r29 == 0) goto L_0x03d3
            X.1sy r30 = X.1sy.A0P
            java.lang.Integer r31 = java.lang.Integer.valueOf(r12)
            java.lang.Integer r32 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r33 = java.lang.Integer.valueOf(r11)
            r26 = r1
            r27 = r5
            r34 = r4
            r36 = r4
            android.text.StaticLayout r53 = X.C252923pv.A01(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
        L_0x018e:
            r2 = r64
            com.instagram.model.mediasize.ExtendedImageUrl r55 = r2.A1n(r1)
            X.1iA r57 = r6.BR7()
            com.instagram.model.mediatype.ProductType r23 = r6.A1v()
            X.1sw r22 = r6.A1u()
            if (r55 == 0) goto L_0x03ce
            r2 = r72
            boolean r10 = r6.A6O(r2)
            r6 = 3
            r3 = 6
            r2 = r22
            java.util.ArrayList r13 = X.AnonymousClass7TF.A0q(r2, r3)
            com.instagram.avatars.store.AvatarStore r2 = X.25x.A00(r5)
            X.27E r2 = r2.A01
            X.27H r3 = r2.A00
            X.5vi r2 = X.C299715vi.A00
            boolean r21 = X.0qQ.A0K(r3, r2)
            X.0Tu r7 = X.0Tu.A05
            r2 = 36319858362752697(0x8108b800011eb9, double:3.032162904711169E-306)
            boolean r20 = X.182.A06(r7, r5, r2)
            X.26t r2 = X.26G.A00(r5)
            X.0xa r2 = r2.A00
            java.lang.String r3 = "reshare_tooltip_view_count"
            int r2 = r2.getInt(r3, r4)
            r8 = 1
            boolean r7 = X.AnonymousClass7TF.A1T(r2, r6)
            if (r10 == 0) goto L_0x01e0
            r19 = 1
            if (r20 == 0) goto L_0x01e2
        L_0x01e0:
            r19 = 0
        L_0x01e2:
            X.26t r2 = X.26G.A00(r5)
            X.0xa r2 = r2.A00
            int r2 = r2.getInt(r3, r4)
            boolean r18 = X.AnonymousClass7TF.A1T(r2, r6)
            r36 = 0
            if (r20 != 0) goto L_0x033c
            if (r21 == 0) goto L_0x033c
            if (r7 == 0) goto L_0x01fa
            if (r10 == 0) goto L_0x01fe
        L_0x01fa:
            if (r19 == 0) goto L_0x0327
            if (r18 == 0) goto L_0x0327
        L_0x01fe:
            java.lang.String r7 = ""
        L_0x0200:
            java.util.List r2 = r9.A0O
            java.util.Iterator r17 = r2.iterator()
        L_0x0206:
            boolean r2 = r17.hasNext()
            if (r2 == 0) goto L_0x038f
            java.lang.Object r9 = r17.next()
            X.6o8 r9 = (X.C317966o8) r9
            java.lang.String r3 = r9.A0S
            X.0qQ.A07(r3)
            java.lang.String r2 = "media_post_"
            boolean r2 = X.00p.A0k(r3, r2, r4)
            if (r2 == 0) goto L_0x02f4
            java.lang.Integer r2 = X.AnonymousClass05K.A01
        L_0x0221:
            java.lang.Integer r3 = X.AnonymousClass05K.A0C
            if (r2 != r3) goto L_0x027e
            r16 = 1
            r10 = r0
        L_0x0228:
            com.instagram.model.mediatype.ProductType r9 = com.instagram.model.mediatype.ProductType.IGTV
            r3 = r23
            if (r3 != r9) goto L_0x0241
            if (r25 == 0) goto L_0x025f
            r10 = r65
            if (r65 == 0) goto L_0x0388
            X.8vM r3 = new X.8vM
            r9 = r25
            r2 = r22
            r3.<init>(r1, r9, r10, r2)
        L_0x023d:
            r13.add(r3)
            goto L_0x0206
        L_0x0241:
            if (r25 == 0) goto L_0x025f
            boolean r3 = r10.A0M
            if (r3 == 0) goto L_0x025f
            X.9lx r3 = new X.9lx
            r26 = r3
            r27 = r1
            r28 = r25
            r29 = r5
            r30 = r55
            r31 = r10
            r32 = r57
            r33 = r22
            r34 = r23
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34)
            goto L_0x023d
        L_0x025f:
            if (r16 == 0) goto L_0x027b
            com.instagram.model.mediatype.ProductType r59 = com.instagram.model.mediatype.ProductType.UPCOMING_EVENT
        L_0x0263:
            X.8vJ r3 = new X.8vJ
            r63 = r74
            r62 = r68
            r49 = r3
            r50 = r1
            r51 = r25
            r54 = r5
            r56 = r10
            r58 = r22
            r61 = r2
            r49.<init>(r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63)
            goto L_0x023d
        L_0x027b:
            r59 = r23
            goto L_0x0263
        L_0x027e:
            r16 = 0
            java.lang.String r15 = r0.A0E
            java.lang.String r14 = r0.A07
            java.lang.String r12 = r0.A0F
            java.lang.String r11 = r0.A0I
            java.lang.String r3 = r0.A0H
            r33 = r3
            com.instagram.common.typedurl.ImageUrl r3 = r0.A05
            boolean r9 = r0.A0L
            r46 = r9
            boolean r9 = r0.A0J
            r47 = r9
            boolean r9 = r0.A0K
            r48 = r9
            boolean r9 = r0.A0O
            r49 = r9
            java.lang.String r9 = r0.A0G
            r34 = r9
            java.lang.String r9 = r0.A08
            r35 = r9
            java.lang.Long r9 = r0.A06
            r28 = r9
            boolean r9 = r0.A0M
            r50 = r9
            boolean r9 = r0.A0N
            r51 = r9
            java.lang.String r9 = r0.A0D
            r40 = r9
            int r9 = r0.A04
            r41 = r9
            int r9 = r0.A00
            r42 = r9
            int r9 = r0.A01
            r43 = r9
            int r9 = r0.A02
            r27 = r9
            int r9 = r0.A03
            r26 = r9
            X.0qQ.A0B(r15, r4)
            X.AnonymousClass7TF.A1B(r14, r8, r12)
            X.0qQ.A0B(r11, r6)
            r9 = 5
            X.0qQ.A0B(r3, r9)
            X.UkT r10 = new X.UkT
            r29 = r15
            r30 = r14
            r31 = r12
            r32 = r11
            r37 = r36
            r38 = r36
            r39 = r36
            r44 = r27
            r45 = r26
            r26 = r10
            r27 = r3
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51)
            goto L_0x0228
        L_0x02f4:
            java.lang.String r3 = r9.A0S
            X.0qQ.A07(r3)
            java.lang.String r2 = "media_event_"
            boolean r2 = X.00p.A0k(r3, r2, r4)
            if (r2 == 0) goto L_0x0305
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            goto L_0x0221
        L_0x0305:
            java.lang.String r3 = r9.A0S
            X.0qQ.A07(r3)
            java.lang.String r2 = "media_simple_"
            boolean r2 = X.00p.A0k(r3, r2, r4)
            if (r2 == 0) goto L_0x0316
            java.lang.Integer r2 = X.AnonymousClass05K.A0N
            goto L_0x0221
        L_0x0316:
            java.lang.String r3 = r9.A0S
            X.0qQ.A07(r3)
            java.lang.String r2 = "story-igtv-metadata-sticker-"
            boolean r2 = X.00p.A0k(r3, r2, r4)
            if (r2 == 0) goto L_0x0206
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            goto L_0x0221
        L_0x0327:
            android.content.res.Resources r3 = r1.getResources()
            r2 = 2131953523(0x7f130773, float:1.954352E38)
            if (r10 == 0) goto L_0x0333
            r2 = 2131953493(0x7f130755, float:1.9543459E38)
        L_0x0333:
            java.lang.String r7 = r3.getString(r2)
            X.0qQ.A0A(r7)
            goto L_0x0200
        L_0x033c:
            r7 = r36
            goto L_0x0200
        L_0x0340:
            r53 = 0
            goto L_0x018e
        L_0x0344:
            r3 = 0
            goto L_0x0110
        L_0x0347:
            r40 = 0
            goto L_0x00d2
        L_0x034b:
            r0 = 0
            goto L_0x00ca
        L_0x034e:
            if (r0 == 0) goto L_0x036f
            java.lang.String r32 = r0.getUsername()
            X.0Pk r0 = X.0Pl.A0n
            X.0Pl r0 = r0.A00(r1, r5)
            android.graphics.drawable.Drawable r52 = r0.A08(r1, r6, r2)
            r2 = 2131963210(0x7f132d4a, float:1.9563167E38)
            java.lang.String r0 = r8.getUsername()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r33 = r1.getString(r2, r0)
            goto L_0x006c
        L_0x036f:
            java.lang.String r32 = r8.getUsername()
            r33 = 0
            r52 = 0
            goto L_0x006c
        L_0x0379:
            long r9 = r6.A1B()
            goto L_0x0038
        L_0x037f:
            r11 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            goto L_0x002c
        L_0x0388:
            java.lang.String r0 = "IGTV share view model must be defined for autoplay"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x038f:
            boolean r0 = r13.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x03c7
            if (r20 != 0) goto L_0x03c5
            if (r21 == 0) goto L_0x03c5
            if (r19 == 0) goto L_0x03c5
            if (r18 != 0) goto L_0x03c5
        L_0x039f:
            X.7w8 r3 = new X.7w8
            r3.<init>(r1, r5, r7, r13)
            r3.A05 = r8
            com.instagram.model.mediatype.ProductType r2 = r64.A1v()
            com.instagram.model.mediatype.ProductType r0 = com.instagram.model.mediatype.ProductType.IGTV
            if (r2 != r0) goto L_0x03b7
            X.9ls r0 = new X.9ls
            r0.<init>(r1, r5, r3)
        L_0x03b3:
            r3.A0C(r0)
        L_0x03b6:
            return r3
        L_0x03b7:
            com.instagram.model.mediatype.ProductType r2 = r64.A1v()
            com.instagram.model.mediatype.ProductType r0 = com.instagram.model.mediatype.ProductType.MEMORY
            if (r2 != r0) goto L_0x03b6
            X.9lo r0 = new X.9lo
            r0.<init>(r1, r5, r3, r4)
            goto L_0x03b3
        L_0x03c5:
            r8 = 0
            goto L_0x039f
        L_0x03c7:
            java.lang.String r0 = "invalid static sticker configuration"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x03ce:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r13)
            throw r0
        L_0x03d3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r13)
            throw r0
        L_0x03d8:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r13)
            throw r0
        L_0x03dd:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r13)
            throw r0
        L_0x03e2:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AHL.A00(android.content.Context, android.graphics.drawable.Drawable, com.instagram.common.session.UserSession, X.82d, X.1Xj, X.1Xj, java.lang.Integer, java.lang.String, int, int, int, int, boolean, boolean):X.7w8");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004a, code lost:
        if (r0.ordinal() != 2) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C347017w8 A01(android.content.Context r19, android.graphics.drawable.Drawable r20, com.instagram.common.session.UserSession r21, X.1Xj r22, java.lang.Integer r23, java.lang.String r24, int r25, int r26) {
        /*
            r18 = 0
            r7 = 1
            r6 = 2
            r13 = r24
            X.0qQ.A0B(r13, r6)
            r10 = r22
            boolean r0 = r10.A5D()
            r2 = r25
            if (r0 == 0) goto L_0x001e
            X.1Xj r11 = r10.A1c(r2)
            if (r11 != 0) goto L_0x001f
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x001e:
            r11 = r10
        L_0x001f:
            com.instagram.model.mediatype.ProductType r1 = r11.A1v()
            com.instagram.model.mediatype.ProductType r0 = com.instagram.model.mediatype.ProductType.IGTV
            r3 = 0
            if (r1 != r0) goto L_0x0086
            r5 = 1
            X.3eu r0 = r11.A1S()
            if (r0 == 0) goto L_0x0084
            int r4 = r0.A01
        L_0x0031:
            X.3eu r0 = r11.A1S()
            if (r0 == 0) goto L_0x0039
            int r3 = r0.A00
        L_0x0039:
            if (r4 < r7) goto L_0x0097
            if (r3 < r7) goto L_0x0090
            com.instagram.model.mediatype.ProductType r0 = r11.A1v()
            if (r0 == 0) goto L_0x004c
            int r0 = r0.ordinal()
            r1 = 1059816735(0x3f2b851f, float:0.67)
            if (r0 == r6) goto L_0x004f
        L_0x004c:
            r1 = 1061997773(0x3f4ccccd, float:0.8)
        L_0x004f:
            r6 = r19
            int r0 = X.AnonymousClass8XF.A01(r6)
            float r0 = (float) r0
            int r14 = X.AnonymousClass7TE.A06(r0, r1)
            float r1 = (float) r14
            float r0 = (float) r4
            float r1 = r1 / r0
            float r0 = (float) r3
            int r15 = X.AnonymousClass7TE.A06(r1, r0)
            r8 = r21
            if (r5 == 0) goto L_0x0082
            int r1 = X.0nA.A09(r6)
            int r0 = X.0nA.A08(r6)
            X.82d r9 = new X.82d
            r9.<init>(r8, r11, r1, r0)
        L_0x0073:
            r7 = r20
            r12 = r23
            r17 = r26
            r16 = r2
            r19 = r18
            X.7w8 r0 = A00(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r0
        L_0x0082:
            r9 = 0
            goto L_0x0073
        L_0x0084:
            r4 = 0
            goto L_0x0031
        L_0x0086:
            r5 = 0
            int r4 = r11.A0y()
            int r3 = r11.A0x()
            goto L_0x0039
        L_0x0090:
            java.lang.String r0 = "Media height must be greater than zero"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x0097:
            java.lang.String r0 = "Media width must be greater than zero"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AHL.A01(android.content.Context, android.graphics.drawable.Drawable, com.instagram.common.session.UserSession, X.1Xj, java.lang.Integer, java.lang.String, int, int):X.7w8");
    }
}
