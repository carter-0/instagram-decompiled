package X;

public final class MIK extends 0Yk implements 0sJ {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MIK(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            r2 = r8
            if (r9 == 0) goto L_0x0012
            java.lang.Class<X.JjW> r3 = X.C60327JjW.class
            r1 = 4
            java.lang.String r4 = "computeAndGetSectionModels"
            java.lang.String r5 = "computeAndGetSectionModels(Lcom/instagram/mediakit/repository/MediaKitRepository$MediaKitResult;Lcom/instagram/mediakit/model/MediaKitInfo;Lcom/instagram/mediakit/enum/MediaKitMode;)Ljava/util/List;"
            r6 = r1
        L_0x000e:
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L_0x0012:
            java.lang.Class<X.Jil> r3 = X.C60289Jil.class
            r1 = 4
            java.lang.String r4 = "setProduct"
            java.lang.String r5 = "setProduct(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V"
            r6 = 0
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MIK.<init>(java.lang.Object, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: X.KUR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: X.KUR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: X.KUS} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: X.KUR} */
    /* JADX WARNING: type inference failed for: r9v3, types: [X.LiT, X.KUQ] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19) {
        /*
            r15 = this;
            r13 = r19
            r10 = r16
            r12 = r18
            r11 = r17
            int r0 = r15.A00
            if (r0 == 0) goto L_0x00f3
            X.Jz9 r11 = (X.C61216Jz9) r11
            X.KgG r12 = (X.C62466KgG) r12
            java.lang.Object r1 = r15.receiver
            X.JjW r1 = (X.C60327JjW) r1
            r9 = 0
            int r5 = X.DbW.A02(r9, r10, r12)
            boolean r0 = r10 instanceof X.C65431LtF
            if (r0 != 0) goto L_0x00e9
            X.LtG r0 = X.C65432LtG.A00
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x00e9
            boolean r0 = r10 instanceof X.C65440LtO
            if (r0 != 0) goto L_0x00e6
            if (r11 == 0) goto L_0x00e6
            X.L9D r10 = r1.A05
            X.LrS r6 = r1.A09
            com.instagram.common.session.UserSession r3 = r1.A03
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316289244991690(0x810579000210ca, double:3.0299057802674246E-306)
            boolean r7 = X.182.A06(r2, r3, r0)
            r4 = 1
            r3 = 3
            r2 = 4
            java.util.ArrayList r8 = X.AnonymousClass7TF.A0q(r6, r5)
            boolean r0 = r10.A01
            if (r0 == 0) goto L_0x005f
            X.KgG r0 = X.C62466KgG.VIEW
            if (r12 != r0) goto L_0x005f
            X.JzE r1 = r11.A00
            java.lang.String r0 = r1.A03
            if (r0 == 0) goto L_0x005f
            com.instagram.api.schemas.MediaKitVisibility r1 = r1.A00
            com.instagram.api.schemas.MediaKitVisibility r0 = com.instagram.api.schemas.MediaKitVisibility.PRIVATE
            if (r1 != r0) goto L_0x005f
            X.Lhj r0 = new X.Lhj
            r0.<init>(r1, r6)
            r8.add(r0)
        L_0x005f:
            X.0qQ.A0B(r12, r9)
            X.KgG r0 = X.C62466KgG.EDIT
            boolean r0 = X.AnonymousClass7TF.A1W(r12, r0)
            r12 = 0
            if (r0 != 0) goto L_0x00d9
            X.JzE r0 = r11.A00
            java.lang.String r0 = r0.A02
            if (r0 == 0) goto L_0x0077
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00d9
        L_0x0077:
            java.util.List r0 = r11.A02
            java.util.Iterator r11 = r0.iterator()
        L_0x007d:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00f2
            java.lang.Object r1 = r11.next()
            int r10 = r12 + 1
            if (r12 >= 0) goto L_0x0093
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0093:
            X.JzD r1 = (X.C61220JzD) r1
            com.instagram.mediakit.model.MediaKitSectionType r0 = r1.A01
            int r0 = r0.ordinal()
            if (r0 == r3) goto L_0x00bd
            if (r0 == r2) goto L_0x00b7
            if (r0 == r5) goto L_0x00b1
            if (r0 != r4) goto L_0x00af
            X.KUR r9 = new X.KUR
            r9.<init>(r1, r6)
        L_0x00a8:
            int r0 = r12 + 1
            r9.A00 = r0
            r8.add(r9)
        L_0x00af:
            r12 = r10
            goto L_0x007d
        L_0x00b1:
            X.KUS r9 = new X.KUS
            r9.<init>(r1, r6)
            goto L_0x00a8
        L_0x00b7:
            X.KUP r9 = new X.KUP
            r9.<init>(r1, r6)
            goto L_0x00a8
        L_0x00bd:
            X.KUQ r9 = new X.KUQ
            r9.<init>(r1, r6)
            X.JzC r1 = r1.A00
            if (r1 == 0) goto L_0x00d7
            boolean r0 = r1.A01
        L_0x00c8:
            r9.A03 = r0
            if (r1 == 0) goto L_0x00d0
            java.util.List r0 = r1.A00
            if (r0 != 0) goto L_0x00d2
        L_0x00d0:
            X.0sn r0 = X.0sn.A00
        L_0x00d2:
            r9.A01 = r0
            r9.A02 = r7
            goto L_0x00a8
        L_0x00d7:
            r0 = 0
            goto L_0x00c8
        L_0x00d9:
            X.JzE r0 = r11.A00
            java.lang.String r1 = r0.A02
            X.Lhz r0 = new X.Lhz
            r0.<init>(r6, r1)
            r8.add(r0)
            goto L_0x0077
        L_0x00e6:
            X.0sn r8 = X.0sn.A00
            return r8
        L_0x00e9:
            X.LhS r0 = new X.LhS
            r0.<init>()
            java.util.List r8 = X.AnonymousClass7TE.A1I(r0)
        L_0x00f2:
            return r8
        L_0x00f3:
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r13 = (java.lang.String) r13
            boolean r14 = X.AnonymousClass7TG.A1Z(r10, r11)
            java.lang.Object r9 = r15.receiver
            X.Jil r9 = (X.C60289Jil) r9
            r9.A01(r10, r11, r12, r13, r14)
            X.0gF r8 = X.C60340gF.A00
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MIK.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
