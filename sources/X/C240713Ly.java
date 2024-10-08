package X;

import java.lang.ref.WeakReference;

/* renamed from: X.3Ly  reason: invalid class name and case insensitive filesystem */
public final class C240713Ly implements C250603lj {
    public final /* synthetic */ WeakReference A00;

    public C240713Ly(WeakReference weakReference) {
        this.A00 = weakReference;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0031: MOVE  (r2v2 X.0iw) = (r2v1 X.0iw)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void ATF(X.AnonymousClass30Y r6, X.C252093oY r7) {
        /*
            r5 = this;
            java.lang.ref.WeakReference r0 = r5.A00
            java.lang.Object r4 = r0.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x0062
            java.lang.Integer r1 = r7.CEk(r6)
            X.0qQ.A07(r1)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 == r0) goto L_0x0021
            java.lang.Object r3 = r6.A04
            X.3Lx r3 = (X.C240703Lx) r3
            boolean r0 = r3.A01
            if (r0 != 0) goto L_0x004f
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x004f
        L_0x0021:
            java.lang.Object r3 = r6.A04
            X.3Lx r3 = (X.C240703Lx) r3
            r0 = 1
            r3.A01 = r0
            r0 = 0
            androidx.fragment.app.Fragment r2 = X.0hq.A01(r4)     // Catch:{ IllegalStateException -> 0x0039 }
            boolean r1 = r2 instanceof X.AnonymousClass0iw     // Catch:{ IllegalStateException -> 0x0039 }
            if (r1 == 0) goto L_0x003b
            X.0iw r2 = (X.AnonymousClass0iw) r2     // Catch:{ IllegalStateException -> 0x0039 }
            if (r2 == 0) goto L_0x003b
            java.lang.String r0 = r2.getModuleName()     // Catch:{ IllegalStateException -> 0x0039 }
        L_0x0039:
            if (r0 != 0) goto L_0x003d
        L_0x003b:
            java.lang.String r0 = "unknown"
        L_0x003d:
            r3.A00 = r0
            X.1Jk r2 = X.1Jk.A08
            int r0 = r4.hashCode()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r3.A00
            r2.A0J(r1, r0)
            return
        L_0x004f:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x0062
            X.1Jk r2 = X.1Jk.A08
            int r0 = r4.hashCode()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r3.A00
            r2.A0I(r1, r0)
        L_0x0062:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C240713Ly.ATF(X.30Y, X.3oY):void");
    }
}
