package X;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public final class Y44<K, V> implements Map<K, V>, Cloneable, Serializable {
    public static final Object A07 = new C21476XcD();
    public transient int A00;
    public transient int A01 = 0;
    public transient int A02 = 3;
    public transient Object[] A03 = new Object[8];
    public transient Collection A04;
    public transient Set A05;
    public transient Set A06;

    public final void clear() {
        this.A01 = 0;
        Arrays.fill(this.A03, (Object) null);
        this.A00++;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (size() == map.size()) {
                    int A042 = A04(-1);
                    while (A042 >= 0) {
                        Object A052 = A05(A042);
                        Object A062 = A06(A042);
                        if (map.containsKey(A052)) {
                            Object obj2 = map.get(A052);
                            if (obj2 == null) {
                                if (A062 == null) {
                                }
                            } else if (!obj2.equals(A062)) {
                            }
                            A042 = A04(A042);
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A042 = A04(-1);
        int i = 0;
        while (A042 >= 0) {
            i += AnonymousClass7TG.A0C(A05(A042)) ^ AnonymousClass7TG.A0C(A06(A042));
            A042 = A04(A042);
        }
        return i;
    }

    public static int A00(Y44 y44, Object obj) {
        if (y44.A01 != 0) {
            if (obj == null) {
                obj = A07;
            }
            int A012 = y44.A01(obj);
            while (true) {
                Object obj2 = y44.A03[A012 << 1];
                if (obj2 == null) {
                    break;
                } else if (obj2 == obj || obj2.equals(obj)) {
                    return A012;
                } else {
                    A012 = (A012 + 1) & ((y44.A03.length >>> 1) - 1);
                }
            }
            return A012;
        }
        return -1;
    }

    private void A02(int i) {
        if (((i - 1) & i) == 0) {
            Object[] objArr = this.A03;
            int length = objArr.length >>> 1;
            if (i <= length) {
                throw AnonymousClass7TE.A0w("New capacity must be greater than current capacity.");
            } else if (i <= 268435456) {
                int i2 = this.A01;
                this.A02 = (i >> 1) + (i >> 2);
                this.A01 = 0;
                this.A03 = new Object[(i * 2)];
                if (i2 > 0) {
                    int i3 = 0;
                    for (int i4 = 0; i4 < length && i3 < i2; i4++) {
                        Object obj = objArr[i4 << 1];
                        if (obj != null) {
                            put(obj, objArr[(i4 << 1) + 1]);
                            i3++;
                        }
                    }
                }
            } else {
                throw AnonymousClass7TE.A0w("New capacity is greater than maximum capacity.");
            }
        } else {
            throw AnonymousClass7TE.A0w("New capacity must be a power of two.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        if (r0 > r6) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(X.Y44 r5, int r6) {
        /*
            java.lang.Object[] r2 = r5.A03
            int r0 = r6 << 1
            r0 = r2[r0]
            if (r0 == 0) goto L_0x005f
            int r4 = r6 + 1
        L_0x000a:
            int r0 = r2.length
            int r0 = r0 >>> 1
            int r0 = r0 + -1
            r4 = r4 & r0
            int r0 = r4 << 1
            r0 = r2[r0]
            if (r0 == 0) goto L_0x0049
            if (r6 == r4) goto L_0x003b
            int r0 = r4 << 1
            r0 = r2[r0]
            if (r0 == 0) goto L_0x0043
            int r0 = r5.A01(r0)
            if (r6 >= r4) goto L_0x0040
            if (r0 <= r6) goto L_0x0028
        L_0x0026:
            if (r0 <= r4) goto L_0x003b
        L_0x0028:
            java.lang.Object[] r3 = r5.A03
            int r1 = r6 << 1
            int r2 = r4 << 1
            r0 = r3[r2]
            r3[r1] = r0
            int r1 = r1 + 1
            int r0 = r2 + 1
            r0 = r3[r0]
            r3[r1] = r0
            r6 = r4
        L_0x003b:
            int r4 = r4 + 1
            java.lang.Object[] r2 = r5.A03
            goto L_0x000a
        L_0x0040:
            if (r0 > r6) goto L_0x003b
            goto L_0x0026
        L_0x0043:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L_0x0049:
            int r0 = r6 << 1
            r1 = 0
            r2[r0] = r1
            int r0 = r0 + 1
            r2[r0] = r1
            int r0 = r5.A01
            int r0 = r0 + -1
            r5.A01 = r0
            int r0 = r5.A00
            int r0 = r0 + 1
            r5.A00 = r0
            return
        L_0x005f:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Y44.A03(X.Y44, int):void");
    }

    public final int A04(int i) {
        if (this.A01 <= 0) {
            return -1;
        }
        Object[] objArr = this.A03;
        int length = objArr.length >>> 1;
        do {
            i++;
            if (i >= length) {
                return -1;
            }
        } while (objArr[i << 1] == null);
        return i;
    }

    public final Object A05(int i) {
        Object obj = this.A03[i << 1];
        if (obj == null) {
            throw new NoSuchElementException();
        } else if (obj == A07) {
            return null;
        } else {
            return obj;
        }
    }

    public final Object A06(int i) {
        Object[] objArr = this.A03;
        int i2 = i << 1;
        if (objArr[i2] != null) {
            return objArr[i2 + 1];
        }
        throw new NoSuchElementException();
    }

    public final boolean containsValue(Object obj) {
        if (obj == null) {
            Object[] objArr = this.A03;
            int length = objArr.length >>> 1;
            int i = 0;
            while (i < length) {
                if (objArr[(i << 1) + 1] != null || objArr[i << 1] == null) {
                    i++;
                }
            }
            return false;
        }
        int length2 = this.A03.length >>> 1;
        int i2 = 0;
        while (i2 < length2) {
            Object obj2 = this.A03[(i2 << 1) + 1];
            if (obj2 == null || (obj2 != obj && !obj2.equals(obj))) {
                i2++;
            }
        }
        return false;
        return true;
    }

    public final Set entrySet() {
        Set set = this.A05;
        if (set != null) {
            return set;
        }
        C22467Y5b y5b = new C22467Y5b(this);
        this.A05 = y5b;
        return y5b;
    }

    public final boolean isEmpty() {
        return AnonymousClass7TF.A1Q(this.A01);
    }

    public final Set keySet() {
        Set set = this.A06;
        if (set != null) {
            return set;
        }
        C22468Y5c y5c = new C22468Y5c(this);
        this.A06 = y5c;
        return y5c;
    }

    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            obj = A07;
        }
        int A012 = A01(obj);
        while (true) {
            Object[] objArr = this.A03;
            Object obj3 = objArr[A012 << 1];
            if (obj3 == null) {
                int i = this.A01;
                if (i != 268435456) {
                    if (i >= this.A02) {
                        A02((objArr.length >>> 1) * 2);
                        A012 = A01(obj);
                    }
                    while (true) {
                        Object[] objArr2 = this.A03;
                        int i2 = A012 << 1;
                        if (objArr2[i2] != null) {
                            A012 = (A012 + 1) & ((objArr2.length >>> 1) - 1);
                        } else {
                            objArr2[i2] = obj;
                            objArr2[i2 + 1] = obj2;
                            this.A01++;
                            this.A00++;
                            return null;
                        }
                    }
                } else {
                    throw AnonymousClass7TE.A0z("Maximum capacity reached, cannot add new item.");
                }
            } else if (obj3 == obj || obj3.equals(obj)) {
                int i3 = (A012 << 1) + 1;
                Object[] objArr3 = this.A03;
                Object obj4 = objArr3[i3];
                objArr3[i3] = obj2;
            } else {
                A012 = (A012 + 1) & ((this.A03.length >>> 1) - 1);
            }
        }
        int i32 = (A012 << 1) + 1;
        Object[] objArr32 = this.A03;
        Object obj42 = objArr32[i32];
        objArr32[i32] = obj2;
        return obj42;
    }

    public final Collection values() {
        Collection collection = this.A04;
        if (collection != null) {
            return collection;
        }
        Y5Y y5y = new Y5Y(this);
        this.A04 = y5y;
        return y5y;
    }

    private int A01(Object obj) {
        int hashCode = obj.hashCode();
        int i = hashCode + ((hashCode << 15) ^ -12931);
        int i2 = i ^ (i >>> 10);
        int i3 = i2 + (i2 << 3);
        int i4 = i3 ^ (i3 >>> 6);
        int i5 = i4 + (i4 << 2) + (i4 << 14);
        return (i5 ^ (i5 >>> 16)) & ((this.A03.length >>> 1) - 1);
    }

    public final Object clone() {
        try {
            Y44 y44 = (Y44) super.clone();
            Object[] objArr = new Object[this.A03.length];
            y44.A03 = objArr;
            Object[] objArr2 = this.A03;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            return y44;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean containsKey(Object obj) {
        return Pxf.A1R(A00(this, obj));
    }

    public final Object get(Object obj) {
        int A002 = A00(this, obj);
        if (A002 >= 0) {
            return this.A03[(A002 << 1) + 1];
        }
        return null;
    }

    public final void putAll(Map map) {
        if (map.size() != 0) {
            if (map.size() > size() && map.size() > (this.A03.length >>> 1)) {
                int size = map.size() - 1;
                int i = size | (size >>> 1);
                int i2 = i | (i >>> 2);
                int i3 = i2 | (i2 >>> 4);
                int i4 = i3 | (i3 >>> 8);
                A02((i4 | (i4 >>> 16)) + 1);
            }
            Iterator A0u = AnonymousClass7TF.A0u(map);
            while (A0u.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                put(A1J.getKey(), A1J.getValue());
            }
        }
    }

    public final Object remove(Object obj) {
        int A002 = A00(this, obj);
        if (A002 < 0) {
            return null;
        }
        Object A062 = A06(A002);
        A03(this, A002);
        return A062;
    }

    public final int size() {
        return this.A01;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("{");
        boolean z = true;
        int A042 = A04(-1);
        while (A042 >= 0) {
            if (!z) {
                A1A.append(", ");
            }
            Object A052 = A05(A042);
            if (A052 == null) {
                A052 = "null";
            }
            A1A.append(A052);
            A1A.append("=");
            A1A.append(A06(A042));
            z = false;
            A042 = A04(A042);
        }
        return AnonymousClass7TF.A0l("}", A1A);
    }
}
