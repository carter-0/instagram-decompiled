package X;

/* renamed from: X.Kqt  reason: case insensitive filesystem */
public abstract class C63064Kqt {
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x001c: MOVE  (r1v3 X.3jo) = (r1v0 X.3jo)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public static final void A00(androidx.fragment.app.Fragment r3, X.C64308LZi r4) {
        /*
            X.2dZ r0 = r4.A02
            if (r0 == 0) goto L_0x000d
            X.4DS r0 = r4.A01
            if (r0 == 0) goto L_0x000d
            X.07Z r0 = r4.A00
            if (r0 == 0) goto L_0x000d
        L_0x000c:
            return
        L_0x000d:
            X.07Z r0 = r3.getViewLifecycleOwner()
            r4.A00 = r0
            androidx.fragment.app.FragmentActivity r1 = r3.getActivity()
            boolean r0 = r1 instanceof X.C249453jo
            r2 = 0
            if (r0 == 0) goto L_0x0041
            X.3jo r1 = (X.C249453jo) r1
            if (r1 == 0) goto L_0x0041
            X.2dZ r1 = r1.AYJ()
        L_0x0024:
            r4.A02 = r1
            boolean r0 = r3 instanceof X.AnonymousClass4DS
            if (r0 == 0) goto L_0x002d
            r2 = r3
            X.4DS r2 = (X.AnonymousClass4DS) r2
        L_0x002d:
            r4.A01 = r2
            if (r1 == 0) goto L_0x0043
            if (r2 == 0) goto L_0x0043
            X.07Z r0 = r4.A00
            if (r0 == 0) goto L_0x0043
            X.07V r0 = r0.getLifecycle()
            if (r0 == 0) goto L_0x000c
            r0.A09(r4)
            return
        L_0x0041:
            r1 = r2
            goto L_0x0024
        L_0x0043:
            r0 = 0
            r4.A02 = r0
            r4.A01 = r0
            r4.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63064Kqt.A00(androidx.fragment.app.Fragment, X.LZi):void");
    }
}
