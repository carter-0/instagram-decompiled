package X;

public final class N8W extends AnonymousClass0T0 implements C74249Prd {
    public final Integer A00;
    public final String A01;

    public N8W(String str, Integer num) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A00 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N8W) {
                N8W n8w = (N8W) obj;
                if (!0qQ.A0K(this.A01, n8w.A01) || this.A00 != n8w.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A0O = AnonymousClass7TE.A0O(this.A01);
        int intValue = this.A00.intValue();
        switch (intValue) {
            case 1:
                str = "LINK";
                break;
            case 2:
                str = "EMOJI";
                break;
            case 3:
                str = "POWERUP_GIFTWRAP";
                break;
            case 4:
                str = "MENTION";
                break;
            default:
                str = "TEXT";
                break;
        }
        return A0O + C51966G9m.A04(str, intValue);
    }
}
