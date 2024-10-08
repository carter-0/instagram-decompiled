package X;

/* renamed from: X.TqA  reason: case insensitive filesystem */
public final class C14115TqA extends AnonymousClass3B3 {
    public final float A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final AnonymousClass6TA A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C14115TqA) {
                C14115TqA tqA = (C14115TqA) obj;
                if (!(Float.compare(this.A01, tqA.A01) == 0 && Float.compare(this.A02, tqA.A02) == 0 && Float.compare(this.A00, tqA.A00) == 0 && this.A03 == tqA.A03 && this.A04 == tqA.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A04, (AnonymousClass7TF.A00(AnonymousClass7TF.A00(Float.floatToIntBits(this.A01) * 31, this.A02), this.A00) + this.A03) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ItemDecoration(spacingBefore=");
        sb.append(this.A01);
        sb.append(", spacingBetween=");
        sb.append(this.A02);
        sb.append(", spacingAfter=");
        sb.append(this.A00);
        sb.append(C273654mx.A00(100));
        sb.append(this.A03);
        sb.append(", alignItems=");
        return AnonymousClass7TG.A0n(this.A04, sb);
    }

    public C14115TqA(AnonymousClass6TA r1, float f, float f2, float f3, int i) {
        this.A01 = f;
        this.A02 = f2;
        this.A00 = f3;
        this.A03 = i;
        this.A04 = r1;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x000f: MOVE  (r9v1 X.Tq8) = (r9v0 X.Tq8)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void getItemOffsets(android.graphics.Rect r12, android.view.View r13, androidx.recyclerview.widget.RecyclerView r14, X.AnonymousClass3AW r15) {
        /*
            r11 = this;
            boolean r4 = X.AnonymousClass7TG.A1Z(r12, r13)
            r1 = 2
            X.0qQ.A0B(r14, r1)
            X.2Rw r9 = r14.A0A
            boolean r0 = r9 instanceof X.Tq8
            r5 = 0
            if (r0 == 0) goto L_0x009f
            X.Tq8 r9 = (X.Tq8) r9
            if (r9 == 0) goto L_0x009f
            int r7 = androidx.recyclerview.widget.RecyclerView.A03(r13)
            int r6 = r9.getItemCount()
            r0 = -1
            if (r7 == r0) goto L_0x009f
            if (r7 >= r6) goto L_0x009f
            X.3pI r2 = r14.A0D
            java.lang.String r0 = "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager"
            X.0qQ.A0C(r2, r0)
            androidx.recyclerview.widget.RecyclerView r0 = r2.A07
            int r0 = r0.getLayoutDirection()
            r2 = 0
            boolean r10 = X.AnonymousClass7TF.A1S(r0, r4)
            java.util.List r0 = r9.A03
            java.lang.Object r0 = r0.get(r7)
            X.Txy r0 = (X.C14538Txy) r0
            X.4tV r3 = r0.A01
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel"
            X.0qQ.A0C(r3, r0)
            r0 = 132(0x84, float:1.85E-43)
            X.4tV r0 = r3.A07(r0)
            if (r0 == 0) goto L_0x004d
            java.lang.String r5 = r0.A0G()
        L_0x004d:
            X.6TA r0 = r11.A04
            X.6TA r8 = X.C14508TxU.A00(r0, r5)
            int r5 = r11.A03
            if (r5 != r4) goto L_0x00c4
            int r3 = r14.getWidth()
        L_0x005b:
            java.util.List r0 = r9.A03
            java.lang.Object r0 = r0.get(r7)
            X.Txy r0 = (X.C14538Txy) r0
            X.6SI r0 = r0.A00
            X.6Sh r0 = r0.A01()
            if (r0 == 0) goto L_0x0083
            X.3dH r0 = r0.A01
            if (r5 != r4) goto L_0x00bf
            int r0 = r0.A01()
        L_0x0073:
            int r3 = r3 - r0
            int r0 = r8.ordinal()
            if (r0 == r4) goto L_0x00b6
            if (r0 != r1) goto L_0x007d
            r2 = r3
        L_0x007d:
            if (r5 != r4) goto L_0x00b3
            if (r10 == 0) goto L_0x00b0
            r12.right = r2
        L_0x0083:
            if (r7 != 0) goto L_0x008c
            float r0 = r11.A01
            int r0 = (int) r0
            if (r5 != r4) goto L_0x00a8
            r12.top = r0
        L_0x008c:
            int r6 = r6 - r4
            if (r7 >= r6) goto L_0x0096
            float r0 = r11.A02
            int r0 = (int) r0
            if (r5 != r4) goto L_0x00a0
            r12.bottom = r0
        L_0x0096:
            if (r7 != r6) goto L_0x009f
            float r0 = r11.A00
            int r0 = (int) r0
            if (r5 != r4) goto L_0x00c9
            r12.bottom = r0
        L_0x009f:
            return
        L_0x00a0:
            if (r10 == 0) goto L_0x00a5
            r12.left = r0
            goto L_0x0096
        L_0x00a5:
            r12.right = r0
            goto L_0x0096
        L_0x00a8:
            if (r10 == 0) goto L_0x00ad
            r12.right = r0
            goto L_0x008c
        L_0x00ad:
            r12.left = r0
            goto L_0x008c
        L_0x00b0:
            r12.left = r2
            goto L_0x0083
        L_0x00b3:
            r12.top = r2
            goto L_0x0083
        L_0x00b6:
            double r2 = (double) r3
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r2 = r2 / r0
            int r2 = X.AnonymousClass1GB.A00(r2)
            goto L_0x007d
        L_0x00bf:
            int r0 = r0.A00()
            goto L_0x0073
        L_0x00c4:
            int r3 = r14.getHeight()
            goto L_0x005b
        L_0x00c9:
            if (r10 == 0) goto L_0x00ce
            r12.left = r0
            return
        L_0x00ce:
            r12.right = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14115TqA.getItemOffsets(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, X.3AW):void");
    }
}
