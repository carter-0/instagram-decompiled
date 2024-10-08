package X;

public final class S44 {
    public final int A00;
    public final CharSequence A01;

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj instanceof S44) {
            S44 s44 = (S44) obj;
            if (this.A00 == s44.A00) {
                CharSequence charSequence = s44.A01;
                CharSequence charSequence2 = this.A01;
                if (charSequence2 != null) {
                    str = charSequence2.toString();
                } else {
                    str = null;
                }
                if (charSequence != null) {
                    str2 = charSequence.toString();
                } else {
                    str2 = null;
                }
                if (str == null) {
                    if (str2 != null) {
                        return false;
                    }
                    return true;
                } else if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str;
        Integer valueOf = Integer.valueOf(this.A00);
        CharSequence charSequence = this.A01;
        if (charSequence != null) {
            str = charSequence.toString();
        } else {
            str = null;
        }
        return Pxf.A0A(valueOf, str);
    }

    public S44(int i, CharSequence charSequence) {
        this.A00 = i;
        this.A01 = charSequence;
    }
}
