package X;

import java.io.Writer;

/* renamed from: X.5EB  reason: invalid class name */
public final class AnonymousClass5EB extends Writer {
    public final 16I A00;

    public final void close() {
    }

    public final void flush() {
    }

    public final void write(int i) {
        16I r4 = this.A00;
        char c = (char) i;
        if (r4.A02 >= 0) {
            16I.A02(r4, 16);
        }
        r4.A04 = null;
        r4.A09 = null;
        char[] cArr = r4.A07;
        if (r4.A00 >= cArr.length) {
            16I.A01(r4);
            cArr = r4.A07;
        }
        int i2 = r4.A00;
        r4.A00 = i2 + 1;
        cArr[i2] = c;
    }

    public AnonymousClass5EB(AnonymousClass16A r2) {
        this.A00 = new 16I(r2);
    }

    public final Writer append(CharSequence charSequence) {
        String charSequence2 = charSequence.toString();
        this.A00.A08(charSequence2, 0, charSequence2.length());
        return this;
    }

    public final Writer append(CharSequence charSequence, int i, int i2) {
        String charSequence2 = charSequence.subSequence(i, i2).toString();
        this.A00.A08(charSequence2, 0, charSequence2.length());
        return this;
    }

    public final void write(String str, int i, int i2) {
        this.A00.A08(str, i, i2);
    }

    public final void write(char[] cArr, int i, int i2) {
        this.A00.A09(cArr, i, i2);
    }

    public final void write(String str) {
        this.A00.A08(str, 0, str.length());
    }

    public final Writer append(char c) {
        write(c);
        return this;
    }

    public final void write(char[] cArr) {
        this.A00.A09(cArr, 0, cArr.length);
    }
}
