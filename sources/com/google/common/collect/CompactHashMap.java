package com.google.common.collect;

import X.002;
import X.17k;
import X.1J7;
import X.1WJ;
import X.2PP;
import X.AnonymousClass000;
import X.AnonymousClass42I;
import X.AnonymousClass42J;
import X.AnonymousClass42N;
import X.C290885g7;
import X.TSI;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class CompactHashMap<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final Object A06 = new Object();
    public static final double HASH_FLOODING_FPP = 0.001d;
    public transient int A00;
    public transient int A01;
    public transient Object A02;
    public transient Collection A03;
    public transient Set A04;
    public transient Set A05;
    public transient int[] entries;
    public transient Object[] keys;
    public transient Object[] values;

    public int A06(int i, int i2) {
        return i - 1;
    }

    public void A08(int i) {
    }

    public void A09(int i) {
        this.A00 = 1WJ.A00(i, 1, 1073741823);
    }

    public static int A00(CompactHashMap compactHashMap, Object obj) {
        boolean z = false;
        if (compactHashMap.A02 == null) {
            z = true;
        }
        if (!z) {
            int A022 = 1J7.A02(obj);
            int i = (1 << (compactHashMap.A00 & 31)) - 1;
            Object obj2 = compactHashMap.A02;
            obj2.getClass();
            int A002 = AnonymousClass42I.A00(obj2, A022 & i);
            if (A002 != 0) {
                int i2 = i ^ -1;
                int i3 = A022 & i2;
                do {
                    int i4 = A002 - 1;
                    int[] iArr = compactHashMap.entries;
                    iArr.getClass();
                    int i5 = iArr[i4];
                    if ((i5 & i2) == i3) {
                        Object[] objArr = compactHashMap.keys;
                        objArr.getClass();
                        if (2PP.A00(obj, objArr[i4])) {
                            return i4;
                        }
                    }
                    A002 = i5 & i;
                } while (A002 != 0);
            }
        }
        return -1;
    }

    public static Object A01(CompactHashMap compactHashMap, Object obj) {
        Object obj2 = compactHashMap.A02;
        if (obj2 != null) {
            int i = (1 << (compactHashMap.A00 & 31)) - 1;
            int[] iArr = compactHashMap.entries;
            iArr.getClass();
            Object[] objArr = compactHashMap.keys;
            objArr.getClass();
            int A012 = AnonymousClass42I.A01(obj, (Object) null, obj2, iArr, objArr, (Object[]) null, i);
            if (A012 != -1) {
                Object[] objArr2 = compactHashMap.values;
                objArr2.getClass();
                Object obj3 = objArr2[A012];
                compactHashMap.A0B(A012, i);
                compactHashMap.A01--;
                compactHashMap.A00 += 32;
                return obj3;
            }
        }
        return A06;
    }

    public int A03() {
        boolean z = false;
        if (this.A02 == null) {
            z = true;
        }
        17k.A0H(z, "Arrays already allocated");
        int i = this.A00;
        int max = Math.max(4, 1J7.A00(i + 1));
        this.A02 = AnonymousClass42I.A02(max);
        this.A00 = (this.A00 & -32) | ((32 - Integer.numberOfLeadingZeros(max - 1)) & 31);
        this.entries = new int[i];
        this.keys = new Object[i];
        this.values = new Object[i];
        return i;
    }

    public int A05(int i) {
        int i2 = i + 1;
        if (i2 >= this.A01) {
            return -1;
        }
        return i2;
    }

    public LinkedHashMap A07(int i) {
        return new LinkedHashMap(i, 1.0f);
    }

    public void A0A(int i) {
        int[] iArr = this.entries;
        iArr.getClass();
        this.entries = Arrays.copyOf(iArr, i);
        Object[] objArr = this.keys;
        objArr.getClass();
        this.keys = Arrays.copyOf(objArr, i);
        Object[] objArr2 = this.values;
        objArr2.getClass();
        this.values = Arrays.copyOf(objArr2, i);
    }

    public void A0B(int i, int i2) {
        int i3;
        int i4;
        Object obj = this.A02;
        obj.getClass();
        int[] iArr = this.entries;
        iArr.getClass();
        Object[] objArr = this.keys;
        objArr.getClass();
        Object[] objArr2 = this.values;
        objArr2.getClass();
        int size = size() - 1;
        if (i < size) {
            Object obj2 = objArr[size];
            objArr[i] = obj2;
            objArr2[i] = objArr2[size];
            objArr[size] = null;
            objArr2[size] = null;
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
        objArr2[i] = null;
        iArr[i] = 0;
    }

    public void A0C(Object obj, int i, Object obj2, int i2, int i3) {
        int[] iArr = this.entries;
        iArr.getClass();
        iArr[i] = i2 & (i3 ^ -1);
        Object[] objArr = this.keys;
        objArr.getClass();
        objArr[i] = obj;
        Object[] objArr2 = this.values;
        objArr2.getClass();
        objArr2[i] = obj2;
    }

    public void clear() {
        if (this.A02 != null) {
            this.A00 += 32;
            Map delegateOrNull = delegateOrNull();
            if (delegateOrNull != null) {
                this.A00 = 1WJ.A00(size(), 3, 1073741823);
                delegateOrNull.clear();
                this.A02 = null;
            } else {
                Object[] objArr = this.keys;
                objArr.getClass();
                Arrays.fill(objArr, 0, this.A01, (Object) null);
                Object[] objArr2 = this.values;
                objArr2.getClass();
                Arrays.fill(objArr2, 0, this.A01, (Object) null);
                Object obj = this.A02;
                obj.getClass();
                if (obj instanceof byte[]) {
                    Arrays.fill((byte[]) obj, (byte) 0);
                } else if (obj instanceof short[]) {
                    Arrays.fill((short[]) obj, 0);
                } else {
                    Arrays.fill((int[]) obj, 0);
                }
                int[] iArr = this.entries;
                iArr.getClass();
                Arrays.fill(iArr, 0, this.A01, 0);
            }
            this.A01 = 0;
        }
    }

    public Map convertToHashFloodingResistantImplementation() {
        LinkedHashMap A07 = A07(((1 << (this.A00 & 31)) - 1) + 1);
        int A042 = A04();
        while (A042 >= 0) {
            Object[] objArr = this.keys;
            objArr.getClass();
            Object obj = objArr[A042];
            Object[] objArr2 = this.values;
            objArr2.getClass();
            A07.put(obj, objArr2[A042]);
            A042 = A05(A042);
        }
        this.A02 = A07;
        this.entries = null;
        this.keys = null;
        this.values = null;
        this.A00 += 32;
        return A07;
    }

    public Map delegateOrNull() {
        Object obj = this.A02;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final Set entrySet() {
        Set set = this.A04;
        if (set != null) {
            return set;
        }
        AnonymousClass42J r0 = new AnonymousClass42J(this);
        this.A04 = r0;
        return r0;
    }

    public final Set keySet() {
        Set set = this.A05;
        if (set != null) {
            return set;
        }
        TSI tsi = new TSI(this);
        this.A05 = tsi;
        return tsi;
    }

    public boolean needsAllocArrays() {
        if (this.A02 == null) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object put(java.lang.Object r21, java.lang.Object r22) {
        /*
            r20 = this;
            r5 = r20
            java.lang.Object r0 = r5.A02
            if (r0 != 0) goto L_0x0009
            r5.A03()
        L_0x0009:
            java.util.Map r0 = r5.delegateOrNull()
            r7 = r21
            r6 = r22
            if (r0 != 0) goto L_0x0089
            int[] r11 = r5.entries
            r11.getClass()
            java.lang.Object[] r13 = r5.keys
            r13.getClass()
            java.lang.Object[] r12 = r5.values
            r12.getClass()
            int r4 = r5.A01
            int r3 = r4 + 1
            int r18 = X.1J7.A02(r7)
            int r0 = r5.A00
            r0 = r0 & 31
            r8 = 1
            int r9 = r8 << r0
            int r9 = r9 - r8
            r1 = r18 & r9
            java.lang.Object r0 = r5.A02
            r0.getClass()
            int r0 = X.AnonymousClass42I.A00(r0, r1)
            if (r0 != 0) goto L_0x008e
            if (r3 > r9) goto L_0x00b4
            java.lang.Object r0 = r5.A02
            r0.getClass()
            X.AnonymousClass42I.A03(r0, r1, r3)
        L_0x0049:
            int[] r0 = r5.entries
            r0.getClass()
            int r2 = r0.length
            if (r3 <= r2) goto L_0x0066
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            int r0 = r2 >>> 1
            int r0 = java.lang.Math.max(r8, r0)
            int r0 = r0 + r2
            r0 = r0 | 1
            int r0 = java.lang.Math.min(r1, r0)
            if (r0 == r2) goto L_0x0066
            r5.A0A(r0)
        L_0x0066:
            r17 = r6
            r19 = r9
            r15 = r7
            r16 = r4
            r14 = r5
            r14.A0C(r15, r16, r17, r18, r19)
            r5.A01 = r3
            int r0 = r5.A00
            int r0 = r0 + 32
            r5.A00 = r0
            r0 = 0
            return r0
        L_0x007b:
            r0 = r14 & r9
            int r2 = r2 + 1
            if (r0 != 0) goto L_0x0093
            r0 = 9
            if (r2 < r0) goto L_0x00ab
            java.util.Map r0 = r5.convertToHashFloodingResistantImplementation()
        L_0x0089:
            java.lang.Object r0 = r0.put(r7, r6)
            return r0
        L_0x008e:
            r15 = r9 ^ -1
            r10 = r18 & r15
            r2 = 0
        L_0x0093:
            int r1 = r0 + -1
            r14 = r11[r1]
            r0 = r14 & r15
            if (r0 != r10) goto L_0x007b
            r0 = r13[r1]
            boolean r0 = X.2PP.A00(r7, r0)
            if (r0 == 0) goto L_0x007b
            r0 = r12[r1]
            r12[r1] = r22
            r5.A08(r1)
            return r0
        L_0x00ab:
            if (r3 > r9) goto L_0x00b4
            r14 = r14 & r15
            r0 = r3 & r9
            r14 = r14 | r0
            r11[r1] = r14
            goto L_0x0049
        L_0x00b4:
            r0 = 32
            r1 = 2
            if (r9 >= r0) goto L_0x00ba
            r1 = 4
        L_0x00ba:
            int r0 = r9 + 1
            int r1 = r1 * r0
            java.lang.Object r13 = X.AnonymousClass42I.A02(r1)
            int r17 = r1 + -1
            if (r4 == 0) goto L_0x00cc
            r1 = r18 & r17
            int r0 = r4 + 1
            X.AnonymousClass42I.A03(r13, r1, r0)
        L_0x00cc:
            java.lang.Object r12 = r5.A02
            r12.getClass()
            int[] r11 = r5.entries
            r11.getClass()
            r10 = 0
        L_0x00d7:
            if (r10 > r9) goto L_0x00ff
            int r14 = X.AnonymousClass42I.A00(r12, r10)
        L_0x00dd:
            if (r14 == 0) goto L_0x00fc
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
            goto L_0x00dd
        L_0x00fc:
            int r10 = r10 + 1
            goto L_0x00d7
        L_0x00ff:
            r5.A02 = r13
            int r0 = java.lang.Integer.numberOfLeadingZeros(r17)
            int r2 = 32 - r0
            int r0 = r5.A00
            r1 = r0 & -32
            r0 = r2 & 31
            r1 = r1 | r0
            r5.A00 = r1
            r9 = r17
            goto L_0x0049
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.CompactHashMap.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final Collection values() {
        Collection collection = this.A03;
        if (collection != null) {
            return collection;
        }
        C290885g7 r0 = new C290885g7(this);
        this.A03 = r0;
        return r0;
    }

    public CompactHashMap(int i) {
        A09(i);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            A09(readInt);
            for (int i = 0; i < readInt; i++) {
                put(objectInputStream.readObject(), objectInputStream.readObject());
            }
            return;
        }
        throw new InvalidObjectException(002.A0O(AnonymousClass000.A00(971), readInt));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        Iterator it;
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Map delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            it = delegateOrNull.entrySet().iterator();
        } else {
            it = new AnonymousClass42N(this);
        }
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    public int A04() {
        if (isEmpty()) {
            return -1;
        }
        return 0;
    }

    public final boolean containsKey(Object obj) {
        Map delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.containsKey(obj);
        }
        if (A00(this, obj) != -1) {
            return true;
        }
        return false;
    }

    public final boolean containsValue(Object obj) {
        Map delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.containsValue(obj);
        }
        for (int i = 0; i < this.A01; i++) {
            Object[] objArr = this.values;
            objArr.getClass();
            if (2PP.A00(obj, objArr[i])) {
                return true;
            }
        }
        return false;
    }

    public final Object get(Object obj) {
        Map delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.get(obj);
        }
        int A002 = A00(this, obj);
        if (A002 == -1) {
            return null;
        }
        A08(A002);
        Object[] objArr = this.values;
        objArr.getClass();
        return objArr[A002];
    }

    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final Object remove(Object obj) {
        Map delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.remove(obj);
        }
        Object A012 = A01(this, obj);
        if (A012 == A06) {
            return null;
        }
        return A012;
    }

    public final int size() {
        Map delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.size();
        }
        return this.A01;
    }

    public CompactHashMap() {
        A09(3);
    }
}
