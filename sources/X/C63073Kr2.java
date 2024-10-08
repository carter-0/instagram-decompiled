package X;

/* renamed from: X.Kr2  reason: case insensitive filesystem */
public abstract class C63073Kr2 {
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0068: MOVE  (r7v3 com.instagram.common.session.UserSession) = (r7v2 com.instagram.common.session.UserSession)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public static final java.lang.Object A00(X.C307896Rx r12, X.AnonymousClass6Tm r13) {
        /*
            r11 = 0
            r4 = 1
            java.util.List r0 = r13.A00
            java.util.Collections.unmodifiableList(r0)
            java.lang.Object r7 = r13.A03(r11)
            java.lang.String r6 = "null cannot be cast to non-null type kotlin.String"
            X.0qQ.A0C(r7, r6)
            r5 = 2
            java.lang.Integer[] r3 = X.AnonymousClass05K.A00(r5)
            int r2 = r3.length
            r1 = 0
        L_0x0017:
            if (r1 >= r2) goto L_0x0031
            r8 = r3[r1]
            int r0 = r8.intValue()
            int r0 = 1 - r0
            if (r0 == 0) goto L_0x002e
            java.lang.String r0 = "xar"
        L_0x0025:
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x0032
            int r1 = r1 + 1
            goto L_0x0017
        L_0x002e:
            java.lang.String r0 = "ccp"
            goto L_0x0025
        L_0x0031:
            r8 = 0
        L_0x0032:
            java.lang.String r7 = "Required value was null."
            if (r8 == 0) goto L_0x00ca
            java.lang.Object r0 = r13.A03(r4)
            boolean r10 = X.Q0A.A01(r0)
            java.lang.Object r6 = X.DbT.A0q(r13, r6, r5)
            X.0qQ.A0B(r6, r11)
            java.lang.Integer[] r5 = X.AnonymousClass05K.A00(r5)
            int r3 = r5.length
            r2 = 0
        L_0x004b:
            if (r2 >= r3) goto L_0x00c5
            r1 = r5[r2]
            int r0 = r1.intValue()
            int r0 = 1 - r0
            if (r0 == 0) goto L_0x0083
            java.lang.String r0 = "is_set_to_all_reels"
        L_0x0059:
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x0080
            X.0lg r7 = X.C308206Td.A0B(r12)
            boolean r0 = r7 instanceof com.instagram.common.session.UserSession
            r9 = 0
            if (r0 == 0) goto L_0x00c4
            com.instagram.common.session.UserSession r7 = (com.instagram.common.session.UserSession) r7
            if (r7 == 0) goto L_0x00c4
            int r0 = r1.intValue()
            if (r0 == r11) goto L_0x009f
            if (r0 != r4) goto L_0x009a
            int r0 = r8.intValue()
            if (r0 == r11) goto L_0x008b
            if (r0 != r4) goto L_0x0086
            X.C367288qV.A02(r7, r10)
            return r9
        L_0x0080:
            int r2 = r2 + 1
            goto L_0x004b
        L_0x0083:
            java.lang.String r0 = "is_set_to_this_reel"
            goto L_0x0059
        L_0x0086:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x008b:
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r7)
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            X.FWg r0 = new X.FWg
            r0.<init>(r1, r10, r11)
            r2.A05(r0)
            return r9
        L_0x009a:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x009f:
            int r0 = r8.intValue()
            if (r0 == r11) goto L_0x00b4
            if (r0 != r4) goto L_0x00af
            X.8qV r1 = X.C367288qV.A01
            java.lang.String r0 = "BLOKS"
            r1.A0C(r7, r0, r10, r11)
            return r9
        L_0x00af:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00b4:
            X.8qV r5 = X.C367288qV.A01
            X.6Rm r0 = X.C308206Td.A09(r12)
            X.0iw r6 = X.C308206Td.A07(r0)
            java.lang.String r8 = "BLOKS"
            r5.A0B(r6, r7, r8, r9, r10, r11)
            return r9
        L_0x00c4:
            return r9
        L_0x00c5:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r7)
            throw r0
        L_0x00ca:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63073Kr2.A00(X.6Rx, X.6Tm):java.lang.Object");
    }
}
