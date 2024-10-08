package X;

/* renamed from: X.Jtn  reason: case insensitive filesystem */
public final class C60929Jtn extends AnonymousClass0T0 {
    public Integer A00 = null;
    public String A01 = null;
    public String A02 = null;
    public boolean A03 = false;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60929Jtn) {
                C60929Jtn jtn = (C60929Jtn) obj;
                if (this.A00 != jtn.A00 || !0qQ.A0K(this.A01, jtn.A01) || this.A03 != jtn.A03 || !0qQ.A0K(this.A02, jtn.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A04;
        Integer num = this.A00;
        if (num == null) {
            A04 = 0;
        } else {
            int intValue = num.intValue();
            if (1 != intValue) {
                str = "TEXT";
            } else {
                str = "STICKER";
            }
            A04 = C51966G9m.A04(str, intValue);
        }
        return AnonymousClass7TF.A09(this.A03, ((A04 * 31 * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + C41845B3m.A00(this.A02);
    }
}
