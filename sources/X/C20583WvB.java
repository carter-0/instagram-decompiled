package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.WvB  reason: case insensitive filesystem */
public final class C20583WvB extends 04J implements List, Collection, AnonymousClass0Yd, AnonymousClass07u {
    public int A00;
    public int A01;
    public C286865Yc A02 = new Object();
    public Object[] A03;
    public Object[] A04;
    public AnonymousClass6HG A05;
    public Object[] A06;
    public Object[] A07;

    private final int A01(V30 v30, List list, List list2, 0sP r9, Object[] objArr, int i, int i2) {
        if (objArr.length == 33 && objArr[32] == this.A02) {
            list.add(objArr);
        }
        Object obj = v30.A00;
        0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj;
        Object[] objArr3 = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!C51971G9r.A1a(obj2, r9)) {
                if (i2 == 32) {
                    if (AnonymousClass7TE.A1b(list)) {
                        objArr3 = (Object[]) list.remove(C51966G9m.A06(list));
                    } else {
                        objArr3 = A0B();
                    }
                    i2 = 0;
                }
                objArr3[i2] = obj2;
                i2++;
            }
        }
        v30.A00 = objArr3;
        if (objArr2 != objArr3) {
            list2.add(objArr2);
        }
        return i2;
    }

    private final void A06(Collection collection, Object[] objArr, Object[] objArr2, Object[][] objArr3, int i, int i2, int i3) {
        Object[] A0B;
        if (i3 >= 1) {
            Object[] A0H = A0H(objArr);
            objArr3[0] = A0H;
            int i4 = i & 31;
            int size = ((i + collection.size()) - 1) & 31;
            int i5 = (i2 - i4) + size;
            if (i5 < 32) {
                0Yw.A0V(A0H, objArr2, size + 1, i4, i2);
            } else {
                int i6 = (i5 - 32) + 1;
                if (i3 == 1) {
                    A0B = A0H;
                } else {
                    A0B = A0B();
                    i3--;
                    objArr3[i3] = A0B;
                }
                int i7 = i2 - i6;
                0Yw.A0V(A0H, objArr2, 0, i7, i2);
                0Yw.A0V(A0H, A0B, size + 1, i4, i7);
                objArr2 = A0B;
            }
            Iterator it = collection.iterator();
            A08(it, A0H, i4);
            for (int i8 = 1; i8 < i3; i8++) {
                Object[] A0B2 = A0B();
                A08(it, A0B2, 0);
                objArr3[i8] = A0B2;
            }
            A08(it, objArr2, 0);
            return;
        }
        C18086VlG.A00("requires at least one nullBuffer");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.V30, java.lang.Object] */
    private final void A09(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.A03 = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.A04 = objArr;
            this.A01 = i;
        } else {
            ? obj = new Object();
            obj.A00 = null;
            0qQ.A0A(objArr);
            Object[] A0E = A0E(obj, objArr, i2, i);
            0qQ.A0A(A0E);
            Object obj2 = obj.A00;
            0qQ.A0C(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            this.A04 = (Object[]) obj2;
            this.A01 = i;
            if (A0E[1] == null) {
                this.A03 = (Object[]) A0E[0];
                i2 -= 5;
            } else {
                this.A03 = A0E;
            }
        }
        this.A00 = i2;
    }

    private final Object[] A0I(Object[] objArr, int i) {
        if (objArr.length == 33 && objArr[32] == this.A02) {
            System.arraycopy(objArr, 0, objArr, i, 32 - i);
            return objArr;
        }
        Object[] A0B = A0B();
        0Yw.A0V(objArr, A0B, i, 0, 32 - i);
        return A0B;
    }

    private final Object[] A0J(Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            C18086VlG.A00("shift should be positive");
            throw AnonymousClass00P.createAndThrow();
        } else if (i2 == 0) {
            return objArr;
        } else {
            int i3 = (i >> i2) & 31;
            Object A0J = A0J(C13990Tnq.A1b(objArr, i3), i, i2 - 5);
            if (i3 < 31) {
                int i4 = i3 + 1;
                if (objArr[i4] != null) {
                    if (objArr.length == 33 && objArr[32] == this.A02) {
                        Arrays.fill(objArr, i4, 32, (Object) null);
                    }
                    Object[] A0B = A0B();
                    0Yw.A0V(objArr, A0B, 0, 0, i4);
                    objArr = A0B;
                }
            }
            if (A0J == objArr[i3]) {
                return objArr;
            }
            Object[] A0H = A0H(objArr);
            A0H[i3] = A0J;
            return A0H;
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.V30, java.lang.Object] */
    public final Object set(int i, Object obj) {
        int i2 = i;
        C18664VwM.A00(i, size());
        Object obj2 = obj;
        if (A00() <= i) {
            Object[] A0H = A0H(this.A04);
            if (A0H != this.A04) {
                this.modCount++;
            }
            int i3 = i & 31;
            Object obj3 = A0H[i3];
            A0H[i3] = obj;
            this.A04 = A0H;
            return obj3;
        }
        ? obj4 = new Object();
        obj4.A00 = null;
        Object[] objArr = this.A03;
        0qQ.A0A(objArr);
        this.A03 = A0D(obj4, obj2, objArr, this.A00, i2);
        return obj4.A00;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [java.util.AbstractCollection, X.WvB] */
    private final int A02(V30 v30, 0sP r9, int i) {
        Object[] objArr = this.A04;
        Object[] objArr2 = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (C51971G9r.A1a(obj, r9)) {
                if (!z) {
                    objArr2 = A0H(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArr2[i2] = obj;
                i2++;
            }
        }
        v30.A00 = objArr2;
        if (i2 == i) {
            return i;
        }
        0qQ.A0C(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        0Yw.A0U(objArr2, i2, i);
        this.A04 = objArr2;
        this.A01 = size() - (i - i2);
        return i2;
    }

    private final C20389WqV A03(int i) {
        Object[] objArr = this.A03;
        if (objArr != null) {
            int A002 = A00() >> 5;
            C18664VwM.A01(i, A002);
            int i2 = this.A00;
            if (i2 == 0) {
                return new U6a(objArr, i);
            }
            return new C14738U6c(objArr, i, A002, i2 / 5);
        }
        throw new IllegalStateException("Invalid root");
    }

    private final void A07(Collection collection, Object[] objArr, Object[][] objArr2, int i, int i2, int i3) {
        Object[][] objArr3;
        Object[] objArr4;
        Object[] objArr5 = objArr;
        if (this.A03 != null) {
            int i4 = i;
            int i5 = i >> 5;
            int i6 = i3;
            int i7 = i6;
            Object[] objArr6 = objArr5;
            C20389WqV A032 = A03(A00() >> 5);
            while (true) {
                int previousIndex = A032.previousIndex();
                objArr3 = objArr2;
                objArr4 = (Object[]) A032.previous();
                if (previousIndex == i5) {
                    break;
                }
                0Yw.A0V(objArr4, objArr6, 0, 32 - i2, 32);
                objArr6 = A0I(objArr4, i2);
                i7--;
                objArr2[i7] = objArr6;
            }
            int A002 = i3 - (((A00() >> 5) - 1) - i5);
            if (A002 < i6) {
                objArr5 = objArr2[A002];
                0qQ.A0A(objArr5);
            }
            A06(collection, objArr4, objArr5, objArr3, i4, 32, A002);
            return;
        }
        throw new IllegalStateException("root is null");
    }

    public static final void A08(Iterator it, Object[] objArr, int i) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    private final Object[] A0B() {
        Object[] objArr = new Object[33];
        objArr[32] = this.A02;
        return objArr;
    }

    private final Object[] A0C(V30 v30, Object obj, Object[] objArr, int i, int i2) {
        Object obj2;
        int i3 = (i2 >> i) & 31;
        if (i == 0) {
            v30.A00 = objArr[31];
            Object[] A0H = A0H(objArr);
            0Yw.A0V(objArr, A0H, i3 + 1, i3, 31);
            A0H[i3] = obj;
            return A0H;
        }
        Object[] A0H2 = A0H(objArr);
        int i4 = i - 5;
        Object obj3 = A0H2[i3];
        0qQ.A0C(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj3;
        while (true) {
            A0H2[i3] = A0C(v30, obj, objArr2, i4, i2);
            i3++;
            if (i3 >= 32 || (obj2 = A0H2[i3]) == null) {
                return A0H2;
            }
            objArr2 = (Object[]) obj2;
            i2 = 0;
            obj = v30.A00;
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.WvB, java.util.AbstractList] */
    private final Object[] A0D(V30 v30, Object obj, Object[] objArr, int i, int i2) {
        int i3 = (i2 >> i) & 31;
        Object[] A0H = A0H(objArr);
        if (i == 0) {
            if (A0H != objArr) {
                this.modCount++;
            }
            v30.A00 = A0H[i3];
            A0H[i3] = obj;
            return A0H;
        }
        Object obj2 = A0H[i3];
        0qQ.A0C(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        A0H[i3] = A0D(v30, obj, (Object[]) obj2, i - 5, i2);
        return A0H;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (r0 == null) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object[] A0E(X.V30 r5, java.lang.Object[] r6, int r7, int r8) {
        /*
            r4 = this;
            int r0 = r8 + -1
            int r0 = r0 >> r7
            r3 = r0 & 31
            r2 = 0
            r1 = 5
            if (r7 != r1) goto L_0x0011
            r0 = r6[r3]
            r5.A00 = r0
            r0 = r2
        L_0x000e:
            if (r3 != 0) goto L_0x001d
            return r2
        L_0x0011:
            java.lang.Object[] r0 = X.C13990Tnq.A1b(r6, r3)
            int r7 = r7 - r1
            java.lang.Object[] r0 = r4.A0E(r5, r0, r7, r8)
            if (r0 != 0) goto L_0x001d
            goto L_0x000e
        L_0x001d:
            java.lang.Object[] r2 = r4.A0H(r6)
            r2[r3] = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20583WvB.A0E(X.V30, java.lang.Object[], int, int):java.lang.Object[]");
    }

    private final Object[] A0F(V30 v30, Object[] objArr, int i, int i2) {
        int i3 = (i2 >> i) & 31;
        int i4 = 31;
        if (i == 0) {
            Object obj = objArr[i3];
            Object[] A0H = A0H(objArr);
            0Yw.A0V(objArr, A0H, i3, i3 + 1, 32);
            A0H[31] = v30.A00;
            v30.A00 = obj;
            return A0H;
        }
        if (objArr[31] == null) {
            i4 = ((A00() - 1) >> i) & 31;
        }
        Object[] A0H2 = A0H(objArr);
        int i5 = i - 5;
        int i6 = i3 + 1;
        if (i6 <= i4) {
            while (true) {
                Object obj2 = A0H2[i4];
                0qQ.A0C(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                A0H2[i4] = A0F(v30, (Object[]) obj2, i5, 0);
                if (i4 == i6) {
                    break;
                }
                i4--;
            }
        }
        Object obj3 = A0H2[i3];
        0qQ.A0C(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        A0H2[i3] = A0F(v30, (Object[]) obj3, i5, i2);
        return A0H2;
    }

    private final Object[] A0H(Object[] objArr) {
        if (objArr == null) {
            return A0B();
        }
        int length = objArr.length;
        if (length == 33 && objArr[32] == this.A02) {
            return objArr;
        }
        Object[] A0B = A0B();
        if (length > 32) {
            length = 32;
        }
        0Yw.A0V(objArr, A0B, 0, 0, length);
        return A0B;
    }

    public final int A0M() {
        return this.A01;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.WvB, java.util.AbstractList] */
    public final int A0O() {
        return this.modCount;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.5Yc, java.lang.Object] */
    public final AnonymousClass6HG A0P() {
        AnonymousClass6HG r2;
        AnonymousClass6HG r22;
        Object[] objArr = this.A03;
        if (objArr == this.A06 && this.A04 == this.A07) {
            r22 = this.A05;
        } else {
            this.A02 = new Object();
            this.A06 = objArr;
            Object[] objArr2 = this.A04;
            this.A07 = objArr2;
            if (objArr != null) {
                r2 = new C14740U6e(objArr, objArr2, size(), this.A00);
            } else if (objArr2.length == 0) {
                r22 = AnonymousClass6HE.A01;
            } else {
                r2 = new AnonymousClass6HE(C13988Tno.A1b(objArr2, size()));
            }
            r22 = r2;
        }
        this.A05 = r22;
        return r22;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.Object[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r11v0, types: [java.util.AbstractCollection, X.WvB, java.util.AbstractList] */
    /* JADX WARNING: type inference failed for: r12v0, types: [X.V30, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0022, code lost:
        if (r3 != false) goto L_0x0024;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0Q(X.0sP r20) {
        /*
            r19 = this;
            r11 = r19
            int r0 = r11.size()
            r1 = 32
            int r5 = X.C13988Tno.A05(r0, r0)
            r0 = 0
            X.V30 r12 = new X.V30
            r12.<init>()
            r12.A00 = r0
            java.lang.Object[] r0 = r11.A03
            r3 = 0
            r15 = r20
            if (r0 != 0) goto L_0x002b
            int r4 = r11.A02(r12, r15, r5)
        L_0x001f:
            if (r4 == r5) goto L_0x0022
            r3 = 1
        L_0x0022:
            if (r3 == 0) goto L_0x002a
        L_0x0024:
            int r0 = r11.modCount
            int r0 = r0 + 1
            r11.modCount = r0
        L_0x002a:
            return r3
        L_0x002b:
            X.WqV r10 = r11.A03(r3)
        L_0x002f:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00e9
            java.lang.Object r9 = r10.next()
            java.lang.Object[] r9 = (java.lang.Object[]) r9
            r8 = 0
            r7 = r9
            r2 = 32
            r6 = 0
        L_0x0040:
            r4 = r9[r8]
            boolean r0 = X.C51971G9r.A1a(r4, r15)
            if (r0 == 0) goto L_0x007f
            if (r6 != 0) goto L_0x0050
            java.lang.Object[] r7 = r11.A0H(r9)
            r6 = 1
            r2 = r8
        L_0x0050:
            int r8 = r8 + 1
            if (r8 < r1) goto L_0x0040
            r12.A00 = r7
            if (r2 == r1) goto L_0x002f
            int r0 = r10.previousIndex()
            int r4 = r0 << 5
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
        L_0x0068:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0087
            java.lang.Object r0 = r10.next()
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r18 = r2
            r17 = r1
            r16 = r0
            int r2 = r11.A01(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0068
        L_0x007f:
            if (r6 == 0) goto L_0x0050
            int r0 = r2 + 1
            r7[r2] = r4
            r2 = r0
            goto L_0x0050
        L_0x0087:
            java.lang.Object[] r0 = r11.A04
            r16 = r0
            r17 = r5
            r18 = r2
            int r6 = r11.A01(r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r7 = r12.A00
            java.lang.String r8 = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"
            X.0qQ.A0C(r7, r8)
            java.lang.Object[] r7 = (java.lang.Object[]) r7
            X.0Yw.A0U(r7, r6, r1)
            boolean r0 = r14.isEmpty()
            java.lang.Object[] r5 = r11.A03
            if (r0 == 0) goto L_0x00de
            X.0qQ.A0A(r5)
        L_0x00aa:
            int r0 = r14.size()
            int r0 = r0 << 5
            int r4 = r4 + r0
            r1 = r4 & 31
            r0 = 1
            if (r1 != 0) goto L_0x00fc
            if (r4 != 0) goto L_0x00c5
            r11.A00 = r3
            r0 = 0
        L_0x00bb:
            r11.A03 = r0
            r11.A04 = r7
            int r4 = r4 + r6
            r11.A01 = r4
            r3 = 1
            goto L_0x0024
        L_0x00c5:
            int r2 = r4 - r0
        L_0x00c7:
            int r1 = r11.A00
            int r0 = r2 >> r1
            if (r0 != 0) goto L_0x00d9
            int r0 = r1 + -5
            r11.A00 = r0
            r5 = r5[r3]
            X.0qQ.A0C(r5, r8)
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            goto L_0x00c7
        L_0x00d9:
            java.lang.Object[] r0 = r11.A0J(r5, r2, r1)
            goto L_0x00bb
        L_0x00de:
            int r1 = r11.A00
            java.util.Iterator r0 = r14.iterator()
            java.lang.Object[] r5 = r11.A0G(r0, r5, r4, r1)
            goto L_0x00aa
        L_0x00e9:
            int r4 = r11.A02(r12, r15, r5)
            if (r4 != 0) goto L_0x001f
            java.lang.Object[] r2 = r11.A03
            int r1 = r11.size()
            int r0 = r11.A00
            r11.A09(r2, r1, r0)
            goto L_0x001f
        L_0x00fc:
            java.lang.String r0 = "invalid size"
            X.C18086VlG.A00(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20583WvB.A0Q(X.0sP):boolean");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.util.AbstractCollection, X.WvB, java.util.AbstractList] */
    public final boolean add(Object obj) {
        this.modCount++;
        int size = size();
        int A052 = C13988Tno.A05(size, size);
        if (A052 < 32) {
            Object[] A0H = A0H(this.A04);
            A0H[A052] = obj;
            this.A04 = A0H;
            this.A01 = size() + 1;
            return true;
        }
        Object[] A1b = C13991Tnr.A1b(obj);
        A1b[32] = this.A02;
        A0A(this.A03, this.A04, A1b);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        return A0Q(new J6M(collection, 22));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.5Yc, java.lang.Object] */
    public C20583WvB(AnonymousClass6HG r2, Object[] objArr, Object[] objArr2, int i) {
        this.A05 = r2;
        this.A06 = objArr;
        this.A07 = objArr2;
        this.A00 = i;
        this.A03 = objArr;
        this.A04 = objArr2;
        this.A01 = r2.size();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.AbstractCollection, X.WvB] */
    private final int A00() {
        if (size() <= 32) {
            return 0;
        }
        return Pxe.A0A(this) & -32;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.util.AbstractCollection, X.WvB] */
    private final Object A04(Object[] objArr, int i, int i2, int i3) {
        int size = size() - i;
        if (size == 1) {
            Object obj = this.A04[0];
            A09(objArr, i, i2);
            return obj;
        }
        Object[] objArr2 = this.A04;
        Object obj2 = objArr2[i3];
        Object[] A0H = A0H(objArr2);
        0Yw.A0V(objArr2, A0H, i3, i3 + 1, size);
        A0H[size - 1] = null;
        this.A03 = objArr;
        this.A04 = A0H;
        this.A01 = (i + size) - 1;
        this.A00 = i2;
        return obj2;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.util.AbstractCollection, X.WvB] */
    private final void A05(Object obj, Object[] objArr, int i) {
        int size = size();
        int A052 = C13988Tno.A05(size, size);
        Object[] A0H = A0H(this.A04);
        if (A052 < 32) {
            0Yw.A0V(this.A04, A0H, i + 1, i, A052);
            A0H[i] = obj;
            this.A03 = objArr;
            this.A04 = A0H;
            this.A01 = size() + 1;
            return;
        }
        Object[] objArr2 = this.A04;
        Object obj2 = objArr2[31];
        0Yw.A0V(objArr2, A0H, i + 1, i, 31);
        A0H[i] = obj;
        Object[] A1b = C13991Tnr.A1b(obj2);
        A1b[32] = this.A02;
        A0A(objArr, A0H, A1b);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.util.AbstractCollection, X.WvB] */
    private final void A0A(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i = this.A00;
        if (size > (1 << i)) {
            Object[] A1b = C13991Tnr.A1b(objArr);
            A1b[32] = this.A02;
            this.A03 = A0K(A1b, objArr2, i + 5);
            this.A04 = objArr3;
            this.A00 += 5;
        } else {
            if (objArr == null) {
                this.A03 = objArr2;
            } else {
                this.A03 = A0K(objArr, objArr2, i);
            }
            this.A04 = objArr3;
        }
        this.A01 = size() + 1;
    }

    private final Object[] A0G(Iterator it, Object[] objArr, int i, int i2) {
        String str;
        if (!it.hasNext()) {
            str = "invalid buffersIterator";
        } else if (i2 < 0) {
            str = "negative shift";
        } else if (i2 == 0) {
            return (Object[]) it.next();
        } else {
            Object[] A0H = A0H(objArr);
            int i3 = (i >> i2) & 31;
            int i4 = i2 - 5;
            Object[] A0G = A0G(it, (Object[]) A0H[i3], i, i4);
            while (true) {
                A0H[i3] = A0G;
                i3++;
                if (i3 >= 32 || !it.hasNext()) {
                    return A0H;
                }
                A0G = A0G(it, (Object[]) A0H[i3], 0, i4);
            }
        }
        C18086VlG.A00(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object[] A0K(java.lang.Object[] r5, java.lang.Object[] r6, int r7) {
        /*
            r4 = this;
            int r0 = X.Pxe.A0A(r4)
            int r0 = r0 >> r7
            r3 = r0 & 31
            java.lang.Object[] r2 = r4.A0H(r5)
            r1 = 5
            if (r7 == r1) goto L_0x0017
            r0 = r2[r3]
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            int r7 = r7 - r1
            java.lang.Object[] r6 = r4.A0K(r0, r6, r7)
        L_0x0017:
            r2[r3] = r6
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20583WvB.A0K(java.lang.Object[], java.lang.Object[], int):java.lang.Object[]");
    }

    private final Object[] A0L(Object[] objArr, Object[][] objArr2, int i) {
        Object[] objArr3;
        0sC A002 = 0pe.A00(objArr2);
        int i2 = i >> 5;
        int i3 = this.A00;
        if (i2 < (1 << i3)) {
            objArr3 = A0G(A002, objArr, i, i3);
        } else {
            objArr3 = A0H(objArr);
        }
        while (A002.hasNext()) {
            int i4 = this.A00 + 5;
            this.A00 = i4;
            objArr3 = C13991Tnr.A1b(objArr3);
            objArr3[32] = this.A02;
            A0G(A002, objArr3, 1 << i4, i4);
        }
        return objArr3;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.V30, java.lang.Object] */
    public final Object A0N(int i) {
        C18664VwM.A00(i, size());
        this.modCount++;
        int A002 = A00();
        if (i >= A002) {
            return A04(this.A03, A002, this.A00, i - A002);
        }
        Object obj = this.A04[0];
        ? obj2 = new Object();
        obj2.A00 = obj;
        Object[] objArr = this.A03;
        0qQ.A0A(objArr);
        A04(A0F(obj2, objArr, this.A00, i), A002, this.A00, 0);
        return obj2.A00;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [java.util.AbstractCollection, X.WvB, java.util.AbstractList] */
    public final boolean addAll(Collection collection) {
        Object[] A0B;
        if (collection.isEmpty()) {
            return false;
        }
        this.modCount++;
        int size = size();
        int A052 = C13988Tno.A05(size, size);
        Iterator it = collection.iterator();
        if (32 - A052 >= collection.size()) {
            A0B = A0H(this.A04);
            A08(it, A0B, A052);
        } else {
            int size2 = ((collection.size() + A052) - 1) / 32;
            Object[][] objArr = new Object[size2][];
            Object[] A0H = A0H(this.A04);
            A08(it, A0H, A052);
            objArr[0] = A0H;
            for (int i = 1; i < size2; i++) {
                Object[] A0B2 = A0B();
                A08(it, A0B2, 0);
                objArr[i] = A0B2;
            }
            this.A03 = A0L(this.A03, objArr, A00());
            A0B = A0B();
            A08(it, A0B, 0);
        }
        this.A04 = A0B;
        this.A01 = size() + collection.size();
        return true;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.AbstractCollection, X.WvB] */
    public final Object get(int i) {
        Object[] objArr;
        C18664VwM.A00(i, size());
        if (A00() <= i) {
            objArr = this.A04;
        } else {
            objArr = this.A03;
            0qQ.A0A(objArr);
            for (int i2 = this.A00; i2 > 0; i2 -= 5) {
                objArr = C13990Tnq.A1b(objArr, (i >> i2) & 31);
            }
        }
        return objArr[i & 31];
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.WvB, java.util.AbstractList] */
    public final Iterator iterator() {
        return listIterator();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.AbstractCollection, X.WvB] */
    public final ListIterator listIterator(int i) {
        C18664VwM.A01(i, size());
        return new C14739U6d(this, i);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.V30, java.lang.Object] */
    public final void add(int i, Object obj) {
        int i2 = i;
        C18664VwM.A01(i, size());
        Object obj2 = obj;
        if (i == size()) {
            add(obj);
            return;
        }
        this.modCount++;
        int A002 = A00();
        if (i >= A002) {
            A05(obj, this.A03, i - A002);
            return;
        }
        ? obj3 = new Object();
        obj3.A00 = null;
        Object[] objArr = this.A03;
        0qQ.A0A(objArr);
        A05(obj3.A00, A0C(obj3, obj2, objArr, this.A00, i2), 0);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.util.AbstractCollection, X.WvB, java.util.AbstractList] */
    public final boolean addAll(int i, Collection collection) {
        Object[] A0B;
        int i2 = i;
        C18664VwM.A01(i2, size());
        Collection collection2 = collection;
        if (i2 == size()) {
            return addAll(collection2);
        }
        if (collection2.isEmpty()) {
            return false;
        }
        this.modCount++;
        int i3 = (i >> 5) << 5;
        int size = (((size() - i3) + collection2.size()) - 1) / 32;
        if (size == 0) {
            A00();
            int i4 = i & 31;
            Object[] objArr = this.A04;
            A0B = A0H(objArr);
            int size2 = (((i + collection2.size()) - 1) & 31) + 1;
            int size3 = size();
            0Yw.A0V(objArr, A0B, size2, i4, C13988Tno.A05(size3, size3));
            A08(collection2.iterator(), A0B, i4);
        } else {
            Object[][] objArr2 = new Object[size][];
            int size4 = size();
            int A052 = C13988Tno.A05(size4, size4);
            int size5 = size() + collection2.size();
            int A053 = C13988Tno.A05(size5, size5);
            if (i2 >= A00()) {
                A0B = A0B();
                A06(collection2, this.A04, A0B, objArr2, i2, A052, size);
            } else if (A053 > A052) {
                int i5 = A053 - A052;
                A0B = A0I(this.A04, i5);
                A07(collection2, A0B, objArr2, i2, i5, size);
            } else {
                Object[] objArr3 = this.A04;
                A0B = A0B();
                int i6 = A052 - A053;
                0Yw.A0V(objArr3, A0B, 0, i6, A052);
                int i7 = 32 - i6;
                Object[] A0I = A0I(this.A04, i7);
                int i8 = size - 1;
                objArr2[i8] = A0I;
                A07(collection2, A0I, objArr2, i2, i7, i8);
            }
            this.A03 = A0L(this.A03, objArr2, i3);
        }
        this.A04 = A0B;
        this.A01 = size() + collection2.size();
        return true;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.WvB, java.util.AbstractList] */
    public final ListIterator listIterator() {
        return listIterator(0);
    }
}
