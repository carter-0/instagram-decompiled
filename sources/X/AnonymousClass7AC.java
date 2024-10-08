package X;

/* renamed from: X.7AC  reason: invalid class name */
public final class AnonymousClass7AC extends AnonymousClass0T0 implements AnonymousClass7FW {
    public final int A00;
    public final int A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public AnonymousClass7AC(Integer num, String str, String str2, String str3, int i, int i2) {
        0qQ.A0B(str2, 5);
        0qQ.A0B(str3, 6);
        this.A00 = i;
        this.A01 = i2;
        this.A02 = num;
        this.A03 = str;
        this.A05 = str2;
        this.A04 = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7AC) {
                AnonymousClass7AC r5 = (AnonymousClass7AC) obj;
                if (this.A00 != r5.A00 || this.A01 != r5.A01 || this.A02 != r5.A02 || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int hashCode;
        int i = ((this.A00 * 31) + this.A01) * 31;
        int intValue = this.A02.intValue();
        switch (intValue) {
            case 1:
                str = "OPEN_EPHEMERAL_MESSAGE_WARNING";
                break;
            case 2:
                str = "URL_RESHARE";
                break;
            case 3:
                str = "OPEN_PERMANENT_MESSAGE_WARNING";
                break;
            default:
                str = "INSTAMADILLO_EPHEMERAL_EXCEPTION_WARNING";
                break;
        }
        int hashCode2 = (i + str.hashCode() + intValue) * 31;
        String str2 = this.A03;
        if (str2 == null) {
            hashCode = 0;
        } else {
            hashCode = str2.hashCode();
        }
        return ((((hashCode2 + hashCode) * 31) + this.A05.hashCode()) * 31) + this.A04.hashCode();
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
