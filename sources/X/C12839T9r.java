package X;

/* renamed from: X.T9r  reason: case insensitive filesystem */
public final class C12839T9r implements Appendable {
    public boolean A00 = true;
    public final Appendable A01;

    public final Appendable append(CharSequence charSequence, int i, int i2) {
        if (charSequence == null) {
            charSequence = "";
        }
        boolean z = false;
        if (this.A00) {
            this.A00 = false;
            this.A01.append("  ");
        }
        if (charSequence.length() > 0 && charSequence.charAt(i2 - 1) == 10) {
            z = true;
        }
        this.A00 = z;
        this.A01.append(charSequence, i, i2);
        return this;
    }

    public C12839T9r(Appendable appendable) {
        this.A01 = appendable;
    }

    public final Appendable append(char c) {
        boolean z = false;
        if (this.A00) {
            this.A00 = false;
            this.A01.append("  ");
        }
        if (c == 10) {
            z = true;
        }
        this.A00 = z;
        this.A01.append(c);
        return this;
    }

    public final Appendable append(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        append(charSequence, 0, charSequence.length());
        return this;
    }
}
