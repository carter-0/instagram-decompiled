package X;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class R31 extends C13255TRv<Long> implements C13963TmQ, RandomAccess, C13493TbK {
    public static final R31 A02;
    public int A00 = 0;
    public long[] A01 = new long[10];

    /* JADX WARNING: type inference failed for: r0v0, types: [X.R31, X.TRv] */
    static {
        ? tRv = new C13255TRv();
        tRv.A01 = new long[0];
        tRv.A00 = 0;
        A02 = tRv;
        tRv.A00 = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof R31)) {
            return super.equals(obj);
        }
        R31 r31 = (R31) obj;
        int i = this.A00;
        if (i == r31.A00) {
            long[] jArr = r31.A01;
            int i2 = 0;
            while (i2 < i) {
                if (this.A01[i2] == jArr[i2]) {
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
            long j = this.A01[i2];
            Charset charset = SD9.A04;
            i = (i * 31) + C51968G9o.A03(j);
        }
        return i;
    }

    public static void A00(R31 r31, int i) {
        if (i < 0 || i >= r31.A00) {
            throw C51969G9p.A0p("Index:", ", Size:", i, r31.A00);
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.R31, X.TnY, X.TRv] */
    public final /* bridge */ /* synthetic */ C13982TnY Cop(int i) {
        if (i >= this.A00) {
            long[] copyOf = Arrays.copyOf(this.A01, i);
            int i2 = this.A00;
            ? tRv = new C13255TRv();
            tRv.A01 = copyOf;
            tRv.A00 = i2;
            return tRv;
        }
        throw Pxe.A0g();
    }

    public final int indexOf(Object obj) {
        if (obj instanceof Long) {
            long A0R = AnonymousClass7TE.A0R(obj);
            int size = size();
            for (int i = 0; i < size; i++) {
                if (this.A01[i] == A0R) {
                    return i;
                }
            }
        }
        return -1;
    }

    public final int size() {
        return this.A00;
    }

    public final void A02(long j) {
        A01();
        int i = this.A00;
        long[] jArr = this.A01;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.A01 = jArr2;
            jArr = jArr2;
        }
        int i2 = this.A00;
        this.A00 = i2 + 1;
        jArr[i2] = j;
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        long A0R = AnonymousClass7TE.A0R(obj);
        A01();
        if (i < 0 || i > (i2 = this.A00)) {
            throw C51969G9p.A0p("Index:", ", Size:", i, this.A00);
        }
        long[] jArr = this.A01;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.A01, i, jArr2, i + 1, this.A00 - i);
            this.A01 = jArr2;
        }
        this.A01[i] = A0R;
        this.A00++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        A01();
        Charset charset = SD9.A04;
        collection.getClass();
        if (!(collection instanceof R31)) {
            return super.addAll(collection);
        }
        R31 r31 = (R31) collection;
        int i = r31.A00;
        if (i == 0) {
            return false;
        }
        int i2 = this.A00;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.A01;
            if (i3 > jArr.length) {
                jArr = Arrays.copyOf(jArr, i3);
                this.A01 = jArr;
            }
            System.arraycopy(r31.A01, 0, jArr, this.A00, r31.A00);
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
        return Long.valueOf(this.A01[i]);
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        A01();
        A00(this, i);
        long[] jArr = this.A01;
        long j = jArr[i];
        Pxj.A11(this.A00, i, jArr);
        this.A00--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public final void removeRange(int i, int i2) {
        A01();
        if (i2 >= i) {
            long[] jArr = this.A01;
            System.arraycopy(jArr, i2, jArr, i, this.A00 - i2);
            this.A00 -= i2 - i;
            this.modCount++;
            return;
        }
        throw Pxe.A0k("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long A0R = AnonymousClass7TE.A0R(obj);
        A01();
        A00(this, i);
        long[] jArr = this.A01;
        long j = jArr[i];
        jArr[i] = A0R;
        return Long.valueOf(j);
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        A02(AnonymousClass7TE.A0R(obj));
        return true;
    }
}
