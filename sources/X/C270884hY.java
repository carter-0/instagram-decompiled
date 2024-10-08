package X;

import java.util.Arrays;

/* renamed from: X.4hY  reason: invalid class name and case insensitive filesystem */
public final class C270884hY {
    public final int A00;
    public final AnonymousClass3H4 A01;
    public final String A02;

    public C270884hY(AnonymousClass3H4 r2, String str) {
        0qQ.A0B(r2, 1);
        0qQ.A0B(str, 2);
        this.A01 = r2;
        this.A02 = str;
        this.A00 = r2.A00.A02;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !0qQ.A0K(getClass(), obj.getClass())) {
                return false;
            }
            C270884hY r5 = (C270884hY) obj;
            if (!0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A02});
    }
}
