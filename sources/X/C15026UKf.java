package X;

import com.instagram.api.schemas.BillingWizardName;
import com.instagram.api.schemas.NonDiscInfo;
import com.instagram.api.schemas.PaymentInfo;

/* renamed from: X.UKf  reason: case insensitive filesystem */
public final class C15026UKf extends AnonymousClass0T0 {
    public final C53351Gmb A00;
    public final C59721JVf A01;
    public final N4Q A02;
    public final ULZ A03;
    public final BillingWizardName A04;
    public final NonDiscInfo A05;
    public final PaymentInfo A06;
    public final UKM A07;
    public final String A08;

    public C15026UKf(C53351Gmb gmb, C59721JVf jVf, N4Q n4q, ULZ ulz, BillingWizardName billingWizardName, NonDiscInfo nonDiscInfo, PaymentInfo paymentInfo, UKM ukm, String str) {
        0qQ.A0B(nonDiscInfo, 4);
        this.A08 = str;
        this.A07 = ukm;
        this.A02 = n4q;
        this.A05 = nonDiscInfo;
        this.A06 = paymentInfo;
        this.A03 = ulz;
        this.A01 = jVf;
        this.A04 = billingWizardName;
        this.A00 = gmb;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C15026UKf) {
                C15026UKf uKf = (C15026UKf) obj;
                if (!0qQ.A0K(this.A08, uKf.A08) || !0qQ.A0K(this.A07, uKf.A07) || !0qQ.A0K(this.A02, uKf.A02) || !0qQ.A0K(this.A05, uKf.A05) || !0qQ.A0K(this.A06, uKf.A06) || !0qQ.A0K(this.A03, uKf.A03) || !0qQ.A0K(this.A01, uKf.A01) || this.A04 != uKf.A04 || !0qQ.A0K(this.A00, uKf.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((AnonymousClass7TF.A07(this.A05, ((((AnonymousClass7TG.A0E(this.A08) * 31) + AnonymousClass7TG.A0C(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }
}
