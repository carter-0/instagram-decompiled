package X;

import java.util.List;

/* renamed from: X.8ZE  reason: invalid class name */
public final class AnonymousClass8ZE extends AnonymousClass0T0 {
    public final C376669Iw A00;
    public final boolean A01;
    public final int A02;
    public final String A03;
    public final List A04;

    public AnonymousClass8ZE(C376669Iw r2, String str, List list, int i, boolean z) {
        0qQ.A0B(str, 1);
        this.A03 = str;
        this.A02 = i;
        this.A04 = list;
        this.A01 = z;
        this.A00 = r2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass8ZE) {
                AnonymousClass8ZE r5 = (AnonymousClass8ZE) obj;
                if (!0qQ.A0K(this.A03, r5.A03) || this.A02 != r5.A02 || !0qQ.A0K(this.A04, r5.A04) || this.A01 != r5.A01 || !0qQ.A0K(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((((this.A03.hashCode() * 31) + this.A02) * 31) + this.A04.hashCode()) * 31;
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        int i2 = (hashCode2 + i) * 31;
        C376669Iw r0 = this.A00;
        if (r0 == null) {
            hashCode = 0;
        } else {
            hashCode = r0.hashCode();
        }
        return i2 + hashCode;
    }
}
