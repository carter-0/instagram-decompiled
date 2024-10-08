package X;

import java.util.Iterator;

/* renamed from: X.Qux  reason: case insensitive filesystem */
public final class C8452Qux extends C8443Quo {
    public static final C8452Qux A05;
    public static final Object[] A06;
    public final transient int A00;
    public final transient Object[] A01;
    public final transient Object[] A02;
    public final transient int A03;
    public final transient int A04;

    static {
        Object[] objArr = new Object[0];
        A06 = objArr;
        A05 = new C8452Qux(objArr, objArr, 0, 0, 0);
    }

    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        Object[] objArr = this.A02;
        if (objArr.length == 0) {
            return false;
        }
        int A032 = Pxh.A03(obj.hashCode());
        while (true) {
            int i = A032 & this.A04;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            A032 = i + 1;
        }
    }

    public final int hashCode() {
        return this.A03;
    }

    public final int size() {
        return this.A00;
    }

    public C8452Qux(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        this.A01 = objArr;
        this.A03 = i;
        this.A02 = objArr2;
        this.A04 = i2;
        this.A00 = i3;
    }

    public final /* synthetic */ Iterator iterator() {
        return A08().listIterator(0);
    }
}
