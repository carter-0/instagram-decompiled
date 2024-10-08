package X;

import com.instagram.api.schemas.MonetizationEligibilityDecision;

/* renamed from: X.4l8  reason: invalid class name and case insensitive filesystem */
public final class C272654l8 extends AnonymousClass0T0 implements AnonymousClass4l9 {
    public final Boolean A00;
    public final Boolean A01;
    public final Boolean A02;
    public final MonetizationEligibilityDecision A03;
    public final Boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C272654l8) {
                C272654l8 r5 = (C272654l8) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || this.A03 != r5.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean bool = this.A00;
        int i = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.A04;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.A01;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.A02;
        int hashCode4 = (hashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        MonetizationEligibilityDecision monetizationEligibilityDecision = this.A03;
        if (monetizationEligibilityDecision != null) {
            i = monetizationEligibilityDecision.hashCode();
        }
        return hashCode4 + i;
    }

    public C272654l8(MonetizationEligibilityDecision monetizationEligibilityDecision, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this.A00 = bool;
        this.A04 = bool2;
        this.A01 = bool3;
        this.A02 = bool4;
        this.A03 = monetizationEligibilityDecision;
    }
}
