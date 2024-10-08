package X;

/* renamed from: X.5EZ  reason: invalid class name */
public final class AnonymousClass5EZ {
    public C40242AXg A00;
    public final AnonymousClass0vF A01;

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, X.2jA] */
    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.2jE] */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0011: MOVE  (r6v1 com.instagram.common.session.UserSession) = (r6v0 com.instagram.common.session.UserSession)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void A00(X.C13672Teh r11) {
        /*
            r10 = this;
            X.AXg r0 = r10.A00
            if (r0 == 0) goto L_0x0007
            r0.A04()
        L_0x0007:
            X.08y r0 = X.09i.A0A
            X.0wW r6 = r0.A05(r10)
            boolean r0 = r6 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L_0x0061
            com.instagram.common.session.UserSession r6 = (com.instagram.common.session.UserSession) r6
            if (r6 == 0) goto L_0x0061
            java.lang.Integer r1 = X.AnonymousClass5Ea.A00(r6)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 == r0) goto L_0x0061
            X.2jA r1 = new X.2jA
            r1.<init>()
            X.2jE r0 = new X.2jE
            r0.<init>()
            X.AXg r5 = new X.AXg
            r5.<init>(r6, r0, r1)
            r10.A00 = r5
            long r1 = java.lang.System.currentTimeMillis()
            r8 = 86400000(0x5265c00, double:4.2687272E-316)
            X.2jG r3 = new X.2jG
            r3.<init>(r6)
            boolean r0 = r3.A00()
            if (r0 == 0) goto L_0x0062
            com.instagram.common.session.UserSession r7 = r3.A00
            X.0Tu r0 = X.0Tu.A05
            r3 = 36609128705431331(0x820fcf00061723, double:3.215098634219314E-306)
            long r3 = X.182.A01(r0, r7, r3)
            int r0 = (int) r3
        L_0x004e:
            long r3 = (long) r0
            long r3 = r3 * r8
            long r1 = r1 - r3
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r3
            int r0 = (int) r1
            r5.A03 = r0
            X.0vF r1 = r10.A01
            X.RAN r0 = new X.RAN
            r0.<init>(r6, r5, r11)
            r1.ATE(r0)
        L_0x0061:
            return
        L_0x0062:
            X.JY2 r0 = new X.JY2
            r0.<init>(r6)
            X.0eP r0 = r0.A00()
            if (r0 != 0) goto L_0x0070
            r0 = 60
            goto L_0x004e
        L_0x0070:
            int r0 = X.C227382jA.A00(r6)
            goto L_0x004e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5EZ.A00(X.Teh):void");
    }

    public AnonymousClass5EZ() {
        C61620nx A002 = C61610nw.A00();
        A002.A01 = "MediaScannerJobService";
        this.A01 = new AnonymousClass0vF(A002);
    }
}
