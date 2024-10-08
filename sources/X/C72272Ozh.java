package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Ozh  reason: case insensitive filesystem */
public final class C72272Ozh implements C250603lj {
    public final RecyclerView A00;
    public final C58045Ikd A01;

    public final void ATF(AnonymousClass30Y r5, C252093oY r6) {
        boolean A1U = AnonymousClass7TF.A1U(0, r5, r6);
        int A0A = C51968G9o.A0A(r5, r6);
        if (A0A != 0) {
            if (A0A == 2) {
                Object obj = r5.A03;
                0qQ.A06(obj);
                A00((C68199N5o) obj, false);
                return;
            } else if (r6.CFe(r5) <= 0.9f) {
                return;
            }
        }
        Object obj2 = r5.A03;
        0qQ.A06(obj2);
        A00((C68199N5o) obj2, A1U);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x000c: MOVE  (r1v1 X.2t9) = (r1v0 X.2t9)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    private final void A00(X.C68199N5o r5, boolean r6) {
        /*
            r4 = this;
            androidx.recyclerview.widget.RecyclerView r3 = r4.A00
            X.3pI r2 = r3.A0D
            if (r2 == 0) goto L_0x0048
            X.2Rw r1 = r3.A0A
            boolean r0 = r1 instanceof X.AnonymousClass2t9
            if (r0 == 0) goto L_0x0048
            X.2t9 r1 = (X.AnonymousClass2t9) r1
            if (r1 == 0) goto L_0x0048
            X.N4t r0 = r5.A02
            java.lang.String r0 = r0.A0B
            int r0 = r1.A02(r0)
            int r1 = X.C240113Jq.A03(r2, r3, r0)
            r0 = -1
            if (r1 == r0) goto L_0x0048
            android.view.View r0 = r3.getChildAt(r1)
            if (r0 == 0) goto L_0x0048
            java.lang.Object r1 = r0.getTag()
            boolean r0 = r1 instanceof X.C68053MzK
            if (r0 == 0) goto L_0x0048
            X.MzK r1 = (X.C68053MzK) r1
            if (r1 == 0) goto L_0x0048
            X.MqP r3 = r1.A00
            if (r3 == 0) goto L_0x0048
            if (r6 == 0) goto L_0x0049
            boolean r0 = r3.AkI()
            if (r0 == 0) goto L_0x0049
            X.Ikd r2 = r4.A01
            r1 = 4
        L_0x0040:
            X.Inp r0 = new X.Inp
            r0.<init>(r1, r3, r2)
            X.C58045Ikd.A00(r0)
        L_0x0048:
            return
        L_0x0049:
            boolean r0 = r3.AkI()
            if (r0 == 0) goto L_0x0048
            X.Ikd r2 = r4.A01
            r1 = 5
            goto L_0x0040
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72272Ozh.A00(X.N5o, boolean):void");
    }

    public C72272Ozh(RecyclerView recyclerView, C58045Ikd ikd) {
        this.A01 = ikd;
        this.A00 = recyclerView;
    }
}
