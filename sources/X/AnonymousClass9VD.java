package X;

import java.util.List;

/* renamed from: X.9VD  reason: invalid class name */
public final class AnonymousClass9VD extends AnonymousClass0T0 {
    public final C67555Mpp A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass9VD) {
                AnonymousClass9VD r5 = (AnonymousClass9VD) obj;
                if (this.A00 != r5.A00 || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public AnonymousClass9VD(C67555Mpp mpp, List list) {
        this.A00 = mpp;
        this.A01 = list;
    }
}
