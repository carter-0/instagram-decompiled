package X;

public abstract class HS4 {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: X.GoI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: X.GoG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: X.GoF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: com.facebook.primitive.canvas.model.CanvasInverseTransform} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: X.GoH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: X.GoH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: X.GoH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v1, resolved type: X.GoH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v28, resolved type: X.GoH} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C53426GoI A00(X.C276544tV r25, long r26) {
        /*
            r0 = r25
            int r1 = r0.A04
            r11 = 16606(0x40de, float:2.327E-41)
            if (r1 != r11) goto L_0x0110
            r1 = 35
            r7 = 1065353216(0x3f800000, float:1.0)
            float r16 = r0.A02(r1, r7)
            r1 = 36
            r3 = 0
            float r17 = r0.A02(r1, r3)
            r4 = 38
            float r18 = r0.A02(r4, r3)
            r5 = 40
            float r19 = r0.A02(r5, r7)
            java.lang.String r1 = r0.A0I()
            r12 = r26
            float r2 = X.C51971G9r.A01(r12)
            float r20 = X.C56179Hu8.A01(r1, r3, r2)
            java.lang.String r6 = r0.A0G()
            float r1 = X.C51972G9s.A00(r12)
            float r21 = X.C56179Hu8.A01(r6, r3, r1)
            java.util.List r0 = r0.A0L()
            X.0qQ.A07(r0)
            java.util.ArrayList r15 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r14 = r0.iterator()
        L_0x004c:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x010a
            java.lang.Object r6 = r14.next()
            X.4tV r6 = (X.C276544tV) r6
            X.0qQ.A0A(r6)
            int r8 = r6.A04
            r0 = 16834(0x41c2, float:2.359E-41)
            if (r8 != r0) goto L_0x0067
            com.facebook.primitive.canvas.model.CanvasInverseTransform r0 = com.facebook.primitive.canvas.model.CanvasInverseTransform.A00
        L_0x0063:
            r15.add(r0)
            goto L_0x004c
        L_0x0067:
            r0 = 16590(0x40ce, float:2.3248E-41)
            boolean r9 = X.AnonymousClass7TF.A1S(r8, r0)
            r0 = 35
            if (r9 == 0) goto L_0x008f
            float r23 = r6.A02(r4, r7)
            float r24 = r6.A02(r5, r7)
            float r8 = X.C56179Hu8.A00(r6, r2, r0)
            java.lang.String r0 = r6.A0F()
            long r26 = X.C56192HuL.A01(r0, r1, r8)
            r25 = 0
        L_0x0087:
            X.GoH r0 = new X.GoH
            r22 = r0
            r22.<init>(r23, r24, r25, r26)
            goto L_0x0063
        L_0x008f:
            r9 = 16607(0x40df, float:2.3271E-41)
            if (r8 != r9) goto L_0x00ad
            float r10 = r6.A02(r0, r3)
            java.lang.String r0 = r6.A0F()
            float r0 = X.C56179Hu8.A01(r0, r3, r2)
            java.lang.String r6 = r6.A0K(r4)
            long r8 = X.C56192HuL.A01(r6, r1, r0)
            X.GoF r0 = new X.GoF
            r0.<init>(r8, r10)
            goto L_0x0063
        L_0x00ad:
            r9 = 16599(0x40d7, float:2.326E-41)
            if (r8 != r9) goto L_0x00c3
            float r8 = X.C56179Hu8.A00(r6, r2, r0)
            java.lang.String r0 = r6.A0F()
            float r6 = X.C56179Hu8.A01(r0, r3, r1)
            X.GoG r0 = new X.GoG
            r0.<init>(r8, r6)
            goto L_0x0063
        L_0x00c3:
            r9 = 16589(0x40cd, float:2.3246E-41)
            if (r8 != r9) goto L_0x00e2
            float r23 = X.C56179Hu8.A00(r6, r2, r4)
            float r24 = X.C56179Hu8.A00(r6, r1, r5)
            float r8 = X.C56179Hu8.A00(r6, r2, r0)
            java.lang.String r0 = r6.A0F()
            float r0 = X.C56179Hu8.A01(r0, r3, r1)
        L_0x00db:
            long r26 = X.C56192HuL.A00(r8, r0)
            r25 = 1
            goto L_0x0087
        L_0x00e2:
            r9 = 16830(0x41be, float:2.3584E-41)
            if (r8 != r9) goto L_0x00fb
            float r23 = r6.A02(r4, r3)
            float r24 = r6.A02(r5, r3)
            float r8 = X.C56179Hu8.A00(r6, r2, r0)
            java.lang.String r0 = r6.A0F()
            float r0 = X.C56179Hu8.A01(r0, r3, r1)
            goto L_0x00db
        L_0x00fb:
            if (r8 != r11) goto L_0x0103
            X.GoI r0 = A00(r6, r12)
            goto L_0x0063
        L_0x0103:
            java.lang.String r0 = "Unknown canvas child transform."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x010a:
            X.GoI r14 = new X.GoI
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            return r14
        L_0x0110:
            java.lang.String r0 = "Expected non-inverse transform model."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HS4.A00(X.4tV, long):X.GoI");
    }
}
