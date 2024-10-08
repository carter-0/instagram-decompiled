package X;

/* renamed from: X.754  reason: invalid class name */
public final class AnonymousClass754 extends AnonymousClass755 {
    public final int A00;
    public final CharSequence A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass754) {
                AnonymousClass754 r5 = (AnonymousClass754) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        CharSequence charSequence = this.A01;
        if (charSequence != null) {
            i = charSequence.hashCode();
        }
        return (i * 31) + this.A00;
    }

    public AnonymousClass754(CharSequence charSequence, int i) {
        this.A01 = charSequence;
        this.A00 = i;
    }
}
