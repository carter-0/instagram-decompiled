package X;

import com.instagram.api.schemas.CanUseCreatorMonetizationProduct;
import com.instagram.api.schemas.HasOnboardedCreatorMonetizationProduct;
import com.instagram.api.schemas.MonetizationEligibilityDecision;
import com.instagram.api.schemas.UserMonetizationProductType;

/* renamed from: X.4lA  reason: invalid class name and case insensitive filesystem */
public final class C272664lA extends AnonymousClass0T0 {
    public final C61074JwC A00;
    public final AnonymousClass4l9 A01;
    public final CanUseCreatorMonetizationProduct A02;
    public final C274614ok A03;
    public final HasOnboardedCreatorMonetizationProduct A04;
    public final MonetizationEligibilityDecision A05;
    public final C274624ol A06;
    public final UserMonetizationProductType A07;
    public final boolean A08;
    public final boolean A09;
    public final AnonymousClass9IE A0A;

    public C272664lA(AnonymousClass9IE r2, C61074JwC jwC, AnonymousClass4l9 r4, CanUseCreatorMonetizationProduct canUseCreatorMonetizationProduct, C274614ok r6, HasOnboardedCreatorMonetizationProduct hasOnboardedCreatorMonetizationProduct, MonetizationEligibilityDecision monetizationEligibilityDecision, C274624ol r9, UserMonetizationProductType userMonetizationProductType, boolean z, boolean z2) {
        0qQ.A0B(canUseCreatorMonetizationProduct, 2);
        0qQ.A0B(hasOnboardedCreatorMonetizationProduct, 4);
        0qQ.A0B(userMonetizationProductType, 9);
        this.A01 = r4;
        this.A02 = canUseCreatorMonetizationProduct;
        this.A03 = r6;
        this.A04 = hasOnboardedCreatorMonetizationProduct;
        this.A08 = z;
        this.A05 = monetizationEligibilityDecision;
        this.A06 = r9;
        this.A0A = r2;
        this.A07 = userMonetizationProductType;
        this.A00 = jwC;
        this.A09 = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C272664lA) {
                C272664lA r5 = (C272664lA) obj;
                if (!(0qQ.A0K(this.A01, r5.A01) && this.A02 == r5.A02 && 0qQ.A0K(this.A03, r5.A03) && this.A04 == r5.A04 && this.A08 == r5.A08 && this.A05 == r5.A05 && 0qQ.A0K(this.A06, r5.A06) && 0qQ.A0K(this.A0A, r5.A0A) && this.A07 == r5.A07 && 0qQ.A0K(this.A00, r5.A00) && this.A09 == r5.A09)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        AnonymousClass4l9 r0 = this.A01;
        int i = 0;
        if (r0 == null) {
            hashCode = 0;
        } else {
            hashCode = r0.hashCode();
        }
        int hashCode6 = ((hashCode * 31) + this.A02.hashCode()) * 31;
        C274614ok r02 = this.A03;
        if (r02 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = r02.hashCode();
        }
        int hashCode7 = (((hashCode6 + hashCode2) * 31) + this.A04.hashCode()) * 31;
        int i2 = 1237;
        if (this.A08) {
            i2 = 1231;
        }
        int i3 = (hashCode7 + i2) * 31;
        MonetizationEligibilityDecision monetizationEligibilityDecision = this.A05;
        if (monetizationEligibilityDecision == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = monetizationEligibilityDecision.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        C274624ol r03 = this.A06;
        if (r03 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = r03.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        AnonymousClass9IE r04 = this.A0A;
        if (r04 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = r04.hashCode();
        }
        int hashCode8 = (((i5 + hashCode5) * 31) + this.A07.hashCode()) * 31;
        C61074JwC jwC = this.A00;
        if (jwC != null) {
            i = jwC.hashCode();
        }
        int i6 = (hashCode8 + i) * 31;
        int i7 = 1237;
        if (this.A09) {
            i7 = 1231;
        }
        return i6 + i7;
    }
}
