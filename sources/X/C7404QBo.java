package X;

import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: X.QBo  reason: case insensitive filesystem */
public final class C7404QBo<E> extends C13248TRo<E> implements RandomAccess {
    public static final C7404QBo A02;
    public int A00 = 0;
    public Object[] A01 = new Object[10];

    /* JADX WARNING: type inference failed for: r0v0, types: [X.TRo, X.QBo] */
    static {
        ? tRo = new C13248TRo();
        tRo.A01 = new Object[0];
        tRo.A00 = 0;
        A02 = tRo;
        tRo.A00 = false;
    }

    private void A00(int i) {
        if (i < 0 || i >= this.A00) {
            throw C51969G9p.A0p("Index:", ", Size:", i, this.A00);
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.TRo, X.QBo, X.TnW] */
    public final /* bridge */ /* synthetic */ C13980TnW Con(int i) {
        if (i >= this.A00) {
            Object[] copyOf = Arrays.copyOf(this.A01, i);
            int i2 = this.A00;
            ? tRo = new C13248TRo();
            tRo.A01 = copyOf;
            tRo.A00 = i2;
            return tRo;
        }
        throw Pxe.A0g();
    }

    public final int size() {
        return this.A00;
    }

    public final void add(int i, Object obj) {
        int i2;
        A01();
        if (i < 0 || i > (i2 = this.A00)) {
            throw C51969G9p.A0p("Index:", ", Size:", i, this.A00);
        }
        Object[] objArr = this.A01;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] A1b = Pxj.A1b(objArr, i2, i);
            System.arraycopy(this.A01, i, A1b, i + 1, this.A00 - i);
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
