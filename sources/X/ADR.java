package X;

public final class ADR {
    public static final ADR A00 = new Object();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v29, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r11v0, types: [X.0r1, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003a, code lost:
        if (X.182.A06(X.0Tu.A05, r63, 36320378053730679L) == false) goto L_0x003c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0347  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x042a  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x043d  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x04c8  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x050a  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.0eP A00(android.content.Context r66, com.instagram.common.session.UserSession r67, X.C279284yO r68, X.C370018vh r69, X.AnonymousClass8QB r70, X.AnonymousClass8BE r71, java.lang.String r72, java.util.List r73, int r74, int r75, boolean r76) {
        /*
            r65 = this;
            r0 = 0
            r64 = r66
            r57 = r72
            r2 = r64
            r1 = r57
            X.AnonymousClass7TF.A1F(r2, r0, r1)
            X.0r1 r11 = new X.0r1
            r11.<init>()
            r62 = r69
            r1 = r62
            X.8vj r4 = r1.A02
            java.lang.String r21 = "Required value was null."
            if (r4 == 0) goto L_0x0519
            java.util.HashMap r20 = X.AnonymousClass7TE.A1E()
            X.8vl r5 = r4.A04
            if (r5 == 0) goto L_0x0514
            java.util.ArrayList r19 = X.AnonymousClass7TE.A1C()
            r63 = r67
            if (r76 == 0) goto L_0x003c
            X.0Tu r6 = X.0Tu.A05
            r1 = 36320378053730679(0x81093100002177, double:3.0324915593782725E-306)
            r3 = r63
            boolean r1 = X.182.A06(r6, r3, r1)
            r18 = 1
            if (r1 != 0) goto L_0x02e2
        L_0x003c:
            r18 = 0
            X.8vn r1 = r5.A02
            if (r1 == 0) goto L_0x02e2
            android.util.SparseArray r12 = r1.A00
        L_0x0044:
            java.util.List r1 = r5.A03
            r52 = r68
            r61 = r70
            r6 = r71
            r60 = r74
            r59 = r75
            if (r18 == 0) goto L_0x0347
            if (r73 == 0) goto L_0x0342
            java.util.Iterator r17 = r73.iterator()
        L_0x0058:
            boolean r1 = r17.hasNext()
            if (r1 == 0) goto L_0x02e9
            java.lang.Object r10 = r17.next()
            X.XCH r10 = (X.XCH) r10
            X.513 r16 = X.C18686Vwk.A00(r10)
            if (r16 == 0) goto L_0x0058
            X.50v r8 = r16.A00()
            X.0qQ.A0B(r10, r0)
            r7 = 2
            X.0qQ.A0B(r8, r7)
            boolean r1 = r10 instanceof X.C15088UOg
            if (r1 != 0) goto L_0x00e6
            X.UKv r1 = r10.Az6()
            if (r1 == 0) goto L_0x00e6
            int r3 = r1.A08
            X.4nO r2 = new X.4nO
            r2.<init>()
            int r1 = r10.Brw()
            r2.A01(r1)
            X.UKv r1 = r10.Az6()
            if (r1 == 0) goto L_0x00c5
            boolean r1 = r1.A0D
        L_0x0095:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2.A02 = r1
            boolean r1 = r10 instanceof X.C15091UOj
            if (r1 == 0) goto L_0x00c0
            r9 = r10
            X.UOj r9 = (X.C15091UOj) r9
            java.util.List r1 = r9.A0P
            if (r1 == 0) goto L_0x00c7
            java.util.ArrayList r9 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r13 = r1.iterator()
        L_0x00ae:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x00cd
            java.lang.Object r1 = r13.next()
            X.ULl r1 = (X.ULl) r1
            java.lang.String r1 = r1.A0L
            r9.add(r1)
            goto L_0x00ae
        L_0x00c0:
            java.lang.String r1 = r10.CDC()
            goto L_0x00c9
        L_0x00c5:
            r1 = 0
            goto L_0x0095
        L_0x00c7:
            java.lang.String r1 = r9.A0K
        L_0x00c9:
            java.util.List r9 = X.AnonymousClass7TE.A1I(r1)
        L_0x00cd:
            r2.A06 = r9
            boolean r1 = r8 instanceof X.AnonymousClass5JL
            if (r1 == 0) goto L_0x00d9
            X.5JL r8 = (X.AnonymousClass5JL) r8
            X.50v r8 = X.AnonymousClass7TF.A0O(r8)
        L_0x00d9:
            X.4nO r1 = r8.BkW()
            X.4nP r1 = r1.A01
            if (r1 == 0) goto L_0x00e3
            r2.A01 = r1
        L_0x00e3:
            r12.put(r3, r2)
        L_0x00e6:
            X.ULH r9 = r10.Ayy()
            r3 = 0
            if (r9 == 0) goto L_0x0058
            r24 = 0
            java.lang.String r1 = r9.A09
            r29 = r1
            X.Uwh r1 = r9.A07
            java.lang.String r1 = r1.A00
            java.lang.Integer r26 = X.AnonymousClass511.A00(r1)
            if (r26 != 0) goto L_0x00ff
            java.lang.Integer r26 = X.AnonymousClass05K.A00
        L_0x00ff:
            boolean r1 = r9.A0B
            r38 = r1
            boolean r1 = r9.A0J
            r39 = r1
            boolean r1 = r9.A0N
            r40 = r1
            boolean r1 = r9.A0M
            r41 = r1
            boolean r1 = r9.A0L
            r42 = r1
            boolean r1 = r9.A0K
            r43 = r1
            boolean r1 = r9.A0C
            r44 = r1
            float r1 = r9.A01
            r32 = r1
            float r1 = r9.A00
            r33 = r1
            java.util.List r1 = r9.A0A
            r31 = r1
            float r1 = r9.A04
            r34 = r1
            float r1 = r9.A02
            r35 = r1
            float r1 = r9.A03
            r36 = r1
            int r1 = r9.A05
            r37 = r1
            boolean r1 = r9.A0G
            r45 = r1
            boolean r1 = r9.A0H
            r46 = r1
            boolean r1 = r9.A0F
            r22 = r1
            boolean r15 = r9.A0I
            boolean r14 = r9.A0D
            X.ULw r1 = r10.C7Q()
            if (r1 == 0) goto L_0x023b
            int r2 = r1.A01
            java.lang.Integer r27 = java.lang.Integer.valueOf(r2)
            int r1 = r1.A00
            java.lang.Integer r28 = java.lang.Integer.valueOf(r1)
        L_0x0159:
            java.lang.String r13 = r9.A08
            X.UKk r1 = r9.A06
            if (r1 == 0) goto L_0x0179
            X.UxK r2 = r1.A08
            if (r2 == 0) goto L_0x0231
            int r3 = r2.ordinal()
            if (r3 == r0) goto L_0x0226
            r2 = 1
            if (r3 == r2) goto L_0x021b
            if (r3 == r7) goto L_0x020a
            r2 = 3
            if (r3 == r2) goto L_0x01ed
            r1 = 4
            if (r3 != r1) goto L_0x0231
            X.9qg r3 = new X.9qg
            r3.<init>()
        L_0x0179:
            boolean r2 = r9.A0E
            boolean r7 = r9.A0O
            X.6b1 r1 = new X.6b1
            r23 = r3
            r25 = r24
            r30 = r13
            r47 = r22
            r48 = r15
            r49 = r14
            r50 = r2
            r51 = r7
            r22 = r1
            r22.<init>((X.AnonymousClass8BH) r23, (X.AnonymousClass8DA) r24, (X.C3510487j) r25, (java.lang.Integer) r26, (java.lang.Integer) r27, (java.lang.Integer) r28, (java.lang.Object) r29, (java.lang.String) r30, (java.util.List) r31, (float) r32, (float) r33, (float) r34, (float) r35, (float) r36, (int) r37, (boolean) r38, (boolean) r39, (boolean) r40, (boolean) r41, (boolean) r42, (boolean) r43, (boolean) r44, (boolean) r45, (boolean) r46, (boolean) r47, (boolean) r48, (boolean) r49, (boolean) r50, (boolean) r51)
            X.UKv r2 = r10.Az6()
            if (r2 == 0) goto L_0x0058
            int r3 = r2.A08
            r31 = r3
            java.lang.String r3 = r2.A0C
            r23 = r3
            int r3 = r2.A0A
            r32 = r3
            int r3 = r2.A07
            r33 = r3
            int r3 = r2.A09
            r34 = r3
            int r3 = r2.A0B
            r35 = r3
            float r15 = r2.A03
            float r14 = r2.A04
            float r13 = r2.A01
            float r10 = r2.A02
            float r9 = r2.A05
            float r8 = r2.A06
            float r7 = r2.A00
            boolean r3 = r2.A0D
            X.8un r2 = new X.8un
            r22 = r2
            r24 = r15
            r25 = r14
            r26 = r13
            r27 = r10
            r28 = r9
            r29 = r8
            r30 = r7
            r36 = r3
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            boolean r7 = X.AnonymousClass7TF.A1U(r0, r1, r2)
            X.50v r9 = r16.A00()
            if (r71 == 0) goto L_0x0241
            boolean r3 = r6.AFN(r9)
            if (r3 != 0) goto L_0x0241
            r11.A00 = r7
            goto L_0x0058
        L_0x01ed:
            X.ULb r1 = r1.A07
            r2 = 0
            if (r1 == 0) goto L_0x0206
            int r8 = r1.A01
            int r7 = r1.A03
            int r3 = r1.A02
            int r2 = r1.A00
        L_0x01fa:
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>(r8, r7, r3, r2)
            X.Ut6 r3 = new X.Ut6
            r3.<init>(r1)
            goto L_0x0179
        L_0x0206:
            r8 = 0
            r7 = 0
            r3 = 0
            goto L_0x01fa
        L_0x020a:
            int r7 = r1.A06
            float r2 = r1.A02
            int r2 = (int) r2
            float r1 = r1.A03
            int r1 = (int) r1
            float r2 = (float) r2
            float r1 = (float) r1
            X.Ut8 r3 = new X.Ut8
            r3.<init>(r7, r2, r1)
            goto L_0x0179
        L_0x021b:
            float r2 = r1.A04
            float r1 = r1.A05
            X.Ut7 r3 = new X.Ut7
            r3.<init>(r2, r1)
            goto L_0x0179
        L_0x0226:
            float r2 = r1.A00
            float r1 = r1.A01
            X.8BG r3 = new X.8BG
            r3.<init>(r2, r1)
            goto L_0x0179
        L_0x0231:
            r2 = 17
            r1 = 0
            X.Ut8 r3 = new X.Ut8
            r3.<init>(r2, r1, r1)
            goto L_0x0179
        L_0x023b:
            r27 = r3
            r28 = r3
            goto L_0x0159
        L_0x0241:
            boolean r10 = r9 instanceof X.AnonymousClass5JL
            r7 = 0
            if (r10 == 0) goto L_0x02df
            r3 = r9
            X.5JL r3 = (X.AnonymousClass5JL) r3
            if (r3 == 0) goto L_0x02df
            X.50v r8 = X.AnonymousClass7TF.A0O(r3)
        L_0x024f:
            boolean r3 = r8 instanceof X.C387329m2
            if (r3 == 0) goto L_0x02dd
            X.9m2 r8 = (X.C387329m2) r8
            if (r8 == 0) goto L_0x02dd
            X.6nz r3 = r8.A00()
            X.6oG r8 = r3.A00()
        L_0x025f:
            X.6oG r3 = X.C318046oG.CUTOUT_VIDEO
            if (r8 != r3) goto L_0x02db
            X.6tY r8 = X.C353578Ie.A00(r63)
            if (r10 == 0) goto L_0x02d9
            r3 = r9
            X.5JL r3 = (X.AnonymousClass5JL) r3
            if (r3 == 0) goto L_0x02d9
            X.50v r10 = X.AnonymousClass7TF.A0O(r3)
        L_0x0272:
            boolean r3 = r10 instanceof X.C387329m2
            if (r3 == 0) goto L_0x0281
            X.9m2 r10 = (X.C387329m2) r10
            if (r10 == 0) goto L_0x0281
            X.6nz r3 = r10.A00()
            r8.A02(r3)
        L_0x0281:
            java.lang.Integer r55 = java.lang.Integer.valueOf(r60)
            java.lang.Integer r56 = java.lang.Integer.valueOf(r59)
            r50 = r64
            r51 = r63
            r53 = r8
            r54 = r9
            r58 = r0
            android.graphics.drawable.Drawable r8 = X.C39900AIi.A00(r50, r51, r52, r53, r54, r55, r56, r57, r58)
            boolean r3 = r9 instanceof com.instagram.creation.capture.assetpicker.shareplatform.model.SharePlatformStickerClientModel
            if (r3 == 0) goto L_0x02a8
            com.instagram.creation.capture.assetpicker.shareplatform.model.SharePlatformStickerClientModel r9 = (com.instagram.creation.capture.assetpicker.shareplatform.model.SharePlatformStickerClientModel) r9
            if (r9 == 0) goto L_0x02a1
            X.9sG r7 = r9.A08
        L_0x02a1:
            X.9sG r3 = X.C391049sG.MUSIC_PARTNER
            if (r7 != r3) goto L_0x02a8
            r61.DSu()
        L_0x02a8:
            r3 = r20
            r3.put(r8, r2)
            X.8BH r10 = r1.A06
            if (r10 != 0) goto L_0x02b8
            r3 = 1056964608(0x3f000000, float:0.5)
            X.8BG r10 = new X.8BG
            r10.<init>(r3, r3)
        L_0x02b8:
            X.0sn r9 = X.0sn.A00
            r7 = r60
            r3 = r59
            r10.A02(r8, r9, r7, r3)
            int r9 = r2.A08
            r7 = r61
            r3 = r64
            X.9Qs r3 = r7.AMG(r3, r8, r1, r9)
            X.AEV.A01(r2, r3)
            int r1 = r2.A0B
            r3.A09 = r1
            r1 = r19
            r1.add(r3)
            goto L_0x0058
        L_0x02d9:
            r10 = r7
            goto L_0x0272
        L_0x02db:
            r8 = r7
            goto L_0x0281
        L_0x02dd:
            r8 = r7
            goto L_0x025f
        L_0x02df:
            r8 = r7
            goto L_0x024f
        L_0x02e2:
            android.util.SparseArray r12 = new android.util.SparseArray
            r12.<init>()
            goto L_0x0044
        L_0x02e9:
            boolean r1 = r73.isEmpty()
            r3 = 0
            if (r1 != 0) goto L_0x0427
            java.util.ArrayList r6 = X.AnonymousClass7TG.A0r(r73)
            java.util.Iterator r2 = r73.iterator()
        L_0x02f8:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0312
            java.lang.Object r1 = r2.next()
            X.XCH r1 = (X.XCH) r1
            X.UKv r1 = r1.Az6()
            if (r1 == 0) goto L_0x0310
            int r1 = r1.A0B
        L_0x030c:
            X.AnonymousClass7TF.A1M(r6, r1)
            goto L_0x02f8
        L_0x0310:
            r1 = 0
            goto L_0x030c
        L_0x0312:
            java.util.Iterator r7 = r6.iterator()
            boolean r1 = r7.hasNext()
            if (r1 != 0) goto L_0x0327
            r6 = 0
        L_0x031d:
            java.lang.Number r6 = (java.lang.Number) r6
            if (r6 == 0) goto L_0x0427
            int r3 = r6.intValue()
            goto L_0x0427
        L_0x0327:
            java.lang.Object r6 = r7.next()
        L_0x032b:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x031d
            int r2 = X.AnonymousClass7TG.A0F(r7)
            int r1 = X.AnonymousClass7TE.A0M(r6)
            int r1 = java.lang.Math.max(r1, r2)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            goto L_0x032b
        L_0x0342:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r21)
            throw r0
        L_0x0347:
            if (r1 == 0) goto L_0x050f
            java.util.Iterator r14 = r1.iterator()
        L_0x034d:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x0425
            java.lang.Object r1 = r14.next()
            X.A6D r1 = (X.A6D) r1
            X.6b1 r7 = r1.A01
            if (r7 == 0) goto L_0x0420
            X.8un r3 = r1.A02
            if (r3 == 0) goto L_0x041b
            X.513 r1 = r1.A00
            if (r1 == 0) goto L_0x0416
            r2 = 1
            X.50v r8 = r1.A00()
            if (r71 == 0) goto L_0x0375
            boolean r1 = r6.AFN(r8)
            if (r1 != 0) goto L_0x0375
            r11.A00 = r2
            goto L_0x034d
        L_0x0375:
            boolean r13 = r8 instanceof X.AnonymousClass5JL
            r2 = 0
            if (r13 == 0) goto L_0x0413
            r1 = r8
            X.5JL r1 = (X.AnonymousClass5JL) r1
            if (r1 == 0) goto L_0x0413
            X.50v r9 = X.AnonymousClass7TF.A0O(r1)
        L_0x0383:
            boolean r1 = r9 instanceof X.C387329m2
            if (r1 == 0) goto L_0x0411
            X.9m2 r9 = (X.C387329m2) r9
            if (r9 == 0) goto L_0x0411
            X.6nz r1 = r9.A00()
            X.6oG r9 = r1.A00()
        L_0x0393:
            X.6oG r1 = X.C318046oG.CUTOUT_VIDEO
            if (r9 != r1) goto L_0x040f
            X.6tY r10 = X.C353578Ie.A00(r63)
            if (r13 == 0) goto L_0x040d
            r1 = r8
            X.5JL r1 = (X.AnonymousClass5JL) r1
            if (r1 == 0) goto L_0x040d
            X.50v r9 = X.AnonymousClass7TF.A0O(r1)
        L_0x03a6:
            boolean r1 = r9 instanceof X.C387329m2
            if (r1 == 0) goto L_0x03b5
            X.9m2 r9 = (X.C387329m2) r9
            if (r9 == 0) goto L_0x03b5
            X.6nz r1 = r9.A00()
            r10.A02(r1)
        L_0x03b5:
            java.lang.Integer r55 = java.lang.Integer.valueOf(r60)
            java.lang.Integer r56 = java.lang.Integer.valueOf(r59)
            r50 = r64
            r51 = r63
            r53 = r10
            r54 = r8
            r58 = r0
            android.graphics.drawable.Drawable r9 = X.C39900AIi.A00(r50, r51, r52, r53, r54, r55, r56, r57, r58)
            boolean r1 = r8 instanceof com.instagram.creation.capture.assetpicker.shareplatform.model.SharePlatformStickerClientModel
            if (r1 == 0) goto L_0x03dc
            com.instagram.creation.capture.assetpicker.shareplatform.model.SharePlatformStickerClientModel r8 = (com.instagram.creation.capture.assetpicker.shareplatform.model.SharePlatformStickerClientModel) r8
            if (r8 == 0) goto L_0x03d5
            X.9sG r2 = r8.A08
        L_0x03d5:
            X.9sG r1 = X.C391049sG.MUSIC_PARTNER
            if (r2 != r1) goto L_0x03dc
            r61.DSu()
        L_0x03dc:
            r1 = r20
            r1.put(r9, r3)
            X.8BH r10 = r7.A06
            if (r10 != 0) goto L_0x03ec
            r1 = 1056964608(0x3f000000, float:0.5)
            X.8BG r10 = new X.8BG
            r10.<init>(r1, r1)
        L_0x03ec:
            X.0sn r8 = X.0sn.A00
            r2 = r60
            r1 = r59
            r10.A02(r9, r8, r2, r1)
            int r8 = r3.A08
            r2 = r61
            r1 = r64
            X.9Qs r2 = r2.AMG(r1, r9, r7, r8)
            X.AEV.A01(r3, r2)
            int r1 = r3.A0B
            r2.A09 = r1
            r1 = r19
            r1.add(r2)
            goto L_0x034d
        L_0x040d:
            r9 = r2
            goto L_0x03a6
        L_0x040f:
            r10 = r2
            goto L_0x03b5
        L_0x0411:
            r9 = r2
            goto L_0x0393
        L_0x0413:
            r9 = r2
            goto L_0x0383
        L_0x0416:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r21)
            throw r0
        L_0x041b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r21)
            throw r0
        L_0x0420:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r21)
            throw r0
        L_0x0425:
            int r3 = r5.A00
        L_0x0427:
            r2 = 0
            if (r18 == 0) goto L_0x04c8
            r1 = r2
        L_0x042b:
            X.8pN r26 = new X.8pN
            r5 = r26
            r6 = r12
            r7 = r1
            r8 = r19
            r9 = r20
            r10 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            X.8vp r1 = r4.A03
            if (r1 == 0) goto L_0x050a
            java.util.List r3 = r1.A00
            if (r3 == 0) goto L_0x04c6
            X.8Oe r1 = new X.8Oe
            r1.<init>(r3)
            X.8Od r9 = new X.8Od
            r9.<init>(r1)
        L_0x044b:
            X.9IE r8 = r4.A00
            X.8pP r7 = r4.A02
            X.802 r6 = r4.A05
            X.50x r5 = r4.A06
            X.8pQ r1 = r4.A01
            X.8pR r3 = new X.8pR
            r27 = r6
            r28 = r5
            r21 = r3
            r22 = r8
            r23 = r9
            r24 = r1
            r25 = r7
            r21.<init>(r22, r23, r24, r25, r26, r27, r28)
            java.util.Map r7 = X.0Yt.A0B(r20)
            int r20 = r61.Az0()
            int r21 = r61.Ayz()
            r10 = 1
            java.util.Iterator r4 = r19.iterator()
        L_0x0479:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x04c3
            java.lang.Object r1 = r4.next()
            X.B2K r1 = (X.B2K) r1
            X.9Qs r1 = (X.C378669Qs) r1
            android.graphics.drawable.Drawable r1 = r1.A0B
            X.9X8 r1 = X.AnonymousClass9SF.A01(r1)
            if (r1 == 0) goto L_0x0479
            r22 = 1
        L_0x0491:
            java.util.LinkedHashMap r5 = X.AnonymousClass7TE.A1H()
            android.graphics.Matrix r15 = X.AnonymousClass7TE.A0U()
            java.util.Iterator r8 = r19.iterator()
        L_0x049d:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x04cc
            java.lang.Object r1 = r8.next()
            X.B2K r1 = (X.B2K) r1
            X.9Qs r1 = (X.C378669Qs) r1
            int r6 = r1.A0g
            android.graphics.drawable.Drawable r4 = r1.A0B
            java.lang.Object r1 = r7.get(r4)
            X.8un r1 = (X.C369458un) r1
            r17 = r1
            r18 = r5
            r19 = r6
            r23 = r0
            r16 = r4
            X.C355008Of.A00(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            goto L_0x049d
        L_0x04c3:
            r22 = 0
            goto L_0x0491
        L_0x04c6:
            r9 = r2
            goto L_0x044b
        L_0x04c8:
            X.8pO r1 = r5.A01
            goto L_0x042b
        L_0x04cc:
            r0 = r62
            X.8pV r4 = r0.A01
            X.8lx r1 = r0.A00
            if (r4 == 0) goto L_0x04ef
            X.8PW r0 = r4.A05
            if (r0 == 0) goto L_0x04da
            r0.A09 = r5
        L_0x04da:
            X.8pU r1 = new X.8pU
            r6 = r3
            r9 = r2
            r5 = r1
            r7 = r2
            r8 = r4
            r5.<init>(r6, r7, r8, r9, r10)
        L_0x04e4:
            boolean r0 = r11.A00
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.0eP r0 = X.AnonymousClass7TE.A1L(r1, r0)
            return r0
        L_0x04ef:
            if (r1 == 0) goto L_0x04fe
            X.8PW r0 = r1.A05
            if (r0 == 0) goto L_0x04f7
            r0.A09 = r5
        L_0x04f7:
            r1.A07 = r5
            X.8pU r1 = X.AnonymousClass9U9.A00(r3, r1, r2)
            goto L_0x04e4
        L_0x04fe:
            java.lang.String r1 = "SerializedMediaEditsUtil"
            java.lang.String r0 = "storyVideoEdits and storyPhotoEdits are both null"
            X.0kD.A07(r1, r0, r2)
            X.8pU r1 = X.AnonymousClass9U9.A00(r3, r2, r2)
            goto L_0x04e4
        L_0x050a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r21)
            throw r0
        L_0x050f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r21)
            throw r0
        L_0x0514:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r21)
            throw r0
        L_0x0519:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r21)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ADR.A00(android.content.Context, com.instagram.common.session.UserSession, X.4yO, X.8vh, X.8QB, X.8BE, java.lang.String, java.util.List, int, int, boolean):X.0eP");
    }
}
