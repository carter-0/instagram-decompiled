package androidx.compose.ui.input.nestedscroll;

import X.AnonymousClass9L8;
import X.C262224Cq;
import X.C62320sa;
import X.GQ7;

public final class NestedScrollDispatcher {
    public NestedScrollNode A00;
    public C62320sa A01 = new AnonymousClass9L8(this, 22);
    public C262224Cq A02;

    /* JADX WARNING: type inference failed for: r4v1, types: [X.9JU, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.AnonymousClass4D7 r6, long r7) {
        /*
            r5 = this;
            r3 = 2
            boolean r0 = X.AnonymousClass9JU.A00(r3, r6)
            if (r0 == 0) goto L_0x0042
            r4 = r6
            X.9JU r4 = (X.AnonymousClass9JU) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0042
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0015:
            java.lang.Object r3 = r4.A01
            X.1Hj r2 = X.1Hj.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x002d
            if (r0 != r1) goto L_0x004a
            X.0eS.A00(r3)
        L_0x0023:
            X.GQ9 r3 = (X.GQ9) r3
            long r0 = r3.A00
        L_0x0027:
            X.GQ9 r2 = new X.GQ9
            r2.<init>(r0)
            return r2
        L_0x002d:
            X.0eS.A00(r3)
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r0 = r5.A00()
            if (r0 == 0) goto L_0x003f
            r4.A00 = r1
            java.lang.Object r3 = r0.DYa(r4, r7)
            if (r3 != r2) goto L_0x0023
            return r2
        L_0x003f:
            r0 = 0
            goto L_0x0027
        L_0x0042:
            r0 = 42
            X.9JU r4 = new X.9JU
            r4.<init>(r5, r6, r3, r0)
            goto L_0x0015
        L_0x004a:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher.A01(X.4D7, long):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.9JU, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.AnonymousClass4D7 r11, long r12, long r14) {
        /*
            r10 = this;
            r3 = 1
            boolean r0 = X.AnonymousClass9JU.A00(r3, r11)
            if (r0 == 0) goto L_0x0043
            r5 = r11
            X.9JU r5 = (X.AnonymousClass9JU) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0043
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r5.A01
            X.1Hj r2 = X.1Hj.A02
            int r0 = r5.A00
            if (r0 == 0) goto L_0x002c
            if (r0 != r3) goto L_0x004b
            X.0eS.A00(r1)
        L_0x0022:
            X.GQ9 r1 = (X.GQ9) r1
            long r0 = r1.A00
        L_0x0026:
            X.GQ9 r2 = new X.GQ9
            r2.<init>(r0)
            return r2
        L_0x002c:
            X.0eS.A00(r1)
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r4 = r10.A00()
            if (r4 == 0) goto L_0x0040
            r5.A00 = r3
            r6 = r12
            r8 = r14
            java.lang.Object r1 = r4.DYV(r5, r6, r8)
            if (r1 != r2) goto L_0x0022
            return r2
        L_0x0040:
            r0 = 0
            goto L_0x0026
        L_0x0043:
            r0 = 42
            X.9JU r5 = new X.9JU
            r5.<init>(r10, r11, r3, r0)
            goto L_0x0015
        L_0x004b:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher.A02(X.4D7, long, long):java.lang.Object");
    }

    public final NestedScrollNode A00() {
        NestedScrollNode nestedScrollNode = this.A00;
        if (nestedScrollNode == null || !nestedScrollNode.A08) {
            return null;
        }
        return (NestedScrollNode) GQ7.A01(nestedScrollNode);
    }
}
