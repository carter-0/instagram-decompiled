package X;

import com.instagram.api.schemas.MonetizationEligibilityDecision;

/* renamed from: X.JxM  reason: case insensitive filesystem */
public final class C61110JxM extends AnonymousClass0T0 implements C274624ol {
    public final int A00;
    public final MonetizationEligibilityDecision A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61110JxM) {
                C61110JxM jxM = (C61110JxM) obj;
                if (!(this.A01 == jxM.A01 && this.A00 == jxM.A00 && this.A02 == jxM.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A02, ((AnonymousClass7TG.A0C(this.A01) * 31) + this.A00) * 31);
    }

    public C61110JxM(MonetizationEligibilityDecision monetizationEligibilityDecision, int i, boolean z) {
        this.A01 = monetizationEligibilityDecision;
        this.A00 = i;
        this.A02 = z;
    }
}
