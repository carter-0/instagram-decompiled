package X;

import java.util.Arrays;

/* renamed from: X.7ul  reason: invalid class name and case insensitive filesystem */
public final class C346197ul {
    public final Object A00;
    public final String A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !0qQ.A0K(getClass(), obj.getClass())) {
                return false;
            }
            C346197ul r5 = (C346197ul) obj;
            if (this.A02 != r5.A02 || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, Boolean.valueOf(this.A02), this.A01});
    }

    public C346197ul(Object obj, String str, boolean z) {
        this.A00 = obj;
        this.A02 = z;
        this.A01 = str;
    }
}
