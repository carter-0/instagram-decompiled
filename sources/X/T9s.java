package X;

import java.util.List;

public final class T9s implements Appendable {
    public int A00;
    public int A01;
    public final List A02;

    public final String toString() {
        List list = this.A02;
        return new C12841T9x(list, this.A01, list.size(), this.A00).toString();
    }

    public T9s(int i) {
        this.A02 = DbS.A0v(i);
    }

    public final Appendable append(CharSequence charSequence, int i, int i2) {
        append(charSequence.subSequence(i, i2));
        return this;
    }

    public final Appendable append(CharSequence charSequence) {
        this.A02.add(charSequence);
        this.A00 += charSequence.length();
        return this;
    }

    public final Appendable append(char c) {
        append((CharSequence) new T9v(c));
        return this;
    }
}
