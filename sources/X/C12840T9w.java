package X;

/* renamed from: X.T9w  reason: case insensitive filesystem */
public final class C12840T9w implements CharSequence {
    public String A00;
    public char[] A01;

    public final char charAt(int i) {
        return this.A01[i];
    }

    public final int length() {
        return this.A01.length;
    }

    public final CharSequence subSequence(int i, int i2) {
        return new String(this.A01, i, i2 - i);
    }

    public final String toString() {
        String str = this.A00;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.A01);
        this.A00 = str2;
        return str2;
    }
}
