package X;

import java.util.Arrays;
import java.util.Set;

/* renamed from: X.Quo  reason: case insensitive filesystem */
public abstract class C8443Quo extends C13244TRk implements Set {
    public transient C8448Qut A00;

    public static int A00(int i) {
        int i2;
        int max = Math.max(i, 2);
        if (max < 751619276) {
            i2 = Integer.highestOneBit(max - 1);
            do {
                i2 += i2;
            } while (((double) i2) * 0.7d < ((double) max));
        } else {
            i2 = SN3.MAX_SIGNED_POWER_OF_TWO;
            if (max >= 1073741824) {
                throw AnonymousClass7TE.A0w("collection too large");
            }
        }
        return i2;
    }

    public static C8443Quo A01(Object[] objArr, int i) {
        Object[] objArr2 = objArr;
        if (i == 0) {
            return C8452Qux.A05;
        }
        if (i != 1) {
            int A002 = A00(i);
            Object[] objArr3 = new Object[A002];
            int i2 = A002 - 1;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < i) {
                Object obj = objArr2[i3];
                if (obj != null) {
                    int hashCode = obj.hashCode();
                    int A03 = Pxh.A03(hashCode);
                    while (true) {
                        int i6 = A03 & i2;
                        Object obj2 = objArr3[i6];
                        if (obj2 != null) {
                            if (obj2.equals(obj)) {
                                break;
                            }
                            A03++;
                        } else {
                            objArr2[i5] = obj;
                            objArr3[i6] = obj;
                            i4 += hashCode;
                            i5++;
                            break;
                        }
                    }
                    i3++;
                } else {
                    throw Pxg.A0h(i3);
                }
            }
            Arrays.fill(objArr2, i5, i, (Object) null);
            if (i5 != 1) {
                if (A00(i5) < A002 / 2) {
                    return A01(objArr2, i5);
                }
                if (i5 <= 0) {
                    objArr2 = Arrays.copyOf(objArr2, i5);
                }
                return new C8452Qux(objArr2, objArr3, i4, i2, i5);
            }
        }
        return new C8450Quv(Pxe.A0t(objArr2, 0));
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if ((!(obj instanceof C8443Quo) || !(this instanceof C8452Qux) || !(((C8443Quo) obj) instanceof C8452Qux) || hashCode() == obj.hashCode()) && (obj instanceof Set)) {
                Set set = (Set) obj;
                try {
                    if (size() != set.size() || !containsAll(set)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final C8448Qut A08() {
        Object[] array;
        int length;
        C8448Qut qup;
        if (this instanceof C8450Quv) {
            Object obj = ((C8450Quv) this).A00;
            C8460Qv5 qv5 = C8448Qut.A00;
            Object[] objArr = {obj};
            if (objArr[0] != null) {
                return new C8447Qus(objArr, 1);
            }
            throw Pxg.A0h(0);
        } else if (this instanceof C8453Quy) {
            return ((C8453Quy) this).A01;
        } else {
            C8448Qut qut = this.A00;
            if (qut != null) {
                return qut;
            }
            if (this instanceof C8452Qux) {
                C8452Qux qux = (C8452Qux) this;
                array = qux.A01;
                length = qux.A00;
            } else if (this instanceof C8451Quw) {
                qup = new C8444Qup((C8451Quw) this);
                this.A00 = qup;
                return qup;
            } else {
                array = toArray();
                length = array.length;
            }
            C8460Qv5 qv52 = C8448Qut.A00;
            if (length == 0) {
                qup = C8447Qus.A02;
            } else {
                qup = new C8447Qus(array, length);
            }
            this.A00 = qup;
            return qup;
        }
    }

    public int hashCode() {
        int i = 0;
        for (Object A0E : this) {
            i += C51971G9r.A0E(A0E);
        }
        return i;
    }
}
