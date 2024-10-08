package X;

/* renamed from: X.Mva  reason: case insensitive filesystem */
public final class C67832Mva extends AnonymousClass3B3 {
    public final Integer A00;
    public final Integer A01;
    public final Integer A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C67832Mva) {
                C67832Mva mva = (C67832Mva) obj;
                if (!0qQ.A0K(this.A00, mva.A00) || !0qQ.A0K(this.A02, mva.A02) || !0qQ.A0K(this.A01, mva.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public C67832Mva(Integer num, Integer num2, Integer num3) {
        this.A00 = num;
        this.A02 = num2;
        this.A01 = num3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001d, code lost:
        if (r2.A07.getLayoutDirection() != r3) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void getItemOffsets(android.graphics.Rect r12, android.view.View r13, androidx.recyclerview.widget.RecyclerView r14, X.AnonymousClass3AW r15) {
        /*
            r11 = this;
            boolean r3 = X.C51973G9u.A1b(r12, r13, r14)
            X.3pI r2 = r14.A0D
            boolean r0 = r2 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r0 == 0) goto L_0x006b
            androidx.recyclerview.widget.LinearLayoutManager r2 = (androidx.recyclerview.widget.LinearLayoutManager) r2
            if (r2 == 0) goto L_0x006b
            int r0 = r2.A01
            r10 = 1
            r4 = 0
            r9 = 0
            if (r0 != 0) goto L_0x001f
            r9 = 1
            androidx.recyclerview.widget.RecyclerView r0 = r2.A07
            int r1 = r0.getLayoutDirection()
            r0 = 1
            if (r1 == r3) goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            boolean r7 = r2.A08
            r7 = r7 ^ r0
            java.lang.Integer r0 = r11.A02
            int r6 = X.AnonymousClass7TG.A0A(r0)
            java.lang.Integer r0 = r11.A01
            int r8 = X.AnonymousClass7TG.A0A(r0)
            java.lang.Integer r0 = r11.A00
            int r5 = X.AnonymousClass7TG.A0A(r0)
            int r3 = androidx.recyclerview.widget.RecyclerView.A03(r13)
            r2 = -1
            if (r3 == r2) goto L_0x006b
            boolean r1 = X.AnonymousClass7TF.A1Q(r3)
            X.2Rw r0 = r14.A0A
            if (r0 == 0) goto L_0x004a
            int r0 = r0.getItemCount()
            int r2 = r0 + -1
        L_0x004a:
            if (r3 == r2) goto L_0x004d
            r10 = 0
        L_0x004d:
            if (r1 == 0) goto L_0x005c
            r0 = 0
            if (r7 == 0) goto L_0x0077
            if (r9 == 0) goto L_0x0055
            r0 = r6
        L_0x0055:
            r12.right = r0
            if (r9 == 0) goto L_0x005a
            r6 = 0
        L_0x005a:
            r12.bottom = r6
        L_0x005c:
            r0 = 0
            if (r10 == 0) goto L_0x006c
            if (r7 == 0) goto L_0x008b
            if (r9 == 0) goto L_0x0064
            r0 = r8
        L_0x0064:
            r12.left = r0
            if (r9 != 0) goto L_0x0069
            r4 = r8
        L_0x0069:
            r12.top = r4
        L_0x006b:
            return
        L_0x006c:
            if (r7 == 0) goto L_0x0082
            if (r9 == 0) goto L_0x0071
            r0 = r5
        L_0x0071:
            r12.left = r0
            if (r9 != 0) goto L_0x0069
            r4 = r5
            goto L_0x0069
        L_0x0077:
            if (r9 == 0) goto L_0x007a
            r0 = r6
        L_0x007a:
            r12.left = r0
            if (r9 == 0) goto L_0x007f
            r6 = 0
        L_0x007f:
            r12.top = r6
            goto L_0x005c
        L_0x0082:
            if (r9 == 0) goto L_0x0085
            r0 = r5
        L_0x0085:
            r12.right = r0
            if (r9 != 0) goto L_0x0093
            r4 = r5
            goto L_0x0093
        L_0x008b:
            if (r9 == 0) goto L_0x008e
            r0 = r8
        L_0x008e:
            r12.right = r0
            if (r9 != 0) goto L_0x0093
            r4 = r8
        L_0x0093:
            r12.bottom = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67832Mva.getItemOffsets(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, X.3AW):void");
    }

    public C67832Mva() {
        this((Integer) null, (Integer) null, (Integer) null);
    }
}
