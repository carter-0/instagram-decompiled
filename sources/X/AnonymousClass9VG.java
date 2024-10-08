package X;

import java.util.List;

/* renamed from: X.9VG  reason: invalid class name */
public final class AnonymousClass9VG extends AnonymousClass0T0 {
    public final String A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass9VG) {
                AnonymousClass9VG r5 = (AnonymousClass9VG) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A00;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.A01.hashCode();
    }

    public AnonymousClass9VG(String str, List list) {
        this.A00 = str;
        this.A01 = list;
    }
}
