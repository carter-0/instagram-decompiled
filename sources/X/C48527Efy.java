package X;

/* renamed from: X.Efy  reason: case insensitive filesystem */
public abstract class C48527Efy {
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0019: MOVE  (r1v1 com.instagram.common.session.UserSession) = (r1v0 com.instagram.common.session.UserSession)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public static final java.lang.Object A00(X.C307896Rx r5, X.AnonymousClass6Tm r6) {
        /*
            java.lang.Object r4 = X.DbW.A0e(r6)
            boolean r0 = r4 instanceof java.lang.String
            r3 = 0
            if (r0 == 0) goto L_0x0030
            java.lang.String r4 = (java.lang.String) r4
        L_0x000b:
            X.6Rm r0 = r5.A03
            if (r0 == 0) goto L_0x002c
            android.content.Context r2 = r0.A00
            X.0lg r1 = X.DbU.A0V(r5)
            boolean r0 = r1 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L_0x0032
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            if (r1 == 0) goto L_0x0032
            java.lang.String r0 = "permissions_accept_invite"
            if (r4 == 0) goto L_0x002d
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x002d
            X.DeL r0 = X.C46398DeL.A08
        L_0x0029:
            X.C46399DeM.A03(r2, r0, r1, r3)
        L_0x002c:
            return r3
        L_0x002d:
            X.DeL r0 = X.C46398DeL.A0E
            goto L_0x0029
        L_0x0030:
            r4 = r3
            goto L_0x000b
        L_0x0032:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48527Efy.A00(X.6Rx, X.6Tm):java.lang.Object");
    }
}
