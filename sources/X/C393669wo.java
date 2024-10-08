package X;

/* renamed from: X.9wo  reason: invalid class name and case insensitive filesystem */
public abstract class C393669wo {
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x000a: MOVE  (r4v1 com.instagram.common.session.UserSession) = (r4v0 com.instagram.common.session.UserSession)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public static final java.lang.Object A00(X.C307896Rx r6) {
        /*
            r5 = 1
            X.0lg r4 = X.C308206Td.A0B(r6)
            boolean r0 = r4 instanceof com.instagram.common.session.UserSession
            r3 = 0
            if (r0 == 0) goto L_0x0030
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            if (r4 == 0) goto L_0x0030
            boolean r0 = X.AnonymousClass8PU.A05(r4)
            if (r0 != 0) goto L_0x0015
            return r3
        L_0x0015:
            java.lang.String r0 = "BKBloksActionIgCrosspostingUpdateAutoCrosspostingDestinationImpl"
            com.facebook.common.callercontext.CallerContext r2 = com.facebook.common.callercontext.CallerContext.A01(r0)
            X.8jd r0 = X.C363388je.A00(r4)
            X.0qQ.A0A(r2)
            java.lang.String r1 = "bloks"
            r0.A01(r2, r3, r1)
            X.8js r0 = new X.8js
            r0.<init>(r4)
            r0.A06(r1, r5)
            return r3
        L_0x0030:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C393669wo.A00(X.6Rx):java.lang.Object");
    }
}
