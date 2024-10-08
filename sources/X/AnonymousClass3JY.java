package X;

import java.util.Arrays;

/* renamed from: X.3JY  reason: invalid class name */
public final class AnonymousClass3JY {
    public final String A00;
    public final String A01;
    public final String A02;
    public final boolean A03 = false;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass3JY)) {
            return super.equals(obj);
        }
        AnonymousClass3JY r3 = (AnonymousClass3JY) obj;
        if (!AnonymousClass9DO.A00(this.A01, r3.A01) || !AnonymousClass9DO.A00(this.A02, r3.A02) || !AnonymousClass9DO.A00(this.A00, r3.A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A02, this.A00});
    }

    public AnonymousClass3JY(String str, String str2, String str3) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = str3;
    }

    public AnonymousClass3JY(String str, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = str2;
    }
}
