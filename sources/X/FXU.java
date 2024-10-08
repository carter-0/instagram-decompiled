package X;

import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;

public final /* synthetic */ class FXU implements 1wn {
    public final /* synthetic */ int A00;
    public final /* synthetic */ DirectShareSheetFragment A01;

    public /* synthetic */ FXU(DirectShareSheetFragment directShareSheetFragment, int i) {
        this.A01 = directShareSheetFragment;
        this.A00 = i;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0014 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onEvent(java.lang.Object r12) {
        /*
            r11 = this;
            com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment r5 = r11.A01
            int r4 = r11.A00
            com.instagram.common.session.UserSession r0 = r5.A0G
            com.instagram.pendingmedia.store.PendingMediaStore r1 = X.28K.A00(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            java.util.ArrayList r0 = r1.A05(r0)
            java.util.Iterator r10 = r0.iterator()
        L_0x0014:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x01cb
            java.lang.Object r6 = r10.next()
            X.3Q2 r6 = (X.AnonymousClass3Q2) r6
            r9 = 0
            r3 = 1
            if (r4 == r3) goto L_0x014b
            r0 = 16
            if (r4 == r0) goto L_0x0146
            r0 = 18
            if (r4 == r0) goto L_0x0141
            r0 = 20
            if (r4 == r0) goto L_0x0108
            r0 = 23
            if (r4 == r0) goto L_0x0103
            r0 = 3
            if (r4 == r0) goto L_0x014b
            r0 = 4
            if (r4 == r0) goto L_0x00ac
            switch(r4) {
                case 6: goto L_0x014b;
                case 7: goto L_0x017c;
                case 8: goto L_0x0070;
                case 9: goto L_0x0070;
                case 10: goto L_0x0108;
                case 11: goto L_0x0076;
                case 12: goto L_0x003e;
                default: goto L_0x003d;
            }
        L_0x003d:
            goto L_0x0014
        L_0x003e:
            java.util.List r1 = r6.A4b
            X.3WT r0 = X.AnonymousClass3WT.STOREFRONT
            java.util.List r0 = X.AnonymousClass497.A01(r0, r1)
            if (r0 == 0) goto L_0x0014
            java.util.Iterator r2 = r0.iterator()
        L_0x004c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r2.next()
            X.3ui r0 = (X.C255783ui) r0
            com.instagram.shopping.model.share.ShopShareInfo r1 = r5.A0n
            if (r1 == 0) goto L_0x004c
            X.BIn r0 = r0.A0r
            if (r0 == 0) goto L_0x004c
            java.lang.String r1 = r1.A03
            com.instagram.user.model.User r0 = r0.A00
            java.lang.String r0 = X.DbX.A0r(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004c
            goto L_0x018c
        L_0x0070:
            java.util.List r1 = r6.A4b
            X.3WT r0 = X.AnonymousClass3WT.BLOKS_TAPPABLE
            goto L_0x0180
        L_0x0076:
            java.util.List r1 = r6.A4b
            X.3WT r0 = X.AnonymousClass3WT.PRODUCT_COLLECTION
            java.util.List r0 = X.AnonymousClass497.A01(r0, r1)
            if (r0 == 0) goto L_0x0014
            java.util.Iterator r7 = r0.iterator()
        L_0x0084:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r2 = r7.next()
            X.3ui r2 = (X.C255783ui) r2
            com.instagram.shopping.model.collection.ProductCollectionShareInfo r0 = r5.A0m
            if (r0 == 0) goto L_0x0084
            java.lang.String r1 = r0.A04
            if (r1 == 0) goto L_0x0084
            X.BIk r0 = r2.A0o
            if (r0 == 0) goto L_0x0084
            com.instagram.user.model.ProductCollection r0 = r0.A02
            if (r0 == 0) goto L_0x0084
            java.lang.String r0 = r0.Aoi()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0084
            goto L_0x018c
        L_0x00ac:
            java.util.List r1 = r6.A4b
            X.3WT r0 = X.AnonymousClass3WT.PRODUCT_SHARE
            java.util.List r7 = X.AnonymousClass497.A01(r0, r1)
            if (r7 == 0) goto L_0x0014
            com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel r0 = r5.A0P
            X.ExY r1 = r0.A0M
            boolean r0 = r1 instanceof X.EJP
            if (r0 == 0) goto L_0x0014
            X.EJP r1 = (X.EJP) r1
            com.instagram.user.model.Product r2 = r1.A00
            java.util.Iterator r8 = r7.iterator()
        L_0x00c6:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r7 = r8.next()
            X.3ui r7 = (X.C255783ui) r7
            if (r2 == 0) goto L_0x00c6
            com.instagram.user.model.Product r0 = r7.A0J()
            if (r0 == 0) goto L_0x00c6
            java.lang.String r1 = r2.A0H
            com.instagram.user.model.Product r0 = r7.A0J()
            java.lang.String r0 = r0.A0H
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00c6
            com.instagram.user.model.User r0 = r2.A0B
            java.lang.String r1 = X.AnonymousClass3ZA.A00(r0)
            com.instagram.user.model.Product r0 = r7.A0J()
            com.instagram.user.model.User r0 = r0.A0B
            r0.getClass()
            java.lang.String r0 = X.AnonymousClass3ZA.A00(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00c6
            goto L_0x018c
        L_0x0103:
            java.util.List r1 = r6.A4b
            X.3WT r0 = X.AnonymousClass3WT.CHALLENGE_CHAT
            goto L_0x0180
        L_0x0108:
            com.instagram.user.model.User r7 = com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment.A04(r5)
            java.util.List r1 = r6.A4b
            X.3WT r0 = X.AnonymousClass3WT.MENTION
            java.util.List r1 = X.AnonymousClass497.A01(r0, r1)
            if (r7 == 0) goto L_0x0014
            if (r1 == 0) goto L_0x0014
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0014
            java.util.Iterator r2 = r1.iterator()
        L_0x0122:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r2.next()
            X.3ui r0 = (X.C255783ui) r0
            com.instagram.user.model.User r0 = r0.A1B
            if (r0 == 0) goto L_0x0122
            java.lang.String r1 = r0.getId()
            java.lang.String r0 = r7.getId()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0122
            goto L_0x018c
        L_0x0141:
            java.util.List r1 = r6.A4b
            X.3WT r0 = X.AnonymousClass3WT.MESSAGE_SHARE
            goto L_0x0180
        L_0x0146:
            java.util.List r1 = r6.A4b
            X.3WT r0 = X.AnonymousClass3WT.JOIN_CHAT
            goto L_0x0180
        L_0x014b:
            java.util.List r1 = r6.A4b
            X.3WT r0 = X.AnonymousClass3WT.MEDIA
            java.util.List r1 = X.AnonymousClass497.A01(r0, r1)
            if (r1 == 0) goto L_0x0014
            X.1Xj r0 = r5.A0b
            if (r0 == 0) goto L_0x017a
            java.lang.String r2 = r0.A30()
        L_0x015d:
            java.util.Iterator r1 = r1.iterator()
        L_0x0161:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r1.next()
            X.3ui r0 = (X.C255783ui) r0
            if (r2 == 0) goto L_0x0161
            java.lang.String r0 = r0.A1a
            if (r0 == 0) goto L_0x0161
            boolean r0 = X.2PP.A00(r0, r2)
            if (r0 == 0) goto L_0x0161
            goto L_0x018c
        L_0x017a:
            r2 = 0
            goto L_0x015d
        L_0x017c:
            java.util.List r1 = r6.A4b
            X.3WT r0 = X.AnonymousClass3WT.VOTING_INFO_CENTER
        L_0x0180:
            java.util.List r0 = X.AnonymousClass497.A01(r0, r1)
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0014
        L_0x018c:
            X.3QO r1 = r6.A1F
            X.3QO r0 = X.AnonymousClass3QO.CLOSE_FRIENDS
            if (r1 == r0) goto L_0x0196
            X.3QO r0 = X.AnonymousClass3QO.CUSTOM
            if (r1 != r0) goto L_0x0197
        L_0x0196:
            r9 = 1
        L_0x0197:
            X.EIn r1 = r5.A0J
            if (r9 == 0) goto L_0x01c8
            java.lang.Integer r0 = X.AnonymousClass05K.A01
        L_0x019d:
            r1.A00 = r0
            r1.A02 = r3
            r1.notifyDataSetChanged()
            X.1wn r2 = r5.A0F
            if (r2 == 0) goto L_0x01b2
            X.1Ng r1 = r5.A0E
            java.lang.Class<X.2Ny> r0 = X.AnonymousClass2Ny.class
            r1.A02(r2, r0)
            r0 = 0
            r5.A0F = r0
        L_0x01b2:
            r5.A1B = r3
            java.lang.String r1 = r5.A13
            java.lang.String r0 = "feed_contextual_chain"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0014
            com.instagram.common.session.UserSession r0 = r5.A0G
            X.IOn r0 = X.C52478GUg.A00(r0)
            r0.A01 = r3
            goto L_0x0014
        L_0x01c8:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x019d
        L_0x01cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FXU.onEvent(java.lang.Object):void");
    }
}
