package androidx.paging;

import X.00k;
import X.0qQ;
import X.0se;
import X.AnonymousClass7TE;
import X.LRX;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public abstract class SeparatorsKt {
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.LRX r10, X.AnonymousClass4D7 r11, X.0sK r12) {
        /*
            r5 = 1
            boolean r0 = r11 instanceof X.C66126MDe
            if (r0 == 0) goto L_0x00a6
            r4 = r11
            X.MDe r4 = (X.C66126MDe) r4
            int r0 = r4.A09
            if (r0 != r5) goto L_0x00a6
            int r2 = r4.A02
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00a6
            int r2 = r2 - r1
            r4.A02 = r2
        L_0x0017:
            java.lang.Object r1 = r4.A08
            X.1Hj r6 = X.1Hj.A02
            int r0 = r4.A02
            if (r0 == 0) goto L_0x006f
            if (r0 != r5) goto L_0x00c3
            int r0 = r4.A01
            int r9 = r4.A00
            java.lang.Object r7 = r4.A07
            java.lang.Object r3 = r4.A06
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.lang.Object r2 = r4.A05
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r12 = r4.A04
            X.0sK r12 = (X.0sK) r12
            java.lang.Object r10 = r4.A03
            X.LRX r10 = (X.LRX) r10
            X.0eS.A00(r1)
        L_0x003a:
            if (r1 == 0) goto L_0x0042
            r2.add(r1)
            X.JTT.A1S(r3, r9)
        L_0x0042:
            r2.add(r7)
            X.JTT.A1S(r3, r9)
            int r9 = r9 + 1
        L_0x004a:
            if (r9 >= r0) goto L_0x00ad
            java.util.List r8 = r10.A01
            java.lang.Object r7 = r8.get(r9)
            int r1 = r9 + -1
            java.lang.Object r1 = r8.get(r1)
            r4.A03 = r10
            r4.A04 = r12
            r4.A05 = r2
            r4.A06 = r3
            r4.A07 = r7
            r4.A00 = r9
            r4.A01 = r0
            r4.A02 = r5
            java.lang.Object r1 = r12.invoke(r1, r7, r4)
            if (r1 != r6) goto L_0x003a
            return r6
        L_0x006f:
            X.0eS.A00(r1)
            java.util.List r1 = r10.A01
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00c8
            int r0 = r1.size()
            int r0 = r0 + 4
            java.util.ArrayList r2 = X.DbS.A0v(r0)
            java.util.ArrayList r3 = X.DbS.A0v(r0)
            java.lang.Object r0 = X.00k.A0I(r1)
            r2.add(r0)
            java.util.List r0 = r10.A02
            if (r0 == 0) goto L_0x00a4
            java.lang.Object r0 = X.00k.A0I(r0)
            int r0 = X.AnonymousClass7TE.A0M(r0)
        L_0x009b:
            X.JTT.A1S(r3, r0)
            int r0 = r1.size()
            r9 = 1
            goto L_0x004a
        L_0x00a4:
            r0 = 0
            goto L_0x009b
        L_0x00a6:
            X.MDe r4 = new X.MDe
            r4.<init>(r11)
            goto L_0x0017
        L_0x00ad:
            int r1 = r2.size()
            java.util.List r0 = r10.A01
            int r0 = r0.size()
            if (r1 == r0) goto L_0x00c8
            int[] r1 = r10.A03
            int r0 = r10.A00
            X.LRX r10 = new X.LRX
            r10.<init>(r2, r3, r1, r0)
            return r10
        L_0x00c3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00c8:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SeparatorsKt.A00(X.LRX, X.4D7, X.0sK):java.lang.Object");
    }

    public static final void A01(LRX lrx, LRX lrx2, Object obj, List list, int i, int i2) {
        int[] iArr;
        0qQ.A0B(list, 0);
        int[] iArr2 = null;
        if (lrx != null) {
            iArr = lrx.A03;
        } else {
            iArr = null;
        }
        if (lrx2 != null) {
            iArr2 = lrx2.A03;
        }
        if (iArr != null) {
            if (iArr2 != null) {
                int length = iArr.length;
                int length2 = iArr2.length;
                int[] copyOf = Arrays.copyOf(iArr, length + length2);
                System.arraycopy(iArr2, 0, copyOf, length, length2);
                0qQ.A0A(copyOf);
                0qQ.A0B(copyOf, 0);
                LinkedHashSet linkedHashSet = new LinkedHashSet(0se.A0L(r3));
                for (int valueOf : copyOf) {
                    linkedHashSet.add(Integer.valueOf(valueOf));
                }
                iArr = 00k.A0x(00k.A0Z(00k.A0a(linkedHashSet)));
            }
        } else if (iArr2 != null) {
            iArr = iArr2;
        } else {
            throw AnonymousClass7TE.A0w("Separator page expected adjacentPageBefore or adjacentPageAfter, but both were null.");
        }
        if (obj != null) {
            LRX lrx3 = LRX.A04;
            list.add(new LRX(AnonymousClass7TE.A1I(obj), AnonymousClass7TE.A1I(Integer.valueOf(i2)), iArr, i));
        }
    }
}
