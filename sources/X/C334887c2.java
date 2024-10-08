package X;

/* renamed from: X.7c2  reason: invalid class name and case insensitive filesystem */
public final class C334887c2 extends AnonymousClass0T0 implements C334127ai {
    public final String A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C334887c2) {
                C334887c2 r5 = (C334887c2) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.A00;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i = hashCode * 31;
        int i2 = 1237;
        if (this.A01) {
            i2 = 1231;
        }
        return i + i2;
    }

    public C334887c2(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }
}
