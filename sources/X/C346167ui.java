package X;

import java.util.Arrays;

/* renamed from: X.7ui  reason: invalid class name and case insensitive filesystem */
public final class C346167ui {
    public String A00;
    public String A01;
    public String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !0qQ.A0K(obj.getClass(), getClass())) {
                return false;
            }
            C346167ui r5 = (C346167ui) obj;
            if (!2PP.A00(this.A02, r5.A02) || !2PP.A00(this.A01, r5.A01) || !2PP.A00(this.A00, r5.A00)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A01, this.A00});
    }
}
