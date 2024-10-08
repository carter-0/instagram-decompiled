package com.google.common.collect;

import X.17k;
import X.1J3;
import X.1J7;
import X.2PP;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C13985Tnb;
import X.C51973G9u;
import X.JTQ;
import X.Pxe;
import X.Qzz;
import X.R00;
import X.R01;
import X.TSE;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class HashBiMap<K, V> extends AbstractMap<K, V> implements C13985Tnb<K, V>, Serializable {
    public transient int A00;
    public transient int A01;
    public transient int A02;
    public transient C13985Tnb A03;
    public transient Set A04;
    public transient int[] A05;
    public transient int[] A06;
    public transient int[] A07;
    public transient int[] A08;
    public transient int[] A09;
    public transient int[] A0A;
    public transient Object[] A0B;
    public transient Object[] A0C;
    public transient int A0D;
    public transient Set A0E;
    public transient Set A0F;

    public class Inverse<K, V> extends AbstractMap<V, K> implements C13985Tnb<V, K>, Serializable {
        public transient Set A00;
        public final HashBiMap forward;

        public final void clear() {
            this.forward.clear();
        }

        public final boolean containsKey(Object obj) {
            return this.forward.containsValue(obj);
        }

        public final boolean containsValue(Object obj) {
            return this.forward.containsKey(obj);
        }

        public final Set entrySet() {
            Set set = this.A00;
            if (set != null) {
                return set;
            }
            TSE tse = new TSE(this.forward);
            this.A00 = tse;
            return tse;
        }

        public final Object get(Object obj) {
            HashBiMap hashBiMap = this.forward;
            int A0B = hashBiMap.A0B(obj, 1J7.A02(obj));
            if (A0B == -1) {
                return null;
            }
            return hashBiMap.A0B[A0B];
        }

        public final Set keySet() {
            HashBiMap hashBiMap = this.forward;
            Set set = hashBiMap.A04;
            if (set != null) {
                return set;
            }
            R01 r01 = new R01(hashBiMap);
            hashBiMap.A04 = r01;
            return r01;
        }

        public final Object put(Object obj, Object obj2) {
            return this.forward.A0C(obj, obj2);
        }

        public final Object remove(Object obj) {
            HashBiMap hashBiMap = this.forward;
            int A02 = 1J7.A02(obj);
            int A0B = hashBiMap.A0B(obj, A02);
            if (A0B == -1) {
                return null;
            }
            Object obj2 = hashBiMap.A0B[A0B];
            hashBiMap.A0F(A0B, A02);
            return obj2;
        }

        public final int size() {
            return this.forward.A02;
        }

        public final /* bridge */ /* synthetic */ Collection values() {
            return this.forward.keySet();
        }

        public Inverse(HashBiMap hashBiMap) {
            this.forward = hashBiMap;
        }

        private void readObject(ObjectInputStream objectInputStream) {
            objectInputStream.defaultReadObject();
            this.forward.A03 = this;
        }
    }

    private void A02(int i, int i2) {
        17k.A0E(JTQ.A1O(i, -1));
        int[] iArr = this.A05;
        int length = i2 & (iArr.length - 1);
        int i3 = iArr[length];
        if (i3 == i) {
            int[] iArr2 = this.A07;
            iArr[length] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int[] iArr3 = this.A07;
        int i4 = iArr3[i3];
        while (true) {
            int i5 = i3;
            i3 = i4;
            if (i4 == -1) {
                StringBuilder A1A = AnonymousClass7TE.A1A();
                A1A.append("Expected to find entry with key ");
                throw Pxe.A0e(AnonymousClass7TF.A0i(this.A0B[i], A1A));
            } else if (i4 == i) {
                iArr3[i5] = iArr3[i];
                iArr3[i] = -1;
                return;
            } else {
                i4 = iArr3[i4];
            }
        }
    }

    private void A03(int i, int i2) {
        17k.A0E(JTQ.A1O(i, -1));
        int length = i2 & (this.A05.length - 1);
        int[] iArr = this.A06;
        int i3 = iArr[length];
        if (i3 == i) {
            int[] iArr2 = this.A08;
            iArr[length] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int[] iArr3 = this.A08;
        int i4 = iArr3[i3];
        while (true) {
            int i5 = i3;
            i3 = i4;
            if (i4 == -1) {
                StringBuilder A1A = AnonymousClass7TE.A1A();
                A1A.append("Expected to find entry with value ");
                throw Pxe.A0e(AnonymousClass7TF.A0i(this.A0C[i], A1A));
            } else if (i4 == i) {
                iArr3[i5] = iArr3[i];
                iArr3[i] = -1;
                return;
            } else {
                i4 = iArr3[i4];
            }
        }
    }

    private void A04(int i, int i2) {
        boolean z = false;
        if (i != -1) {
            z = true;
        }
        17k.A0E(z);
        int[] iArr = this.A05;
        int length = i2 & (iArr.length - 1);
        this.A07[i] = iArr[length];
        iArr[length] = i;
    }

    private void A05(int i, int i2) {
        boolean z = false;
        if (i != -1) {
            z = true;
        }
        17k.A0E(z);
        int length = i2 & (this.A05.length - 1);
        int[] iArr = this.A08;
        int[] iArr2 = this.A06;
        iArr[i] = iArr2[length];
        iArr2[length] = i;
    }

    private void A06(int i, int i2) {
        if (i == -2) {
            this.A00 = i2;
        } else {
            this.A09[i] = i2;
        }
        if (i2 == -2) {
            this.A0D = i;
        } else {
            this.A0A[i2] = i;
        }
    }

    public static void A07(HashBiMap hashBiMap, int i, int i2, int i3) {
        int i4;
        int i5;
        17k.A0E(JTQ.A1O(i, -1));
        hashBiMap.A02(i, i2);
        hashBiMap.A03(i, i3);
        int[] iArr = hashBiMap.A0A;
        int i6 = iArr[i];
        int[] iArr2 = hashBiMap.A09;
        hashBiMap.A06(i6, iArr2[i]);
        int i7 = hashBiMap.A02 - 1;
        if (i7 != i) {
            int i8 = iArr[i7];
            int i9 = iArr2[i7];
            hashBiMap.A06(i8, i);
            hashBiMap.A06(i, i9);
            Object[] objArr = hashBiMap.A0B;
            Object obj = objArr[i7];
            Object[] objArr2 = hashBiMap.A0C;
            Object obj2 = objArr2[i7];
            objArr[i] = obj;
            objArr2[i] = obj2;
            int A022 = 1J7.A02(obj);
            int[] iArr3 = hashBiMap.A05;
            int length = A022 & (iArr3.length - 1);
            int i10 = iArr3[length];
            if (i10 == i7) {
                iArr3[length] = i;
            } else {
                int[] iArr4 = hashBiMap.A07;
                int i11 = iArr4[i10];
                while (true) {
                    i4 = i10;
                    i10 = i11;
                    if (i11 == i7) {
                        break;
                    }
                    i11 = iArr4[i11];
                }
                iArr4[i4] = i;
            }
            int[] iArr5 = hashBiMap.A07;
            iArr5[i] = iArr5[i7];
            iArr5[i7] = -1;
            int A023 = 1J7.A02(obj2) & (hashBiMap.A05.length - 1);
            int[] iArr6 = hashBiMap.A06;
            int i12 = iArr6[A023];
            if (i12 == i7) {
                iArr6[A023] = i;
            } else {
                int[] iArr7 = hashBiMap.A08;
                int i13 = iArr7[i12];
                while (true) {
                    i5 = i12;
                    i12 = i13;
                    if (i13 == i7) {
                        break;
                    }
                    i13 = iArr7[i13];
                }
                iArr7[i5] = i;
            }
            int[] iArr8 = hashBiMap.A08;
            iArr8[i] = iArr8[i7];
            iArr8[i7] = -1;
        }
        Object[] objArr3 = hashBiMap.A0B;
        int i14 = hashBiMap.A02;
        int i15 = i14 - 1;
        objArr3[i15] = null;
        hashBiMap.A0C[i15] = null;
        hashBiMap.A02 = i14 - 1;
        hashBiMap.A01++;
    }

    public static void A08(HashBiMap hashBiMap, Object obj, int i) {
        17k.A0E(JTQ.A1O(i, -1));
        int A0A2 = hashBiMap.A0A(obj, 1J7.A02(obj));
        int i2 = hashBiMap.A0D;
        if (A0A2 != -1) {
            throw C51973G9u.A0g(obj, "Key already present in map: ", AnonymousClass7TE.A1A());
        }
        if (i2 == i) {
            i2 = hashBiMap.A0A[i];
        } else if (i2 == hashBiMap.A02) {
            i2 = -1;
        }
        if (-2 == i) {
            A0A2 = hashBiMap.A09[i];
        } else if (-2 != hashBiMap.A02) {
            A0A2 = -2;
        }
        hashBiMap.A06(hashBiMap.A0A[i], hashBiMap.A09[i]);
        hashBiMap.A02(i, 1J7.A02(hashBiMap.A0B[i]));
        hashBiMap.A0B[i] = obj;
        hashBiMap.A04(i, 1J7.A02(obj));
        hashBiMap.A06(i2, i);
        hashBiMap.A06(i, A0A2);
    }

    public static void A09(HashBiMap hashBiMap, Object obj, int i, boolean z) {
        17k.A0E(JTQ.A1O(i, -1));
        int A022 = 1J7.A02(obj);
        int A0B2 = hashBiMap.A0B(obj, A022);
        if (A0B2 != -1) {
            if (z) {
                hashBiMap.A0F(A0B2, A022);
                if (i == hashBiMap.A02) {
                    i = A0B2;
                }
            } else {
                throw C51973G9u.A0g(obj, "Value already present in map: ", AnonymousClass7TE.A1A());
            }
        }
        hashBiMap.A03(i, 1J7.A02(hashBiMap.A0C[i]));
        hashBiMap.A0C[i] = obj;
        hashBiMap.A05(i, A022);
    }

    public final Object put(Object obj, Object obj2) {
        return A0D(obj, obj2, false);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.AbstractMap, com.google.common.collect.HashBiMap] */
    public static HashBiMap A00() {
        ? abstractMap = new AbstractMap();
        abstractMap.A0E();
        return abstractMap;
    }

    private void A01(int i) {
        int length = this.A07.length;
        if (length < i) {
            int A002 = 1J3.A00(length, i);
            this.A0B = Arrays.copyOf(this.A0B, A002);
            this.A0C = Arrays.copyOf(this.A0C, A002);
            int[] iArr = this.A07;
            int length2 = iArr.length;
            int[] copyOf = Arrays.copyOf(iArr, A002);
            Arrays.fill(copyOf, length2, A002, -1);
            this.A07 = copyOf;
            int[] iArr2 = this.A08;
            int length3 = iArr2.length;
            int[] copyOf2 = Arrays.copyOf(iArr2, A002);
            Arrays.fill(copyOf2, length3, A002, -1);
            this.A08 = copyOf2;
            int[] iArr3 = this.A0A;
            int length4 = iArr3.length;
            int[] copyOf3 = Arrays.copyOf(iArr3, A002);
            Arrays.fill(copyOf3, length4, A002, -1);
            this.A0A = copyOf3;
            int[] iArr4 = this.A09;
            int length5 = iArr4.length;
            int[] copyOf4 = Arrays.copyOf(iArr4, A002);
            Arrays.fill(copyOf4, length5, A002, -1);
            this.A09 = copyOf4;
        }
        if (this.A05.length < i) {
            int A003 = 1J7.A00(i);
            int[] iArr5 = new int[A003];
            Arrays.fill(iArr5, -1);
            this.A05 = iArr5;
            int[] iArr6 = new int[A003];
            Arrays.fill(iArr6, -1);
            this.A06 = iArr6;
            for (int i2 = 0; i2 < this.A02; i2++) {
                int A022 = 1J7.A02(this.A0B[i2]);
                int[] iArr7 = this.A05;
                int length6 = A022 & (iArr7.length - 1);
                this.A07[i2] = iArr7[length6];
                iArr7[length6] = i2;
                int A023 = 1J7.A02(this.A0C[i2]) & (this.A05.length - 1);
                int[] iArr8 = this.A08;
                int[] iArr9 = this.A06;
                iArr8[i2] = iArr9[A023];
                iArr9[A023] = i2;
            }
        }
    }

    public final int A0A(Object obj, int i) {
        int[] iArr = this.A05;
        int[] iArr2 = this.A07;
        Object[] objArr = this.A0B;
        for (int i2 = iArr[i & (iArr.length - 1)]; i2 != -1; i2 = iArr2[i2]) {
            if (2PP.A00(objArr[i2], obj)) {
                return i2;
            }
        }
        return -1;
    }

    public final int A0B(Object obj, int i) {
        int[] iArr = this.A06;
        int[] iArr2 = this.A08;
        Object[] objArr = this.A0C;
        for (int i2 = iArr[i & (this.A05.length - 1)]; i2 != -1; i2 = iArr2[i2]) {
            if (2PP.A00(objArr[i2], obj)) {
                return i2;
            }
        }
        return -1;
    }

    public final void A0E() {
        int A002 = 1J7.A00(16);
        this.A02 = 0;
        this.A0B = new Object[16];
        this.A0C = new Object[16];
        int[] iArr = new int[A002];
        Arrays.fill(iArr, -1);
        this.A05 = iArr;
        int[] iArr2 = new int[A002];
        Arrays.fill(iArr2, -1);
        this.A06 = iArr2;
        int[] iArr3 = new int[16];
        Arrays.fill(iArr3, -1);
        this.A07 = iArr3;
        int[] iArr4 = new int[16];
        Arrays.fill(iArr4, -1);
        this.A08 = iArr4;
        this.A00 = -2;
        this.A0D = -2;
        int[] iArr5 = new int[16];
        Arrays.fill(iArr5, -1);
        this.A0A = iArr5;
        int[] iArr6 = new int[16];
        Arrays.fill(iArr6, -1);
        this.A09 = iArr6;
    }

    public final void A0F(int i, int i2) {
        A07(this, i, 1J7.A02(this.A0B[i]), i2);
    }

    public final void clear() {
        Arrays.fill(this.A0B, 0, this.A02, (Object) null);
        Arrays.fill(this.A0C, 0, this.A02, (Object) null);
        Arrays.fill(this.A05, -1);
        Arrays.fill(this.A06, -1);
        Arrays.fill(this.A07, 0, this.A02, -1);
        Arrays.fill(this.A08, 0, this.A02, -1);
        Arrays.fill(this.A0A, 0, this.A02, -1);
        Arrays.fill(this.A09, 0, this.A02, -1);
        this.A02 = 0;
        this.A00 = -2;
        this.A0D = -2;
        this.A01++;
    }

    public final Set entrySet() {
        Set set = this.A0E;
        if (set != null) {
            return set;
        }
        Qzz qzz = new Qzz(this);
        this.A0E = qzz;
        return qzz;
    }

    public final Set keySet() {
        Set set = this.A0F;
        if (set != null) {
            return set;
        }
        R00 r00 = new R00(this);
        this.A0F = r00;
        return r00;
    }

    public final int size() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ Collection values() {
        Set set = this.A04;
        if (set != null) {
            return set;
        }
        R01 r01 = new R01(this);
        this.A04 = r01;
        return r01;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        A0E();
        for (int i = 0; i < readInt; i++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator A0s = AnonymousClass7TF.A0s(this);
        while (A0s.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
            objectOutputStream.writeObject(A1J.getKey());
            objectOutputStream.writeObject(A1J.getValue());
        }
    }

    public final Object A0C(Object obj, Object obj2) {
        int i;
        int A022 = 1J7.A02(obj);
        int A0B2 = A0B(obj, A022);
        if (A0B2 != -1) {
            Object obj3 = this.A0B[A0B2];
            if (2PP.A00(obj3, obj2)) {
                return obj2;
            }
            A08(this, obj2, A0B2);
            return obj3;
        }
        int i2 = this.A0D;
        int A023 = 1J7.A02(obj2);
        17k.A0A(obj2, "Key already present: %s", AnonymousClass7TF.A1S(A0A(obj2, A023), -1));
        A01(this.A02 + 1);
        Object[] objArr = this.A0B;
        int i3 = this.A02;
        objArr[i3] = obj2;
        this.A0C[i3] = obj;
        A04(i3, A023);
        A05(this.A02, A022);
        if (i2 == -2) {
            i = this.A00;
        } else {
            i = this.A09[i2];
        }
        int i4 = this.A02;
        A06(i2, i4);
        A06(i4, i);
        this.A02 = i4 + 1;
        this.A01++;
        return null;
    }

    public final Object A0D(Object obj, Object obj2, boolean z) {
        int A022 = 1J7.A02(obj);
        int A0A2 = A0A(obj, A022);
        if (A0A2 != -1) {
            Object obj3 = this.A0C[A0A2];
            if (2PP.A00(obj3, obj2)) {
                return obj2;
            }
            A09(this, obj2, A0A2, z);
            return obj3;
        }
        int A023 = 1J7.A02(obj2);
        int A0B2 = A0B(obj2, A023);
        if (!z) {
            boolean z2 = false;
            if (A0B2 == -1) {
                z2 = true;
            }
            17k.A0A(obj2, "Value already present: %s", z2);
        } else if (A0B2 != -1) {
            A0F(A0B2, A023);
        }
        A01(this.A02 + 1);
        Object[] objArr = this.A0B;
        int i = this.A02;
        objArr[i] = obj;
        this.A0C[i] = obj2;
        A04(i, A022);
        A05(this.A02, A023);
        int i2 = this.A0D;
        int i3 = this.A02;
        A06(i2, i3);
        A06(i3, -2);
        this.A02 = i3 + 1;
        this.A01++;
        return null;
    }

    public final boolean containsKey(Object obj) {
        return JTQ.A1O(A0A(obj, 1J7.A02(obj)), -1);
    }

    public final boolean containsValue(Object obj) {
        return JTQ.A1O(A0B(obj, 1J7.A02(obj)), -1);
    }

    public final Object get(Object obj) {
        int A0A2 = A0A(obj, 1J7.A02(obj));
        if (A0A2 == -1) {
            return null;
        }
        return this.A0C[A0A2];
    }

    public final Object remove(Object obj) {
        int A022 = 1J7.A02(obj);
        int A0A2 = A0A(obj, A022);
        if (A0A2 == -1) {
            return null;
        }
        Object obj2 = this.A0C[A0A2];
        A07(this, A0A2, A022, 1J7.A02(obj2));
        return obj2;
    }
}
