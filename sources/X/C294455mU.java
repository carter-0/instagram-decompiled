package X;

import com.instagram.api.schemas.LimitedInteractionsVersions;

/* renamed from: X.5mU  reason: invalid class name and case insensitive filesystem */
public final class C294455mU extends AnonymousClass0T0 implements C294465mV {
    public final int A00;
    public final C294475mW A01;
    public final LimitedInteractionsVersions A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C294455mU) {
                C294455mU r5 = (C294455mU) obj;
                if (!(this.A00 == r5.A00 && 0qQ.A0K(this.A01, r5.A01) && this.A03 == r5.A03 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i = this.A00 * 31;
        C294475mW r0 = this.A01;
        int i2 = 0;
        if (r0 == null) {
            hashCode = 0;
        } else {
            hashCode = r0.hashCode();
        }
        int i3 = (i + hashCode) * 31;
        int i4 = 1237;
        if (this.A03) {
            i4 = 1231;
        }
        int i5 = (i3 + i4) * 31;
        LimitedInteractionsVersions limitedInteractionsVersions = this.A02;
        if (limitedInteractionsVersions != null) {
            i2 = limitedInteractionsVersions.hashCode();
        }
        return i5 + i2;
    }

    public C294455mU(C294475mW r1, LimitedInteractionsVersions limitedInteractionsVersions, int i, boolean z) {
        this.A00 = i;
        this.A01 = r1;
        this.A03 = z;
        this.A02 = limitedInteractionsVersions;
    }
}
