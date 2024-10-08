package X;

/* renamed from: X.Pgd  reason: case insensitive filesystem */
public final /* synthetic */ class C73602Pgd extends 03J implements 0sP {
    public static final C73602Pgd A00 = new C73602Pgd();

    public C73602Pgd() {
        super(1, C69562No6.class, "computeChicletLayout", "computeChicletLayout(Lcom/facebook/rtc/views/omnigrid/GridLayoutInput;)Lcom/facebook/rtc/views/omnigrid/GridLayoutOutput;", 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01cc, code lost:
        if (r3 == null) goto L_0x01f0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0161 A[Catch:{ all -> 0x0365 }] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x017f A[Catch:{ all -> 0x0365 }] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0193 A[Catch:{ all -> 0x0365 }] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x01ba A[Catch:{ all -> 0x0365 }] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028 A[Catch:{ all -> 0x0365 }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x01c9 A[Catch:{ all -> 0x0365 }] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0029 A[Catch:{ all -> 0x0365 }] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0208 A[Catch:{ all -> 0x0365 }, LOOP:5: B:144:0x0202->B:146:0x0208, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x028a A[Catch:{ all -> 0x0365 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0039 A[Catch:{ all -> 0x0365 }] */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x02c7 A[Catch:{ all -> 0x0365 }] */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0300 A[Catch:{ all -> 0x0365 }] */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0310 A[Catch:{ all -> 0x0365 }] */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0325 A[Catch:{ all -> 0x0365 }] */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0332 A[Catch:{ all -> 0x0365 }] */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0335 A[Catch:{ all -> 0x0365 }] */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0336 A[Catch:{ all -> 0x0365 }] */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x0172 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0064 A[Catch:{ all -> 0x0365 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0074 A[Catch:{ all -> 0x0365 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0075 A[Catch:{ all -> 0x0365 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0083 A[Catch:{ all -> 0x0365 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0088 A[Catch:{ all -> 0x0365 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a7 A[Catch:{ all -> 0x0365 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a9 A[Catch:{ all -> 0x0365 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00d4 A[ADDED_TO_REGION, Catch:{ all -> 0x0365 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0104 A[Catch:{ all -> 0x0365 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x010c A[Catch:{ all -> 0x0365 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0110 A[Catch:{ all -> 0x0365 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0111 A[Catch:{ all -> 0x0365 }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0142 A[Catch:{ all -> 0x0365 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r30) {
        /*
            r29 = this;
            r2 = r30
            com.facebook.rtc.views.omnigrid.GridLayoutInput r2 = (com.facebook.rtc.views.omnigrid.GridLayoutInput) r2
            r12 = 0
            X.0qQ.A0B(r2, r12)
            java.lang.String r1 = "computeChicletLayout"
            r0 = 666114749(0x27b41abd, float:4.9989026E-15)
            X.0fh.A01(r1, r0)
            int r10 = r2.height     // Catch:{ all -> 0x0365 }
            com.facebook.rtc.views.omnigrid.GridLayoutConfigForLayoutInput r6 = r2.config     // Catch:{ all -> 0x0365 }
            java.lang.Object r7 = r6.layoutExtras     // Catch:{ all -> 0x0365 }
            boolean r0 = r7 instanceof X.C68180N3v     // Catch:{ all -> 0x0365 }
            r3 = 0
            if (r0 == 0) goto L_0x0022
            X.N3v r7 = (X.C68180N3v) r7     // Catch:{ all -> 0x0365 }
            if (r7 == 0) goto L_0x0023
            java.lang.Float r5 = r7.A05     // Catch:{ all -> 0x0365 }
            goto L_0x0024
        L_0x0022:
            r7 = r3
        L_0x0023:
            r5 = r3
        L_0x0024:
            r20 = 0
            if (r7 == 0) goto L_0x0029
            goto L_0x002d
        L_0x0029:
            r19 = 0
            r8 = 0
            goto L_0x0033
        L_0x002d:
            int r0 = r7.A00     // Catch:{ all -> 0x0365 }
            r19 = r0
            boolean r8 = r7.A0D     // Catch:{ all -> 0x0365 }
        L_0x0033:
            r16 = 1
            java.util.List r15 = r2.items     // Catch:{ all -> 0x0365 }
            if (r8 != 0) goto L_0x0059
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x0365 }
            java.util.Iterator r9 = r15.iterator()     // Catch:{ all -> 0x0365 }
        L_0x0041:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0365 }
            if (r0 == 0) goto L_0x0058
            java.lang.Object r4 = r9.next()     // Catch:{ all -> 0x0365 }
            r0 = r4
            com.facebook.rtc.views.omnigrid.GridLayoutInputItem r0 = (com.facebook.rtc.views.omnigrid.GridLayoutInputItem) r0     // Catch:{ all -> 0x0365 }
            com.facebook.rtc.views.omnigrid.GridItemType r1 = r0.itemType     // Catch:{ all -> 0x0365 }
            com.facebook.rtc.views.omnigrid.GridItemType r0 = com.facebook.rtc.views.omnigrid.GridItemType.OTHER     // Catch:{ all -> 0x0365 }
            if (r1 == r0) goto L_0x0041
            r11.add(r4)     // Catch:{ all -> 0x0365 }
            goto L_0x0041
        L_0x0058:
            r15 = r11
        L_0x0059:
            int r11 = r2.width     // Catch:{ all -> 0x0365 }
            int r4 = r2.height     // Catch:{ all -> 0x0365 }
            java.lang.Object r13 = r6.layoutExtras     // Catch:{ all -> 0x0365 }
            boolean r0 = r13 instanceof X.C68180N3v     // Catch:{ all -> 0x0365 }
            r9 = 0
            if (r0 == 0) goto L_0x0075
            X.N3v r13 = (X.C68180N3v) r13     // Catch:{ all -> 0x0365 }
            if (r13 == 0) goto L_0x0076
            int r14 = r13.A03     // Catch:{ all -> 0x0365 }
            java.lang.Integer r1 = r13.A06     // Catch:{ all -> 0x0365 }
            java.lang.Integer r9 = r13.A09     // Catch:{ all -> 0x0365 }
        L_0x006e:
            java.lang.Integer r18 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x0365 }
            r0 = r18
            if (r1 == r0) goto L_0x007b
            goto L_0x0079
        L_0x0075:
            r13 = r3
        L_0x0076:
            r14 = 6
            r1 = r3
            goto L_0x006e
        L_0x0079:
            r16 = 0
        L_0x007b:
            java.lang.Integer r1 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x0365 }
            if (r9 != r1) goto L_0x0088
            java.lang.Integer r0 = r13.A07     // Catch:{ all -> 0x0365 }
            if (r0 == 0) goto L_0x0088
            int r9 = r0.intValue()     // Catch:{ all -> 0x0365 }
            goto L_0x00a5
        L_0x0088:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x0365 }
            if (r9 != r0) goto L_0x00ae
            java.lang.Float r9 = r13.A04     // Catch:{ all -> 0x0365 }
            if (r9 == 0) goto L_0x00ae
            boolean r0 = r13.A0B     // Catch:{ all -> 0x0365 }
            if (r0 == 0) goto L_0x00a2
            int r0 = r13.A01     // Catch:{ all -> 0x0365 }
            int r4 = r4 - r0
            int r0 = r13.A02     // Catch:{ all -> 0x0365 }
        L_0x0099:
            int r4 = r4 - r0
            float r4 = (float) r4     // Catch:{ all -> 0x0365 }
            float r0 = r9.floatValue()     // Catch:{ all -> 0x0365 }
            float r4 = r4 * r0
            int r9 = (int) r4     // Catch:{ all -> 0x0365 }
            goto L_0x00a5
        L_0x00a2:
            int r0 = r6.bottomPadding     // Catch:{ all -> 0x0365 }
            goto L_0x0099
        L_0x00a5:
            if (r16 == 0) goto L_0x00a9
            r11 = r9
            goto L_0x00d1
        L_0x00a9:
            int r0 = r9 * 3
            int r11 = r0 / 5
            goto L_0x00d1
        L_0x00ae:
            int r0 = r15.size()     // Catch:{ all -> 0x0365 }
            int r4 = java.lang.Math.min(r14, r0)     // Catch:{ all -> 0x0365 }
            r0 = 3
            int r13 = java.lang.Math.max(r0, r4)     // Catch:{ all -> 0x0365 }
            int r9 = r6.leftPadding     // Catch:{ all -> 0x0365 }
            int r0 = r6.rightPadding     // Catch:{ all -> 0x0365 }
            int r9 = r9 + r0
            int r4 = r13 + -1
            int r0 = r6.horizontalSpacing     // Catch:{ all -> 0x0365 }
            int r4 = r4 * r0
            int r9 = r9 + r4
            int r11 = r11 - r9
            int r11 = r11 / r13
            if (r16 == 0) goto L_0x00cb
            goto L_0x00d0
        L_0x00cb:
            int r0 = r11 * 5
            int r9 = r0 / 3
            goto L_0x00d1
        L_0x00d0:
            r9 = r11
        L_0x00d1:
            r4 = 1
            if (r8 != 0) goto L_0x0101
            if (r7 == 0) goto L_0x00d9
            boolean r0 = r7.A0C     // Catch:{ all -> 0x0365 }
            goto L_0x00fd
        L_0x00d9:
            java.util.List r4 = r2.items     // Catch:{ all -> 0x0365 }
            boolean r0 = r4 instanceof java.util.Collection     // Catch:{ all -> 0x0365 }
            if (r0 == 0) goto L_0x00e6
            boolean r0 = r4.isEmpty()     // Catch:{ all -> 0x0365 }
            if (r0 == 0) goto L_0x00e6
            goto L_0x0101
        L_0x00e6:
            java.util.Iterator r13 = r4.iterator()     // Catch:{ all -> 0x0365 }
        L_0x00ea:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x0365 }
            if (r0 == 0) goto L_0x0101
            java.lang.Object r0 = r13.next()     // Catch:{ all -> 0x0365 }
            com.facebook.rtc.views.omnigrid.GridLayoutInputItem r0 = (com.facebook.rtc.views.omnigrid.GridLayoutInputItem) r0     // Catch:{ all -> 0x0365 }
            com.facebook.rtc.views.omnigrid.GridItemType r4 = r0.itemType     // Catch:{ all -> 0x0365 }
            com.facebook.rtc.views.omnigrid.GridItemType r0 = com.facebook.rtc.views.omnigrid.GridItemType.OTHER     // Catch:{ all -> 0x0365 }
            if (r4 != r0) goto L_0x00ea
            goto L_0x00ff
        L_0x00fd:
            if (r0 != r4) goto L_0x00d9
        L_0x00ff:
            r4 = 1
            goto L_0x0102
        L_0x0101:
            r4 = 0
        L_0x0102:
            if (r7 == 0) goto L_0x0106
            java.lang.Integer r3 = r7.A09     // Catch:{ all -> 0x0365 }
        L_0x0106:
            java.lang.Integer r17 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x0365 }
            r0 = r17
            if (r3 != r0) goto L_0x010e
            r20 = 1
        L_0x010e:
            if (r5 == 0) goto L_0x0111
            goto L_0x0121
        L_0x0111:
            if (r4 == 0) goto L_0x0117
            int r0 = r6.bottomPadding     // Catch:{ all -> 0x0365 }
            int r10 = r10 - r0
            goto L_0x011c
        L_0x0117:
            if (r20 == 0) goto L_0x011e
            int r0 = r6.bottomPadding     // Catch:{ all -> 0x0365 }
            int r10 = r10 - r0
        L_0x011c:
            int r10 = r10 - r9
            goto L_0x0129
        L_0x011e:
            int r10 = r6.topPadding     // Catch:{ all -> 0x0365 }
            goto L_0x0129
        L_0x0121:
            float r3 = r5.floatValue()     // Catch:{ all -> 0x0365 }
            int r10 = r10 - r9
            float r0 = (float) r10     // Catch:{ all -> 0x0365 }
            float r3 = r3 * r0
            int r10 = (int) r3     // Catch:{ all -> 0x0365 }
        L_0x0129:
            r7 = 1
            java.util.List r3 = r2.items     // Catch:{ all -> 0x0365 }
            boolean r0 = r3 instanceof java.util.Collection     // Catch:{ all -> 0x0365 }
            if (r0 == 0) goto L_0x0174
            boolean r0 = r3.isEmpty()     // Catch:{ all -> 0x0365 }
            if (r0 == 0) goto L_0x0174
        L_0x0136:
            java.util.List r0 = r2.items     // Catch:{ all -> 0x0365 }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ all -> 0x0365 }
        L_0x013c:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x0365 }
            if (r0 == 0) goto L_0x0172
            java.lang.Object r6 = r4.next()     // Catch:{ all -> 0x0365 }
            r0 = r6
            com.facebook.rtc.views.omnigrid.GridLayoutInputItem r0 = (com.facebook.rtc.views.omnigrid.GridLayoutInputItem) r0     // Catch:{ all -> 0x0365 }
            com.facebook.rtc.views.omnigrid.GridItemType r3 = r0.itemType     // Catch:{ all -> 0x0365 }
            com.facebook.rtc.views.omnigrid.GridItemType r0 = com.facebook.rtc.views.omnigrid.GridItemType.OTHER     // Catch:{ all -> 0x0365 }
            if (r3 != r0) goto L_0x013c
        L_0x014f:
            com.facebook.rtc.views.omnigrid.GridLayoutInputItem r6 = (com.facebook.rtc.views.omnigrid.GridLayoutInputItem) r6     // Catch:{ all -> 0x0365 }
            java.util.List r0 = r2.items     // Catch:{ all -> 0x0365 }
            java.util.ArrayList r13 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x0365 }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ all -> 0x0365 }
        L_0x015b:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0365 }
            if (r0 == 0) goto L_0x0195
            java.lang.Object r4 = r5.next()     // Catch:{ all -> 0x0365 }
            r0 = r4
            com.facebook.rtc.views.omnigrid.GridLayoutInputItem r0 = (com.facebook.rtc.views.omnigrid.GridLayoutInputItem) r0     // Catch:{ all -> 0x0365 }
            com.facebook.rtc.views.omnigrid.GridItemType r3 = r0.itemType     // Catch:{ all -> 0x0365 }
            com.facebook.rtc.views.omnigrid.GridItemType r0 = com.facebook.rtc.views.omnigrid.GridItemType.OTHER     // Catch:{ all -> 0x0365 }
            if (r3 == r0) goto L_0x015b
            r13.add(r4)     // Catch:{ all -> 0x0365 }
            goto L_0x015b
        L_0x0172:
            r6 = 0
            goto L_0x014f
        L_0x0174:
            java.util.Iterator r5 = r3.iterator()     // Catch:{ all -> 0x0365 }
            r4 = 0
        L_0x0179:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0365 }
            if (r0 == 0) goto L_0x0191
            java.lang.Object r0 = r5.next()     // Catch:{ all -> 0x0365 }
            com.facebook.rtc.views.omnigrid.GridLayoutInputItem r0 = (com.facebook.rtc.views.omnigrid.GridLayoutInputItem) r0     // Catch:{ all -> 0x0365 }
            com.facebook.rtc.views.omnigrid.GridItemType r3 = r0.itemType     // Catch:{ all -> 0x0365 }
            com.facebook.rtc.views.omnigrid.GridItemType r0 = com.facebook.rtc.views.omnigrid.GridItemType.OTHER     // Catch:{ all -> 0x0365 }
            if (r3 != r0) goto L_0x0179
            int r4 = r4 + 1
            if (r4 >= 0) goto L_0x0179
            goto L_0x0356
        L_0x0191:
            if (r4 <= r7) goto L_0x0136
            goto L_0x035e
        L_0x0195:
            if (r8 == 0) goto L_0x01a1
            if (r6 == 0) goto L_0x01a1
            java.util.List r0 = X.AnonymousClass7TE.A1I(r6)     // Catch:{ all -> 0x0365 }
            java.util.ArrayList r13 = X.00k.A0S(r13, r0)     // Catch:{ all -> 0x0365 }
        L_0x01a1:
            int r5 = r2.width     // Catch:{ all -> 0x0365 }
            int r0 = r2.height     // Catch:{ all -> 0x0365 }
            r28 = r0
            com.facebook.rtc.views.omnigrid.GridLayoutConfigForLayoutInput r4 = r2.config     // Catch:{ all -> 0x0365 }
            int r3 = r13.size()     // Catch:{ all -> 0x0365 }
            int r2 = r11 * r3
            int r0 = r4.horizontalSpacing     // Catch:{ all -> 0x0365 }
            int r3 = r3 - r7
            int r0 = r0 * r3
            int r2 = r2 + r0
            java.lang.Object r3 = r4.layoutExtras     // Catch:{ all -> 0x0365 }
            boolean r0 = r3 instanceof X.C68180N3v     // Catch:{ all -> 0x0365 }
            if (r0 == 0) goto L_0x01c9
            X.N3v r3 = (X.C68180N3v) r3     // Catch:{ all -> 0x0365 }
            if (r3 == 0) goto L_0x01ca
            java.lang.Integer r0 = r3.A08     // Catch:{ all -> 0x0365 }
            if (r0 == 0) goto L_0x01ca
            int r0 = r0.intValue()     // Catch:{ all -> 0x0365 }
            if (r0 == 0) goto L_0x01ce
            goto L_0x01ca
        L_0x01c9:
            r3 = 0
        L_0x01ca:
            r17 = r18
            if (r3 == 0) goto L_0x01f0
        L_0x01ce:
            java.lang.Integer r0 = r3.A0A     // Catch:{ all -> 0x0365 }
            if (r0 != r1) goto L_0x01df
            int r0 = r4.leftPadding     // Catch:{ all -> 0x0365 }
            int r14 = r5 - r0
            int r0 = r4.rightPadding     // Catch:{ all -> 0x0365 }
            int r14 = r14 - r0
            r0 = r18
            if (r14 <= r2) goto L_0x01e2
            r0 = r1
            goto L_0x01e2
        L_0x01df:
            if (r0 != 0) goto L_0x01e2
            goto L_0x01f0
        L_0x01e2:
            int r1 = r0.intValue()     // Catch:{ all -> 0x0365 }
            r0 = 2
            if (r1 == r7) goto L_0x01f3
            if (r1 == r12) goto L_0x01f0
            if (r1 != r0) goto L_0x01f0
            int r2 = r4.rightPadding     // Catch:{ all -> 0x0365 }
            goto L_0x01f6
        L_0x01f0:
            int r2 = r4.leftPadding     // Catch:{ all -> 0x0365 }
            goto L_0x01f6
        L_0x01f3:
            int r2 = r5 - r2
            int r2 = r2 / r0
        L_0x01f6:
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x0365 }
            java.util.ArrayList r0 = X.AnonymousClass7TG.A0r(r13)     // Catch:{ all -> 0x0365 }
            java.util.Iterator r16 = r13.iterator()     // Catch:{ all -> 0x0365 }
        L_0x0202:
            boolean r13 = r16.hasNext()     // Catch:{ all -> 0x0365 }
            if (r13 == 0) goto L_0x0238
            java.lang.Object r13 = r16.next()     // Catch:{ all -> 0x0365 }
            com.facebook.rtc.views.omnigrid.GridLayoutInputItem r13 = (com.facebook.rtc.views.omnigrid.GridLayoutInputItem) r13     // Catch:{ all -> 0x0365 }
            long r14 = r13.id     // Catch:{ all -> 0x0365 }
            int r24 = r2 + r11
            int r25 = r10 + r9
            X.ULb r21 = new X.ULb     // Catch:{ all -> 0x0365 }
            r22 = r2
            r23 = r10
            r26 = r12
            r21.<init>(r22, r23, r24, r25, r26)     // Catch:{ all -> 0x0365 }
            java.lang.Integer r22 = X.AnonymousClass05K.A0j     // Catch:{ all -> 0x0365 }
            X.N2s r13 = new X.N2s     // Catch:{ all -> 0x0365 }
            r20 = r13
            r23 = r17
            r24 = r12
            r25 = r14
            r27 = r12
            r20.<init>(r21, r22, r23, r24, r25, r27)     // Catch:{ all -> 0x0365 }
            int r14 = r4.horizontalSpacing     // Catch:{ all -> 0x0365 }
            int r14 = r14 + r11
            int r2 = r2 + r14
            r0.add(r13)     // Catch:{ all -> 0x0365 }
            goto L_0x0202
        L_0x0238:
            r1.addAll(r0)     // Catch:{ all -> 0x0365 }
            int r9 = r4.rightPadding     // Catch:{ all -> 0x0365 }
            int r0 = r4.horizontalSpacing     // Catch:{ all -> 0x0365 }
            int r9 = r9 - r0
            int r2 = r2 + r9
            if (r8 != 0) goto L_0x026e
            if (r6 == 0) goto L_0x026e
            long r13 = r6.id     // Catch:{ all -> 0x0365 }
            int r0 = r4.topPadding     // Catch:{ all -> 0x0365 }
            int r10 = r10 - r0
            X.ULb r20 = new X.ULb     // Catch:{ all -> 0x0365 }
            r21 = r12
            r22 = r19
            r23 = r5
            r24 = r10
            r25 = r12
            r20.<init>(r21, r22, r23, r24, r25)     // Catch:{ all -> 0x0365 }
            java.lang.Integer r21 = X.AnonymousClass05K.A0j     // Catch:{ all -> 0x0365 }
            X.N2s r4 = new X.N2s     // Catch:{ all -> 0x0365 }
            r19 = r4
            r22 = r17
            r23 = r12
            r24 = r13
            r26 = r7
            r19.<init>(r20, r21, r22, r23, r24, r26)     // Catch:{ all -> 0x0365 }
            r1.add(r4)     // Catch:{ all -> 0x0365 }
            goto L_0x026f
        L_0x026e:
            r4 = 0
        L_0x026f:
            boolean r24 = X.C51970G9q.A1W(r2, r5)
            if (r6 == 0) goto L_0x027c
            if (r8 != 0) goto L_0x027c
            r6 = 0
        L_0x0278:
            if (r4 == 0) goto L_0x0332
            goto L_0x0321
        L_0x027c:
            java.util.List r9 = X.00k.A0a(r1)     // Catch:{ all -> 0x0365 }
            java.util.Iterator r8 = r9.iterator()     // Catch:{ all -> 0x0365 }
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x0365 }
            if (r0 == 0) goto L_0x02b7
            java.lang.Object r0 = r8.next()     // Catch:{ all -> 0x0365 }
            X.N2s r0 = (X.C68152N2s) r0     // Catch:{ all -> 0x0365 }
            X.ULb r0 = r0.A02     // Catch:{ all -> 0x0365 }
            int r0 = r0.A03     // Catch:{ all -> 0x0365 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0365 }
        L_0x0298:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x0365 }
            if (r0 == 0) goto L_0x02b4
            java.lang.Object r0 = r8.next()     // Catch:{ all -> 0x0365 }
            X.N2s r0 = (X.C68152N2s) r0     // Catch:{ all -> 0x0365 }
            X.ULb r0 = r0.A02     // Catch:{ all -> 0x0365 }
            int r0 = r0.A03     // Catch:{ all -> 0x0365 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0365 }
            int r0 = r7.compareTo(r6)     // Catch:{ all -> 0x0365 }
            if (r0 <= 0) goto L_0x0298
            r7 = r6
            goto L_0x0298
        L_0x02b4:
            if (r7 == 0) goto L_0x02b7
            goto L_0x02b9
        L_0x02b7:
            r14 = 0
            goto L_0x02bd
        L_0x02b9:
            int r14 = r7.intValue()     // Catch:{ all -> 0x0365 }
        L_0x02bd:
            java.util.Iterator r8 = r9.iterator()     // Catch:{ all -> 0x0365 }
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x0365 }
            if (r0 == 0) goto L_0x02f4
            java.lang.Object r0 = r8.next()     // Catch:{ all -> 0x0365 }
            X.N2s r0 = (X.C68152N2s) r0     // Catch:{ all -> 0x0365 }
            X.ULb r0 = r0.A02     // Catch:{ all -> 0x0365 }
            int r0 = r0.A00     // Catch:{ all -> 0x0365 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0365 }
        L_0x02d5:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x0365 }
            if (r0 == 0) goto L_0x02f1
            java.lang.Object r0 = r8.next()     // Catch:{ all -> 0x0365 }
            X.N2s r0 = (X.C68152N2s) r0     // Catch:{ all -> 0x0365 }
            X.ULb r0 = r0.A02     // Catch:{ all -> 0x0365 }
            int r0 = r0.A00     // Catch:{ all -> 0x0365 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0365 }
            int r0 = r7.compareTo(r6)     // Catch:{ all -> 0x0365 }
            if (r0 >= 0) goto L_0x02d5
            r7 = r6
            goto L_0x02d5
        L_0x02f1:
            if (r7 == 0) goto L_0x02f4
            goto L_0x02f6
        L_0x02f4:
            r7 = 0
            goto L_0x02fa
        L_0x02f6:
            int r7 = r7.intValue()     // Catch:{ all -> 0x0365 }
        L_0x02fa:
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x0365 }
            if (r14 <= 0) goto L_0x030c
            X.ULb r0 = new X.ULb     // Catch:{ all -> 0x0365 }
            r10 = r0
            r11 = r12
            r13 = r5
            r15 = r12
            r10.<init>(r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0365 }
            r6.add(r0)     // Catch:{ all -> 0x0365 }
        L_0x030c:
            r0 = r28
            if (r7 >= r0) goto L_0x0278
            X.ULb r0 = new X.ULb     // Catch:{ all -> 0x0365 }
            r11 = r0
            r13 = r7
            r14 = r5
            r15 = r28
            r16 = r12
            r11.<init>(r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0365 }
            r6.add(r0)     // Catch:{ all -> 0x0365 }
            goto L_0x0278
        L_0x0321:
            X.ULb r0 = r4.A02     // Catch:{ all -> 0x0365 }
            if (r0 == 0) goto L_0x0332
            int r7 = r0.A01     // Catch:{ all -> 0x0365 }
            int r5 = r0.A03     // Catch:{ all -> 0x0365 }
            int r4 = r0.A02     // Catch:{ all -> 0x0365 }
            int r0 = r0.A00     // Catch:{ all -> 0x0365 }
            android.graphics.Rect r15 = X.C66580MXl.A0C(r7, r5, r4, r0)     // Catch:{ all -> 0x0365 }
            goto L_0x0333
        L_0x0332:
            r15 = 0
        L_0x0333:
            if (r3 == 0) goto L_0x0336
            goto L_0x0338
        L_0x0336:
            r0 = 0
            goto L_0x033a
        L_0x0338:
            java.lang.Integer r0 = r3.A08     // Catch:{ all -> 0x0365 }
        L_0x033a:
            com.facebook.rtc.views.omnigrid.GridSelfViewLocation r16 = com.facebook.rtc.views.omnigrid.GridSelfViewLocation.TOP_RIGHT     // Catch:{ all -> 0x0365 }
            X.N48 r14 = new X.N48     // Catch:{ all -> 0x0365 }
            r19 = r0
            r20 = r1
            r21 = r6
            r22 = r2
            r23 = r28
            r25 = r12
            r17 = r18
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ all -> 0x0365 }
            r0 = -1547354032(0xffffffffa3c54050, float:-2.138602E-17)
            X.0fh.A00(r0)
            return r14
        L_0x0356:
            X.0sr.A1S()     // Catch:{ all -> 0x0365 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            goto L_0x0364
        L_0x035e:
            java.lang.String r0 = "Only one GridItemType.OTHER item type is supported!"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ all -> 0x0365 }
        L_0x0364:
            throw r0     // Catch:{ all -> 0x0365 }
        L_0x0365:
            r1 = move-exception
            r0 = 659715733(0x27527695, float:2.9207638E-15)
            X.0fh.A00(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73602Pgd.invoke(java.lang.Object):java.lang.Object");
    }
}
