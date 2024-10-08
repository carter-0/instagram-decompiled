package X;

import java.util.NoSuchElementException;

/* renamed from: X.U6b  reason: case insensitive filesystem */
public final class C14737U6b extends C20389WqV {
    public final C14738U6c A00;
    public final Object[] A01;

    public C14737U6b(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        this.A00 = i;
        this.A01 = i2;
        this.A01 = objArr2;
        int i4 = (i2 - 1) & -32;
        this.A00 = new C14738U6c(objArr, i > i4 ? i4 : i, i4, i3);
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i = this.A00;
            C14738U6c u6c = this.A00;
            int i2 = u6c.A01;
            if (i > i2) {
                Object[] objArr = this.A01;
                int i3 = i - 1;
                this.A00 = i3;
                return objArr[i3 - i2];
            }
            this.A00 = i - 1;
            return u6c.previous();
        }
        throw new NoSuchElementException();
    }
}
