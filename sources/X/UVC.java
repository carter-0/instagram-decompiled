package X;

public final class UVC extends V2F {
    public final Integer A00;
    public final Integer A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UVC) {
                UVC uvc = (UVC) obj;
                if (!0qQ.A0K(this.A01, uvc.A01) || !0qQ.A0K(this.A00, uvc.A00) || !0qQ.A0K(this.A02, uvc.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + C41845B3m.A00(this.A02);
    }

    public UVC(Integer num, Integer num2, String str) {
        this.A01 = num;
        this.A00 = num2;
        this.A02 = str;
    }

    public UVC() {
        this((Integer) null, (Integer) null, (String) null);
    }
}
