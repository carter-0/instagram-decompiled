package X;

import com.facebook.common.stringformat.StringFormatUtil;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.4jP  reason: invalid class name and case insensitive filesystem */
public final class C271674jP<E> extends AbstractSet<E> implements Set<E>, Cloneable, Serializable {
    public static final Object A04 = new C271684jQ();
    public static final Object[] A05 = new Object[0];
    public int A00 = 0;
    public transient int A01 = 0;
    public transient int A02 = 0;
    public transient Object[] A03;

    public C271674jP() {
        Object[] objArr;
        float f = 0.0f / 0.75f;
        int i = (int) f;
        if (i >= 0) {
            if (i == 0) {
                objArr = A05;
            } else {
                objArr = new Object[i];
            }
            this.A03 = objArr;
            return;
        }
        throw new RuntimeException(StringFormatUtil.formatStrLocaleSafe("adjustedCapacity = %d, capacity = %d, LOAD_FACTOR = %s, (capacity / LOAD_FACTOR) = %s", Integer.valueOf(i), 0, Float.toString(0.75f), Float.toString(f)));
    }

    public static int A01(Object[] objArr, Object obj) {
        int length = objArr.length;
        int A002 = A00(obj, length);
        int i = A002;
        do {
            Object obj2 = objArr[i];
            if (obj2 == null || obj2 == obj || obj2.equals(obj)) {
                return i;
            }
            i++;
            if (i == length) {
                i = 0;
                continue;
            }
        } while (i != A002);
        return i;
    }

    public final void clear() {
        this.A00 = 0;
        Arrays.fill(this.A03, (Object) null);
        this.A01++;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                if (size() == set.size()) {
                    Object[] objArr = this.A03;
                    int length = objArr.length;
                    int i = 0;
                    while (i < length) {
                        Object obj2 = objArr[i];
                        if (obj2 == null || set.contains(obj2)) {
                            i++;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A022 = A02(-1);
        int i = 0;
        while (A022 >= 0) {
            i += this.A03[A022].hashCode();
            A022 = A02(A022);
        }
        return i;
    }

    public final int A02(int i) {
        Object[] objArr;
        do {
            i++;
            objArr = this.A03;
            if (i >= objArr.length) {
                return AnonymousClass972.MUTABLE_FLAG_MASK;
            }
        } while (objArr[i] == null);
        return i;
    }

    public final boolean add(Object obj) {
        if (this.A00 >= this.A02) {
            this.A01++;
            int i = 2;
            int i2 = r5 * 2;
            if (i2 != 0) {
                i = i2;
            }
            Object[] objArr = new Object[i];
            for (Object obj2 : this.A03) {
                if (obj2 != null) {
                    objArr[A01(objArr, obj2)] = obj2;
                }
            }
            this.A03 = objArr;
            this.A02 = (int) (((float) i) * 0.75f);
        }
        if (obj == null) {
            obj = A04;
        }
        int length = this.A03.length;
        int A002 = A00(obj, length);
        while (true) {
            Object[] objArr2 = this.A03;
            Object obj3 = objArr2[A002];
            if (obj3 == null) {
                this.A00++;
                this.A01++;
                objArr2[A002] = obj;
                return true;
            } else if (obj3 == obj || obj3.equals(obj)) {
                return false;
            } else {
                A002++;
                if (A002 == length) {
                    A002 = 0;
                }
            }
        }
        return false;
    }

    public final boolean contains(Object obj) {
        Object[] objArr = this.A03;
        if (objArr.length == 0) {
            return false;
        }
        if (obj == null) {
            obj = A04;
        }
        if (objArr[A01(objArr, obj)] != null) {
            return true;
        }
        return false;
    }

    public final boolean isEmpty() {
        if (this.A00 == 0) {
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        return new C271694jR(this, this);
    }

    public final boolean remove(Object obj) {
        Object obj2;
        Object[] objArr = this.A03;
        if (objArr.length != 0) {
            if (obj == null) {
                obj = A04;
            }
            int A012 = A01(objArr, obj);
            Object[] objArr2 = this.A03;
            if (objArr2[A012] != null) {
                int length = objArr2.length;
                while (true) {
                    int i = A012;
                    while (true) {
                        A012++;
                        if (A012 >= length) {
                            A012 = 0;
                        }
                        Object[] objArr3 = this.A03;
                        obj2 = objArr3[A012];
                        if (obj2 != null) {
                            int A002 = A00(obj2, length);
                            boolean z = false;
                            if (A002 > i) {
                                z = true;
                            }
                            if (A012 >= i) {
                                if (!z) {
                                    break;
                                }
                            } else if (z) {
                                continue;
                            }
                            if (A002 > A012) {
                                break;
                            }
                        } else {
                            this.A01++;
                            this.A00--;
                            objArr3[i] = null;
                            return true;
                        }
                    }
                    this.A03[i] = obj2;
                }
            }
        }
        return false;
    }

    public final int size() {
        return this.A00;
    }

    public static int A00(Object obj, int i) {
        int hashCode = obj.hashCode();
        int i2 = hashCode + ((hashCode << 15) ^ -12931);
        int i3 = i2 ^ (i2 >>> 10);
        int i4 = i3 + (i3 << 3);
        int i5 = i4 ^ (i4 >>> 6);
        int i6 = i5 + (i5 << 2) + (i5 << 14);
        return ((i6 ^ (i6 >>> 16)) & Integer.MAX_VALUE) % i;
    }

    public final Object clone() {
        try {
            C271674jP r4 = (C271674jP) super.clone();
            Object[] objArr = new Object[this.A03.length];
            r4.A03 = objArr;
            Object[] objArr2 = this.A03;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            return r4;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final Object[] toArray(Object[] objArr) {
        int size = size();
        if (objArr.length < size) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        }
        int i = 0;
        int A022 = A02(-1);
        while (A022 >= 0) {
            int i2 = i + 1;
            Object obj = this.A03[A022];
            if (obj == A04) {
                obj = null;
            }
            objArr[i] = obj;
            A022 = A02(A022);
            i = i2;
        }
        if (objArr.length > size) {
            objArr[size] = null;
        }
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        boolean z = true;
        int A022 = A02(-1);
        while (A022 >= 0) {
            Object obj = this.A03[A022];
            if (!z) {
                sb.append(", ");
            }
            if (obj == A04) {
                obj = "null";
            }
            sb.append(obj);
            z = false;
            A022 = A02(A022);
        }
        sb.append('}');
        return sb.toString();
    }

    public final Object[] toArray() {
        int size = size();
        if (size == 0) {
            return A05;
        }
        Object[] objArr = new Object[size];
        int i = 0;
        int A022 = A02(-1);
        while (A022 >= 0) {
            int i2 = i + 1;
            Object obj = this.A03[A022];
            if (obj == A04) {
                obj = null;
            }
            objArr[i] = obj;
            A022 = A02(A022);
            i = i2;
        }
        return objArr;
    }
}
