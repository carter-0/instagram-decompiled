package X;

import com.instagram.api.schemas.MonetizationEligibilityDecision;

/* renamed from: X.4kr  reason: invalid class name and case insensitive filesystem */
public abstract class C272514kr {
    public static final MonetizationEligibilityDecision A00(String str) {
        MonetizationEligibilityDecision monetizationEligibilityDecision = (MonetizationEligibilityDecision) MonetizationEligibilityDecision.A01.get(str);
        if (monetizationEligibilityDecision == null) {
            return MonetizationEligibilityDecision.UNRECOGNIZED;
        }
        return monetizationEligibilityDecision;
    }
}
