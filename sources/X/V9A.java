package X;

public abstract class V9A {
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0016: MOVE  (r2v1 com.instagram.base.activity.BaseFragmentActivity) = (r2v0 com.instagram.base.activity.BaseFragmentActivity)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public static final java.lang.Object A00(X.C307896Rx r6, X.AnonymousClass6Tm r7) {
        /*
            r5 = 1
            java.lang.Object r4 = r7.A00()
            boolean r0 = r4 instanceof java.lang.String
            r3 = 0
            if (r0 == 0) goto L_0x0026
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x0026
            androidx.fragment.app.FragmentActivity r2 = X.C308206Td.A04(r6)
            boolean r0 = r2 instanceof com.instagram.base.activity.BaseFragmentActivity
            if (r0 == 0) goto L_0x0026
            com.instagram.base.activity.BaseFragmentActivity r2 = (com.instagram.base.activity.BaseFragmentActivity) r2
            if (r2 == 0) goto L_0x0026
            com.instagram.common.session.UserSession r1 = X.DbT.A0Z(r6)
            X.WOE r0 = new X.WOE
            r0.<init>(r2, r1, r4)
            X.C18676VwZ.A02(r2, r0, r1, r5)
        L_0x0026:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V9A.A00(X.6Rx, X.6Tm):java.lang.Object");
    }
}
