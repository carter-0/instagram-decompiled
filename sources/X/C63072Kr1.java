package X;

/* renamed from: X.Kr1  reason: case insensitive filesystem */
public abstract class C63072Kr1 {
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x001f: MOVE  (r4v1 com.instagram.common.session.UserSession) = (r4v0 com.instagram.common.session.UserSession)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public static final java.lang.Object A00(X.C307896Rx r6, X.AnonymousClass6Tm r7) {
        /*
            r5 = 0
            java.lang.Object r0 = r7.A03(r5)
            boolean r2 = X.Q0A.A01(r0)
            java.lang.Object r0 = r7.A02()
            boolean r1 = X.Q0A.A01(r0)
            java.util.List r0 = r7.A00
            java.util.Collections.unmodifiableList(r0)
            X.0lg r4 = X.C308206Td.A0B(r6)
            boolean r0 = r4 instanceof com.instagram.common.session.UserSession
            r3 = 0
            if (r0 == 0) goto L_0x005d
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            if (r4 == 0) goto L_0x005d
            if (r2 == 0) goto L_0x0042
            X.2D6 r0 = X.2D5.A00(r4)
            java.lang.Integer r1 = X.JTP.A0j(r1)
            X.0qQ.A0B(r1, r5)
            X.0xa r0 = r0.A04
            X.0xY r2 = r0.AR4()
            java.lang.String r1 = X.C378169Ot.A00(r1)
            java.lang.String r0 = "PREFERENCE_CREATOR_DESTINATION_TYPE_STRING"
            r2.E5g(r0, r1)
            r2.apply()
        L_0x0042:
            java.lang.String r0 = "BKBloksActionIgCxpRefreshAllImpl"
            com.facebook.common.callercontext.CallerContext r2 = com.facebook.common.callercontext.CallerContext.A01(r0)
            X.8jd r0 = X.C363388je.A00(r4)
            X.0qQ.A0A(r2)
            java.lang.String r1 = "bloks"
            r0.A01(r2, r3, r1)
            X.8js r0 = new X.8js
            r0.<init>(r4)
            r0.A06(r1, r5)
            return r3
        L_0x005d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63072Kr1.A00(X.6Rx, X.6Tm):java.lang.Object");
    }
}
