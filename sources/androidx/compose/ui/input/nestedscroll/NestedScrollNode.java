package androidx.compose.ui.input.nestedscroll;

import X.AnonymousClass5Qr;
import X.AnonymousClass5WO;
import X.AnonymousClass9L8;
import X.C262224Cq;
import X.C267794cD;
import X.C289295dM;
import X.GQ7;

public final class NestedScrollNode extends C267794cD implements AnonymousClass5Qr, AnonymousClass5WO {
    public AnonymousClass5WO A00;
    public NestedScrollDispatcher A01;
    public final Object A02;

    /* JADX WARNING: type inference failed for: r6v1, types: [X.9Oj, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object DYV(X.AnonymousClass4D7 r12, long r13, long r15) {
        /*
            r11 = this;
            r7 = r13
            r9 = r15
            boolean r0 = r12 instanceof X.C378069Oj
            if (r0 == 0) goto L_0x007e
            r6 = r12
            X.9Oj r6 = (X.C378069Oj) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x007e
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0014:
            java.lang.Object r4 = r6.A04
            X.1Hj r3 = X.1Hj.A02
            int r1 = r6.A00
            r2 = 2
            r0 = 1
            if (r1 == 0) goto L_0x0041
            if (r1 == r0) goto L_0x0035
            if (r1 != r2) goto L_0x0084
            long r0 = r6.A01
            X.0eS.A00(r4)
        L_0x0027:
            X.GQ9 r4 = (X.GQ9) r4
            long r2 = r4.A00
        L_0x002b:
            long r0 = X.GQ9.A03(r0, r2)
            X.GQ9 r3 = new X.GQ9
            r3.<init>(r0)
        L_0x0034:
            return r3
        L_0x0035:
            long r9 = r6.A02
            long r7 = r6.A01
            java.lang.Object r5 = r6.A03
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r5 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode) r5
            X.0eS.A00(r4)
            goto L_0x0055
        L_0x0041:
            X.0eS.A00(r4)
            X.5WO r5 = r11.A00
            r6.A03 = r11
            r6.A01 = r13
            r6.A02 = r15
            r6.A00 = r0
            java.lang.Object r4 = r5.DYV(r6, r7, r9)
            if (r4 == r3) goto L_0x0034
            r5 = r11
        L_0x0055:
            X.GQ9 r4 = (X.GQ9) r4
            long r0 = r4.A00
            boolean r4 = r5.A08
            if (r4 == 0) goto L_0x007b
            X.5Qr r5 = X.GQ7.A01(r5)
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r5 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode) r5
            if (r5 == 0) goto L_0x007b
            long r7 = X.GQ9.A03(r7, r0)
            long r9 = X.GQ9.A02(r9, r0)
            r4 = 0
            r6.A03 = r4
            r6.A01 = r0
            r6.A00 = r2
            java.lang.Object r4 = r5.DYV(r6, r7, r9)
            if (r4 != r3) goto L_0x0027
            return r3
        L_0x007b:
            r2 = 0
            goto L_0x002b
        L_0x007e:
            X.9Oj r6 = new X.9Oj
            r6.<init>(r11, r12)
            goto L_0x0014
        L_0x0084:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollNode.DYV(X.4D7, long, long):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [X.4D7, X.9JY] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0070, code lost:
        if (r1 == r8) goto L_0x0072;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object DYa(X.AnonymousClass4D7 r10, long r11) {
        /*
            r9 = this;
            r3 = 1
            boolean r0 = X.AnonymousClass9JY.A00(r3, r10)
            if (r0 == 0) goto L_0x0077
            r7 = r10
            X.9JY r7 = (X.AnonymousClass9JY) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0077
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r7.A03
            X.1Hj r8 = X.1Hj.A02
            int r0 = r7.A00
            r6 = 2
            if (r0 == 0) goto L_0x003f
            if (r0 == r3) goto L_0x0035
            if (r0 != r6) goto L_0x007d
            long r3 = r7.A01
            X.0eS.A00(r1)
        L_0x0027:
            X.GQ9 r1 = (X.GQ9) r1
            long r0 = r1.A00
            long r1 = X.GQ9.A03(r3, r0)
            X.GQ9 r0 = new X.GQ9
            r0.<init>(r1)
            return r0
        L_0x0035:
            long r11 = r7.A01
            java.lang.Object r0 = r7.A02
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode) r0
            X.0eS.A00(r1)
            goto L_0x005b
        L_0x003f:
            X.0eS.A00(r1)
            boolean r0 = r9.A08
            if (r0 == 0) goto L_0x0073
            X.5Qr r0 = X.GQ7.A01(r9)
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode) r0
            if (r0 == 0) goto L_0x0073
            r7.A02 = r9
            r7.A01 = r11
            r7.A00 = r3
            java.lang.Object r1 = r0.DYa(r7, r11)
            if (r1 == r8) goto L_0x0072
            r0 = r9
        L_0x005b:
            X.GQ9 r1 = (X.GQ9) r1
            long r3 = r1.A00
        L_0x005f:
            X.5WO r5 = r0.A00
            long r1 = X.GQ9.A02(r11, r3)
            r0 = 0
            r7.A02 = r0
            r7.A01 = r3
            r7.A00 = r6
            java.lang.Object r1 = r5.DYa(r7, r1)
            if (r1 != r8) goto L_0x0027
        L_0x0072:
            return r8
        L_0x0073:
            r3 = 0
            r0 = r9
            goto L_0x005f
        L_0x0077:
            X.9JY r7 = new X.9JY
            r7.<init>(r9, r10, r3)
            goto L_0x0015
        L_0x007d:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollNode.DYa(X.4D7, long):java.lang.Object");
    }

    public static final C262224Cq A00(NestedScrollNode nestedScrollNode) {
        C262224Cq r0;
        NestedScrollNode nestedScrollNode2;
        if ((nestedScrollNode.A08 && (nestedScrollNode2 = (NestedScrollNode) GQ7.A01(nestedScrollNode)) != null && (r0 = A00(nestedScrollNode2)) != null) || (r0 = nestedScrollNode.A01.A02) != null) {
            return r0;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    public final void A0E() {
        NestedScrollDispatcher nestedScrollDispatcher = this.A01;
        nestedScrollDispatcher.A00 = this;
        nestedScrollDispatcher.A01 = new AnonymousClass9L8(this, 23);
        nestedScrollDispatcher.A02 = A05();
    }

    public final void A0F() {
        NestedScrollDispatcher nestedScrollDispatcher = this.A01;
        if (nestedScrollDispatcher.A00 == this) {
            nestedScrollDispatcher.A00 = null;
        }
    }

    public final Object C9j() {
        return "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    public final long DYX(long j, long j2, int i) {
        long j3;
        NestedScrollNode nestedScrollNode;
        int i2 = i;
        long DYX = this.A00.DYX(j, j2, i2);
        if (!this.A08 || (nestedScrollNode = (NestedScrollNode) GQ7.A01(this)) == null) {
            j3 = 0;
        } else {
            j3 = nestedScrollNode.DYX(C289295dM.A07(j, DYX), C289295dM.A06(j2, DYX), i2);
        }
        return C289295dM.A07(DYX, j3);
    }

    public final long DYf(long j, int i) {
        long j2;
        NestedScrollNode nestedScrollNode;
        if (!this.A08 || (nestedScrollNode = (NestedScrollNode) GQ7.A01(this)) == null) {
            j2 = 0;
        } else {
            j2 = nestedScrollNode.DYf(j, i);
        }
        return C289295dM.A07(j2, this.A00.DYf(C289295dM.A06(j, j2), i));
    }

    public NestedScrollNode(AnonymousClass5WO r2, NestedScrollDispatcher nestedScrollDispatcher) {
        this.A00 = r2;
        this.A01 = nestedScrollDispatcher == null ? new NestedScrollDispatcher() : nestedScrollDispatcher;
        this.A02 = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }
}
