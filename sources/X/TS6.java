package X;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public final class TS6 extends AbstractMap implements Serializable {
    public static final Object A09 = Pxe.A0p();
    public transient int A00 = Math.min(Math.max(12, 1), 1073741823);
    public transient int A01;
    public transient Object A02;
    public transient int[] A03;
    public transient Object[] A04;
    public transient Object[] A05;
    public transient Collection A06;
    public transient Set A07;
    public transient Set A08;

    public static final int A00(TS6 ts6, Object obj) {
        if (!DbW.A1a(ts6.A02)) {
            int A032 = Pxh.A03(AnonymousClass7TG.A0C(obj));
            int i = (1 << (ts6.A00 & 31)) - 1;
            Object obj2 = ts6.A02;
            obj2.getClass();
            int A002 = SKt.A00(obj2, A032 & i);
            if (A002 != 0) {
                int i2 = i ^ -1;
                int i3 = A032 & i2;
                do {
                    int i4 = A002 - 1;
                    int[] iArr = ts6.A03;
                    iArr.getClass();
                    int i5 = iArr[i4];
                    if ((i5 & i2) == i3) {
                        Object[] objArr = ts6.A04;
                        objArr.getClass();
                        if (C9718Rfb.A00(obj, objArr[i4])) {
                            return i4;
                        }
                    }
                    A002 = i5 & i;
                } while (A002 != 0);
            }
        }
        return -1;
    }

    public static final Object A01(TS6 ts6, Object obj) {
        Object obj2 = ts6.A02;
        if (obj2 != null) {
            int i = (1 << (ts6.A00 & 31)) - 1;
            int[] iArr = ts6.A03;
            iArr.getClass();
            Object[] objArr = ts6.A04;
            objArr.getClass();
            int A032 = Pxh.A03(AnonymousClass7TG.A0C(obj));
            int i2 = A032 & i;
            int A002 = SKt.A00(obj2, i2);
            if (A002 != 0) {
                int i3 = i ^ -1;
                int i4 = A032 & i3;
                int i5 = -1;
                while (true) {
                    int i6 = A002 - 1;
                    int i7 = iArr[i6];
                    if ((i7 & i3) != i4 || !C9718Rfb.A00(obj, objArr[i6])) {
                        A002 = i7 & i;
                        if (A002 == 0) {
                            break;
                        }
                        i5 = i6;
                    } else {
                        int i8 = i7 & i;
                        if (i5 == -1) {
                            SKt.A02(obj2, i2, i8);
                        } else {
                            iArr[i5] = (i8 & i) | (iArr[i5] & i3);
                        }
                        if (i6 != -1) {
                            Object[] objArr2 = ts6.A05;
                            objArr2.getClass();
                            Object obj3 = objArr2[i6];
                            ts6.A03(i6, i);
                            ts6.A01--;
                            ts6.A00 += 32;
                            return obj3;
                        }
                    }
                }
            }
        }
        return A09;
    }

    public final Map A02() {
        Object obj = this.A02;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void A03(int i, int i2) {
        int i3;
        int i4;
        Object obj = this.A02;
        obj.getClass();
        int[] iArr = this.A03;
        iArr.getClass();
        Object[] objArr = this.A04;
        objArr.getClass();
        Object[] objArr2 = this.A05;
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
            int A032 = Pxh.A03(AnonymousClass7TG.A0C(obj2)) & i2;
            int A002 = SKt.A00(obj, A032);
            int i5 = size + 1;
            if (A002 == i5) {
                SKt.A02(obj, A032, i + 1);
                return;
            }
            do {
                i3 = A002 - 1;
                i4 = iArr[i3];
                A002 = i4 & i2;
            } while (A002 != i5);
            iArr[i3] = ((i + 1) & i2) | (i4 & (i2 ^ -1));
            return;
        }
        objArr[i] = null;
        objArr2[i] = null;
        iArr[i] = 0;
    }

    public final void clear() {
        if (this.A02 != null) {
            this.A00 += 32;
            Map A022 = A02();
            if (A022 != null) {
                this.A00 = Math.min(Math.max(size(), 3), 1073741823);
                A022.clear();
                this.A02 = null;
            } else {
                Object[] objArr = this.A04;
                objArr.getClass();
                Arrays.fill(objArr, 0, this.A01, (Object) null);
                Object[] objArr2 = this.A05;
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
                int[] iArr = this.A03;
                iArr.getClass();
                Arrays.fill(iArr, 0, this.A01, 0);
            }
            this.A01 = 0;
        }
    }

    public final Set entrySet() {
        Set set = this.A08;
        if (set != null) {
            return set;
        }
        TSF tsf = new TSF(this);
        this.A08 = tsf;
        return tsf;
    }

    public final Set keySet() {
        Set set = this.A07;
        if (set != null) {
            return set;
        }
        TSG tsg = new TSG(this);
        this.A07 = tsg;
        return tsg;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0169  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object put(java.lang.Object r20, java.lang.Object r21) {
        /*
            r19 = this;
            r3 = r19
            java.lang.Object r0 = r3.A02
            if (r0 != 0) goto L_0x0044
            int r4 = r3.A00
            int r1 = r4 + 1
            r0 = 2
            int r6 = java.lang.Math.max(r1, r0)
            int r5 = java.lang.Integer.highestOneBit(r6)
            double r1 = (double) r5
            int r0 = (int) r1
            if (r6 <= r0) goto L_0x001c
            int r5 = r5 + r5
            if (r5 > 0) goto L_0x001c
            r5 = 1073741824(0x40000000, float:2.0)
        L_0x001c:
            r0 = 4
            int r1 = java.lang.Math.max(r0, r5)
            java.lang.Object r0 = X.SKt.A01(r1)
            r3.A02 = r0
            int r0 = r1 + -1
            int r2 = java.lang.Integer.numberOfLeadingZeros(r0)
            int r0 = r3.A00
            r1 = r0 & -32
            int r0 = 32 - r2
            r0 = r0 & 31
            r0 = r0 | r1
            r3.A00 = r0
            int[] r0 = new int[r4]
            r3.A03 = r0
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r3.A04 = r0
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r3.A05 = r0
        L_0x0044:
            java.util.Map r4 = r3.A02()
            r6 = r20
            r5 = r21
            if (r4 != 0) goto L_0x01b2
            int[] r12 = r3.A03
            r12.getClass()
            java.lang.Object[] r14 = r3.A04
            r14.getClass()
            java.lang.Object[] r13 = r3.A05
            r13.getClass()
            int r4 = r3.A01
            int r2 = r4 + 1
            int r0 = X.AnonymousClass7TG.A0C(r6)
            int r18 = X.Pxh.A03(r0)
            int r0 = r3.A00
            r0 = r0 & 31
            r9 = 1
            int r0 = r9 << r0
            int r7 = r0 + -1
            r1 = r18 & r7
            java.lang.Object r0 = r3.A02
            r0.getClass()
            int r8 = X.SKt.A00(r0, r1)
            if (r8 != 0) goto L_0x00e7
            if (r2 > r7) goto L_0x0144
            java.lang.Object r0 = r3.A02
            r0.getClass()
            X.SKt.A02(r0, r1, r2)
        L_0x0089:
            int[] r0 = r3.A03
            r0.getClass()
            int r8 = r0.length
            if (r2 <= r8) goto L_0x00c4
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            int r0 = r8 >>> 1
            int r0 = java.lang.Math.max(r9, r0)
            int r0 = r0 + r8
            r0 = r0 | 1
            int r1 = java.lang.Math.min(r1, r0)
            if (r1 == r8) goto L_0x00c4
            int[] r0 = r3.A03
            r0.getClass()
            int[] r0 = java.util.Arrays.copyOf(r0, r1)
            r3.A03 = r0
            java.lang.Object[] r0 = r3.A04
            r0.getClass()
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            r3.A04 = r0
            java.lang.Object[] r0 = r3.A05
            r0.getClass()
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            r3.A05 = r0
        L_0x00c4:
            int[] r1 = r3.A03
            r1.getClass()
            r0 = r7 ^ -1
            r0 = r0 & r18
            r1[r4] = r0
            java.lang.Object[] r0 = r3.A04
            r0.getClass()
            r0[r4] = r20
            java.lang.Object[] r0 = r3.A05
            r0.getClass()
            r0[r4] = r21
            r3.A01 = r2
            int r0 = r3.A00
            int r0 = r0 + 32
            r3.A00 = r0
            r0 = 0
            return r0
        L_0x00e7:
            r16 = r7 ^ -1
            r11 = r18 & r16
            r10 = 0
        L_0x00ec:
            int r15 = r8 + -1
            r8 = r12[r15]
            r1 = r8 & r16
            if (r1 != r11) goto L_0x0101
            r0 = r14[r15]
            boolean r0 = X.C9718Rfb.A00(r6, r0)
            if (r0 == 0) goto L_0x0101
            r0 = r13[r15]
            r13[r15] = r21
            return r0
        L_0x0101:
            r8 = r8 & r7
            int r10 = r10 + 1
            if (r8 != 0) goto L_0x00ec
            r0 = 9
            if (r10 < r0) goto L_0x013b
            int r0 = r3.A00
            r0 = r0 & 31
            int r9 = r9 << r0
            int r0 = r9 + -1
            int r1 = r0 + 1
            r0 = 1065353216(0x3f800000, float:1.0)
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>(r1, r0)
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x01a3
            r2 = 0
        L_0x0121:
            java.lang.Object[] r0 = r3.A04
            r0.getClass()
            r1 = r0[r2]
            java.lang.Object[] r0 = r3.A05
            r0.getClass()
            r0 = r0[r2]
            r4.put(r1, r0)
            int r2 = r2 + 1
            int r0 = r3.A01
            if (r2 >= r0) goto L_0x01a3
            if (r2 < 0) goto L_0x01a3
            goto L_0x0121
        L_0x013b:
            if (r2 > r7) goto L_0x0144
            r0 = r2 & r7
            r0 = r0 | r1
            r12[r15] = r0
            goto L_0x0089
        L_0x0144:
            r0 = 32
            r1 = 2
            if (r7 >= r0) goto L_0x014a
            r1 = 4
        L_0x014a:
            int r0 = r7 + 1
            int r1 = r1 * r0
            java.lang.Object r14 = X.SKt.A01(r1)
            int r17 = r1 + -1
            if (r4 == 0) goto L_0x015c
            r1 = r18 & r17
            int r0 = r4 + 1
            X.SKt.A02(r14, r1, r0)
        L_0x015c:
            java.lang.Object r13 = r3.A02
            r13.getClass()
            int[] r12 = r3.A03
            r12.getClass()
            r11 = 0
        L_0x0167:
            if (r11 > r7) goto L_0x018e
            int r15 = X.SKt.A00(r13, r11)
        L_0x016d:
            if (r15 == 0) goto L_0x018b
            int r16 = r15 + -1
            r10 = r12[r16]
            r8 = r7 ^ -1
            r8 = r8 & r10
            r8 = r8 | r11
            r0 = r8 & r17
            int r1 = X.SKt.A00(r14, r0)
            X.SKt.A02(r14, r0, r15)
            r0 = r17 ^ -1
            r0 = r0 & r8
            r1 = r1 & r17
            r0 = r0 | r1
            r12[r16] = r0
            r15 = r10 & r7
            goto L_0x016d
        L_0x018b:
            int r11 = r11 + 1
            goto L_0x0167
        L_0x018e:
            r3.A02 = r14
            int r7 = java.lang.Integer.numberOfLeadingZeros(r17)
            int r0 = r3.A00
            r1 = r0 & -32
            int r0 = 32 - r7
            r0 = r0 & 31
            r0 = r0 | r1
            r3.A00 = r0
            r7 = r17
            goto L_0x0089
        L_0x01a3:
            r3.A02 = r4
            r0 = 0
            r3.A03 = r0
            r3.A04 = r0
            r3.A05 = r0
            int r0 = r3.A00
            int r0 = r0 + 32
            r3.A00 = r0
        L_0x01b2:
            java.lang.Object r0 = r4.put(r6, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TS6.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final Collection values() {
        Collection collection = this.A06;
        if (collection != null) {
            return collection;
        }
        TRZ trz = new TRZ(this);
        this.A06 = trz;
        return trz;
    }

    public TS6(int i) {
    }

    public final boolean containsKey(Object obj) {
        Map A022 = A02();
        if (A022 != null) {
            return A022.containsKey(obj);
        }
        if (A00(this, obj) == -1) {
            return false;
        }
        return true;
    }

    public final boolean containsValue(Object obj) {
        Map A022 = A02();
        if (A022 != null) {
            return A022.containsValue(obj);
        }
        for (int i = 0; i < this.A01; i++) {
            Object[] objArr = this.A05;
            objArr.getClass();
            if (C9718Rfb.A00(obj, objArr[i])) {
                return true;
            }
        }
        return false;
    }

    public final Object get(Object obj) {
        Map A022 = A02();
        if (A022 != null) {
            return A022.get(obj);
        }
        int A002 = A00(this, obj);
        if (A002 == -1) {
            return null;
        }
        Object[] objArr = this.A05;
        objArr.getClass();
        return objArr[A002];
    }

    public final boolean isEmpty() {
        return AnonymousClass7TF.A1Q(size());
    }

    public final Object remove(Object obj) {
        Map A022 = A02();
        if (A022 != null) {
            return A022.remove(obj);
        }
        Object A012 = A01(this, obj);
        if (A012 == A09) {
            return null;
        }
        return A012;
    }

    public final int size() {
        Map A022 = A02();
        if (A022 != null) {
            return A022.size();
        }
        return this.A01;
    }

    public TS6() {
    }
}
