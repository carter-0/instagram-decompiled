package X;

import java.util.ListIterator;

/* renamed from: X.U6e  reason: case insensitive filesystem */
public final class C14740U6e<E> extends AnonymousClass6HF<E> implements AnonymousClass6HG<E> {
    public final int A00;
    public final Object[] A01;
    public final Object[] A02;
    public final int A03;

    /* JADX WARNING: type inference failed for: r4v0, types: [X.V30, java.lang.Object] */
    public final AnonymousClass6HG A7j(Object obj, int i) {
        int i2 = i;
        C18664VwM.A01(i, size());
        Object obj2 = obj;
        if (i == size()) {
            return A7O(obj);
        }
        int size = (size() - 1) & -32;
        if (i >= size) {
            return A01(obj, this.A01, i - size);
        }
        ? obj3 = new Object();
        obj3.A00 = null;
        return A01(obj3.A00, A03(obj3, obj2, this.A01, this.A00, i2), 0);
    }

    private final Object[] A03(V30 v30, Object obj, Object[] objArr, int i, int i2) {
        Object[] A1b;
        int i3 = i2;
        int i4 = (i2 >> i) & 31;
        V30 v302 = v30;
        Object obj2 = obj;
        if (i == 0) {
            if (i4 == 0) {
                A1b = new Object[32];
            } else {
                A1b = C13988Tno.A1b(objArr, 32);
            }
            0Yw.A0V(objArr, A1b, i4 + 1, i4, 31);
            v30.A00 = objArr[31];
            A1b[i4] = obj;
        } else {
            A1b = C13988Tno.A1b(objArr, 32);
            int i5 = i - 5;
            Object[] objArr2 = objArr[i4];
            0qQ.A0C(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            A1b[i4] = A03(v302, obj2, objArr2, i5, i3);
            int i6 = i4 + 1;
            while (i6 < 32 && A1b[i6] != null) {
                Object[] objArr3 = objArr[i6];
                0qQ.A0C(objArr3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                A1b[i6] = A03(v302, v30.A00, objArr3, i5, 0);
                i6++;
            }
        }
        return A1b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
        if (r1 == null) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object[] A04(X.V30 r5, java.lang.Object[] r6, int r7, int r8) {
        /*
            r4 = this;
            int r0 = r8 >> r7
            r3 = r0 & 31
            r2 = 0
            r1 = 5
            if (r7 != r1) goto L_0x0010
            r0 = r6[r3]
            r5.A00 = r0
            r1 = r2
        L_0x000d:
            if (r3 != 0) goto L_0x001c
            return r2
        L_0x0010:
            java.lang.Object[] r0 = X.C13990Tnq.A1b(r6, r3)
            int r7 = r7 - r1
            java.lang.Object[] r1 = r4.A04(r5, r0, r7, r8)
            if (r1 != 0) goto L_0x001c
            goto L_0x000d
        L_0x001c:
            r0 = 32
            java.lang.Object[] r2 = X.C13988Tno.A1b(r6, r0)
            r2[r3] = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14740U6e.A04(X.V30, java.lang.Object[], int, int):java.lang.Object[]");
    }

    private final Object[] A05(V30 v30, Object[] objArr, int i, int i2) {
        Object[] A1b;
        int i3 = (i2 >> i) & 31;
        int i4 = 31;
        if (i == 0) {
            if (i3 == 0) {
                A1b = new Object[32];
            } else {
                A1b = C13988Tno.A1b(objArr, 32);
            }
            0Yw.A0V(objArr, A1b, i3, i3 + 1, 32);
            A1b[31] = v30.A00;
            v30.A00 = objArr[i3];
            return A1b;
        }
        if (objArr[31] == null) {
            i4 = ((((size() - 1) & -32) - 1) >> i) & 31;
        }
        Object[] A1b2 = C13988Tno.A1b(objArr, 32);
        int i5 = i - 5;
        int i6 = i3 + 1;
        if (i6 <= i4) {
            while (true) {
                Object obj = A1b2[i4];
                0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                A1b2[i4] = A05(v30, (Object[]) obj, i5, 0);
                if (i4 == i6) {
                    break;
                }
                i4--;
            }
        }
        Object obj2 = A1b2[i3];
        0qQ.A0C(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        A1b2[i3] = A05(v30, (Object[]) obj2, i5, i2);
        return A1b2;
    }

    private final Object[] A06(Object obj, Object[] objArr, int i, int i2) {
        int i3 = (i2 >> i) & 31;
        Object[] A1b = C13988Tno.A1b(objArr, 32);
        if (i == 0) {
            A1b[i3] = obj;
            return A1b;
        }
        A1b[i3] = A06(obj, C13990Tnq.A1b(A1b, i3), i - 5, i2);
        return A1b;
    }

    public final int A08() {
        return this.A03;
    }

    public final /* bridge */ /* synthetic */ C20583WvB AEq() {
        return new C20583WvB(this, this.A01, this.A02, this.A00);
    }

    public final AnonymousClass6HG EDB(0sP r5) {
        C20583WvB wvB = new C20583WvB(this, this.A01, this.A02, this.A00);
        wvB.A0Q(r5);
        return wvB.A0P();
    }

    public C14740U6e(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.A01 = objArr;
        this.A02 = objArr2;
        this.A03 = i;
        this.A00 = i2;
        if (size() > 32) {
            size();
            size();
            return;
        }
        C18086VlG.A00(002.A0O("Trie-based persistent vector should have at least 33 elements, got ", size()));
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.V30, java.lang.Object] */
    private final AnonymousClass6HG A00(Object[] objArr, int i, int i2, int i3) {
        int size = size() - i;
        if (size != 1) {
            Object[] objArr2 = this.A02;
            Object[] A1b = C13988Tno.A1b(objArr2, 32);
            int i4 = size - 1;
            if (i3 < i4) {
                0Yw.A0V(objArr2, A1b, i3, i3 + 1, size);
            }
            A1b[i4] = null;
            return new C14740U6e(objArr, A1b, (i + size) - 1, i2);
        } else if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = C13988Tno.A1b(objArr, 32);
            }
            return new AnonymousClass6HE(objArr);
        } else {
            ? obj = new Object();
            obj.A00 = null;
            Object[] A04 = A04(obj, objArr, i2, i - 1);
            0qQ.A0A(A04);
            Object obj2 = obj.A00;
            0qQ.A0C(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            Object[] objArr3 = (Object[]) obj2;
            if (A04[1] == null) {
                Object obj3 = A04[0];
                0qQ.A0C(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                A04 = (Object[]) obj3;
                i2 -= 5;
            }
            return new C14740U6e(A04, objArr3, i, i2);
        }
    }

    private final C14740U6e A01(Object obj, Object[] objArr, int i) {
        int size = size() - ((size() - 1) & -32);
        Object[] objArr2 = this.A02;
        Object[] A1b = C13988Tno.A1b(objArr2, 32);
        if (size < 32) {
            0Yw.A0V(objArr2, A1b, i + 1, i, size);
            A1b[i] = obj;
            return new C14740U6e(objArr, A1b, size() + 1, this.A00);
        }
        Object obj2 = objArr2[31];
        System.arraycopy(objArr2, i, A1b, i + 1, (size - 1) - i);
        A1b[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return A02(objArr, A1b, objArr3);
    }

    private final C14740U6e A02(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        Object[] A07;
        int size = size() >> 5;
        int i = this.A00;
        if (size > (1 << i)) {
            Object[] objArr4 = new Object[32];
            objArr4[0] = objArr;
            i += 5;
            A07 = A07(objArr4, objArr2, i);
        } else {
            A07 = A07(objArr, objArr2, i);
        }
        return new C14740U6e(A07, objArr3, size() + 1, i);
    }

    private final Object[] A07(Object[] objArr, Object[] objArr2, int i) {
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
        objArr3[size] = A07((Object[]) objArr3[size], objArr2, i - 5);
        return objArr3;
    }

    public final AnonymousClass6HG A7O(Object obj) {
        int size = size() - ((size() - 1) & -32);
        if (size < 32) {
            Object[] A1b = C13988Tno.A1b(this.A02, 32);
            A1b[size] = obj;
            return new C14740U6e(this.A01, A1b, size() + 1, this.A00);
        }
        Object[] objArr = new Object[32];
        objArr[0] = obj;
        return A02(this.A01, this.A02, objArr);
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.V30, java.lang.Object] */
    public final AnonymousClass6HG EDL(int i) {
        C18664VwM.A00(i, size());
        int size = (size() - 1) & -32;
        Object[] objArr = this.A01;
        int i2 = this.A00;
        if (i >= size) {
            return A00(objArr, size, i2, i - size);
        }
        Object obj = this.A02[0];
        ? obj2 = new Object();
        obj2.A00 = obj;
        return A00(A05(obj2, objArr, i2, i), size, i2, 0);
    }

    public final AnonymousClass6HG ENM(Object obj, int i) {
        C18664VwM.A00(i, size());
        if (((size() - 1) & -32) <= i) {
            Object[] A1b = C13988Tno.A1b(this.A02, 32);
            A1b[i & 31] = obj;
            return new C14740U6e(this.A01, A1b, size(), this.A00);
        }
        Object[] objArr = this.A01;
        int i2 = this.A00;
        return new C14740U6e(A06(obj, objArr, i2, i), this.A02, size(), i2);
    }

    public final Object get(int i) {
        Object[] objArr;
        C18664VwM.A00(i, size());
        if (((size() - 1) & -32) <= i) {
            objArr = this.A02;
        } else {
            objArr = this.A01;
            for (int i2 = this.A00; i2 > 0; i2 -= 5) {
                objArr = C13990Tnq.A1b(objArr, (i >> i2) & 31);
            }
        }
        return objArr[i & 31];
    }

    public final ListIterator listIterator(int i) {
        C18664VwM.A01(i, size());
        return new C14737U6b(this.A01, this.A02, i, size(), (this.A00 / 5) + 1);
    }
}
