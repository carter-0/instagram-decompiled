package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GDr  reason: case insensitive filesystem */
public final class C52071GDr extends C247303g7 {
    public final UserSession A00;
    public final C52072GDs A01;
    public final GDH A02;
    public final GDI A03;
    public final C52074GDu A04;

    public /* synthetic */ C52071GDr(UserSession userSession, GDH gdh, int i) {
        C52072GDs gDs;
        GDI gdi;
        C52074GDu gDu = null;
        gdh = (i & 2) != 0 ? new GDH(userSession) : gdh;
        if ((i & 4) != 0) {
            gDs = new C52072GDs(userSession, gdh);
        } else {
            gDs = null;
        }
        if ((i & 8) != 0) {
            gdi = new GDI(userSession, gdh);
        } else {
            gdi = null;
        }
        gDu = (i & 16) != 0 ? new C52074GDu(userSession, gdh) : gDu;
        C51974G9v.A1M(gdh, gDs, gdi);
        0qQ.A0B(gDu, 5);
        this.A00 = userSession;
        this.A02 = gdh;
        this.A01 = gDs;
        this.A03 = gdi;
        this.A04 = gDu;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v0, resolved type: X.JNG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v47, resolved type: X.GrE} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v74, resolved type: X.GrF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v4, resolved type: X.JNG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v123, resolved type: com.instagram.common.typedurl.ImageUrl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v5, resolved type: X.Gaq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v85, resolved type: X.GrG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v86, resolved type: X.GrG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r60v5, resolved type: X.GrG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r61v5, resolved type: X.GrG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v130, resolved type: X.Gaq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v6, resolved type: X.Gaq} */
    /* JADX WARNING: type inference failed for: r28v1 */
    /* JADX WARNING: type inference failed for: r0v45 */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x019b, code lost:
        if (r7 == null) goto L_0x019d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0057, code lost:
        if (r5 != null) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x05dc, code lost:
        r0 = r7.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x0754, code lost:
        if (r5.isEmpty() != false) goto L_0x0756;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x010b, code lost:
        if (r28 == null) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0156, code lost:
        if (r0 != null) goto L_0x008c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0427  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x05b8  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x05c2  */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x06f6  */
    /* JADX WARNING: Removed duplicated region for block: B:336:0x0722  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x014c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.GZ2 A05(X.C53332GmI r72, java.lang.String r73) {
        /*
            r71 = this;
            r15 = 0
            r21 = 1
            r29 = 6
            r4 = r72
            X.Gok r1 = r4.A06
            r3 = r71
            r42 = r73
            if (r1 == 0) goto L_0x0685
            X.GDI r3 = r3.A03
            r6 = 4
            r10 = 3
            r18 = 2
            java.lang.String r17 = "Required value was null."
            r2 = 0
            X.Goh r0 = r1.A06
            if (r0 == 0) goto L_0x003c
            java.util.List r5 = r0.A08
            if (r5 == 0) goto L_0x003c
            java.util.ArrayList r20 = X.AnonymousClass7TG.A0r(r5)
            java.util.Iterator r8 = r5.iterator()
        L_0x0028:
            boolean r5 = r8.hasNext()
            if (r5 == 0) goto L_0x003e
            java.lang.Object r5 = r8.next()
            X.4sL r5 = (X.C276014sL) r5
            X.1Xj r7 = r5.A00
            r5 = r20
            r5.add(r7)
            goto L_0x0028
        L_0x003c:
            r20 = r2
        L_0x003e:
            com.instagram.api.schemas.ClipsMidCardType r9 = r1.A04
            r14 = -1
            if (r9 == 0) goto L_0x0163
            int r5 = r9.ordinal()
            if (r5 != r6) goto L_0x0163
            java.util.List r5 = r4.A0G
            if (r5 == 0) goto L_0x067b
            java.lang.Object r22 = X.00k.A0J(r5)
            r5 = r22
            com.instagram.common.typedurl.ImageUrl r5 = (com.instagram.common.typedurl.ImageUrl) r5
            r22 = r5
            if (r5 == 0) goto L_0x067b
        L_0x0059:
            com.instagram.api.schemas.MidCardLayoutType r5 = r1.A07
            r37 = r5
            int r8 = r37.ordinal()
            if (r8 == r10) goto L_0x015d
            if (r8 == r6) goto L_0x015a
            boolean r5 = r4.A0K
            r23 = r5
            r49 = 1
        L_0x006b:
            if (r9 == 0) goto L_0x0154
            int r5 = r9.ordinal()
            if (r5 != r6) goto L_0x0154
            java.util.List r13 = r4.A0F
            if (r13 == 0) goto L_0x0676
            java.util.List r12 = r4.A0G
            if (r12 == 0) goto L_0x0671
            com.instagram.api.schemas.MidCardClipsClickedAction r7 = r0.A00
            com.instagram.api.schemas.MidCardClipsClickedAction r5 = com.instagram.api.schemas.MidCardClipsClickedAction.OPEN_IN_DRAFT_PUBLISH_SCREEN
            boolean r11 = X.AnonymousClass7TF.A1W(r7, r5)
            r7 = 23
            X.JV5 r16 = new X.JV5
            r5 = r16
            r5.<init>((java.util.List) r13, (java.util.List) r12, (int) r7, (boolean) r11)
        L_0x008c:
            com.instagram.api.schemas.MidCardClipsClickedAction r5 = r0.A00
            if (r5 == 0) goto L_0x009c
            int r7 = r5.ordinal()
            if (r7 == r14) goto L_0x009c
            r5 = r18
            if (r7 == r5) goto L_0x0150
            if (r7 == r6) goto L_0x0150
        L_0x009c:
            r48 = 0
        L_0x009e:
            com.instagram.api.schemas.MidCardOverlayType r5 = r0.A04
            r36 = r5
            com.instagram.api.schemas.InstagramMidcardType r5 = r4.A05
            r34 = r5
            java.lang.String r5 = r5.A00
            r43 = r5
            boolean r11 = r4.A0K
            if (r11 == 0) goto L_0x014c
            X.Gol r5 = r1.A08
            if (r5 == 0) goto L_0x0148
            X.GoY r5 = r5.A00
            if (r5 == 0) goto L_0x0148
            java.lang.String r5 = r5.A02
            if (r5 == 0) goto L_0x0148
        L_0x00ba:
            X.GKw r35 = X.JUH.A00(r5)
        L_0x00be:
            r27 = 0
            if (r11 == 0) goto L_0x0145
            X.Gol r5 = r1.A08
            if (r5 == 0) goto L_0x00d5
            X.GoY r5 = r5.A00
            if (r5 == 0) goto L_0x00d5
            java.lang.String r7 = r5.A01
        L_0x00cc:
            if (r7 == 0) goto L_0x00d5
            X.GKw r27 = new X.GKw
            r5 = r27
            r5.<init>(r7)
        L_0x00d5:
            java.util.List r5 = r4.A0H
            r45 = r5
            java.util.List r5 = r0.A08
            r47 = r5
            java.lang.Object r5 = X.00k.A0J(r47)
            X.4sL r5 = (X.C276014sL) r5
            if (r5 == 0) goto L_0x0142
            X.1Xj r5 = r5.A00
            r38 = r5
        L_0x00e9:
            java.util.List r5 = r0.A09
            r46 = r5
            if (r11 == 0) goto L_0x0135
            X.Gol r5 = r1.A08
            if (r5 == 0) goto L_0x010d
            X.GoY r5 = r5.A00
            if (r5 == 0) goto L_0x010d
            X.Goi r12 = r5.A00
            if (r12 == 0) goto L_0x010d
            java.util.List r5 = r4.A0F
            if (r5 == 0) goto L_0x0133
            java.lang.Object r7 = X.00k.A0J(r5)
            java.lang.String r7 = (java.lang.String) r7
        L_0x0105:
            X.IvY r5 = X.C58663IvY.A00
            X.JNG r28 = X.GDI.A01(r12, r3, r7, r5)
            if (r28 != 0) goto L_0x0114
        L_0x010d:
            X.Gaq r28 = new X.Gaq
            r5 = r28
            r5.<init>(r2)
        L_0x0114:
            X.Goi r7 = r0.A02
            r5 = 33
            X.Iw1 r5 = X.C58692Iw1.A00(r1, r3, r5)
            X.JNG r40 = X.GDI.A01(r7, r3, r2, r5)
            if (r8 == r10) goto L_0x0567
            if (r8 == r6) goto L_0x0567
            r5 = r21
            if (r8 == r5) goto L_0x0427
            r5 = r18
            if (r8 == r5) goto L_0x017d
            if (r8 == r15) goto L_0x0567
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0133:
            r7 = r2
            goto L_0x0105
        L_0x0135:
            X.Goi r7 = r0.A01
            r5 = 32
            X.Iw1 r5 = X.C58692Iw1.A00(r1, r3, r5)
            X.JNG r28 = X.GDI.A01(r7, r3, r2, r5)
            goto L_0x0114
        L_0x0142:
            r38 = r2
            goto L_0x00e9
        L_0x0145:
            java.lang.String r7 = r0.A05
            goto L_0x00cc
        L_0x0148:
            r35 = 0
            goto L_0x00be
        L_0x014c:
            java.lang.String r5 = r0.A06
            goto L_0x00ba
        L_0x0150:
            r48 = 1
            goto L_0x009e
        L_0x0154:
            r16 = r2
            if (r0 == 0) goto L_0x009c
            goto L_0x008c
        L_0x015a:
            r49 = 0
            goto L_0x015f
        L_0x015d:
            r49 = 1
        L_0x015f:
            r23 = 1
            goto L_0x006b
        L_0x0163:
            java.util.List r5 = r0.A08
            X.0qQ.A0B(r5, r15)
            java.lang.Object r5 = X.00k.A0O(r5, r15)
            if (r5 == 0) goto L_0x0680
            X.4sL r5 = (X.C276014sL) r5
            X.1Xj r5 = r5.A00
            com.instagram.common.typedurl.ImageUrl r22 = r5.A1Q()
            if (r22 != 0) goto L_0x0059
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r17)
            throw r0
        L_0x017d:
            com.instagram.api.schemas.ClipsMidCardType r5 = com.instagram.api.schemas.ClipsMidCardType.DRAFT
            if (r9 != r5) goto L_0x0279
            if (r11 != 0) goto L_0x05e8
            X.0eM r5 = r3.A06
            java.lang.Object r8 = r5.getValue()
            X.Hmv r8 = (X.C55760Hmv) r8
            java.util.List r25 = X.GDI.A02(r1, r4, r3)
            java.util.List r5 = r4.A0G
            r24 = r5
            if (r5 == 0) goto L_0x0276
            java.lang.Object r7 = X.00k.A0J(r24)
            com.instagram.common.typedurl.ImageUrl r7 = (com.instagram.common.typedurl.ImageUrl) r7
            if (r7 != 0) goto L_0x01b1
        L_0x019d:
            X.0eM r5 = r8.A02
            java.lang.Object r10 = r5.getValue()
            X.0fA r10 = (X.0fA) r10
            r9 = 817892914(0x30c00e32, float:1.3973873E-9)
            java.lang.String r5 = "ClipsMidcardV2MegaCardUseCase: first draft image url is null"
            X.0f9 r5 = r10.AEf(r5, r9)
            r5.report()
        L_0x01b1:
            X.0sn r66 = X.0sn.A00
            java.lang.String r5 = r0.A06
            r33 = r5
            java.lang.String r5 = r0.A05
            r32 = r5
            X.H2H r14 = r8.A01
            if (r16 == 0) goto L_0x0610
            r5 = r16
            java.lang.Object r5 = r5.A00
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L_0x0610
            java.util.ArrayList r12 = X.AnonymousClass7TG.A0r(r5)
            java.util.Iterator r19 = r5.iterator()
            r9 = 0
        L_0x01d0:
            boolean r5 = r19.hasNext()
            if (r5 == 0) goto L_0x0612
            java.lang.Object r8 = r19.next()
            int r18 = r9 + 1
            if (r9 < 0) goto L_0x0554
            com.instagram.common.typedurl.ImageUrl r8 = (com.instagram.common.typedurl.ImageUrl) r8
            X.H2S r10 = r14.A00
            X.0qQ.A0B(r8, r6)
            r5 = r25
            X.02z r63 = X.H2S.A00(r1, r10, r5, r9)
            com.instagram.api.schemas.MidCardClipsClickedAction r5 = r0.A00
            r31 = r5
            java.util.List r5 = r0.A07
            java.lang.Object r11 = X.00k.A0O(r5, r9)
            X.JSG r11 = (X.JSG) r11
            com.instagram.common.session.UserSession r5 = r10.A00
            X.0wX r5 = r5.A03
            r5.A06()
            X.IeX r5 = X.C57668IeX.A00
            X.JNE r5 = (X.JNE) r5
            X.Iei r13 = new X.Iei
            r13.<init>(r5)
            java.util.List r5 = r0.A0A
            if (r5 == 0) goto L_0x0273
            java.lang.Object r5 = X.00k.A0O(r5, r9)
            X.Goi r5 = (X.C53450Goi) r5
            if (r5 == 0) goto L_0x0273
            X.Goj r5 = r5.A00
            r30 = r5
        L_0x0217:
            r5 = r46
            java.lang.Object r5 = X.00k.A0O(r5, r9)
            X.Goi r5 = (X.C53450Goi) r5
            if (r5 == 0) goto L_0x0270
            X.Goj r5 = r5.A00
            r26 = r5
        L_0x0225:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r17 = r47.iterator()
        L_0x022e:
            boolean r5 = r17.hasNext()
            if (r5 == 0) goto L_0x0246
            java.lang.Object r5 = r17.next()
            X.4sL r5 = (X.C276014sL) r5
            X.1Xj r5 = r5.A00
            java.lang.String r5 = r5.getId()
            if (r5 == 0) goto L_0x022e
            r10.add(r5)
            goto L_0x022e
        L_0x0246:
            X.GrI r5 = new X.GrI
            r50 = r5
            r51 = r31
            r52 = r11
            r53 = r30
            r54 = r26
            r55 = r37
            r56 = r8
            r57 = r13
            r58 = r2
            r59 = r2
            r60 = r42
            r61 = r2
            r62 = r10
            r64 = r9
            r65 = r15
            r50.<init>(r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65)
            r12.add(r5)
            r9 = r18
            goto L_0x01d0
        L_0x0270:
            r26 = r2
            goto L_0x0225
        L_0x0273:
            r30 = r2
            goto L_0x0217
        L_0x0276:
            r7 = 0
            goto L_0x019d
        L_0x0279:
            X.0eM r5 = r3.A06
            java.lang.Object r5 = r5.getValue()
            X.Hmv r5 = (X.C55760Hmv) r5
            java.util.List r26 = X.GDI.A02(r1, r2, r3)
            java.util.List r13 = r0.A0A
            if (r13 == 0) goto L_0x02b2
            java.util.ArrayList r25 = X.AnonymousClass7TG.A0r(r13)
            r9 = 0
            java.util.Iterator r12 = r13.iterator()
        L_0x0292:
            boolean r7 = r12.hasNext()
            if (r7 == 0) goto L_0x02b4
            java.lang.Object r8 = r12.next()
            int r11 = r9 + 1
            if (r9 < 0) goto L_0x0554
            X.Goi r8 = (X.C53450Goi) r8
            X.Ino r7 = new X.Ino
            r7.<init>(r1, r9, r10)
            X.JNG r8 = X.GDI.A01(r8, r3, r2, r7)
            r7 = r25
            r7.add(r8)
            r9 = r11
            goto L_0x0292
        L_0x02b2:
            r25 = 0
        L_0x02b4:
            r24 = 10
            java.util.ArrayList r9 = X.AnonymousClass7TF.A0p(r47)
            java.util.Iterator r7 = r47.iterator()
        L_0x02be:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x02d4
            java.lang.Object r2 = r7.next()
            X.4sL r2 = (X.C276014sL) r2
            X.1Xj r2 = r2.A00
            com.instagram.common.typedurl.ImageUrl r2 = r2.A1Q()
            r9.add(r2)
            goto L_0x02be
        L_0x02d4:
            java.lang.Object r10 = X.00k.A0J(r9)
            com.instagram.common.typedurl.ImageUrl r10 = (com.instagram.common.typedurl.ImageUrl) r10
            if (r10 != 0) goto L_0x02f0
            X.0eM r2 = r5.A02
            java.lang.Object r8 = r2.getValue()
            X.0fA r8 = (X.0fA) r8
            r7 = 817892914(0x30c00e32, float:1.3973873E-9)
            java.lang.String r2 = "ClipsMidcardV2MegaCardUseCase: thumbnailUrl for first media in clipsItem is null"
            X.0f9 r2 = r8.AEf(r2, r7)
            r2.report()
        L_0x02f0:
            java.util.ArrayList r19 = X.AnonymousClass7TF.A0p(r47)
            java.util.Iterator r8 = r47.iterator()
        L_0x02f8:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L_0x030c
            java.lang.Object r2 = r8.next()
            X.4sL r2 = (X.C276014sL) r2
            X.1Xj r7 = r2.A00
            r2 = r19
            r2.add(r7)
            goto L_0x02f8
        L_0x030c:
            java.util.List r66 = X.00k.A0X(r9)
            java.lang.String r2 = r0.A06
            r32 = r2
            java.lang.String r2 = r0.A05
            r31 = r2
            X.H2H r2 = r5.A01
            r30 = r2
            java.util.ArrayList r14 = X.AnonymousClass7TF.A0p(r47)
            java.util.Iterator r18 = r47.iterator()
            r5 = 0
        L_0x0325:
            boolean r2 = r18.hasNext()
            if (r2 == 0) goto L_0x0407
            java.lang.Object r2 = r18.next()
            int r17 = r5 + 1
            if (r5 < 0) goto L_0x0554
            X.4sL r2 = (X.C276014sL) r2
            r7 = r30
            X.H2S r7 = r7.A00
            X.0qQ.A0B(r2, r6)
            X.1Xj r8 = r2.A00
            java.lang.String r9 = r8.A2n()
            if (r9 == 0) goto L_0x0403
            r2 = r24
            java.lang.Long r58 = X.00y.A0n(r2, r9)
        L_0x034a:
            X.1Xy r2 = r8.A0C
            X.DSK r2 = r2.BOl()
            if (r2 == 0) goto L_0x03ff
            java.util.List r61 = r2.BwO()
        L_0x0356:
            java.lang.String r59 = r8.getId()
            com.instagram.common.session.UserSession r2 = r7.A00
            X.0wX r2 = r2.A03
            r11 = r2
            android.content.Context r2 = r2.A06()
            com.instagram.model.mediasize.ExtendedImageUrl r56 = r8.A1n(r2)
            if (r56 != 0) goto L_0x036d
            com.instagram.model.mediasize.ExtendedImageUrl r56 = r8.A1l()
        L_0x036d:
            boolean r65 = r8.A5I()
            r2 = r26
            X.02z r63 = X.H2S.A00(r1, r7, r2, r5)
            java.util.List r9 = r0.A07
            java.lang.Object r2 = X.00k.A0O(r9, r5)
            X.JSG r2 = (X.JSG) r2
            if (r2 == 0) goto L_0x03fc
            com.instagram.api.schemas.MidCardClipsClickedAction r51 = r2.AYD()
        L_0x0385:
            java.lang.Object r9 = X.00k.A0O(r9, r5)
            X.JSG r9 = (X.JSG) r9
            X.H2U r12 = r7.A01
            java.util.List r2 = r0.A0B
            if (r2 == 0) goto L_0x03fa
            java.lang.Object r7 = X.00k.A0O(r2, r5)
            java.lang.String r7 = (java.lang.String) r7
        L_0x0397:
            android.content.Context r11 = r11.A06()
            r2 = r36
            X.JNH r57 = r12.A05(r11, r2, r8, r7)
            if (r13 == 0) goto L_0x03f8
            java.lang.Object r2 = X.00k.A0O(r13, r5)
            X.Goi r2 = (X.C53450Goi) r2
            if (r2 == 0) goto L_0x03f8
            X.Goj r11 = r2.A00
        L_0x03ad:
            r2 = r46
            java.lang.Object r2 = X.00k.A0O(r2, r5)
            X.Goi r2 = (X.C53450Goi) r2
            if (r2 == 0) goto L_0x03f6
            X.Goj r8 = r2.A00
        L_0x03b9:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r12 = r47.iterator()
        L_0x03c2:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L_0x03da
            java.lang.Object r2 = r12.next()
            X.4sL r2 = (X.C276014sL) r2
            X.1Xj r2 = r2.A00
            java.lang.String r2 = r2.getId()
            if (r2 == 0) goto L_0x03c2
            r7.add(r2)
            goto L_0x03c2
        L_0x03da:
            X.GrI r2 = new X.GrI
            r50 = r2
            r52 = r9
            r53 = r11
            r54 = r8
            r55 = r37
            r60 = r42
            r62 = r7
            r64 = r5
            r50.<init>(r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65)
            r14.add(r2)
            r5 = r17
            goto L_0x0325
        L_0x03f6:
            r8 = 0
            goto L_0x03b9
        L_0x03f8:
            r11 = 0
            goto L_0x03ad
        L_0x03fa:
            r7 = 0
            goto L_0x0397
        L_0x03fc:
            r51 = 0
            goto L_0x0385
        L_0x03ff:
            r61 = 0
            goto L_0x0356
        L_0x0403:
            r58 = 0
            goto L_0x034a
        L_0x0407:
            X.Jvs r2 = new X.Jvs
            r0 = r29
            r2.<init>((java.util.List) r14, (int) r0)
            X.GrG r0 = new X.GrG
            r60 = r0
            r61 = r2
            r62 = r10
            r63 = r32
            r64 = r31
            r65 = r19
            r67 = r26
            r68 = r25
            r69 = r15
            r60.<init>(r61, r62, r63, r64, r65, r66, r67, r68, r69)
            goto L_0x0636
        L_0x0427:
            if (r11 != 0) goto L_0x05e8
            X.0eM r5 = r3.A07
            java.lang.Object r7 = r5.getValue()
            X.H2J r7 = (X.H2J) r7
            java.util.List r14 = X.GDI.A02(r1, r2, r3)
            com.instagram.api.schemas.ClipsMidCardType r5 = com.instagram.api.schemas.ClipsMidCardType.DRAFT
            if (r9 != r5) goto L_0x04a3
            java.util.List r5 = r4.A0F
            if (r5 == 0) goto L_0x049e
            java.util.ArrayList r9 = X.AnonymousClass7TF.A0p(r5)
            java.util.Iterator r17 = r5.iterator()
            r11 = 0
        L_0x0446:
            boolean r5 = r17.hasNext()
            if (r5 == 0) goto L_0x055c
            java.lang.Object r10 = r17.next()
            int r13 = r11 + 1
            if (r11 < 0) goto L_0x0554
            java.lang.String r10 = (java.lang.String) r10
            java.util.List r5 = r4.A0E
            if (r5 == 0) goto L_0x049c
            java.lang.Object r8 = X.00k.A0O(r5, r11)
            java.lang.String r8 = (java.lang.String) r8
        L_0x0460:
            java.util.List r5 = r4.A0G
            if (r5 == 0) goto L_0x049a
            java.lang.Object r6 = X.00k.A0O(r5, r11)
            com.instagram.common.typedurl.ImageUrl r6 = (com.instagram.common.typedurl.ImageUrl) r6
        L_0x046a:
            com.instagram.common.session.UserSession r5 = r7.A00
            X.0wX r5 = r5.A03
            r5.A06()
            X.IeX r5 = X.C57668IeX.A00
            X.JNE r5 = (X.JNE) r5
            X.Iei r12 = new X.Iei
            r12.<init>(r5)
            X.GrH r5 = new X.GrH
            r50 = r5
            r51 = r37
            r52 = r2
            r53 = r6
            r54 = r12
            r55 = r2
            r56 = r10
            r57 = r8
            r58 = r42
            r59 = r11
            r60 = r15
            r50.<init>(r51, r52, r53, r54, r55, r56, r57, r58, r59, r60)
            r9.add(r5)
            r11 = r13
            goto L_0x0446
        L_0x049a:
            r6 = r2
            goto L_0x046a
        L_0x049c:
            r8 = r2
            goto L_0x0460
        L_0x049e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r17)
            throw r0
        L_0x04a3:
            java.util.ArrayList r8 = X.AnonymousClass7TF.A0p(r47)
            java.util.Iterator r9 = r47.iterator()
        L_0x04ab:
            boolean r5 = r9.hasNext()
            if (r5 == 0) goto L_0x04bd
            java.lang.Object r5 = r9.next()
            X.4sL r5 = (X.C276014sL) r5
            X.1Xj r5 = r5.A00
            r8.add(r5)
            goto L_0x04ab
        L_0x04bd:
            java.util.List r10 = X.00k.A0d(r8, r6)
            int r5 = r10.size()
            if (r5 >= r6) goto L_0x04d0
            X.0kg r8 = X.0kg.A06
            java.lang.String r6 = "MidcardV2GridUseCase"
            java.lang.String r5 = "not enough media to show"
            X.0wb.A01(r8, r6, r5)
        L_0x04d0:
            java.util.ArrayList r9 = X.AnonymousClass7TF.A0p(r10)
            java.util.Iterator r18 = r10.iterator()
            r6 = 0
        L_0x04d9:
            boolean r5 = r18.hasNext()
            if (r5 == 0) goto L_0x055c
            java.lang.Object r8 = r18.next()
            int r17 = r6 + 1
            if (r6 < 0) goto L_0x0554
            X.1Xj r8 = (X.1Xj) r8
            java.lang.String r55 = r8.getId()
            com.instagram.common.session.UserSession r5 = r7.A00
            X.0wX r12 = r5.A03
            android.content.Context r5 = r12.A06()
            android.content.Context r5 = r5.getApplicationContext()
            X.0qQ.A07(r5)
            com.instagram.common.typedurl.ImageUrlBase r53 = X.C52154GGw.A00(r5, r8)
            boolean r60 = r8.A5I()
            int r5 = r46.size()
            if (r6 >= r5) goto L_0x0549
            r5 = r46
            java.lang.Object r5 = r5.get(r6)
            X.Goi r5 = (X.C53450Goi) r5
            java.lang.String r5 = r5.A01
            X.GKw r11 = X.JUH.A00(r5)
        L_0x0518:
            X.H2U r13 = r7.A01
            java.util.List r5 = r0.A0B
            if (r5 == 0) goto L_0x0547
            java.lang.Object r10 = X.00k.A0O(r5, r6)
            java.lang.String r10 = (java.lang.String) r10
        L_0x0524:
            android.content.Context r12 = r12.A06()
            r5 = r36
            X.JNH r54 = r13.A05(r12, r5, r8, r10)
            X.GrH r5 = new X.GrH
            r50 = r5
            r51 = r37
            r52 = r11
            r56 = r2
            r57 = r2
            r58 = r42
            r59 = r6
            r50.<init>(r51, r52, r53, r54, r55, r56, r57, r58, r59, r60)
            r9.add(r5)
            r6 = r17
            goto L_0x04d9
        L_0x0547:
            r10 = r2
            goto L_0x0524
        L_0x0549:
            java.lang.Object[] r10 = new java.lang.Object[r15]
            r5 = 2131963566(0x7f132eae, float:1.956389E38)
            X.GKO r11 = new X.GKO
            r11.<init>(r10, r5)
            goto L_0x0518
        L_0x0554:
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x055c:
            X.Goi r0 = r0.A01
            java.lang.String r2 = r0.A01
            X.GrF r0 = new X.GrF
            r0.<init>(r9, r14, r2)
            goto L_0x0636
        L_0x0567:
            X.0eM r2 = r3.A03
            java.lang.Object r6 = r2.getValue()
            X.H2I r6 = (X.H2I) r6
            X.Goi r0 = r0.A01
            java.lang.String r5 = r0.A01
            if (r7 == 0) goto L_0x05d8
            X.Goj r0 = r7.A00
            if (r0 == 0) goto L_0x05d8
            java.lang.Boolean r2 = r0.A08
            r0 = r21
            boolean r0 = X.AnonymousClass7TF.A1Y(r2, r0)
            if (r0 == 0) goto L_0x05d8
            java.lang.Object r0 = X.00k.A0J(r47)
            X.4sL r0 = (X.C276014sL) r0
            if (r0 == 0) goto L_0x05d8
            X.1Xj r0 = r0.A00
            if (r0 == 0) goto L_0x05d8
            X.1sQ r2 = X.C51966G9m.A0n(r0)
            if (r2 == 0) goto L_0x05d8
            com.instagram.api.schemas.MusicInfo r0 = r2.BUr()
            if (r0 == 0) goto L_0x05cc
            X.46h r2 = new X.46h
            r2.<init>(r0)
        L_0x05a0:
            java.lang.String r2 = r2.getAssetId()
            if (r2 == 0) goto L_0x05d8
            X.KWw r0 = r6.A00
            X.05F r0 = r0.A03(r2, r15)
            java.lang.Object r2 = r0.getValue()
        L_0x05b0:
            r0 = r21
            boolean r0 = X.AnonymousClass7TF.A1Y(r2, r0)
            if (r0 == 0) goto L_0x05c2
            r0 = 2131972593(0x7f1351f1, float:1.9582198E38)
        L_0x05bb:
            java.lang.Object[] r2 = new java.lang.Object[r15]
            X.GKO r2 = X.DbS.A0Q(r2, r0)
            goto L_0x060a
        L_0x05c2:
            boolean r0 = X.AnonymousClass7TF.A1Y(r2, r15)
            if (r0 == 0) goto L_0x05da
            r0 = 2131972502(0x7f135196, float:1.9582013E38)
            goto L_0x05bb
        L_0x05cc:
            com.instagram.api.schemas.OriginalSoundDataIntf r0 = r2.BZB()
            if (r0 == 0) goto L_0x05d8
            X.5Bc r2 = new X.5Bc
            r2.<init>(r0)
            goto L_0x05a0
        L_0x05d8:
            r2 = 0
            goto L_0x05b0
        L_0x05da:
            if (r7 == 0) goto L_0x05e6
            java.lang.String r0 = r7.A01
            if (r0 == 0) goto L_0x05e6
            X.GKw r2 = new X.GKw
            r2.<init>(r0)
            goto L_0x060a
        L_0x05e6:
            r2 = 0
            goto L_0x060a
        L_0x05e8:
            X.0eM r0 = r3.A03
            r0.getValue()
            X.Gol r0 = r1.A08
            if (r0 == 0) goto L_0x05fd
            X.GoY r0 = r0.A00
            if (r0 == 0) goto L_0x05fd
            X.Goi r0 = r0.A00
            if (r0 == 0) goto L_0x05fd
            java.lang.String r5 = r0.A01
            if (r5 != 0) goto L_0x060a
        L_0x05fd:
            java.lang.Object[] r5 = new java.lang.Object[r15]
            r0 = 2131963566(0x7f132eae, float:1.956389E38)
            X.GKO r0 = X.DbS.A0Q(r5, r0)
            java.lang.String r5 = r0.toString()
        L_0x060a:
            X.GrE r0 = new X.GrE
            r0.<init>(r2, r5)
            goto L_0x0636
        L_0x0610:
            r12 = r66
        L_0x0612:
            X.Jvs r5 = new X.Jvs
            r0 = r29
            r5.<init>((java.util.List) r12, (int) r0)
            java.util.List r0 = r4.A0F
            if (r0 == 0) goto L_0x066e
            int r70 = r0.size()
        L_0x0621:
            X.GrG r0 = new X.GrG
            r61 = r0
            r62 = r5
            r63 = r7
            r64 = r33
            r65 = r32
            r67 = r24
            r68 = r25
            r69 = r2
            r61.<init>(r62, r63, r64, r65, r66, r67, r68, r69, r70)
        L_0x0636:
            X.GDH r2 = r3.A02
            com.instagram.common.session.UserSession r6 = r2.A00
            X.0Tu r5 = X.0Tu.A05
            r2 = 36322856249862694(0x810b7200002a26, double:3.0340587805910537E-306)
            boolean r51 = X.182.A06(r5, r6, r2)
            com.instagram.api.schemas.ClipsMidCardSubtype r3 = r4.A04
            X.GaI r2 = new X.GaI
            r29 = r16
            r30 = r3
            r31 = r34
            r32 = r1
            r33 = r36
            r34 = r4
            r36 = r27
            r37 = r22
            r39 = r28
            r41 = r0
            r44 = r20
            r50 = r23
            r28 = r2
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51)
            X.GZ2 r1 = new X.GZ2
            r0 = r21
            r1.<init>(r2, r0)
            return r1
        L_0x066e:
            r70 = 0
            goto L_0x0621
        L_0x0671:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r17)
            throw r0
        L_0x0676:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r17)
            throw r0
        L_0x067b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r17)
            throw r0
        L_0x0680:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r17)
            throw r0
        L_0x0685:
            com.instagram.api.schemas.InstagramMidcardType r2 = r4.A05
            int r1 = r2.ordinal()
            r0 = r29
            if (r1 == r0) goto L_0x0743
            r0 = 28
            if (r1 != r0) goto L_0x072c
            X.GDu r5 = r3.A04
            java.util.List r0 = r4.A0H
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r1 = r0.iterator()
        L_0x069f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x06b3
            java.lang.Object r0 = r1.next()
            X.4bN r0 = (X.C267324bN) r0
            X.1Xj r0 = r0.A02
            if (r0 == 0) goto L_0x069f
            r3.add(r0)
            goto L_0x069f
        L_0x06b3:
            X.Got r7 = r4.A07
            java.lang.String r8 = "Required value was null."
            if (r7 == 0) goto L_0x0727
            boolean r1 = r7.A04
            r0 = r21
            boolean r17 = X.AnonymousClass7TF.A1S(r1, r0)
            com.instagram.api.schemas.ClipsRSAMidCardSubType r0 = r7.A00
            if (r0 == 0) goto L_0x071f
            int r1 = r0.ordinal()
            r0 = r21
            if (r1 == r0) goto L_0x071a
            r0 = 2
            if (r1 != r0) goto L_0x071f
            if (r17 == 0) goto L_0x0717
            X.28D r9 = X.28D.A1C
        L_0x06d4:
            java.lang.String r6 = r2.A00
            java.lang.String r0 = r7.A02
            X.GKw r11 = X.JUH.A00(r0)
            java.lang.String r0 = r7.A01
            X.GKw r12 = X.JUH.A00(r0)
            java.util.List r0 = r7.A03
            java.lang.Object r0 = X.00k.A0O(r0, r15)
            X.4sL r0 = (X.C276014sL) r0
            if (r0 == 0) goto L_0x0722
            X.1Xj r0 = r0.A00
            if (r0 == 0) goto L_0x0722
            com.instagram.common.typedurl.ImageUrl r13 = r0.A1Q()
            if (r13 == 0) goto L_0x0722
            X.GDH r0 = r5.A01
            com.instagram.common.session.UserSession r5 = r0.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322856249862694(0x810b7200002a26, double:3.0340587805910537E-306)
            boolean r18 = X.182.A06(r2, r5, r0)
            X.Gr0 r8 = new X.Gr0
            r10 = r4
            r14 = r42
            r15 = r6
            r16 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r0 = 2
            X.GZ2 r1 = new X.GZ2
            r1.<init>(r8, r0)
            return r1
        L_0x0717:
            X.28D r9 = X.28D.A1B
            goto L_0x06d4
        L_0x071a:
            if (r17 == 0) goto L_0x071f
            X.28D r9 = X.28D.A1A
            goto L_0x06d4
        L_0x071f:
            X.28D r9 = X.28D.A19
            goto L_0x06d4
        L_0x0722:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        L_0x0727:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        L_0x072c:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Midcard of type "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " not supported in litho"
            java.lang.String r0 = X.AnonymousClass7TF.A0l(r0, r1)
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0743:
            X.GDs r1 = r3.A01
            X.GoT r7 = r4.A02
            java.lang.String r6 = "Required value was null."
            if (r7 == 0) goto L_0x07bd
            java.util.List r5 = r7.A03
            if (r5 == 0) goto L_0x0756
            boolean r3 = r5.isEmpty()
            r0 = 0
            if (r3 == 0) goto L_0x0757
        L_0x0756:
            r0 = 1
        L_0x0757:
            r26 = r0 ^ 1
            if (r26 != 0) goto L_0x075d
            java.util.List r5 = r7.A02
        L_0x075d:
            if (r5 == 0) goto L_0x07b8
            java.lang.Object r0 = X.00k.A0O(r5, r15)
            if (r0 == 0) goto L_0x07b3
            X.4sL r0 = (X.C276014sL) r0
            X.1Xj r0 = r0.A00
            com.instagram.common.typedurl.ImageUrl r22 = r0.A1Q()
            if (r22 == 0) goto L_0x07ae
            com.instagram.api.schemas.ClipsMidCardSubtype r0 = r4.A04
            X.Jw7 r6 = new X.Jw7
            r6.<init>(r0, r2)
            java.lang.String r5 = r2.A00
            java.util.List r25 = X.C52072GDs.A00(r7)
            java.lang.String r0 = r7.A01
            X.GKw r20 = X.JUH.A00(r0)
            java.lang.String r0 = r7.A00
            X.GKw r21 = X.JUH.A00(r0)
            X.GDH r0 = r1.A01
            com.instagram.common.session.UserSession r3 = r0.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322856249862694(0x810b7200002a26, double:3.0340587805910537E-306)
            boolean r27 = X.182.A06(r2, r3, r0)
            X.Gam r0 = new X.Gam
            r19 = r4
            r23 = r42
            r24 = r5
            r16 = r0
            r17 = r6
            r18 = r7
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            X.GZ2 r1 = new X.GZ2
            r1.<init>(r0, r15)
            return r1
        L_0x07ae:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r6)
            throw r0
        L_0x07b3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r6)
            throw r0
        L_0x07b8:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r6)
            throw r0
        L_0x07bd:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52071GDr.A05(X.GmI, java.lang.String):X.GZ2");
    }
}
