package X;

/* renamed from: X.NsO  reason: case insensitive filesystem */
public abstract class C69801NsO {
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x000c: MOVE  (r1v2 com.instagram.common.session.UserSession) = (r1v1 com.instagram.common.session.UserSession)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public static final java.lang.Float A00(X.C307896Rx r1, X.AnonymousClass6Tm r2) {
        /*
            java.lang.String r2 = X.DbY.A0g(r2)
            X.0lg r1 = X.C308206Td.A0B(r1)
            boolean r0 = r1 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L_0x0024
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            if (r1 == 0) goto L_0x0024
            X.1Am r1 = X.1Al.A01(r1)
            X.1An r0 = X.1An.A3V
            X.0xa r1 = r1.A03(r0)
            r0 = 0
            float r0 = r1.getFloat(r2, r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
        L_0x0024:
            java.lang.String r0 = "User session must not be null to access local device cache"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69801NsO.A00(X.6Rx, X.6Tm):java.lang.Float");
    }
}
