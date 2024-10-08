package X;

/* renamed from: X.Eeb  reason: case insensitive filesystem */
public abstract class C48442Eeb {
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0055: MOVE  (r3v2 com.instagram.common.session.UserSession) = (r3v1 com.instagram.common.session.UserSession)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public static final java.lang.Object A00(X.C307896Rx r10, X.AnonymousClass6Tm r11) {
        /*
            r6 = 0
            java.lang.Object r5 = r11.A03(r6)
            java.lang.String r8 = X.DbS.A0p(r5)
            java.lang.String r5 = (java.lang.String) r5
            X.0qQ.A0B(r5, r6)
            r9 = 2
            java.lang.Integer[] r4 = X.AnonymousClass05K.A00(r9)
            int r3 = r4.length
            r2 = 0
        L_0x0015:
            if (r2 >= r3) goto L_0x0035
            r7 = r4[r2]
            int r0 = r7.intValue()
            int r0 = 1 - r0
            if (r0 == 0) goto L_0x0032
            java.lang.String r0 = "DISMISS"
        L_0x0023:
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = X.DbT.A12(r1, r0)
            boolean r0 = X.Dbb.A1b(r5, r0, r1)
            if (r0 != 0) goto L_0x0036
            int r2 = r2 + 1
            goto L_0x0015
        L_0x0032:
            java.lang.String r0 = "VIEW"
            goto L_0x0023
        L_0x0035:
            r7 = 0
        L_0x0036:
            java.lang.String r5 = X.DbW.A0k(r11, r8)
            java.util.List r2 = r11.A00
            java.lang.Object r1 = r2.get(r9)
            java.lang.Number r1 = (java.lang.Number) r1
            r0 = 3
            java.lang.Object r4 = X.DbT.A0q(r11, r8, r0)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Collections.unmodifiableList(r2)
            X.0lg r3 = X.C308206Td.A0B(r10)
            boolean r0 = r3 instanceof com.instagram.common.session.UserSession
            r2 = 0
            if (r0 == 0) goto L_0x008c
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            if (r3 == 0) goto L_0x008c
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r7 != r0) goto L_0x006c
            if (r1 == 0) goto L_0x006c
            int r0 = r1.intValue()
            X.FBn r0 = X.C49797F7i.A01(r3, r0)
            if (r0 == 0) goto L_0x006c
            r0.A00()
        L_0x006c:
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r3)
            X.DtA r0 = new X.DtA
            r0.<init>(r5, r7, r4)
            r1.A05(r0)
            X.8qa r1 = X.C367328qZ.A00(r3)
            X.0qQ.A0B(r5, r6)
            r0 = 3336(0xd08, float:4.675E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = X.002.A0R(r0, r5)
            r1.A01(r0)
        L_0x008c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48442Eeb.A00(X.6Rx, X.6Tm):java.lang.Object");
    }
}
