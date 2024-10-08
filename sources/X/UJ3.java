package X;

public final class UJ3 extends C17761VfX {
    public final Integer A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UJ3) {
                UJ3 uj3 = (UJ3) obj;
                if (!0qQ.A0K(this.A01, uj3.A01) || !0qQ.A0K(this.A00, uj3.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public UJ3(String str, Integer num) {
        super(002.A0S("Unmodified(reason='", str, '\''));
        this.A01 = str;
        this.A00 = num;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0O(this.A01) + AnonymousClass7TG.A0C(this.A00);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Unmodified(reason=");
        sb.append(this.A01);
        sb.append(", bestAllowlistedSize=");
        return AnonymousClass7TG.A0n(this.A00, sb);
    }
}
