package X;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: X.Qx2  reason: case insensitive filesystem */
public final class C8564Qx2 extends C13252TRs implements C13956TmJ, C13484TbB, RandomAccess {
    public static final C8564Qx2 A02 = new C8564Qx2(new int[0], 0, false);
    public int A00;
    public int[] A01;

    public static C8564Qx2 A00() {
        return A02;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8564Qx2)) {
            return super.equals(obj);
        }
        C8564Qx2 qx2 = (C8564Qx2) obj;
        int i = this.A00;
        if (i == qx2.A00) {
            int[] iArr = qx2.A01;
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

    /* renamed from: FPp */
    public final C8564Qx2 FPW(int i) {
        if (i >= this.A00) {
            return new C8564Qx2(Arrays.copyOf(this.A01, i), this.A00, true);
        }
        throw Pxe.A0g();
    }

    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int A0M = AnonymousClass7TE.A0M(obj);
            int i = this.A00;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.A01[i2] == A0M) {
                    return i2;
                }
            }
        }
        return -1;
    }

    public C8564Qx2(int[] iArr, int i, boolean z) {
        super(z);
        this.A01 = iArr;
        this.A00 = i;
    }

    public final int A04(int i) {
        A02(i);
        return this.A01[i];
    }

    public final void FPw(int i) {
        A03();
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

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int A0M = AnonymousClass7TE.A0M(obj);
        A03();
        if (i < 0 || i > (i2 = this.A00)) {
            throw Pxe.A0k(A01(i));
        }
        int i3 = i + 1;
        int[] iArr = this.A01;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i3, i2 - i);
        } else {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.A01, i, iArr2, i3, this.A00 - i);
            this.A01 = iArr2;
        }
        this.A01[i] = A0M;
        this.A00++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        A03();
        Charset charset = SS6.A02;
        collection.getClass();
        if (!(collection instanceof C8564Qx2)) {
            return super.addAll(collection);
        }
        C8564Qx2 qx2 = (C8564Qx2) collection;
        int i = qx2.A00;
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
            System.arraycopy(qx2.A01, 0, iArr, this.A00, qx2.A00);
            this.A00 = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return JTQ.A1O(indexOf(obj), -1);
    }

    public final /* synthetic */ Object get(int i) {
        A02(i);
        return Integer.valueOf(this.A01[i]);
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        A03();
        A02(i);
        int[] iArr = this.A01;
        int i2 = iArr[i];
        Pxj.A11(this.A00, i, iArr);
        this.A00--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final void removeRange(int i, int i2) {
        A03();
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
        A03();
        A02(i);
        int[] iArr = this.A01;
        int i2 = iArr[i];
        iArr[i] = A0M;
        return Integer.valueOf(i2);
    }

    public C8564Qx2() {
        this(new int[10], 0, true);
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        FPw(AnonymousClass7TE.A0M(obj));
        return true;
    }
}
