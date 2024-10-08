package X;

import java.util.NoSuchElementException;

public final class U6Z extends C20389WqV {
    public final Object[] A00;

    public U6Z(Object[] objArr, int i, int i2) {
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
