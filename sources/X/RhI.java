package X;

public abstract class RhI {
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x003e: MOVE  (r1v1 com.instagram.common.session.UserSession) = (r1v0 com.instagram.common.session.UserSession)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public static final java.lang.Object A00(X.C307896Rx r7, X.AnonymousClass6Tm r8) {
        /*
            r6 = 0
            java.lang.String r5 = X.DbY.A0h(r8, r6)
            java.lang.Object r0 = r8.A02()
            boolean r4 = X.Q0A.A01(r0)
            java.lang.Object r0 = r8.A00()
            boolean r0 = X.JTQ.A1W(r0)
            r3 = 0
            if (r0 == 0) goto L_0x0036
            androidx.fragment.app.FragmentActivity r2 = X.C308206Td.A04(r7)
            java.lang.String r1 = r2.getPackageName()
            java.lang.String r0 = "_preferences"
            java.lang.String r0 = X.002.A0R(r1, r0)
            android.content.SharedPreferences r0 = r2.getSharedPreferences(r0, r6)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r5, r4)
            r0.apply()
            return r3
        L_0x0036:
            X.0lg r1 = X.C308206Td.A0B(r7)
            boolean r0 = r1 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L_0x0050
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            if (r1 == 0) goto L_0x0050
            X.1Am r1 = X.1Al.A01(r1)
            X.1An r0 = X.1An.A3V
            X.0xa r0 = r1.A03(r0)
            X.DbX.A1V(r0, r5, r4)
            return r3
        L_0x0050:
            r0 = 9
            java.lang.String r0 = X.C66579MXk.A00(r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RhI.A00(X.6Rx, X.6Tm):java.lang.Object");
    }
}
