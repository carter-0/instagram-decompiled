package X;

import java.util.Set;

/* renamed from: X.3Jd  reason: invalid class name and case insensitive filesystem */
public final class C239993Jd extends AnonymousClass0T0 {
    public final C226252fx A00;
    public final AnonymousClass2g1 A01;
    public final C71062aE A02;
    public final Set A03;

    public C239993Jd(C226252fx r1, AnonymousClass2g1 r2, C71062aE r3, Set set) {
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = set;
        this.A02 = r3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C239993Jd) {
                C239993Jd r5 = (C239993Jd) obj;
                if (this.A01 != r5.A01 || this.A00 != r5.A00 || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((this.A01.hashCode() * 31) + this.A00.hashCode()) * 31;
        Set set = this.A03;
        int i = 0;
        int hashCode2 = (hashCode + (set == null ? 0 : set.hashCode())) * 31;
        C71062aE r0 = this.A02;
        if (r0 != null) {
            i = r0.hashCode();
        }
        return hashCode2 + i;
    }
}
