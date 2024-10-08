package X;

/* renamed from: X.NsU  reason: case insensitive filesystem */
public abstract class C69807NsU {
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0017: MOVE  (r1v2 com.instagram.common.session.UserSession) = (r1v1 com.instagram.common.session.UserSession)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public static final java.lang.Object A00(X.C307896Rx r5, X.AnonymousClass6Tm r6) {
        /*
            java.lang.String r4 = X.DbY.A0g(r6)
            java.lang.Object r1 = r6.A02()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Number"
            float r3 = X.C51970G9q.A04(r1, r0)
            X.0lg r1 = X.C308206Td.A0B(r5)
            boolean r0 = r1 instanceof com.instagram.common.session.UserSession
            r2 = 0
            if (r0 == 0) goto L_0x0030
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            if (r1 == 0) goto L_0x0030
            X.1Am r1 = X.1Al.A01(r1)
            X.1An r0 = X.1An.A3V
            X.0xa r0 = r1.A03(r0)
            X.0xY r0 = r0.AR4()
            r0.E5W(r4, r3)
            r0.apply()
            return r2
        L_0x0030:
            java.lang.String r0 = "User session must not be null to access local device cache"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69807NsU.A00(X.6Rx, X.6Tm):java.lang.Object");
    }
}
