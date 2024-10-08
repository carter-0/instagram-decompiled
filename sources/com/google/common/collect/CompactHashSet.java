package com.google.common.collect;

import X.002;
import X.17k;
import X.1J7;
import X.1WJ;
import X.2PP;
import X.AnonymousClass000;
import X.AnonymousClass42I;
import X.TML;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class CompactHashSet<E> extends AbstractSet<E> implements Serializable {
    public static final double HASH_FLOODING_FPP = 0.001d;
    public transient int A00;
    public transient Object A01;
    public transient int[] A02;
    public transient int A03;
    public transient Object[] elements;

    public int A04(int i, int i2) {
        return i - 1;
    }

    public void A05(int i) {
        boolean z = false;
        if (i >= 0) {
            z = true;
        }
        17k.A0G(z, "Expected size must be >= 0");
        this.A00 = 1WJ.A00(i, 1, 1073741823);
    }

    public int A01() {
        boolean z = false;
        if (this.A01 == null) {
            z = true;
        }
        17k.A0H(z, "Arrays already allocated");
        int i = this.A00;
        int max = Math.max(4, 1J7.A00(i + 1));
        this.A01 = AnonymousClass42I.A02(max);
        this.A00 = (this.A00 & -32) | ((32 - Integer.numberOfLeadingZeros(max - 1)) & 31);
        this.A02 = new int[i];
        this.elements = new Object[i];
        return i;
    }

    public int A03(int i) {
        int i2 = i + 1;
        if (i2 >= this.A03) {
            return -1;
        }
        return i2;
    }

    public void A06(int i) {
        int[] iArr = this.A02;
        iArr.getClass();
        this.A02 = Arrays.copyOf(iArr, i);
        Object[] objArr = this.elements;
        objArr.getClass();
        this.elements = Arrays.copyOf(objArr, i);
    }

    public void A07(int i, int i2) {
        int i3;
        int i4;
        Object obj = this.A01;
        obj.getClass();
        int[] iArr = this.A02;
        iArr.getClass();
        Object[] objArr = this.elements;
        objArr.getClass();
        int size = size() - 1;
        if (i < size) {
            Object obj2 = objArr[size];
            objArr[i] = obj2;
            objArr[size] = null;
            iArr[i] = iArr[size];
            iArr[size] = 0;
            int A022 = 1J7.A02(obj2) & i2;
            int A002 = AnonymousClass42I.A00(obj, A022);
            int i5 = size + 1;
            if (A002 == i5) {
                AnonymousClass42I.A03(obj, A022, i + 1);
                return;
            }
            do {
                i3 = A002 - 1;
                i4 = iArr[i3];
                A002 = i4 & i2;
            } while (A002 != i5);
            iArr[i3] = (i4 & (i2 ^ -1)) | ((i + 1) & i2);
            return;
        }
        objArr[i] = null;
        iArr[i] = 0;
    }

    public void A08(Object obj, int i, int i2, int i3) {
        int[] iArr = this.A02;
        iArr.getClass();
        iArr[i] = i2 & (i3 ^ -1);
        Object[] objArr = this.elements;
        objArr.getClass();
        objArr[i] = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean add(java.lang.Object r20) {
        /*
            r19 = this;
            r5 = r19
            java.lang.Object r0 = r5.A01
            if (r0 != 0) goto L_0x0009
            r5.A01()
        L_0x0009:
            java.util.Set r0 = r5.delegateOrNull()
            r7 = r20
            if (r0 != 0) goto L_0x007b
            int[] r10 = r5.A02
            r10.getClass()
            java.lang.Object[] r12 = r5.elements
            r12.getClass()
            int r6 = r5.A03
            int r4 = r6 + 1
            int r3 = X.1J7.A02(r7)
            int r0 = r5.A00
            r0 = r0 & 31
            r8 = 1
            int r9 = r8 << r0
            int r9 = r9 - r8
            r1 = r3 & r9
            java.lang.Object r0 = r5.A01
            r0.getClass()
            int r15 = X.AnonymousClass42I.A00(r0, r1)
            r18 = 1
            if (r15 != 0) goto L_0x0082
            if (r4 > r9) goto L_0x00a1
            java.lang.Object r0 = r5.A01
            r0.getClass()
            X.AnonymousClass42I.A03(r0, r1, r4)
        L_0x0044:
            int[] r0 = r5.A02
            r0.getClass()
            int r2 = r0.length
            if (r4 <= r2) goto L_0x0061
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            int r0 = r2 >>> 1
            int r0 = java.lang.Math.max(r8, r0)
            int r0 = r0 + r2
            r0 = r0 | 1
            int r0 = java.lang.Math.min(r1, r0)
            if (r0 == r2) goto L_0x0061
            r5.A06(r0)
        L_0x0061:
            r5.A08(r7, r6, r3, r9)
            r5.A03 = r4
            int r0 = r5.A00
            int r0 = r0 + 32
            r5.A00 = r0
            return r18
        L_0x006d:
            r0 = r1 & r9
            int r2 = r2 + 1
            if (r0 != 0) goto L_0x0080
            r0 = 9
            if (r2 < r0) goto L_0x0098
            java.util.Set r0 = r5.convertToHashFloodingResistantImplementation()
        L_0x007b:
            boolean r18 = r0.add(r7)
            return r18
        L_0x0080:
            r15 = r0
            goto L_0x0088
        L_0x0082:
            r14 = r9 ^ -1
            r11 = r3 & r14
            r13 = 0
            r2 = 0
        L_0x0088:
            int r15 = r15 - r8
            r1 = r10[r15]
            r0 = r1 & r14
            if (r0 != r11) goto L_0x006d
            r0 = r12[r15]
            boolean r0 = X.2PP.A00(r7, r0)
            if (r0 == 0) goto L_0x006d
            return r13
        L_0x0098:
            if (r4 > r9) goto L_0x00a1
            r1 = r1 & r14
            r0 = r4 & r9
            r1 = r1 | r0
            r10[r15] = r1
            goto L_0x0044
        L_0x00a1:
            r0 = 32
            r1 = 2
            if (r9 >= r0) goto L_0x00a7
            r1 = 4
        L_0x00a7:
            int r0 = r9 + 1
            int r1 = r1 * r0
            java.lang.Object r13 = X.AnonymousClass42I.A02(r1)
            int r17 = r1 + -1
            if (r6 == 0) goto L_0x00b9
            r1 = r3 & r17
            int r0 = r6 + 1
            X.AnonymousClass42I.A03(r13, r1, r0)
        L_0x00b9:
            java.lang.Object r12 = r5.A01
            r12.getClass()
            int[] r11 = r5.A02
            r11.getClass()
            r10 = 0
        L_0x00c4:
            if (r10 > r9) goto L_0x00ec
            int r14 = X.AnonymousClass42I.A00(r12, r10)
        L_0x00ca:
            if (r14 == 0) goto L_0x00e9
            int r16 = r14 + -1
            r15 = r11[r16]
            r0 = r9 ^ -1
            r2 = r15 & r0
            r2 = r2 | r10
            r0 = r2 & r17
            int r1 = X.AnonymousClass42I.A00(r13, r0)
            X.AnonymousClass42I.A03(r13, r0, r14)
            r0 = r17 ^ -1
            r2 = r2 & r0
            r1 = r1 & r17
            r2 = r2 | r1
            r11[r16] = r2
            r15 = r15 & r9
            r14 = r15
            goto L_0x00ca
        L_0x00e9:
            int r10 = r10 + 1
            goto L_0x00c4
        L_0x00ec:
            r5.A01 = r13
            int r0 = java.lang.Integer.numberOfLeadingZeros(r17)
            int r2 = 32 - r0
            int r0 = r5.A00
            r1 = r0 & -32
            r0 = r2 & 31
            r1 = r1 | r0
            r5.A00 = r1
            r9 = r17
            goto L_0x0044
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.CompactHashSet.add(java.lang.Object):boolean");
    }

    public void clear() {
        if (this.A01 != null) {
            this.A00 += 32;
            Set delegateOrNull = delegateOrNull();
            if (delegateOrNull != null) {
                this.A00 = 1WJ.A00(size(), 3, 1073741823);
                delegateOrNull.clear();
                this.A01 = null;
            } else {
                Object[] objArr = this.elements;
                objArr.getClass();
                Arrays.fill(objArr, 0, this.A03, (Object) null);
                Object obj = this.A01;
                obj.getClass();
                if (obj instanceof byte[]) {
                    Arrays.fill((byte[]) obj, (byte) 0);
                } else if (obj instanceof short[]) {
                    Arrays.fill((short[]) obj, 0);
                } else {
                    Arrays.fill((int[]) obj, 0);
                }
                int[] iArr = this.A02;
                iArr.getClass();
                Arrays.fill(iArr, 0, this.A03, 0);
            }
            this.A03 = 0;
        }
    }

    public final boolean contains(Object obj) {
        int i;
        boolean z = false;
        if (this.A01 == null) {
            z = true;
        }
        if (z) {
            return false;
        }
        Set delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.contains(obj);
        }
        int A022 = 1J7.A02(obj);
        int i2 = (1 << (this.A00 & 31)) - 1;
        Object obj2 = this.A01;
        obj2.getClass();
        int A002 = AnonymousClass42I.A00(obj2, A022 & i2);
        if (A002 == 0) {
            return false;
        }
        int i3 = i2 ^ -1;
        int i4 = A022 & i3;
        do {
            int i5 = A002 - 1;
            int[] iArr = this.A02;
            iArr.getClass();
            int i6 = iArr[i5];
            if ((i6 & i3) == i4) {
                Object[] objArr = this.elements;
                objArr.getClass();
                if (2PP.A00(obj, objArr[i5])) {
                    return true;
                }
            }
            i = i6 & i2;
            A002 = i;
        } while (i != 0);
        return false;
    }

    public Set convertToHashFloodingResistantImplementation() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(((1 << (this.A00 & 31)) - 1) + 1, 1.0f);
        int A022 = A02();
        while (A022 >= 0) {
            Object[] objArr = this.elements;
            objArr.getClass();
            linkedHashSet.add(objArr[A022]);
            A022 = A03(A022);
        }
        this.A01 = linkedHashSet;
        this.A02 = null;
        this.elements = null;
        this.A00 += 32;
        return linkedHashSet;
    }

    public Set delegateOrNull() {
        Object obj = this.A01;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    public boolean needsAllocArrays() {
        if (this.A01 == null) {
            return true;
        }
        return false;
    }

    public final boolean remove(Object obj) {
        boolean z = false;
        if (this.A01 == null) {
            z = true;
        }
        if (z) {
            return false;
        }
        Set delegateOrNull = delegateOrNull();
        Object obj2 = obj;
        if (delegateOrNull != null) {
            return delegateOrNull.remove(obj);
        }
        int i = (1 << (this.A00 & 31)) - 1;
        Object obj3 = this.A01;
        obj3.getClass();
        int[] iArr = this.A02;
        iArr.getClass();
        Object[] objArr = this.elements;
        objArr.getClass();
        int A012 = AnonymousClass42I.A01(obj2, (Object) null, obj3, iArr, objArr, (Object[]) null, i);
        if (A012 == -1) {
            return false;
        }
        A07(A012, i);
        this.A03--;
        this.A00 += 32;
        return true;
    }

    public Object[] toArray(Object[] objArr) {
        boolean z = false;
        if (this.A01 == null) {
            z = true;
        }
        if (z) {
            if (objArr.length > 0) {
                objArr[0] = null;
            }
            return objArr;
        }
        Set delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.toArray(objArr);
        }
        Object[] objArr2 = this.elements;
        objArr2.getClass();
        int i = this.A03;
        17k.A03(0, i, objArr2.length);
        int length = objArr.length;
        if (length < i) {
            if (length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, i);
        } else if (length > i) {
            objArr[i] = null;
        }
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return objArr;
    }

    public CompactHashSet(int i) {
        A05(i);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            A05(readInt);
            for (int i = 0; i < readInt; i++) {
                add(objectInputStream.readObject());
            }
            return;
        }
        throw new InvalidObjectException(002.A0O(AnonymousClass000.A00(971), readInt));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    public int A02() {
        if (isEmpty()) {
            return -1;
        }
        return 0;
    }

    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public boolean isUsingHashFloodingResistance() {
        if (delegateOrNull() != null) {
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        Set delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.iterator();
        }
        return new TML(this);
    }

    public final int size() {
        Set delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.size();
        }
        return this.A03;
    }

    public CompactHashSet() {
        A05(3);
    }

    public Object[] toArray() {
        if (this.A01 == null) {
            return new Object[0];
        }
        Set delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.toArray();
        }
        Object[] objArr = this.elements;
        objArr.getClass();
        return Arrays.copyOf(objArr, this.A03);
    }
}
