package X;

import java.io.IOException;
import java.util.Formattable;
import java.util.Formatter;
import java.util.List;

/* renamed from: X.T9x  reason: case insensitive filesystem */
public final class C12841T9x implements CharSequence, Formattable {
    public final int A00;
    public final int A01;
    public final int A02;
    public final List A03;

    private void A00(StringBuilder sb) {
        for (int i = this.A02; i < this.A00; i++) {
            CharSequence A0f = Pxe.A0f(this.A03, i);
            if (A0f instanceof C12841T9x) {
                ((C12841T9x) A0f).A00(sb);
            } else {
                sb.append(A0f);
            }
        }
    }

    public final int length() {
        return this.A01;
    }

    public final String toString() {
        StringBuilder A14 = Pxe.A14(this.A01);
        A00(A14);
        return A14.toString();
    }

    public C12841T9x(List list, int i, int i2, int i3) {
        this.A03 = list;
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
    }

    public final char charAt(int i) {
        return toString().charAt(i);
    }

    public final void formatTo(Formatter formatter, int i, int i2, int i3) {
        try {
            formatter.out().append(this);
        } catch (IOException e) {
            throw C41845B3m.A0j(e);
        }
    }

    public final CharSequence subSequence(int i, int i2) {
        return toString().subSequence(i, i2);
    }
}
