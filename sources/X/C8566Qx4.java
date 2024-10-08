package X;

import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: X.Qx4  reason: case insensitive filesystem */
public final class C8566Qx4 extends C13252TRs implements RandomAccess {
    public static final C8566Qx4 A02 = new C8566Qx4(new Object[0], 0, false);
    public int A00;
    public Object[] A01;

    public static C8566Qx4 A00() {
        return A02;
    }

    public final int size() {
        return this.A00;
    }

    private final String A01(int i) {
        return 002.A02(i, this.A00, "Index:", ", Size:");
    }

    private final void A02(int i) {
        if (i < 0 || i >= this.A00) {
            throw Pxe.A0k(A01(i));
        }
    }

    public final /* bridge */ /* synthetic */ C13984Tna FPW(int i) {
        if (i >= this.A00) {
            return new C8566Qx4(Arrays.copyOf(this.A01, i), this.A00, true);
        }
        throw Pxe.A0g();
    }

    public C8566Qx4(Object[] objArr, int i, boolean z) {
        super(z);
        this.A01 = objArr;
        this.A00 = i;
    }

    public final void add(int i, Object obj) {
        int i2;
        A03();
        if (i < 0 || i > (i2 = this.A00)) {
            throw Pxe.A0k(A01(i));
        }
        int i3 = i + 1;
        Object[] objArr = this.A01;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            Object[] A1b = Pxj.A1b(objArr, i2, i);
            System.arraycopy(this.A01, i, A1b, i3, this.A00 - i);
            this.A01 = A1b;
        }
        this.A01[i] = obj;
        this.A00++;
        this.modCount++;
    }

    public final Object get(int i) {
        A02(i);
        return this.A01[i];
    }

    public final Object remove(int i) {
        A03();
        A02(i);
        Object[] objArr = this.A01;
        Object obj = objArr[i];
        Pxj.A11(this.A00, i, objArr);
        this.A00--;
        this.modCount++;
        return obj;
    }

    public final Object set(int i, Object obj) {
        A03();
        A02(i);
        Object[] objArr = this.A01;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        this.modCount++;
        return obj2;
    }

    public C8566Qx4() {
        this(new Object[10], 0, true);
    }

    public final boolean add(Object obj) {
        A03();
        int i = this.A00;
        Object[] objArr = this.A01;
        if (i == objArr.length) {
            objArr = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
            this.A01 = objArr;
        }
        int i2 = this.A00;
        this.A00 = i2 + 1;
        objArr[i2] = obj;
        this.modCount++;
        return true;
    }
}
