package X;

import java.util.NoSuchElementException;

public final class U6a extends C20389WqV {
    public final Object A00;

    public U6a(Object obj, int i) {
        this.A00 = i;
        this.A01 = 1;
        this.A00 = obj;
    }

    public final Object previous() {
        if (hasPrevious()) {
            this.A00--;
            return this.A00;
        }
        throw new NoSuchElementException();
    }
}
