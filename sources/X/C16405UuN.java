package X;

/* renamed from: X.UuN  reason: case insensitive filesystem */
public final class C16405UuN extends C16407UuP {
    public final Integer A00;
    public final String A01;
    public final C18033VkD A02;
    public final Integer A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C16405UuN) {
                C16405UuN uuN = (C16405UuN) obj;
                if (this.A03 != uuN.A03 || !0qQ.A0K(this.A02, uuN.A02) || !0qQ.A0K(this.A00, uuN.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A02, (215180831 + this.A03.intValue()) * 31) + AnonymousClass7TG.A0C(this.A00);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A01);
        sb.append('_');
        return AnonymousClass7TF.A0i(this.A00, sb);
    }

    public C16405UuN(C18033VkD vkD, Integer num, Integer num2) {
        this.A03 = num;
        this.A02 = vkD;
        this.A00 = num2;
        this.A01 = 002.A0J("s", 'x', vkD.A01, vkD.A00);
    }
}
