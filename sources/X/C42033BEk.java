package X;

import com.instagram.api.schemas.MonetizationEligibilityDecision;

/* renamed from: X.BEk  reason: case insensitive filesystem */
public final class C42033BEk extends AnonymousClass0T0 implements C274614ok {
    public final boolean A00;
    public final MonetizationEligibilityDecision A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42033BEk) {
                C42033BEk bEk = (C42033BEk) obj;
                if (!(this.A00 == bEk.A00 && this.A01 == bEk.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A00) {
            i = 1231;
        }
        return (i * 31) + AnonymousClass7TG.A0C(this.A01);
    }

    public C42033BEk(MonetizationEligibilityDecision monetizationEligibilityDecision, boolean z) {
        this.A00 = z;
        this.A01 = monetizationEligibilityDecision;
    }
}
