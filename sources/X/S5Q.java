package X;

public final class S5Q {
    public final Object A00;
    public final Integer A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof S5Q) {
                S5Q s5q = (S5Q) obj;
                if (this.A01 != s5q.A01 || !0qQ.A0K(this.A00, s5q.A00) || !"".equals("")) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        Integer num = this.A01;
        if (num.intValue() != 0) {
            str = "AUTODUBBING";
        } else {
            str = "STICKER_ANYTHING";
        }
        return AnonymousClass7TF.A07(this.A00, C51971G9r.A0D(num, str) * 31);
    }

    public S5Q(Integer num, Object obj) {
        this.A01 = num;
        this.A00 = obj;
    }

    public final String toString() {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("EditRequestData(type=");
        if (this.A01.intValue() != 0) {
            str = "AUTODUBBING";
        } else {
            str = "STICKER_ANYTHING";
        }
        A1A.append(str);
        A1A.append(AnonymousClass000.A00(399));
        A1A.append(this.A00);
        A1A.append(", uploadId=");
        return C51975G9x.A0i("", A1A);
    }
}
