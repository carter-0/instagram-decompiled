package X;

/* renamed from: X.Aj2  reason: case insensitive filesystem */
public final /* synthetic */ class C40771Aj2 implements Runnable {
    public final /* synthetic */ AnonymousClass8BA A00;

    public /* synthetic */ C40771Aj2(AnonymousClass8BA r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00cb, code lost:
        r10.add(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x012a, code lost:
        r13 = X.C394039xR.A00(r17, r18, r19, r20, r21, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0143, code lost:
        r13 = X.C394039xR.A00(r16, r17, r18, r19, r20, r21);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0059, code lost:
        if (r8.A0A == null) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r23 = this;
            r0 = r23
            X.8BA r5 = r0.A00
            com.instagram.shopping.model.collection.ProductCollectionShareInfo r8 = r5.A0L
            android.content.Context r6 = X.AnonymousClass7TE.A0T(r5)
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r0 = r5.A0z
            int r0 = X.AnonymousClass81W.A00(r0)
            float r7 = (float) r0
            r19 = 1063256064(0x3f600000, float:0.875)
            float r7 = r7 * r19
            r8.getClass()
            r4 = 0
            com.instagram.common.typedurl.ImageUrl r2 = r8.A01
            r0 = 0
            if (r2 == 0) goto L_0x015d
            int r0 = r2.getWidth()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r2.getHeight()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x002e:
            boolean r1 = X.0qQ.A0K(r1, r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r1 != 0) goto L_0x0038
            r0 = 1061158912(0x3f400000, float:0.75)
        L_0x0038:
            float r3 = r7 * r0
            int r9 = java.lang.Math.round(r7)
            com.instagram.common.session.UserSession r2 = r5.A0v
            X.0Tu r10 = X.0Tu.A05
            r0 = 36314524013431455(0x8103de00020a9f, double:3.028789440720715E-306)
            boolean r12 = X.182.A06(r10, r2, r0)
            r0 = 36314524013365918(0x8103de00010a9e, double:3.028789440679269E-306)
            boolean r0 = X.182.A06(r10, r2, r0)
            if (r0 == 0) goto L_0x005b
            java.util.List r0 = r8.A0A
            r11 = 1
            if (r0 != 0) goto L_0x005c
        L_0x005b:
            r11 = 0
        L_0x005c:
            com.instagram.common.typedurl.ImageUrl r14 = r8.A00
            if (r11 == 0) goto L_0x015a
            java.util.List r0 = r8.A0A
            r0.getClass()
            int r10 = r0.size()
        L_0x0069:
            X.6nz r0 = X.C317876nz.A0a
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            r0 = 92
            java.lang.String r15 = X.C273654mx.A00(r0)
            if (r12 == 0) goto L_0x0085
            float r0 = (float) r9
            r16 = r15
            r18 = r0
            r17 = r0
            X.6o8 r0 = X.C317966o8.A00(r14, r15, r16, r17, r18, r19)
            r1.add(r0)
        L_0x0085:
            if (r11 == 0) goto L_0x009a
            r0 = 6
            if (r10 < r0) goto L_0x0148
            java.lang.String r10 = "seller_collection_reshare_2x3_product_grid_sticker"
        L_0x008c:
            float r0 = (float) r9
            r9 = r14
            r11 = r10
            r12 = r0
            r13 = r0
            r14 = r19
            X.6o8 r0 = X.C317966o8.A00(r9, r10, r11, r12, r13, r14)
            r1.add(r0)
        L_0x009a:
            X.6oG r0 = X.C318046oG.SHOPPING_COLLECTION_SHARE
            X.6nz r9 = new X.6nz
            r9.<init>(r0, r15, r1)
            r11 = 1
            X.0qQ.A0B(r2, r11)
            r1 = 2
            X.0qQ.A0B(r6, r1)
            r22 = 3
            java.util.List r0 = r9.A0O
            java.util.ArrayList r10 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r14 = r0.iterator()
        L_0x00b5:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0160
            java.lang.Object r0 = r14.next()
            X.6o8 r0 = (X.C317966o8) r0
            java.lang.String r12 = r0.A0S
            int r0 = r12.hashCode()
            switch(r0) {
                case -1432864483: goto L_0x012f;
                case -1348023271: goto L_0x0118;
                case -1281016518: goto L_0x0105;
                case -1214009765: goto L_0x00f2;
                case -515979607: goto L_0x00e4;
                case 824046524: goto L_0x00cf;
                default: goto L_0x00ca;
            }
        L_0x00ca:
            r13 = 0
        L_0x00cb:
            r10.add(r13)
            goto L_0x00b5
        L_0x00cf:
            java.lang.String r0 = "seller_collection_reshare_1x2_product_grid_sticker"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x00ca
            r16 = r6
            r17 = r2
            r18 = r8
            r19 = r7
            r20 = r11
            r21 = r1
            goto L_0x0143
        L_0x00e4:
            boolean r0 = r12.equals(r15)
            if (r0 == 0) goto L_0x00ca
            X.9lj r13 = new X.9lj
            int r12 = (int) r7
            int r0 = (int) r3
            r13.<init>(r6, r8, r12, r0)
            goto L_0x00cb
        L_0x00f2:
            java.lang.String r0 = "seller_collection_reshare_1x3_product_grid_sticker"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x00ca
            r17 = r6
            r18 = r2
            r19 = r8
            r20 = r7
            r21 = r11
            goto L_0x012a
        L_0x0105:
            java.lang.String r0 = "seller_collection_reshare_2x3_product_grid_sticker"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x00ca
            r17 = r6
            r18 = r2
            r19 = r8
            r20 = r7
            r21 = r1
            goto L_0x012a
        L_0x0118:
            java.lang.String r0 = "seller_collection_reshare_3x3_product_grid_sticker"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x00ca
            r17 = r6
            r18 = r2
            r19 = r8
            r20 = r7
            r21 = r22
        L_0x012a:
            X.7w8 r13 = X.C394039xR.A00(r17, r18, r19, r20, r21, r22)
            goto L_0x00cb
        L_0x012f:
            java.lang.String r0 = "seller_collection_reshare_1x1_product_grid_sticker"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x00ca
            r16 = r6
            r17 = r2
            r18 = r8
            r19 = r7
            r20 = r11
            r21 = r11
        L_0x0143:
            X.7w8 r13 = X.C394039xR.A00(r16, r17, r18, r19, r20, r21)
            goto L_0x00cb
        L_0x0148:
            r0 = 3
            if (r10 < r0) goto L_0x014f
            java.lang.String r10 = "seller_collection_reshare_1x3_product_grid_sticker"
            goto L_0x008c
        L_0x014f:
            r0 = 2
            if (r10 != r0) goto L_0x0156
            java.lang.String r10 = "seller_collection_reshare_1x2_product_grid_sticker"
            goto L_0x008c
        L_0x0156:
            java.lang.String r10 = "seller_collection_reshare_1x1_product_grid_sticker"
            goto L_0x008c
        L_0x015a:
            r10 = 0
            goto L_0x0069
        L_0x015d:
            r1 = r0
            goto L_0x002e
        L_0x0160:
            boolean r0 = X.AnonymousClass7TE.A1b(r10)
            if (r0 == 0) goto L_0x0175
            X.7w8 r1 = new X.7w8
            r1.<init>(r6, r2, r10)
            X.ADo r0 = X.C39890ADo.A00()
            r0.A0Q = r4
            X.AnonymousClass8BG.A00(r1, r9, r5, r0)
            return
        L_0x0175:
            java.lang.String r0 = "invalid static sticker configuration"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40771Aj2.run():void");
    }
}
