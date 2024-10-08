package X;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class R30 extends C13255TRv<Integer> implements C13965TmS, RandomAccess, C13493TbK {
    public static final R30 A02;
    public int A00 = 0;
    public int[] A01 = new int[10];

    /* JADX WARNING: type inference failed for: r0v0, types: [X.R30, X.TRv] */
    static {
        ? tRv = new C13255TRv();
        tRv.A01 = new int[0];
        tRv.A00 = 0;
        A02 = tRv;
        tRv.A00 = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof R30)) {
            return super.equals(obj);
        }
        R30 r30 = (R30) obj;
        int i = this.A00;
        if (i == r30.A00) {
            int[] iArr = r30.A01;
            int i2 = 0;
            while (i2 < i) {
                if (this.A01[i2] == iArr[i2]) {
                    i2++;
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.A00; i2++) {
            i = (i * 31) + this.A01[i2];
        }
        return i;
    }

    public static void A00(R30 r30, int i) {
        if (i < 0 || i >= r30.A00) {
            throw C51969G9p.A0p("Index:", ", Size:", i, r30.A00);
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.R30, X.TnY, X.TRv] */
    public final /* bridge */ /* synthetic */ C13982TnY Cop(int i) {
        if (i >= this.A00) {
            int[] copyOf = Arrays.copyOf(this.A01, i);
            int i2 = this.A00;
            ? tRv = new C13255TRv();
            tRv.A01 = copyOf;
            tRv.A00 = i2;
            return tRv;
        }
        throw Pxe.A0g();
    }

    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int A0M = AnonymousClass7TE.A0M(obj);
            int size = size();
            for (int i = 0; i < size; i++) {
                if (this.A01[i] == A0M) {
                    return i;
                }
            }
        }
        return -1;
    }

    public final int size() {
        return this.A00;
    }

    public final void A8j(int i) {
        A01();
        int i2 = this.A00;
        int[] iArr = this.A01;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.A01 = iArr2;
            iArr = iArr2;
        }
        int i3 = this.A00;
        this.A00 = i3 + 1;
        iArr[i3] = i;
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        int A0M = AnonymousClass7TE.A0M(obj);
        A01();
        if (i < 0 || i > (i2 = this.A00)) {
            throw C51969G9p.A0p("Index:", ", Size:", i, this.A00);
        }
        int[] iArr = this.A01;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.A01, i, iArr2, i + 1, this.A00 - i);
            this.A01 = iArr2;
        }
        this.A01[i] = A0M;
        this.A00++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        A01();
        Charset charset = SD9.A04;
        collection.getClass();
        if (!(collection instanceof R30)) {
            return super.addAll(collection);
        }
        R30 r30 = (R30) collection;
        int i = r30.A00;
        if (i == 0) {
            return false;
        }
        int i2 = this.A00;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.A01;
            if (i3 > iArr.length) {
                iArr = Arrays.copyOf(iArr, i3);
                this.A01 = iArr;
            }
            System.arraycopy(r30.A01, 0, iArr, this.A00, r30.A00);
            this.A00 = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return JTQ.A1O(indexOf(obj), -1);
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        A00(this, i);
        return Integer.valueOf(this.A01[i]);
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        A01();
        A00(this, i);
        int[] iArr = this.A01;
        int i2 = iArr[i];
        Pxj.A11(this.A00, i, iArr);
        this.A00--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final void removeRange(int i, int i2) {
        A01();
        if (i2 >= i) {
            int[] iArr = this.A01;
            System.arraycopy(iArr, i2, iArr, i, this.A00 - i2);
            this.A00 -= i2 - i;
            this.modCount++;
            return;
        }
        throw Pxe.A0k("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int A0M = AnonymousClass7TE.A0M(obj);
        A01();
        A00(this, i);
        int[] iArr = this.A01;
        int i2 = iArr[i];
        iArr[i] = A0M;
        return Integer.valueOf(i2);
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        A8j(AnonymousClass7TE.A0M(obj));
        return true;
    }
}
