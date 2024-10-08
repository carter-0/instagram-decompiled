package X;

/* renamed from: X.MvV  reason: case insensitive filesystem */
public final class C67827MvV extends AnonymousClass3B3 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;

    public C67827MvV(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0010: MOVE  (r1v1 X.2t9) = (r1v0 X.2t9)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void getItemOffsets(android.graphics.Rect r4, android.view.View r5, androidx.recyclerview.widget.RecyclerView r6, X.AnonymousClass3AW r7) {
        /*
            r3 = this;
            X.C51974G9v.A1O(r4, r5, r6, r7)
            super.getItemOffsets(r4, r5, r6, r7)
            int r2 = androidx.recyclerview.widget.RecyclerView.A03(r5)
            X.2Rw r1 = r6.A0A
            boolean r0 = r1 instanceof X.AnonymousClass2t9
            if (r0 == 0) goto L_0x0026
            X.2t9 r1 = (X.AnonymousClass2t9) r1
            if (r1 == 0) goto L_0x0026
            java.lang.Class<X.JyL> r0 = X.C61169JyL.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}
            boolean r0 = r1.A09(r2, r0)
            if (r0 == 0) goto L_0x0026
            if (r2 != 0) goto L_0x0027
            int r0 = r3.A00
        L_0x0024:
            r4.top = r0
        L_0x0026:
            return
        L_0x0027:
            int r0 = r3.A01
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67827MvV.getItemOffsets(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, X.3AW):void");
    }
}
