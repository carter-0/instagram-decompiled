package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.Fdu  reason: case insensitive filesystem */
public final class C50534Fdu implements G78 {
    public final Fragment A00;
    public final C252243on A01;
    public final G78 A02;

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x000c: MOVE  (r1v1 com.instagram.base.activity.IgFragmentActivity) = (r1v0 com.instagram.base.activity.IgFragmentActivity)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void D5C(boolean r4, java.lang.String r5) {
        /*
            r3 = this;
            androidx.fragment.app.Fragment r0 = r3.A00
            X.3on r2 = r3.A01
            androidx.fragment.app.FragmentActivity r1 = r0.getActivity()
            boolean r0 = r1 instanceof com.instagram.base.activity.BaseFragmentActivity
            if (r0 == 0) goto L_0x0013
            com.instagram.base.activity.IgFragmentActivity r1 = (com.instagram.base.activity.IgFragmentActivity) r1
            if (r1 == 0) goto L_0x0013
            r1.unregisterOnActivityResultListener(r2)
        L_0x0013:
            X.G78 r0 = r3.A02
            r0.D5C(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50534Fdu.D5C(boolean, java.lang.String):void");
    }

    public final void Dez(C51880G5s g5s) {
        this.A02.Dez(new C50536Fdw(g5s, this));
    }

    public C50534Fdu(Fragment fragment, C252243on r2, G78 g78) {
        this.A00 = fragment;
        this.A01 = r2;
        this.A02 = g78;
    }
}
