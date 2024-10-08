package X;

/* renamed from: X.3LP  reason: invalid class name */
public final class AnonymousClass3LP extends AnonymousClass0T0 {
    public final long A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3LP) {
                AnonymousClass3LP r8 = (AnonymousClass3LP) obj;
                if (!0qQ.A0K(this.A02, r8.A02) || !0qQ.A0K(this.A01, r8.A01) || this.A00 != r8.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A00;
        return (((this.A02.hashCode() * 31) + this.A01.hashCode()) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public AnonymousClass3LP(String str, String str2, long j) {
        this.A02 = str;
        this.A01 = str2;
        this.A00 = j;
    }
}
