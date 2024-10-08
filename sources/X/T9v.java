package X;

public final class T9v implements CharSequence {
    public final char A00;

    public final int length() {
        return 1;
    }

    public final char charAt(int i) {
        if (i == 0) {
            return this.A00;
        }
        throw new IndexOutOfBoundsException();
    }

    public final CharSequence subSequence(int i, int i2) {
        if (i == 0) {
            if (i2 == 0) {
                return "";
            }
            if (i2 == 1) {
                return this;
            }
        }
        throw new IndexOutOfBoundsException();
    }

    public T9v(char c) {
        this.A00 = c;
    }
}
