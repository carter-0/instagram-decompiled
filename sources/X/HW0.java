package X;

public abstract class HW0 {
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0055: MOVE  (r2v1 com.instagram.common.session.UserSession) = (r2v0 com.instagram.common.session.UserSession)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public static final java.lang.Object A00(X.C307896Rx r9, X.AnonymousClass6Tm r10) {
        /*
            r5 = 0
            r8 = 1
            java.lang.Object r1 = r10.A03(r5)
            boolean r0 = r1 instanceof java.lang.String
            r3 = 0
            if (r0 != 0) goto L_0x000c
            r1 = r3
        L_0x000c:
            java.lang.String r0 = "manage_interests"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0039
            androidx.fragment.app.FragmentActivity r4 = X.C308206Td.A04(r9)
            X.0lg r1 = X.DbW.A0R(r9)
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "IS_SIGN_UP_FLOW"
            r2.putBoolean(r0, r5)
            X.6Yo r1 = X.DbU.A0Q(r4, r1)
            X.1WU r0 = X.AnonymousClass35B.A00()
            r0.A01()
            X.E2t r0 = new X.E2t
            r0.<init>()
            X.DbW.A0y(r2, r0, r1)
        L_0x0038:
            return r3
        L_0x0039:
            java.lang.String r0 = "not_interested"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0038
            java.lang.Object r4 = r10.A00()
            boolean r0 = r4 instanceof java.lang.String
            if (r0 == 0) goto L_0x0038
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x0038
            X.0lg r2 = X.C308206Td.A0B(r9)
            boolean r0 = r2 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L_0x0038
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            if (r2 == 0) goto L_0x0038
            X.1E7 r1 = X.1E8.A03
            java.lang.String r0 = "DidTapWAISTOptionV3"
            X.1Xj r4 = r1.A02(r2, r0, r4)
            if (r4 == 0) goto L_0x0038
            X.0hq r0 = X.C308206Td.A05(r9)
            X.06j r0 = r0.A0U
            java.util.List r0 = r0.A04()
            X.0qQ.A07(r0)
            java.lang.Object r7 = X.00k.A0K(r0)
            androidx.fragment.app.Fragment r7 = (androidx.fragment.app.Fragment) r7
            if (r7 == 0) goto L_0x0038
            boolean r0 = r7 instanceof X.C52477GUf
            if (r0 == 0) goto L_0x00b8
            r0 = r7
            X.GUf r0 = (X.C52477GUf) r0
            X.GUc r0 = X.C51968G9o.A0k(r0)
            X.310 r1 = r0.A00
            if (r1 == 0) goto L_0x009c
            X.2rR r0 = r1.B5L()
            if (r0 == 0) goto L_0x009c
            X.3W1 r2 = r0.BQr(r4)
            if (r2 == 0) goto L_0x009c
            X.32i r1 = r1.BD7()
            X.3WA r0 = X.AnonymousClass3WA.ORGANIC_SHOW_LESS_NOT_INTERESTED
            r1.DJB(r3, r4, r0, r2)
        L_0x009c:
            boolean r0 = r7 instanceof X.C227802jw
            if (r0 == 0) goto L_0x0038
            X.2jw r7 = (X.C227802jw) r7
            if (r7 == 0) goto L_0x0038
            X.30x r1 = r7.A0I
            if (r1 == 0) goto L_0x0038
            X.2rI r0 = r1.A0L
            X.3W1 r2 = r0.BQr(r4)
            X.32i r1 = r1.BD7()
            X.3WA r0 = X.AnonymousClass3WA.ORGANIC_SHOW_LESS_NOT_INTERESTED
            r1.DJB(r3, r4, r0, r2)
            return r3
        L_0x00b8:
            boolean r0 = r7 instanceof X.C227232is
            if (r0 == 0) goto L_0x009c
            r6 = r7
            X.2is r6 = (X.C227232is) r6
            X.4bN r5 = X.GD9.A00(r6)
            if (r5 == 0) goto L_0x009c
            X.GD6 r0 = r6.A0C
            if (r0 != 0) goto L_0x00d3
            java.lang.String r0 = "viewerAdapter"
        L_0x00cb:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00d3:
            X.GDe r2 = X.JSx.A00(r5, r0)
            X.37E r1 = X.AnonymousClass37D.A00
            androidx.fragment.app.FragmentActivity r0 = r6.requireActivity()
            X.37D r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x00fd
            X.37F r0 = (X.AnonymousClass37F) r0
            boolean r0 = r0.A0g
            if (r0 != r8) goto L_0x00fd
            androidx.fragment.app.FragmentActivity r0 = r6.requireActivity()
            X.37D r1 = r1.A01(r0)
            if (r1 == 0) goto L_0x009c
            X.Ia1 r0 = new X.Ia1
            r0.<init>(r5, r2, r1, r6)
            X.37F r1 = (X.AnonymousClass37F) r1
            r1.A0H = r0
            goto L_0x009c
        L_0x00fd:
            X.GBE r0 = r6.A09
            if (r0 != 0) goto L_0x0104
            java.lang.String r0 = "clipsViewerFragmentViewModel"
            goto L_0x00cb
        L_0x0104:
            r0.A0K(r5, r2)
            goto L_0x009c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HW0.A00(X.6Rx, X.6Tm):java.lang.Object");
    }
}
