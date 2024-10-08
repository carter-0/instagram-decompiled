package X;

import java.util.NoSuchElementException;

/* renamed from: X.6BW  reason: invalid class name */
public final class AnonymousClass6BW extends AnonymousClass6BX {
    public final Object[] A00;

    public AnonymousClass6BW(Object[] objArr, int i, int i2) {
        0qQ.A0B(objArr, 1);
        this.A00 = i;
        this.A01 = i2;
        this.A00 = objArr;
    }

    public final Object previous() {
        if (hasPrevious()) {
            Object[] objArr = this.A00;
            int i = this.A00 - 1;
            this.A00 = i;
            return objArr[i];
        }
        throw new NoSuchElementException();
    }
}
