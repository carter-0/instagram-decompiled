package X;

/* renamed from: X.FrU  reason: case insensitive filesystem */
public final class C51275FrU implements Runnable {
    public final /* synthetic */ C47499E5e A00;

    public C51275FrU(C47499E5e e5e) {
        this.A00 = e5e;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0036: MOVE  (r1v2 com.instagram.igds.components.bottomsheet.BottomSheetFragment) = 
          (r1v1 com.instagram.igds.components.bottomsheet.BottomSheetFragment)
        
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void run() {
        /*
            r4 = this;
            X.E5e r3 = r4.A00
            androidx.fragment.app.FragmentActivity r0 = r3.getActivity()
            if (r0 == 0) goto L_0x0042
            android.view.View r1 = r3.A01
            if (r1 != 0) goto L_0x0016
            java.lang.String r0 = "spinner"
        L_0x000e:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0016:
            r0 = 8
            r1.setVisibility(r0)
            android.view.View r0 = r3.A00
            if (r0 != 0) goto L_0x0022
            java.lang.String r0 = "divider"
            goto L_0x000e
        L_0x0022:
            r2 = 0
            r0.setVisibility(r2)
            androidx.recyclerview.widget.RecyclerView r0 = r3.A02
            if (r0 != 0) goto L_0x002d
            java.lang.String r0 = "mentionedUsersRecyclerView"
            goto L_0x000e
        L_0x002d:
            r0.setVisibility(r2)
            androidx.fragment.app.Fragment r1 = r3.mParentFragment
            boolean r0 = r1 instanceof com.instagram.igds.components.bottomsheet.BottomSheetFragment
            if (r0 == 0) goto L_0x0042
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r1 = (com.instagram.igds.components.bottomsheet.BottomSheetFragment) r1
            if (r1 == 0) goto L_0x0042
            X.7Pu r1 = r1.A02
            if (r1 == 0) goto L_0x0042
            r0 = 1
            r1.A0R(r0, r2)
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51275FrU.run():void");
    }
}
