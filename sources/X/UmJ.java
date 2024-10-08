package X;

public final class UmJ extends FZ9 {
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0006: MOVE  (r5v1 X.WMu) = (r5v0 X.WMu)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void onStart() {
        /*
            r6 = this;
            X.2IR r5 = r6.A00
            boolean r0 = r5 instanceof X.C19138WMu
            if (r0 == 0) goto L_0x0028
            X.WMu r5 = (X.C19138WMu) r5
            if (r5 == 0) goto L_0x0028
            X.6z9 r0 = r5.A04
            X.6zA r1 = r0.A03
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r1.A00(r0)
            X.6uV r4 = r5.A06
            boolean r3 = r5.A08
            boolean r2 = r5.A09
            X.5mA r1 = r5.A07
            r0 = 0
            r4.DQ9(r1, r3, r2, r0)
            if (r3 != 0) goto L_0x0028
            X.2mA r0 = r5.A05
            if (r0 == 0) goto L_0x0028
            r0.A01()
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UmJ.onStart():void");
    }
}
