package X;

/* renamed from: X.GPu  reason: case insensitive filesystem */
public final class C52372GPu implements JPY {
    public final C13997Tnz A00;
    public final C56367HxK A01;

    /* JADX WARNING: type inference failed for: r0v10, types: [X.Gm4, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01a4, code lost:
        if (r14 != null) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01ae, code lost:
        if (java.lang.Integer.valueOf(r1) == null) goto L_0x01b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003b, code lost:
        if (r1 == null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0027, code lost:
        if (r1 == null) goto L_0x0029;
     */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x023a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C53318Gm4 ByM(java.lang.Object r18) {
        /*
            r17 = this;
            r11 = r18
            X.9Ie r11 = (X.C376489Ie) r11
            r0 = 0
            X.0qQ.A0B(r11, r0)
            java.lang.Object r10 = r11.A03
            X.4bN r10 = (X.C267324bN) r10
            java.lang.Integer r9 = X.C56367HxK.A00(r10)
            java.lang.String r8 = X.C51966G9m.A1B(r10)
            X.3OA r0 = r10.A06()
            X.3y4 r0 = r0.A0I
            if (r0 == 0) goto L_0x0029
            X.XB5 r0 = r0.BUi()
            if (r0 == 0) goto L_0x0029
            java.lang.String r1 = r0.BhY()
            r0 = 1
            if (r1 != 0) goto L_0x002a
        L_0x0029:
            r0 = 0
        L_0x002a:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
            X.1Xj r0 = X.C51966G9m.A0s(r10)
            if (r0 == 0) goto L_0x003d
            X.1Xy r0 = r0.A0C
            X.DU9 r1 = r0.Bl9()
            r0 = 1
            if (r1 != 0) goto L_0x003e
        L_0x003d:
            r0 = 0
        L_0x003e:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            r0 = r17
            X.Tnz r12 = r0.A00
            boolean r0 = r12.A01
            r1 = 0
            if (r0 == 0) goto L_0x0137
            boolean r3 = r12.A00
            r0 = 1
            int r2 = X.C51967G9n.A03(r9, r0)
            r5 = 0
            if (r2 == r0) goto L_0x00c4
            r0 = 2
            if (r2 == r0) goto L_0x0094
            X.0sn r5 = X.0sn.A00
        L_0x005a:
            boolean r3 = r12.A00
            r2 = 1
            int r0 = r9.intValue()
            if (r0 != r2) goto L_0x013b
            com.instagram.model.showreel.IgShowreelComposition r0 = X.C56368HxL.A00(r11)
            if (r0 == 0) goto L_0x0135
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.List r0 = r0.Acn()
            if (r0 == 0) goto L_0x013d
            java.util.ArrayList r14 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r15 = r0.iterator()
        L_0x007b:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0115
            java.lang.Object r13 = r15.next()
            r0 = r13
            com.instagram.model.showreel.IgShowreelCompositionAssetInfoIntf r0 = (com.instagram.model.showreel.IgShowreelCompositionAssetInfoIntf) r0
            com.instagram.model.showreel.IgShowreelCompositionAssetType r2 = r0.CAb()
            com.instagram.model.showreel.IgShowreelCompositionAssetType r0 = com.instagram.model.showreel.IgShowreelCompositionAssetType.VIDEO
            if (r2 != r0) goto L_0x007b
            r14.add(r13)
            goto L_0x007b
        L_0x0094:
            com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf r0 = X.C56368HxL.A01(r11)
            if (r0 == 0) goto L_0x005a
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.List r0 = r0.Acn()
            if (r0 == 0) goto L_0x005a
            java.util.Iterator r2 = r0.iterator()
        L_0x00a8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x005a
            java.lang.Object r0 = r2.next()
            com.instagram.model.showreelnative.IgShowreelNativeAsset r0 = (com.instagram.model.showreelnative.IgShowreelNativeAsset) r0
            java.lang.String r0 = r0.getUrl()
            if (r0 == 0) goto L_0x00a8
            if (r3 == 0) goto L_0x00c0
            java.lang.String r0 = X.C55155Hd5.A00(r0)
        L_0x00c0:
            r5.add(r0)
            goto L_0x00a8
        L_0x00c4:
            com.instagram.model.showreel.IgShowreelComposition r0 = X.C56368HxL.A00(r11)
            if (r0 == 0) goto L_0x005a
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.List r0 = r0.Acn()
            if (r0 == 0) goto L_0x005a
            java.util.ArrayList r13 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r14 = r0.iterator()
        L_0x00dc:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x00f5
            java.lang.Object r4 = r14.next()
            r0 = r4
            com.instagram.model.showreel.IgShowreelCompositionAssetInfoIntf r0 = (com.instagram.model.showreel.IgShowreelCompositionAssetInfoIntf) r0
            com.instagram.model.showreel.IgShowreelCompositionAssetType r2 = r0.CAb()
            com.instagram.model.showreel.IgShowreelCompositionAssetType r0 = com.instagram.model.showreel.IgShowreelCompositionAssetType.IMAGE
            if (r2 != r0) goto L_0x00dc
            r13.add(r4)
            goto L_0x00dc
        L_0x00f5:
            java.util.Iterator r2 = r13.iterator()
        L_0x00f9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x005a
            java.lang.Object r0 = r2.next()
            com.instagram.model.showreel.IgShowreelCompositionAssetInfoIntf r0 = (com.instagram.model.showreel.IgShowreelCompositionAssetInfoIntf) r0
            java.lang.String r0 = r0.getUrl()
            if (r0 == 0) goto L_0x00f9
            if (r3 == 0) goto L_0x0111
            java.lang.String r0 = X.C55155Hd5.A00(r0)
        L_0x0111:
            r5.add(r0)
            goto L_0x00f9
        L_0x0115:
            java.util.Iterator r2 = r14.iterator()
        L_0x0119:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x013d
            java.lang.Object r0 = r2.next()
            com.instagram.model.showreel.IgShowreelCompositionAssetInfoIntf r0 = (com.instagram.model.showreel.IgShowreelCompositionAssetInfoIntf) r0
            java.lang.String r0 = r0.getUrl()
            if (r0 == 0) goto L_0x0119
            if (r3 == 0) goto L_0x0131
            java.lang.String r0 = X.C55155Hd5.A00(r0)
        L_0x0131:
            r4.add(r0)
            goto L_0x0119
        L_0x0135:
            r4 = 0
            goto L_0x013d
        L_0x0137:
            r5 = r1
            r4 = r1
            r3 = r1
            goto L_0x0160
        L_0x013b:
            X.0sn r4 = X.0sn.A00
        L_0x013d:
            boolean r2 = r12.A00
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            X.3OA r0 = r10.A06()
            X.3y4 r0 = r0.A0I
            if (r0 == 0) goto L_0x0160
            X.XB5 r0 = r0.BUi()
            if (r0 == 0) goto L_0x0160
            java.lang.String r0 = r0.BhY()
            if (r0 == 0) goto L_0x0160
            if (r2 == 0) goto L_0x015d
            java.lang.String r0 = X.C55155Hd5.A00(r0)
        L_0x015d:
            r3.add(r0)
        L_0x0160:
            boolean r0 = r12.A03
            if (r0 == 0) goto L_0x022a
            r0 = 1
            int r13 = X.C51967G9n.A03(r9, r0)
            r2 = 0
            if (r13 == r0) goto L_0x021e
            r0 = 2
            if (r13 != r0) goto L_0x0179
            com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf r0 = X.C56368HxL.A01(r11)
            if (r0 == 0) goto L_0x0179
            java.lang.String r2 = r0.C4b()
        L_0x0179:
            r0 = 1
            r10 = 0
            if (r13 == r0) goto L_0x0212
            r0 = 2
            if (r13 != r0) goto L_0x018a
            com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf r0 = X.C56368HxL.A01(r11)
            if (r0 == 0) goto L_0x018a
            java.lang.String r10 = r0.Anf()
        L_0x018a:
            boolean r0 = r12.A02
            r16 = 0
            if (r0 == 0) goto L_0x022e
            r0 = 1
            int r12 = X.C51967G9n.A03(r9, r0)
            if (r12 == r0) goto L_0x01e5
            r0 = 2
            if (r12 != r0) goto L_0x01b0
            com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf r0 = X.C56368HxL.A01(r11)
            if (r0 == 0) goto L_0x01b0
            java.util.List r14 = r0.Acn()
            if (r14 == 0) goto L_0x01b0
        L_0x01a6:
            int r1 = r14.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 != 0) goto L_0x01b1
        L_0x01b0:
            r1 = 0
        L_0x01b1:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r1)
            r0 = 1
            if (r12 != r0) goto L_0x023c
            com.instagram.model.showreel.IgShowreelComposition r0 = X.C56368HxL.A00(r11)
            if (r0 == 0) goto L_0x023c
            java.util.List r0 = r0.Acn()
            if (r0 == 0) goto L_0x023c
            java.util.ArrayList r12 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r14 = r0.iterator()
        L_0x01cc:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0230
            java.lang.Object r11 = r14.next()
            r0 = r11
            com.instagram.model.showreel.IgShowreelCompositionAssetInfoIntf r0 = (com.instagram.model.showreel.IgShowreelCompositionAssetInfoIntf) r0
            com.instagram.model.showreel.IgShowreelCompositionAssetType r1 = r0.CAb()
            com.instagram.model.showreel.IgShowreelCompositionAssetType r0 = com.instagram.model.showreel.IgShowreelCompositionAssetType.VIDEO
            if (r1 != r0) goto L_0x01cc
            r12.add(r11)
            goto L_0x01cc
        L_0x01e5:
            com.instagram.model.showreel.IgShowreelComposition r0 = X.C56368HxL.A00(r11)
            if (r0 == 0) goto L_0x01b0
            java.util.List r0 = r0.Acn()
            if (r0 == 0) goto L_0x01b0
            java.util.ArrayList r14 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r15 = r0.iterator()
        L_0x01f9:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x01a6
            java.lang.Object r13 = r15.next()
            r0 = r13
            com.instagram.model.showreel.IgShowreelCompositionAssetInfoIntf r0 = (com.instagram.model.showreel.IgShowreelCompositionAssetInfoIntf) r0
            com.instagram.model.showreel.IgShowreelCompositionAssetType r1 = r0.CAb()
            com.instagram.model.showreel.IgShowreelCompositionAssetType r0 = com.instagram.model.showreel.IgShowreelCompositionAssetType.IMAGE
            if (r1 != r0) goto L_0x01f9
            r14.add(r13)
            goto L_0x01f9
        L_0x0212:
            com.instagram.model.showreel.IgShowreelComposition r0 = X.C56368HxL.A00(r11)
            if (r0 == 0) goto L_0x018a
            java.lang.String r10 = r0.Anf()
            goto L_0x018a
        L_0x021e:
            com.instagram.model.showreel.IgShowreelComposition r0 = X.C56368HxL.A00(r11)
            if (r0 == 0) goto L_0x0179
            java.lang.String r2 = r0.C4b()
            goto L_0x0179
        L_0x022a:
            r2 = r1
            r10 = r1
            goto L_0x018a
        L_0x022e:
            r13 = r1
            goto L_0x0240
        L_0x0230:
            int r1 = r12.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x023c
            r16 = r1
        L_0x023c:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r16)
        L_0x0240:
            X.Gm4 r0 = new X.Gm4
            r0.<init>()
            r0.A05 = r8
            r0.A03 = r9
            r0.A00 = r7
            r0.A01 = r6
            r0.A09 = r5
            r0.A0A = r4
            r0.A08 = r3
            r0.A07 = r2
            r0.A06 = r10
            r0.A02 = r13
            r0.A04 = r1
            X.Hd6.A00(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52372GPu.ByM(java.lang.Object):X.Gm4");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.Gm4, java.lang.Object] */
    public final String ByN(Object obj) {
        Integer A002 = C56367HxK.A00((C267324bN) obj);
        ? obj2 = new Object();
        obj2.A05 = null;
        obj2.A03 = A002;
        obj2.A00 = null;
        obj2.A01 = null;
        obj2.A09 = null;
        obj2.A0A = null;
        obj2.A08 = null;
        obj2.A07 = null;
        obj2.A06 = null;
        obj2.A02 = null;
        obj2.A04 = null;
        return Hd6.A00(obj2);
    }

    public C52372GPu(C13997Tnz tnz, C56367HxK hxK) {
        this.A00 = tnz;
        this.A01 = hxK;
    }
}
