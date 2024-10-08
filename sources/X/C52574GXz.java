package X;

/* renamed from: X.GXz  reason: case insensitive filesystem */
public final class C52574GXz extends 0Yk implements 0sK {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C52574GXz(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            switch(r9) {
                case 0: goto L_0x0013;
                case 1: goto L_0x001b;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Class<X.GhK> r3 = X.C53029GhK.class
            r1 = 3
            java.lang.String r4 = "updateAndGetUIState"
            java.lang.String r5 = "updateAndGetUIState(Ljava/lang/String;Lcom/instagram/wonderwall/model/WallDraftAttachment;)Lcom/instagram/wonderwall/viewmodel/WallPostComposerViewModel$ComposerUIState;"
        L_0x000d:
            r6 = 4
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L_0x0013:
            java.lang.Class<X.49u> r3 = X.C2614949u.class
            r1 = 3
            java.lang.String r4 = "mergeMediaNoteStacksWithViewerLikes"
            java.lang.String r5 = "mergeMediaNoteStacksWithViewerLikes(Ljava/util/List;Ljava/util/Map;)Ljava/util/List;"
            goto L_0x000d
        L_0x001b:
            java.lang.Class<X.Ji2> r3 = X.C60245Ji2.class
            r1 = 3
            java.lang.String r4 = "computeProfileData"
            java.lang.String r5 = "computeProfileData(Ljava/util/List;Ljava/util/List;)Lcom/instagram/mediakit/viewmodel/MediaKitProfilePickerViewModel$MediaKitProfileData;"
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52574GXz.<init>(java.lang.Object, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0090, code lost:
        if (r6 < (r7 + 1)) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0096, code lost:
        if (r4 > 0) goto L_0x0098;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r23, java.lang.Object r24, java.lang.Object r25) {
        /*
            r22 = this;
            r1 = r22
            r13 = r24
            r5 = r23
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x00c7;
                case 1: goto L_0x00b7;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.String r5 = (java.lang.String) r5
            X.YBO r13 = (X.YBO) r13
            java.lang.Object r0 = r1.receiver
            X.GhK r0 = (X.C53029GhK) r0
            X.05G r0 = r0.A06
            java.lang.Object r3 = r0.getValue()
            X.Gm7 r3 = (X.C53321Gm7) r3
            r2 = 0
            X.0qQ.A0B(r5, r2)
            int r4 = r5.length()
            long r0 = X.C3026964x.A00(r4, r4)
            X.5Tl r10 = new X.5Tl
            r10.<init>(r5, r0)
            java.lang.String r0 = "/60"
            java.lang.String r14 = X.002.A03(r4, r0)
            r0 = 55
            boolean r18 = X.C51970G9q.A1W(r4, r0)
            X.Hnx r12 = r3.A02
            boolean r19 = X.DbW.A1a(r12)
            X.5Tl r7 = r3.A00
            X.0qQ.A0B(r7, r2)
            long r0 = r7.A00
            boolean r5 = X.C285965Tk.A03(r0)
            if (r5 == 0) goto L_0x00b5
            int r6 = X.C51965G9l.A04(r0)
            X.5Tq r0 = r7.A01
            java.lang.String r1 = r0.A00
            X.J4s r0 = X.C59059J4s.A00
            int r0 = X.C56360HxB.A00(r1, r0, r6)
            r8 = 1
            int r7 = r0 + 1
            if (r7 >= r6) goto L_0x00b5
            java.lang.String r0 = X.C51967G9n.A0q(r1, r7, r6)
            java.util.regex.Matcher r5 = X.0mp.A09(r0)
            boolean r0 = r5.find()
            if (r0 == 0) goto L_0x00b5
            java.lang.String r9 = r5.group(r8)
            if (r9 == 0) goto L_0x00b5
            int r0 = r9.length()
            if (r0 == 0) goto L_0x00b5
            java.lang.String r1 = "@"
            java.lang.String r0 = ""
            java.lang.String r15 = X.00p.A0g(r9, r1, r0, r2)
            int r0 = r5.start(r8)
            int r0 = r0 + r7
            int r1 = r0 + 1
            int r0 = r5.end(r8)
            int r7 = r7 + r0
            if (r1 > r6) goto L_0x00b5
            int r0 = r7 + 1
            if (r6 >= r0) goto L_0x00b5
        L_0x0092:
            if (r13 != 0) goto L_0x0098
            r17 = 0
            if (r4 <= 0) goto L_0x009a
        L_0x0098:
            r17 = 1
        L_0x009a:
            com.instagram.user.model.User r11 = r3.A01
            X.62P r5 = r3.A06
            boolean r4 = r3.A09
            boolean r1 = r3.A08
            X.AnonymousClass7TF.A1C(r11, r2, r5)
            r0 = 5
            X.0qQ.A0B(r14, r0)
            X.Gm7 r9 = new X.Gm7
            r16 = r5
            r20 = r4
            r21 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r9
        L_0x00b5:
            r15 = 0
            goto L_0x0092
        L_0x00b7:
            java.util.List r5 = (java.util.List) r5
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r0 = r1.receiver
            X.Ji2 r0 = (X.C60245Ji2) r0
            X.L1v r0 = r0.A07
            X.L6q r9 = new X.L6q
            r9.<init>(r0, r5, r13)
            return r9
        L_0x00c7:
            java.util.List r5 = (java.util.List) r5
            java.util.Map r13 = (java.util.Map) r13
            java.util.List r9 = X.C2614949u.A01(r5, r13)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52574GXz.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
