package X;

import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: X.976  reason: invalid class name */
public final class AnonymousClass976<E> extends AnonymousClass977<E> implements RandomAccess {
    public static final AnonymousClass976 A02;
    public int A00 = 0;
    public Object[] A01 = new Object[10];

    /* JADX WARNING: type inference failed for: r0v0, types: [X.977, X.976] */
    static {
        ? r0 = new AnonymousClass977(false);
        r0.A01 = new Object[0];
        r0.A00 = 0;
        A02 = r0;
    }

    public AnonymousClass976() {
        super(true);
    }

    private void A00(int i) {
        if (i < 0 || i >= this.A00) {
            throw new IndexOutOfBoundsException(002.A02(i, this.A00, "Index:", ", Size:"));
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.978, X.977, X.976] */
    public final /* bridge */ /* synthetic */ AnonymousClass978 Coo(int i) {
        if (i >= this.A00) {
            Object[] copyOf = Arrays.copyOf(this.A01, i);
            int i2 = this.A00;
            ? r0 = new AnonymousClass977(true);
            r0.A01 = copyOf;
            r0.A00 = i2;
            return r0;
        }
        throw new IllegalArgumentException();
    }

    public final int size() {
        return this.A00;
    }

    public final void add(int i, Object obj) {
        int i2;
        A01();
        if (i < 0 || i > (i2 = this.A00)) {
            throw new IndexOutOfBoundsException(002.A02(i, this.A00, "Index:", ", Size:"));
        }
        Object[] objArr = this.A01;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[(((i2 * 3) / 2) + 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.A01, i, objArr2, i + 1, this.A00 - i);
            this.A01 = objArr2;
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
        int i2 = this.A00;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
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
