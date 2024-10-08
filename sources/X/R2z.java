package X;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class R2z extends C13255TRv<Float> implements C13964TmR, RandomAccess, C13493TbK {
    public static final R2z A02;
    public int A00 = 0;
    public float[] A01 = new float[10];

    /* JADX WARNING: type inference failed for: r0v0, types: [X.R2z, X.TRv] */
    static {
        ? tRv = new C13255TRv();
        tRv.A01 = new float[0];
        tRv.A00 = 0;
        A02 = tRv;
        tRv.A00 = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof R2z)) {
            return super.equals(obj);
        }
        R2z r2z = (R2z) obj;
        int i = this.A00;
        if (i == r2z.A00) {
            float[] fArr = r2z.A01;
            int i2 = 0;
            while (i2 < i) {
                if (Float.floatToIntBits(this.A01[i2]) == Float.floatToIntBits(fArr[i2])) {
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
            i = (i * 31) + Float.floatToIntBits(this.A01[i2]);
        }
        return i;
    }

    private void A00(int i) {
        if (i < 0 || i >= this.A00) {
            throw C51969G9p.A0p("Index:", ", Size:", i, this.A00);
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.TnY, X.R2z, X.TRv] */
    public final /* bridge */ /* synthetic */ C13982TnY Cop(int i) {
        if (i >= this.A00) {
            float[] copyOf = Arrays.copyOf(this.A01, i);
            int i2 = this.A00;
            ? tRv = new C13255TRv();
            tRv.A01 = copyOf;
            tRv.A00 = i2;
            return tRv;
        }
        throw Pxe.A0g();
    }

    public final int indexOf(Object obj) {
        if (obj instanceof Float) {
            float A04 = AnonymousClass7TE.A04(obj);
            int size = size();
            for (int i = 0; i < size; i++) {
                if (this.A01[i] == A04) {
                    return i;
                }
            }
        }
        return -1;
    }

    public final int size() {
        return this.A00;
    }

    public final void A8W(float f) {
        A01();
        int i = this.A00;
        float[] fArr = this.A01;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.A01 = fArr2;
            fArr = fArr2;
        }
        int i2 = this.A00;
        this.A00 = i2 + 1;
        fArr[i2] = f;
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        float A04 = AnonymousClass7TE.A04(obj);
        A01();
        if (i < 0 || i > (i2 = this.A00)) {
            throw C51969G9p.A0p("Index:", ", Size:", i, this.A00);
        }
        float[] fArr = this.A01;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.A01, i, fArr2, i + 1, this.A00 - i);
            this.A01 = fArr2;
        }
        this.A01[i] = A04;
        this.A00++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        A01();
        Charset charset = SD9.A04;
        collection.getClass();
        if (!(collection instanceof R2z)) {
            return super.addAll(collection);
        }
        R2z r2z = (R2z) collection;
        int i = r2z.A00;
        if (i == 0) {
            return false;
        }
        int i2 = this.A00;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.A01;
            if (i3 > fArr.length) {
                fArr = Arrays.copyOf(fArr, i3);
                this.A01 = fArr;
            }
            System.arraycopy(r2z.A01, 0, fArr, this.A00, r2z.A00);
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
        A00(i);
        return Float.valueOf(this.A01[i]);
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        A01();
        A00(i);
        float[] fArr = this.A01;
        float f = fArr[i];
        Pxj.A11(this.A00, i, fArr);
        this.A00--;
        this.modCount++;
        return Float.valueOf(f);
    }

    public final void removeRange(int i, int i2) {
        A01();
        if (i2 >= i) {
            float[] fArr = this.A01;
            System.arraycopy(fArr, i2, fArr, i, this.A00 - i2);
            this.A00 -= i2 - i;
            this.modCount++;
            return;
        }
        throw Pxe.A0k("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float A04 = AnonymousClass7TE.A04(obj);
        A01();
        A00(i);
        float[] fArr = this.A01;
        float f = fArr[i];
        fArr[i] = A04;
        return Float.valueOf(f);
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        A8W(AnonymousClass7TE.A04(obj));
        return true;
    }
}
