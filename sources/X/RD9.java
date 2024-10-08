package X;

import java.io.Writer;

public final class RD9 extends Writer {
    public final C12840T9w A00 = new Object();
    public final Appendable A01;

    public final void close() {
    }

    public final void flush() {
    }

    public final Writer append(CharSequence charSequence, int i, int i2) {
        this.A01.append(charSequence, i, i2);
        return this;
    }

    public final void write(char[] cArr, int i, int i2) {
        C12840T9w t9w = this.A00;
        t9w.A01 = cArr;
        t9w.A00 = null;
        this.A01.append(t9w, i, i2 + i);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.T9w, java.lang.Object] */
    public RD9(Appendable appendable) {
        this.A01 = appendable;
    }

    public final Writer append(CharSequence charSequence) {
        this.A01.append(charSequence);
        return this;
    }

    public final void write(int i) {
        this.A01.append((char) i);
    }

    public final void write(String str, int i, int i2) {
        str.getClass();
        this.A01.append(str, i, i2 + i);
    }
}
