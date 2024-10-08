package X;

import java.util.ListIterator;

/* renamed from: X.TqN  reason: case insensitive filesystem */
public final class C14128TqN<E> extends AnonymousClass62N<E> implements AnonymousClass62O<E> {
    public final int A00;
    public final Object[] A01;
    public final Object[] A02;
    public final int A03;

    public final int A08() {
        return this.A03;
    }

    public C14128TqN(Object[] objArr, Object[] objArr2, int i, int i2) {
        AnonymousClass7TG.A1O(objArr, objArr2);
        this.A01 = objArr;
        this.A02 = objArr2;
        this.A03 = i;
        this.A00 = i2;
        if (size() > 32) {
            size();
            size();
            return;
        }
        throw DbW.A0a("Trie-based persistent vector should have at least 33 elements, got ", size());
    }

    private final Object[] A00(Object[] objArr, Object[] objArr2, int i) {
        Object[] objArr3;
        int size = ((size() - 1) >> i) & 31;
        if (objArr != null) {
            objArr3 = C13988Tno.A1b(objArr, 32);
        } else {
            objArr3 = new Object[32];
        }
        if (i == 5) {
            objArr3[size] = objArr2;
            return objArr3;
        }
        objArr3[size] = A00((Object[]) objArr3[size], objArr2, i - 5);
        return objArr3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass62O A7T(java.lang.Object r9) {
        /*
            r8 = this;
            int r1 = r8.size()
            int r0 = r8.size()
            int r0 = r0 + -1
            r0 = r0 & -32
            int r1 = r1 - r0
            r7 = 32
            if (r1 >= r7) goto L_0x0029
            java.lang.Object[] r0 = r8.A02
            java.lang.Object[] r4 = X.C13988Tno.A1b(r0, r7)
            r4[r1] = r9
            java.lang.Object[] r3 = r8.A01
            int r0 = r8.size()
            int r1 = r0 + 1
            int r0 = r8.A00
            X.TqN r2 = new X.TqN
            r2.<init>(r3, r4, r1, r0)
            return r2
        L_0x0029:
            java.lang.Object[] r4 = new java.lang.Object[r7]
            r6 = 0
            r4[r6] = r9
            java.lang.Object[] r5 = r8.A01
            java.lang.Object[] r2 = r8.A02
            int r0 = r8.size()
            int r1 = r0 >> 5
            int r3 = r8.A00
            r0 = 1
            int r0 = r0 << r3
            if (r1 <= r0) goto L_0x0054
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r6] = r5
            int r3 = r3 + 5
            java.lang.Object[] r1 = r8.A00(r0, r2, r3)
        L_0x0048:
            int r0 = r8.size()
            int r0 = r0 + 1
            X.TqN r2 = new X.TqN
            r2.<init>(r1, r4, r0, r3)
            return r2
        L_0x0054:
            java.lang.Object[] r1 = r8.A00(r5, r2, r3)
            goto L_0x0048
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14128TqN.A7T(java.lang.Object):X.62O");
    }

    public final Object get(int i) {
        Object[] objArr;
        AnonymousClass6BV.A00(i, size());
        if (((size() - 1) & -32) <= i) {
            objArr = this.A02;
        } else {
            objArr = this.A01;
            for (int i2 = this.A00; i2 > 0; i2 -= 5) {
                Object obj = objArr[(i >> i2) & 31];
                0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i & 31];
    }

    public final ListIterator listIterator(int i) {
        AnonymousClass6BV.A01(i, size());
        return new C14131TqQ(this.A01, this.A02, i, size(), (this.A00 / 5) + 1);
    }
}
