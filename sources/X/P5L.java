package X;

public final /* synthetic */ class P5L implements AnonymousClass7B5 {
    public final /* synthetic */ C327367Am A00;

    public /* synthetic */ P5L(C327367Am r1) {
        this.A00 = r1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: X.NZu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: X.NZv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: X.NZv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v5, resolved type: X.NZv} */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v3 */
    /* JADX WARNING: type inference failed for: r18v4, types: [X.NZz] */
    /* JADX WARNING: type inference failed for: r18v5, types: [X.NZy] */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass7FW AXV(android.content.Context r26, com.instagram.common.session.UserSession r27, X.AnonymousClass9HC r28, X.AnonymousClass7LQ r29, X.AnonymousClass7L2 r30, X.17i r31) {
        /*
            r25 = this;
            r2 = r29
            X.3su r4 = r2.A0e
            X.3tI r5 = r4.A0P()
            r5.getClass()
            X.2FW r0 = r5.A0F
            r8 = 0
            r15 = r27
            r16 = r28
            r18 = r30
            r17 = r2
            r19 = r5
            r20 = r0
            X.7FE r11 = X.AnonymousClass7FD.A01(r15, r16, r17, r18, r19, r20)
            X.7FT r10 = X.AnonymousClass7FG.A02(r15, r2, r5)
            com.instagram.model.mediasize.ExtendedImageUrl r0 = r5.A0I
            if (r0 == 0) goto L_0x0042
            X.3tI r0 = r4.A0P()
            r0.getClass()
            com.instagram.model.mediasize.ExtendedImageUrl r0 = r0.A0I
            r4 = -1
            r6 = 0
            X.NZv r12 = new X.NZv
            r1 = r12
            r2 = r0
            r3 = r8
            r1.<init>(r2, r3, r4, r6)
            X.NYX r7 = new X.NYX
            r9 = r8
            r13 = r8
            r7.<init>(r8, r9, r10, r11, r12, r13)
            return r7
        L_0x0042:
            X.2FW r3 = r5.A0F
            X.2FW r0 = X.2FW.A1D
            if (r3 != r0) goto L_0x0102
            X.9JI r0 = r5.A01
            java.lang.Object r1 = r0.A00
            X.1Xj r1 = (X.1Xj) r1
        L_0x004e:
            X.3tI r2 = r4.A0P()
            r2.getClass()
            X.9JI r6 = r2.A01
            if (r6 == 0) goto L_0x0063
            java.lang.String r0 = r6.A02
            if (r0 == 0) goto L_0x0063
            X.1Xj r14 = r1.A1f(r0)
            if (r14 != 0) goto L_0x0064
        L_0x0063:
            r14 = r1
        L_0x0064:
            X.77X r4 = r2.A02
            X.7FJ r5 = r2.A04
            X.7FN r3 = r2.A03
            X.9Iu r13 = X.C70865OPe.A00(r14)
            boolean r0 = X.AnonymousClass7TF.A1V(r5)
            r7 = r26
            X.Nop r17 = X.C70026Nw4.A00(r7, r15, r14, r0)
            if (r6 == 0) goto L_0x008e
            java.lang.String r3 = r2.A0T
            java.lang.String r0 = r2.A0U
            X.Na0 r8 = X.OPa.A00(r6, r15, r1, r3, r0)
        L_0x0082:
            X.NYX r7 = new X.NYX
            r12 = r7
            r15 = r10
            r16 = r11
            r18 = r8
            r12.<init>(r13, r14, r15, r16, r17, r18)
            return r7
        L_0x008e:
            if (r4 == 0) goto L_0x00b4
            java.lang.String r3 = r2.A0U
            java.lang.String r0 = r15.A06
            boolean r24 = r3.equals(r0)
            java.lang.String r21 = r1.getId()
            com.instagram.common.typedurl.ImageUrl r19 = r1.A1Q()
            X.3OA r3 = r4.A02
            java.lang.String r1 = r2.A0T
            java.lang.String r0 = r2.A0R
            X.NZy r8 = new X.NZy
            r18 = r8
            r20 = r3
            r22 = r1
            r23 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24)
            goto L_0x0082
        L_0x00b4:
            if (r5 == 0) goto L_0x00eb
            java.lang.String r0 = r5.A07
            if (r0 == 0) goto L_0x0082
            com.instagram.user.model.User r0 = X.C51966G9m.A11(r1)
            if (r0 == 0) goto L_0x0082
            java.lang.String r0 = r2.A0T
            if (r0 == 0) goto L_0x0082
            java.lang.String r20 = r1.getId()
            java.lang.String r5 = r5.A07
        L_0x00ca:
            com.instagram.user.model.User r0 = X.C51966G9m.A11(r1)
            X.1Nr r4 = new X.1Nr
            r4.<init>(r0)
            java.lang.String r3 = r2.A0T
            java.lang.String r1 = r2.A0R
            java.lang.String r0 = r2.A0U
            X.NZz r8 = new X.NZz
            r18 = r8
            r19 = r4
            r21 = r5
            r22 = r3
            r23 = r1
            r24 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24)
            goto L_0x0082
        L_0x00eb:
            if (r3 == 0) goto L_0x0082
            java.lang.String r0 = r3.A08
            if (r0 == 0) goto L_0x0082
            com.instagram.user.model.User r0 = X.C51966G9m.A11(r1)
            if (r0 == 0) goto L_0x0082
            java.lang.String r0 = r2.A0T
            if (r0 == 0) goto L_0x0082
            java.lang.String r20 = r1.getId()
            java.lang.String r5 = r3.A08
            goto L_0x00ca
        L_0x0102:
            X.2FW r0 = X.2FW.A0W
            if (r3 != r0) goto L_0x010c
            X.77X r0 = r5.A02
            X.1Xj r1 = r0.A01
            goto L_0x004e
        L_0x010c:
            X.2FW r0 = X.2FW.A1e
            if (r3 != r0) goto L_0x0116
            X.7FJ r0 = r5.A04
            X.1Xj r1 = r0.A01
            goto L_0x004e
        L_0x0116:
            X.2FW r0 = X.2FW.A1T
            if (r3 != r0) goto L_0x0120
            X.7FN r0 = r5.A03
            X.1Xj r1 = r0.A02
            goto L_0x004e
        L_0x0120:
            X.2FW r1 = X.2FW.A0s
            if (r3 == r1) goto L_0x0135
            com.google.common.collect.ImmutableList r0 = r5.A01()
            r3 = 1
            if (r0 == 0) goto L_0x01bc
            com.google.common.collect.ImmutableList r0 = r5.A01()
            int r0 = r0.size()
            if (r0 != r3) goto L_0x01bc
        L_0x0135:
            X.3tI r3 = r4.A0P()
            r3.getClass()
            X.2FW r0 = r3.A0F
            if (r0 != r1) goto L_0x01a9
            X.3tC r4 = r3.A09
        L_0x0142:
            r4.getClass()
            com.instagram.model.mediasize.ExtendedImageUrl r5 = r4.A0X
            boolean r0 = X.C253833rU.A02(r5)
            if (r0 != 0) goto L_0x01a1
            if (r5 == 0) goto L_0x01b7
            r22 = -1
            int r1 = r4.A02
            r0 = 4
            boolean r24 = X.AnonymousClass7TF.A1S(r1, r0)
            int r1 = r4.A08
            r0 = 8
            if (r1 == r0) goto L_0x0195
            r0 = 9
            if (r1 == r0) goto L_0x0199
            r21 = 0
        L_0x0164:
            X.NZv r12 = new X.NZv
            r19 = r12
            r20 = r5
            r19.<init>(r20, r21, r22, r24)
        L_0x016d:
            java.lang.String r5 = r4.A0u
            if (r5 == 0) goto L_0x0193
            java.lang.String r4 = r3.A0T
            if (r4 == 0) goto L_0x0193
            java.lang.String r1 = r3.A0U
            java.lang.String r0 = r3.A0R
            X.NZx r13 = new X.NZx
            r13.<init>(r5, r1, r4, r0)
        L_0x017e:
            X.2FW r0 = r3.A0F
            r19 = r3
            r20 = r0
            X.7FE r11 = X.AnonymousClass7FD.A01(r15, r16, r17, r18, r19, r20)
            X.7FT r10 = X.AnonymousClass7FG.A02(r15, r2, r3)
            X.NYX r7 = new X.NYX
            r9 = r8
            r7.<init>(r8, r9, r10, r11, r12, r13)
            return r7
        L_0x0193:
            r13 = r8
            goto L_0x017e
        L_0x0195:
            r0 = 2131238685(0x7f081f1d, float:1.8093656E38)
            goto L_0x019c
        L_0x0199:
            r0 = 2131238647(0x7f081ef7, float:1.8093579E38)
        L_0x019c:
            java.lang.Integer r21 = java.lang.Integer.valueOf(r0)
            goto L_0x0164
        L_0x01a1:
            long r0 = r4.A0K
            X.NZu r12 = new X.NZu
            r12.<init>(r0)
            goto L_0x016d
        L_0x01a9:
            com.google.common.collect.ImmutableList r0 = r3.A01()
            r0.getClass()
            java.lang.Object r4 = X.AnonymousClass7TE.A13(r0)
            X.3tC r4 = (X.C254873tC) r4
            goto L_0x0142
        L_0x01b7:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x01bc:
            java.lang.String r1 = "ContextReplyDecoratedItemDefinitionShimViewHolderFactory_getGeneratorForTextReplyToMediaShare"
            java.lang.String r0 = "Message type is not media_share, xma or hscroll share single xma"
            X.0wb.A04(r1, r0, r3)
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P5L.AXV(android.content.Context, com.instagram.common.session.UserSession, X.9HC, X.7LQ, X.7L2, X.17i):X.7FW");
    }
}
