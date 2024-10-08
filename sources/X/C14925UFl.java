package X;

/* renamed from: X.UFl  reason: case insensitive filesystem */
public final class C14925UFl extends V28 {
    public final Integer A00;
    public final String A01;
    public final boolean A02;
    public final String A03;

    public C14925UFl(Integer num, String str, String str2, boolean z) {
        0qQ.A0B(num, 3);
        this.A02 = z;
        this.A01 = str;
        this.A00 = num;
        this.A03 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C14925UFl) {
                C14925UFl uFl = (C14925UFl) obj;
                if (this.A02 != uFl.A02 || !0qQ.A0K(this.A01, uFl.A01) || this.A00 != uFl.A00 || !0qQ.A0K(this.A03, uFl.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A08 = AnonymousClass7TF.A08(this.A01, C51965G9l.A05(this.A02));
        Integer num = this.A00;
        return C41845B3m.A01(this.A03, AnonymousClass7TG.A0B(num, C18090VlK.A01(num), A08));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("AvatarGenerationEnd(fromCache=");
        sb.append(this.A02);
        sb.append(Pxd.A00(10));
        sb.append(this.A01);
        sb.append(", resultCode=");
        Integer num = this.A00;
        if (num != null) {
            str = C18090VlK.A01(num);
        } else {
            str = "null";
        }
        sb.append(str);
        sb.append(", cdlResultCode=");
        return C51975G9x.A0i(this.A03, sb);
    }
}
