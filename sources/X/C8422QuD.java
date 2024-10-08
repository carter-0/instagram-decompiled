package X;

import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: X.QuD  reason: case insensitive filesystem */
public final class C8422QuD extends C13250TRq implements RandomAccess {
    public static final C8422QuD A02;
    public int A00 = 0;
    public Object[] A01 = new Object[10];

    /* JADX WARNING: type inference failed for: r0v0, types: [X.TRq, X.QuD] */
    static {
        ? tRq = new C13250TRq(false);
        tRq.A01 = new Object[0];
        tRq.A00 = 0;
        A02 = tRq;
    }

    public final int size() {
        return this.A00;
    }

    public C8422QuD() {
        super(true);
    }

    private final void A00(int i) {
        if (i < 0 || i >= this.A00) {
            throw C51969G9p.A0p("Index:", ", Size:", i, this.A00);
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.TRq, X.QuD, X.TnX] */
    public final /* bridge */ /* synthetic */ C13981TnX FPV(int i) {
        if (i >= this.A00) {
            Object[] copyOf = Arrays.copyOf(this.A01, i);
            int i2 = this.A00;
            ? tRq = new C13250TRq(true);
            tRq.A01 = copyOf;
            tRq.A00 = i2;
            return tRq;
        }
        throw Pxe.A0g();
    }

    public final void add(int i, Object obj) {
        int i2;
        A01();
        if (i < 0 || i > (i2 = this.A00)) {
            throw C51969G9p.A0p("Index:", ", Size:", i, this.A00);
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
        A00(i);
        return this.A01[i];
    }

    public final Object remove(int i) {
        A01();
        A00(i);
        Object[] objArr = this.A01;
        Object obj = objArr[i];
        Pxj.A11(this.A00, i, objArr);
        this.A00--;
        this.modCount++;
        return obj;
    }

    public final Object set(int i, Object obj) {
        A01();
        A00(i);
        Object[] objArr = this.A01;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        this.modCount++;
        return obj2;
    }

    public final boolean add(Object obj) {
        A01();
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
