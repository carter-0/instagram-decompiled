package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.KZu  reason: case insensitive filesystem */
public final class C62090KZu extends 1Pk {
    public static final C62090KZu A01 = new C62090KZu(2);
    public final int A00;

    public C62090KZu(int i) {
        this.A00 = 2;
    }

    public static final void A01(List list, int... iArr) {
        for (int i : iArr) {
            if (i < 0 || i > list.size()) {
                Integer[] numArr = new Integer[r4];
                for (int i2 = 0; i2 < r4; i2++) {
                    G9w.A1Z(numArr, iArr[i2], i2);
                }
                String arrays = Arrays.toString(numArr);
                0qQ.A07(arrays);
                throw AnonymousClass7TE.A0w(002.A07(list.size(), "positions are not correct: ", arrays, " for list of size: "));
            }
        }
    }

    public final int A03(1Pi r2, List list, int i) {
        0qQ.A0B(list, 0);
        A01(list, i);
        ArrayList A1D = AnonymousClass7TE.A1D(list);
        A1D.add(i, r2);
        return A00(r2, A1D, i);
    }

    public final int A04(1Pi r3, List list, int i, int i2) {
        0qQ.A0B(list, 0);
        A01(list, i, i2);
        ArrayList A1D = AnonymousClass7TE.A1D(list);
        Object remove = A1D.remove(i);
        if (remove == r3) {
            A1D.add(i2, remove);
            return A00(r3, A1D, i2);
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("State ");
        A1A.append(list);
        A1A.append(" is out of sync or wrong item at position ");
        A1A.append(i);
        A1A.append(" and type ");
        A1A.append(r3);
        throw AnonymousClass7TE.A0w(C51967G9n.A0r(A1A, '.'));
    }

    public final int A05(List list) {
        return 0;
    }

    public final boolean A06(1Pi r2, Integer num, List list, int i) {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        if (r4 > r7.A00) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if (r3 > r7.A00) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int A00(X.1Pi r8, java.util.List r9, int r10) {
        /*
            r7 = this;
            int[] r0 = new int[]{r10}
            A01(r9, r0)
            r5 = r10
            r4 = 0
            r3 = 0
            r6 = 0
        L_0x000b:
            int r10 = r10 + -1
            if (r10 < 0) goto L_0x0014
            int r0 = r7.A00
            r2 = 1
            if (r4 <= r0) goto L_0x0015
        L_0x0014:
            r2 = 0
        L_0x0015:
            int r5 = r5 + 1
            int r0 = r9.size()
            if (r5 >= r0) goto L_0x0022
            int r1 = r7.A00
            r0 = 1
            if (r3 <= r1) goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            r2 = r2 | r0
            if (r2 == 0) goto L_0x004f
            if (r10 < 0) goto L_0x0030
            java.lang.Object r0 = r9.get(r10)
            if (r0 == r8) goto L_0x0047
            int r4 = r4 + 1
        L_0x0030:
            int r0 = r9.size()
            if (r5 >= r0) goto L_0x000b
            java.lang.Object r0 = r9.get(r5)
            if (r0 == r8) goto L_0x003f
            int r3 = r3 + 1
            goto L_0x000b
        L_0x003f:
            int r0 = r7.A00
            if (r3 != r0) goto L_0x000b
            int r6 = r6 + 1
            r3 = 0
            goto L_0x000b
        L_0x0047:
            int r0 = r7.A00
            if (r4 != r0) goto L_0x0030
            int r6 = r6 + 1
            r4 = 0
            goto L_0x0030
        L_0x004f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62090KZu.A00(X.1Pi, java.util.List, int):int");
    }

    public C62090KZu() {
        this(2);
    }
}
